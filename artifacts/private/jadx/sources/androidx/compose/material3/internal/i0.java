package androidx.compose.material3.internal;

import androidx.compose.runtime.k7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nAnimatedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedShape.kt\nandroidx/compose/material3/internal/AnimatedShapeState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f28929i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.shape.n f28930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<Float> f28931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28932c = n0.n.f332724b.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f28933d = androidx.compose.ui.unit.f.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f28937h;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2", f = "AnimatedShape.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super kotlinx.coroutines.p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28939b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.shape.e f28941d;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.i0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1", f = "AnimatedShape.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
        static final class C0229a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f28943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.shape.e f28944c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0229a(i0 i0Var, androidx.compose.foundation.shape.e eVar, kotlin.coroutines.d<? super C0229a> dVar) {
                super(2, dVar);
                this.f28943b = i0Var;
                this.f28944c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0229a(this.f28943b, this.f28944c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28942a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f28943b.f28934e;
                    if (cVar != null) {
                        Float fE = kotlin.coroutines.jvm.internal.b.e(this.f28944c.h().a(this.f28943b.l(), this.f28943b.j()));
                        androidx.compose.animation.core.y0<Float> y0VarM = this.f28943b.m();
                        this.f28942a = 1;
                        obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarM, null, null, this, 12, null);
                        if (obj == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0229a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2", f = "AnimatedShape.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f28946b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.shape.e f28947c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i0 i0Var, androidx.compose.foundation.shape.e eVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f28946b = i0Var;
                this.f28947c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f28946b, this.f28947c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28945a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f28946b.f28935f;
                    if (cVar != null) {
                        Float fE = kotlin.coroutines.jvm.internal.b.e(this.f28947c.g().a(this.f28946b.l(), this.f28946b.j()));
                        androidx.compose.animation.core.y0<Float> y0VarM = this.f28946b.m();
                        this.f28945a = 1;
                        obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarM, null, null, this, 12, null);
                        if (obj == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3", f = "AnimatedShape.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f28949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.shape.e f28950c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i0 i0Var, androidx.compose.foundation.shape.e eVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f28949b = i0Var;
                this.f28950c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f28949b, this.f28950c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28948a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f28949b.f28936g;
                    if (cVar != null) {
                        Float fE = kotlin.coroutines.jvm.internal.b.e(this.f28950c.f().a(this.f28949b.l(), this.f28949b.j()));
                        androidx.compose.animation.core.y0<Float> y0VarM = this.f28949b.m();
                        this.f28948a = 1;
                        obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarM, null, null, this, 12, null);
                        if (obj == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4", f = "AnimatedShape.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f28952b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.shape.e f28953c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(i0 i0Var, androidx.compose.foundation.shape.e eVar, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f28952b = i0Var;
                this.f28953c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new d(this.f28952b, this.f28953c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28951a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.animation.core.c cVar = this.f28952b.f28937h;
                    if (cVar != null) {
                        Float fE = kotlin.coroutines.jvm.internal.b.e(this.f28953c.e().a(this.f28952b.l(), this.f28952b.j()));
                        androidx.compose.animation.core.y0<Float> y0VarM = this.f28952b.m();
                        this.f28951a = 1;
                        obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarM, null, null, this, 12, null);
                        if (obj == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.shape.e eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f28941d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = i0.this.new a(this.f28941d, dVar);
            aVar.f28939b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f28938a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f28939b;
            kotlinx.coroutines.k.f(s0Var, null, null, new C0229a(i0.this, this.f28941d, null), 3, null);
            kotlinx.coroutines.k.f(s0Var, null, null, new b(i0.this, this.f28941d, null), 3, null);
            kotlinx.coroutines.k.f(s0Var, null, null, new c(i0.this, this.f28941d, null), 3, null);
            return kotlinx.coroutines.k.f(s0Var, null, null, new d(i0.this, this.f28941d, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super kotlinx.coroutines.p2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i0(@NotNull androidx.compose.foundation.shape.n nVar, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f28930a = nVar;
        this.f28931b = y0Var;
        boolean z10 = false;
    }

    public static /* synthetic */ float g(i0 i0Var, long j10, androidx.compose.ui.unit.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i0Var.f28932c;
        }
        if ((i10 & 2) != 0) {
            dVar = i0Var.f28933d;
        }
        return i0Var.f(j10, dVar);
    }

    public static /* synthetic */ float i(i0 i0Var, long j10, androidx.compose.ui.unit.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i0Var.f28932c;
        }
        if ((i10 & 2) != 0) {
            dVar = i0Var.f28933d;
        }
        return i0Var.h(j10, dVar);
    }

    public static /* synthetic */ float q(i0 i0Var, long j10, androidx.compose.ui.unit.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i0Var.f28932c;
        }
        if ((i10 & 2) != 0) {
            dVar = i0Var.f28933d;
        }
        return i0Var.p(j10, dVar);
    }

    public static /* synthetic */ float s(i0 i0Var, long j10, androidx.compose.ui.unit.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i0Var.f28932c;
        }
        if ((i10 & 2) != 0) {
            dVar = i0Var.f28933d;
        }
        return i0Var.r(j10, dVar);
    }

    @Nullable
    public final Object e(@NotNull androidx.compose.foundation.shape.e eVar, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.p2> dVar) {
        return kotlinx.coroutines.t0.g(new a(eVar, null), dVar);
    }

    public final float f(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarB = this.f28937h;
        if (cVarB == null) {
            cVarB = androidx.compose.animation.core.d.b(this.f28930a.e().a(j10, dVar), 0.0f, 2, null);
            this.f28937h = cVarB;
        }
        return cVarB.v().floatValue();
    }

    public final float h(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarB = this.f28936g;
        if (cVarB == null) {
            int i10 = 1 | 2;
            cVarB = androidx.compose.animation.core.d.b(this.f28930a.f().a(j10, dVar), 0.0f, 2, null);
            this.f28936g = cVarB;
        }
        return cVarB.v().floatValue();
    }

    @NotNull
    public final androidx.compose.ui.unit.d j() {
        return this.f28933d;
    }

    @NotNull
    public final androidx.compose.foundation.shape.n k() {
        return this.f28930a;
    }

    public final long l() {
        return this.f28932c;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> m() {
        return this.f28931b;
    }

    public final void n(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f28933d = dVar;
    }

    public final void o(long j10) {
        this.f28932c = j10;
    }

    public final float p(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarB = this.f28935f;
        if (cVarB == null) {
            cVarB = androidx.compose.animation.core.d.b(this.f28930a.g().a(j10, dVar), 0.0f, 2, null);
            this.f28935f = cVarB;
        }
        return cVarB.v().floatValue();
    }

    public final float r(long j10, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVarB = this.f28934e;
        if (cVarB == null) {
            cVarB = androidx.compose.animation.core.d.b(this.f28930a.h().a(j10, dVar), 0.0f, 2, null);
            this.f28934e = cVarB;
        }
        return cVarB.v().floatValue();
    }
}
