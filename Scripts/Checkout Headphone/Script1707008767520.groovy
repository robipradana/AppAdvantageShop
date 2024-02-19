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

Mobile.startApplication('AppShop/Advantagedemo3.2.apk', false)

Mobile.tap(findTestObject('AppShop/Menu'), 0)

Mobile.tap(findTestObject('AppShop/Login'), 0)

Mobile.setText(findTestObject('AppShop/Input Username'), 'robipm', 0)

Mobile.setText(findTestObject('AppShop/Input Password'), 'Sukses1', 0)

Mobile.tap(findTestObject('AppShop/Login 2'), 0)

Mobile.tap(findTestObject('AppShop/Headphone'), 0)

Mobile.tap(findTestObject('AppShop/BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'), 0)

Mobile.tap(findTestObject('AppShop/ADD TO CART'), 0)

Mobile.tap(findTestObject('AppShop/CART'), 0)

Mobile.tap(findTestObject('AppShop/CHECKOUT (PAY 179.99)'), 0)

Mobile.tap(findTestObject('AppShop/PAY NOW'), 0)

Mobile.tap(findTestObject('AppShop/CLOSE X'), 0)

Mobile.closeApplication()

