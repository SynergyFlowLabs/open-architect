package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getRp", id = 2)
    private final PublicKeyCredentialRpEntity f107182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getUser", id = 3)
    private final PublicKeyCredentialUserEntity f107183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getChallenge", id = 4)
    private final byte[] f107184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getParameters", id = 5)
    private final List f107185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeoutSeconds", id = 6)
    @androidx.annotation.p0
    private final Double f107186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExcludeList", id = 7)
    @androidx.annotation.p0
    private final List f107187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticatorSelection", id = 8)
    @androidx.annotation.p0
    private final AuthenticatorSelectionCriteria f107188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestId", id = 9)
    @androidx.annotation.p0
    private final Integer f107189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTokenBinding", id = 10)
    @androidx.annotation.p0
    private final TokenBinding f107190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttestationConveyancePreferenceAsString", id = 11, type = "java.lang.String")
    @androidx.annotation.p0
    private final AttestationConveyancePreference f107191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticationExtensions", id = 12)
    @androidx.annotation.p0
    private final AuthenticationExtensions f107192k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PublicKeyCredentialRpEntity f107193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PublicKeyCredentialUserEntity f107194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f107195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f107196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Double f107197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f107198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AuthenticatorSelectionCriteria f107199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f107200h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private TokenBinding f107201i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private AttestationConveyancePreference f107202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AuthenticationExtensions f107203k;

        @NonNull
        public PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f107193a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f107194b;
            byte[] bArr = this.f107195c;
            List list = this.f107196d;
            Double d10 = this.f107197e;
            List list2 = this.f107198f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f107199g;
            Integer num = this.f107200h;
            TokenBinding tokenBinding = this.f107201i;
            AttestationConveyancePreference attestationConveyancePreference = this.f107202j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d10, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f107203k);
        }

        @NonNull
        public a b(@androidx.annotation.p0 AttestationConveyancePreference attestationConveyancePreference) {
            this.f107202j = attestationConveyancePreference;
            return this;
        }

        @NonNull
        public a c(@androidx.annotation.p0 AuthenticationExtensions authenticationExtensions) {
            this.f107203k = authenticationExtensions;
            return this;
        }

        @NonNull
        public a d(@androidx.annotation.p0 AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f107199g = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f107195c = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
            return this;
        }

        @NonNull
        public a f(@androidx.annotation.p0 List<PublicKeyCredentialDescriptor> list) {
            this.f107198f = list;
            return this;
        }

        @NonNull
        public a g(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f107196d = (List) com.google.android.gms.common.internal.w.r(list);
            return this;
        }

        @NonNull
        public a h(@androidx.annotation.p0 Integer num) {
            this.f107200h = num;
            return this;
        }

        @NonNull
        public a i(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f107193a = (PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.w.r(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        public a j(@androidx.annotation.p0 Double d10) {
            this.f107197e = d10;
            return this;
        }

        @NonNull
        public a k(@androidx.annotation.p0 TokenBinding tokenBinding) {
            this.f107201i = tokenBinding;
            return this;
        }

        @NonNull
        public a l(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.f107194b = (PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.w.r(publicKeyCredentialUserEntity);
            return this;
        }
    }

    @SafeParcelable.b
    PublicKeyCredentialCreationOptions(@NonNull @SafeParcelable.e(id = 2) PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull @SafeParcelable.e(id = 3) PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull @SafeParcelable.e(id = 4) byte[] bArr, @NonNull @SafeParcelable.e(id = 5) List list, @SafeParcelable.e(id = 6) @androidx.annotation.p0 Double d10, @SafeParcelable.e(id = 7) @androidx.annotation.p0 List list2, @SafeParcelable.e(id = 8) @androidx.annotation.p0 AuthenticatorSelectionCriteria authenticatorSelectionCriteria, @SafeParcelable.e(id = 9) @androidx.annotation.p0 Integer num, @SafeParcelable.e(id = 10) @androidx.annotation.p0 TokenBinding tokenBinding, @SafeParcelable.e(id = 11) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 12) @androidx.annotation.p0 AuthenticationExtensions authenticationExtensions) {
        this.f107182a = (PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.w.r(publicKeyCredentialRpEntity);
        this.f107183b = (PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.w.r(publicKeyCredentialUserEntity);
        this.f107184c = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107185d = (List) com.google.android.gms.common.internal.w.r(list);
        this.f107186e = d10;
        this.f107187f = list2;
        this.f107188g = authenticatorSelectionCriteria;
        this.f107189h = num;
        this.f107190i = tokenBinding;
        if (str != null) {
            try {
                this.f107191j = AttestationConveyancePreference.b(str);
            } catch (AttestationConveyancePreference.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f107191j = null;
        }
        this.f107192k = authenticationExtensions;
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions p2(@NonNull byte[] bArr) {
        return (PublicKeyCredentialCreationOptions) i6.c.a(bArr, CREATOR);
    }

    @NonNull
    public List<PublicKeyCredentialParameters> B2() {
        return this.f107185d;
    }

    @NonNull
    public PublicKeyCredentialRpEntity D2() {
        return this.f107182a;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public AuthenticationExtensions O1() {
        return this.f107192k;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] T1() {
        return this.f107184c;
    }

    @NonNull
    public PublicKeyCredentialUserEntity U2() {
        return this.f107183b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Integer b2() {
        return this.f107189h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public Double e2() {
        return this.f107186e;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return com.google.android.gms.common.internal.u.b(this.f107182a, publicKeyCredentialCreationOptions.f107182a) && com.google.android.gms.common.internal.u.b(this.f107183b, publicKeyCredentialCreationOptions.f107183b) && Arrays.equals(this.f107184c, publicKeyCredentialCreationOptions.f107184c) && com.google.android.gms.common.internal.u.b(this.f107186e, publicKeyCredentialCreationOptions.f107186e) && this.f107185d.containsAll(publicKeyCredentialCreationOptions.f107185d) && publicKeyCredentialCreationOptions.f107185d.containsAll(this.f107185d) && (((list = this.f107187f) == null && publicKeyCredentialCreationOptions.f107187f == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f107187f) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f107187f.containsAll(this.f107187f))) && com.google.android.gms.common.internal.u.b(this.f107188g, publicKeyCredentialCreationOptions.f107188g) && com.google.android.gms.common.internal.u.b(this.f107189h, publicKeyCredentialCreationOptions.f107189h) && com.google.android.gms.common.internal.u.b(this.f107190i, publicKeyCredentialCreationOptions.f107190i) && com.google.android.gms.common.internal.u.b(this.f107191j, publicKeyCredentialCreationOptions.f107191j) && com.google.android.gms.common.internal.u.b(this.f107192k, publicKeyCredentialCreationOptions.f107192k);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @androidx.annotation.p0
    public TokenBinding f2() {
        return this.f107190i;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107182a, this.f107183b, Integer.valueOf(Arrays.hashCode(this.f107184c)), this.f107185d, this.f107186e, this.f107187f, this.f107188g, this.f107189h, this.f107190i, this.f107191j, this.f107192k);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] n2() {
        return i6.c.n(this);
    }

    @androidx.annotation.p0
    public AttestationConveyancePreference q2() {
        return this.f107191j;
    }

    @androidx.annotation.p0
    public String s2() {
        AttestationConveyancePreference attestationConveyancePreference = this.f107191j;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @androidx.annotation.p0
    public AuthenticatorSelectionCriteria u2() {
        return this.f107188g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        int i11 = 5 & 0;
        i6.b.S(parcel, 2, D2(), i10, false);
        i6.b.S(parcel, 3, U2(), i10, false);
        i6.b.m(parcel, 4, T1(), false);
        i6.b.d0(parcel, 5, B2(), false);
        i6.b.u(parcel, 6, e2(), false);
        i6.b.d0(parcel, 7, z2(), false);
        i6.b.S(parcel, 8, u2(), i10, false);
        i6.b.I(parcel, 9, b2(), false);
        i6.b.S(parcel, 10, f2(), i10, false);
        i6.b.Y(parcel, 11, s2(), false);
        i6.b.S(parcel, 12, O1(), i10, false);
        i6.b.b(parcel, iA);
    }

    @androidx.annotation.p0
    public List<PublicKeyCredentialDescriptor> z2() {
        return this.f107187f;
    }
}
