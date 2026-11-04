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
@SafeParcelable.a(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimestampSec", id = 1)
    private final int f109607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConfidence", id = 2)
    private final int f109608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMotion", id = 3)
    private final int f109609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLight", id = 4)
    private final int f109610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getNoise", id = 5)
    private final int f109611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLightDiff", id = 6)
    private final int f109612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getNightOrDay", id = 7)
    private final int f109613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean f109614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPresenceConfidence", id = 9)
    private final int f109615i;

    @SafeParcelable.b
    @com.google.android.gms.common.internal.a0
    public SleepClassifyEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) int i13, @SafeParcelable.e(id = 5) int i14, @SafeParcelable.e(id = 6) int i15, @SafeParcelable.e(id = 7) int i16, @SafeParcelable.e(id = 8) boolean z10, @SafeParcelable.e(id = 9) int i17) {
        this.f109607a = i10;
        this.f109608b = i11;
        this.f109609c = i12;
        this.f109610d = i13;
        this.f109611e = i14;
        this.f109612f = i15;
        this.f109613g = i16;
        this.f109614h = z10;
        this.f109615i = i17;
    }

    @NonNull
    public static List<SleepClassifyEvent> O1(@NonNull Intent intent) {
        ArrayList arrayList;
        com.google.android.gms.common.internal.w.r(intent);
        if (n2(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                byte[] bArr = (byte[]) arrayList.get(i10);
                com.google.android.gms.common.internal.w.r(bArr);
                arrayList2.add((SleepClassifyEvent) i6.c.a(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean n2(@androidx.annotation.p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public int T1() {
        return this.f109608b;
    }

    public int b2() {
        return this.f109610d;
    }

    public int e2() {
        return this.f109609c;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.f109607a == sleepClassifyEvent.f109607a && this.f109608b == sleepClassifyEvent.f109608b;
    }

    public long f2() {
        return ((long) this.f109607a) * 1000;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109607a), Integer.valueOf(this.f109608b));
    }

    @NonNull
    public String toString() {
        int i10 = this.f109607a;
        int length = String.valueOf(i10).length();
        int i11 = this.f109608b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f109609c;
        int length3 = String.valueOf(i12).length();
        int i13 = this.f109610d;
        StringBuilder sb2 = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i13).length());
        sb2.append(i10);
        sb2.append(" Conf:");
        sb2.append(i11);
        sb2.append(" Motion:");
        sb2.append(i12);
        sb2.append(" Light:");
        sb2.append(i13);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        com.google.android.gms.common.internal.w.r(parcel);
        int i11 = this.f109607a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, T1());
        i6.b.F(parcel, 3, e2());
        i6.b.F(parcel, 4, b2());
        i6.b.F(parcel, 5, this.f109611e);
        i6.b.F(parcel, 6, this.f109612f);
        int i12 = 4 & 7;
        i6.b.F(parcel, 7, this.f109613g);
        i6.b.g(parcel, 8, this.f109614h);
        i6.b.F(parcel, 9, this.f109615i);
        i6.b.b(parcel, iA);
    }
}
