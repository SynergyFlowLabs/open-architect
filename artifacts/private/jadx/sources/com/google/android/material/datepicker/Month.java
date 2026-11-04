package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes4.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f112330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f112331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f112332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f112333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f112334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f112335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private String f112336g;

    class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = v.f(calendar);
        this.f112330a = calendarF;
        this.f112331b = calendarF.get(2);
        this.f112332c = calendarF.get(1);
        this.f112333d = calendarF.getMaximum(7);
        this.f112334e = calendarF.getActualMaximum(5);
        this.f112335f = calendarF.getTimeInMillis();
    }

    @NonNull
    static Month c(int i10, int i11) {
        Calendar calendarX = v.x();
        calendarX.set(1, i10);
        int i12 = 4 & 2;
        calendarX.set(2, i11);
        return new Month(calendarX);
    }

    @NonNull
    static Month e(long j10) {
        Calendar calendarX = v.x();
        calendarX.setTimeInMillis(j10);
        return new Month(calendarX);
    }

    @NonNull
    static Month k() {
        return new Month(v.v());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f112330a.compareTo(month.f112330a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f112331b == month.f112331b && this.f112332c == month.f112332c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f112331b), Integer.valueOf(this.f112332c)});
    }

    int l(int i10) {
        int i11 = this.f112330a.get(7);
        if (i10 <= 0) {
            i10 = this.f112330a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f112333d : i12;
    }

    long n(int i10) {
        Calendar calendarF = v.f(this.f112330a);
        calendarF.set(5, i10);
        return calendarF.getTimeInMillis();
    }

    int o(long j10) {
        Calendar calendarF = v.f(this.f112330a);
        calendarF.setTimeInMillis(j10);
        return calendarF.get(5);
    }

    @NonNull
    String p() {
        if (this.f112336g == null) {
            this.f112336g = h.l(this.f112330a.getTimeInMillis());
        }
        return this.f112336g;
    }

    long q() {
        return this.f112330a.getTimeInMillis();
    }

    @NonNull
    Month r(int i10) {
        Calendar calendarF = v.f(this.f112330a);
        calendarF.add(2, i10);
        return new Month(calendarF);
    }

    int s(@NonNull Month month) {
        if (this.f112330a instanceof GregorianCalendar) {
            return ((month.f112332c - this.f112332c) * 12) + (month.f112331b - this.f112331b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f112332c);
        parcel.writeInt(this.f112331b);
    }
}
