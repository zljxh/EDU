package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.SysMenu;
import com.zl.edu.service.entity.MenuAddEnitityForm;

import java.util.List;

public interface MenuManagerService {
    public List<SysMenu> getAllParentMenu();

    public ReturnResult save(MenuAddEnitityForm menuadd);
}
