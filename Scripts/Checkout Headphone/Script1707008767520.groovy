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

Mobile.tap(findTestObject('Checkout Headphone/Menu'), 0)

Mobile.verifyElementText(findTestObject('Checkout Headphone/Login'), 'LOGIN')

Mobile.tap(findTestObject('Checkout Headphone/Login'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - USER NAME'), 'USER NAME')

Mobile.setText(findTestObject('Checkout Headphone/Input Username'), 'robipm', 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - PASSWORD'), 'PASSWORD')

Mobile.setText(findTestObject('Checkout Headphone/Input Password'), 'Sukses1', 0)

Mobile.tap(findTestObject('Checkout Headphone/Login 2'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - LAPTOPS'), 'LAPTOPS')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - HEADPHONES'), 'HEADPHONES')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - TABLETS'), 'TABLETS')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - SPEAKERS'), 'SPEAKERS')

Mobile.tap(findTestObject('Checkout Headphone/Headphone'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Headphones (64)'), 'Headphones (64)')

Mobile.tap(findTestObject('Checkout Headphone/BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/Description Beats Studio 2 Over-Ear'), 'The world’s most famous headphone has been completely redesigned and reimagined. The new Beats Studio® is lighter, sexier, stronger, and more comfortable, with precision sound, Adaptive Noise Canceling, a 20-hour rechargeable battery, and RemoteTalk™. It has all the energy and excitement you expect from Beats, plus a powerful, reengineered sound.')

Mobile.tap(findTestObject('Checkout Headphone/ADD TO CART'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - 1'), '1')

Mobile.tap(findTestObject('Checkout Headphone/CART'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Shopping Cart (1)'), 'Shopping Cart (1) ')

Mobile.tap(findTestObject('Checkout Headphone/CHECKOUT (PAY 179.99)'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Order Payment'), 'Order Payment')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - SHIPPING DETAILS'), 'SHIPPING DETAILS')

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - PAYMENT METHOD'), 'PAYMENT METHOD')

Mobile.tap(findTestObject('Checkout Headphone/PAY NOW'), 0)

Mobile.verifyElementText(findTestObject('Verify Checkout Headphone/android.widget.TextView - Your cart was successfully purchased'), 'Your cart was successfully purchased')

Mobile.tap(findTestObject('Checkout Headphone/CLOSE X'), 0)

Mobile.closeApplication()

