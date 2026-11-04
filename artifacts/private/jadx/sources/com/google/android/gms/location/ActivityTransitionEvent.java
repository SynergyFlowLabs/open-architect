package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityTransitionEventCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getActivityType", id = 1)
    private final int f109476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransitionType", id = 2)
    private final int f109477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getElapsedRealTimeNanos", id = 3)
    private final long f109478c;

    @SafeParcelable.b
    public ActivityTransitionEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) long j10) {
        ActivityTransition.b2(i11);
        this.f109476a = i10;
        this.f109477b = i11;
        this.f109478c = j10;
    }

    public int O1() {
        return this.f109476a;
    }

    public long T1() {
        return this.f109478c;
    }

    public int b2() {
        return this.f109477b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f109476a == activityTransitionEvent.f109476a && this.f109477b == activityTransitionEvent.f109477b && this.f109478c == activityTransitionEvent.f109478c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109476a), Integer.valueOf(this.f109477b), Long.valueOf(this.f109478c));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f109476a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 13);
        sb3.append("ActivityType ");
        sb3.append(i10);
        sb2.append(sb3.toString());
        sb2.append(" ");
        int i11 = this.f109477b;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb4.append("TransitionType ");
        sb4.append(i11);
        sb2.append(sb4.toString());
        sb2.append(" ");
        long j10 = this.f109478c;
        StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 21);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j10);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, O1());
        i6.b.F(parcel, 2, b2());
        i6.b.K(parcel, 3, T1());
        i6.b.b(parcel, iA);
    }
}
