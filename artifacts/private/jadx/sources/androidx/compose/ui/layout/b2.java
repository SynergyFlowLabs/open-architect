package androidx.compose.ui.layout;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b2 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.q1 {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f39261g3 = 8;

    @Nullable
    private androidx.compose.ui.spatial.h H1;

    @Nullable
    private androidx.compose.ui.node.j.a X;

    @Nullable
    private kotlinx.coroutines.p2 Y;
    private boolean Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f39262p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.spatial.h f39263p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.spatial.h, Unit> f39264p2 = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f39265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f39266t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function1<? super Boolean, Unit> f39267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private d0 f39268w;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.spatial.h, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.spatial.h hVar) {
            b2 b2Var = b2.this;
            b2Var.v9(b2Var.G9(), hVar, b2.this.E9());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.spatial.h hVar) {
            c(hVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.layout.OnVisibilityChangedNode$startTimer$1", f = "OnVisibilityChangedModifier.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b2 f39272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, b2 b2Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f39271b = j10;
            this.f39272c = b2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f39271b, this.f39272c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f39270a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f39271b;
                this.f39270a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f39272c.U9();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b2 b2Var = b2.this;
            d0 d0VarI9 = b2Var.I9();
            b2Var.P9(d0VarI9 != null ? d0VarI9.a() : null);
        }
    }

    public b2(long j10, float f10, @Nullable d0 d0Var, @NotNull Function1<? super Boolean, Unit> function1) {
        this.f39265s = j10;
        this.f39266t = f10;
        this.f39267v = function1;
        this.f39268w = d0Var;
    }

    @Nullable
    public final androidx.compose.ui.node.j.a A9() {
        return this.X;
    }

    @Nullable
    public final kotlinx.coroutines.p2 B9() {
        return this.Y;
    }

    @Nullable
    public final androidx.compose.ui.spatial.h C9() {
        return this.f39263p1;
    }

    public final boolean D9() {
        return this.Z;
    }

    @Nullable
    public final androidx.compose.ui.spatial.h E9() {
        return this.H1;
    }

    public final long F9() {
        return this.f39265s;
    }

    public final float G9() {
        return this.f39266t;
    }

    @NotNull
    public final Function1<androidx.compose.ui.spatial.h, Unit> H9() {
        return this.f39264p2;
    }

    @Nullable
    public final d0 I9() {
        return this.f39268w;
    }

    public final void J9(@NotNull Function1<? super Boolean, Unit> function1) {
        this.f39267v = function1;
    }

    public final void K9(boolean z10) {
        this.f39262p0 = z10;
    }

    public final void L9(@Nullable androidx.compose.ui.node.j.a aVar) {
        this.X = aVar;
    }

    public final void M9(@Nullable kotlinx.coroutines.p2 p2Var) {
        this.Y = p2Var;
    }

    public final void N9(@Nullable androidx.compose.ui.spatial.h hVar) {
        this.f39263p1 = hVar;
    }

    public final void O9(boolean z10) {
        this.Z = z10;
    }

    public final void P9(@Nullable androidx.compose.ui.spatial.h hVar) {
        if (!Intrinsics.areEqual(this.H1, hVar)) {
            this.H1 = hVar;
            x9();
        }
    }

    public final void Q9(long j10) {
        this.f39265s = j10;
    }

    public final void R9(float f10) {
        this.f39266t = f10;
    }

    public final void S9(@Nullable d0 d0Var) {
        this.f39268w = d0Var;
        V9();
    }

    public final void T9() {
        long j10 = this.f39265s;
        if (j10 == 0) {
            U9();
            return;
        }
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.Y = kotlinx.coroutines.k.f(Q8(), null, null, new b(j10, this, null), 3, null);
    }

    public final void U9() {
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            boolean z10 = !true;
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f39267v.invoke(Boolean.valueOf(this.Z));
    }

    public final void V9() {
        if (this.f39268w == null) {
            P9(null);
        } else {
            androidx.compose.ui.node.r1.a(this, new c());
        }
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        V9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        androidx.compose.ui.node.j.a aVar = this.X;
        if (aVar != null) {
            aVar.a();
        }
        this.X = s1.c(this, 0L, 0L, this.f39264p2);
        V9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j.a aVar = this.X;
        if (aVar != null) {
            aVar.a();
        }
        w9();
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        w9();
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.Y = null;
        this.Z = false;
        this.f39263p1 = null;
        P9(null);
        this.f39262p0 = false;
    }

    public final void v9(float f10, @NotNull androidx.compose.ui.spatial.h hVar, @Nullable androidx.compose.ui.spatial.h hVar2) {
        this.f39263p1 = hVar;
        if (hVar2 != null || this.f39268w == null) {
            float fB = hVar2 != null ? hVar.b(hVar2) : hVar.d();
            boolean z10 = fB > f10 || fB == 1.0f;
            if (this.f39262p0 && z10 == this.Z) {
                return;
            }
            this.Z = z10;
            this.f39262p0 = true;
            T9();
        }
    }

    public final void w9() {
        if (this.Z && this.f39262p0) {
            kotlinx.coroutines.p2 p2Var = this.Y;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.Z = false;
            this.f39267v.invoke(Boolean.FALSE);
        }
    }

    public final void x9() {
        androidx.compose.ui.spatial.h hVar = this.f39263p1;
        if (hVar != null) {
            v9(this.f39266t, hVar, this.H1);
        }
    }

    @NotNull
    public final Function1<Boolean, Unit> y9() {
        return this.f39267v;
    }

    public final boolean z9() {
        return this.f39262p0;
    }
}
