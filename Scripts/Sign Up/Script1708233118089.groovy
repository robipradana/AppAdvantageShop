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

'tap menu\r\n'
Mobile.tap(findTestObject('AppShop/Menu'), 0)

'tap login\r\n'
Mobile.tap(findTestObject('AppShop/Login'), 0)

'tap sign up today'
Mobile.tap(findTestObject('Sign Up AppShop/Sign Up Today'), 0)

'input username\r\n'
Mobile.setText(findTestObject('Sign Up AppShop/Username'), '28zein', 0)

'input email'
Mobile.setText(findTestObject('Sign Up AppShop/Email'), 'zein28@gmail.com', 0)

'input password'
Mobile.setText(findTestObject('Sign Up AppShop/Password'), '28Zein', 0)

'input confirm password'
Mobile.setText(findTestObject('Sign Up AppShop/Confirm Password'), '28Zein', 0)

'input firstname\r\n'
Mobile.setText(findTestObject('Sign Up AppShop/Fisrt Name'), 'Zein', 0)

'input lastname'
Mobile.setText(findTestObject('Sign Up AppShop/Last Name'), 'Arsyad', 0)

'input phone number'
Mobile.setText(findTestObject('Object Repository/Sign Up AppShop/Phone Number'), '081243211234', 0)

'scroll to text country\r\n'
Mobile.scrollToText('COUNTRY')

'tap country'
Mobile.tap(findTestObject('Object Repository/Sign Up AppShop/android.widget.TextView - United States'), 0)

'scroll to text indonesia'
Mobile.scrollToText('Indonesia')

'tap indonesia'
Mobile.tap(findTestObject('Object Repository/Sign Up AppShop/android.widget.TextView - Indonesia'), 0)

'input state jawa barat\r\n'
Mobile.setText(findTestObject('Object Repository/Sign Up AppShop/android.widget.EditText (1)'), 'Jawa Barat', 0)

'input address'
Mobile.setText(findTestObject('Object Repository/Sign Up AppShop/android.widget.EditText (2)'), 'jl teluk bayur', 0)

'input city'
Mobile.setText(findTestObject('Object Repository/Sign Up AppShop/android.widget.EditText (3)'), 'Depok', 0)

'input zip'
Mobile.setText(findTestObject('Object Repository/Sign Up AppShop/android.widget.EditText (4)'), '654321', 0)

'tap register'
Mobile.tap(findTestObject('Object Repository/Sign Up AppShop/android.widget.Button - REGISTER (2)'), 0)

Mobile.closeApplication()

