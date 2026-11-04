package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Month f112304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Month f112305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final DateValidator f112306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Month f112307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f112308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f112309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f112310g;

    public interface DateValidator extends Parcelable {
        boolean d(long j10);
    }

    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f112304a.equals(calendarConstraints.f112304a) && this.f112305b.equals(calendarConstraints.f112305b) && androidx.core.util.o.a(this.f112307d, calendarConstraints.f112307d) && this.f112308e == calendarConstraints.f112308e && this.f112306c.equals(calendarConstraints.f112306c);
    }

    Month g(Month month) {
        if (month.compareTo(this.f112304a) < 0) {
            return this.f112304a;
        }
        return month.compareTo(this.f112305b) > 0 ? this.f112305b : month;
    }

    public DateValidator h() {
        return this.f112306c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f112304a, this.f112305b, this.f112307d, Integer.valueOf(this.f112308e), this.f112306c});
    }

    @NonNull
    Month i() {
        return this.f112305b;
    }

    public long j() {
        return this.f112305b.f112335f;
    }

    int k() {
        return this.f112308e;
    }

    int l() {
        return this.f112310g;
    }

    @p0
    Month m() {
        return this.f112307d;
    }

    @p0
    public Long n() {
        Month month = this.f112307d;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f112335f);
    }

    @NonNull
    Month o() {
        return this.f112304a;
    }

    public long p() {
        return this.f112304a.f112335f;
    }

    int q() {
        return this.f112309f;
    }

    boolean r(long j10) {
        if (this.f112304a.n(1) <= j10) {
            Month month = this.f112305b;
            if (j10 <= month.n(month.f112334e)) {
                return true;
            }
        }
        return false;
    }

    void s(@p0 Month month) {
        this.f112307d = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f112304a, 0);
        parcel.writeParcelable(this.f112305b, 0);
        parcel.writeParcelable(this.f112307d, 0);
        parcel.writeParcelable(this.f112306c, 0);
        parcel.writeInt(this.f112308e);
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @p0 Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f112304a = month;
        this.f112305b = month2;
        this.f112307d = month3;
        this.f112308e = i10;
        this.f112306c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > v.x().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f112310g = month.s(month2) + 1;
        this.f112309f = (month2.f112332c - month.f112332c) + 1;
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f112311f = v.a(Month.c(1900, 0).f112335f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f112312g = v.a(Month.c(2100, 11).f112335f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f112313h = "DEEP_COPY_VALIDATOR_KEY";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f112314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f112315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f112316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f112317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DateValidator f112318e;

        public b() {
            this.f112314a = f112311f;
            this.f112315b = f112312g;
            this.f112318e = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f112313h, this.f112318e);
            Month monthE = Month.e(this.f112314a);
            Month monthE2 = Month.e(this.f112315b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f112313h);
            Long l10 = this.f112316c;
            return new CalendarConstraints(monthE, monthE2, dateValidator, l10 == null ? null : Month.e(l10.longValue()), this.f112317d, null);
        }

        @NonNull
        @z7.a
        public b b(long j10) {
            this.f112315b = j10;
            return this;
        }

        @NonNull
        @z7.a
        public b c(int i10) {
            this.f112317d = i10;
            return this;
        }

        @NonNull
        @z7.a
        public b d(long j10) {
            this.f112316c = Long.valueOf(j10);
            return this;
        }

        @NonNull
        @z7.a
        public b e(long j10) {
            this.f112314a = j10;
            return this;
        }

        @NonNull
        @z7.a
        public b f(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f112318e = dateValidator;
            return this;
        }

        b(@NonNull CalendarConstraints calendarConstraints) {
            this.f112314a = f112311f;
            this.f112315b = f112312g;
            this.f112318e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f112314a = calendarConstraints.f112304a.f112335f;
            this.f112315b = calendarConstraints.f112305b.f112335f;
            this.f112316c = Long.valueOf(calendarConstraints.f112307d.f112335f);
            this.f112317d = calendarConstraints.f112308e;
            this.f112318e = calendarConstraints.f112306c;
        }
    }
}
