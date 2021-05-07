package forgotPassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTest {
   @Test
    public void testsInputEmail(){
       ForgotPasswordPage forgotPasswordPage=homePage.clickForgotPassword();
       forgotPasswordPage.enterEmail("kastet_2008@list.ru"/*+ Keys.ENTER*/);
       forgotPasswordPage.clickButtonRetrievePassword();
       Assert.assertEquals(forgotPasswordPage.getTitle(),"Internal Server Error","Result is wrong");

   }
}
