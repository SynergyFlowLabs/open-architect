package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccount", id = 2)
    private final Account f106681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 3)
    private final int f106682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignInAccountHint", id = 4)
    @androidx.annotation.p0
    private final GoogleSignInAccount f106683d;

    @SafeParcelable.b
    zat(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Account account, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) @androidx.annotation.p0 GoogleSignInAccount googleSignInAccount) {
        this.f106680a = i10;
        this.f106681b = account;
        this.f106682c = i11;
        this.f106683d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106680a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.S(parcel, 2, this.f106681b, i10, false);
        i6.b.F(parcel, 3, this.f106682c);
        i6.b.S(parcel, 4, this.f106683d, i10, false);
        i6.b.b(parcel, iA);
    }

    public zat(Account account, int i10, @androidx.annotation.p0 GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
