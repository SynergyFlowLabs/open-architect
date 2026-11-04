package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class x0 implements k4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15221d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.g0<Float> f15222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.c0 f15223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15224c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {981}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Float>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x0 f15229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z3 f15230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, x0 x0Var, z3 z3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15228d = f10;
            this.f15229e = x0Var;
            this.f15230f = z3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(kotlin.jvm.internal.i1.e eVar, z3 z3Var, kotlin.jvm.internal.i1.e eVar2, x0 x0Var, androidx.compose.animation.core.n nVar) {
            float fFloatValue = ((Number) nVar.g()).floatValue() - eVar.f312748a;
            float f10 = z3Var.f(fFloatValue);
            eVar.f312748a = ((Number) nVar.g()).floatValue();
            eVar2.f312748a = ((Number) nVar.h()).floatValue();
            if (Math.abs(fFloatValue - f10) > 0.5f) {
                nVar.a();
            }
            x0Var.g(x0Var.f() + 1);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f15228d, this.f15229e, this.f15230f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f10;
            androidx.compose.animation.core.q qVar;
            kotlin.jvm.internal.i1.e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15227c;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (Math.abs(this.f15228d) > 1.0f) {
                    final kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
                    eVar2.f312748a = this.f15228d;
                    final kotlin.jvm.internal.i1.e eVar3 = new kotlin.jvm.internal.i1.e();
                    androidx.compose.animation.core.q qVarC = androidx.compose.animation.core.r.c(0.0f, this.f15228d, 0L, 0L, false, 28, null);
                    try {
                        androidx.compose.animation.core.g0 g0Var = this.f15229e.f15222a;
                        final z3 z3Var = this.f15230f;
                        final x0 x0Var = this.f15229e;
                        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.w0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return x0.a.m(eVar3, z3Var, eVar2, x0Var, (androidx.compose.animation.core.n) obj2);
                            }
                        };
                        this.f15225a = eVar2;
                        this.f15226b = qVarC;
                        this.f15227c = 1;
                        qVar = qVarC;
                        try {
                            if (androidx.compose.animation.core.f3.z(qVar, g0Var, false, function1, this, 2, null) == objL) {
                                return objL;
                            }
                            eVar = eVar2;
                            f10 = eVar.f312748a;
                        } catch (CancellationException unused) {
                            eVar = eVar2;
                            eVar.f312748a = ((Number) qVar.g()).floatValue();
                        }
                    } catch (CancellationException unused2) {
                        qVar = qVarC;
                    }
                } else {
                    f10 = this.f15228d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (androidx.compose.animation.core.q) this.f15226b;
                eVar = (kotlin.jvm.internal.i1.e) this.f15225a;
                try {
                    ResultKt.m(obj);
                } catch (CancellationException unused3) {
                    eVar.f312748a = ((Number) qVar.g()).floatValue();
                }
                f10 = eVar.f312748a;
            }
            return kotlin.coroutines.jvm.internal.b.e(f10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Float> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public x0(@NotNull androidx.compose.animation.core.g0<Float> g0Var, @NotNull androidx.compose.ui.c0 c0Var) {
        this.f15222a = g0Var;
        this.f15223b = c0Var;
    }

    @Override // androidx.compose.foundation.gestures.c3
    @Nullable
    public Object a(@NotNull z3 z3Var, float f10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        this.f15224c = 0;
        return kotlinx.coroutines.i.h(this.f15223b, new a(f10, this, z3Var, null), dVar);
    }

    @Override // androidx.compose.foundation.gestures.k4
    public void d(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f15222a = androidx.compose.animation.l1.c(dVar);
    }

    public final int f() {
        return this.f15224c;
    }

    public final void g(int i10) {
        this.f15224c = i10;
    }

    public /* synthetic */ x0(androidx.compose.animation.core.g0 g0Var, androidx.compose.ui.c0 c0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, (i10 & 2) != 0 ? n4.g() : c0Var);
    }
}
