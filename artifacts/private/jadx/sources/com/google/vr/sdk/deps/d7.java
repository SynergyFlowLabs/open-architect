package com.google.vr.sdk.deps;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f127779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final byte[] f127780b;

    d7(int i10, byte[] bArr) {
        this.f127779a = i10;
        this.f127780b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return this.f127779a == d7Var.f127779a && Arrays.equals(this.f127780b, d7Var.f127780b);
    }

    public final int hashCode() {
        return ((this.f127779a + 527) * 31) + Arrays.hashCode(this.f127780b);
    }
}
