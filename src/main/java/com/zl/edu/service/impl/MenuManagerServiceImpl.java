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
    public ReturnResult save(MenuAddEnitityForm menuadd) {
        ReturnResult result = new ReturnResult(0, "提交失败");
        if (sysMenuMapper.getMenuByTitleAndPath(menuadd.getTitle(), menuadd.getPath()).size() > 0) {
            result.setMsg("改菜单已存在");
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
        menu.setIsparentid(menu.getIsparentid());
        menu.setCreatetime(new Date());
        menu.setUpdatetime(new Date());
        menu.setPath(menu.getPath());
        menu.setTitle(menu.getTitle());
        menu.setSortorder(0);
        if (sysMenuMapper.save(menu) == 1) {
            result.setCode(1);
            result.setMsg("提交成功");
        }
        return result;
    }


}
