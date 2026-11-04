package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.g({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    List f109465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    long f109466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    long f109467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    int f109468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    @androidx.annotation.p0
    Bundle f109469e;

    @androidx.annotation.l1
    public ActivityRecognitionResult(@NonNull DetectedActivity detectedActivity, long j10, long j11) {
        this(Collections.singletonList(detectedActivity), j10, j11, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @androidx.annotation.p0
    public static ActivityRecognitionResult O1(@NonNull Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (p2(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) i6.c.a((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            } else {
                activityRecognitionResult = null;
            }
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List listQ2 = q2(intent);
        if (listQ2 == null || listQ2.isEmpty()) {
            return null;
        }
        return (ActivityRecognitionResult) listQ2.get(listQ2.size() - 1);
    }

    public static boolean p2(@androidx.annotation.p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List listQ2 = q2(intent);
        return (listQ2 == null || listQ2.isEmpty()) ? false : true;
    }

    @androidx.annotation.p0
    public static List q2(@NonNull Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return i6.c.g(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean s2(@androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 != null && bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj instanceof Bundle) {
                    if (!s2(bundle.getBundle(str), bundle2.getBundle(str))) {
                        return false;
                    }
                } else {
                    if (obj.getClass().isArray()) {
                        if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                            for (int i10 = 0; i10 < length; i10++) {
                                if (com.google.android.gms.common.internal.u.b(Array.get(obj, i10), Array.get(obj2, i10))) {
                                }
                            }
                        }
                        return false;
                    }
                    if (!obj.equals(obj2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int T1(int i10) {
        for (DetectedActivity detectedActivity : this.f109465a) {
            if (detectedActivity.T1() == i10) {
                return detectedActivity.O1();
            }
        }
        return 0;
    }

    public long b2() {
        return this.f109467c;
    }

    @NonNull
    public DetectedActivity e2() {
        return (DetectedActivity) this.f109465a.get(0);
    }

    @com.google.android.gms.common.internal.a0
    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f109466b == activityRecognitionResult.f109466b && this.f109467c == activityRecognitionResult.f109467c && this.f109468d == activityRecognitionResult.f109468d && com.google.android.gms.common.internal.u.b(this.f109465a, activityRecognitionResult.f109465a) && s2(this.f109469e, activityRecognitionResult.f109469e)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public List<DetectedActivity> f2() {
        return this.f109465a;
    }

    @com.google.android.gms.common.internal.a0
    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f109466b), Long.valueOf(this.f109467c), Integer.valueOf(this.f109468d), this.f109465a, this.f109469e);
    }

    public long n2() {
        return this.f109466b;
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.f109465a);
        long j10 = this.f109466b;
        long j11 = this.f109467c;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 59 + String.valueOf(j10).length() + 24 + String.valueOf(j11).length() + 1);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(strValueOf);
        sb2.append(", timeMillis=");
        sb2.append(j10);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, this.f109465a, false);
        i6.b.K(parcel, 2, this.f109466b);
        i6.b.K(parcel, 3, this.f109467c);
        i6.b.F(parcel, 4, this.f109468d);
        i6.b.k(parcel, 5, this.f109469e, false);
        i6.b.b(parcel, iA);
    }

    public ActivityRecognitionResult(@NonNull List<DetectedActivity> list, long j10, long j11) {
        this(list, j10, j11, 0, null);
    }

    @SafeParcelable.b
    @com.google.android.gms.common.internal.a0
    public ActivityRecognitionResult(@NonNull @SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) long j11, @SafeParcelable.e(id = 4) int i10, @SafeParcelable.e(id = 5) @androidx.annotation.p0 Bundle bundle) {
        com.google.android.gms.common.internal.w.b((list == null || list.isEmpty()) ? false : true, "Must have at least 1 detected activity");
        com.google.android.gms.common.internal.w.b(j10 > 0 && j11 > 0, "Must set times");
        this.f109465a = list;
        this.f109466b = j10;
        this.f109467c = j11;
        this.f109468d = i10;
        this.f109469e = bundle;
    }
}
