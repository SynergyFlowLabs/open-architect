package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWideNavigationRailState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/ModalWideNavigationRailState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,261:1\n1#2:262\n113#3:263\n*S KotlinDebug\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/ModalWideNavigationRailState\n*L\n177#1:263\n*E\n"})
public final class fm implements qb0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27680d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ qb0 f27681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f27682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.d0<xb0> f27683c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalWideNavigationRailState$animateTo$2", f = "WideNavigationRailState.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.material3.internal.r, androidx.compose.material3.internal.b2<xb0>, xb0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27687d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f27689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f27690g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(4, dVar);
            this.f27689f = f10;
            this.f27690g = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.material3.internal.r rVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
            rVar.a(f10, f11);
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27684a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final androidx.compose.material3.internal.r rVar = (androidx.compose.material3.internal.r) this.f27685b;
                float fC = ((androidx.compose.material3.internal.b2) this.f27686c).c((xb0) this.f27687d);
                if (!Float.isNaN(fC)) {
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    float fS = Float.isNaN(fm.this.s()) ? 0.0f : fm.this.s();
                    eVar.f312748a = fS;
                    float f10 = this.f27689f;
                    androidx.compose.animation.core.o<Float> oVar = this.f27690g;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.em
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return fm.a.n(rVar, eVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f27685b = null;
                    this.f27686c = null;
                    this.f27684a = 1;
                    if (androidx.compose.animation.core.f3.l(fS, fC, f10, oVar, function2, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.material3.internal.r rVar, androidx.compose.material3.internal.b2<xb0> b2Var, xb0 xb0Var, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = fm.this.new a(this.f27689f, this.f27690g, dVar);
            aVar.f27685b = rVar;
            aVar.f27686c = b2Var;
            aVar.f27687d = xb0Var;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    public fm(@NotNull qb0 qb0Var, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f27681a = qb0Var;
        this.f27682b = oVar;
        this.f27683c = new androidx.compose.material3.internal.d0<>(qb0Var.c(), new Function1() { // from class: androidx.compose.material3.bm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(fm.l(((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material3.cm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(fm.m(dVar));
            }
        }, new Function0() { // from class: androidx.compose.material3.dm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fm.n(this.f27121a);
            }
        }, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f10) {
        return f10 * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(androidx.compose.ui.unit.h.r(400));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.o n(fm fmVar) {
        return fmVar.f27682b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(xb0 xb0Var, androidx.compose.animation.core.o<Float> oVar, float f10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = androidx.compose.material3.internal.d0.p(this.f27683c, xb0Var, null, new a(f10, oVar, null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object p(fm fmVar, xb0 xb0Var, androidx.compose.animation.core.o oVar, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = fmVar.f27682b;
        }
        if ((i10 & 4) != 0) {
            f10 = fmVar.f27683c.B();
        }
        return fmVar.o(xb0Var, oVar, f10, dVar);
    }

    @Override // androidx.compose.material3.qb0
    public boolean b() {
        return this.f27683c.H();
    }

    @Override // androidx.compose.material3.qb0
    @NotNull
    public xb0 c() {
        return this.f27683c.F();
    }

    @Override // androidx.compose.material3.qb0
    @NotNull
    public xb0 d() {
        return this.f27683c.y();
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = p(this, xb0.Expanded, null, 0.0f, dVar, 6, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = p(this, wb0.c(c()), null, 0.0f, dVar, 6, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = p(this, xb0.Collapsed, null, 0.0f, dVar, 6, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Override // androidx.compose.material3.qb0
    @Nullable
    public Object h(@NotNull xb0 xb0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = androidx.compose.material3.internal.t.k(this.f27683c, xb0Var, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.material3.internal.d0<xb0> q() {
        return this.f27683c;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> r() {
        return this.f27682b;
    }

    public final float s() {
        return this.f27683c.C();
    }

    @Nullable
    public final Object t(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = this.f27683c.Q(f10, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }
}
