package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "EventParcelCreator")
@SafeParcelable.g({1})
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f110858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final zzbe f110859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    public final String f110860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    public final long f110861d;

    zzbg(zzbg zzbgVar, long j10) {
        com.google.android.gms.common.internal.w.r(zzbgVar);
        this.f110858a = zzbgVar.f110858a;
        this.f110859b = zzbgVar.f110859b;
        this.f110860c = zzbgVar.f110860c;
        this.f110861d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f110859b);
        String str = this.f110860c;
        int length = String.valueOf(str).length();
        String str2 = this.f110858a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.a(this, parcel, i10);
    }

    @SafeParcelable.b
    public zzbg(@SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) zzbe zzbeVar, @SafeParcelable.e(id = 4) String str2, @SafeParcelable.e(id = 5) long j10) {
        this.f110858a = str;
        this.f110859b = zzbeVar;
        this.f110860c = str2;
        this.f110861d = j10;
    }
}
