package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.g({1000})
@com.google.android.gms.common.internal.a0
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIntervalMillis", id = 1)
    private final long f109705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTriggerUpdate", id = 2)
    private final boolean f109706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWorkSource", id = 3)
    @androidx.annotation.p0
    private final WorkSource f109707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTag", id = 4)
    @androidx.annotation.p0
    private final String f109708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getNondefaultActivities", id = 5)
    @androidx.annotation.p0
    private final int[] f109709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestSensorData", id = 6)
    private final boolean f109710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccountName", id = 7)
    @androidx.annotation.p0
    private final String f109711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", id = 8)
    private final long f109712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getContextAttributionTag", id = 9)
    @androidx.annotation.p0
    private String f109713i;

    @SafeParcelable.b
    zzb(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) @androidx.annotation.p0 WorkSource workSource, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 5) @androidx.annotation.p0 int[] iArr, @SafeParcelable.e(id = 6) boolean z11, @SafeParcelable.e(id = 7) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 8) long j11, @SafeParcelable.e(id = 9) @androidx.annotation.p0 String str3) {
        this.f109705a = j10;
        this.f109706b = z10;
        this.f109707c = workSource;
        this.f109708d = str;
        this.f109709e = iArr;
        this.f109710f = z11;
        this.f109711g = str2;
        this.f109712h = j11;
        this.f109713i = str3;
    }

    public final zzb O1(@androidx.annotation.p0 String str) {
        this.f109713i = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, this.f109705a);
        int i11 = 2 & 2;
        i6.b.g(parcel, 2, this.f109706b);
        i6.b.S(parcel, 3, this.f109707c, i10, false);
        int i12 = 7 << 4;
        i6.b.Y(parcel, 4, this.f109708d, false);
        i6.b.G(parcel, 5, this.f109709e, false);
        int i13 = 0 ^ 6;
        i6.b.g(parcel, 6, this.f109710f);
        i6.b.Y(parcel, 7, this.f109711g, false);
        i6.b.K(parcel, 8, this.f109712h);
        i6.b.Y(parcel, 9, this.f109713i, false);
        i6.b.b(parcel, iA);
    }
}
