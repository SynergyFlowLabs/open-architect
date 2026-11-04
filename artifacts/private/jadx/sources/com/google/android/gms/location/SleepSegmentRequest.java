package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SleepSegmentRequestCreator")
@SafeParcelable.g({1000})
public class SleepSegmentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f109624c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f109625d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f109626e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserPreferredSleepWindow", id = 1)
    @androidx.annotation.p0
    private final List f109627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getRequestedDataType", id = 2)
    private final int f109628b;

    public SleepSegmentRequest(int i10) {
        this(null, i10);
    }

    @NonNull
    public static SleepSegmentRequest O1() {
        return new SleepSegmentRequest(null, 0);
    }

    public int T1() {
        return this.f109628b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return com.google.android.gms.common.internal.u.b(this.f109627a, sleepSegmentRequest.f109627a) && this.f109628b == sleepSegmentRequest.f109628b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f109627a, Integer.valueOf(this.f109628b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        List list = this.f109627a;
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, list, false);
        i6.b.F(parcel, 2, T1());
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    @com.google.android.gms.common.internal.a0
    public SleepSegmentRequest(@SafeParcelable.e(id = 1) @androidx.annotation.p0 List list, @SafeParcelable.e(id = 2) int i10) {
        this.f109627a = list;
        this.f109628b = i10;
    }
}
