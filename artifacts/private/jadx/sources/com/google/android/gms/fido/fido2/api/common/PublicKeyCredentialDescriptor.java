package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.g({1})
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType f107205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getId", id = 3)
    private final byte[] f107206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransports", id = 4)
    @androidx.annotation.p0
    private final List f107207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.fido.v f107204d = com.google.android.gms.internal.fido.v.s(com.google.android.gms.internal.fido.s0.f108033a, com.google.android.gms.internal.fido.s0.f108034b);

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new q();

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(str);
        }

        public a(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @SafeParcelable.b
    public PublicKeyCredentialDescriptor(@NonNull @SafeParcelable.e(id = 2) String str, @NonNull @SafeParcelable.e(id = 3) byte[] bArr, @SafeParcelable.e(id = 4) @androidx.annotation.p0 List<Transport> list) {
        com.google.android.gms.common.internal.w.r(str);
        try {
            this.f107205a = PublicKeyCredentialType.b(str);
            this.f107206b = (byte[]) com.google.android.gms.common.internal.w.r(bArr);
            this.f107207c = list;
        } catch (PublicKeyCredentialType.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public byte[] O1() {
        return this.f107206b;
    }

    @androidx.annotation.p0
    public List<Transport> T1() {
        return this.f107207c;
    }

    @NonNull
    public PublicKeyCredentialType b2() {
        return this.f107205a;
    }

    @NonNull
    public String e2() {
        return this.f107205a.toString();
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (this.f107205a.equals(publicKeyCredentialDescriptor.f107205a) && Arrays.equals(this.f107206b, publicKeyCredentialDescriptor.f107206b)) {
            List list2 = this.f107207c;
            if (list2 == null && publicKeyCredentialDescriptor.f107207c == null) {
                return true;
            }
            return list2 != null && (list = publicKeyCredentialDescriptor.f107207c) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f107207c.containsAll(this.f107207c);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107205a, Integer.valueOf(Arrays.hashCode(this.f107206b)), this.f107207c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, e2(), false);
        int i11 = 3 | 3;
        i6.b.m(parcel, 3, O1(), false);
        i6.b.d0(parcel, 4, T1(), false);
        i6.b.b(parcel, iA);
    }
}
