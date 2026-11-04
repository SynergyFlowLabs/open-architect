package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getChallenge", id = 2)
    private final byte[] f107210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeoutSeconds", id = 3)
    @androidx.annotation.p0
    private final Double f107211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getRpId", id = 4)
    private final String f107212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAllowList", id = 5)
    @androidx.annotation.p0
    private final List f107213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestId", id = 6)
    @androidx.annotation.p0
    private final Integer f107214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTokenBinding", id = 7)
    @androidx.annotation.p0
    private final TokenBinding f107215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserVerificationAsString", id = 8, type = "java.lang.String")
    @androidx.annotation.p0
    private final zzay f107216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticationExtensions", id = 9)
    @androidx.annotation.p0
    private final AuthenticationExtensions f107217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLongRequestId", id = 10)
    @androidx.annotation.p0
    private final Long f107218i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f107219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f107220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f107221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f107222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f107223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private TokenBinding f107224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private zzay f107225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AuthenticationExtensions f107226h;

        public a() {
        }

        @NonNull
        public PublicKeyCredentialRequestOptions a() {
            byte[] bArr = this.f107219a;
            Double d10 = this.f107220b;
            String str = this.f107221c;
            List list = this.f107222d;
            Integer num = this.f107223e;
            TokenBinding tokenBinding = this.f107224f;
            zzay zzayVar = this.f107225g;
            return new PublicKeyCredentialRequestOptions(bArr, d10, str, list, num, tokenBinding, zzayVar == null ? null : zzayVar.toString(), this.f107226h, null);
        }

        @NonNull
        public a b(@androidx.annotation.p0 List<PublicKeyCredentialDescriptor> list) {
            this.f107222d = list;
            return this;
        }

        @NonNull
        public a c(@androidx.annotation.p0 AuthenticationExtensions authenticationExtensions) {
            this.f107226h = authenticationExtensions;
            return this;
        }

        @NonNull
        public a d(@NonNull byte[] bArr) {
            this.f107219a = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
            return this;
        }

        @NonNull
        public a e(@androidx.annotation.p0 Integer num) {
            this.f107223e = num;
            return this;
        }

        @NonNull
        public a f(@NonNull String str) {
            this.f107221c = (String) com.google.android.gms.common.internal.w.r(str);
            return this;
        }

        @NonNull
        public a g(@androidx.annotation.p0 Double d10) {
            this.f107220b = d10;
            return this;
        }

        @NonNull
        public a h(@androidx.annotation.p0 TokenBinding tokenBinding) {
            this.f107224f = tokenBinding;
            return this;
        }

        public a(@androidx.annotation.p0 PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.f107219a = publicKeyCredentialRequestOptions.T1();
                this.f107220b = publicKeyCredentialRequestOptions.e2();
                this.f107221c = publicKeyCredentialRequestOptions.s2();
                this.f107222d = publicKeyCredentialRequestOptions.q2();
                this.f107223e = publicKeyCredentialRequestOptions.b2();
                this.f107224f = publicKeyCredentialRequestOptions.f2();
                this.f107225g = publicKeyCredentialRequestOptions.u2();
                this.f107226h = publicKeyCredentialRequestOptions.O1();
            }
        }
    }

    @SafeParcelable.b
    PublicKeyCredentialRequestOptions(@NonNull @SafeParcelable.e(id = 2) byte[] bArr, @SafeParcelable.e(id = 3) @androidx.annotation.p0 Double d10, @NonNull @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) @androidx.annotation.p0 List list, @SafeParcelable.e(id = 6) @androidx.annotation.p0 Integer num, @SafeParcelable.e(id = 7) @androidx.annotation.p0 TokenBinding tokenBinding, @SafeParcelable.e(id = 8) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 9) @androidx.annotation.p0 AuthenticationExtensions authenticationExtensions, @SafeParcelable.e(id = 10) @androidx.annotation.p0 Long l10) {
        this.f107210a = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107211b = d10;
        this.f107212c = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107213d = list;
        this.f107214e = num;
        this.f107215f = tokenBinding;
        this.f107218i = l10;
        if (str2 != null) {
            try {
                this.f107216g = zzay.b(str2);
            } catch (b0 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f107216g = null;
        }
        this.f107217h = authenticationExtensions;
    }

    @NonNull
    public static PublicKeyCredentialRequestOptions p2(@androidx.annotation.p0 byte[] bArr) {
        return (PublicKeyCredentialRequestOptions) i6.c.a(bArr, CREATOR);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public AuthenticationExtensions O1() {
        return this.f107217h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] T1() {
        return this.f107210a;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Integer b2() {
        return this.f107214e;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Double e2() {
        return this.f107211b;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.f107210a, publicKeyCredentialRequestOptions.f107210a) && com.google.android.gms.common.internal.u.b(this.f107211b, publicKeyCredentialRequestOptions.f107211b) && com.google.android.gms.common.internal.u.b(this.f107212c, publicKeyCredentialRequestOptions.f107212c) && (((list = this.f107213d) == null && publicKeyCredentialRequestOptions.f107213d == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.f107213d) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.f107213d.containsAll(this.f107213d))) && com.google.android.gms.common.internal.u.b(this.f107214e, publicKeyCredentialRequestOptions.f107214e) && com.google.android.gms.common.internal.u.b(this.f107215f, publicKeyCredentialRequestOptions.f107215f) && com.google.android.gms.common.internal.u.b(this.f107216g, publicKeyCredentialRequestOptions.f107216g) && com.google.android.gms.common.internal.u.b(this.f107217h, publicKeyCredentialRequestOptions.f107217h) && com.google.android.gms.common.internal.u.b(this.f107218i, publicKeyCredentialRequestOptions.f107218i);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public TokenBinding f2() {
        return this.f107215f;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(Arrays.hashCode(this.f107210a)), this.f107211b, this.f107212c, this.f107213d, this.f107214e, this.f107215f, this.f107216g, this.f107217h, this.f107218i);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] n2() {
        return i6.c.n(this);
    }

    @androidx.annotation.p0
    public List<PublicKeyCredentialDescriptor> q2() {
        return this.f107213d;
    }

    @NonNull
    public String s2() {
        return this.f107212c;
    }

    @androidx.annotation.p0
    public final zzay u2() {
        return this.f107216g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, T1(), false);
        i6.b.u(parcel, 3, e2(), false);
        i6.b.Y(parcel, 4, s2(), false);
        i6.b.d0(parcel, 5, q2(), false);
        i6.b.I(parcel, 6, b2(), false);
        i6.b.S(parcel, 7, f2(), i10, false);
        zzay zzayVar = this.f107216g;
        i6.b.Y(parcel, 8, zzayVar == null ? null : zzayVar.toString(), false);
        i6.b.S(parcel, 9, O1(), i10, false);
        i6.b.N(parcel, 10, this.f107218i, false);
        i6.b.b(parcel, iA);
    }
}
