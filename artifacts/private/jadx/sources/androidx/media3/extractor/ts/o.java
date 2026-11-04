package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class o implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f69284m = "H263Reader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f69285n = 176;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69286o = 178;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f69287p = 179;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69288q = 181;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69289r = 182;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69290s = 31;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69291t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float[] f69292u = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f69293v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final o0 f69294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.util.o0 f69296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f69297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f69298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final w f69299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f69300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f69301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f69302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u0 f69303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f69305l;

    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f69306f = {0, 0, 1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f69307g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f69308h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f69309i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f69310j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f69311k = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f69312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f69316e;

        public a(int i10) {
            this.f69316e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f69312a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f69316e;
                int length = bArr2.length;
                int i13 = this.f69314c;
                if (length < i13 + i12) {
                    this.f69316e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f69316e, this.f69314c, i12);
                this.f69314c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f69313b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == o.f69287p || i10 == o.f69288q) {
                                this.f69314c -= i11;
                                this.f69312a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            androidx.media3.common.util.z.n(o.f69284m, "Unexpected start code value");
                            c();
                        } else {
                            this.f69315d = this.f69314c;
                            this.f69313b = 4;
                        }
                    } else if (i10 > 31) {
                        androidx.media3.common.util.z.n(o.f69284m, "Unexpected start code value");
                        c();
                    } else {
                        this.f69313b = 3;
                    }
                } else if (i10 != o.f69288q) {
                    androidx.media3.common.util.z.n(o.f69284m, "Unexpected start code value");
                    c();
                } else {
                    this.f69313b = 2;
                }
            } else if (i10 == o.f69285n) {
                this.f69313b = 1;
                this.f69312a = true;
            }
            byte[] bArr = f69306f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f69312a = false;
            this.f69314c = 0;
            this.f69313b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f69317i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f69318j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u0 f69319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f69320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f69322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f69323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f69324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f69325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f69326h;

        public b(u0 u0Var) {
            this.f69319a = u0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f69321c) {
                int i12 = this.f69324f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f69324f = i12 + (i11 - i10);
                } else {
                    this.f69322d = ((bArr[i13] & org.msgpack.core.h.a.f339269e) >> 6) == 0;
                    this.f69321c = false;
                }
            }
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
        public void b(long j10, int i10, boolean z10) {
            androidx.media3.common.util.a.i(this.f69326h != -9223372036854775807L);
            if (this.f69323e == o.f69289r && z10 && this.f69320b) {
                this.f69319a.g(this.f69326h, this.f69322d ? 1 : 0, (int) (j10 - this.f69325g), i10, null);
            }
            if (this.f69323e != o.f69287p) {
                this.f69325g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f69323e = i10;
            this.f69322d = false;
            this.f69320b = i10 == o.f69289r || i10 == o.f69287p;
            this.f69321c = i10 == o.f69289r;
            this.f69324f = 0;
            this.f69326h = j10;
        }

        public void d() {
            this.f69320b = false;
            this.f69321c = false;
            this.f69322d = false;
            this.f69323e = -1;
        }
    }

    public o(String str) {
        this(null, str);
    }

    private static androidx.media3.common.w f(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f69316e, aVar.f69314c);
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0(bArrCopyOf);
        n0Var.t(i10);
        n0Var.t(4);
        n0Var.r();
        n0Var.s(8);
        if (n0Var.g()) {
            n0Var.s(4);
            n0Var.s(3);
        }
        int iH = n0Var.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = n0Var.h(8);
            int iH3 = n0Var.h(8);
            if (iH3 == 0) {
                androidx.media3.common.util.z.n(f69284m, "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f69292u;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                androidx.media3.common.util.z.n(f69284m, "Invalid aspect ratio");
            }
        }
        if (n0Var.g()) {
            n0Var.s(2);
            n0Var.s(1);
            if (n0Var.g()) {
                n0Var.s(15);
                n0Var.r();
                n0Var.s(15);
                n0Var.r();
                n0Var.s(15);
                n0Var.r();
                n0Var.s(3);
                n0Var.s(11);
                n0Var.r();
                n0Var.s(15);
                n0Var.r();
            }
        }
        if (n0Var.h(2) != 0) {
            androidx.media3.common.util.z.n(f69284m, "Unhandled video object layer shape");
        }
        n0Var.r();
        int iH4 = n0Var.h(16);
        n0Var.r();
        if (n0Var.g()) {
            if (iH4 == 0) {
                androidx.media3.common.util.z.n(f69284m, "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                n0Var.s(i11);
            }
        }
        n0Var.r();
        int iH5 = n0Var.h(13);
        n0Var.r();
        int iH6 = n0Var.h(13);
        n0Var.r();
        n0Var.r();
        return new androidx.media3.common.w.b().f0(str).U(str2).u0("video/mp4v-es").B0(iH5).d0(iH6).q0(f10).g0(Collections.singletonList(bArrCopyOf)).N();
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        androidx.media3.container.f.c(this.f69297d);
        this.f69298e.c();
        b bVar = this.f69300g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f69299f;
        if (wVar != null) {
            wVar.d();
        }
        this.f69301h = 0L;
        this.f69305l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        androidx.media3.common.util.a.k(this.f69300g);
        androidx.media3.common.util.a.k(this.f69303j);
        int iF = o0Var.f();
        int iG = o0Var.g();
        byte[] bArrE = o0Var.e();
        this.f69301h += (long) o0Var.a();
        this.f69303j.b(o0Var, o0Var.a());
        while (true) {
            int iF2 = androidx.media3.container.f.f(bArrE, iF, iG, this.f69297d);
            if (iF2 == iG) {
                break;
            }
            int i10 = iF2 + 3;
            int i11 = o0Var.e()[i10] & 255;
            int i12 = iF2 - iF;
            int i13 = 0;
            if (!this.f69304k) {
                if (i12 > 0) {
                    this.f69298e.a(bArrE, iF, iF2);
                }
                if (this.f69298e.b(i11, i12 < 0 ? -i12 : 0)) {
                    u0 u0Var = this.f69303j;
                    a aVar = this.f69298e;
                    u0Var.e(f(aVar, aVar.f69315d, (String) androidx.media3.common.util.a.g(this.f69302i), this.f69295b));
                    this.f69304k = true;
                }
            }
            this.f69300g.a(bArrE, iF, iF2);
            w wVar = this.f69299f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iF2);
                } else {
                    i13 = -i12;
                }
                if (this.f69299f.b(i13)) {
                    w wVar2 = this.f69299f;
                    ((androidx.media3.common.util.o0) k1.o(this.f69296c)).Y(this.f69299f.f69524d, androidx.media3.container.f.N(wVar2.f69524d, wVar2.f69525e));
                    ((o0) k1.o(this.f69294a)).a(this.f69305l, this.f69296c);
                }
                if (i11 == f69286o && o0Var.e()[iF2 + 2] == 1) {
                    this.f69299f.e(i11);
                }
            }
            int i14 = iG - iF2;
            this.f69300g.b(this.f69301h - ((long) i14), i14, this.f69304k);
            this.f69300g.c(i11, this.f69305l);
            iF = i10;
        }
        if (!this.f69304k) {
            this.f69298e.a(bArrE, iF, iG);
        }
        this.f69300g.a(bArrE, iF, iG);
        w wVar3 = this.f69299f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69305l = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69302i = eVar.b();
        u0 u0VarA = tVar.a(eVar.c(), 2);
        this.f69303j = u0VarA;
        this.f69300g = new b(u0VarA);
        o0 o0Var = this.f69294a;
        if (o0Var != null) {
            o0Var.b(tVar, eVar);
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        androidx.media3.common.util.a.k(this.f69300g);
        if (z10) {
            this.f69300g.b(this.f69301h, 0, this.f69304k);
            this.f69300g.d();
        }
    }

    o(@androidx.annotation.p0 o0 o0Var, String str) {
        this.f69294a = o0Var;
        this.f69295b = str;
        this.f69297d = new boolean[4];
        this.f69298e = new a(128);
        this.f69305l = -9223372036854775807L;
        if (o0Var != null) {
            this.f69299f = new w(f69286o, 128);
            this.f69296c = new androidx.media3.common.util.o0();
        } else {
            this.f69299f = null;
            this.f69296c = null;
        }
    }
}
