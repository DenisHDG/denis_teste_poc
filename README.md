# denis_teste_poc
teste da poc
>How to 
To get a Git project into your build:
Step 1. Add the JitPack repository to your build file

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

>Step 2. Add the dependency 
 
```gradle
dependencies {
	        implementation 'com.github.DenisHDG:denis_teste_poc:Tag'
	     }
```
