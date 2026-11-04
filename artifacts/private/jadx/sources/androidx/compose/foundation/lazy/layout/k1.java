package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.f3;
import androidx.compose.animation.core.t4;
import androidx.compose.animation.core.z3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutScrollDeltaBetweenPasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollDeltaBetweenPasses.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,95:1\n1#2:96\n604#3,7:97\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollDeltaBetweenPasses.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses\n*L\n68#1:97,7\n*E\n"})
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17456c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f17457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s> f17458b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17459a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k1.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17459a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.q qVar = k1.this.f17458b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                androidx.compose.animation.core.q2 q2VarR = androidx.compose.animation.core.p.r(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.e(0.5f), 1, null);
                this.f17459a = 1;
                if (f3.D(qVar, fE, q2VarR, true, null, this, 8, null) == objL) {
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

    public k1() {
        z3<Float, androidx.compose.animation.core.s> z3VarP = t4.P(kotlin.jvm.internal.z.f312833a);
        Float fValueOf = Float.valueOf(0.0f);
        this.f17458b = androidx.compose.animation.core.r.d(z3VarP, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    @Nullable
    public final kotlinx.coroutines.p2 b() {
        return this.f17457a;
    }

    public final float c() {
        return this.f17458b.getValue().floatValue();
    }

    public final boolean d() {
        return !(this.f17458b.getValue().floatValue() == 0.0f);
    }

    public final void e(@Nullable kotlinx.coroutines.p2 p2Var) {
        this.f17457a = p2Var;
    }

    public final void f() {
        kotlinx.coroutines.p2 p2Var = this.f17457a;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f17458b = new androidx.compose.animation.core.q<>(t4.P(kotlin.jvm.internal.z.f312833a), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final void g(float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        if (f10 <= dVar.S7(l1.f17467a)) {
            return;
        }
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            float fFloatValue = this.f17458b.getValue().floatValue();
            kotlinx.coroutines.p2 p2Var = this.f17457a;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            if (this.f17458b.p()) {
                this.f17458b = androidx.compose.animation.core.r.g(this.f17458b, fFloatValue - f10, 0.0f, 0L, 0L, false, 30, null);
            } else {
                this.f17458b = new androidx.compose.animation.core.q<>(t4.P(kotlin.jvm.internal.z.f312833a), Float.valueOf(-f10), null, 0L, 0L, false, 60, null);
            }
            this.f17457a = kotlinx.coroutines.k.f(s0Var, null, null, new a(null), 3, null);
            Unit unit = Unit.f312394a;
        } finally {
            aVar.x(mVarG, mVarM, function1L);
        }
    }
}
