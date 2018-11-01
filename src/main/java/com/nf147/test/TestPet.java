package com.nf147.test;

import com.nf147.dao.PsPetMapper;
import com.nf147.entity.PsPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TestPet {
    @Autowired
    private PsPetMapper mapper;

    @RequestMapping(value = "/pet" ,method = RequestMethod.POST)
    public String allPet(Model model, BindingResult result){
        List<PsPet> psPets = mapper.selectAll();
        model.addAttribute(psPets);
        return "pet";
    }

    //将新宠物添加到商店
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public String add(PsPet psPet){
        mapper.insert(psPet);
     return "redirect:/pet";
    }

    //更新现有宠物
    @RequestMapping(value = "/update" ,method = RequestMethod.PUT)
    public String update(PsPet psPet,BindingResult result){
        List<PsPet> psPets = mapper.selectAll();
        for (PsPet pet : psPets) {
            if (pet.getName() !=psPet.getName()){
                result.rejectValue("name",null,"找不到宠物");
                if (pet.getId() != psPet.getId()) {
                    result.rejectValue("id", null, "提供的ID无效");
                }
            }

        }


        return "redirect:/pet";
    }
    //按状态查找宠物
    @RequestMapping(value = "/select" ,method = RequestMethod.GET)
    public String getPetByState(String[] status){

        return "redirect:/pet";
    }
    //按id查找宠物
    @RequestMapping(value = "/select" ,method = RequestMethod.GET)
    public String getPetById(int id,Model model){
        PsPet psPet = mapper.selectByPrimaryKey(id);
        model.addAttribute(psPet);
        return "redirect:/pet";
    }
    //使用表单数据更新商店中的宠物
    @RequestMapping(value = "/formUp" ,method = RequestMethod.POST)
    public String formUpdate(PsPet psPet){
        mapper.updateByPrimaryKey(psPet);
        return "redirect:/pet";
    }
    //删除宠物
    @RequestMapping(value = "/delete" ,method = RequestMethod.DELETE)
    public String deletePet(int id){
        mapper.deleteByPrimaryKey(id);
        return "redirect:/pet";
    }
    //uploadImage
    //上传图片
    @RequestMapping(value = "/uploadImage" ,method = RequestMethod.POST)
    public String uploadImage(int id,String date,String formData){

        return "redirect:/pet";
    }

}
