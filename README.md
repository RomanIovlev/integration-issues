# NoDriverTests
If skip eyes().open(DRIVER, "App name", "Batch") method will throw NullPointerException instead of reasonable message that no driver setup or no open method calls.</br>
java.lang.NullPointerException

# ZoomTests
For my Windows machine Zoom level 150% is recommended</br>
![Zoom150](images/zoom150.png)</br>
In this case both tests in this set provides wrong images in Applitools Web Application

## loginFailedValidation
![WrongLogin](images/wrong-login-failed.png)</br>
instead of correct</br>
![CorrectLogin](images/correct-login-failed.png)

## sortTableValidation
![WrongAscending](images/ascending-wrong.png)</br>
![WrongDescending](images/descending-wrong.png)</br>
instead of correct</br>
![CorrectAscending](images/ascending-correct.png)</br>
![CorrectDescending](images/descending-correct.png)

# ScrollTests
If you scroll browser screen for example to element before call eyes().check(...) then element image will be wrong

# LoginCheckTests
6 same tests but for some of them failed with Applitools</br>
1. All three check, checkElement and checkRegion will fail for PageObjects elements (elements that initialized by **org.openqa.selenium.support.PageFactory.initElements(...)** method)</br>
With error **com.applitools.eyes.EyesException: The input web element is not a RemoteWebElement.**</br>
2. eyes().checkElement(By.cssSelector(".auth-header")) will fail with message **java.lang.IllegalArgumentException: height < 0** while same calls for check(...) or checkRegion(...) will pass