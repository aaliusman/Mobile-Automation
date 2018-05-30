package pages;

import base.MobileAPI;

public class AppPage extends MobileAPI{

    public void clickAlarm(){
        clickByXpath("//android.widget.TextView[@content-desc=\"Alarm\"]");
    }
}
