package com.zl.edu.controller.backend;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.service.entity.MenuAddEnitity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend")
public class BackendMenuManagerController extends BaseBackendController {

    @GetMapping("/menumanager")
    public String menumanager(){
        return PAGE_PREFIX+"menumanager";
    }

    @GetMapping("/menuadd")
    public String menuadd(){
        return PAGE_PREFIX+"menuadd";
    }

    @PostMapping("/menuadd")
    public ReturnResult menuadd(MenuAddEnitity menuadd){

        return null;
    }

}
