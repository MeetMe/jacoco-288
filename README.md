To reproduce jacoco/jacoco#288:

* Clone the project
```
    $ git clone https://github.com/MeetMe/jacoco-288.git
    $ cd jacoco-288
```
* Run the tests with the default (jacoco version 0.7.1)
```
    $ ./gradlew clean :app:testDebug :app:jacocoTestDebugReport -PjacocoVersion=0.7.1.201405082137
    $ ls -l app/build/jacoco/testDebug.exec
    $ open app/build/reports/jacoco/jacocoTestDebugReport/html/index.html
```
* Run the same tests changing only the JaCoCo version (0.7.3 or 0.7.4)
```
    $ ./gradlew clean :app:testDebug :app:jacocoTestDebugReport -PjacocoVersion=0.7.4.201502262128
    $ ls -l app/build/jacoco/testDebug.exec
    $ open app/build/reports/jacoco/jacocoTestDebugReport/html/index.html
```
The 0.7.1 report shows 73% coverage.

The 0.7.3 and 0.7.4 reports both show 0% coverage.
