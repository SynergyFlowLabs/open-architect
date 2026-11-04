package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    @androidx.annotation.p0
    final IBinder f106685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResult", id = 3)
    private final ConnectionResult f106686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSaveDefaultAccount", id = 4)
    private final boolean f106687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "isFromCrossClientAuth", id = 5)
    private final boolean f106688e;

    @SafeParcelable.b
    zav(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 IBinder iBinder, @SafeParcelable.e(id = 3) ConnectionResult connectionResult, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) boolean z11) {
        this.f106684a = i10;
        this.f106685b = iBinder;
        this.f106686c = connectionResult;
        this.f106687d = z10;
        this.f106688e = z11;
    }

    public final ConnectionResult O1() {
        return this.f106686c;
    }

    @androidx.annotation.p0
    public final o T1() {
        IBinder iBinder = this.f106685b;
        if (iBinder == null) {
            return null;
        }
        return o.a.k(iBinder);
    }

    public final boolean b2() {
        return this.f106687d;
    }

    public final boolean e2() {
        return this.f106688e;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f106686c.equals(zavVar.f106686c) && u.b(T1(), zavVar.T1());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f106684a);
        int i11 = 3 | 0;
        i6.b.B(parcel, 2, this.f106685b, false);
        i6.b.S(parcel, 3, this.f106686c, i10, false);
        i6.b.g(parcel, 4, this.f106687d);
        int i12 = 2 ^ 5;
        i6.b.g(parcel, 5, this.f106688e);
        i6.b.b(parcel, iA);
    }
}
