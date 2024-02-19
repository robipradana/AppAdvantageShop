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

Mobile.startApplication('C:\\Users\\ASUS\\Katalon Studio\\TestAppShop\\AppShop\\Advantagedemo3.2.apk', true)

'tap laptop\r\n'
Mobile.tap(findTestObject('Object Repository/AppShop/Laptops'), 0)

'tap filter'
Mobile.tap(findTestObject('Object Repository/AppShop/Filters'), 0)

'tap by price'
Mobile.tap(findTestObject('Object Repository/AppShop/By Price'), 0)

'tap volume filtering price'
Mobile.tap(findTestObject('Object Repository/AppShop/Vol Filter Price'), 0)

'tap apply'
Mobile.tap(findTestObject('Object Repository/AppShop/Apply Filter'), 0)

'scroll to text HP STREAM - 11-D020NR LAPTOP\r\n'
Mobile.scrollToText('HP STREAM - 11-D020NR LAPTOP')

Mobile.closeApplication()

