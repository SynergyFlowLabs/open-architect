package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "MethodInvocationCreator")
@g6.a
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodKey", id = 1)
    private final int f106485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResultStatusCode", id = 2)
    private final int f106486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResultStatusCode", id = 3)
    private final int f106487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStartTimeMillis", id = 4)
    private final long f106488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEndTimeMillis", id = 5)
    private final long f106489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingModuleId", id = 6)
    @androidx.annotation.p0
    private final String f106490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingEntryPoint", id = 7)
    @androidx.annotation.p0
    private final String f106491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getServiceId", id = 8)
    private final int f106492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = CreateTicketViewModelKt.EmailId, getter = "getLatencyMillis", id = 9)
    private final int f106493i;

    @g6.a
    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f106485a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f106486b);
        i6.b.F(parcel, 3, this.f106487c);
        i6.b.K(parcel, 4, this.f106488d);
        i6.b.K(parcel, 5, this.f106489e);
        i6.b.Y(parcel, 6, this.f106490f, false);
        i6.b.Y(parcel, 7, this.f106491g, false);
        i6.b.F(parcel, 8, this.f106492h);
        i6.b.F(parcel, 9, this.f106493i);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    @g6.a
    public MethodInvocation(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) long j10, @SafeParcelable.e(id = 5) long j11, @SafeParcelable.e(id = 6) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 7) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 8) int i13, @SafeParcelable.e(id = 9) int i14) {
        this.f106485a = i10;
        this.f106486b = i11;
        this.f106487c = i12;
        this.f106488d = j10;
        this.f106489e = j11;
        this.f106490f = str;
        this.f106491g = str2;
        this.f106492h = i13;
        this.f106493i = i14;
    }
}
