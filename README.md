FBv4.0 Login Example
<p>On A Real Device</p>
![testgif](https://cloud.githubusercontent.com/assets/5139030/6852824/159f8bfc-d40d-11e4-91f4-ea76db5dc7fd.gif)

This currently hasn't been tested on an emulator yet because of 2 reasons
<ol>
<li>If the Facebook App is not installed on the emulator, the <i>Profile.getProfile()</i> returns null</li>
<li>The Facebook App gives an error INSTALL_FAILED_NO_MATCHING_ABIS if you try to install the Facebook App on Genymotion</li>
</ol>
<p>Any fixes and suggestions are welcome and most of all, <b>don't forget to add your app id in res/fb_app_id.xml</b></p>

<p>To generate hash key, no need to use keytool or OpenSSL, open your Application class, call the getHashKey() method once in your onCreate() inside the Application, open your Logcat, copy the hashkey and paste it by going first to Facebook developers console/My Apps/Take any app of yours here and go to its Settings/Add a platform Android if you haven't already done so and paste your hash in the 'Key Hashes' section </p>



