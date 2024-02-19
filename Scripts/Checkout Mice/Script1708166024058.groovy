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

Mobile.startApplication('AppShop/Advantagedemo3.2.apk', true)

'tap menu'
Mobile.tap(findTestObject('AppShop/Menu'), 0)

'tap login\r\n\r\n\r\n'
Mobile.tap(findTestObject('AppShop/Login'), 0)

'input username'
Mobile.setText(findTestObject('AppShop/Input Username'), 'robipm', 0)

'input password\r\n\r\n'
Mobile.setText(findTestObject('AppShop/Input Password'), 'Sukses1', 0)

'tap button login'
Mobile.tap(findTestObject('AppShop/Login 2'), 0)

'scroll to text mice\r\n'
Mobile.scrollToText('MICE')

'tap mice\r\n'
Mobile.tap(findTestObject('AppShop/android.widget.TextView - MICE'), 0)

'scroll to text sculpt touch mouse\r\n'
Mobile.scrollToText('MICROSOFT SCULPT TOUCH MOUSE')

'tap mouse microsoft sculpt touch\r\n'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.TextView - MICROSOFT SCULPT TOUCH MOUSE'), 0)

'tap quantity\r\n'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.TextView - QUANTITY'), 0)

'tap 1 edit quantity'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.EditText - 1'), 0)

'set quantity 5\r\n'
Mobile.setText(findTestObject('Object Repository/AppShop/android.widget.EditText - 1 (1)'), '5', 0)

'hide keyboard'
Mobile.hideKeyboard()

'tap apply\r\n'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.TextView - APPLY'), 0)

'tap add to cart'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.Button - ADD TO CART'), 0)

'tap icon cart\r\n'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.ImageView'), 0)

'tap checkout pay $249.95'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.Button - CHECKOUT (PAY 249.95)'), 0)

'tap pay now'
Mobile.tap(findTestObject('Object Repository/AppShop/android.widget.Button - PAY NOW'), 0)

'tap x'
Mobile.tap(findTestObject('Object Repository/AppShop/Volume Filtering Price'), 0)

Mobile.closeApplication()

