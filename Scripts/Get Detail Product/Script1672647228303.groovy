import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('Detail Product'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].product_id', '6')

WS.verifyElementPropertyValue(response, '[0].parent_id', '1')

WS.verifyElementPropertyValue(response, '[0].product_name', 'THREE')

WS.verifyElementPropertyValue(response, '[0].product', '')

WS.verifyElementPropertyValue(response, '[0].code', '')

WS.verifyElementPropertyValue(response, '[0].prefix', '0896,0897,0898,0899')

WS.verifyElementPropertyValue(response, '[0].description', '')

WS.verifyElementPropertyValue(response, '[0].is_active', '1')

WS.verifyElementPropertyValue(response, '[1].product_id', '11')

WS.verifyElementPropertyValue(response, '[1].parent_id', '1')

WS.verifyElementPropertyValue(response, '[1].product_name', 'AS Telkomsel')

WS.verifyElementPropertyValue(response, '[1].product', '')

WS.verifyElementPropertyValue(response, '[1].code', '')

WS.verifyElementPropertyValue(response, '[1].prefix', '0823,0852,0853,0851')

WS.verifyElementPropertyValue(response, '[1].description', '\r\n')

WS.verifyElementPropertyValue(response, '[1].is_active', '1')