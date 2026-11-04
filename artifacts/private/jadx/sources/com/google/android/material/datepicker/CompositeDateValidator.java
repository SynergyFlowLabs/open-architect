package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f112319c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f112320d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f112323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<CalendarConstraints.DateValidator> f112324b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f112321e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f112322f = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    class a implements d {
        a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.d(j10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    class b implements d {
        b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.d(j10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    class c implements Parcelable.Creator<CompositeDateValidator> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i10 = parcel.readInt();
            d dVar = (i10 != 2 && i10 == 1) ? CompositeDateValidator.f112321e : CompositeDateValidator.f112322f;
            int i11 = 5 ^ 0;
            return new CompositeDateValidator((List) androidx.core.util.t.l(arrayList), dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    }

    private interface d {
        boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10);

        int getId();
    }

    /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @NonNull
    public static CalendarConstraints.DateValidator c(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f112322f);
    }

    @NonNull
    public static CalendarConstraints.DateValidator e(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f112321e);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean d(long j10) {
        return this.f112323a.a(this.f112324b, j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f112324b.equals(compositeDateValidator.f112324b) && this.f112323a.getId() == compositeDateValidator.f112323a.getId();
    }

    public int hashCode() {
        return this.f112324b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeList(this.f112324b);
        parcel.writeInt(this.f112323a.getId());
    }

    private CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f112324b = list;
        this.f112323a = dVar;
    }
}
