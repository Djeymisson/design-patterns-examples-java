package creational.factorymethod.client;

import creational.factorymethod.factories.DevelopmentManager;
import creational.factorymethod.factories.MarketingManager;
import creational.factorymethod.interfaces.Interviewer;

public class InterviewerFactoryClient {
    public static void main(String[] args) {
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterviewer();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterviewer();
    }
}
