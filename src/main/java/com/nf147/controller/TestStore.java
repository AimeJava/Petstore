package com.nf147.controller;


import com.nf147.dao.PsOrderMapper;
import com.nf147.entity.PsOrder;
import com.nf147.entity.PsPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



public class TestStore {

    @Autowired
    private PsOrderMapper psOrderMapper;
    //按地位退回宠物库存
    @RequestMapping(value = "/back" ,method = RequestMethod.GET)
    public String sendBack(){

        return "redirect:/store";
    }
    //订购宠物
    @RequestMapping(value = "/op" ,method = RequestMethod.POST)
    public String orderPet(PsPet psPet){
        psOrderMapper.deleteByPrimaryKey(psPet.getId());
        return "redirect:/store";
    }
    //按ID查找采购订单
    @RequestMapping(value = "/orderId" ,method = RequestMethod.GET)
    public String FindPurchaseOrderByID(int id, Model model){
        PsOrder psOrder = psOrderMapper.selectByPrimaryKey(id);
        model.addAttribute(psOrder);
        return "redirect:/store";
    }
    //按ID查找删除订单
    @RequestMapping(value = "/formUp" ,method = RequestMethod.DELETE)
    public String DeletePurchaseOrderByID(int id){
        psOrderMapper.deleteByPrimaryKey(id);
        return "redirect:/store";
    }
}
