package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.u0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f69385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f69387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u0 f69388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f69389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69390f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f69397m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f69391g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f69392h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f69393i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f69394j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f69395k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f69396l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69398n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69399o = new androidx.media3.common.util.o0();

    private static final class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f69400n = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u0 f69401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f69402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f69406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f69407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f69408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f69409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f69410j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f69411k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f69412l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f69413m;

        public a(u0 u0Var) {
            this.f69401a = u0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
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
        private void d(int i10) {
            long j10 = this.f69412l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f69402b;
                long j12 = this.f69411k;
                if (j11 != j12) {
                    int i11 = (int) (j11 - j12);
                    this.f69401a.g(j10, this.f69413m ? 1 : 0, i11, i10, null);
                }
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f69410j && this.f69407g) {
                this.f69413m = this.f69403c;
                this.f69410j = false;
            } else if (this.f69408h || this.f69407g) {
                if (z10 && this.f69409i) {
                    d(i10 + ((int) (j10 - this.f69402b)));
                }
                this.f69411k = this.f69402b;
                this.f69412l = this.f69405e;
                this.f69413m = this.f69403c;
                this.f69409i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f69406f) {
                int i12 = this.f69404d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f69404d = i12 + (i11 - i10);
                } else {
                    this.f69407g = (bArr[i13] & 128) != 0;
                    this.f69406f = false;
                }
            }
        }

        public void f() {
            this.f69406f = false;
            this.f69407g = false;
            this.f69408h = false;
            this.f69409i = false;
            this.f69410j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f69407g = false;
            this.f69408h = false;
            this.f69405e = j11;
            this.f69404d = 0;
            this.f69402b = j10;
            if (!c(i11)) {
                if (this.f69409i && !this.f69410j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f69409i = false;
                }
                if (b(i11)) {
                    this.f69408h = !this.f69410j;
                    this.f69410j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f69403c = z11;
            this.f69406f = z11 || i11 <= 9;
        }
    }

    public q(g0 g0Var, String str) {
        this.f69385a = g0Var;
        this.f69386b = str;
    }

    @il.d({"output", "sampleReader"})
    private void f() {
        androidx.media3.common.util.a.k(this.f69388d);
        k1.o(this.f69389e);
    }

    @il.m({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        this.f69389e.a(j10, i10, this.f69390f);
        if (!this.f69390f) {
            this.f69392h.b(i11);
            this.f69393i.b(i11);
            this.f69394j.b(i11);
            if (this.f69392h.c() && this.f69393i.c() && this.f69394j.c()) {
                androidx.media3.common.w wVarI = i(this.f69387c, this.f69392h, this.f69393i, this.f69394j, this.f69386b);
                this.f69388d.e(wVarI);
                com.google.common.base.j0.g0(wVarI.f61763q != -1);
                this.f69385a.f(wVarI.f61763q);
                this.f69390f = true;
            }
        }
        if (this.f69395k.b(i11)) {
            w wVar = this.f69395k;
            this.f69399o.Y(this.f69395k.f69524d, androidx.media3.container.f.N(wVar.f69524d, wVar.f69525e));
            this.f69399o.b0(5);
            this.f69385a.c(j11, this.f69399o);
        }
        if (this.f69396l.b(i11)) {
            w wVar2 = this.f69396l;
            this.f69399o.Y(this.f69396l.f69524d, androidx.media3.container.f.N(wVar2.f69524d, wVar2.f69525e));
            this.f69399o.b0(5);
            this.f69385a.c(j11, this.f69399o);
        }
    }

    @il.m({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        this.f69389e.e(bArr, i10, i11);
        if (!this.f69390f) {
            this.f69392h.a(bArr, i10, i11);
            this.f69393i.a(bArr, i10, i11);
            this.f69394j.a(bArr, i10, i11);
        }
        this.f69395k.a(bArr, i10, i11);
        this.f69396l.a(bArr, i10, i11);
    }

    private static androidx.media3.common.w i(@androidx.annotation.p0 String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f69525e;
        byte[] bArr = new byte[wVar2.f69525e + i10 + wVar3.f69525e];
        System.arraycopy(wVar.f69524d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f69524d, 0, bArr, wVar.f69525e, wVar2.f69525e);
        System.arraycopy(wVar3.f69524d, 0, bArr, wVar.f69525e + wVar2.f69525e, wVar3.f69525e);
        androidx.media3.container.f.h hVarW = androidx.media3.container.f.w(wVar2.f69524d, 3, wVar2.f69525e, null);
        androidx.media3.container.f.c cVar = hVarW.f62165c;
        return new androidx.media3.common.w.b().f0(str).U(str2).u0("video/hevc").S(cVar != null ? androidx.media3.common.util.k.g(cVar.f62139a, cVar.f62140b, cVar.f62141c, cVar.f62142d, cVar.f62143e, cVar.f62144f) : null).B0(hVarW.f62170h).d0(hVarW.f62171i).T(new androidx.media3.common.k.b().d(hVarW.f62174l).c(hVarW.f62175m).e(hVarW.f62176n).g(hVarW.f62167e + 8).b(hVarW.f62168f + 8).a()).q0(hVarW.f62172j).l0(hVarW.f62173k).m0(hVarW.f62164b + 1).g0(Collections.singletonList(bArr)).N();
    }

    @il.m({"sampleReader"})
    private void j(long j10, int i10, int i11, long j11) {
        this.f69389e.g(j10, i10, i11, j11, this.f69390f);
        if (!this.f69390f) {
            this.f69392h.e(i11);
            this.f69393i.e(i11);
            this.f69394j.e(i11);
        }
        this.f69395k.e(i11);
        this.f69396l.e(i11);
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69397m = 0L;
        this.f69398n = -9223372036854775807L;
        androidx.media3.container.f.c(this.f69391g);
        this.f69392h.d();
        this.f69393i.d();
        this.f69394j.d();
        this.f69395k.d();
        this.f69396l.d();
        this.f69385a.b();
        a aVar = this.f69389e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        int i10;
        f();
        while (o0Var.a() > 0) {
            int iF = o0Var.f();
            int iG = o0Var.g();
            byte[] bArrE = o0Var.e();
            this.f69397m += (long) o0Var.a();
            this.f69388d.b(o0Var, o0Var.a());
            while (iF < iG) {
                int iF2 = androidx.media3.container.f.f(bArrE, iF, iG, this.f69391g);
                if (iF2 == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int iJ = androidx.media3.container.f.j(bArrE, iF2);
                if (iF2 <= 0 || bArrE[iF2 - 1] != 0) {
                    i10 = 3;
                } else {
                    iF2--;
                    i10 = 4;
                }
                int i11 = iF2;
                int i12 = i10;
                int i13 = i11 - iF;
                if (i13 > 0) {
                    h(bArrE, iF, i11);
                }
                int i14 = iG - i11;
                long j10 = this.f69397m - ((long) i14);
                g(j10, i14, i13 < 0 ? -i13 : 0, this.f69398n);
                j(j10, i14, iJ, this.f69398n);
                iF = i11 + i12;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69398n = j10;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69387c = eVar.b();
        u0 u0VarA = tVar.a(eVar.c(), 2);
        this.f69388d = u0VarA;
        this.f69389e = new a(u0VarA);
        this.f69385a.d(tVar, eVar);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        f();
        if (z10) {
            this.f69385a.e();
            g(this.f69397m, 0, 0, this.f69398n);
            j(this.f69397m, 0, 48, this.f69398n);
        }
    }
}
