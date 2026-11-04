package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PlatformIdentifierUtilKt {

    @NotNull
    public static final String ANDROID_HEADER = "intercom-android-sdk";

    @NotNull
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";

    @NotNull
    public static final String CORDOVA_VERSION = "cordova_version";

    @NotNull
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";

    @NotNull
    public static final String NATIVE_SDK = "intercom-sdk-native";

    @NotNull
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";

    @NotNull
    public static final String REACT_NATIVE_VERSION = "react_native_version";

    @NotNull
    public static final String WRAPPER_PREFS = "intercomsdk_wrapper_prefs";

    private static final Platform getPlatform(Context context) {
        String string = context.getSharedPreferences(WRAPPER_PREFS, 0).getString(CORDOVA_VERSION, "");
        String str = isReactNativeApp() ? REACT_NATIVE_HEADER : "";
        String str2 = isFlutterApp() ? FLUTTER_HEADER : "";
        if (!Intrinsics.areEqual(string, "")) {
            return Platform.Cordova;
        }
        if (Intrinsics.areEqual(str, "")) {
            return !Intrinsics.areEqual(str2, "") ? Platform.Flutter : Platform.Native;
        }
        return Platform.ReactNative;
    }

    @NotNull
    public static final String getPlatformIdentifier(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getPlatform(context).getIdentifier();
    }

    private static final boolean isFlutterApp() {
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean isReactNativeApp() {
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
