package com.poshanabhiyan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.poshanabhiyan.model.user.PoshanAbhiyanDetails;
import com.poshanabhiyan.pages.PoshanAbhiyanPage;
import com.poshanabhiyan.test.BaseTest;
import com.poshanabhiyan.utility.ExcelReader;
import com.poshanabhiyan.utility.PageFactory;
import com.poshanabhiyan.utility.Screenshot;

public class PoshanAbhiyanTest extends BaseTest {

	@Test(priority = 1, description = "poshan abhiyaan data entry")
	public void PoshanAbhiyanData() throws Exception {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\PoshanAbhiyanData.xlsx";
		PoshanAbhiyanPage poshanAbhiyanPage = PageFactory.createPageInstance(driver, PoshanAbhiyanPage.class);
		for (int i = 0; i < 28; i++) {
			Map<String, String> map = new ExcelReader(filePath, "Create").getTestData().get(i);
			PoshanAbhiyanDetails poshanAbhiyanDetails = new PoshanAbhiyanDetails(map);
			assertTrue(poshanAbhiyanPage.addPoshanAbhiyanRecords(poshanAbhiyanDetails),	"Poshan Abhiyaan Data entry failed - for "+poshanAbhiyanDetails.getTheme() +" - "+poshanAbhiyanDetails.getActivity());
		}
	}

	@AfterMethod
	public void afterEachMethod(Method method) {
		Screenshot screenshot = new Screenshot(driver);
		screenshot.captureScreen("PoshanAbhiyanTest", method.getName());
		driver.navigate().refresh();
	}
}
