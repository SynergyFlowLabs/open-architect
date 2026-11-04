package com.google.zxing.qrcode.decoder;

import com.rabbitmq.client.impl.k;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f130922e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j[] f130923f = b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f130926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130927d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f130928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f130929b;

        a(int i10, int i11) {
            this.f130928a = i10;
            this.f130929b = i11;
        }

        public int a() {
            return this.f130928a;
        }

        public int b() {
            return this.f130929b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f130930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a[] f130931b;

        b(int i10, a... aVarArr) {
            this.f130930a = i10;
            this.f130931b = aVarArr;
        }

        public a[] a() {
            return this.f130931b;
        }

        public int b() {
            return this.f130930a;
        }

        public int c() {
            int iA = 0;
            for (a aVar : this.f130931b) {
                iA += aVar.a();
            }
            return iA;
        }

        public int d() {
            return this.f130930a * c();
        }
    }

    private j(int i10, int[] iArr, b... bVarArr) {
        this.f130924a = i10;
        this.f130925b = iArr;
        this.f130926c = bVarArr;
        int iB = bVarArr[0].b();
        int iA = 0;
        for (a aVar : bVarArr[0].a()) {
            iA += aVar.a() * (aVar.b() + iB);
        }
        this.f130927d = iA;
    }

    private static j[] b() {
        return new j[]{new j(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new j(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new j(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new j(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new j(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new j(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new j(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new j(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new j(9, new int[]{6, 26, 46}, new b(30, new a(2, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new j(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new j(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new j(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new j(13, new int[]{6, 34, 62}, new b(26, new a(4, com.planner5d.library.engine.input.f.b.f160745y1)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new j(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new j(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new j(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new j(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, com.planner5d.library.engine.input.f.b.f160745y1), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new j(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new j(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new j(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, com.planner5d.library.engine.input.f.b.f160745y1), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new j(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, androidx.media3.extractor.metadata.dvbsi.b.f67479d), new a(4, me.relex.circleindicator.a.f332619e)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new j(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, k.b.p.f265340a), new a(7, com.planner5d.library.engine.input.f.b.B)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new j(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new j(24, new int[]{6, 28, 54, 80, com.planner5d.library.engine.input.f.b.f160742x1}, new b(30, new a(6, me.relex.circleindicator.a.f332619e), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new j(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, com.planner5d.library.engine.input.f.b.f160742x1), new a(4, com.planner5d.library.engine.input.f.b.f160745y1)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new j(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new j(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new j(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, me.relex.circleindicator.a.f332619e), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new j(29, new int[]{6, 30, 54, 78, 102, okhttp3.internal.ws.g.f334652s}, new b(30, new a(7, androidx.media3.extractor.metadata.dvbsi.b.f67479d), new a(7, me.relex.circleindicator.a.f332619e)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new j(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new j(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new j(32, new int[]{6, 34, 60, 86, com.planner5d.library.engine.input.f.b.B, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new j(33, new int[]{6, 30, 58, 86, 114, androidx.media2.widget.f.i.f59777h0}, new b(30, new a(17, 115), new a(1, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new j(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, androidx.media3.extractor.metadata.dvbsi.b.f67479d)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new j(35, new int[]{6, 30, 54, 78, 102, okhttp3.internal.ws.g.f334652s, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new j(36, new int[]{6, 24, 50, 76, 102, 128, androidx.media2.widget.f.i.f59793p0}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new j(37, new int[]{6, 28, 54, 80, com.planner5d.library.engine.input.f.b.f160742x1, 132, androidx.media2.widget.f.i.f59801t0}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, me.relex.circleindicator.a.f332619e), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new j(40, new int[]{6, 30, 58, 86, 114, androidx.media2.widget.f.i.f59777h0, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    static j c(int i10) {
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = f130922e;
            if (i12 >= iArr.length) {
                if (i11 <= 3) {
                    return i(i13);
                }
                return null;
            }
            int i14 = iArr[i12];
            if (i14 == i10) {
                return i(i12 + 7);
            }
            int iE = g.e(i10, i14);
            if (iE < i11) {
                i13 = i12 + 7;
                i11 = iE;
            }
            i12++;
        }
    }

    public static j g(int i10) throws com.google.zxing.h {
        if (i10 % 4 != 1) {
            throw com.google.zxing.h.a();
        }
        try {
            return i((i10 - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw com.google.zxing.h.a();
        }
    }

    public static j i(int i10) {
        if (i10 <= 0 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f130923f[i10 - 1];
    }

    com.google.zxing.common.b a() {
        int iE = e();
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(iE);
        bVar.r(0, 0, 9, 9);
        int i10 = iE - 8;
        bVar.r(i10, 0, 8, 9);
        bVar.r(0, i10, 9, 8);
        int length = this.f130925b.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.f130925b[i11] - 2;
            for (int i13 = 0; i13 < length; i13++) {
                if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                    bVar.r(this.f130925b[i13] - 2, i12, 5, 5);
                }
            }
        }
        int i14 = iE - 17;
        int i15 = 3 >> 1;
        bVar.r(6, 9, 1, i14);
        bVar.r(9, 6, i14, 1);
        if (this.f130924a > 6) {
            int i16 = iE - 11;
            bVar.r(i16, 0, 3, 6);
            bVar.r(0, i16, 6, 3);
        }
        return bVar;
    }

    public int[] d() {
        return this.f130925b;
    }

    public int e() {
        return (this.f130924a * 4) + 17;
    }

    public b f(f fVar) {
        return this.f130926c[fVar.ordinal()];
    }

    public int h() {
        return this.f130927d;
    }

    public int j() {
        return this.f130924a;
    }

    public String toString() {
        return String.valueOf(this.f130924a);
    }
}
