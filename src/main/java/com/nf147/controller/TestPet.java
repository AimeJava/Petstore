package com.nf147.controller;

import com.nf147.dao.PsPetMapper;
import com.nf147.entity.PsPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TestPet {

    @Autowired
    private PsPetMapper mapper;

    @RequestMapping(value = "/pet",method = RequestMethod.GET)
    public String allPet(Model model) {
        List<PsPet> psPets = mapper.selectAllPet();
        model.addAttribute("psPets", psPets);
        return "pet";
    }

    //将新宠物添加到商店
    @RequestMapping(value = "/pet/add", method = RequestMethod.POST)
    public String add(PsPet psPet, @RequestPart("xxx") MultipartFile photoUrls) {
        mapper.insert(psPet);
        return "redirect:/pet";
    }

    //更新现有宠物
    @RequestMapping(value = "/pet/{id}", method = RequestMethod.PUT)
    public String update(PsPet psPet, BindingResult result) {

        return "redirect:/pet";
    }

    //按状态查找宠物
    @RequestMapping(value = "/pet/findByStatus", method = RequestMethod.GET)
    public String getPetByState( String status, Model model) {
        List<PsPet> psPets = mapper.selectByPrimaryStatus(status);
        if (psPets.size() == 0){
            model.addAttribute("err", "输入的状态有误");
            return "pet";
        }
        model.addAttribute("psPets", psPets);
        return "pet";
    }

    //按id查找宠物
    @RequestMapping(value = "/pet/{id}", method = RequestMethod.GET)
    public String getPetById(int id, Model model) {
        PsPet psPet = mapper.selectByPrimaryKey(id);
        model.addAttribute(psPet);
        return "redirect:/pet";
    }

    //使用表单数据更新商店中的宠物
    @RequestMapping(value = "/formUpPet", method = RequestMethod.POST)
    public String formUpdate(PsPet psPet) {
        mapper.updateByPrimaryKey(psPet);
        return "redirect:/pet";
    }

    //删除宠物
    @RequestMapping(value = "/pet/{id}", method = RequestMethod.DELETE)
    public String deletePet(@PathVariable("id") int id) {
        mapper.deleteByPrimaryKey(id);
        return "redirect:/pet";
    }

    //uploadImage
    //上传图片
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    public String uploadImage(int id, String date, String formData) {

        return "redirect:/pet";
    }

}
