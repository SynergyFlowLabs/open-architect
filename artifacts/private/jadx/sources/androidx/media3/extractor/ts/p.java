package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.u0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f69331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69334d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f69338h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f69340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u0 f69341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f69342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69343m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69345o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f69339i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f69335e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f69336f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f69337g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69344n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69346p = new androidx.media3.common.util.o0();

    private static final class b {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f69347t = 128;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u0 f69348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f69349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f69350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<androidx.media3.container.f.m> f69351d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<androidx.media3.container.f.l> f69352e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.media3.container.h f69353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f69354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f69355h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f69356i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f69357j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f69358k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f69359l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f69360m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f69361n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f69362o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f69363p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f69364q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f69365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f69366s;

        private static final class a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static final int f69367q = 2;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final int f69368r = 7;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f69369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f69370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private androidx.media3.container.f.m f69371c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f69372d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f69373e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f69374f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f69375g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f69376h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f69377i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f69378j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f69379k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f69380l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f69381m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f69382n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f69383o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f69384p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f69369a) {
                    return false;
                }
                if (!aVar.f69369a) {
                    return true;
                }
                androidx.media3.container.f.m mVar = (androidx.media3.container.f.m) androidx.media3.common.util.a.k(this.f69371c);
                androidx.media3.container.f.m mVar2 = (androidx.media3.container.f.m) androidx.media3.common.util.a.k(aVar.f69371c);
                return (this.f69374f == aVar.f69374f && this.f69375g == aVar.f69375g && this.f69376h == aVar.f69376h && (!this.f69377i || !aVar.f69377i || this.f69378j == aVar.f69378j) && (((i10 = this.f69372d) == (i11 = aVar.f69372d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f62203n) != 0 || mVar2.f62203n != 0 || (this.f69381m == aVar.f69381m && this.f69382n == aVar.f69382n)) && ((i12 != 1 || mVar2.f62203n != 1 || (this.f69383o == aVar.f69383o && this.f69384p == aVar.f69384p)) && (z10 = this.f69379k) == aVar.f69379k && (!z10 || this.f69380l == aVar.f69380l))))) ? false : true;
            }

            public void b() {
                this.f69370b = false;
                this.f69369a = false;
            }

            public boolean d() {
                int i10;
                return this.f69370b && ((i10 = this.f69373e) == 7 || i10 == 2);
            }

            public void e(androidx.media3.container.f.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f69371c = mVar;
                this.f69372d = i10;
                this.f69373e = i11;
                this.f69374f = i12;
                this.f69375g = i13;
                this.f69376h = z10;
                this.f69377i = z11;
                this.f69378j = z12;
                this.f69379k = z13;
                this.f69380l = i14;
                this.f69381m = i15;
                this.f69382n = i16;
                this.f69383o = i17;
                this.f69384p = i18;
                this.f69369a = true;
                this.f69370b = true;
            }

            public void f(int i10) {
                this.f69373e = i10;
                this.f69370b = true;
            }
        }

        public b(u0 u0Var, boolean z10, boolean z11) {
            this.f69348a = u0Var;
            this.f69349b = z10;
            this.f69350c = z11;
            this.f69360m = new a();
            this.f69361n = new a();
            byte[] bArr = new byte[128];
            this.f69354g = bArr;
            this.f69353f = new androidx.media3.container.h(bArr, 0, 0);
            g();
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
            long j10 = this.f69364q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f69357j;
                long j12 = this.f69363p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f69348a.g(j10, this.f69365r ? 1 : 0, i11, i10, null);
            }
        }

        private void h() {
            boolean zD = this.f69349b ? this.f69361n.d() : this.f69366s;
            boolean z10 = this.f69365r;
            int i10 = this.f69356i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f69365r = z10 | z11;
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x010f  */
        /* JADX WARN: Code duplicated, block: B:54:0x0114  */
        /* JADX WARN: Code duplicated, block: B:56:0x0118  */
        /* JADX WARN: Code duplicated, block: B:59:0x0122  */
        /* JADX WARN: Code duplicated, block: B:60:0x012d  */
        /* JADX WARN: Code duplicated, block: B:63:0x0133  */
        /* JADX WARN: Code duplicated, block: B:66:0x013e  */
        /* JADX WARN: Code duplicated, block: B:76:0x016d  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zE;
            boolean z12;
            int i12;
            int i13;
            int i14;
            int iH;
            int i15;
            int iH2;
            int iF;
            if (this.f69358k) {
                int i16 = i11 - i10;
                byte[] bArr2 = this.f69354g;
                int length = bArr2.length;
                int i17 = this.f69355h;
                if (length < i17 + i16) {
                    this.f69354g = Arrays.copyOf(bArr2, (i17 + i16) * 2);
                }
                System.arraycopy(bArr, i10, this.f69354g, this.f69355h, i16);
                int i18 = this.f69355h + i16;
                this.f69355h = i18;
                this.f69353f.j(this.f69354g, 0, i18);
                if (this.f69353f.c(8)) {
                    this.f69353f.l();
                    int iF2 = this.f69353f.f(2);
                    this.f69353f.m(5);
                    if (this.f69353f.d()) {
                        this.f69353f.i();
                        if (this.f69353f.d()) {
                            int i19 = this.f69353f.i();
                            if (!this.f69350c) {
                                this.f69358k = false;
                                this.f69361n.f(i19);
                                return;
                            }
                            if (this.f69353f.d()) {
                                int i20 = this.f69353f.i();
                                if (this.f69352e.indexOfKey(i20) < 0) {
                                    this.f69358k = false;
                                    return;
                                }
                                androidx.media3.container.f.l lVar = this.f69352e.get(i20);
                                androidx.media3.container.f.m mVar = this.f69351d.get(lVar.f62188b);
                                if (mVar.f62200k) {
                                    if (!this.f69353f.c(2)) {
                                        return;
                                    } else {
                                        this.f69353f.m(2);
                                    }
                                }
                                if (this.f69353f.c(mVar.f62202m)) {
                                    int iF3 = this.f69353f.f(mVar.f62202m);
                                    if (!mVar.f62201l) {
                                        if (this.f69353f.c(1)) {
                                            boolean zE2 = this.f69353f.e();
                                            if (!zE2) {
                                                z10 = zE2;
                                                z11 = false;
                                            } else {
                                                if (!this.f69353f.c(1)) {
                                                    return;
                                                }
                                                z10 = zE2;
                                                z11 = true;
                                                zE = this.f69353f.e();
                                            }
                                            if (this.f69356i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                i12 = 0;
                                            } else if (!this.f69353f.d()) {
                                                return;
                                            } else {
                                                i12 = this.f69353f.i();
                                            }
                                            i13 = mVar.f62203n;
                                            if (i13 != 0) {
                                                if (this.f69353f.c(mVar.f62204o)) {
                                                    iF = this.f69353f.f(mVar.f62204o);
                                                    if (lVar.f62189c || z10) {
                                                        i14 = iF;
                                                        iH = 0;
                                                    } else {
                                                        if (!this.f69353f.d()) {
                                                            return;
                                                        }
                                                        iH = this.f69353f.h();
                                                        i14 = iF;
                                                        i15 = 0;
                                                    }
                                                    iH2 = i15;
                                                    this.f69361n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                                    this.f69358k = false;
                                                }
                                                return;
                                            }
                                            if (i13 == 1 || mVar.f62205p) {
                                                i14 = 0;
                                                iH = 0;
                                            } else {
                                                if (!this.f69353f.d()) {
                                                    return;
                                                }
                                                int iH3 = this.f69353f.h();
                                                if (!lVar.f62189c || z10) {
                                                    i15 = iH3;
                                                    i14 = 0;
                                                    iH = 0;
                                                    iH2 = 0;
                                                } else {
                                                    if (!this.f69353f.d()) {
                                                        return;
                                                    }
                                                    iH2 = this.f69353f.h();
                                                    i15 = iH3;
                                                    i14 = 0;
                                                    iH = 0;
                                                }
                                            }
                                            this.f69361n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                            this.f69358k = false;
                                            i15 = iH;
                                            iH2 = i15;
                                            this.f69361n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                            this.f69358k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zE = z11;
                                    if (this.f69356i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        i12 = 0;
                                    } else if (!this.f69353f.d()) {
                                        return;
                                    } else {
                                        i12 = this.f69353f.i();
                                    }
                                    i13 = mVar.f62203n;
                                    if (i13 != 0) {
                                        if (i13 == 1) {
                                        }
                                        i14 = 0;
                                        iH = 0;
                                    } else {
                                        if (this.f69353f.c(mVar.f62204o)) {
                                            return;
                                        }
                                        iF = this.f69353f.f(mVar.f62204o);
                                        if (lVar.f62189c) {
                                        }
                                        i14 = iF;
                                        iH = 0;
                                    }
                                    i15 = iH;
                                    iH2 = i15;
                                    this.f69361n.e(mVar, iF2, i19, iF3, i20, z10, z11, zE, z12, i12, i14, iH, i15, iH2);
                                    this.f69358k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f69356i == 9 || (this.f69350c && this.f69361n.c(this.f69360m))) {
                if (z10 && this.f69362o) {
                    d(i10 + ((int) (j10 - this.f69357j)));
                }
                this.f69363p = this.f69357j;
                this.f69364q = this.f69359l;
                this.f69365r = false;
                this.f69362o = true;
            }
            h();
            this.f69356i = 24;
            return this.f69365r;
        }

        public boolean c() {
            return this.f69350c;
        }

        public void e(androidx.media3.container.f.l lVar) {
            this.f69352e.append(lVar.f62187a, lVar);
        }

        public void f(androidx.media3.container.f.m mVar) {
            this.f69351d.append(mVar.f62193d, mVar);
        }

        public void g() {
            this.f69358k = false;
            this.f69362o = false;
            this.f69361n.b();
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f69356i = i10;
            this.f69359l = j11;
            this.f69357j = j10;
            this.f69366s = z10;
            if (!this.f69349b || i10 != 1) {
                if (!this.f69350c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f69360m;
            this.f69360m = this.f69361n;
            this.f69361n = aVar;
            aVar.b();
            this.f69355h = 0;
            this.f69358k = true;
        }
    }

    public p(g0 g0Var, boolean z10, boolean z11, String str) {
        this.f69331a = g0Var;
        this.f69332b = z10;
        this.f69333c = z11;
        this.f69334d = str;
    }

    @il.d({"output", "sampleReader"})
    private void f() {
        androidx.media3.common.util.a.k(this.f69341k);
        k1.o(this.f69342l);
    }

    @il.m({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f69343m || this.f69342l.c()) {
            this.f69335e.b(i11);
            this.f69336f.b(i11);
            if (this.f69343m) {
                if (this.f69335e.c()) {
                    w wVar = this.f69335e;
                    androidx.media3.container.f.m mVarE = androidx.media3.container.f.E(wVar.f69524d, 3, wVar.f69525e);
                    this.f69331a.f(mVarE.f62209t);
                    this.f69342l.f(mVarE);
                    this.f69335e.d();
                } else if (this.f69336f.c()) {
                    w wVar2 = this.f69336f;
                    this.f69342l.e(androidx.media3.container.f.C(wVar2.f69524d, 3, wVar2.f69525e));
                    this.f69336f.d();
                }
            } else if (this.f69335e.c() && this.f69336f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f69335e;
                arrayList.add(Arrays.copyOf(wVar3.f69524d, wVar3.f69525e));
                w wVar4 = this.f69336f;
                arrayList.add(Arrays.copyOf(wVar4.f69524d, wVar4.f69525e));
                w wVar5 = this.f69335e;
                androidx.media3.container.f.m mVarE2 = androidx.media3.container.f.E(wVar5.f69524d, 3, wVar5.f69525e);
                w wVar6 = this.f69336f;
                androidx.media3.container.f.l lVarC = androidx.media3.container.f.C(wVar6.f69524d, 3, wVar6.f69525e);
                this.f69341k.e(new androidx.media3.common.w.b().f0(this.f69340j).U(this.f69334d).u0("video/avc").S(androidx.media3.common.util.k.d(mVarE2.f62190a, mVarE2.f62191b, mVarE2.f62192c)).B0(mVarE2.f62195f).d0(mVarE2.f62196g).T(new androidx.media3.common.k.b().d(mVarE2.f62206q).c(mVarE2.f62207r).e(mVarE2.f62208s).g(mVarE2.f62198i + 8).b(mVarE2.f62199j + 8).a()).q0(mVarE2.f62197h).g0(arrayList).l0(mVarE2.f62209t).N());
                this.f69343m = true;
                this.f69331a.f(mVarE2.f62209t);
                this.f69342l.f(mVarE2);
                this.f69342l.e(lVarC);
                this.f69335e.d();
                this.f69336f.d();
            }
        }
        if (this.f69337g.b(i11)) {
            w wVar7 = this.f69337g;
            this.f69346p.Y(this.f69337g.f69524d, androidx.media3.container.f.N(wVar7.f69524d, wVar7.f69525e));
            this.f69346p.a0(4);
            this.f69331a.c(j11, this.f69346p);
        }
        if (this.f69342l.b(j10, i10, this.f69343m)) {
            this.f69345o = false;
        }
    }

    @il.m({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f69343m || this.f69342l.c()) {
            this.f69335e.a(bArr, i10, i11);
            this.f69336f.a(bArr, i10, i11);
        }
        this.f69337g.a(bArr, i10, i11);
        this.f69342l.a(bArr, i10, i11);
    }

    @il.m({"sampleReader"})
    private void i(long j10, int i10, long j11) {
        if (!this.f69343m || this.f69342l.c()) {
            this.f69335e.e(i10);
            this.f69336f.e(i10);
        }
        this.f69337g.e(i10);
        this.f69342l.i(j10, i10, j11, this.f69345o);
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69338h = 0L;
        this.f69345o = false;
        this.f69344n = -9223372036854775807L;
        androidx.media3.container.f.c(this.f69339i);
        this.f69335e.d();
        this.f69336f.d();
        this.f69337g.d();
        this.f69331a.b();
        b bVar = this.f69342l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        int i10;
        f();
        int iF = o0Var.f();
        int iG = o0Var.g();
        byte[] bArrE = o0Var.e();
        this.f69338h += (long) o0Var.a();
        this.f69341k.b(o0Var, o0Var.a());
        while (true) {
            int iF2 = androidx.media3.container.f.f(bArrE, iF, iG, this.f69339i);
            if (iF2 == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iK = androidx.media3.container.f.k(bArrE, iF2);
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
            long j10 = this.f69338h - ((long) i14);
            g(j10, i14, i13 < 0 ? -i13 : 0, this.f69344n);
            i(j10, iK, this.f69344n);
            iF = i11 + i12;
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        this.f69344n = j10;
        this.f69345o |= (i10 & 2) != 0;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        this.f69340j = eVar.b();
        int i10 = 3 | 2;
        u0 u0VarA = tVar.a(eVar.c(), 2);
        this.f69341k = u0VarA;
        this.f69342l = new b(u0VarA, this.f69332b, this.f69333c);
        this.f69331a.d(tVar, eVar);
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        f();
        if (z10) {
            this.f69331a.e();
            g(this.f69338h, 0, 0, this.f69344n);
            i(this.f69338h, 9, this.f69344n);
            g(this.f69338h, 0, 0, this.f69344n);
        }
    }
}
