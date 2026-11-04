package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f106722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106723d;

    @g6.a
    public a(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f106721b = string;
        this.f106720a = str;
        this.f106722c = new m(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f106720a, i10)) {
            i10++;
        }
        this.f106723d = i10;
    }

    @g6.a
    public void a(@NonNull String str, @NonNull Object... objArr) {
        if (g(3)) {
            d(str, objArr);
        }
    }

    @g6.a
    public void b(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        d(str, objArr);
    }

    @g6.a
    public void c(@NonNull String str, @NonNull Object... objArr) {
        d(str, objArr);
    }

    @NonNull
    @g6.a
    protected String d(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f106721b.concat(str);
    }

    @NonNull
    @g6.a
    public String e() {
        return this.f106720a;
    }

    @g6.a
    public void f(@NonNull String str, @NonNull Object... objArr) {
        d(str, objArr);
    }

    @g6.a
    public boolean g(int i10) {
        return this.f106723d <= i10;
    }

    @g6.a
    public void h(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        if (g(2)) {
            d(str, objArr);
        }
    }

    @g6.a
    public void i(@NonNull String str, @NonNull Object... objArr) {
        if (g(2)) {
            d(str, objArr);
        }
    }

    @g6.a
    public void j(@NonNull String str, @NonNull Object... objArr) {
        d(str, objArr);
    }

    @g6.a
    public void k(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        Log.wtf(this.f106720a, d(str, objArr), th2);
    }

    @g6.a
    public void l(@NonNull Throwable th2) {
        Log.wtf(this.f106720a, th2);
    }
}
