package pages;

import base.MobileAPI;

public class HomePage extends MobileAPI{

    public void clickAccessibility(){
      text("Accessibility").click();
    }
    public void clickAnimation(){
        text("Animation").click();
    }
    public void clickApp(){
        clickByXpath("//android.widget.TextView[@content-desc=\"App\"]");
    }
}