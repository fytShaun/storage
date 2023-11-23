package com.demo.controller;

import com.demo.service.ChukuService;
import com.demo.vo.Chuku;
import com.demo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class ChukuController {

    @Autowired
    private ChukuService chukuService;

    /**
     * 增加出库
     *
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping("chukuAdd")
    public void add(Chuku vo, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //调用Service层的增加（insert）方法
        chukuService.insert(vo);
        this.redirectList(request, response);
    }

    /**
     * 删除出库
     *
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping("chukuDelete")
    public void delete(HttpServletResponse response, HttpServletRequest request) throws IOException {
        Serializable id = request.getParameter("id");
        chukuService.delete(Arrays.asList(id));
        this.redirectList(request, response);
    }

    /**
     * 编辑出库
     *
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping("chukuEdit")
    public void edit(Chuku vo, HttpServletResponse response, HttpServletRequest request) throws IOException {
        chukuService.update(vo);
        this.redirectList(request, response);
    }

    /**
     * 获取出库的详细信息（详情页面与编辑页面要显示该出库的详情）并跳转回页面
     *
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping({"chukuGet", "chukuEditPre"})
    public void get(HttpServletResponse response, HttpServletRequest request) throws IOException {
        Serializable id = request.getParameter("id");//取出主键id
        Chuku vo = chukuService.get(id);
        request.getSession().setAttribute("vo", vo);
        String to = request.getRequestURI().toLowerCase().contains("get") ? "info" : "edit";//判断是去详情显示页面还是编辑页面
        response.sendRedirect("chuku_" + to + ".jsp");
    }

    /**
     * 根据条件查询出库的列表并跳转回页面
     *
     * @param response
     * @param request
     * @throws IOException
     */
    @RequestMapping("chukuList")
    public void list(HttpServletResponse response, HttpServletRequest request) throws IOException {
        this.redirectList(request, response);
    }

    /**
     * 跳转到列表页面
     *
     * @param request
     * @param response
     */
    private void redirectList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //查询列和关键字
        String searchColumn = request.getParameter("searchColumn");
        String keyword = request.getParameter("keyword");
        Map<String, Object> params = new HashMap();//用来保存控制层传进来的参数(查询条件)
        params.put("searchColumn", searchColumn);//要查询的列
        params.put("keyword", keyword);//查询的关键字
        Map<String, Object> map = chukuService.list(params);
        request.getSession().setAttribute("list", map.get("list"));

        Integer totalRecord = (Integer) map.get("totalCount");//根据查询条件取出对应的总记录数，用于分页
        String pageNum = request.getParameter("pageNum");//封装分页参数
        com.demo.util.PageBean<Object> pb = new com.demo.util.PageBean(Integer.valueOf(pageNum != null ? pageNum : "1"), totalRecord);
        params.put("startIndex", pb.getStartIndex());
        params.put("pageSize", pb.getPageSize());
        List list = (List) chukuService.list(params).get("list");//根据分页参数startIndex、pageSize查询出来的最终结果list
        pb.setServlet("chukuList");
        pb.setSearchColumn(searchColumn);
        pb.setKeyword(keyword);
        pb.setList(list);
        request.getSession().setAttribute("pageBean", pb);
        request.getSession().setAttribute("list", pb.getList());

        response.sendRedirect("chuku_list.jsp");
    }
}
