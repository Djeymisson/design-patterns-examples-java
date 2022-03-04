package creational.factorymethod.factories;

import creational.factorymethod.impls.CommunityExecutive;
import creational.factorymethod.interfaces.Interviewer;

public class MarketingManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
