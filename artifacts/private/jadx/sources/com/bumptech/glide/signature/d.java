package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class d implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f97452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f97453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f97454e;

    public d(@p0 String str, long j10, int i10) {
        this.f97452c = str == null ? "" : str;
        this.f97453d = j10;
        this.f97454e = i10;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f97453d).putInt(this.f97454e).array());
        messageDigest.update(this.f97452c.getBytes(g.f96793b));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            return this.f97453d == dVar.f97453d && this.f97454e == dVar.f97454e && this.f97452c.equals(dVar.f97452c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int iHashCode = this.f97452c.hashCode() * 31;
        long j10 = this.f97453d;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f97454e;
    }
}
