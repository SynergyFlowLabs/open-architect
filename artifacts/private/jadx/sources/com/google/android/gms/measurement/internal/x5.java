package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f110664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f110665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Bundle f110667d;

    public x5(@NonNull String str, @NonNull String str2, @androidx.annotation.p0 Bundle bundle, long j10) {
        this.f110664a = str;
        this.f110665b = str2;
        this.f110667d = bundle;
        this.f110666c = j10;
    }

    public static x5 a(zzbg zzbgVar) {
        return new x5(zzbgVar.f110858a, zzbgVar.f110860c, zzbgVar.f110859b.n2(), zzbgVar.f110861d);
    }

    public final zzbg b() {
        return new zzbg(this.f110664a, new zzbe(new Bundle(this.f110667d)), this.f110665b, this.f110666c);
    }

    public final String toString() {
        String str = this.f110665b;
        String string = this.f110667d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f110664a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
