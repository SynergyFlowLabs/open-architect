package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticationExtensionsClientOutputsCreator")
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUvmEntries", id = 1)
    @androidx.annotation.p0
    private final UvmEntries f107108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDevicePubKey", id = 2)
    @androidx.annotation.p0
    private final zzf f107109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCredProps", id = 3)
    @androidx.annotation.p0
    private final AuthenticationExtensionsCredPropsOutputs f107110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPrf", id = 4)
    @androidx.annotation.p0
    private final zzh f107111d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private UvmEntries f107112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private AuthenticationExtensionsCredPropsOutputs f107113b;

        @NonNull
        public AuthenticationExtensionsClientOutputs a() {
            return new AuthenticationExtensionsClientOutputs(this.f107112a, null, this.f107113b, null);
        }

        @NonNull
        public a b(@androidx.annotation.p0 AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.f107113b = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        @NonNull
        public a c(@androidx.annotation.p0 UvmEntries uvmEntries) {
            this.f107112a = uvmEntries;
            return this;
        }
    }

    @SafeParcelable.b
    AuthenticationExtensionsClientOutputs(@SafeParcelable.e(id = 1) @androidx.annotation.p0 UvmEntries uvmEntries, @SafeParcelable.e(id = 2) @androidx.annotation.p0 zzf zzfVar, @SafeParcelable.e(id = 3) @androidx.annotation.p0 AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @SafeParcelable.e(id = 4) @androidx.annotation.p0 zzh zzhVar) {
        this.f107108a = uvmEntries;
        this.f107109b = zzfVar;
        this.f107110c = authenticationExtensionsCredPropsOutputs;
        this.f107111d = zzhVar;
    }

    @NonNull
    public static AuthenticationExtensionsClientOutputs O1(@NonNull byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) i6.c.a(bArr, CREATOR);
    }

    @androidx.annotation.p0
    public AuthenticationExtensionsCredPropsOutputs T1() {
        return this.f107110c;
    }

    @androidx.annotation.p0
    public UvmEntries b2() {
        return this.f107108a;
    }

    @NonNull
    public byte[] e2() {
        return i6.c.n(this);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return com.google.android.gms.common.internal.u.b(this.f107108a, authenticationExtensionsClientOutputs.f107108a) && com.google.android.gms.common.internal.u.b(this.f107109b, authenticationExtensionsClientOutputs.f107109b) && com.google.android.gms.common.internal.u.b(this.f107110c, authenticationExtensionsClientOutputs.f107110c) && com.google.android.gms.common.internal.u.b(this.f107111d, authenticationExtensionsClientOutputs.f107111d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107108a, this.f107109b, this.f107110c, this.f107111d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, b2(), i10, false);
        i6.b.S(parcel, 2, this.f107109b, i10, false);
        i6.b.S(parcel, 3, T1(), i10, false);
        i6.b.S(parcel, 4, this.f107111d, i10, false);
        i6.b.b(parcel, iA);
    }
}
