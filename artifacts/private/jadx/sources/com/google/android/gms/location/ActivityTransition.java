package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityTransitionCreator")
@SafeParcelable.g({1000})
public class ActivityTransition extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f109470c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f109471d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getActivityType", id = 1)
    private final int f109472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransitionType", id = 2)
    private final int f109473b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f109474a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f109475b = -1;

        @NonNull
        public ActivityTransition a() {
            com.google.android.gms.common.internal.w.y(this.f109474a != -1, "Activity type not set.");
            com.google.android.gms.common.internal.w.y(this.f109475b != -1, "Activity transition type not set.");
            return new ActivityTransition(this.f109474a, this.f109475b);
        }

        @NonNull
        public a b(int i10) {
            ActivityTransition.b2(i10);
            this.f109475b = i10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.f109474a = i10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @SafeParcelable.b
    ActivityTransition(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11) {
        this.f109472a = i10;
        this.f109473b = i11;
    }

    public static void b2(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 1) {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 30);
        sb2.append("Transition type ");
        sb2.append(i10);
        sb2.append(" is not valid.");
        com.google.android.gms.common.internal.w.b(z10, sb2.toString());
    }

    public int O1() {
        return this.f109472a;
    }

    public int T1() {
        return this.f109473b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f109472a == activityTransition.f109472a && this.f109473b == activityTransition.f109473b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109472a), Integer.valueOf(this.f109473b));
    }

    @NonNull
    public String toString() {
        int i10 = this.f109472a;
        int length = String.valueOf(i10).length();
        int i11 = this.f109473b;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i11).length() + 1);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i10);
        sb2.append(", mTransitionType=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, O1());
        i6.b.F(parcel, 2, T1());
        i6.b.b(parcel, iA);
    }
}
