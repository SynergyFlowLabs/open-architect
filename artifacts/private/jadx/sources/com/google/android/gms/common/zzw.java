package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.p2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleCertificatesQueryCreator")
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    private final String f107011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    @SafeParcelable.c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final x0 f107012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 3)
    private final boolean f107013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean f107014d;

    zzw(String str, @fj.h x0 x0Var, boolean z10, boolean z11) {
        this.f107011a = str;
        this.f107012b = x0Var;
        this.f107013c = z10;
        this.f107014d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f107011a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, str, false);
        x0 x0Var = this.f107012b;
        if (x0Var == null) {
            x0Var = null;
            int i11 = 3 & 0;
        }
        i6.b.B(parcel, 2, x0Var, false);
        i6.b.g(parcel, 3, this.f107013c);
        i6.b.g(parcel, 4, this.f107014d);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzw(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) @fj.h IBinder iBinder, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) boolean z11) {
        this.f107011a = str;
        y0 y0Var = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.d dVarM = p2.k(iBinder).m();
                byte[] bArr = dVarM == null ? null : (byte[]) com.google.android.gms.dynamic.f.n(dVarM);
                if (bArr != null) {
                    y0Var = new y0(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f107012b = y0Var;
        this.f107013c = z10;
        this.f107014d = z11;
    }
}
