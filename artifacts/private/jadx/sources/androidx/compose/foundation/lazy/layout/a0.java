package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.t4;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,281:1\n85#2:282\n117#2,2:283\n85#2:285\n117#2,2:286\n85#2:288\n117#2,2:289\n85#2:291\n117#2,2:292\n85#2:294\n117#2,2:295\n1#3:297\n32#4:298\n80#5:299\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n*L\n57#1:282\n57#1:283,2\n61#1:285\n61#1:286,2\n65#1:288\n65#1:289,2\n69#1:291\n69#1:292,2\n99#1:294\n99#1:295,2\n239#1:298\n239#1:299\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f17266s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f17267t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f17268u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f17269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.o1 f17270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f17271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<Float> f17272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> f17273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.y0<Float> f17274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f17276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n3 f17277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n3 f17278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n3 f17279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f17282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> f17283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f17284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final n3 f17285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f17286r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a0.f17268u;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17287a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17287a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f17284p;
                Float fE = kotlin.coroutines.jvm.internal.b.e(1.0f);
                this.f17287a = 1;
                if (cVar.C(fE, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f17291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f17292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.layer.c f17293e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, a0 a0Var, androidx.compose.animation.core.y0<Float> y0Var, androidx.compose.ui.graphics.layer.c cVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f17290b = z10;
            this.f17291c = a0Var;
            this.f17292d = y0Var;
            this.f17293e = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(androidx.compose.ui.graphics.layer.c cVar, a0 a0Var, androidx.compose.animation.core.c cVar2) {
            cVar.V(((Number) cVar2.v()).floatValue());
            a0Var.f17271c.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f17290b, this.f17291c, this.f17292d, this.f17293e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (r14 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                r12 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r12 = 6
                int r1 = r13.f17289a
                r2 = 0
                r12 = r2
                r3 = 1
                r3 = 2
                r12 = 5
                r4 = 1
                r12 = 4
                if (r1 == 0) goto L31
                if (r1 == r4) goto L2d
                if (r1 != r3) goto L22
                r12 = 6
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1c
                r9 = r13
                r9 = r13
                goto L7e
            L1c:
                r0 = move-exception
                r14 = r0
                r14 = r0
                r9 = r13
                r12 = 6
                goto L92
            L22:
                r12 = 6
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "tis/uolci/relkrehwo fiee/aoobvsetue//  mr nn//o  ct"
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L2d:
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1c
                goto L52
            L31:
                kotlin.ResultKt.m(r14)
                boolean r14 = r13.f17290b     // Catch: java.lang.Throwable -> L8d
                r12 = 5
                if (r14 == 0) goto L52
                r12 = 4
                androidx.compose.foundation.lazy.layout.a0 r14 = r13.f17291c     // Catch: java.lang.Throwable -> L1c
                r12 = 6
                androidx.compose.animation.core.c r14 = androidx.compose.foundation.lazy.layout.a0.f(r14)     // Catch: java.lang.Throwable -> L1c
                r12 = 5
                r1 = 0
                r12 = 2
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.e(r1)     // Catch: java.lang.Throwable -> L1c
                r13.f17289a = r4     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r14 = r14.C(r1, r13)     // Catch: java.lang.Throwable -> L1c
                r12 = 7
                if (r14 != r0) goto L52
                goto L7c
            L52:
                androidx.compose.foundation.lazy.layout.a0 r14 = r13.f17291c     // Catch: java.lang.Throwable -> L8d
                androidx.compose.animation.core.c r4 = androidx.compose.foundation.lazy.layout.a0.f(r14)     // Catch: java.lang.Throwable -> L8d
                r12 = 1
                r14 = 1065353216(0x3f800000, float:1.0)
                r12 = 7
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r14)     // Catch: java.lang.Throwable -> L8d
                androidx.compose.animation.core.y0<java.lang.Float> r6 = r13.f17292d     // Catch: java.lang.Throwable -> L8d
                r12 = 1
                androidx.compose.ui.graphics.layer.c r14 = r13.f17293e     // Catch: java.lang.Throwable -> L8d
                r12 = 2
                androidx.compose.foundation.lazy.layout.a0 r1 = r13.f17291c     // Catch: java.lang.Throwable -> L8d
                r12 = 0
                androidx.compose.foundation.lazy.layout.b0 r8 = new androidx.compose.foundation.lazy.layout.b0     // Catch: java.lang.Throwable -> L8d
                r8.<init>()     // Catch: java.lang.Throwable -> L8d
                r13.f17289a = r3     // Catch: java.lang.Throwable -> L8d
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r13
                r12 = 2
                java.lang.Object r14 = androidx.compose.animation.core.c.i(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8a
                r12 = 6
                if (r14 != r0) goto L7e
            L7c:
                r12 = 3
                return r0
            L7e:
                r12 = 6
                androidx.compose.animation.core.m r14 = (androidx.compose.animation.core.m) r14     // Catch: java.lang.Throwable -> L8a
                androidx.compose.foundation.lazy.layout.a0 r13 = r9.f17291c
                r12 = 5
                androidx.compose.foundation.lazy.layout.a0.g(r13, r2)
                kotlin.Unit r13 = kotlin.Unit.f312394a
                return r13
            L8a:
                r0 = move-exception
            L8b:
                r14 = r0
                goto L92
            L8d:
                r0 = move-exception
                r9 = r13
                r9 = r13
                r12 = 4
                goto L8b
            L92:
                androidx.compose.foundation.lazy.layout.a0 r13 = r9.f17291c
                androidx.compose.foundation.lazy.layout.a0.g(r13, r2)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f17296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.layer.c f17297d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.core.y0<Float> y0Var, androidx.compose.ui.graphics.layer.c cVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f17296c = y0Var;
            this.f17297d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(androidx.compose.ui.graphics.layer.c cVar, a0 a0Var, androidx.compose.animation.core.c cVar2) {
            cVar.V(((Number) cVar2.v()).floatValue());
            a0Var.f17271c.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new d(this.f17296c, this.f17297d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            d dVar;
            Throwable th2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17294a;
            if (i10 == 0) {
                ResultKt.m(obj);
                try {
                    androidx.compose.animation.core.c cVar = a0.this.f17284p;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                    androidx.compose.animation.core.y0<Float> y0Var = this.f17296c;
                    final androidx.compose.ui.graphics.layer.c cVar2 = this.f17297d;
                    final a0 a0Var = a0.this;
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return a0.d.m(cVar2, a0Var, (androidx.compose.animation.core.c) obj2);
                        }
                    };
                    this.f17294a = 1;
                    dVar = this;
                    try {
                        if (androidx.compose.animation.core.c.i(cVar, fE, y0Var, null, function1, dVar, 4, null) == objL) {
                            return objL;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        a0.this.G(false);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dVar = this;
                    th2 = th;
                    a0.this.G(false);
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.m(obj);
                    dVar = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    dVar = this;
                    a0.this.G(false);
                    throw th2;
                }
            }
            a0.this.F(true);
            a0.this.G(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {androidx.media2.widget.f.i.f59775g0, com.planner5d.library.engine.input.f.b.G1}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17299b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> f17301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f17302e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, long j10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f17301d = y0Var;
            this.f17302e = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(a0 a0Var, long j10, androidx.compose.animation.core.c cVar) {
            a0Var.M(androidx.compose.ui.unit.q.r(((androidx.compose.ui.unit.q) cVar.v()).x(), j10));
            a0Var.f17271c.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new e(this.f17301d, this.f17302e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
        
            if (androidx.compose.animation.core.c.i(r13, r4, r5, null, r7, r8, 4, null) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17303a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17303a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f17283o;
                androidx.compose.ui.unit.q qVarC = androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f42709b.b());
                this.f17303a = 1;
                if (cVar.C(qVarC, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            a0.this.M(androidx.compose.ui.unit.q.f42709b.b());
            a0.this.L(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17305a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17305a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f17283o;
                this.f17305a = 1;
                if (cVar.D(this) == objL) {
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17307a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17307a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f17284p;
                this.f17307a = 1;
                if (cVar.D(this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17309a;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17309a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f17284p;
                this.f17309a = 1;
                if (cVar.D(this) == objL) {
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
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        long j10 = Integer.MAX_VALUE;
        f17268u = androidx.compose.ui.unit.q.f((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    public a0(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable androidx.compose.ui.graphics.o1 o1Var, @NotNull Function0<Unit> function0) {
        this.f17269a = s0Var;
        this.f17270b = o1Var;
        this.f17271c = function0;
        Boolean bool = Boolean.FALSE;
        this.f17276h = d7.g(bool, null, 2, null);
        this.f17277i = d7.g(bool, null, 2, null);
        this.f17278j = d7.g(bool, null, 2, null);
        this.f17279k = d7.g(bool, null, 2, null);
        long j10 = f17268u;
        this.f17280l = j10;
        androidx.compose.ui.unit.q.a aVar = androidx.compose.ui.unit.q.f42709b;
        this.f17281m = aVar.b();
        this.f17282n = o1Var != null ? o1Var.b() : null;
        String str = null;
        this.f17283o = new androidx.compose.animation.core.c<>(androidx.compose.ui.unit.q.c(aVar.b()), t4.N(aVar), null, str, 12, null);
        this.f17284p = new androidx.compose.animation.core.c<>(Float.valueOf(1.0f), t4.P(kotlin.jvm.internal.z.f312833a), str, null, 12, null);
        this.f17285q = d7.g(androidx.compose.ui.unit.q.c(aVar.b()), null, 2, null);
        this.f17286r = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean z10) {
        this.f17277i.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(boolean z10) {
        this.f17279k.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z10) {
        this.f17278j.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z10) {
        this.f17276h.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(long j10) {
        this.f17285q.setValue(androidx.compose.ui.unit.q.c(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f17278j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        return ((Boolean) this.f17276h.getValue()).booleanValue();
    }

    public final boolean C() {
        return this.f17275g;
    }

    public final void D() {
        androidx.compose.ui.graphics.o1 o1Var;
        if (B()) {
            L(false);
            kotlinx.coroutines.k.f(this.f17269a, null, null, new g(null), 3, null);
        }
        if (y()) {
            E(false);
            kotlinx.coroutines.k.f(this.f17269a, null, null, new h(null), 3, null);
        }
        if (A()) {
            G(false);
            int i10 = 1 << 3;
            kotlinx.coroutines.k.f(this.f17269a, null, null, new i(null), 3, null);
        }
        this.f17275g = false;
        M(androidx.compose.ui.unit.q.f42709b.b());
        this.f17280l = f17268u;
        androidx.compose.ui.graphics.layer.c cVar = this.f17282n;
        if (cVar != null && (o1Var = this.f17270b) != null) {
            o1Var.c(cVar);
        }
        this.f17282n = null;
        this.f17272d = null;
        this.f17274f = null;
        this.f17273e = null;
    }

    public final void H(@Nullable androidx.compose.animation.core.y0<Float> y0Var) {
        this.f17272d = y0Var;
    }

    public final void I(@Nullable androidx.compose.animation.core.y0<Float> y0Var) {
        this.f17274f = y0Var;
    }

    public final void J(long j10) {
        this.f17281m = j10;
    }

    public final void K(long j10) {
        this.f17286r = j10;
    }

    public final void N(@Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var) {
        this.f17273e = y0Var;
    }

    public final void O(long j10) {
        this.f17280l = j10;
    }

    public final void m() {
        androidx.compose.ui.graphics.layer.c cVar = this.f17282n;
        androidx.compose.animation.core.y0<Float> y0Var = this.f17272d;
        if (y() || y0Var == null || cVar == null) {
            if (A()) {
                if (cVar != null) {
                    cVar.V(1.0f);
                }
                int i10 = 3 & 3;
                kotlinx.coroutines.k.f(this.f17269a, null, null, new b(null), 3, null);
                return;
            }
            return;
        }
        E(true);
        boolean zA = A();
        boolean z10 = !zA;
        if (!zA) {
            cVar.V(0.0f);
        }
        kotlinx.coroutines.k.f(this.f17269a, null, null, new c(z10, this, y0Var, cVar, null), 3, null);
    }

    public final void n() {
        androidx.compose.ui.graphics.layer.c cVar = this.f17282n;
        androidx.compose.animation.core.y0<Float> y0Var = this.f17274f;
        if (cVar == null || A() || y0Var == null) {
            return;
        }
        G(true);
        kotlinx.coroutines.k.f(this.f17269a, null, null, new d(y0Var, cVar, null), 3, null);
    }

    public final void o(long j10, boolean z10) {
        androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var = this.f17273e;
        if (y0Var == null) {
            return;
        }
        long jR = androidx.compose.ui.unit.q.r(v(), j10);
        M(jR);
        L(true);
        this.f17275g = z10;
        kotlinx.coroutines.k.f(this.f17269a, null, null, new e(y0Var, jR, null), 3, null);
    }

    public final void p() {
        if (B()) {
            kotlinx.coroutines.k.f(this.f17269a, null, null, new f(null), 3, null);
        }
    }

    @Nullable
    public final androidx.compose.animation.core.y0<Float> q() {
        return this.f17272d;
    }

    @Nullable
    public final androidx.compose.animation.core.y0<Float> r() {
        return this.f17274f;
    }

    public final long s() {
        return this.f17281m;
    }

    @Nullable
    public final androidx.compose.ui.graphics.layer.c t() {
        return this.f17282n;
    }

    public final long u() {
        return this.f17286r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((androidx.compose.ui.unit.q) this.f17285q.getValue()).x();
    }

    @Nullable
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> w() {
        return this.f17273e;
    }

    public final long x() {
        return this.f17280l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f17277i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.f17279k.getValue()).booleanValue();
    }

    public /* synthetic */ a0(kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, (i10 & 2) != 0 ? null : o1Var, (i10 & 4) != 0 ? new Function0() { // from class: androidx.compose.foundation.lazy.layout.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.b();
            }
        } : function0);
    }
}
