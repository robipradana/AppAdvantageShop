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

Mobile.verifyElementVisible(findTestObject('Verify Checkout Headphone/android.widget.TextView - Advantage'), 0)

'tap laptop\r\n'
Mobile.tap(findTestObject('Object Repository/Filter Laptop By Price/Laptops'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Verify Filter Laptop/android.widget.TextView - FILTERS'), 'FILTERS')

'tap filter'
Mobile.tap(findTestObject('Object Repository/Filter Laptop By Price/Filters'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Verify Filter Laptop/android.widget.TextView - BY PRICE'), 'BY PRICE')

'tap by price'
Mobile.tap(findTestObject('Object Repository/Filter Laptop By Price/By Price'), 0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Verify Filter Laptop/android.view.View'), 0)

Mobile.verifyElementVisible(findTestObject('Verify Filter Laptop/android.widget.TextView - 179'), 0)

Mobile.verifyElementVisible(findTestObject('Verify Filter Laptop/android.widget.TextView - 1799'), 0)

'tap volume filtering price'
Mobile.tap(findTestObject('Object Repository/Filter Laptop By Price/Vol Filter Price'), 0)

'tap apply'
Mobile.tap(findTestObject('Object Repository/Filter Laptop By Price/Apply Filter'), 0)

Mobile.delay(2)

Mobile.verifyElementVisible(findTestObject('Verify Filter Laptop/android.widget.TextView - Laptops (8)'), 0)

'scroll to text HP STREAM - 11-D020NR LAPTOP\r\n'
Mobile.scrollToText('HP STREAM - 11-D020NR LAPTOP')

Mobile.verifyElementVisible(findTestObject('Verify Filter Laptop/android.widget.TextView - HP STREAM - 11-D020NR LAPTOP'), 0)

Mobile.closeApplication()

