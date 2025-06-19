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

def response = WS.sendRequest(findTestObject('GET_Users'))
WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'page', 2)
WS.verifyElementPropertyValue(response, 'per_page', 6)
WS.verifyElementPropertyValue(response, 'total', 12)
WS.verifyElementPropertyValue(response, 'total_pages', 2)

WS.verifyElementPropertyValue(response, 'data[0].id', 7)
WS.verifyElementPropertyValue(response, 'data[0].email', 'michael.lawson@reqres.in')
WS.verifyElementPropertyValue(response, 'data[0].first_name', 'Michael')
WS.verifyElementPropertyValue(response, 'data[0].last_name', 'Lawson')
WS.verifyElementPropertyValue(response, 'data[0].avatar', 'https://reqres.in/img/faces/7-image.jpg')


WS.verifyElementPropertyValue(response, 'data[1].id', 8)
WS.verifyElementPropertyValue(response, 'data[1].email', 'lindsay.ferguson@reqres.in')
WS.verifyElementPropertyValue(response, 'data[1].first_name', 'Lindsay')
WS.verifyElementPropertyValue(response, 'data[1].last_name', 'Ferguson')
WS.verifyElementPropertyValue(response, 'data[1].avatar', 'https://reqres.in/img/faces/8-image.jpg')

WS.verifyElementPropertyValue(response, 'data[2].id', 9)
WS.verifyElementPropertyValue(response, 'data[2].email', 'tobias.funke@reqres.in')
WS.verifyElementPropertyValue(response, 'data[2].first_name', 'Tobias')
WS.verifyElementPropertyValue(response, 'data[2].last_name', 'Funke')
WS.verifyElementPropertyValue(response, 'data[2].avatar', 'https://reqres.in/img/faces/9-image.jpg')

WS.verifyElementPropertyValue(response, 'data[3].id', 10)
WS.verifyElementPropertyValue(response, 'data[3].email', 'byron.fields@reqres.in')
WS.verifyElementPropertyValue(response, 'data[3].first_name', 'Byron')
WS.verifyElementPropertyValue(response, 'data[3].last_name', 'Fields')
WS.verifyElementPropertyValue(response, 'data[3].avatar', 'https://reqres.in/img/faces/10-image.jpg')

WS.verifyElementPropertyValue(response, 'data[4].id', 11)
WS.verifyElementPropertyValue(response, 'data[4].email', 'george.edwards@reqres.in')
WS.verifyElementPropertyValue(response, 'data[4].first_name', 'George')
WS.verifyElementPropertyValue(response, 'data[4].last_name', 'Edwards')
WS.verifyElementPropertyValue(response, 'data[4].avatar', 'https://reqres.in/img/faces/11-image.jpg')

WS.verifyElementPropertyValue(response, 'data[5].id', 12)
WS.verifyElementPropertyValue(response, 'data[5].email', 'rachel.howell@reqres.in')
WS.verifyElementPropertyValue(response, 'data[5].first_name', 'Rachel')
WS.verifyElementPropertyValue(response, 'data[5].last_name', 'Howell')
WS.verifyElementPropertyValue(response, 'data[5].avatar', 'https://reqres.in/img/faces/12-image.jpg')

