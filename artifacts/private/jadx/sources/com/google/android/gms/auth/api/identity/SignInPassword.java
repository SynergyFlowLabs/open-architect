package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInPasswordCreator")
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getId", id = 1)
    private final String f105547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPassword", id = 2)
    private final String f105548b;

    @SafeParcelable.b
    public SignInPassword(@NonNull @SafeParcelable.e(id = 1) String str, @NonNull @SafeParcelable.e(id = 2) String str2) {
        this.f105547a = com.google.android.gms.common.internal.w.m(((String) com.google.android.gms.common.internal.w.s(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f105548b = com.google.android.gms.common.internal.w.l(str2);
    }

    @NonNull
    public String O1() {
        return this.f105548b;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return com.google.android.gms.common.internal.u.b(this.f105547a, signInPassword.f105547a) && com.google.android.gms.common.internal.u.b(this.f105548b, signInPassword.f105548b);
    }

    @NonNull
    public String getId() {
        return this.f105547a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105547a, this.f105548b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, getId(), false);
        i6.b.Y(parcel, 2, O1(), false);
        i6.b.b(parcel, iA);
    }
}
