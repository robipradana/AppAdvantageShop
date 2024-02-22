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

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Advantage'), 'Advantage')

'tap menu\r\n'
Mobile.tap(findTestObject('Checkout Headphone/Menu'), 0)

Mobile.verifyElementText(findTestObject('Checkout Headphone/Login'), 'LOGIN')

'tap login\r\n'
Mobile.tap(findTestObject('Checkout Headphone/Login'), 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - Dont have an account'), 'Don\'t have an account?')

'tap sign up today'
Mobile.tap(findTestObject('Sign Up/Sign Up Today'), 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - PERSONAL DETAILS'), 'PERSONAL DETAILS')

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - USER NAME'), 'USER NAME')

'input username\r\n'
Mobile.setText(findTestObject('Sign Up/Username'), '28zein', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - EMAIL'), 'EMAIL')

'input email'
Mobile.setText(findTestObject('Sign Up/Email'), 'zein28@gmail.com', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - PASSWORD'), 'PASSWORD')

'input password'
Mobile.setText(findTestObject('Sign Up/Password'), '28Zein', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - CONFIRM PASSWORD'), 'CONFIRM PASSWORD')

'input confirm password'
Mobile.setText(findTestObject('Sign Up/Confirm Password'), '28Zein', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - FIRST NAME'), 'FIRST NAME')

'input firstname\r\n'
Mobile.setText(findTestObject('Sign Up/Fisrt Name'), 'Zein', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - LAST NAME'), 'LAST NAME')

'input lastname'
Mobile.setText(findTestObject('Sign Up/Last Name'), 'Arsyad', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - PHONE NUMBER'), 'PHONE NUMBER')

'input phone number'
Mobile.setText(findTestObject('Object Repository/Sign Up/Phone Number'), '081243211234', 0)

'scroll to text country\r\n'
Mobile.scrollToText('COUNTRY')

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - COUNTRY'), 'COUNTRY')

'tap country'
Mobile.tap(findTestObject('Object Repository/Sign Up/android.widget.TextView - United States'), 0)

'scroll to text indonesia'
Mobile.scrollToText('Indonesia')

'tap indonesia'
Mobile.tap(findTestObject('Object Repository/Sign Up/android.widget.TextView - Indonesia'), 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - STATE'), 'STATE')

'input state jawa barat\r\n'
Mobile.setText(findTestObject('Object Repository/Sign Up/State'), 'Jawa Barat', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - ADDRESS 1'), 'ADDRESS')

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - ADDRESS 2'), 'ADDRESS')

'input address'
Mobile.setText(findTestObject('Object Repository/Sign Up/Address'), 'jl teluk bayur', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - CITY'), 'CITY')

'input city'
Mobile.setText(findTestObject('Object Repository/Sign Up/City'), 'Depok', 0)

Mobile.verifyElementText(findTestObject('Verify Sign Up/android.widget.TextView - ZIP'), 'ZIP')

'input zip'
Mobile.setText(findTestObject('Object Repository/Sign Up/Zip'), '654321', 0)

Mobile.delay(3)

'tap register'
Mobile.tap(findTestObject('Object Repository/Sign Up/Register'), 0)

Mobile.delay(3)

Mobile.closeApplication()

