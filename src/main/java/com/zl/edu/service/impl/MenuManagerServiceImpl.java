package com.zl.edu.service.impl;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.mapper.SysMenuMapper;
import com.zl.edu.service.MenuManagerService;
import com.zl.edu.dao.entity.SysMenu;
import com.zl.edu.service.entity.MenuAddEnitityForm;
import com.zl.edu.util.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MenuManagerServiceImpl implements MenuManagerService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> getAllParentMenu() {
        return sysMenuMapper.getAllParentMenu();
    }

    @Override
    public List<SysMenu> getAllMenus() {
        return sysMenuMapper.getAllMenus();
    }

    @Override
    public ReturnResult save(MenuAddEnitityForm menuadd) {
        ReturnResult result = new ReturnResult(0, "提交失败");
        if (sysMenuMapper.getMenuByTitleAndPath(menuadd.getTitle(), menuadd.getPath()).size() > 0) {
            result.setMsg("该菜单已存在");
            return result;
        }
        SysMenu menu = new SysMenu();
        long id = KeyUtil.getItemId();

        if (menuadd.getIsparentid() == 0) {
            menu.setParentid(id);
        } else {
            menu.setParentid(menuadd.getParentid());
        }
        menu.setCateid(id);
        menu.setIsparentid(menuadd.getIsparentid());
        menu.setCreatetime(new Date());
        menu.setUpdatetime(new Date());
        menu.setPath(menuadd.getPath());
        menu.setTitle(menuadd.getTitle());
        menu.setValidate(1);
        menu.setSortorder(0);
        if (sysMenuMapper.save(menu) == 1) {
            result.setCode(1);
            result.setMsg("提交成功");
        }
        return result;
    }

    @Override
    public ReturnResult delete(Long id) {
        ReturnResult result = new ReturnResult(0, "删除失败");
        if (sysMenuMapper.delete(id) == 1) {
            result.setMsg("删除成功");
            result.setCode(1);
        }
        return result;
    }


}
