package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.g({1000})
@Deprecated
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new k3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", getter = "getOperation", id = 1)
    private final int f108241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getLocationRequest", id = 2)
    @androidx.annotation.p0
    private final zzeg f108242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getLocationListenerAsBinder", id = 3, type = "android.os.IBinder")
    @androidx.annotation.p0
    private final com.google.android.gms.location.m1 f108243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getLocationCallbackAsBinder", id = 5, type = "android.os.IBinder")
    @androidx.annotation.p0
    private final com.google.android.gms.location.j1 f108244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getPendingIntent", id = 4)
    @androidx.annotation.p0
    private final PendingIntent f108245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getFusedLocationProviderCallbackAsBinder", id = 6, type = "android.os.IBinder")
    @androidx.annotation.p0
    private final m4 f108246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getListenerId", id = 8)
    @androidx.annotation.p0
    private final String f108247g;

    @SafeParcelable.b
    zzei(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 zzeg zzegVar, @SafeParcelable.e(id = 3) @androidx.annotation.p0 IBinder iBinder, @SafeParcelable.e(id = 5) @androidx.annotation.p0 IBinder iBinder2, @SafeParcelable.e(id = 4) @androidx.annotation.p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 6) @androidx.annotation.p0 IBinder iBinder3, @SafeParcelable.e(id = 8) @androidx.annotation.p0 String str) {
        this.f108241a = i10;
        this.f108242b = zzegVar;
        m4 k4Var = null;
        this.f108243c = iBinder != null ? com.google.android.gms.location.l1.k(iBinder) : null;
        this.f108245e = pendingIntent;
        this.f108244d = iBinder2 != null ? com.google.android.gms.location.i1.k(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            k4Var = iInterfaceQueryLocalInterface instanceof m4 ? (m4) iInterfaceQueryLocalInterface : new k4(iBinder3);
        }
        this.f108246f = k4Var;
        this.f108247g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f108241a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.S(parcel, 2, this.f108242b, i10, false);
        com.google.android.gms.location.m1 m1Var = this.f108243c;
        i6.b.B(parcel, 3, m1Var == null ? null : m1Var.asBinder(), false);
        i6.b.S(parcel, 4, this.f108245e, i10, false);
        com.google.android.gms.location.j1 j1Var = this.f108244d;
        i6.b.B(parcel, 5, j1Var == null ? null : j1Var.asBinder(), false);
        m4 m4Var = this.f108246f;
        i6.b.B(parcel, 6, m4Var != null ? m4Var.asBinder() : null, false);
        i6.b.Y(parcel, 8, this.f108247g, false);
        i6.b.b(parcel, iA);
    }
}
