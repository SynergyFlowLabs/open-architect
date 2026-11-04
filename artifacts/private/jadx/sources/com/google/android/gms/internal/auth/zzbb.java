package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UserChallengeRequestCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f107919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f107920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final PendingIntent f107921c;

    @SafeParcelable.b
    zzbb(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) PendingIntent pendingIntent) {
        this.f107919a = 1;
        this.f107920b = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107921c = (PendingIntent) com.google.android.gms.common.internal.w.r(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f107919a);
        i6.b.Y(parcel, 2, this.f107920b, false);
        i6.b.S(parcel, 3, this.f107921c, i10, false);
        i6.b.b(parcel, iA);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
