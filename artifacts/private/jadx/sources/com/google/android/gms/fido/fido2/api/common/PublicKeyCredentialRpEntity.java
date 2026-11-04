package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialRpEntityCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getId", id = 2)
    private final String f107227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getName", id = 3)
    private final String f107228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIcon", id = 4)
    @androidx.annotation.p0
    private final String f107229c;

    @SafeParcelable.b
    public PublicKeyCredentialRpEntity(@NonNull @SafeParcelable.e(id = 2) String str, @NonNull @SafeParcelable.e(id = 3) String str2, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str3) {
        this.f107227a = (String) com.google.android.gms.common.internal.w.r(str);
        this.f107228b = (String) com.google.android.gms.common.internal.w.r(str2);
        this.f107229c = str3;
    }

    @androidx.annotation.p0
    public String O1() {
        return this.f107229c;
    }

    @NonNull
    public String T1() {
        return this.f107228b;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return com.google.android.gms.common.internal.u.b(this.f107227a, publicKeyCredentialRpEntity.f107227a) && com.google.android.gms.common.internal.u.b(this.f107228b, publicKeyCredentialRpEntity.f107228b) && com.google.android.gms.common.internal.u.b(this.f107229c, publicKeyCredentialRpEntity.f107229c);
    }

    @NonNull
    public String getId() {
        return this.f107227a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107227a, this.f107228b, this.f107229c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, getId(), false);
        i6.b.Y(parcel, 3, T1(), false);
        i6.b.Y(parcel, 4, O1(), false);
        i6.b.b(parcel, iA);
    }
}
