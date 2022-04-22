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

Mobile.startApplication(GlobalVariable.baseLink, false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/Nav-Transaksi'), 0)

Mobile.tap(findTestObject('Transaksi Page/Btn-PilihPelanggan'), 0)

Mobile.setText(findTestObject('Transaksi Page/ListPel-From Search'), 'Ngadimin', 0)

Mobile.tap(findTestObject('Transaksi Page/ListPel- Paling Atas'), 0)

Mobile.tap(findTestObject('Transaksi Page/Choose Paling Atas'), 0)

//Mobile.tap(findTestObject('Transaksi Page/NavTrans-SATUAN'), 0)
//Mobile.setText(findTestObject('Transaksi Page/Item-SearchBox'), 'Karpet', 0)
Mobile.setText(findTestObject('Transaksi Page/Jml-JumlahPesananForm'), '2', 0)

Mobile.tap(findTestObject('Transaksi Page/Jml-Btn-Tambahkan'), 0)

