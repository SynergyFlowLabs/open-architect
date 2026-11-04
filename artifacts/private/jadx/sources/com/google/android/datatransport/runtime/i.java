package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.e f103581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103582b;

    public i(@NonNull com.google.android.datatransport.e eVar, @NonNull byte[] bArr) {
        if (eVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f103581a = eVar;
        this.f103582b = bArr;
    }

    public byte[] a() {
        return this.f103582b;
    }

    public com.google.android.datatransport.e b() {
        return this.f103581a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f103581a.equals(iVar.f103581a)) {
            return Arrays.equals(this.f103582b, iVar.f103582b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f103582b) ^ ((this.f103581a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f103581a + ", bytes=[...]}";
    }
}
