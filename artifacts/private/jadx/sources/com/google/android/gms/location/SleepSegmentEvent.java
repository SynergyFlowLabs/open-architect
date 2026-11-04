package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SleepSegmentEventCreator")
@SafeParcelable.g({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new l0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f109616f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f109617g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f109618h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStartTimeMillis", id = 1)
    private final long f109619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEndTimeMillis", id = 2)
    private final long f109620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatus", id = 3)
    private final int f109621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMissingDataDurationMinutes", id = 4)
    private final int f109622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getNinetiethPctConfidence", id = 5)
    private final int f109623e;

    @SafeParcelable.b
    @com.google.android.gms.common.internal.a0
    public SleepSegmentEvent(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) long j11, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12) {
        com.google.android.gms.common.internal.w.b(j10 <= j11, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f109619a = j10;
        this.f109620b = j11;
        this.f109621c = i10;
        this.f109622d = i11;
        this.f109623e = i12;
    }

    @NonNull
    public static List<SleepSegmentEvent> O1(@NonNull Intent intent) {
        ArrayList arrayList;
        com.google.android.gms.common.internal.w.r(intent);
        if (n2(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                byte[] bArr = (byte[]) arrayList.get(i10);
                com.google.android.gms.common.internal.w.r(bArr);
                arrayList2.add((SleepSegmentEvent) i6.c.a(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean n2(@androidx.annotation.p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public long T1() {
        return this.f109620b;
    }

    public long b2() {
        return this.f109620b - this.f109619a;
    }

    public long e2() {
        return this.f109619a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f109619a == sleepSegmentEvent.e2() && this.f109620b == sleepSegmentEvent.T1() && this.f109621c == sleepSegmentEvent.f2() && this.f109622d == sleepSegmentEvent.f109622d && this.f109623e == sleepSegmentEvent.f109623e) {
                return true;
            }
        }
        return false;
    }

    public int f2() {
        return this.f109621c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f109619a), Long.valueOf(this.f109620b), Integer.valueOf(this.f109621c));
    }

    @NonNull
    public String toString() {
        long j10 = this.f109619a;
        int length = String.valueOf(j10).length();
        long j11 = this.f109620b;
        int length2 = String.valueOf(j11).length();
        int i10 = this.f109621c;
        StringBuilder sb2 = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i10).length());
        sb2.append("startMillis=");
        sb2.append(j10);
        sb2.append(", endMillis=");
        sb2.append(j11);
        sb2.append(", status=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, e2());
        i6.b.K(parcel, 2, T1());
        i6.b.F(parcel, 3, f2());
        i6.b.F(parcel, 4, this.f109622d);
        i6.b.F(parcel, 5, this.f109623e);
        i6.b.b(parcel, iA);
    }
}
