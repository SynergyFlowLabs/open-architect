package androidx.compose.material.ripple;

import androidx.compose.animation.core.u0;
import androidx.compose.animation.core.y3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,182:1\n85#2:183\n117#2,2:184\n85#2:186\n117#2,2:187\n225#3,8:189\n272#3,14:197\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:183\n73#1:184,2\n74#1:186\n74#1:187,2\n150#1:189,8\n150#1:197,14\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f24781l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private n0.g f24782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Float f24785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private n0.g f24786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f24787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f24788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f24789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.x<Unit> f24790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n3 f24791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n3 f24792k;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p, com.planner5d.library.engine.input.f.b.X, 80}, m = "animate", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24793a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24795c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24793a = obj;
            this.f24795c |= Integer.MIN_VALUE;
            return m.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24797b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24800b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f24800b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f24800b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24799a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f24800b.f24787f;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(1.0f);
                    y3 y3VarT = androidx.compose.animation.core.p.t(75, 0, u0.e(), 2, null);
                    this.f24799a = 1;
                    if (androidx.compose.animation.core.c.i(cVar, fE, y3VarT, null, null, this, 12, null) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.ripple.m$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0199b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24802b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0199b(m mVar, kotlin.coroutines.d<? super C0199b> dVar) {
                super(2, dVar);
                this.f24802b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0199b(this.f24802b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24801a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f24802b.f24788g;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(1.0f);
                    y3 y3VarT = androidx.compose.animation.core.p.t(225, 0, u0.d(), 2, null);
                    this.f24801a = 1;
                    if (androidx.compose.animation.core.c.i(cVar, fE, y3VarT, null, null, this, 12, null) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0199b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24804b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m mVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f24804b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f24804b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24803a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f24804b.f24789h;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(1.0f);
                    y3 y3VarT = androidx.compose.animation.core.p.t(225, 0, u0.e(), 2, null);
                    this.f24803a = 1;
                    if (androidx.compose.animation.core.c.i(cVar, fE, y3VarT, null, null, this, 12, null) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = m.this.new b(dVar);
            bVar.f24797b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f24796a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f24797b;
            int i10 = 2 << 0;
            kotlinx.coroutines.k.f(s0Var, null, null, new a(m.this, null), 3, null);
            kotlinx.coroutines.k.f(s0Var, null, null, new C0199b(m.this, null), 3, null);
            return kotlinx.coroutines.k.f(s0Var, null, null, new c(m.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24806b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f24809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f24809b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f24809b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f24808a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f24809b.f24787f;
                    int i11 = 2 ^ 0;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                    y3 y3VarT = androidx.compose.animation.core.p.t(150, 0, u0.e(), 2, null);
                    this.f24808a = 1;
                    if (androidx.compose.animation.core.c.i(cVar, fE, y3VarT, null, null, this, 12, null) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = m.this.new c(dVar);
            cVar.f24806b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f24805a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 5 & 0;
            return kotlinx.coroutines.k.f((s0) this.f24806b, null, null, new a(m.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ m(n0.g gVar, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new b(null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new c(null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean k() {
        return ((Boolean) this.f24792k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l() {
        return ((Boolean) this.f24791j.getValue()).booleanValue();
    }

    private final void m(boolean z10) {
        this.f24792k.setValue(Boolean.valueOf(z10));
    }

    private final void n(boolean z10) {
        this.f24791j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (i(r0) == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ripple.m.a
            r6 = 0
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.material.ripple.m$a r0 = (androidx.compose.material.ripple.m.a) r0
            int r1 = r0.f24795c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            r3 = r1 & r2
            r6 = 7
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f24795c = r1
            goto L1b
        L16:
            androidx.compose.material.ripple.m$a r0 = new androidx.compose.material.ripple.m$a
            r0.<init>(r8)
        L1b:
            r6 = 6
            java.lang.Object r8 = r0.f24793a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f24795c
            r3 = 3
            r4 = 2
            r5 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L47
            if (r2 == r4) goto L43
            r6 = 3
            if (r2 != r3) goto L38
            r6 = 7
            kotlin.ResultKt.m(r8)
            r6 = 1
            goto L74
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "/ sue sfi//tkev/coo w/noe t / rlbiretinooe/em/lurac"
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 4
            r7.<init>(r8)
            throw r7
        L43:
            kotlin.ResultKt.m(r8)
            goto L69
        L47:
            kotlin.ResultKt.m(r8)
            goto L5a
        L4b:
            r6 = 4
            kotlin.ResultKt.m(r8)
            r0.f24795c = r5
            r6 = 5
            java.lang.Object r8 = r7.h(r0)
            if (r8 != r1) goto L5a
            r6 = 5
            goto L72
        L5a:
            r7.n(r5)
            kotlinx.coroutines.x<kotlin.Unit> r8 = r7.f24790i
            r0.f24795c = r4
            java.lang.Object r8 = r8.q(r0)
            r6 = 3
            if (r8 != r1) goto L69
            goto L72
        L69:
            r0.f24795c = r3
            java.lang.Object r7 = r7.i(r0)
            r6 = 3
            if (r7 != r1) goto L74
        L72:
            r6 = 6
            return r1
        L74:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.m.f(kotlin.coroutines.d):java.lang.Object");
    }

    public final void g(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10) {
        if (this.f24785d == null) {
            this.f24785d = Float.valueOf(n.b(fVar.d()));
        }
        if (this.f24782a == null) {
            this.f24782a = n0.g.d(fVar.Y());
        }
        if (this.f24786e == null) {
            this.f24786e = n0.g.d(n0.h.a(n0.n.t(fVar.d()) / 2.0f, n0.n.m(fVar.d()) / 2.0f));
        }
        float fFloatValue = (!k() || l()) ? this.f24787f.v().floatValue() : 1.0f;
        Float f10 = this.f24785d;
        Intrinsics.checkNotNull(f10);
        float fR = androidx.compose.ui.util.e.r(f10.floatValue(), this.f24783b, this.f24788g.v().floatValue());
        n0.g gVar = this.f24782a;
        Intrinsics.checkNotNull(gVar);
        float fQ = n0.g.q(gVar.B());
        n0.g gVar2 = this.f24786e;
        Intrinsics.checkNotNull(gVar2);
        float fR2 = androidx.compose.ui.util.e.r(fQ, n0.g.q(gVar2.B()), this.f24789h.v().floatValue());
        n0.g gVar3 = this.f24782a;
        Intrinsics.checkNotNull(gVar3);
        float fS = n0.g.s(gVar3.B());
        n0.g gVar4 = this.f24786e;
        Intrinsics.checkNotNull(gVar4);
        long jA = n0.h.a(fR2, androidx.compose.ui.util.e.r(fS, n0.g.s(gVar4.B()), this.f24789h.v().floatValue()));
        long jW = q0.w(j10, q0.A(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f24784c) {
            androidx.compose.ui.graphics.drawscope.f.B4(fVar, jW, fR, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fT = n0.n.t(fVar.d());
        float fM = n0.n.m(fVar.d());
        int iB = p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(0.0f, 0.0f, fT, fM, iB);
            androidx.compose.ui.graphics.drawscope.f.B4(fVar, jW, fR, jA, 0.0f, null, null, 0, 120, null);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    public final void j() {
        m(true);
        this.f24790i.R(Unit.f312394a);
    }

    private m(n0.g gVar, float f10, boolean z10) {
        this.f24782a = gVar;
        this.f24783b = f10;
        this.f24784c = z10;
        this.f24787f = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
        this.f24788g = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
        this.f24789h = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
        this.f24790i = kotlinx.coroutines.z.b(null);
        Boolean bool = Boolean.FALSE;
        this.f24791j = d7.g(bool, null, 2, null);
        this.f24792k = d7.g(bool, null, 2, null);
    }
}
