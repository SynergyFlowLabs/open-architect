package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AppMetadataCreator")
@SafeParcelable.g({1, 13, 17, 19, 20, 24, 33})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new bf();

    @SafeParcelable.c(defaultValue = "", id = 31)
    public final String H1;

    @SafeParcelable.c(defaultValue = "", id = 26)
    public final String X;

    @SafeParcelable.c(id = 27)
    @androidx.annotation.p0
    public final String Y;

    @SafeParcelable.c(defaultValue = "false", id = 28)
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    @androidx.annotation.p0
    public final String f110881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    @androidx.annotation.p0
    public final String f110882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    @androidx.annotation.p0
    public final String f110883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    @androidx.annotation.p0
    public final String f110884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 6)
    public final long f110885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 7)
    public final long f110886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    public final String f110887g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @SafeParcelable.c(id = 34)
    public final long f110888g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.internal.z0.P, id = 9)
    public final boolean f110889h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @SafeParcelable.c(id = 35)
    @androidx.annotation.p0
    public final String f110890h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(id = 10)
    public final boolean f110891i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "", id = 36)
    public final String f110892i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long f110893j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @SafeParcelable.c(id = 37)
    public final long f110894j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(id = 12)
    @androidx.annotation.p0
    public final String f110895k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @SafeParcelable.c(id = 38)
    public final int f110896k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(id = 14)
    public final long f110897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(id = 15)
    public final int f110898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.internal.z0.P, id = 16)
    public final boolean f110899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SafeParcelable.c(id = 18)
    public final boolean f110900o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @SafeParcelable.c(id = 29)
    public final long f110901p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "100", id = 30)
    public final int f110902p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @SafeParcelable.c(id = 32)
    public final int f110903p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SafeParcelable.c(id = 21)
    @androidx.annotation.p0
    public final Boolean f110904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SafeParcelable.c(id = 22)
    public final long f110905t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SafeParcelable.c(id = 23)
    @androidx.annotation.p0
    public final List f110906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "", id = 25)
    public final String f110907w;

    zzr(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, long j10, @androidx.annotation.p0 String str4, long j11, long j12, @androidx.annotation.p0 String str5, boolean z10, boolean z11, @androidx.annotation.p0 String str6, long j13, int i10, boolean z12, boolean z13, @androidx.annotation.p0 Boolean bool, long j14, @androidx.annotation.p0 List list, String str7, String str8, @androidx.annotation.p0 String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, @androidx.annotation.p0 String str11, String str12, long j17, int i13) {
        com.google.android.gms.common.internal.w.l(str);
        this.f110881a = str;
        this.f110882b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f110883c = str3;
        this.f110893j = j10;
        this.f110884d = str4;
        this.f110885e = j11;
        this.f110886f = j12;
        this.f110887g = str5;
        this.f110889h = z10;
        this.f110891i = z11;
        this.f110895k = str6;
        this.f110897l = j13;
        this.f110898m = i10;
        this.f110899n = z12;
        this.f110900o = z13;
        this.f110904s = bool;
        this.f110905t = j14;
        this.f110906v = list;
        this.f110907w = str7;
        this.X = str8;
        this.Y = str9;
        this.Z = z14;
        this.f110901p0 = j15;
        this.f110902p1 = i11;
        this.H1 = str10;
        this.f110903p2 = i12;
        this.f110888g3 = j16;
        this.f110890h3 = str11;
        this.f110892i3 = str12;
        this.f110894j3 = j17;
        this.f110896k3 = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f110881a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, str, false);
        i6.b.Y(parcel, 3, this.f110882b, false);
        i6.b.Y(parcel, 4, this.f110883c, false);
        i6.b.Y(parcel, 5, this.f110884d, false);
        i6.b.K(parcel, 6, this.f110885e);
        i6.b.K(parcel, 7, this.f110886f);
        i6.b.Y(parcel, 8, this.f110887g, false);
        i6.b.g(parcel, 9, this.f110889h);
        i6.b.g(parcel, 10, this.f110891i);
        i6.b.K(parcel, 11, this.f110893j);
        i6.b.Y(parcel, 12, this.f110895k, false);
        i6.b.K(parcel, 14, this.f110897l);
        i6.b.F(parcel, 15, this.f110898m);
        i6.b.g(parcel, 16, this.f110899n);
        i6.b.g(parcel, 18, this.f110900o);
        i6.b.j(parcel, 21, this.f110904s, false);
        i6.b.K(parcel, 22, this.f110905t);
        i6.b.a0(parcel, 23, this.f110906v, false);
        i6.b.Y(parcel, 25, this.f110907w, false);
        i6.b.Y(parcel, 26, this.X, false);
        i6.b.Y(parcel, 27, this.Y, false);
        i6.b.g(parcel, 28, this.Z);
        i6.b.K(parcel, 29, this.f110901p0);
        i6.b.F(parcel, 30, this.f110902p1);
        i6.b.Y(parcel, 31, this.H1, false);
        i6.b.F(parcel, 32, this.f110903p2);
        i6.b.K(parcel, 34, this.f110888g3);
        i6.b.Y(parcel, 35, this.f110890h3, false);
        i6.b.Y(parcel, 36, this.f110892i3, false);
        i6.b.K(parcel, 37, this.f110894j3);
        i6.b.F(parcel, 38, this.f110896k3);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzr(@SafeParcelable.e(id = 2) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 3) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str3, @SafeParcelable.e(id = 5) @androidx.annotation.p0 String str4, @SafeParcelable.e(id = 6) long j10, @SafeParcelable.e(id = 7) long j11, @SafeParcelable.e(id = 8) @androidx.annotation.p0 String str5, @SafeParcelable.e(id = 9) boolean z10, @SafeParcelable.e(id = 10) boolean z11, @SafeParcelable.e(id = 11) long j12, @SafeParcelable.e(id = 12) @androidx.annotation.p0 String str6, @SafeParcelable.e(id = 14) long j13, @SafeParcelable.e(id = 15) int i10, @SafeParcelable.e(id = 16) boolean z12, @SafeParcelable.e(id = 18) boolean z13, @SafeParcelable.e(id = 21) @androidx.annotation.p0 Boolean bool, @SafeParcelable.e(id = 22) long j14, @SafeParcelable.e(id = 23) @androidx.annotation.p0 List list, @SafeParcelable.e(id = 25) String str7, @SafeParcelable.e(id = 26) String str8, @SafeParcelable.e(id = 27) String str9, @SafeParcelable.e(id = 28) boolean z14, @SafeParcelable.e(id = 29) long j15, @SafeParcelable.e(id = 30) int i11, @SafeParcelable.e(id = 31) String str10, @SafeParcelable.e(id = 32) int i12, @SafeParcelable.e(id = 34) long j16, @SafeParcelable.e(id = 35) @androidx.annotation.p0 String str11, @SafeParcelable.e(id = 36) String str12, @SafeParcelable.e(id = 37) long j17, @SafeParcelable.e(id = 38) int i13) {
        this.f110881a = str;
        this.f110882b = str2;
        this.f110883c = str3;
        this.f110893j = j12;
        this.f110884d = str4;
        this.f110885e = j10;
        this.f110886f = j11;
        this.f110887g = str5;
        this.f110889h = z10;
        this.f110891i = z11;
        this.f110895k = str6;
        this.f110897l = j13;
        this.f110898m = i10;
        this.f110899n = z12;
        this.f110900o = z13;
        this.f110904s = bool;
        this.f110905t = j14;
        this.f110906v = list;
        this.f110907w = str7;
        this.X = str8;
        this.Y = str9;
        this.Z = z14;
        this.f110901p0 = j15;
        this.f110902p1 = i11;
        this.H1 = str10;
        this.f110903p2 = i12;
        this.f110888g3 = j16;
        this.f110890h3 = str11;
        this.f110892i3 = str12;
        this.f110894j3 = j17;
        this.f110896k3 = i13;
    }
}
