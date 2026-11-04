package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.k;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import androidx.compose.ui.unit.c0;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import n0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class d extends a0.d implements p2, androidx.compose.ui.input.nestedscroll.a {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.a f38934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.b f38935t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private d f38936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Object f38937w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {122, 127}, m = "onPostFling-RZ2iAVY", n = {"consumed", "available", "selfConsumed"}, s = {"J$0", "J$1", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f38938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f38939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38940c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38942e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38940c = obj;
            this.f38942e |= Integer.MIN_VALUE;
            return d.this.B0(0L, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 1}, l = {115, androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "onPreFling-QWom1Mo", n = {"available", "parentPreConsumed"}, s = {"J$0", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f38943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38944b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38946d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38944b = obj;
            this.f38946d |= Integer.MIN_VALUE;
            return d.this.a4(0L, this);
        }
    }

    static final class c extends l0 implements Function0<s0> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            return d.this.y9();
        }
    }

    public d(@NotNull androidx.compose.ui.input.nestedscroll.a aVar, @Nullable androidx.compose.ui.input.nestedscroll.b bVar) {
        this.f38934s = aVar;
        this.f38935t = bVar == null ? new androidx.compose.ui.input.nestedscroll.b() : bVar;
        this.f38937w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final androidx.compose.ui.input.nestedscroll.a A9() {
        if (a9()) {
            return B9();
        }
        return null;
    }

    private final void C9() {
        if (this.f38935t.h() == this) {
            this.f38935t.m(null);
        }
    }

    private final void F9(androidx.compose.ui.input.nestedscroll.b bVar) {
        C9();
        if (bVar == null) {
            this.f38935t = new androidx.compose.ui.input.nestedscroll.b();
        } else if (!Intrinsics.areEqual(bVar, this.f38935t)) {
            this.f38935t = bVar;
        }
        if (a9()) {
            G9();
        }
    }

    private final void G9() {
        this.f38935t.m(this);
        this.f38935t.l(null);
        this.f38936v = null;
        this.f38935t.k(new c());
        this.f38935t.n(Q8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 y9() {
        s0 s0VarY9;
        if (!k.f39211n) {
            d dVarB9 = B9();
            if (dVarB9 != null && (s0VarY9 = dVarB9.y9()) != null) {
                return s0VarY9;
            }
            s0 s0VarJ = this.f38935t.j();
            if (s0VarJ != null) {
                return s0VarJ;
            }
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        d dVarB10 = B9();
        s0 s0VarY10 = dVarB10 != null ? dVarB10.y9() : null;
        if (s0VarY10 != null && t0.k(s0VarY10)) {
            return s0VarY10;
        }
        s0 s0VarJ2 = this.f38935t.j();
        if (s0VarJ2 != null) {
            return s0VarJ2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private static /* synthetic */ void z9() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        a aVar;
        long j12;
        long jV;
        long jA;
        long j13;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f38942e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f38942e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objB0 = aVar2.f38940c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f38942e;
        if (i11 == 0) {
            ResultKt.m(objB0);
            androidx.compose.ui.input.nestedscroll.a aVar3 = this.f38934s;
            aVar2.f38938a = j10;
            aVar2.f38939b = j11;
            aVar2.f38942e = 1;
            objB0 = aVar3.B0(j10, j11, aVar2);
            if (objB0 != objL) {
                j12 = j11;
            }
            return objL;
        }
        if (i11 == 1) {
            long j14 = aVar2.f38939b;
            long j15 = aVar2.f38938a;
            ResultKt.m(objB0);
            j12 = j14;
            j10 = j15;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = aVar2.f38938a;
            ResultKt.m(objB0);
        }
        jA = ((c0) objB0).v();
        jV = j13;
        return c0.b(c0.q(jV, jA));
        jV = ((c0) objB0).v();
        androidx.compose.ui.input.nestedscroll.a aVarA9 = a9() ? A9() : this.f38936v;
        if (aVarA9 != null) {
            long jQ = c0.q(j10, jV);
            long jP = c0.p(j12, jV);
            aVar2.f38938a = jV;
            aVar2.f38942e = 2;
            objB0 = aVarA9.B0(jQ, jP, aVar2);
            if (objB0 != objL) {
                j13 = jV;
                jA = ((c0) objB0).v();
                jV = j13;
            }
            return objL;
        }
        jA = c0.f42681b.a();
        return c0.b(c0.q(jV, jA));
    }

    @Nullable
    public final d B9() {
        if (a9()) {
            return (d) q2.b(this);
        }
        return null;
    }

    public final void D9(@NotNull androidx.compose.ui.input.nestedscroll.a aVar) {
        this.f38934s = aVar;
    }

    public final void E9(@Nullable d dVar) {
        this.f38936v = dVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        androidx.compose.ui.input.nestedscroll.a aVarA9 = A9();
        long jG7 = aVarA9 != null ? aVarA9.G7(j10, i10) : g.f332700b.e();
        return g.w(jG7, this.f38934s.G7(g.v(j10, jG7), i10));
    }

    public final void H9(@NotNull androidx.compose.ui.input.nestedscroll.a aVar, @Nullable androidx.compose.ui.input.nestedscroll.b bVar) {
        this.f38934s = aVar;
        F9(bVar);
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f38937w;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a4(long r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.input.nestedscroll.d.b
            if (r0 == 0) goto L14
            r0 = r10
            r6 = 7
            androidx.compose.ui.input.nestedscroll.d$b r0 = (androidx.compose.ui.input.nestedscroll.d.b) r0
            int r1 = r0.f38946d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f38946d = r1
            goto L19
        L14:
            androidx.compose.ui.input.nestedscroll.d$b r0 = new androidx.compose.ui.input.nestedscroll.d$b
            r0.<init>(r10)
        L19:
            r6 = 1
            java.lang.Object r10 = r0.f38944b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f38946d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            r6 = 1
            long r7 = r0.f38943a
            kotlin.ResultKt.m(r10)
            goto L77
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            long r8 = r0.f38943a
            kotlin.ResultKt.m(r10)
            goto L55
        L3f:
            kotlin.ResultKt.m(r10)
            r6 = 3
            androidx.compose.ui.input.nestedscroll.a r10 = r7.A9()
            r6 = 3
            if (r10 == 0) goto L5d
            r0.f38943a = r8
            r0.f38946d = r4
            java.lang.Object r10 = r10.a4(r8, r0)
            if (r10 != r1) goto L55
            goto L75
        L55:
            r6 = 2
            androidx.compose.ui.unit.c0 r10 = (androidx.compose.ui.unit.c0) r10
            long r4 = r10.v()
            goto L64
        L5d:
            r6 = 7
            androidx.compose.ui.unit.c0$a r10 = androidx.compose.ui.unit.c0.f42681b
            long r4 = r10.a()
        L64:
            androidx.compose.ui.input.nestedscroll.a r7 = r7.f38934s
            long r8 = androidx.compose.ui.unit.c0.p(r8, r4)
            r6 = 5
            r0.f38943a = r4
            r0.f38946d = r3
            java.lang.Object r10 = r7.a4(r8, r0)
            if (r10 != r1) goto L76
        L75:
            return r1
        L76:
            r7 = r4
        L77:
            androidx.compose.ui.unit.c0 r10 = (androidx.compose.ui.unit.c0) r10
            r6 = 5
            long r9 = r10.v()
            long r7 = androidx.compose.ui.unit.c0.q(r7, r9)
            r6 = 7
            androidx.compose.ui.unit.c0 r7 = androidx.compose.ui.unit.c0.b(r7)
            r6 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.d.a4(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        long jB2 = this.f38934s.b2(j10, j11, i10);
        androidx.compose.ui.input.nestedscroll.a aVarA9 = A9();
        return g.w(jB2, aVarA9 != null ? aVarA9.b2(g.w(j10, jB2), g.v(j11, jB2), i10) : g.f332700b.e());
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        G9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        d dVar = (d) e.b(this);
        this.f38936v = dVar;
        this.f38935t.l(dVar);
        C9();
    }

    @NotNull
    public final androidx.compose.ui.input.nestedscroll.a w9() {
        return this.f38934s;
    }

    @Nullable
    public final d x9() {
        return this.f38936v;
    }
}
