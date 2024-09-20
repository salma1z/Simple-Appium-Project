

https://github.com/user-attachments/assets/e4fbc229-4999-40bf-b5f7-07a72a0e2075
# Installing appium with Node.js
Step 1 : Check if node.js is installed on your system    node --version    npm --version
Step 2 : Download node.js installer    https://nodejs.org/en/download/
Step 3 : Run the installer & install node.js & npm
Step 4 : Check if node.js & npm are installed
    node --version    npm --version
    where node
    where npm
Step 5 : Install appium with node.js
    npm install -g appium
Step 6 : Check if appium is installed
    appium -v
    where appium
Step 7 : Start appium
    appium
# Installing appium with APPIUM DESKTOP CLIENT
Step 1 : Download appium desktop client
   http://appium.io/
   https://github.com/appium/appium-desk...
Step 2 : Install appium desktop client
Step 3 : Start appium through appium desktop client
To check appium installation & dependencies
Install appium-doctor
https://github.com/appium/appium-doctor
npm install appium-doctor -g
appium-doctor -h
appium-doctor --android
#  install appium with node.js
Step 1 : Check if node is installed on your system
    node -v
Step 2 : Install node.js
    https://nodejs.org/en/download/
    https://brew.sh/
    brew install node
Step 3 : Check if node is installed
    node -v
    npm -v
Step 4 : Install appium
    npm install -g appium
Step 5 : Check appium is installed
    appium -v
Step 6 : Start appium
    appium
# Installing appium with appium desktop client
Step 1 : Download appium desktop client - http://appium.io/
   https://github.com/appium/appium-desktop
Step 2 : Double click on the .dmg file to install appium desktop client
Step 3 : Start appium desktop client
Appium-Doctor
https://www.npmjs.com/package/appium-...
https://github.com/appium/appium-doctor
npm install appium-doctor -g
# Dependencies needed
     java-client 9.2.2
    selenium-server-standalone 
    selenium-remote-driver 
    selenium-android-driver
# Appium Inspector to Identify Elements
1-Appium Inspector download & install
2-Configure Appium Inspector
Appium Inspector
Go to or Open Appium Inspector
Remote host: localhost
Port: 4723
Path: /wd/hub
Allow Unauthorized Certificates
3-Set DesiredCapabilities
        caps.setCapability("deviceName", "Android");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.google.android.dialer");
        caps.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
        caps.setCapability("noReset","true");
        
Disable Permission Monitoring
Go to developer option.
Go to last option called --> Disable Permission Monitoring --> enable it.

