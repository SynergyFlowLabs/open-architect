package androidx.compose.foundation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,535:1\n78#2:536\n111#2,2:537\n78#2:539\n111#2,2:540\n85#3:542\n117#3,2:543\n85#3:545\n117#3,2:546\n85#3:548\n117#3,2:549\n85#3:551\n61#4:552\n61#4:562\n70#5:553\n80#5:556\n70#5:563\n22#6:554\n22#6:564\n30#7:555\n202#8,5:557\n207#8,3:565\n249#8,9:568\n119#8,8:577\n119#8,8:585\n259#8,4:593\n1#9:597\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n211#1:536\n211#1:537,2\n212#1:539\n212#1:540,2\n213#1:542\n213#1:543,2\n216#1:545\n216#1:546,2\n217#1:548\n217#1:549,2\n228#1:551\n343#1:552\n349#1:562\n343#1:553\n345#1:556\n349#1:563\n343#1:554\n349#1:564\n345#1:555\n349#1:557,5\n349#1:565,3\n349#1:568,9\n359#1:577,8\n366#1:585,8\n349#1:593,4\n*E\n"})
final class m3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0, androidx.compose.ui.node.t, androidx.compose.ui.focus.j {

    @NotNull
    private final androidx.compose.runtime.n3 H1;

    @NotNull
    private final androidx.compose.runtime.l3 X;

    @NotNull
    private final androidx.compose.runtime.l3 Y;

    @NotNull
    private final androidx.compose.runtime.n3 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f18092g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final n7 f18093h3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f18094p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f18095p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f18096p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18098t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f18100w;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18101a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18101a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {379, 380}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p2 f18103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m3 f18104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.p2 p2Var, m3 m3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f18103b = p2Var;
            this.f18104c = m3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f18103b, this.f18104c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r6.S9(r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 5
                int r1 = r5.f18102a
                r2 = 2
                r4 = 3
                r3 = 1
                r4 = 4
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                goto L41
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "o s llrwc/ur  fte/e /teimaonbecit/her/ o/v/ou/seiko"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 0
                r5.<init>(r6)
                throw r5
            L20:
                kotlin.ResultKt.m(r6)
                goto L35
            L24:
                kotlin.ResultKt.m(r6)
                kotlinx.coroutines.p2 r6 = r5.f18103b
                if (r6 == 0) goto L35
                r5.f18102a = r3
                java.lang.Object r6 = r6.d1(r5)
                r4 = 6
                if (r6 != r0) goto L35
                goto L40
            L35:
                r4 = 3
                androidx.compose.foundation.m3 r6 = r5.f18104c
                r5.f18102a = r2
                java.lang.Object r5 = androidx.compose.foundation.m3.H9(r6, r5)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18105a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44016q, 418, 422, 422}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Float, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f18107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f18108b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f18109c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m3 f18110d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m3 m3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f18110d = m3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f18110d, dVar);
                aVar.f18109c = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
            
                if (r0.C(r1, r20) == r8) goto L36;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m3.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Float f10, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(f10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float m(m3 m3Var) {
            int i10 = 6 << 0;
            if (m3Var.L9() <= m3Var.K9()) {
                return null;
            }
            if (!h3.f(m3Var.J9(), h3.f15511b.b()) || m3Var.N9()) {
                return Float.valueOf(m3Var.L9() + m3Var.P9());
            }
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m3.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18105a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final m3 m3Var = m3.this;
                kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: androidx.compose.foundation.n3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m3.c.m(m3Var);
                    }
                });
                a aVar = new a(m3.this, null);
                this.f18105a = 1;
                if (kotlinx.coroutines.flow.k.C(iVarY, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ m3(int i10, int i11, int i12, int i13, p3 p3Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13, p3Var, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9(androidx.compose.ui.graphics.drawscope.c cVar, androidx.compose.ui.graphics.drawscope.f fVar) {
        cVar.E4();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K9() {
        return this.Y.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L9() {
        return this.X.m1();
    }

    private final float M9() {
        float fSignum = Math.signum(this.f18100w);
        int i10 = a.f18101a[androidx.compose.ui.node.k.t(this).ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            i11 = -1;
        }
        return fSignum * i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N9() {
        return ((Boolean) this.Z.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P9() {
        return ((Number) this.f18093h3.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q9(androidx.compose.ui.layout.i2 i2Var, m3 m3Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.A0(aVar, i2Var, kotlin.math.b.L0((-m3Var.f18092g3.v().floatValue()) * m3Var.M9()), 0, 0.0f, null, 12, null);
        return Unit.f312394a;
    }

    private final void R9() {
        kotlinx.coroutines.p2 p2Var = this.f18094p0;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        if (a9()) {
            this.f18094p0 = kotlinx.coroutines.k.f(Q8(), null, null, new b(p2Var, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S9(kotlin.coroutines.d<? super Unit> dVar) {
        Object objH;
        return (this.f18097s > 0 && (objH = kotlinx.coroutines.i.h(c2.f14001a, new c(null), dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objH : Unit.f312394a;
    }

    private final void U9(int i10) {
        this.Y.j(i10);
    }

    private final void V9(int i10) {
        this.X.j(i10);
    }

    private final void W9(boolean z10) {
        this.Z.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y9(p3 p3Var, m3 m3Var) {
        return p3Var.a(androidx.compose.ui.node.k.q(m3Var), m3Var.L9(), m3Var.K9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int J9() {
        return ((h3) this.f18096p2.getValue()).i();
    }

    @NotNull
    public final p3 O9() {
        return (p3) this.H1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    @Override // androidx.compose.ui.node.t
    public void P(@NotNull final androidx.compose.ui.graphics.drawscope.c cVar) {
        boolean z10;
        float fFloatValue = this.f18092g3.v().floatValue() * M9();
        if (M9() == 1.0f) {
            if (this.f18092g3.v().floatValue() < L9()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f18092g3.v().floatValue() < K9()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = M9() != 1.0f ? this.f18092g3.v().floatValue() > ((float) P9()) : this.f18092g3.v().floatValue() > ((float) ((L9() + P9()) - K9()));
        float fL9 = M9() == 1.0f ? L9() + P9() : (-L9()) - P9();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.d() & com.rabbitmq.client.k0.f265952a));
        androidx.compose.ui.graphics.layer.c cVar2 = this.f18095p1;
        if (cVar2 != null) {
            cVar.H3(cVar2, androidx.compose.ui.unit.u.e((((long) L9()) << 32) | (((long) kotlin.math.b.L0(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a)), new Function1() { // from class: androidx.compose.foundation.j3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m3.I9(cVar, (androidx.compose.ui.graphics.drawscope.f) obj);
                }
            });
        }
        float fK9 = fFloatValue + K9();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & cVar.d()));
        int iB = androidx.compose.ui.graphics.p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(fFloatValue, 0.0f, fK9, fIntBitsToFloat2, iB);
            androidx.compose.ui.graphics.layer.c cVar3 = this.f18095p1;
            if (cVar3 != null) {
                if (z10) {
                    androidx.compose.ui.graphics.layer.e.a(cVar, cVar3);
                }
                if (z11) {
                    cVar.Z3().i().c(fL9, 0.0f);
                    try {
                        androidx.compose.ui.graphics.layer.e.a(cVar, cVar3);
                        cVar.Z3().i().c(-fL9, -0.0f);
                    } catch (Throwable th2) {
                        cVar.Z3().i().c(-fL9, -0.0f);
                        throw th2;
                    }
                }
            } else {
                if (z10) {
                    cVar.E4();
                }
                if (z11) {
                    cVar.Z3().i().c(fL9, 0.0f);
                    try {
                        cVar.E4();
                        cVar.Z3().i().c(-fL9, -0.0f);
                    } catch (Throwable th3) {
                        cVar.Z3().i().c(-fL9, -0.0f);
                        throw th3;
                    }
                }
            }
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } catch (Throwable th4) {
            dVarZ3.f().B();
            dVarZ3.g(jD);
            throw th4;
        }
    }

    public final void T9(int i10) {
        this.f18096p2.setValue(h3.c(i10));
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return 0;
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    public final void X9(@NotNull p3 p3Var) {
        this.H1.setValue(p3Var);
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull androidx.compose.ui.focus.p0 p0Var) {
        W9(p0Var.n());
    }

    public final void Z9(int i10, int i11, int i12, int i13, @NotNull p3 p3Var, float f10) {
        X9(p3Var);
        T9(i11);
        if (this.f18097s == i10 && this.f18098t == i12 && this.f18099v == i13 && androidx.compose.ui.unit.h.x(this.f18100w, f10)) {
            return;
        }
        this.f18097s = i10;
        this.f18098t = i12;
        this.f18099v = i13;
        this.f18100w = f10;
        R9();
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        U9(androidx.compose.ui.unit.c.i(j10, i2VarP0.h1()));
        V9(i2VarP0.h1());
        return androidx.compose.ui.layout.c1.h6(c1Var, K9(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m3.Q9(i2VarP0, this, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        androidx.compose.ui.graphics.layer.c cVar = this.f18095p1;
        androidx.compose.ui.graphics.o1 o1VarR = androidx.compose.ui.node.k.r(this);
        if (cVar != null) {
            o1VarR.c(cVar);
        }
        this.f18095p1 = o1VarR.b();
        R9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        kotlinx.coroutines.p2 p2Var = this.f18094p0;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f18094p0 = null;
        androidx.compose.ui.graphics.layer.c cVar = this.f18095p1;
        if (cVar != null) {
            androidx.compose.ui.node.k.r(this).c(cVar);
            this.f18095p1 = null;
        }
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(Integer.MAX_VALUE);
    }

    private m3(int i10, int i11, int i12, int i13, final p3 p3Var, float f10) {
        this.f18097s = i10;
        this.f18098t = i12;
        this.f18099v = i13;
        this.f18100w = f10;
        this.X = e6.b(0);
        this.Y = e6.b(0);
        this.Z = d7.g(Boolean.FALSE, null, 2, null);
        this.H1 = d7.g(p3Var, null, 2, null);
        this.f18096p2 = d7.g(h3.c(i11), null, 2, null);
        this.f18092g3 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
        this.f18093h3 = w6.e(new Function0() { // from class: androidx.compose.foundation.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(m3.Y9(p3Var, this));
            }
        });
    }
}
