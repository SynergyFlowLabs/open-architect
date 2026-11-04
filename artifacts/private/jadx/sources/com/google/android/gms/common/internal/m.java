package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106607b;

    @g6.a
    public m(@NonNull String str) {
        this(str, null);
    }

    private final String r(String str) {
        String str2 = this.f106607b;
        return str2 == null ? str : str2.concat(str);
    }

    private final String s(String str, Object... objArr) {
        String str2 = this.f106607b;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    @g6.a
    public boolean a(int i10) {
        return Log.isLoggable(this.f106606a, i10);
    }

    @g6.a
    public boolean b() {
        return false;
    }

    @g6.a
    public void c(@NonNull String str, @NonNull String str2) {
        if (a(3)) {
            r(str2);
        }
    }

    @g6.a
    public void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(3)) {
            r(str2);
        }
    }

    @g6.a
    public void e(@NonNull String str, @NonNull String str2) {
        if (a(6)) {
            r(str2);
        }
    }

    @g6.a
    public void f(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(6)) {
            r(str2);
        }
    }

    @g6.a
    public void g(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a(6)) {
            s(str2, objArr);
        }
    }

    @g6.a
    public void h(@NonNull String str, @NonNull String str2) {
        if (a(4)) {
            r(str2);
        }
    }

    @g6.a
    public void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(4)) {
            r(str2);
        }
    }

    @g6.a
    public void j(@NonNull String str, @NonNull String str2) {
    }

    @g6.a
    public void k(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    @g6.a
    public void l(@NonNull String str, @NonNull String str2) {
        if (a(2)) {
            r(str2);
        }
    }

    @g6.a
    public void m(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(2)) {
            r(str2);
        }
    }

    @g6.a
    public void n(@NonNull String str, @NonNull String str2) {
        if (a(5)) {
            r(str2);
        }
    }

    @g6.a
    public void o(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(5)) {
            r(str2);
        }
    }

    @g6.a
    public void p(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a(5)) {
            s(str2, objArr);
        }
    }

    @g6.a
    public void q(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (a(7)) {
            r(str2);
            Log.wtf(str, r(str2), th2);
        }
    }

    @g6.a
    public m(@NonNull String str, @androidx.annotation.p0 String str2) {
        w.s(str, "log tag cannot be null");
        w.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f106606a = str;
        this.f106607b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
