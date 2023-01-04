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

response = WS.sendRequest(findTestObject('Transaksi'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'error', error)

WS.verifyElementPropertyValue(response, 'message', message)

WS.verifyElementPropertyValue(response, 'trans_id', trans_id)

WS.verifyElementPropertyValue(response, 'transaksi.trans_id', trans_id)

WS.verifyElementPropertyValue(response, 'transaksi.tanggal', tanggal)

WS.verifyElementPropertyValue(response, 'transaksi.time', time)

WS.verifyElementPropertyValue(response, 'transaksi.product', product)

WS.verifyElementPropertyValue(response, 'transaksi.product_id', product_id)

WS.verifyElementPropertyValue(response, 'transaksi.admin_fee', admin_fee)

WS.verifyElementPropertyValue(response, 'transaksi.product_name', product_name)

WS.verifyElementPropertyValue(response, 'transaksi.product_detail', product_detail)

WS.verifyElementPropertyValue(response, 'transaksi.harga', harga)

WS.verifyElementPropertyValue(response, 'transaksi.base_price', base_price)

WS.verifyElementPropertyValue(response, 'transaksi.payment', payment)

WS.verifyElementPropertyValue(response, 'transaksi.no_pelanggan', no_pelanggan)

WS.verifyElementPropertyValue(response, 'transaksi.no_hp_pelanggan', no_hp_pelanggan)

WS.verifyElementPropertyValue(response, 'transaksi.kode_unik', kode_unik)

WS.verifyElementPropertyValue(response, 'transaksi.expired_date', expired_date)

WS.verifyElementPropertyValue(response, 'transaksi.note', note)

WS.verifyElementPropertyValue(response, 'transaksi.token', token)

WS.verifyElementPropertyValue(response, 'transaksi.status', status)

WS.verifyElementPropertyValue(response, 'transaksi.status_id', status_id)

WS.verifyElementPropertyValue(response, 'transaksi.pembayaran.bank', bank)

WS.verifyElementPropertyValue(response, 'transaksi.pembayaran.rekening', rekening)

WS.verifyElementPropertyValue(response, 'transaksi.pembayaran.name', name)

WS.verifyElementPropertyValue(response, 'transaksi.pembayaran.payment_id', payment_id)


