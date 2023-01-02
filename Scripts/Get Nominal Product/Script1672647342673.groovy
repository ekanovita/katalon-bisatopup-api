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

response = WS.sendRequest(findTestObject('Nominal Product'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].product_detail_id', '43')

WS.verifyElementPropertyValue(response, '[0].product_id', '11')

WS.verifyElementPropertyValue(response, '[0].product_code', 'A5')

WS.verifyElementPropertyValue(response, '[0].name', 'AS 5000')

WS.verifyElementPropertyValue(response, '[0].price', '5800')

WS.verifyElementPropertyValue(response, '[0].base_price', '5600')

WS.verifyElementPropertyValue(response, '[0].note', '')

WS.verifyElementPropertyValue(response, '[0].is_active', '1')

WS.verifyElementPropertyValue(response, '[1].product_detail_id', '39')

WS.verifyElementPropertyValue(response, '[1].product_id', '11')

WS.verifyElementPropertyValue(response, '[1].product_code', 'A10')

WS.verifyElementPropertyValue(response, '[1].name', 'AS 10000')

WS.verifyElementPropertyValue(response, '[1].price', '10800')

WS.verifyElementPropertyValue(response, '[1].base_price', '10600')

WS.verifyElementPropertyValue(response, '[1].note', '')

WS.verifyElementPropertyValue(response, '[1].is_active', '1')