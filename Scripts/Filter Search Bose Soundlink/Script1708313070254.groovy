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

Mobile.verifyElementVisible(findTestObject('Verify Checkout Headphone/android.widget.TextView - Advantage'), 0)

Mobile.tap(findTestObject('Checkout Headphone/Menu'), 0)

Mobile.verifyElementText(findTestObject('Checkout Headphone/Login'), 'LOGIN')

Mobile.tap(findTestObject('Checkout Headphone/Login'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout Headphone/Input Username'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout Headphone/Input Password'), 0)

Mobile.setText(findTestObject('Checkout Headphone/Input Username'), 'robipm', 0)

Mobile.setText(findTestObject('Checkout Headphone/Input Password'), 'Sukses1', 0)

Mobile.verifyElementVisible(findTestObject('Checkout Headphone/Login 2'), 0)

Mobile.tap(findTestObject('Checkout Headphone/Login 2'), 0)

Mobile.delay(4)

'tap search 1'
Mobile.tap(findTestObject('Object Repository/Filter Search Bose Soundlink/android.widget.ImageView'), 0)

'input text in column search'
Mobile.setText(findTestObject('Object Repository/Filter Search Bose Soundlink/android.widget.EditText - Search'), 'BOSE SOUNDLINK', 
    0)

Mobile.hideKeyboard()

'tap search 2'
Mobile.tap(findTestObject('Object Repository/Filter Search Bose Soundlink/android.widget.ImageView (1)'), 0)

Mobile.delay(6)

Mobile.verifyElementVisible(findTestObject('Filter Search Bose Soundlink/android.widget.TextView - BOSE SOUNDLINK WIRELESS SPEAKER'), 
    0)

'tap bose soundlink wireless'
Mobile.tap(findTestObject('Object Repository/Filter Search Bose Soundlink/android.widget.RelativeLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Filter Search Bose Soundlink/Detail Description Bose Soundlink Wireless'), 0)

Mobile.delay(6)

Mobile.closeApplication()

