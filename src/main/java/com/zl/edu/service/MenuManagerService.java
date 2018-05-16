package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.SysMenu;
import com.zl.edu.service.entity.MenuAddEnitityForm;

import java.util.List;

public interface MenuManagerService {
    public List<SysMenu> getAllParentMenu();
    public List<SysMenu> getAllMenus();

    public ReturnResult save(MenuAddEnitityForm menuadd);

    public ReturnResult delete(Long id);
}
