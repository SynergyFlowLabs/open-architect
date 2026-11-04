package com.google.zxing.datamatrix.encoder;

import com.google.api.v;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final k[] f130449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static k[] f130450j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f130454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f130455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f130457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f130458h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, com.planner5d.library.engine.input.f.b.B, 14, 14, 16, androidx.media2.widget.f.i.f59773f0, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, v.f116371e, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f130449i = kVarArr;
        f130450j = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    private int f() {
        int i10 = this.f130456f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    private int l() {
        int i10 = this.f130456f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static k m(int i10) {
        return p(i10, l.FORCE_NONE, true);
    }

    public static k n(int i10, l lVar) {
        return p(i10, lVar, true);
    }

    public static k o(int i10, l lVar, com.google.zxing.f fVar, com.google.zxing.f fVar2, boolean z10) {
        for (k kVar : f130450j) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f130451a) && ((lVar != l.FORCE_RECTANGLE || kVar.f130451a) && ((fVar == null || (kVar.k() >= fVar.b() && kVar.j() >= fVar.a())) && ((fVar2 == null || (kVar.k() <= fVar2.b() && kVar.j() <= fVar2.a())) && i10 <= kVar.f130452b)))) {
                return kVar;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
        }
        return null;
    }

    private static k p(int i10, l lVar, boolean z10) {
        return o(i10, lVar, null, null, z10);
    }

    public static k q(int i10, boolean z10, boolean z11) {
        return p(i10, z10 ? l.FORCE_NONE : l.FORCE_SQUARE, z11);
    }

    public static void r(k[] kVarArr) {
        f130450j = kVarArr;
    }

    public int a() {
        return this.f130452b + this.f130453c;
    }

    public final int b() {
        return this.f130452b;
    }

    public int c(int i10) {
        return this.f130457g;
    }

    public final int d() {
        return this.f130453c;
    }

    public final int e(int i10) {
        return this.f130458h;
    }

    public int g() {
        return this.f130452b / this.f130457g;
    }

    public final int h() {
        return l() * this.f130455e;
    }

    public final int i() {
        return f() * this.f130454d;
    }

    public final int j() {
        return h() + (l() << 1);
    }

    public final int k() {
        return i() + (f() << 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f130451a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f130454d);
        sb2.append('x');
        sb2.append(this.f130455e);
        sb2.append(", symbol size ");
        sb2.append(k());
        sb2.append('x');
        sb2.append(j());
        sb2.append(", symbol data size ");
        sb2.append(i());
        sb2.append('x');
        sb2.append(h());
        sb2.append(", codewords ");
        sb2.append(this.f130452b);
        sb2.append('+');
        sb2.append(this.f130453c);
        return sb2.toString();
    }

    k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f130451a = z10;
        this.f130452b = i10;
        this.f130453c = i11;
        this.f130454d = i12;
        this.f130455e = i13;
        this.f130456f = i14;
        this.f130457g = i15;
        this.f130458h = i16;
    }
}
