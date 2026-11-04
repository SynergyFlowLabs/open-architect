package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,2144:1\n113#2:2145\n85#3:2146\n117#3,2:2147\n604#4,7:2149\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n*L\n735#1:2145\n735#1:2146\n735#1:2147,2\n842#1:2149,7\n*E\n"})
public final class j implements h80 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f29414h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h80 f29415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.f2<Boolean> f29416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f29417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f29418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f29419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f29420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f29421g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", i = {}, l = {754}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.compose.animation.core.m<Float, androidx.compose.animation.core.s>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29422a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f29425d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f29424c = f10;
            this.f29425d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return j.this.new a(this.f29424c, this.f29425d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29422a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            androidx.compose.animation.core.c cVar = j.this.f29420f;
            Float fE = kotlin.coroutines.jvm.internal.b.e(this.f29424c);
            androidx.compose.animation.core.o<Float> oVar = this.f29425d;
            this.f29422a = 1;
            Object objI = androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super androidx.compose.animation.core.m<Float, androidx.compose.animation.core.s>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", i = {}, l = {804}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.compose.animation.core.m<Float, androidx.compose.animation.core.s>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29426a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f29429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f29428c = f10;
            this.f29429d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return j.this.new b(this.f29428c, this.f29429d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29426a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            androidx.compose.animation.core.c cVar = j.this.f29420f;
            Float fE = kotlin.coroutines.jvm.internal.b.e(this.f29428c);
            androidx.compose.animation.core.o<Float> oVar = this.f29429d;
            this.f29426a = 1;
            Object objI = androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super androidx.compose.animation.core.m<Float, androidx.compose.animation.core.s>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", i = {}, l = {823, 826}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f29434e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, boolean z10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f29432c = f10;
            this.f29433d = z10;
            this.f29434e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return j.this.new c(this.f29432c, this.f29433d, this.f29434e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super Object> dVar) {
            return invoke2((kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29430a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (g80.f(j.this.c(), g80.f27919b.a())) {
                    j jVar = j.this;
                    jVar.f29418d = (jVar.F(this.f29432c) % 12) * 0.5235988f;
                    h80 h80VarW = j.this.w();
                    j jVar2 = j.this;
                    h80VarW.d((jVar2.F(jVar2.f29418d) % 12) + (s70.N1(j.this) ? 12 : 0));
                } else {
                    j jVar3 = j.this;
                    jVar3.f29419e = jVar3.G(this.f29432c) * 0.10471976f;
                    h80 h80VarW2 = j.this.w();
                    j jVar4 = j.this;
                    h80VarW2.e(jVar4.G(jVar4.f29419e));
                }
                if (this.f29433d) {
                    j jVar5 = j.this;
                    float fS = jVar5.s(jVar5.A(this.f29432c));
                    androidx.compose.animation.core.c cVar = j.this.f29420f;
                    Float fE = kotlin.coroutines.jvm.internal.b.e(fS);
                    androidx.compose.animation.core.o<Float> oVar = this.f29434e;
                    this.f29430a = 2;
                    Object objI = androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null);
                    if (objI != objL) {
                        return objI;
                    }
                } else {
                    androidx.compose.animation.core.c cVar2 = j.this.f29420f;
                    Float fE2 = kotlin.coroutines.jvm.internal.b.e(j.this.A(this.f29432c));
                    this.f29430a = 1;
                    if (cVar2.C(fE2, this) == objL) {
                    }
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<Object> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j(@NotNull h80 h80Var, @NotNull androidx.compose.ui.node.f2<Boolean> f2Var) {
        this.f29415a = h80Var;
        this.f29416b = f2Var;
        this.f29417c = androidx.compose.runtime.d7.g(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0)), null, 2, null);
        this.f29418d = ((h80Var.a() % 12) * 0.5235988f) - 1.5707964f;
        this.f29419e = (h80Var.f() * 0.10471976f) - 1.5707964f;
        this.f29420f = androidx.compose.animation.core.d.b(this.f29418d, 0.0f, 2, null);
        this.f29421g = new androidx.compose.foundation.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float A(float f10) {
        float f11 = f10 + 1.5707964f;
        return f11 < 0.0f ? f11 + 6.2831855f : f11;
    }

    public static /* synthetic */ Object D(j jVar, float f10, androidx.compose.animation.core.o oVar, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return jVar.C(f10, oVar, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F(float f10) {
        return ((int) ((((double) f10) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(float f10) {
        return ((int) ((((double) f10) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    private final void H() {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            this.f29415a.e(f());
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float s(float f10) {
        float fFloatValue = this.f29420f.v().floatValue() - f10;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.f29420f.v().floatValue() - fFloatValue;
    }

    private final boolean y() {
        int iC = c();
        g80.a aVar = g80.f27919b;
        if (g80.f(iC, aVar.a()) && z(this.f29420f.s().floatValue()) == z(this.f29418d)) {
            return false;
        }
        return (g80.f(c(), aVar.b()) && z(this.f29420f.s().floatValue()) == z(this.f29419e)) ? false : true;
    }

    private final float z(float f10) {
        double d10 = ((double) f10) % 6.283185307179586d;
        if (d10 < 0.0d) {
            d10 += 6.283185307179586d;
        }
        return (float) d10;
    }

    @Nullable
    public final Object B(@NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f29421g.d(androidx.compose.foundation.q3.PreventUserInput, new b(s(g80.f(c(), g80.f27919b.a()) ? this.f29418d : this.f29419e), oVar, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public final Object C(float f10, @NotNull androidx.compose.animation.core.o<Float> oVar, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f29416b.b(kotlin.coroutines.jvm.internal.b.a(false));
        Object objD = this.f29421g.d(androidx.compose.foundation.q3.UserInput, new c(f10, z10, oVar, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    public final void E(float f10) {
        this.f29417c.setValue(androidx.compose.ui.unit.h.o(f10));
    }

    @Override // androidx.compose.material3.h80
    public int a() {
        return this.f29415a.a();
    }

    @Override // androidx.compose.material3.h80
    public void b(int i10) {
        this.f29415a.b(i10);
    }

    @Override // androidx.compose.material3.h80
    public int c() {
        return this.f29415a.c();
    }

    @Override // androidx.compose.material3.h80
    public void d(int i10) {
        this.f29418d = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        this.f29415a.d(i10);
        if (g80.f(c(), g80.f27919b.a())) {
            this.f29420f = androidx.compose.animation.core.d.b(this.f29418d, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.h80
    public void e(int i10) {
        this.f29419e = (i10 * 0.10471976f) - 1.5707964f;
        this.f29415a.e(i10);
        if (g80.f(c(), g80.f27919b.b())) {
            this.f29420f = androidx.compose.animation.core.d.b(this.f29419e, 0.0f, 2, null);
        }
        H();
    }

    @Override // androidx.compose.material3.h80
    public int f() {
        return this.f29415a.f();
    }

    @Override // androidx.compose.material3.h80
    public boolean g() {
        return this.f29415a.g();
    }

    @Override // androidx.compose.material3.h80
    public void h(boolean z10) {
        this.f29415a.h(z10);
    }

    @Nullable
    public final Object r(@NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!y()) {
            return Unit.f312394a;
        }
        Object objD = this.f29421g.d(androidx.compose.foundation.q3.PreventUserInput, new a(g80.f(c(), g80.f27919b.a()) ? s(this.f29418d) : s(this.f29419e), oVar, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @NotNull
    public final androidx.collection.f0 t() {
        return g80.f(c(), g80.f27919b.b()) ? s70.f32762p : s70.f32763q;
    }

    public final float u() {
        return this.f29420f.v().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float v() {
        return ((androidx.compose.ui.unit.h) this.f29417c.getValue()).O();
    }

    @NotNull
    public final h80 w() {
        return this.f29415a;
    }

    @NotNull
    public final androidx.compose.ui.node.f2<Boolean> x() {
        return this.f29416b;
    }

    public /* synthetic */ j(h80 h80Var, androidx.compose.ui.node.f2 f2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(h80Var, (i10 & 2) != 0 ? new androidx.compose.ui.node.f2() : f2Var);
    }
}
