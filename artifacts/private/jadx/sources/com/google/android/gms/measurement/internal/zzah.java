package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConditionalUserPropertyParcelCreator")
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    @androidx.annotation.p0
    public String f110845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public String f110846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    public zzpl f110847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    public long f110848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 6)
    public boolean f110849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 7)
    @androidx.annotation.p0
    public String f110850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    public final zzbg f110851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(id = 9)
    public long f110852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(id = 10)
    @androidx.annotation.p0
    public zzbg f110853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(id = 11)
    public final long f110854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(id = 12)
    @androidx.annotation.p0
    public final zzbg f110855k;

    zzah(zzah zzahVar) {
        com.google.android.gms.common.internal.w.r(zzahVar);
        this.f110845a = zzahVar.f110845a;
        this.f110846b = zzahVar.f110846b;
        this.f110847c = zzahVar.f110847c;
        this.f110848d = zzahVar.f110848d;
        this.f110849e = zzahVar.f110849e;
        this.f110850f = zzahVar.f110850f;
        this.f110851g = zzahVar.f110851g;
        this.f110852h = zzahVar.f110852h;
        this.f110853i = zzahVar.f110853i;
        this.f110854j = zzahVar.f110854j;
        this.f110855k = zzahVar.f110855k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, this.f110845a, false);
        i6.b.Y(parcel, 3, this.f110846b, false);
        i6.b.S(parcel, 4, this.f110847c, i10, false);
        i6.b.K(parcel, 5, this.f110848d);
        i6.b.g(parcel, 6, this.f110849e);
        i6.b.Y(parcel, 7, this.f110850f, false);
        i6.b.S(parcel, 8, this.f110851g, i10, false);
        i6.b.K(parcel, 9, this.f110852h);
        i6.b.S(parcel, 10, this.f110853i, i10, false);
        i6.b.K(parcel, 11, this.f110854j);
        i6.b.S(parcel, 12, this.f110855k, i10, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzah(@SafeParcelable.e(id = 2) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 3) String str2, @SafeParcelable.e(id = 4) zzpl zzplVar, @SafeParcelable.e(id = 5) long j10, @SafeParcelable.e(id = 6) boolean z10, @SafeParcelable.e(id = 7) @androidx.annotation.p0 String str3, @SafeParcelable.e(id = 8) @androidx.annotation.p0 zzbg zzbgVar, @SafeParcelable.e(id = 9) long j11, @SafeParcelable.e(id = 10) @androidx.annotation.p0 zzbg zzbgVar2, @SafeParcelable.e(id = 11) long j12, @SafeParcelable.e(id = 12) @androidx.annotation.p0 zzbg zzbgVar3) {
        this.f110845a = str;
        this.f110846b = str2;
        this.f110847c = zzplVar;
        this.f110848d = j10;
        this.f110849e = z10;
        this.f110850f = str3;
        this.f110851g = zzbgVar;
        this.f110852h = j11;
        this.f110853i = zzbgVar2;
        this.f110854j = j12;
        this.f110855k = zzbgVar3;
    }
}
