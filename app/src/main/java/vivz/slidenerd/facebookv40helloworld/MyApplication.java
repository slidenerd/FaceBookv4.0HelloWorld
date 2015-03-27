package vivz.slidenerd.facebookv40helloworld;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import com.facebook.FacebookSdk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Windows on 26-03-2015.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //hahahah
    }

    /**
     * Call this method inside onCreate once to get your hash key
     */
    public void getKeyHash() {
        try {
            PackageInfo info = getPackageManager().getPackageInfo("vivz.slidenerd.facebookv40helloworld", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.e("MY KEY HASH:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }
}
