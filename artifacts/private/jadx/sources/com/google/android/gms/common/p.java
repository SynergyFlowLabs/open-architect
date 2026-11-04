package com.google.android.gms.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private final String f106802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private final Throwable f106803d;

    private p(String str, int i10, boolean z10, @fj.h String str2, @fj.h Throwable th2) {
        this.f106800a = str;
        this.f106801b = z10;
        this.f106802c = str2;
        this.f106803d = th2;
    }

    @NonNull
    public static p a(@NonNull String str, @NonNull String str2, @fj.h Throwable th2) {
        return new p(str, 1, false, str2, th2);
    }

    @NonNull
    public static p d(@NonNull String str, int i10) {
        return new p(str, i10, true, null, null);
    }

    public final void b() {
        if (this.f106801b) {
            return;
        }
        String str = this.f106802c;
        Throwable th2 = this.f106803d;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th2 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th2);
    }

    public final boolean c() {
        return this.f106801b;
    }
}
