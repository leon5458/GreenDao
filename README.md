# GreenDao

### 现在版本是3.2.2,配置方法
### 1 在项目下的build.gradle 中引入
    repositories {
          google()
          jcenter()
          mavenCentral() // add repository
      }
      dependencies {
          classpath 'com.android.tools.build:gradle:3.2.1'
          classpath 'org.greenrobot:greendao-gradle-plugin:3.2.2' // add plugin

### 2 在app 现在的build.gradle 中
   apply plugin: 'org.greenrobot.greendao'
   然后在导入库
  implementation 'org.greenrobot:greendao:3.2.2'


