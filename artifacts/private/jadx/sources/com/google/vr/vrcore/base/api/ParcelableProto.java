package com.google.vr.vrcore.base.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.sdk.deps.c7;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ParcelableProto<T extends c7> implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f129942a = null;

    public ParcelableProto() {
    }

    public void a() {
        this.f129942a = null;
    }

    public byte[] b() {
        return this.f129942a;
    }

    public int c() {
        byte[] bArr = this.f129942a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        byte[] bArr = this.f129942a;
        return bArr == null || bArr.length == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParcelableProto) {
            return Arrays.equals(((ParcelableProto) obj).f129942a, this.f129942a);
        }
        return false;
    }

    public void f(Parcel parcel) {
        if (i()) {
            parcel.readInt();
        }
        this.f129942a = parcel.createByteArray();
    }

    public void g(byte[] bArr) {
        this.f129942a = bArr;
    }

    public void h(T t10) {
        int iD = t10 != null ? t10.d() : 0;
        if (iD == 0) {
            a();
            return;
        }
        byte[] bArr = this.f129942a;
        if (bArr == null || iD != bArr.length) {
            this.f129942a = c7.j(t10);
        } else {
            c7.i(t10, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f129942a);
    }

    protected boolean i() {
        return false;
    }

    protected boolean j() {
        return false;
    }

    public String toString() {
        int iC = c();
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("ParcelableProto[");
        sb2.append(iC);
        sb2.append(" bytes]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (i()) {
            byte[] bArr = this.f129942a;
            parcel.writeInt(bArr == null ? 0 : bArr.length);
        }
        if (this.f129942a == null && j()) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(this.f129942a);
        }
    }

    public ParcelableProto(byte[] bArr) {
        g(bArr);
    }

    protected ParcelableProto(Parcel parcel) {
        f(parcel);
    }
}
