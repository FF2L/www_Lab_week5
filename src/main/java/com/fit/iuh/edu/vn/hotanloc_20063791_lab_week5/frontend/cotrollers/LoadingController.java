package com.fit.iuh.edu.vn.hotanloc_20063791_lab_week5.frontend.cotrollers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

// thay controller bằng Controller Advice
@ControllerAdvice
public class LoadingController {

    //Đây là ép đường dẫn vào head Component để load ảnh
    //Vấn đề là nếu sử dụng getMapping thì không load ảnh được nếu không sử dụng
    //path của getMapping và thay vào đó là sử dụng @ModelAttribute
    //Vì nó sẽ addAtribute cho tất cả các controller
    //Và nếu controller đó trả về 1 trang html và có sử dụng component head thì nó sẽ nhận diện
    //được đường dẫn ảnh và load ảnh

    //Thay getMapping bằng ModelAttribute
    @ModelAttribute
    public void loadingImgIconPage(Model model){
        model.addAttribute("imgIconPath","/images/logowww.jpg");
    }
}
