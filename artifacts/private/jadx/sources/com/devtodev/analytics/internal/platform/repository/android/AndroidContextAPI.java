package com.devtodev.analytics.internal.platform.repository.android;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.d;
import com.devtodev.analytics.internal.platform.repository.utils.Odin;
import e.a;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidContextAPI {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEFAULT_ANDROID_ID = "";

    @NotNull
    private static final String DEFAULT_MAC_ADDRESS = "";

    @NotNull
    private static final String DEFAULT_USER_AGENT = "";

    @NotNull
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidContextAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Resolution getFullResolution(WindowManager windowManager) {
        if (Build.VERSION.SDK_INT < 30) {
            return new Resolution(1, 1);
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "windowManager.currentWindowMetrics");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "metrics.windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsets.Type.captionBar() & WindowInsets.Type.displayCutout() & WindowInsets.Type.ime() & WindowInsets.Type.mandatorySystemGestures() & WindowInsets.Type.navigationBars() & WindowInsets.Type.statusBars() & WindowInsets.Type.systemBars() & WindowInsets.Type.systemGestures() & WindowInsets.Type.tappableElement());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(\n…leElement()\n            )");
        int i10 = insets.right + insets.left;
        int i11 = insets.top + insets.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "metrics.bounds");
        return new Resolution(bounds.width() - i10, bounds.height() - i11);
    }

    private final Point getRealScreenResolution(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    private final boolean permissionAccessWiFiStateGranted() {
        return d.a(this.context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    @a({"HardwareIds"})
    @NotNull
    public final String getAndroidId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    @NotNull
    public final String getLocale() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @a({"HardwareIds", "MissingPermission"})
    @NotNull
    public final String getMacAddress() {
        WifiManager wifiManager;
        if (permissionAccessWiFiStateGranted() && (wifiManager = (WifiManager) this.context.getApplicationContext().getSystemService(com.segment.analytics.kotlin.android.plugins.a.f266549p2)) != null) {
            try {
                String macAddress = wifiManager.getConnectionInfo().getMacAddress();
                if (macAddress == null) {
                    return "";
                }
                Intrinsics.checkNotNullExpressionValue(macAddress, "it.connectionInfo.macAdd…ss ?: DEFAULT_MAC_ADDRESS");
                return macAddress;
            } catch (RemoteException unused) {
            }
        }
        return "";
    }

    public final float getMetricsDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    public final double getMetricsXDPI() {
        return this.context.getResources().getDisplayMetrics().xdpi;
    }

    public final double getMetricsYDPI() {
        return this.context.getResources().getDisplayMetrics().ydpi;
    }

    @NotNull
    public final String getODIN() {
        String odin1 = Odin.getODIN1(getAndroidId());
        Intrinsics.checkNotNullExpressionValue(odin1, "getODIN1(getAndroidId())");
        return odin1;
    }

    @NotNull
    public final String getUserAgent() {
        try {
            String property = System.getProperty("http.agent");
            return property == null ? "" : property;
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return "";
        }
    }

    @NotNull
    public final Resolution getWindowServiceScreenResolution() {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        if (windowManager == null) {
            return new Resolution(1, 1);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return getFullResolution(windowManager);
        }
        windowManager.getDefaultDisplay().getRealSize(point);
        return new Resolution(point.x, point.y);
    }

    public final boolean hasSensorHingeAngle() {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0102 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0113 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0122 A[Catch: Exception -> 0x013d, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[Catch: Exception -> 0x013d, TRY_LEAVE, TryCatch #0 {Exception -> 0x013d, blocks: (B:3:0x000c, B:6:0x0022, B:8:0x002e, B:11:0x0042, B:13:0x004c, B:15:0x0057, B:17:0x0063, B:19:0x0071, B:21:0x007f, B:23:0x0088, B:25:0x0094, B:27:0x00a1, B:29:0x00ad, B:31:0x00bb, B:33:0x00c7, B:35:0x00d4, B:37:0x00e0, B:39:0x00eb, B:41:0x00f3, B:43:0x0102, B:45:0x0113, B:47:0x0122, B:49:0x0130), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a A[RETURN] */
    public final boolean isSimulator() {
        String FINGERPRINT;
        String MODEL;
        String HOST;
        String BRAND;
        String DEVICE;
        String PRODUCT;
        String MODEL2;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            if (Intrinsics.areEqual(MANUFACTURER, "Google") && Intrinsics.areEqual(Build.BRAND, "google")) {
                String FINGERPRINT2 = Build.FINGERPRINT;
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                if (StringsKt.u2(FINGERPRINT2, "google/sdk_gphone_", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                    if (StringsKt.M1(FINGERPRINT2, ":user/release-keys", false, 2, null)) {
                        String PRODUCT2 = Build.PRODUCT;
                        Intrinsics.checkNotNullExpressionValue(PRODUCT2, "PRODUCT");
                        if (StringsKt.u2(PRODUCT2, "sdk_gphone_", false, 2, null)) {
                            String MODEL3 = Build.MODEL;
                            Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                            if (!StringsKt.u2(MODEL3, "sdk_gphone_", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                if (StringsKt.u2(FINGERPRINT2, "google/sdk_gphone64_", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                    if (StringsKt.M1(FINGERPRINT2, ":userdebug/dev-keys", false, 2, null)) {
                                        PRODUCT = Build.PRODUCT;
                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                        if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                            MODEL2 = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                            if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                                FINGERPRINT = Build.FINGERPRINT;
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                        MODEL = Build.MODEL;
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                        HOST = Build.HOST;
                                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                            BRAND = Build.BRAND;
                                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                                DEVICE = Build.DEVICE;
                                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            FINGERPRINT = Build.FINGERPRINT;
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                    MODEL = Build.MODEL;
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                    HOST = Build.HOST;
                                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                        BRAND = Build.BRAND;
                                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                            DEVICE = Build.DEVICE;
                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                        if (StringsKt.M1(FINGERPRINT2, ":user/release-keys", false, 2, null)) {
                                            PRODUCT = Build.PRODUCT;
                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                            if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                                MODEL2 = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                                if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                                    FINGERPRINT = Build.FINGERPRINT;
                                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                            MODEL = Build.MODEL;
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                            HOST = Build.HOST;
                                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                                BRAND = Build.BRAND;
                                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                                    DEVICE = Build.DEVICE;
                                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                            return false;
                                                                                        }
                                                                                    }
                                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                FINGERPRINT = Build.FINGERPRINT;
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                        MODEL = Build.MODEL;
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                        HOST = Build.HOST;
                                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                            BRAND = Build.BRAND;
                                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                                DEVICE = Build.DEVICE;
                                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            FINGERPRINT = Build.FINGERPRINT;
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                    MODEL = Build.MODEL;
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                    HOST = Build.HOST;
                                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                        BRAND = Build.BRAND;
                                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                            DEVICE = Build.DEVICE;
                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    FINGERPRINT = Build.FINGERPRINT;
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                            MODEL = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                            HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                BRAND = Build.BRAND;
                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                    DEVICE = Build.DEVICE;
                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                            if (StringsKt.u2(FINGERPRINT2, "google/sdk_gphone64_", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                if (StringsKt.M1(FINGERPRINT2, ":userdebug/dev-keys", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                    if (StringsKt.M1(FINGERPRINT2, ":user/release-keys", false, 2, null)) {
                                        PRODUCT = Build.PRODUCT;
                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                        if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                            MODEL2 = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                            if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                                FINGERPRINT = Build.FINGERPRINT;
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                        MODEL = Build.MODEL;
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                        HOST = Build.HOST;
                                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                            BRAND = Build.BRAND;
                                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                                DEVICE = Build.DEVICE;
                                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            FINGERPRINT = Build.FINGERPRINT;
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                    MODEL = Build.MODEL;
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                    HOST = Build.HOST;
                                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                        BRAND = Build.BRAND;
                                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                            DEVICE = Build.DEVICE;
                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                MODEL = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                HOST = Build.HOST;
                                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                    BRAND = Build.BRAND;
                                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                        DEVICE = Build.DEVICE;
                                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    PRODUCT = Build.PRODUCT;
                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                    if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                        MODEL2 = Build.MODEL;
                                        Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                        if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                            FINGERPRINT = Build.FINGERPRINT;
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                    MODEL = Build.MODEL;
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                    HOST = Build.HOST;
                                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                        BRAND = Build.BRAND;
                                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                            DEVICE = Build.DEVICE;
                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                MODEL = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                HOST = Build.HOST;
                                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                    BRAND = Build.BRAND;
                                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                        DEVICE = Build.DEVICE;
                                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                FINGERPRINT = Build.FINGERPRINT;
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                        MODEL = Build.MODEL;
                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                        HOST = Build.HOST;
                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                            BRAND = Build.BRAND;
                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                DEVICE = Build.DEVICE;
                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                        if (StringsKt.u2(FINGERPRINT2, "google/sdk_gphone64_", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                            if (StringsKt.M1(FINGERPRINT2, ":userdebug/dev-keys", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                                if (StringsKt.M1(FINGERPRINT2, ":user/release-keys", false, 2, null)) {
                                    PRODUCT = Build.PRODUCT;
                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                    if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                        MODEL2 = Build.MODEL;
                                        Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                        if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                            FINGERPRINT = Build.FINGERPRINT;
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                    MODEL = Build.MODEL;
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                    HOST = Build.HOST;
                                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                        BRAND = Build.BRAND;
                                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                            DEVICE = Build.DEVICE;
                                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                    return false;
                                                                                }
                                                                            }
                                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                MODEL = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                HOST = Build.HOST;
                                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                    BRAND = Build.BRAND;
                                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                        DEVICE = Build.DEVICE;
                                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    FINGERPRINT = Build.FINGERPRINT;
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                            MODEL = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                            HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                BRAND = Build.BRAND;
                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                    DEVICE = Build.DEVICE;
                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                PRODUCT = Build.PRODUCT;
                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                    MODEL2 = Build.MODEL;
                                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                    if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                        FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                MODEL = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                HOST = Build.HOST;
                                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                    BRAND = Build.BRAND;
                                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                        DEVICE = Build.DEVICE;
                                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    FINGERPRINT = Build.FINGERPRINT;
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                            MODEL = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                            HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                BRAND = Build.BRAND;
                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                    DEVICE = Build.DEVICE;
                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            FINGERPRINT = Build.FINGERPRINT;
                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                            if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                    MODEL = Build.MODEL;
                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                    if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                        if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                    HOST = Build.HOST;
                                                    Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                    if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                        BRAND = Build.BRAND;
                                                        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                        if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                            DEVICE = Build.DEVICE;
                                                            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                            if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                    if (StringsKt.u2(FINGERPRINT2, "google/sdk_gphone64_", false, 2, null)) {
                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                        if (StringsKt.M1(FINGERPRINT2, ":userdebug/dev-keys", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
                            if (StringsKt.M1(FINGERPRINT2, ":user/release-keys", false, 2, null)) {
                                PRODUCT = Build.PRODUCT;
                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                    MODEL2 = Build.MODEL;
                                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                    if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                        FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                                MODEL = Build.MODEL;
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                                HOST = Build.HOST;
                                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                    BRAND = Build.BRAND;
                                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                        DEVICE = Build.DEVICE;
                                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                                return false;
                                                                            }
                                                                        }
                                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    FINGERPRINT = Build.FINGERPRINT;
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                            MODEL = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                            HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                BRAND = Build.BRAND;
                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                    DEVICE = Build.DEVICE;
                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                FINGERPRINT = Build.FINGERPRINT;
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                        MODEL = Build.MODEL;
                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                        HOST = Build.HOST;
                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                            BRAND = Build.BRAND;
                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                DEVICE = Build.DEVICE;
                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            PRODUCT = Build.PRODUCT;
                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                            if (StringsKt.u2(PRODUCT, "sdk_gphone64_", false, 2, null)) {
                                MODEL2 = Build.MODEL;
                                Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                                if (!StringsKt.u2(MODEL2, "sdk_gphone64_", false, 2, null)) {
                                    FINGERPRINT = Build.FINGERPRINT;
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                            MODEL = Build.MODEL;
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                    if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                        if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                            HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                                BRAND = Build.BRAND;
                                                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                    DEVICE = Build.DEVICE;
                                                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                        if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                FINGERPRINT = Build.FINGERPRINT;
                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                        MODEL = Build.MODEL;
                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                        HOST = Build.HOST;
                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                            BRAND = Build.BRAND;
                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                                DEVICE = Build.DEVICE;
                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                        return false;
                                                                    }
                                                                }
                                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        FINGERPRINT = Build.FINGERPRINT;
                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                                MODEL = Build.MODEL;
                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                HOST = Build.HOST;
                                                Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                                    BRAND = Build.BRAND;
                                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                    if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                        DEVICE = Build.DEVICE;
                                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                        if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                            if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                                return false;
                                                            }
                                                        }
                                                    } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                FINGERPRINT = Build.FINGERPRINT;
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                    if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                        MODEL = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null) && (!Intrinsics.areEqual("QC_Reference_Phone", Build.BOARD) || StringsKt.N1("Xiaomi", MANUFACTURER, true))) {
                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                    if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                        HOST = Build.HOST;
                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                        if (!StringsKt.u2(HOST, "Build", false, 2, null)) {
                                            BRAND = Build.BRAND;
                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                            if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                                DEVICE = Build.DEVICE;
                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                                    if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                        return false;
                                                    }
                                                }
                                            } else if (Intrinsics.areEqual(Build.PRODUCT, "google_sdk")) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isTV() {
        return this.context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public final boolean isWatch() {
        try {
            String str = this.context.getPackageManager().getPackageInfo("com.google.android.wearable.app", 0).versionName;
            if (str != null && str.length() > 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
