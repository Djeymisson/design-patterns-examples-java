package creational.factorymethod.factories;

import creational.factorymethod.impls.Developer;
import creational.factorymethod.interfaces.Interviewer;

public class DevelopmentManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
