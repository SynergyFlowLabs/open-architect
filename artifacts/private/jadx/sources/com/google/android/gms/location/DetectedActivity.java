package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DetectedActivityCreator")
@SafeParcelable.g({1000})
public class DetectedActivity extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f109502c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f109503d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f109504e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f109505f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f109506g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f109507h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f109508i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f109509j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    final int f109511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final int f109512b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final Comparator f109510k = new x0();

    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new y0();

    @SafeParcelable.b
    public DetectedActivity(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11) {
        this.f109511a = i10;
        this.f109512b = i11;
    }

    public int O1() {
        return this.f109512b;
    }

    public int T1() {
        int i10 = this.f109511a;
        if (i10 > 22 || i10 < 0) {
            return 4;
        }
        return i10;
    }

    @com.google.android.gms.common.internal.a0
    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f109511a == detectedActivity.f109511a && this.f109512b == detectedActivity.f109512b) {
                return true;
            }
        }
        return false;
    }

    @com.google.android.gms.common.internal.a0
    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109511a), Integer.valueOf(this.f109512b));
    }

    @NonNull
    public String toString() {
        String string;
        int iT1 = T1();
        if (iT1 == 0) {
            string = "IN_VEHICLE";
        } else if (iT1 == 1) {
            string = "ON_BICYCLE";
        } else if (iT1 == 2) {
            string = "ON_FOOT";
        } else if (iT1 == 3) {
            string = "STILL";
        } else if (iT1 == 4) {
            string = "UNKNOWN";
        } else if (iT1 != 5) {
            int i10 = 4 >> 7;
            if (iT1 == 7) {
                string = "WALKING";
            } else if (iT1 == 8) {
                string = kotlinx.coroutines.debug.internal.j.f313977b;
            } else if (iT1 != 16) {
                string = iT1 != 17 ? Integer.toString(iT1) : "IN_RAIL_VEHICLE";
            } else {
                string = "IN_ROAD_VEHICLE";
            }
        } else {
            string = "TILTING";
        }
        int i11 = this.f109512b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 36 + String.valueOf(i11).length() + 1);
        sb2.append("DetectedActivity [type=");
        sb2.append(string);
        sb2.append(", confidence=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f109511a);
        i6.b.F(parcel, 2, this.f109512b);
        i6.b.b(parcel, iA);
    }
}
