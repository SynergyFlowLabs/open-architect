package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FidoCredentialDetailsCreator")
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserName", id = 1)
    @androidx.annotation.p0
    private final String f107162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserDisplayName", id = 2)
    @androidx.annotation.p0
    private final String f107163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUserId", id = 3)
    @androidx.annotation.p0
    private final byte[] f107164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getCredentialId", id = 4)
    private final byte[] f107165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsDiscoverable", id = 5)
    private final boolean f107166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsPaymentCredential", id = 6)
    private final boolean f107167f;

    @SafeParcelable.b
    FidoCredentialDetails(@SafeParcelable.e(id = 1) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 2) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 3) @androidx.annotation.p0 byte[] bArr, @NonNull @SafeParcelable.e(id = 4) byte[] bArr2, @SafeParcelable.e(id = 5) boolean z10, @SafeParcelable.e(id = 6) boolean z11) {
        this.f107162a = str;
        this.f107163b = str2;
        this.f107164c = bArr;
        this.f107165d = bArr2;
        this.f107166e = z10;
        this.f107167f = z11;
    }

    @NonNull
    public static FidoCredentialDetails O1(@NonNull byte[] bArr) {
        return (FidoCredentialDetails) i6.c.a(bArr, CREATOR);
    }

    @NonNull
    public byte[] T1() {
        return this.f107165d;
    }

    public boolean b2() {
        return this.f107166e;
    }

    public boolean e2() {
        return this.f107167f;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return com.google.android.gms.common.internal.u.b(this.f107162a, fidoCredentialDetails.f107162a) && com.google.android.gms.common.internal.u.b(this.f107163b, fidoCredentialDetails.f107163b) && Arrays.equals(this.f107164c, fidoCredentialDetails.f107164c) && Arrays.equals(this.f107165d, fidoCredentialDetails.f107165d) && this.f107166e == fidoCredentialDetails.f107166e && this.f107167f == fidoCredentialDetails.f107167f;
    }

    @androidx.annotation.p0
    public String f2() {
        return this.f107163b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107162a, this.f107163b, this.f107164c, this.f107165d, Boolean.valueOf(this.f107166e), Boolean.valueOf(this.f107167f));
    }

    @androidx.annotation.p0
    public byte[] n2() {
        return this.f107164c;
    }

    @androidx.annotation.p0
    public String p2() {
        return this.f107162a;
    }

    @NonNull
    public byte[] q2() {
        return i6.c.n(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        int i11 = 6 & 0;
        i6.b.Y(parcel, 1, p2(), false);
        i6.b.Y(parcel, 2, f2(), false);
        i6.b.m(parcel, 3, n2(), false);
        i6.b.m(parcel, 4, T1(), false);
        i6.b.g(parcel, 5, b2());
        i6.b.g(parcel, 6, e2());
        i6.b.b(parcel, iA);
    }
}
