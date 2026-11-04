package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.g({1})
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getKeyHandle", id = 2)
    private final byte[] f107120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getClientDataJSON", id = 3)
    private final byte[] f107121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getAttestationObject", id = 4)
    private final byte[] f107122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getTransports", id = 5)
    private final String[] f107123d;

    @SafeParcelable.b
    AuthenticatorAttestationResponse(@NonNull @SafeParcelable.e(id = 2) byte[] bArr, @NonNull @SafeParcelable.e(id = 3) byte[] bArr2, @NonNull @SafeParcelable.e(id = 4) byte[] bArr3, @NonNull @SafeParcelable.e(id = 5) String[] strArr) {
        this.f107120a = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107121b = (byte[]) com.google.android.gms.common.internal.w.r(bArr2);
        this.f107122c = (byte[]) com.google.android.gms.common.internal.w.r(bArr3);
        this.f107123d = (String[]) com.google.android.gms.common.internal.w.r(strArr);
    }

    @NonNull
    public static AuthenticatorAttestationResponse b2(@NonNull byte[] bArr) {
        return (AuthenticatorAttestationResponse) i6.c.a(bArr, CREATOR);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] O1() {
        return this.f107121b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] T1() {
        return i6.c.n(this);
    }

    @NonNull
    public byte[] e2() {
        return this.f107122c;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.f107120a, authenticatorAttestationResponse.f107120a) && Arrays.equals(this.f107121b, authenticatorAttestationResponse.f107121b) && Arrays.equals(this.f107122c, authenticatorAttestationResponse.f107122c);
    }

    @NonNull
    @Deprecated
    public byte[] f2() {
        return this.f107120a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(Arrays.hashCode(this.f107120a)), Integer.valueOf(Arrays.hashCode(this.f107121b)), Integer.valueOf(Arrays.hashCode(this.f107122c)));
    }

    @NonNull
    public String[] n2() {
        return this.f107123d;
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        com.google.android.gms.internal.fido.h0 h0VarC = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr = this.f107120a;
        kVarA.b(SignResponseData.f107432f, h0VarC.d(bArr, 0, bArr.length));
        com.google.android.gms.internal.fido.h0 h0VarC2 = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr2 = this.f107121b;
        kVarA.b("clientDataJSON", h0VarC2.d(bArr2, 0, bArr2.length));
        com.google.android.gms.internal.fido.h0 h0VarC3 = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr3 = this.f107122c;
        kVarA.b("attestationObject", h0VarC3.d(bArr3, 0, bArr3.length));
        kVarA.b("transports", Arrays.toString(this.f107123d));
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, f2(), false);
        i6.b.m(parcel, 3, O1(), false);
        int i11 = 7 ^ 4;
        i6.b.m(parcel, 4, e2(), false);
        i6.b.Z(parcel, 5, n2(), false);
        i6.b.b(parcel, iA);
    }
}
