# Movies_App_Compose
- Movies App using TMDB API
- This app is built using Jetpack Compose, Clean Architecture, MVVM and the latest libraries
- It will show a list of movies, the user can keep scrolling and more movies are fetched from the internet to be shown
- clean architecture is used in this project. We have three layers Presentation(UI), Domain(use cases or Business logic), Data
---
## Screenshots
<p align="center">
<img src = "https://raw.githubusercontent.com/nameisjayant/Find-Movie/master/app/src/main/res/drawable/one.png" height=300px/>
</p>

---
## Gradle
- Kotlin dsl is used as a gradle instead of groovy
- It is compiled against Java JDK 17, Android API level 34
---
## Libraries
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [Jetpack Compose](https://developer.android.com/jetpack/compose) - Modern way to make Ui in android kotlin.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
- [Moshi Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/moshi) - A Converter which uses Moshi for serialization to and from JSON.
- [Coil-kt](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
---
## References
- [IMDB-Movie-App](https://github.com/nameisjayant/IMDB-Movie-App)
  
