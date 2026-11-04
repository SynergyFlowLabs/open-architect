package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceMetaDataCreator")
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "isLockScreenSolved", id = 2)
    private final boolean f105085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMinAgeOfLockScreen", id = 3)
    private final long f105086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isChallengeAllowed", id = 4)
    private final boolean f105087d;

    @SafeParcelable.b
    DeviceMetaData(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 4) boolean z11) {
        this.f105084a = i10;
        this.f105085b = z10;
        this.f105086c = j10;
        this.f105087d = z11;
    }

    public long O1() {
        return this.f105086c;
    }

    public boolean T1() {
        return this.f105087d;
    }

    public boolean b2() {
        return this.f105085b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105084a);
        i6.b.g(parcel, 2, b2());
        i6.b.K(parcel, 3, O1());
        i6.b.g(parcel, 4, T1());
        i6.b.b(parcel, iA);
    }
}
