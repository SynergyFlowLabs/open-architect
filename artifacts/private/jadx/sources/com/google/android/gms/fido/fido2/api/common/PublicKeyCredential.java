package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialCreator")
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getId", id = 1)
    private final String f107169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getType", id = 2)
    private final String f107170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getRawId", id = 3)
    private final byte[] f107171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisterResponse", id = 4)
    @androidx.annotation.p0
    private final AuthenticatorAttestationResponse f107172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignResponse", id = 5)
    @androidx.annotation.p0
    private final AuthenticatorAssertionResponse f107173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorResponse", id = 6)
    @androidx.annotation.p0
    private final AuthenticatorErrorResponse f107174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClientExtensionResults", id = 7)
    @androidx.annotation.p0
    private final AuthenticationExtensionsClientOutputs f107175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticatorAttachment", id = 8)
    @androidx.annotation.p0
    private final String f107176h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f107177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f107178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AuthenticatorResponse f107179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AuthenticationExtensionsClientOutputs f107180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f107181e;

        @NonNull
        public PublicKeyCredential a() {
            AuthenticatorResponse authenticatorResponse = this.f107179c;
            return new PublicKeyCredential(this.f107177a, PublicKeyCredentialType.PUBLIC_KEY.toString(), this.f107178b, authenticatorResponse instanceof AuthenticatorAttestationResponse ? (AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorAssertionResponse ? (AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorErrorResponse ? (AuthenticatorErrorResponse) authenticatorResponse : null, this.f107180d, this.f107181e);
        }

        @NonNull
        public a b(@androidx.annotation.p0 AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.f107180d = authenticationExtensionsClientOutputs;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            this.f107181e = str;
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            this.f107177a = str;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f107178b = bArr;
            return this;
        }

        @NonNull
        public a f(@NonNull AuthenticatorResponse authenticatorResponse) {
            this.f107179c = authenticatorResponse;
            return this;
        }
    }

    @SafeParcelable.b
    PublicKeyCredential(@NonNull @SafeParcelable.e(id = 1) String str, @NonNull @SafeParcelable.e(id = 2) String str2, @NonNull @SafeParcelable.e(id = 3) byte[] bArr, @SafeParcelable.e(id = 4) @androidx.annotation.p0 AuthenticatorAttestationResponse authenticatorAttestationResponse, @SafeParcelable.e(id = 5) @androidx.annotation.p0 AuthenticatorAssertionResponse authenticatorAssertionResponse, @SafeParcelable.e(id = 6) @androidx.annotation.p0 AuthenticatorErrorResponse authenticatorErrorResponse, @SafeParcelable.e(id = 7) @androidx.annotation.p0 AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @SafeParcelable.e(id = 8) @androidx.annotation.p0 String str3) {
        boolean z10 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z10 = false;
        }
        com.google.android.gms.common.internal.w.a(z10);
        this.f107169a = str;
        this.f107170b = str2;
        this.f107171c = bArr;
        this.f107172d = authenticatorAttestationResponse;
        this.f107173e = authenticatorAssertionResponse;
        this.f107174f = authenticatorErrorResponse;
        this.f107175g = authenticationExtensionsClientOutputs;
        this.f107176h = str3;
    }

    @NonNull
    public static PublicKeyCredential O1(@NonNull byte[] bArr) {
        return (PublicKeyCredential) i6.c.a(bArr, CREATOR);
    }

    @androidx.annotation.p0
    public String T1() {
        return this.f107176h;
    }

    @androidx.annotation.p0
    public AuthenticationExtensionsClientOutputs b2() {
        return this.f107175g;
    }

    @NonNull
    public byte[] e2() {
        return this.f107171c;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return com.google.android.gms.common.internal.u.b(this.f107169a, publicKeyCredential.f107169a) && com.google.android.gms.common.internal.u.b(this.f107170b, publicKeyCredential.f107170b) && Arrays.equals(this.f107171c, publicKeyCredential.f107171c) && com.google.android.gms.common.internal.u.b(this.f107172d, publicKeyCredential.f107172d) && com.google.android.gms.common.internal.u.b(this.f107173e, publicKeyCredential.f107173e) && com.google.android.gms.common.internal.u.b(this.f107174f, publicKeyCredential.f107174f) && com.google.android.gms.common.internal.u.b(this.f107175g, publicKeyCredential.f107175g) && com.google.android.gms.common.internal.u.b(this.f107176h, publicKeyCredential.f107176h);
    }

    @NonNull
    public AuthenticatorResponse f2() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f107172d;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f107173e;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f107174f;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    @NonNull
    public String getId() {
        return this.f107169a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107169a, this.f107170b, this.f107171c, this.f107173e, this.f107172d, this.f107174f, this.f107175g, this.f107176h);
    }

    @NonNull
    public String n2() {
        return this.f107170b;
    }

    @NonNull
    public byte[] p2() {
        return i6.c.n(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, getId(), false);
        i6.b.Y(parcel, 2, n2(), false);
        i6.b.m(parcel, 3, e2(), false);
        i6.b.S(parcel, 4, this.f107172d, i10, false);
        i6.b.S(parcel, 5, this.f107173e, i10, false);
        i6.b.S(parcel, 6, this.f107174f, i10, false);
        i6.b.S(parcel, 7, b2(), i10, false);
        i6.b.Y(parcel, 8, T1(), false);
        i6.b.b(parcel, iA);
    }
}
