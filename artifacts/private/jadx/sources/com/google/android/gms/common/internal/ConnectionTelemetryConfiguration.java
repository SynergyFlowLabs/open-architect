package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ConnectionTelemetryConfigurationCreator")
@g6.a
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new d2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRootTelemetryConfiguration", id = 1)
    private final RootTelemetryConfiguration f106461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f106462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f106463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    @androidx.annotation.p0
    private final int[] f106464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int f106465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    @androidx.annotation.p0
    private final int[] f106466f;

    @SafeParcelable.b
    public ConnectionTelemetryConfiguration(@NonNull @SafeParcelable.e(id = 1) RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) @androidx.annotation.p0 int[] iArr, @SafeParcelable.e(id = 5) int i10, @SafeParcelable.e(id = 6) @androidx.annotation.p0 int[] iArr2) {
        this.f106461a = rootTelemetryConfiguration;
        this.f106462b = z10;
        this.f106463c = z11;
        this.f106464d = iArr;
        this.f106465e = i10;
        this.f106466f = iArr2;
    }

    @g6.a
    public int O1() {
        return this.f106465e;
    }

    @androidx.annotation.p0
    @g6.a
    public int[] T1() {
        return this.f106464d;
    }

    @androidx.annotation.p0
    @g6.a
    public int[] b2() {
        return this.f106466f;
    }

    @g6.a
    public boolean e2() {
        return this.f106462b;
    }

    @g6.a
    public boolean f2() {
        return this.f106463c;
    }

    @NonNull
    public final RootTelemetryConfiguration n2() {
        return this.f106461a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, this.f106461a, i10, false);
        i6.b.g(parcel, 2, e2());
        i6.b.g(parcel, 3, f2());
        i6.b.G(parcel, 4, T1(), false);
        i6.b.F(parcel, 5, O1());
        i6.b.G(parcel, 6, b2(), false);
        i6.b.b(parcel, iA);
    }
}
