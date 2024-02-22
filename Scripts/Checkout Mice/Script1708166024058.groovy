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

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Advantage'), 'Advantage')

'tap menu'
Mobile.tap(findTestObject('Checkout Headphone/Menu'), 0)

Mobile.verifyElementText(findTestObject('Checkout Headphone/Login'), 'LOGIN')

'tap login\r\n\r\n\r\n'
Mobile.tap(findTestObject('Checkout Headphone/Login'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - USER NAME'), 'USER NAME')

'input username'
Mobile.setText(findTestObject('Checkout Headphone/Input Username'), 'robipm', 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - PASSWORD'), 'PASSWORD')

'input password\r\n\r\n'
Mobile.setText(findTestObject('Checkout Headphone/Input Password'), 'Sukses1', 0)

'tap button login'
Mobile.tap(findTestObject('Checkout Headphone/Login 2'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - LAPTOPS'), 'LAPTOPS')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - HEADPHONES'), 'HEADPHONES')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - TABLETS'), 'TABLETS')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - SPEAKERS'), 'SPEAKERS')

'scroll to text mice\r\n'
Mobile.scrollToText('MICE')

'tap mice\r\n'
Mobile.tap(findTestObject('Checkout Mice/android.widget.TextView - MICE'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - Mice (9)'), 'Mice (9)')

'scroll to text sculpt touch mouse\r\n'
Mobile.scrollToText('MICROSOFT SCULPT TOUCH MOUSE')

'tap mouse microsoft sculpt touch\r\n'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.TextView - MICROSOFT SCULPT TOUCH MOUSE'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - QUANTITY'), 'QUANTITY')

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - COLOR'), 'COLOR')

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - DETAILS'), 'DETAILS')

'tap quantity\r\n'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.TextView - QUANTITY'), 0)

'tap 1 edit quantity'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.EditText - 1'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - Enter Quantity'), 'Enter Quantity')

'set quantity 5\r\n'
Mobile.setText(findTestObject('Checkout Mice/android.widget.EditText - 1 (1)'), '5', 0)

'hide keyboard'
Mobile.hideKeyboard()

'tap apply\r\n'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.TextView - APPLY'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - QUANTITY'), 'QUANTITY')

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - 5 in Quantity'), '5')

'tap add to cart'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.Button - ADD TO CART'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - 5 in Cart'), '5')

'tap icon cart\r\n'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.ImageView'), 0)

Mobile.delay(3)

'tap checkout pay $249.95'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.Button - CHECKOUT (PAY 249.95)'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - Order Payment'), 'Order Payment')

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - SHIPPING DETAILS'), 'SHIPPING DETAILS')

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - PAYMENT METHOD'), 'PAYMENT METHOD')

'tap pay now'
Mobile.tap(findTestObject('Object Repository/Checkout Mice/android.widget.Button - PAY NOW'), 0)

Mobile.verifyElementText(findTestObject('Verify Chekcout Mice/android.widget.TextView - Your cart was successfully purchased'), 
    'Your cart was successfully purchased')

'tap x'
Mobile.tap(findTestObject('Checkout Mice/Close X Dialog'), 0)

Mobile.delay(3)

Mobile.closeApplication()

