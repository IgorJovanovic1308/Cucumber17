package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseTest {

    public ProfilePage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = ".icon-2x.icon-signout")
    public WebElement logOutButton;


    //--------------------------------------------------------

    public void clickOnLogoutButton() {
        logOutButton.click();
    }







}