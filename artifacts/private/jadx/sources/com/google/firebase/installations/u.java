package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123310c = ":";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static u f123312e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d9.a f123313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f123309b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f123311d = Pattern.compile("\\AA[\\w-]{38}\\z");

    private u(d9.a aVar) {
        this.f123313a = aVar;
    }

    public static u c() {
        return d(d9.b.a());
    }

    public static u d(d9.a aVar) {
        if (f123312e == null) {
            f123312e = new u(aVar);
        }
        return f123312e;
    }

    static boolean g(@p0 String str) {
        return f123311d.matcher(str).matches();
    }

    static boolean h(@p0 String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f123313a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull com.google.firebase.installations.local.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f123309b;
    }
}
