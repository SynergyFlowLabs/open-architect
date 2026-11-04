package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f69256r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f69257s = 179;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69258t = 181;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f69259u = 184;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f69260v = 178;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final double[] f69261w = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f69262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u0 f69263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final o0 f69264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.util.o0 f69266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final w f69267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f69268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f69269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f69270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f69273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f69274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f69276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f69277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69278q;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f69279e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f69280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f69283d;

        public a(int i10) {
            this.f69283d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f69280a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f69283d;
                int length = bArr2.length;
                int i13 = this.f69281b;
                if (length < i13 + i12) {
                    this.f69283d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f69283d, this.f69281b, i12);
                this.f69281b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f69280a) {
                int i12 = this.f69281b - i11;
                this.f69281b = i12;
                if (this.f69282c != 0 || i10 != n.f69258t) {
                    this.f69280a = false;
                    return true;
                }
                this.f69282c = i12;
            } else if (i10 == n.f69257s) {
                this.f69280a = true;
            }
            byte[] bArr = f69279e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f69280a = false;
            this.f69281b = 0;
            this.f69282c = 0;
        }
    }

    public n(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    private static Pair<androidx.media3.common.w, Long> f(a aVar, String str, String str2) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f69283d, aVar.f69281b);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = 0 & 5;
        byte b10 = bArrCopyOf[5];
        int i16 = (i14 << 4) | ((b10 & 255) >> 4);
        int i17 = ((b10 & com.google.common.base.c.f116464q) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                androidx.media3.common.w wVarN = new androidx.media3.common.w.b().f0(str).U(str2).u0("video/mpeg2").B0(i16).d0(i17).q0(f11).g0(Collections.singletonList(bArrCopyOf)).N();
                i11 = (bArrCopyOf[7] & com.google.common.base.c.f116464q) - 1;
                if (i11 >= 0) {
                    dArr = f69261w;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[aVar.f69282c + 9];
                        i12 = (b11 & 96) >> 5;
                        i13 = b11 & com.google.common.base.c.I;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(wVarN, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        androidx.media3.common.w wVarN2 = new androidx.media3.common.w.b().f0(str).U(str2).u0("video/mpeg2").B0(i16).d0(i17).q0(f11).g0(Collections.singletonList(bArrCopyOf)).N();
        i11 = (bArrCopyOf[7] & com.google.common.base.c.f116464q) - 1;
        if (i11 >= 0) {
            dArr = f69261w;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[aVar.f69282c + 9];
                i12 = (b12 & 96) >> 5;
                i13 = b12 & com.google.common.base.c.I;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(wVarN2, Long.valueOf(j10));
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        androidx.media3.container.f.c(this.f69268g);
        this.f69269h.c();
        w wVar = this.f69267f;
        if (wVar != null) {
            wVar.d();
        }
        this.f69270i = 0L;
        this.f69271j = false;
        this.f69274m = -9223372036854775807L;
        this.f69276o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
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
    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        boolean z10;
        int i10;
        androidx.media3.common.util.a.k(this.f69263b);
        int iF = o0Var.f();
        int iG = o0Var.g();
        byte[] bArrE = o0Var.e();
        this.f69270i += (long) o0Var.a();
        this.f69263b.b(o0Var, o0Var.a());
        while (true) {
            int iF2 = androidx.media3.container.f.f(bArrE, iF, iG, this.f69268g);
            if (iF2 == iG) {
                break;
            }
            int i11 = iF2 + 3;
            int i12 = o0Var.e()[i11] & 255;
            int i13 = iF2 - iF;
            if (!this.f69272k) {
                if (i13 > 0) {
                    this.f69269h.a(bArrE, iF, iF2);
                }
                if (this.f69269h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<androidx.media3.common.w, Long> pairF = f(this.f69269h, (String) androidx.media3.common.util.a.g(this.f69262a), this.f69265d);
                    this.f69263b.e((androidx.media3.common.w) pairF.first);
                    this.f69273l = ((Long) pairF.second).longValue();
                    this.f69272k = true;
                }
            }
            w wVar = this.f69267f;
            if (wVar != null) {
                if (i13 > 0) {
                    wVar.a(bArrE, iF, iF2);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f69267f.b(i10)) {
                    w wVar2 = this.f69267f;
                    ((androidx.media3.common.util.o0) k1.o(this.f69266e)).Y(this.f69267f.f69524d, androidx.media3.container.f.N(wVar2.f69524d, wVar2.f69525e));
                    ((o0) k1.o(this.f69264c)).a(this.f69276o, this.f69266e);
                }
                if (i12 == f69260v && o0Var.e()[iF2 + 2] == 1) {
                    this.f69267f.e(i12);
                }
            }
            if (i12 == 0 || i12 == f69257s) {
                int i14 = iG - iF2;
                if (this.f69278q && this.f69272k) {
                    long j10 = this.f69276o;
                    if (j10 != -9223372036854775807L) {
                        this.f69263b.g(j10, this.f69277p ? 1 : 0, ((int) (this.f69270i - this.f69275n)) - i14, i14, null);
                    }
                }
                if (!this.f69271j || this.f69278q) {
                    this.f69275n = this.f69270i - ((long) i14);
                    long j11 = this.f69274m;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f69276o;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f69273l : -9223372036854775807L;
                    }
                    this.f69276o = j11;
                    this.f69277p = false;
                    this.f69274m = -9223372036854775807L;
                    z10 = true;
                    this.f69271j = true;
                } else {
                    z10 = true;
                }
                this.f69278q = i12 == 0 ? z10 : false;
            } else {
                if (i12 == f69259u) {
                    this.f69277p = true;
                }
                iG = iG;
            }
            iG = iG;
            iF = i11;
        }
        if (!this.f69272k) {
            this.f69269h.a(bArrE, iF, iG);
        }
        w wVar3 = this.f69267f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69274m = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69262a = eVar.b();
        this.f69263b = tVar.a(eVar.c(), 2);
        o0 o0Var = this.f69264c;
        if (o0Var != null) {
            o0Var.b(tVar, eVar);
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
    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        androidx.media3.common.util.a.k(this.f69263b);
        if (z10) {
            boolean z11 = this.f69277p;
            this.f69263b.g(this.f69276o, z11 ? 1 : 0, (int) (this.f69270i - this.f69275n), 0, null);
        }
    }

    n(@androidx.annotation.p0 o0 o0Var, String str) {
        this.f69264c = o0Var;
        this.f69265d = str;
        this.f69268g = new boolean[4];
        this.f69269h = new a(128);
        if (o0Var != null) {
            this.f69267f = new w(f69260v, 128);
            this.f69266e = new androidx.media3.common.util.o0();
        } else {
            this.f69267f = null;
            this.f69266e = null;
        }
        this.f69274m = -9223372036854775807L;
        this.f69276o = -9223372036854775807L;
    }
}
