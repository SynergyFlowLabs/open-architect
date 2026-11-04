package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AccountChangeEventsRequestCreator")
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    int f105056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    @Deprecated
    String f105057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    Account f105058d;

    public AccountChangeEventsRequest() {
        this.f105055a = 1;
    }

    @NonNull
    @Deprecated
    public String O1() {
        return this.f105057c;
    }

    public int T1() {
        return this.f105056b;
    }

    @NonNull
    public AccountChangeEventsRequest b2(@NonNull Account account) {
        this.f105058d = account;
        return this;
    }

    @NonNull
    @Deprecated
    public AccountChangeEventsRequest e2(@NonNull String str) {
        this.f105057c = str;
        return this;
    }

    @NonNull
    public AccountChangeEventsRequest f2(int i10) {
        this.f105056b = i10;
        return this;
    }

    @NonNull
    public Account r() {
        return this.f105058d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105055a);
        i6.b.F(parcel, 2, this.f105056b);
        i6.b.Y(parcel, 3, this.f105057c, false);
        i6.b.S(parcel, 4, this.f105058d, i10, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    AccountChangeEventsRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) Account account) {
        this.f105055a = i10;
        this.f105056b = i11;
        this.f105057c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f105058d = account;
        } else {
            this.f105058d = new Account(str, "com.google");
        }
    }
}
