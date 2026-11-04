package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AccountChangeEventCreator")
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final long f105050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    final String f105051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    final int f105052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    final int f105053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 6)
    final String f105054f;

    @SafeParcelable.b
    AccountChangeEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12, @SafeParcelable.e(id = 6) String str2) {
        this.f105049a = i10;
        this.f105050b = j10;
        this.f105051c = (String) w.r(str);
        this.f105052d = i11;
        this.f105053e = i12;
        this.f105054f = str2;
    }

    @NonNull
    public String O1() {
        return this.f105051c;
    }

    @NonNull
    public String T1() {
        return this.f105054f;
    }

    public int b2() {
        return this.f105052d;
    }

    public int e2() {
        return this.f105053e;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f105049a == accountChangeEvent.f105049a && this.f105050b == accountChangeEvent.f105050b && u.b(this.f105051c, accountChangeEvent.f105051c) && this.f105052d == accountChangeEvent.f105052d && this.f105053e == accountChangeEvent.f105053e && u.b(this.f105054f, accountChangeEvent.f105054f);
    }

    public int hashCode() {
        return u.c(Integer.valueOf(this.f105049a), Long.valueOf(this.f105050b), this.f105051c, Integer.valueOf(this.f105052d), Integer.valueOf(this.f105053e), this.f105054f);
    }

    @NonNull
    public String toString() {
        String str;
        int i10 = this.f105052d;
        if (i10 == 1) {
            str = "ADDED";
        } else if (i10 == 2) {
            str = "REMOVED";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        return "AccountChangeEvent {accountName = " + this.f105051c + ", changeType = " + str + ", changeData = " + this.f105054f + ", eventIndex = " + this.f105053e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105049a);
        i6.b.K(parcel, 2, this.f105050b);
        i6.b.Y(parcel, 3, this.f105051c, false);
        i6.b.F(parcel, 4, this.f105052d);
        i6.b.F(parcel, 5, this.f105053e);
        i6.b.Y(parcel, 6, this.f105054f, false);
        i6.b.b(parcel, iA);
    }

    public AccountChangeEvent(long j10, @NonNull String str, int i10, int i11, @NonNull String str2) {
        this.f105049a = 1;
        this.f105050b = j10;
        this.f105051c = (String) w.r(str);
        this.f105052d = i10;
        this.f105053e = i11;
        this.f105054f = str2;
    }
}
