package com.zl.edu.service.entity;

import com.zl.edu.dao.entity.Course;
import com.zl.edu.dao.entity.CourseCategoryCourse;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 2018/3/2.
 */
@Data
public class SaveCourseForm implements Serializable {
    @NotNull
    private Course course;
    @NotEmpty
    private List<CourseCategoryCourse> cateids;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<CourseCategoryCourse> getCateids() {
        return cateids;
    }

    public void setCateids(List<CourseCategoryCourse> cateids) {
        this.cateids = cateids;
    }
}
