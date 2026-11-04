package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.q3;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceOrientationRequestCreator")
@SafeParcelable.g({1, 3, 4, 5})
public final class DeviceOrientationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new a1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f109527c = 20000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f109528d = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f109529e = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSamplingPeriodMicros", id = 2)
    private final long f109530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "false", getter = "isVelocityEnabled", id = 6)
    private final boolean f109531b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f109532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f109533b;

        public a(long j10) {
            this.f109533b = false;
            b(j10);
        }

        @NonNull
        public DeviceOrientationRequest a() {
            return new DeviceOrientationRequest(this.f109532a, this.f109533b);
        }

        @NonNull
        public a b(long j10) {
            boolean z10 = false;
            if (j10 >= 0 && j10 < Long.MAX_VALUE) {
                z10 = true;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 102);
            sb2.append("Invalid interval: ");
            sb2.append(j10);
            sb2.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            q3.b(z10, sb2.toString());
            this.f109532a = j10;
            return this;
        }

        public a(@NonNull DeviceOrientationRequest deviceOrientationRequest) {
            this.f109532a = deviceOrientationRequest.T1();
            this.f109533b = deviceOrientationRequest.b2();
        }
    }

    @SafeParcelable.b
    DeviceOrientationRequest(@SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 6) boolean z10) {
        this.f109530a = j10;
        this.f109531b = z10;
    }

    @xl.d
    public long O1() {
        return this.f109530a;
    }

    final /* synthetic */ long T1() {
        return this.f109530a;
    }

    final /* synthetic */ boolean b2() {
        return this.f109531b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.f109530a == deviceOrientationRequest.f109530a && this.f109531b == deviceOrientationRequest.f109531b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f109530a), Boolean.valueOf(this.f109531b));
    }

    @NonNull
    public String toString() {
        long j10 = this.f109530a;
        int length = String.valueOf(j10).length();
        String str = true != this.f109531b ? "" : ", withVelocity";
        StringBuilder sb2 = new StringBuilder(length + 46 + str.length() + 1);
        sb2.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb2.append(j10);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 2, O1());
        i6.b.g(parcel, 6, this.f109531b);
        i6.b.b(parcel, iA);
    }
}
