package com.imooc.design.principle.dependenceinversion;

public class Geely {

    public void studyImoocCourse(ICourse iCourse){
        iCourse.studyCourse();
    }
}
