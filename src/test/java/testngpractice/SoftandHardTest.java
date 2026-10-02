package testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftandHardTest {     // <--- Must be SoftandHardTest

    @Test
    public void verifyDashboardDetails() {
        String actualUrl = "https://app.com/dashboard";
        String userRole = "Admin";       // Changed from "Editor"
        String themeColor = "Dark";       // Changed from "Blue"
        boolean isLogoPresent = true;

        Assert.assertEquals(actualUrl, "https://app.com/dashboard", "Critical Failure: Not on Dashboard!");
        
        System.out.println("Hard Assertion Passed. Proceeding to detailed UI checks...");

        SoftAssert soft = new SoftAssert();

        soft.assertEquals(userRole, "Admin", "User role badge is incorrect!");
        soft.assertEquals(themeColor, "Dark", "Default theme is not Dark!");
        soft.assertTrue(isLogoPresent, "Corporate logo is missing!");

        soft.assertAll();
    }
}


