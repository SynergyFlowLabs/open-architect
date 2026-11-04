package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityTransitionResultCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransitionEvents", id = 1)
    private final List f109484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExtras", id = 2)
    @androidx.annotation.p0
    private Bundle f109485b;

    public ActivityTransitionResult(@NonNull @SafeParcelable.e(id = 1) List<ActivityTransitionEvent> list) {
        this.f109485b = null;
        com.google.android.gms.common.internal.w.s(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i10 = 1; i10 < list.size(); i10++) {
                int i11 = i10 - 1;
                com.google.android.gms.common.internal.w.c(list.get(i10).T1() >= list.get(i11).T1(), "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(list.get(i10).T1()), Long.valueOf(list.get(i11).T1()));
            }
        }
        this.f109484a = Collections.unmodifiableList(list);
    }

    @androidx.annotation.p0
    public static ActivityTransitionResult O1(@NonNull Intent intent) {
        if (b2(intent)) {
            return (ActivityTransitionResult) i6.c.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean b2(@androidx.annotation.p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    @NonNull
    public List<ActivityTransitionEvent> T1() {
        return this.f109484a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f109484a.equals(((ActivityTransitionResult) obj).f109484a);
        }
        return false;
    }

    public int hashCode() {
        return this.f109484a.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        boolean z10 = true & false;
        i6.b.d0(parcel, 1, T1(), false);
        i6.b.k(parcel, 2, this.f109485b, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    @com.google.android.gms.common.internal.a0
    public ActivityTransitionResult(@NonNull @SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @androidx.annotation.p0 Bundle bundle) {
        this(list);
        this.f109485b = bundle;
    }
}
