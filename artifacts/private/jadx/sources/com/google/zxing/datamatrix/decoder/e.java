package com.google.zxing.datamatrix.decoder;

import androidx.media2.widget.f;
import com.google.zxing.h;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e[] f130394h = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f130400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130401g;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f130402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f130403b;

        int a() {
            return this.f130402a;
        }

        int b() {
            return this.f130403b;
        }

        private b(int i10, int i11) {
            this.f130402a = i10;
            this.f130403b = i11;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f130395a = i10;
        this.f130396b = i11;
        this.f130397c = i12;
        this.f130398d = i13;
        this.f130399e = i14;
        this.f130400f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f130401g = iA;
    }

    private static e[] a() {
        int i10 = 1;
        int i11 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i11, new b(i10, 3)));
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i10, i11)));
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i10, 8)));
        int i12 = 12;
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i12, new b(i10, i12)));
        int i13 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i10, i13)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i13, new b(i10, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i10, 30)));
        int i14 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i10, i14)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i10, 44)));
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i14, new b(i10, 62)));
        int i15 = 42;
        e eVar11 = new e(11, 36, 36, 16, 16, new c(i15, new b(i10, 86)));
        int i16 = 114;
        int i17 = 48;
        e eVar12 = new e(12, 40, 40, 18, 18, new c(i17, new b(i10, i16)));
        int i18 = 144;
        int i19 = 56;
        e eVar13 = new e(13, 44, 44, 20, 20, new c(i19, new b(i10, i18)));
        e eVar14 = new e(14, 48, 48, 22, 22, new c(68, new b(i10, 174)));
        int i20 = 2;
        e eVar15 = new e(15, 52, 52, 24, 24, new c(i15, new b(i20, 102)));
        e eVar16 = new e(16, 64, 64, 14, 14, new c(i19, new b(i20, f.i.f59773f0)));
        int i21 = 4;
        e eVar17 = new e(17, 72, 72, 16, 16, new c(i14, new b(i21, 92)));
        e eVar18 = new e(18, 80, 80, 18, 18, new c(i17, new b(i21, i16)));
        e eVar19 = new e(19, 88, 88, 20, 20, new c(i19, new b(i21, i18)));
        e eVar20 = new e(20, 96, 96, 22, 22, new c(68, new b(i21, 174)));
        e eVar21 = new e(21, 104, 104, 24, 24, new c(i19, new b(6, 136)));
        e eVar22 = new e(22, 120, 120, 18, 18, new c(68, new b(6, 175)));
        e eVar23 = new e(23, 132, 132, 20, 20, new c(62, new b(8, 163)));
        e eVar24 = new e(24, 144, 144, 22, 22, new c(62, new b(8, f.i.f59797r0), new b(i20, 155)));
        int i22 = 1;
        e eVar25 = new e(25, 8, 18, 6, 16, new c(7, new b(i22, 5)));
        e eVar26 = new e(26, 8, 32, 6, 14, new c(11, new b(i22, 10)));
        int i23 = 1;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, new e(27, 12, 26, 10, 24, new c(14, new b(i23, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(i23, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i10, int i11) throws h {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw h.a();
        }
        for (e eVar : f130394h) {
            if (eVar.f130396b == i10 && eVar.f130397c == i11) {
                return eVar;
            }
        }
        throw h.a();
    }

    public int b() {
        return this.f130399e;
    }

    public int c() {
        return this.f130398d;
    }

    c d() {
        return this.f130400f;
    }

    public int e() {
        return this.f130397c;
    }

    public int f() {
        return this.f130396b;
    }

    public int g() {
        return this.f130401g;
    }

    public int i() {
        return this.f130395a;
    }

    public String toString() {
        return String.valueOf(this.f130395a);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f130404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f130405b;

        b[] a() {
            return this.f130405b;
        }

        int b() {
            return this.f130404a;
        }

        private c(int i10, b bVar) {
            this.f130404a = i10;
            this.f130405b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f130404a = i10;
            this.f130405b = new b[]{bVar, bVar2};
        }
    }
}
