package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RootTelemetryConfigurationCreator")
@g6.a
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getVersion", id = 1)
    private final int f106494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f106495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f106496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBatchPeriodMillis", id = 4)
    private final int f106497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int f106498e;

    @SafeParcelable.b
    public RootTelemetryConfiguration(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12) {
        this.f106494a = i10;
        this.f106495b = z10;
        this.f106496c = z11;
        this.f106497d = i11;
        this.f106498e = i12;
    }

    @g6.a
    public int O1() {
        return this.f106497d;
    }

    @g6.a
    public int T1() {
        return this.f106498e;
    }

    @g6.a
    public boolean b2() {
        return this.f106495b;
    }

    @g6.a
    public boolean e2() {
        return this.f106496c;
    }

    @g6.a
    public int getVersion() {
        return this.f106494a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, getVersion());
        i6.b.g(parcel, 2, b2());
        i6.b.g(parcel, 3, e2());
        i6.b.F(parcel, 4, O1());
        i6.b.F(parcel, 5, T1());
        i6.b.b(parcel, iA);
    }
}
