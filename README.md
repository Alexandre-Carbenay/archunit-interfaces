Run `./gradlew clean test` to execute tests.

To make the build fail, add
```
    public void callChildMethod() {
        child.someChildMethod();
    }
```
to `com.example.usage1.RootMethodUsage` class.