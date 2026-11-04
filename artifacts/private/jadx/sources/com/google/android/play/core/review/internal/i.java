package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.p0;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114947a;

    public i(String str) {
        this.f114947a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String e(String str, String str2, @p0 Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.f114947a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int b(Throwable th2, String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.f114947a, str, objArr), th2);
        }
        return 0;
    }

    public final int c(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", e(this.f114947a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", e(this.f114947a, str, objArr));
        }
        return 0;
    }
}
