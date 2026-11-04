package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationReceiverCreator")
@SafeParcelable.g({5})
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new i3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getType", id = 1)
    private final int f108235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getOldBinderReceiver", id = 2)
    @androidx.annotation.p0
    private final IBinder f108236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBinderReceiver", id = 3)
    @androidx.annotation.p0
    private final IBinder f108237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntentReceiver", id = 4)
    @androidx.annotation.p0
    private final PendingIntent f108238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getListenerId", id = 6)
    @androidx.annotation.p0
    private final String f108239e;

    @SafeParcelable.b
    zzee(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 IBinder iBinder, @SafeParcelable.e(id = 3) @androidx.annotation.p0 IBinder iBinder2, @SafeParcelable.e(id = 4) @androidx.annotation.p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 6) @androidx.annotation.p0 String str) {
        this.f108235a = i10;
        this.f108236b = iBinder;
        this.f108237c = iBinder2;
        this.f108238d = pendingIntent;
        this.f108239e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.m1] */
    public static zzee O1(@androidx.annotation.p0 IInterface iInterface, com.google.android.gms.location.m1 m1Var, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(1, iInterface, m1Var, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.j1] */
    public static zzee T1(@androidx.annotation.p0 IInterface iInterface, com.google.android.gms.location.j1 j1Var, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(2, iInterface, j1Var, null, str);
    }

    public static zzee b2(PendingIntent pendingIntent) {
        return new zzee(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzee e2(u4 u4Var) {
        return new zzee(4, null, u4Var, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f108235a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        boolean z10 = true | false;
        i6.b.B(parcel, 2, this.f108236b, false);
        i6.b.B(parcel, 3, this.f108237c, false);
        i6.b.S(parcel, 4, this.f108238d, i10, false);
        i6.b.Y(parcel, 6, this.f108239e, false);
        i6.b.b(parcel, iA);
    }
}
