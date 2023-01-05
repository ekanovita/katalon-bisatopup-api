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

response = WS.sendRequest(findTestObject('Detil Transaksi', [('id') : '5816']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'trans_id', '5816')

WS.verifyElementPropertyValue(response, 'order_num', '90')

WS.verifyElementPropertyValue(response, 'product_id', '31')

WS.verifyElementPropertyValue(response, 'product_name', 'PLN')

WS.verifyElementPropertyValue(response, 'product_detail_id', '115')

WS.verifyElementPropertyValue(response, 'no_hp', '087719888886')

WS.verifyElementPropertyValue(response, 'token', '')

WS.verifyElementPropertyValue(response, 'no_pelanggan', '112000162978')

WS.verifyElementPropertyValue(response, 'product_detail', 'PLN')

WS.verifyElementPropertyValue(response, 'harga', '311305')

WS.verifyElementPropertyValue(response, 'note', '')

WS.verifyElementPropertyValue(response, 'status_id', '5')

WS.verifyElementPropertyValue(response, 'status', 'Cancelled')

WS.verifyElementPropertyValue(response, 'created_at', '2016-07-20 06:11:01')


