package com.zl.edu.controller.backend;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.common.exception.BackendException;
import com.zl.edu.service.CourseChapterService;
import com.zl.edu.service.CourseService;
import com.zl.edu.service.entity.CourseChapterForm;
import com.zl.edu.service.entity.SaveCourseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by user on 2018/3/2.
 */
@Controller
@RequestMapping("/backend")
public class BackendAddCoursePageController extends BaseBackendController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseChapterService courseChapterService;

    @PostMapping("/addcourse")
    public String addCourse() {
        return PAGE_PREFIX + "addcourse";
    }


    //�γ�ͷ���������Լ�����������
    @PostMapping("/savecourse")
    @ResponseBody
    public ReturnResult savecourse(
            @RequestBody @Valid SaveCourseForm saveCourseForm,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new BackendException(0, bindingResult.getFieldError().getDefaultMessage());
        }
        return courseService.saveCourse(saveCourseForm.getCourse(), saveCourseForm.getCateids());
//        return new ReturnResult(0, "fail");
    }

    @PostMapping("/addchapter")
    public String addCourseChapter() {

        return PAGE_PREFIX + "addchapter";
    }


    //�γ�Ŀ¼
    @PostMapping("/savechapter")
    @ResponseBody
    public ReturnResult saveCourseChapter(@RequestBody CourseChapterForm courseChapterForm) {

        return courseChapterService.saveCourseChapter(courseChapterForm);
    }

}
