import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

List testsuite = ['Include/resource/testng.xml']

TestNGKW.runTestNGTestSuites(testsuite, FailureHandling.STOP_ON_FAILURE)

