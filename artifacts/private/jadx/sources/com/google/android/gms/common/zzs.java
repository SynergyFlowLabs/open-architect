package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    private final String f106998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 2)
    private final boolean f106999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean f107000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context f107001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsChimeraPackage", id = 5)
    private final boolean f107002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIncludeHashesInErrorMessage", id = 6)
    private final boolean f107003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.h
    @SafeParcelable.c(getter = "getClientSourceStampRequest", id = 7)
    private final zzr f107004g;

    @SafeParcelable.b
    zzs(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) IBinder iBinder, @SafeParcelable.e(id = 5) boolean z12, @SafeParcelable.e(id = 6) boolean z13, @SafeParcelable.e(id = 7) @fj.h zzr zzrVar) {
        this.f106998a = str;
        this.f106999b = z10;
        this.f107000c = z11;
        this.f107001d = (Context) com.google.android.gms.dynamic.f.n(com.google.android.gms.dynamic.d.a.k(iBinder));
        this.f107002e = z12;
        this.f107003f = z13;
        this.f107004g = zzrVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.d] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f106998a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, str, false);
        i6.b.g(parcel, 2, this.f106999b);
        i6.b.g(parcel, 3, this.f107000c);
        i6.b.B(parcel, 4, com.google.android.gms.dynamic.f.p(this.f107001d), false);
        i6.b.g(parcel, 5, this.f107002e);
        i6.b.g(parcel, 6, this.f107003f);
        i6.b.S(parcel, 7, this.f107004g, i10, false);
        i6.b.b(parcel, iA);
    }
}
