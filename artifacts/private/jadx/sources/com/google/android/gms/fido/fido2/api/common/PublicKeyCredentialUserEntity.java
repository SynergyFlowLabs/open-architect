package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getId", id = 2)
    private final byte[] f107233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getName", id = 3)
    private final String f107234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIcon", id = 4)
    @androidx.annotation.p0
    private final String f107235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getDisplayName", id = 5)
    private final String f107236d;

    @SafeParcelable.b
    public PublicKeyCredentialUserEntity(@NonNull @SafeParcelable.e(id = 2) byte[] bArr, @NonNull @SafeParcelable.e(id = 3) String str, @NonNull @SafeParcelable.e(id = 4) String str2, @NonNull @SafeParcelable.e(id = 5) String str3) {
        this.f107233a = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
        this.f107234b = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107235c = str2;
        this.f107236d = (String) com.google.android.gms.common.internal.w.r(str3);
    }

    @NonNull
    public String O1() {
        return this.f107236d;
    }

    @androidx.annotation.p0
    public String T1() {
        return this.f107235c;
    }

    @NonNull
    public byte[] b2() {
        return this.f107233a;
    }

    @NonNull
    public String e2() {
        return this.f107234b;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.f107233a, publicKeyCredentialUserEntity.f107233a) && com.google.android.gms.common.internal.u.b(this.f107234b, publicKeyCredentialUserEntity.f107234b) && com.google.android.gms.common.internal.u.b(this.f107235c, publicKeyCredentialUserEntity.f107235c) && com.google.android.gms.common.internal.u.b(this.f107236d, publicKeyCredentialUserEntity.f107236d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107233a, this.f107234b, this.f107235c, this.f107236d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, b2(), false);
        i6.b.Y(parcel, 3, e2(), false);
        i6.b.Y(parcel, 4, T1(), false);
        i6.b.Y(parcel, 5, O1(), false);
        i6.b.b(parcel, iA);
    }
}
