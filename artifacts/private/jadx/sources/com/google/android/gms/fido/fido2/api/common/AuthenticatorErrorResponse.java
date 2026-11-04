package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorErrorResponseCreator")
@SafeParcelable.g({1})
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode f107124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorMessage", id = 3)
    @androidx.annotation.p0
    private final String f107125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getInternalErrorCode", id = 4, type = "int")
    private final int f107126c;

    @SafeParcelable.b
    AuthenticatorErrorResponse(@NonNull @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 4) int i11) {
        try {
            this.f107124a = ErrorCode.l(i10);
            this.f107125b = str;
            this.f107126c = i11;
        } catch (ErrorCode.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public static AuthenticatorErrorResponse b2(@NonNull byte[] bArr) {
        return (AuthenticatorErrorResponse) i6.c.a(bArr, CREATOR);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] O1() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] T1() {
        return i6.c.n(this);
    }

    @NonNull
    public ErrorCode e2() {
        return this.f107124a;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return com.google.android.gms.common.internal.u.b(this.f107124a, authenticatorErrorResponse.f107124a) && com.google.android.gms.common.internal.u.b(this.f107125b, authenticatorErrorResponse.f107125b) && com.google.android.gms.common.internal.u.b(Integer.valueOf(this.f107126c), Integer.valueOf(authenticatorErrorResponse.f107126c));
    }

    public int f2() {
        return this.f107124a.k();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107124a, this.f107125b, Integer.valueOf(this.f107126c));
    }

    @androidx.annotation.p0
    public String n2() {
        return this.f107125b;
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        kVarA.a("errorCode", this.f107124a.k());
        String str = this.f107125b;
        if (str != null) {
            kVarA.b("errorMessage", str);
        }
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 2, f2());
        i6.b.Y(parcel, 3, n2(), false);
        i6.b.F(parcel, 4, this.f107126c);
        i6.b.b(parcel, iA);
    }
}
