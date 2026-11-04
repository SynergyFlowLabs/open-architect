package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.f1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f114318h = "%02d";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f114319i = "%d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f114320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f114321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f114322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f114323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f114324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f114325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f114326g;

    class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    @p0
    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, f114318h);
    }

    @p0
    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int h(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @f1
    public int c() {
        return this.f114322c == 1 ? r6.a.m.f361006t0 : r6.a.m.f361012v0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        if (this.f114322c == 1) {
            return this.f114323d % 24;
        }
        int i10 = this.f114323d;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f114326g == 1 ? i10 - 12 : i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f114323d == timeModel.f114323d && this.f114324e == timeModel.f114324e && this.f114322c == timeModel.f114322c && this.f114325f == timeModel.f114325f;
    }

    public e f() {
        return this.f114321b;
    }

    public e g() {
        return this.f114320a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f114322c), Integer.valueOf(this.f114323d), Integer.valueOf(this.f114324e), Integer.valueOf(this.f114325f)});
    }

    public void i(int i10) {
        if (this.f114322c == 1) {
            this.f114323d = i10;
        } else {
            this.f114323d = (i10 % 12) + (this.f114326g != 1 ? 0 : 12);
        }
    }

    public void j(int i10) {
        this.f114326g = h(i10);
        this.f114323d = i10;
    }

    public void k(@g0(from = 0, to = 59) int i10) {
        this.f114324e = i10 % 60;
    }

    public void l(int i10) {
        if (i10 != this.f114326g) {
            this.f114326g = i10;
            int i11 = this.f114323d;
            if (i11 < 12 && i10 == 1) {
                this.f114323d = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f114323d = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f114323d);
        parcel.writeInt(this.f114324e);
        parcel.writeInt(this.f114325f);
        parcel.writeInt(this.f114322c);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f114323d = i10;
        this.f114324e = i11;
        this.f114325f = i12;
        this.f114322c = i13;
        this.f114326g = h(i10);
        this.f114320a = new e(59);
        this.f114321b = new e(i13 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
