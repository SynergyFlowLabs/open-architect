package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.g({1})
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFidoAppIdExtension", id = 2)
    @androidx.annotation.p0
    private final FidoAppIdExtension f107088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCableAuthenticationExtension", id = 3)
    @androidx.annotation.p0
    private final zzs f107089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserVerificationMethodExtension", id = 4)
    @androidx.annotation.p0
    private final UserVerificationMethodExtension f107090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleMultiAssertionExtension", id = 5)
    @androidx.annotation.p0
    private final zzz f107091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleSessionIdExtension", id = 6)
    @androidx.annotation.p0
    private final zzab f107092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleSilentVerificationExtension", id = 7)
    @androidx.annotation.p0
    private final zzad f107093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDevicePublicKeyExtension", id = 8)
    @androidx.annotation.p0
    private final zzu f107094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleTunnelServerIdExtension", id = 9)
    @androidx.annotation.p0
    private final zzag f107095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    @androidx.annotation.p0
    private final GoogleThirdPartyPaymentExtension f107096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPrfExtension", id = 11)
    @androidx.annotation.p0
    private final zzai f107097j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FidoAppIdExtension f107098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UserVerificationMethodExtension f107099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private zzs f107100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private zzz f107101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private zzab f107102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private zzad f107103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private zzu f107104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private zzag f107105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private GoogleThirdPartyPaymentExtension f107106i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private zzai f107107j;

        public a() {
        }

        @NonNull
        public AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f107098a, this.f107100c, this.f107099b, this.f107101d, this.f107102e, this.f107103f, this.f107104g, this.f107105h, this.f107106i, this.f107107j);
        }

        @NonNull
        public a b(@androidx.annotation.p0 FidoAppIdExtension fidoAppIdExtension) {
            this.f107098a = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public a c(@androidx.annotation.p0 GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f107106i = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public a d(@androidx.annotation.p0 UserVerificationMethodExtension userVerificationMethodExtension) {
            this.f107099b = userVerificationMethodExtension;
            return this;
        }

        public a(@androidx.annotation.p0 AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.f107098a = authenticationExtensions.O1();
                this.f107099b = authenticationExtensions.T1();
                this.f107100c = authenticationExtensions.b2();
                this.f107101d = authenticationExtensions.f2();
                this.f107102e = authenticationExtensions.n2();
                this.f107103f = authenticationExtensions.p2();
                this.f107104g = authenticationExtensions.e2();
                this.f107105h = authenticationExtensions.s2();
                this.f107106i = authenticationExtensions.q2();
                this.f107107j = authenticationExtensions.u2();
            }
        }
    }

    @SafeParcelable.b
    AuthenticationExtensions(@SafeParcelable.e(id = 2) @androidx.annotation.p0 FidoAppIdExtension fidoAppIdExtension, @SafeParcelable.e(id = 3) @androidx.annotation.p0 zzs zzsVar, @SafeParcelable.e(id = 4) @androidx.annotation.p0 UserVerificationMethodExtension userVerificationMethodExtension, @SafeParcelable.e(id = 5) @androidx.annotation.p0 zzz zzzVar, @SafeParcelable.e(id = 6) @androidx.annotation.p0 zzab zzabVar, @SafeParcelable.e(id = 7) @androidx.annotation.p0 zzad zzadVar, @SafeParcelable.e(id = 8) @androidx.annotation.p0 zzu zzuVar, @SafeParcelable.e(id = 9) @androidx.annotation.p0 zzag zzagVar, @SafeParcelable.e(id = 10) @androidx.annotation.p0 GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @SafeParcelable.e(id = 11) @androidx.annotation.p0 zzai zzaiVar) {
        this.f107088a = fidoAppIdExtension;
        this.f107090c = userVerificationMethodExtension;
        this.f107089b = zzsVar;
        this.f107091d = zzzVar;
        this.f107092e = zzabVar;
        this.f107093f = zzadVar;
        this.f107094g = zzuVar;
        this.f107095h = zzagVar;
        this.f107096i = googleThirdPartyPaymentExtension;
        this.f107097j = zzaiVar;
    }

    @androidx.annotation.p0
    public FidoAppIdExtension O1() {
        return this.f107088a;
    }

    @androidx.annotation.p0
    public UserVerificationMethodExtension T1() {
        return this.f107090c;
    }

    @androidx.annotation.p0
    public final zzs b2() {
        return this.f107089b;
    }

    @androidx.annotation.p0
    public final zzu e2() {
        return this.f107094g;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return com.google.android.gms.common.internal.u.b(this.f107088a, authenticationExtensions.f107088a) && com.google.android.gms.common.internal.u.b(this.f107089b, authenticationExtensions.f107089b) && com.google.android.gms.common.internal.u.b(this.f107090c, authenticationExtensions.f107090c) && com.google.android.gms.common.internal.u.b(this.f107091d, authenticationExtensions.f107091d) && com.google.android.gms.common.internal.u.b(this.f107092e, authenticationExtensions.f107092e) && com.google.android.gms.common.internal.u.b(this.f107093f, authenticationExtensions.f107093f) && com.google.android.gms.common.internal.u.b(this.f107094g, authenticationExtensions.f107094g) && com.google.android.gms.common.internal.u.b(this.f107095h, authenticationExtensions.f107095h) && com.google.android.gms.common.internal.u.b(this.f107096i, authenticationExtensions.f107096i) && com.google.android.gms.common.internal.u.b(this.f107097j, authenticationExtensions.f107097j);
    }

    @androidx.annotation.p0
    public final zzz f2() {
        return this.f107091d;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107088a, this.f107089b, this.f107090c, this.f107091d, this.f107092e, this.f107093f, this.f107094g, this.f107095h, this.f107096i, this.f107097j);
    }

    @androidx.annotation.p0
    public final zzab n2() {
        return this.f107092e;
    }

    @androidx.annotation.p0
    public final zzad p2() {
        return this.f107093f;
    }

    @androidx.annotation.p0
    public final GoogleThirdPartyPaymentExtension q2() {
        return this.f107096i;
    }

    @androidx.annotation.p0
    public final zzag s2() {
        return this.f107095h;
    }

    @androidx.annotation.p0
    public final zzai u2() {
        return this.f107097j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 2, O1(), i10, false);
        i6.b.S(parcel, 3, this.f107089b, i10, false);
        i6.b.S(parcel, 4, T1(), i10, false);
        i6.b.S(parcel, 5, this.f107091d, i10, false);
        i6.b.S(parcel, 6, this.f107092e, i10, false);
        i6.b.S(parcel, 7, this.f107093f, i10, false);
        i6.b.S(parcel, 8, this.f107094g, i10, false);
        i6.b.S(parcel, 9, this.f107095h, i10, false);
        i6.b.S(parcel, 10, this.f107096i, i10, false);
        i6.b.S(parcel, 11, this.f107097j, i10, false);
        i6.b.b(parcel, iA);
    }
}
