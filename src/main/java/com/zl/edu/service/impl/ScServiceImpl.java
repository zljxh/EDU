package com.zl.edu.service.impl;

import com.zl.edu.dao.entity.Sc;
import com.zl.edu.dao.mapper.ScMapper;
import com.zl.edu.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/7.
 */
@Service
public class ScServiceImpl implements ScService {
    @Autowired
    private ScMapper scMapper;
    @Override
    public void saveSc() {
        List<Sc> scList=getScList();
        for (Sc sc:scList){
            scMapper.saveSc(sc);
        }
    }

    public List<Sc> getScList(){
        List<Sc> scList=new ArrayList<>();
        for (int i=1;i<21;i++){
            for (int j=1001;j<1023;j++){
                Sc sc=new Sc();
                sc.setS(i);
                sc.setC(j);
                sc.setScore(getScore());
                scList.add(sc);
            }
        }
        return scList;
    }
    private static  Integer getScore(){
        return 40+ (int)(Math.random()*60);
    }

    public static void main(String [] args){
        for (int i=0;i<100;i++){
            System.out.println(getScore());
        }
    }

}


