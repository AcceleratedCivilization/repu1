package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 根据ID查询items
     * @param model
     * @return
     */
    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);//默认存request作用域内
        return "itemDetail";
    }

    /**
     * 查询所有items跳转到list.jsp显示
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAllItems(){
        List<Items> itemsList = itemsService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("itemsList",itemsList);
        mv.setViewName("list");
        return mv;
    }

    /**
     * 根据ID删除items
     * @param id
     */
    @RequestMapping("/deleteItem")
    public void deleteItem(Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
         itemsService.deleteItemById(id);
         response.sendRedirect(request.getContextPath()+"/items/findAll");
         return;
    }

    /**
     * 添加产品
     * @param items
     */
    @RequestMapping("/addItem")
    public void addItem(Items items, HttpServletRequest request, HttpServletResponse response) throws IOException {
        itemsService.addItem(items);
        response.sendRedirect(request.getContextPath()+"/items/findAll");
        return;
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
}
