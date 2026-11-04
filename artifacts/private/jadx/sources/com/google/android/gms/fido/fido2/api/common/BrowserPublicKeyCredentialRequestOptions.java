package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.g({1})
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getPublicKeyCredentialRequestOptions", id = 2)
    private final PublicKeyCredentialRequestOptions f107140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getOrigin", id = 3)
    private final Uri f107141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClientDataHash", id = 4)
    @androidx.annotation.p0
    private final byte[] f107142c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PublicKeyCredentialRequestOptions f107143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f107144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f107145c;

        @NonNull
        public BrowserPublicKeyCredentialRequestOptions a() {
            return new BrowserPublicKeyCredentialRequestOptions(this.f107143a, this.f107144b, this.f107145c);
        }

        @NonNull
        public a b(@NonNull byte[] bArr) {
            BrowserPublicKeyCredentialRequestOptions.B2(bArr);
            this.f107145c = bArr;
            return this;
        }

        @NonNull
        public a c(@NonNull Uri uri) {
            BrowserPublicKeyCredentialRequestOptions.z2(uri);
            this.f107144b = uri;
            return this;
        }

        @NonNull
        public a d(@NonNull PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            this.f107143a = (PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.w.r(publicKeyCredentialRequestOptions);
            return this;
        }
    }

    @SafeParcelable.b
    BrowserPublicKeyCredentialRequestOptions(@NonNull @SafeParcelable.e(id = 2) PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @NonNull @SafeParcelable.e(id = 3) Uri uri, @SafeParcelable.e(id = 4) @androidx.annotation.p0 byte[] bArr) {
        this.f107140a = (PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.w.r(publicKeyCredentialRequestOptions);
        D2(uri);
        this.f107141b = uri;
        U2(bArr);
        this.f107142c = bArr;
    }

    static /* bridge */ /* synthetic */ byte[] B2(byte[] bArr) {
        U2(bArr);
        return bArr;
    }

    private static Uri D2(Uri uri) {
        com.google.android.gms.common.internal.w.r(uri);
        com.google.android.gms.common.internal.w.b(uri.getScheme() != null, "origin scheme must be non-empty");
        com.google.android.gms.common.internal.w.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] U2(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        com.google.android.gms.common.internal.w.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    @NonNull
    public static BrowserPublicKeyCredentialRequestOptions s2(@NonNull byte[] bArr) {
        return (BrowserPublicKeyCredentialRequestOptions) i6.c.a(bArr, CREATOR);
    }

    static /* bridge */ /* synthetic */ Uri z2(Uri uri) {
        D2(uri);
        return uri;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public AuthenticationExtensions O1() {
        return this.f107140a.O1();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] T1() {
        return this.f107140a.T1();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Integer b2() {
        return this.f107140a.b2();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Double e2() {
        return this.f107140a.e2();
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return com.google.android.gms.common.internal.u.b(this.f107140a, browserPublicKeyCredentialRequestOptions.f107140a) && com.google.android.gms.common.internal.u.b(this.f107141b, browserPublicKeyCredentialRequestOptions.f107141b);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public TokenBinding f2() {
        return this.f107140a.f2();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107140a, this.f107141b);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] n2() {
        return i6.c.n(this);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @androidx.annotation.p0
    public byte[] p2() {
        return this.f107142c;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @NonNull
    public Uri q2() {
        return this.f107141b;
    }

    @NonNull
    public PublicKeyCredentialRequestOptions u2() {
        return this.f107140a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 2, u2(), i10, false);
        i6.b.S(parcel, 3, q2(), i10, false);
        i6.b.m(parcel, 4, p2(), false);
        i6.b.b(parcel, iA);
    }
}
