package com.google.zxing.aztec.encoder;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f130141e = new f(g.f130146b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f130143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130145d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f130143b = gVar;
        this.f130142a = i10;
        this.f130144c = i11;
        this.f130145d = i12;
    }

    f a(int i10) {
        int i11;
        g gVarA = this.f130143b;
        int i12 = this.f130142a;
        int i13 = this.f130145d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f130134h[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f130144c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i12, i17 + 1, i13 + i11);
        return fVar.f130144c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    f b(int i10) {
        int i11 = this.f130144c;
        return i11 == 0 ? this : new f(this.f130143b.b(i10 - i11, i11), this.f130142a, 0, this.f130145d);
    }

    int c() {
        return this.f130144c;
    }

    int d() {
        return this.f130145d;
    }

    int e() {
        return this.f130142a;
    }

    g f() {
        return this.f130143b;
    }

    boolean g(f fVar) {
        int i10;
        int i11 = this.f130145d + (d.f130134h[this.f130142a][fVar.f130142a] >> 16);
        int i12 = fVar.f130144c;
        if (i12 > 0 && ((i10 = this.f130144c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f130145d;
    }

    f h(int i10, int i11) {
        int i12 = this.f130145d;
        g gVarA = this.f130143b;
        int i13 = this.f130142a;
        if (i10 != i13) {
            int i14 = d.f130134h[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    f i(int i10, int i11) {
        g gVar = this.f130143b;
        int i12 = this.f130142a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f130136j[i12][i10], i13).a(i11, 5), this.f130142a, 0, this.f130145d + i13 + 5);
    }

    com.google.zxing.common.a j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = b(bArr.length).f130143b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f130128b[this.f130142a], Integer.valueOf(this.f130145d), Integer.valueOf(this.f130144c));
    }
}
