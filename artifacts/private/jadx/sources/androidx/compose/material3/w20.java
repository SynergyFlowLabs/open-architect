package androidx.compose.material3;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1427:1\n1#2:1428\n55#3:1429\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n*L\n741#1:1429\n*E\n"})
public final class w20 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f34065p1 = 8;

    @Nullable
    private androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> X;

    @Nullable
    private androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> Y;

    @Nullable
    private androidx.compose.ui.unit.h Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.h f34066p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n7<? extends List<f30>> f34067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34068t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> f34070w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f34072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w20 f34074d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, w20 w20Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f34072b = cVar;
            this.f34073c = f10;
            this.f34074d = w20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f34072b, this.f34073c, this.f34074d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f34071a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f34072b;
                androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(this.f34073c);
                androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0VarX9 = this.f34074d.x9();
                this.f34071a = 1;
                if (androidx.compose.animation.core.c.i(cVar, hVarO, y0VarX9, null, null, this, 12, null) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", i = {}, l = {731}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f34076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w20 f34078d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, w20 w20Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f34076b = cVar;
            this.f34077c = f10;
            this.f34078d = w20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f34076b, this.f34077c, this.f34078d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f34075a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f34076b;
                androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(this.f34077c);
                androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0VarX9 = this.f34078d.x9();
                this.f34075a = 1;
                if (androidx.compose.animation.core.c.i(cVar, hVarO, y0VarX9, null, null, this, 12, null) == objL) {
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

    public w20(@NotNull androidx.compose.runtime.n7<? extends List<f30>> n7Var, int i10, boolean z10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0Var) {
        this.f34067s = n7Var;
        this.f34068t = i10;
        this.f34069v = z10;
        this.f34070w = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B9(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.c1 c1Var, float f10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, c1Var.g6(f10), 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.runtime.n7<List<f30>> A9() {
        return this.f34067s;
    }

    public final void D9(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> y0Var) {
        this.f34070w = y0Var;
    }

    public final void E9(boolean z10) {
        this.f34069v = z10;
    }

    public final void F9(int i10) {
        this.f34068t = i10;
    }

    public final void G9(@NotNull androidx.compose.runtime.n7<? extends List<f30>> n7Var) {
        this.f34067s = n7Var;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        if (this.f34067s.getValue().isEmpty()) {
            return androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.material3.u20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w20.B9((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        float fA = this.f34069v ? this.f34067s.getValue().get(this.f34068t).a() : this.f34067s.getValue().get(this.f34068t).d();
        if (this.f34066p0 != null) {
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.Y;
            if (cVar == null) {
                androidx.compose.ui.unit.h hVar = this.f34066p0;
                Intrinsics.checkNotNull(hVar);
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar2 = new androidx.compose.animation.core.c<>(hVar, androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
                this.Y = cVar2;
                cVar = cVar2;
            }
            if (!androidx.compose.ui.unit.h.x(fA, cVar.s().O())) {
                kotlinx.coroutines.k.f(Q8(), null, null, new a(cVar, fA, this, null), 3, null);
            }
        } else {
            this.f34066p0 = androidx.compose.ui.unit.h.o(fA);
        }
        float fB = this.f34067s.getValue().get(this.f34068t).b();
        if (this.Z != null) {
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar3 = this.X;
            if (cVar3 == null) {
                androidx.compose.ui.unit.h hVar2 = this.Z;
                Intrinsics.checkNotNull(hVar2);
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar4 = new androidx.compose.animation.core.c<>(hVar2, androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
                this.X = cVar4;
                cVar3 = cVar4;
            }
            if (!androidx.compose.ui.unit.h.x(fB, cVar3.s().O())) {
                kotlinx.coroutines.k.f(Q8(), null, null, new b(cVar3, fB, this, null), 3, null);
            }
        } else {
            this.Z = androidx.compose.ui.unit.h.o(fB);
        }
        if (c1Var.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar5 = this.X;
            if (cVar5 != null) {
                fB = cVar5.v().O();
            }
        } else {
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar6 = this.X;
            if (cVar6 != null) {
                fB = cVar6.v().O();
            }
            fB = androidx.compose.ui.unit.h.r(-fB);
        }
        androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar7 = this.Y;
        if (cVar7 != null) {
            fA = cVar7.v().O();
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, c1Var.g6(fA), c1Var.g6(fA), 0, 0, 12, null));
        final float f10 = fB;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.v20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w20.C9(i2VarP0, c1Var, f10, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.h> x9() {
        return this.f34070w;
    }

    public final boolean y9() {
        return this.f34069v;
    }

    public final int z9() {
        return this.f34068t;
    }
}
