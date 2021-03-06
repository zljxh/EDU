package com.zl.edu.controller.backend;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.SysMenu;
import com.zl.edu.service.MenuManagerService;
import com.zl.edu.service.entity.MenuAddEnitityForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/backend")
@Slf4j
public class BackendMenuManagerController extends BaseBackendController {
    @Autowired
    private MenuManagerService menuManagerService;

    @GetMapping("/menumanager")
    public String menumanager(Model model) {
        List<SysMenu> menus = menuManagerService.getAllMenus();
        model.addAttribute("menus", menus);
        return PAGE_PREFIX + "menumanager";
    }

    @GetMapping("/menuadd")
    public String menuadd(Model model) {
        List<SysMenu> menus = menuManagerService.getAllParentMenu();
        model.addAttribute("parentMenus", menus);
        return PAGE_PREFIX + "menuadd";
    }

    //增加菜单
    @PostMapping("/menuadd")
    @ResponseBody
    public ReturnResult menuadd(@RequestBody @Valid MenuAddEnitityForm menuadd, BindingResult result) {
        if (result.hasErrors()) {
            return new ReturnResult(0, result.getFieldError().getDefaultMessage());
        }

        return menuManagerService.save(menuadd);
    }

    //删除菜单
    @DeleteMapping("/menudelete/{id}")
    @ResponseBody
    public ReturnResult menudelete(@PathVariable long id) {
        return menuManagerService.delete(id);
    }

    @GetMapping("/menuput/{id}")
    public String menuput(@PathVariable long id,Model model) {
        log.info("menuput cateid" + id);
        List<SysMenu> menus = menuManagerService.getAllParentMenu();
        model.addAttribute("parentMenus", menus);
        return PAGE_PREFIX + "menuput";
    }

    //更新菜单
    @PutMapping("/menuput")
    @ResponseBody
    public ReturnResult menuUpdate(@RequestBody @Valid MenuAddEnitityForm menuadd, BindingResult result) {
        return null;
    }
}
