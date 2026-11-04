package com.google.android.play.core.appupdate.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.p0;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114852a;

    public s(String str) {
        this.f114852a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String f(String str, String str2, @p0 Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f114852a, str, objArr));
        }
        return 0;
    }

    public final int b(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f114852a, str, objArr));
        }
        return 0;
    }

    public final int c(Throwable th2, String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f114852a, str, objArr), th2);
        }
        return 0;
    }

    public final int d(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f114852a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f114852a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
