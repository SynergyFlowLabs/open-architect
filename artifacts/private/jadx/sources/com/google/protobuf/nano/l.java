package com.google.protobuf.nano;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f126212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final byte[] f126213b;

    l(int i10, byte[] bArr) {
        this.f126212a = i10;
        this.f126213b = bArr;
    }

    int a() {
        return b.y(this.f126212a) + this.f126213b.length;
    }

    void b(b bVar) throws IOException {
        bVar.E0(this.f126212a);
        bVar.A0(this.f126213b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f126212a == lVar.f126212a && Arrays.equals(this.f126213b, lVar.f126213b);
    }

    public int hashCode() {
        return ((527 + this.f126212a) * 31) + Arrays.hashCode(this.f126213b);
    }
}
