package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType f107208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final COSEAlgorithmIdentifier f107209b;

    @SafeParcelable.b
    public PublicKeyCredentialParameters(@NonNull @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i10) {
        com.google.android.gms.common.internal.w.r(str);
        try {
            this.f107208a = PublicKeyCredentialType.b(str);
            com.google.android.gms.common.internal.w.r(Integer.valueOf(i10));
            try {
                this.f107209b = COSEAlgorithmIdentifier.a(i10);
            } catch (COSEAlgorithmIdentifier.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @NonNull
    public COSEAlgorithmIdentifier O1() {
        return this.f107209b;
    }

    public int T1() {
        return this.f107209b.b();
    }

    @NonNull
    public PublicKeyCredentialType b2() {
        return this.f107208a;
    }

    @NonNull
    public String e2() {
        return this.f107208a.toString();
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f107208a.equals(publicKeyCredentialParameters.f107208a) && this.f107209b.equals(publicKeyCredentialParameters.f107209b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107208a, this.f107209b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, e2(), false);
        i6.b.I(parcel, 3, Integer.valueOf(T1()), false);
        i6.b.b(parcel, iA);
    }
}
