package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.g0;
import com.facebook.internal.e1;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f99011a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f99012b = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private g() {
    }

    @oj.n
    public static final void a() {
    }

    @oj.n
    public static final void b() {
    }

    @oj.n
    @NotNull
    public static final String c(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bytes[i10];
            i10++;
            q1 q1Var = q1.f312784a;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @oj.n
    @NotNull
    public static final String d() {
        g0 g0Var = g0.f99617a;
        Context contextN = g0.n();
        try {
            String str = contextN.getPackageManager().getPackageInfo(contextN.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @oj.n
    @Nullable
    public static final View e(@Nullable Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    @oj.n
    public static final boolean f() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!StringsKt.u2(FINGERPRINT, "generic", false, 2, null)) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (!StringsKt.u2(FINGERPRINT, "unknown", false, 2, null)) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!StringsKt.V2(MODEL, "google_sdk", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (!StringsKt.V2(MODEL, "Emulator", false, 2, null)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.V2(MODEL, "Android SDK built for x86", false, 2, null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!StringsKt.V2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                String BRAND = Build.BRAND;
                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                if (StringsKt.u2(BRAND, "generic", false, 2, null)) {
                                    String DEVICE = Build.DEVICE;
                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                    if (!StringsKt.u2(DEVICE, "generic", false, 2, null)) {
                                        if (!Intrinsics.areEqual("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                } else if (!Intrinsics.areEqual("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @oj.n
    private static final boolean g() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    @oj.n
    public static final double h(@Nullable String str) {
        try {
            Matcher matcher = Pattern.compile(f99012b, 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            String strGroup = matcher.group(0);
            e1 e1Var = e1.f99794a;
            return NumberFormat.getNumberInstance(e1.y()).parse(strGroup).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
