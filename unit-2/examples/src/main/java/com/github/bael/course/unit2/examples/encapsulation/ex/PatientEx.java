package com.github.bael.course.unit2.examples.encapsulation.ex;



import java.util.Collections;
import java.util.List;

public class PatientEx {

    private String name;
    private String room;

    public List<TreatmentEx> getCourse() {
        return course;
    }

    public PatientEx(String name, String room, List<TreatmentEx> course) {
        this.name = name;
        this.room = room;
        this.course = course;
        this.planTreatCount = course.size();
    }

    private List<TreatmentEx> course;

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    private int planTreatCount;
    private int factTreatCount;

    public boolean isCured() {
        return planTreatCount == factTreatCount;
    }

    public void treat() {

        for(TreatmentEx treatmentEx: course) {
            treatmentEx.treat();
            factTreatCount++;
        }
    }









    public List<TreatmentEx> getCourseUnmodifiedable() {
        return Collections.unmodifiableList(course);
    }

    @Override
    public String toString() {
        return "PatientEx{" +
                "name='" + name + '\'' +
                ", room='" + room + '\'' +
                ", course=" + course +
                ", planTreatCount=" + planTreatCount +
                ", factTreatCount=" + factTreatCount +
                '}';
    }
}
