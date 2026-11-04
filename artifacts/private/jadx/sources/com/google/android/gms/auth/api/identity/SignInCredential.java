package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInCredentialCreator")
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getId", id = 1)
    private final String f105538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDisplayName", id = 2)
    @p0
    private final String f105539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGivenName", id = 3)
    @p0
    private final String f105540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFamilyName", id = 4)
    @p0
    private final String f105541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProfilePictureUri", id = 5)
    @p0
    private final Uri f105542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPassword", id = 6)
    @p0
    private final String f105543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleIdToken", id = 7)
    @p0
    private final String f105544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPhoneNumber", id = 8)
    @p0
    private final String f105545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPublicKeyCredential", id = 9)
    @p0
    private final PublicKeyCredential f105546i;

    @SafeParcelable.b
    SignInCredential(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) @p0 String str2, @SafeParcelable.e(id = 3) @p0 String str3, @SafeParcelable.e(id = 4) @p0 String str4, @SafeParcelable.e(id = 5) @p0 Uri uri, @SafeParcelable.e(id = 6) @p0 String str5, @SafeParcelable.e(id = 7) @p0 String str6, @SafeParcelable.e(id = 8) @p0 String str7, @SafeParcelable.e(id = 9) @p0 PublicKeyCredential publicKeyCredential) {
        this.f105538a = (String) com.google.android.gms.common.internal.w.r(str);
        this.f105539b = str2;
        this.f105540c = str3;
        this.f105541d = str4;
        this.f105542e = uri;
        this.f105543f = str5;
        this.f105544g = str6;
        this.f105545h = str7;
        this.f105546i = publicKeyCredential;
    }

    @p0
    public String O1() {
        return this.f105539b;
    }

    @p0
    public String T1() {
        return this.f105541d;
    }

    @p0
    public String b2() {
        return this.f105540c;
    }

    @p0
    public String e2() {
        return this.f105544g;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return com.google.android.gms.common.internal.u.b(this.f105538a, signInCredential.f105538a) && com.google.android.gms.common.internal.u.b(this.f105539b, signInCredential.f105539b) && com.google.android.gms.common.internal.u.b(this.f105540c, signInCredential.f105540c) && com.google.android.gms.common.internal.u.b(this.f105541d, signInCredential.f105541d) && com.google.android.gms.common.internal.u.b(this.f105542e, signInCredential.f105542e) && com.google.android.gms.common.internal.u.b(this.f105543f, signInCredential.f105543f) && com.google.android.gms.common.internal.u.b(this.f105544g, signInCredential.f105544g) && com.google.android.gms.common.internal.u.b(this.f105545h, signInCredential.f105545h) && com.google.android.gms.common.internal.u.b(this.f105546i, signInCredential.f105546i);
    }

    @p0
    public String f2() {
        return this.f105543f;
    }

    @NonNull
    public String getId() {
        return this.f105538a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105538a, this.f105539b, this.f105540c, this.f105541d, this.f105542e, this.f105543f, this.f105544g, this.f105545h, this.f105546i);
    }

    @p0
    @Deprecated
    public String n2() {
        return this.f105545h;
    }

    @p0
    public Uri p2() {
        return this.f105542e;
    }

    @p0
    public PublicKeyCredential q2() {
        return this.f105546i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, getId(), false);
        i6.b.Y(parcel, 2, O1(), false);
        i6.b.Y(parcel, 3, b2(), false);
        i6.b.Y(parcel, 4, T1(), false);
        i6.b.S(parcel, 5, p2(), i10, false);
        i6.b.Y(parcel, 6, f2(), false);
        i6.b.Y(parcel, 7, e2(), false);
        i6.b.Y(parcel, 8, n2(), false);
        i6.b.S(parcel, 9, q2(), i10, false);
        i6.b.b(parcel, iA);
    }
}
