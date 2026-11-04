package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p implements m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f55003o = "H265Reader";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f55004p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f55005q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f55006r = 21;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f55007s = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f55008t = 33;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f55009u = 34;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f55010v = 39;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f55011w = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f55012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f55013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f55014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f55015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55016e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f55024m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f55017f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f55018g = new t(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f55019h = new t(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f55020i = new t(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f55021j = new t(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t f55022k = new t(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f55025n = new androidx.media2.exoplayer.external.util.x();

    private static final class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f55026n = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.s f55027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f55028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f55029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f55031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f55032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f55033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f55034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f55035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f55036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f55037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f55038l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f55039m;

        public a(androidx.media2.exoplayer.external.extractor.s output) {
            this.f55027a = output;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void b(int i10) {
            boolean z10 = this.f55039m;
            this.f55027a.b(this.f55038l, z10 ? 1 : 0, (int) (this.f55028b - this.f55037k), i10, null);
        }

        public void a(long position, int offset) {
            if (this.f55036j && this.f55033g) {
                this.f55039m = this.f55029c;
                this.f55036j = false;
            } else if (this.f55034h || this.f55033g) {
                if (this.f55035i) {
                    b(offset + ((int) (position - this.f55028b)));
                }
                this.f55037k = this.f55028b;
                this.f55038l = this.f55031e;
                this.f55035i = true;
                this.f55039m = this.f55029c;
            }
        }

        public void c(byte[] data, int offset, int limit) {
            if (this.f55032f) {
                int i10 = this.f55030d;
                int i11 = (offset + 2) - i10;
                if (i11 >= limit) {
                    this.f55030d = i10 + (limit - offset);
                } else {
                    this.f55033g = (data[i11] & 128) != 0;
                    this.f55032f = false;
                }
            }
        }

        public void d() {
            this.f55032f = false;
            this.f55033g = false;
            this.f55034h = false;
            this.f55035i = false;
            this.f55036j = false;
        }

        public void e(long position, int offset, int nalUnitType, long pesTimeUs) {
            this.f55033g = false;
            this.f55034h = false;
            this.f55031e = pesTimeUs;
            this.f55030d = 0;
            this.f55028b = position;
            if (nalUnitType >= 32) {
                if (!this.f55036j && this.f55035i) {
                    b(offset);
                    this.f55035i = false;
                }
                if (nalUnitType <= 34) {
                    this.f55034h = !this.f55036j;
                    this.f55036j = true;
                }
            }
            boolean z10 = nalUnitType >= 16 && nalUnitType <= 21;
            this.f55029c = z10;
            this.f55032f = z10 || nalUnitType <= 9;
        }
    }

    public p(b0 seiReader) {
        this.f55012a = seiReader;
    }

    private void b(long position, int offset, int discardPadding, long pesTimeUs) {
        if (this.f55016e) {
            this.f55015d.a(position, offset);
        } else {
            this.f55018g.b(discardPadding);
            this.f55019h.b(discardPadding);
            this.f55020i.b(discardPadding);
            if (this.f55018g.c() && this.f55019h.c() && this.f55020i.c()) {
                this.f55014c.c(h(this.f55013b, this.f55018g, this.f55019h, this.f55020i));
                this.f55016e = true;
            }
        }
        if (this.f55021j.b(discardPadding)) {
            t tVar = this.f55021j;
            this.f55025n.O(this.f55021j.f55092d, androidx.media2.exoplayer.external.util.t.k(tVar.f55092d, tVar.f55093e));
            this.f55025n.R(5);
            this.f55012a.a(pesTimeUs, this.f55025n);
        }
        if (this.f55022k.b(discardPadding)) {
            t tVar2 = this.f55022k;
            this.f55025n.O(this.f55022k.f55092d, androidx.media2.exoplayer.external.util.t.k(tVar2.f55092d, tVar2.f55093e));
            this.f55025n.R(5);
            this.f55012a.a(pesTimeUs, this.f55025n);
        }
    }

    private void g(byte[] dataArray, int offset, int limit) {
        if (this.f55016e) {
            this.f55015d.c(dataArray, offset, limit);
        } else {
            this.f55018g.a(dataArray, offset, limit);
            this.f55019h.a(dataArray, offset, limit);
            this.f55020i.a(dataArray, offset, limit);
        }
        this.f55021j.a(dataArray, offset, limit);
        this.f55022k.a(dataArray, offset, limit);
    }

    private static Format h(String formatId, t vps, t sps, t pps) {
        int i10 = vps.f55093e;
        byte[] bArr = new byte[sps.f55093e + i10 + pps.f55093e];
        System.arraycopy(vps.f55092d, 0, bArr, 0, i10);
        System.arraycopy(sps.f55092d, 0, bArr, vps.f55093e, sps.f55093e);
        System.arraycopy(pps.f55092d, 0, bArr, vps.f55093e + sps.f55093e, pps.f55093e);
        androidx.media2.exoplayer.external.util.y yVar = new androidx.media2.exoplayer.external.util.y(sps.f55092d, 0, sps.f55093e);
        yVar.l(44);
        int iE = yVar.e(3);
        yVar.k();
        yVar.l(88);
        yVar.l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < iE; i12++) {
            if (yVar.d()) {
                i11 += 89;
            }
            if (yVar.d()) {
                i11 += 8;
            }
        }
        yVar.l(i11);
        if (iE > 0) {
            yVar.l((8 - iE) * 2);
        }
        yVar.h();
        int iH = yVar.h();
        if (iH == 3) {
            yVar.k();
        }
        int iH2 = yVar.h();
        int iH3 = yVar.h();
        if (yVar.d()) {
            int iH4 = yVar.h();
            int iH5 = yVar.h();
            int iH6 = yVar.h();
            int iH7 = yVar.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        int i13 = iH2;
        int i14 = iH3;
        yVar.h();
        yVar.h();
        int iH8 = yVar.h();
        for (int i15 = yVar.d() ? 0 : iE; i15 <= iE; i15++) {
            yVar.h();
            yVar.h();
            yVar.h();
        }
        yVar.h();
        yVar.h();
        yVar.h();
        yVar.h();
        yVar.h();
        yVar.h();
        if (yVar.d() && yVar.d()) {
            i(yVar);
        }
        yVar.l(2);
        if (yVar.d()) {
            yVar.l(8);
            yVar.h();
            yVar.h();
            yVar.k();
        }
        j(yVar);
        if (yVar.d()) {
            for (int i16 = 0; i16 < yVar.h(); i16++) {
                yVar.l(iH8 + 5);
            }
        }
        yVar.l(2);
        float f10 = 1.0f;
        if (yVar.d() && yVar.d()) {
            int iE2 = yVar.e(8);
            if (iE2 == 255) {
                int iE3 = yVar.e(16);
                int iE4 = yVar.e(16);
                if (iE3 != 0 && iE4 != 0) {
                    f10 = iE3 / iE4;
                }
            } else {
                float[] fArr = androidx.media2.exoplayer.external.util.t.f57688d;
                if (iE2 < fArr.length) {
                    f10 = fArr[iE2];
                } else {
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iE2);
                    androidx.media2.exoplayer.external.util.p.l(f55003o, sb2.toString());
                }
            }
        }
        return Format.H(formatId, "video/hevc", null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, null);
    }

    private static void i(androidx.media2.exoplayer.external.util.y bitArray) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (bitArray.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        bitArray.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        bitArray.g();
                    }
                } else {
                    bitArray.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void j(androidx.media2.exoplayer.external.util.y bitArray) {
        int iH = bitArray.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = bitArray.d();
            }
            if (zD) {
                bitArray.k();
                bitArray.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (bitArray.d()) {
                        bitArray.k();
                    }
                }
            } else {
                int iH2 = bitArray.h();
                int iH3 = bitArray.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    bitArray.h();
                    bitArray.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    bitArray.h();
                    bitArray.k();
                }
                i10 = i13;
            }
        }
    }

    private void k(long position, int offset, int nalUnitType, long pesTimeUs) {
        int i10;
        if (this.f55016e) {
            i10 = nalUnitType;
            this.f55015d.e(position, offset, i10, pesTimeUs);
        } else {
            i10 = nalUnitType;
            this.f55018g.e(i10);
            this.f55019h.e(i10);
            this.f55020i.e(i10);
        }
        this.f55021j.e(i10);
        this.f55022k.e(i10);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        androidx.media2.exoplayer.external.util.t.a(this.f55017f);
        this.f55018g.d();
        this.f55019h.d();
        this.f55020i.d();
        this.f55021j.d();
        this.f55022k.d();
        this.f55015d.d();
        this.f55023l = 0L;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f55024m = pesTimeUs;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        while (data.a() > 0) {
            int iC = data.c();
            int iD = data.d();
            byte[] bArr = data.f57720a;
            this.f55023l += (long) data.a();
            this.f55014c.d(data, data.a());
            while (iC < iD) {
                int iC2 = androidx.media2.exoplayer.external.util.t.c(bArr, iC, iD, this.f55017f);
                if (iC2 == iD) {
                    g(bArr, iC, iD);
                    return;
                }
                int iE = androidx.media2.exoplayer.external.util.t.e(bArr, iC2);
                int i10 = iC2 - iC;
                if (i10 > 0) {
                    g(bArr, iC, iC2);
                }
                int i11 = iD - iC2;
                long j10 = this.f55023l - ((long) i11);
                b(j10, i11, i10 < 0 ? -i10 : 0, this.f55024m);
                k(j10, i11, iE, this.f55024m);
                iC = iC2 + 3;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f55013b = idGenerator.b();
        androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 2);
        this.f55014c = sVarA;
        this.f55015d = new a(sVarA);
        this.f55012a.b(extractorOutput, idGenerator);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }
}
