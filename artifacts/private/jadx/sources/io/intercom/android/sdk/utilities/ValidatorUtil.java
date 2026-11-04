package io.intercom.android.sdk.utilities;

import android.app.Application;
import androidx.annotation.p0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: loaded from: classes13.dex */
public class ValidatorUtil {
    private static final String API_PREFIX = "android_sdk-";
    private static final Twig twig = LumberMill.getLogger();

    static boolean apiKeyIsMissingPrefix(@p0 String str) {
        return str == null || !str.startsWith(API_PREFIX);
    }

    static boolean apiKeyIsTooShort(@p0 String str) {
        return str == null || str.length() < 52;
    }

    private static boolean appIdIsInvalid(@p0 String str) {
        return str == null || ApiFactory.INSTANCE.removeInvalidCharacters(str).isEmpty();
    }

    public static boolean isValidAppIdParams(@p0 String str, @p0 String str2) {
        boolean z10;
        if (appIdIsInvalid(str2)) {
            twig.e("The app ID (" + str2 + ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app", new Object[0]);
            z10 = false;
        } else {
            z10 = true;
        }
        if (apiKeyIsTooShort(str)) {
            twig.e("The API key provided (" + str + ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
            z10 = false;
        }
        if (!apiKeyIsMissingPrefix(str)) {
            return z10;
        }
        twig.e("The API key provided (" + str + ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
        return false;
    }

    public static boolean isValidConstructorParams(@p0 Application application, @p0 String str, @p0 String str2) {
        boolean z10;
        if (application == null) {
            twig.e("The Application passed in was null.We need an Application to enable Intercom in your app", new Object[0]);
            z10 = false;
        } else {
            z10 = true;
        }
        if (appIdIsInvalid(str2)) {
            twig.e("The app ID (" + str2 + ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app", new Object[0]);
            z10 = false;
        }
        if (apiKeyIsTooShort(str)) {
            twig.e("The API key provided (" + str + ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
            z10 = false;
        }
        if (!apiKeyIsMissingPrefix(str)) {
            return z10;
        }
        twig.e("The API key provided (" + str + ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
        return false;
    }
}
