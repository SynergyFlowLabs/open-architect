package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.g({1})
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getKeyHandle", id = 2)
    private final byte[] f107115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getClientDataJSON", id = 3)
    private final byte[] f107116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getAuthenticatorData", id = 4)
    private final byte[] f107117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getSignature", id = 5)
    private final byte[] f107118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserHandle", id = 6)
    @androidx.annotation.p0
    private final byte[] f107119e;

    @SafeParcelable.b
    AuthenticatorAssertionResponse(@NonNull @SafeParcelable.e(id = 2) byte[] bArr, @NonNull @SafeParcelable.e(id = 3) byte[] bArr2, @NonNull @SafeParcelable.e(id = 4) byte[] bArr3, @NonNull @SafeParcelable.e(id = 5) byte[] bArr4, @SafeParcelable.e(id = 6) @androidx.annotation.p0 byte[] bArr5) {
        this.f107115a = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107116b = (byte[]) com.google.android.gms.common.internal.w.r(bArr2);
        this.f107117c = (byte[]) com.google.android.gms.common.internal.w.r(bArr3);
        this.f107118d = (byte[]) com.google.android.gms.common.internal.w.r(bArr4);
        this.f107119e = bArr5;
    }

    @NonNull
    public static AuthenticatorAssertionResponse b2(@NonNull byte[] bArr) {
        return (AuthenticatorAssertionResponse) i6.c.a(bArr, CREATOR);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] O1() {
        return this.f107116b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] T1() {
        return i6.c.n(this);
    }

    @NonNull
    public byte[] e2() {
        return this.f107117c;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.f107115a, authenticatorAssertionResponse.f107115a) && Arrays.equals(this.f107116b, authenticatorAssertionResponse.f107116b) && Arrays.equals(this.f107117c, authenticatorAssertionResponse.f107117c) && Arrays.equals(this.f107118d, authenticatorAssertionResponse.f107118d) && Arrays.equals(this.f107119e, authenticatorAssertionResponse.f107119e);
    }

    @NonNull
    @Deprecated
    public byte[] f2() {
        return this.f107115a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(Arrays.hashCode(this.f107115a)), Integer.valueOf(Arrays.hashCode(this.f107116b)), Integer.valueOf(Arrays.hashCode(this.f107117c)), Integer.valueOf(Arrays.hashCode(this.f107118d)), Integer.valueOf(Arrays.hashCode(this.f107119e)));
    }

    @NonNull
    public byte[] n2() {
        return this.f107118d;
    }

    @androidx.annotation.p0
    public byte[] p2() {
        return this.f107119e;
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        com.google.android.gms.internal.fido.h0 h0VarC = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr = this.f107115a;
        kVarA.b(SignResponseData.f107432f, h0VarC.d(bArr, 0, bArr.length));
        com.google.android.gms.internal.fido.h0 h0VarC2 = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr2 = this.f107116b;
        kVarA.b("clientDataJSON", h0VarC2.d(bArr2, 0, bArr2.length));
        com.google.android.gms.internal.fido.h0 h0VarC3 = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr3 = this.f107117c;
        kVarA.b("authenticatorData", h0VarC3.d(bArr3, 0, bArr3.length));
        com.google.android.gms.internal.fido.h0 h0VarC4 = com.google.android.gms.internal.fido.h0.c();
        byte[] bArr4 = this.f107118d;
        kVarA.b("signature", h0VarC4.d(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f107119e;
        if (bArr5 != null) {
            kVarA.b("userHandle", com.google.android.gms.internal.fido.h0.c().d(bArr5, 0, bArr5.length));
        }
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, f2(), false);
        i6.b.m(parcel, 3, O1(), false);
        i6.b.m(parcel, 4, e2(), false);
        i6.b.m(parcel, 5, n2(), false);
        i6.b.m(parcel, 6, p2(), false);
        i6.b.b(parcel, iA);
    }
}
