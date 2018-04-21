package com.zl.edu.util;

import java.util.List;

/**
 * Created by user on 2018/3/1.
 */
public class ListUtil {
    public static boolean isEmpty(List list){
        if (list==null)return true;
        if (list.size()==0)return true;
        return false;
    }
}
