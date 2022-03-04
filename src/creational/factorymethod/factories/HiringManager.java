package creational.factorymethod.factories;

import creational.factorymethod.interfaces.Interviewer;

abstract class HiringManager {

    // Factory method
    protected abstract Interviewer makeInterviewer();

    public void takeInterviewer() {
        Interviewer interviewer = this::makeInterviewer;
        interviewer.askQuestions();
    }

}
