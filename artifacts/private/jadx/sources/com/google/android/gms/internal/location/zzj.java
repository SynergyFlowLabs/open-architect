package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new g4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    final int f108265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, id = 2)
    @androidx.annotation.p0
    final zzh f108266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    @androidx.annotation.p0
    final com.google.android.gms.location.g1 f108267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    @androidx.annotation.p0
    final m4 f108268d;

    @SafeParcelable.b
    zzj(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 zzh zzhVar, @SafeParcelable.e(id = 3) IBinder iBinder, @SafeParcelable.e(id = 4) @androidx.annotation.p0 IBinder iBinder2) {
        this.f108265a = i10;
        this.f108266b = zzhVar;
        m4 k4Var = null;
        this.f108267c = iBinder == null ? null : com.google.android.gms.location.f1.k(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            k4Var = iInterfaceQueryLocalInterface instanceof m4 ? (m4) iInterfaceQueryLocalInterface : new k4(iBinder2);
        }
        this.f108268d = k4Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f108265a);
        i6.b.S(parcel, 2, this.f108266b, i10, false);
        com.google.android.gms.location.g1 g1Var = this.f108267c;
        IBinder iBinderAsBinder = null;
        i6.b.B(parcel, 3, g1Var == null ? null : g1Var.asBinder(), false);
        m4 m4Var = this.f108268d;
        if (m4Var != null) {
            iBinderAsBinder = m4Var.asBinder();
        }
        i6.b.B(parcel, 4, iBinderAsBinder, false);
        i6.b.b(parcel, iA);
    }
}
