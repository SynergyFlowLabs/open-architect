package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResult", id = 1)
    private final boolean f107005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    @SafeParcelable.c(getter = "getErrorMessage", id = 2)
    private final String f107006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusValue", id = 3)
    private final int f107007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFirstPartyStatusValue", id = 4)
    private final int f107008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = CreateTicketViewModelKt.EmailId, getter = "getTimestampMillis", id = 5)
    private final long f107009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.h
    @SafeParcelable.c(getter = "getDarkLaunchResponse", id = 6)
    private final zzu f107010f;

    @SafeParcelable.b
    zzu(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) long j10, @SafeParcelable.e(id = 6) zzu zzuVar) {
        this.f107005a = z10;
        this.f107006b = str;
        this.f107007c = f0.a(i10) - 1;
        this.f107008d = p0.a(i11) - 1;
        this.f107009e = j10;
        this.f107010f = zzuVar;
    }

    public final long O1() {
        return this.f107009e;
    }

    @fj.h
    public final zzu T1() {
        return this.f107010f;
    }

    @fj.h
    public final String b2() {
        return this.f107006b;
    }

    public final boolean e2() {
        return this.f107005a;
    }

    public final int f2() {
        return p0.a(this.f107008d);
    }

    public final int n2() {
        return f0.a(this.f107007c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.g(parcel, 1, this.f107005a);
        i6.b.Y(parcel, 2, this.f107006b, false);
        i6.b.F(parcel, 3, this.f107007c);
        i6.b.F(parcel, 4, this.f107008d);
        i6.b.K(parcel, 5, this.f107009e);
        i6.b.S(parcel, 6, this.f107010f, i10, false);
        i6.b.b(parcel, iA);
    }
}
