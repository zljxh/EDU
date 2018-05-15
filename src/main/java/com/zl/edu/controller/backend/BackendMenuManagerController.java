package com.zl.edu.controller.backend;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.service.MenuManagerService;
import com.zl.edu.service.entity.MenuAddEnitityForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/backend")
public class BackendMenuManagerController extends BaseBackendController {
    @Autowired
    private MenuManagerService menuManagerService;

    @GetMapping("/menumanager")
    public String menumanager() {
        return PAGE_PREFIX + "menumanager";
    }

    @GetMapping("/menuadd")
    public String menuadd() {
        return PAGE_PREFIX + "menuadd";
    }

    @PostMapping("/menuadd")
    @ResponseBody
    public ReturnResult menuadd(@Valid MenuAddEnitityForm menuadd,BindingResult result) {
        if (result.hasErrors()){
            new ReturnResult(0,result.getFieldError().getDefaultMessage());
        }

        return menuManagerService.save(menuadd);
    }

}
