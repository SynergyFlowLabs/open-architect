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
final class n1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.q1 {

    @NotNull
    private final Function1<androidx.compose.ui.spatial.h, Unit> H1 = new a();

    @Nullable
    private androidx.compose.ui.node.j.a X;

    @Nullable
    private kotlinx.coroutines.p2 Y;
    private boolean Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.spatial.h f39436p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.spatial.h f39437p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f39438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f39439t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f39440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private d0 f39441w;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.spatial.h, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.spatial.h hVar) {
            n1 n1Var = n1.this;
            n1Var.w9(n1Var.F9(), hVar, n1.this.D9());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.spatial.h hVar) {
            c(hVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1", f = "OnFirstVisibleModifier.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n1 f39445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, n1 n1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f39444b = j10;
            this.f39445c = n1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f39444b, this.f39445c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f39443a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f39444b;
                this.f39443a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f39445c.S9();
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
            n1 n1Var = n1.this;
            d0 d0VarH9 = n1Var.H9();
            n1Var.N9(d0VarH9 != null ? d0VarH9.a() : null);
        }
    }

    public n1(long j10, float f10, @Nullable d0 d0Var, @NotNull Function0<Unit> function0) {
        this.f39438s = j10;
        this.f39439t = f10;
        this.f39440v = function0;
        this.f39441w = d0Var;
    }

    @Nullable
    public final kotlinx.coroutines.p2 A9() {
        return this.Y;
    }

    @Nullable
    public final androidx.compose.ui.spatial.h B9() {
        return this.f39436p0;
    }

    public final boolean C9() {
        return this.Z;
    }

    @Nullable
    public final androidx.compose.ui.spatial.h D9() {
        return this.f39437p1;
    }

    public final long E9() {
        return this.f39438s;
    }

    public final float F9() {
        return this.f39439t;
    }

    @NotNull
    public final Function1<androidx.compose.ui.spatial.h, Unit> G9() {
        return this.H1;
    }

    @Nullable
    public final d0 H9() {
        return this.f39441w;
    }

    public final void I9(@NotNull Function0<Unit> function0) {
        this.f39440v = function0;
    }

    public final void J9(@Nullable androidx.compose.ui.node.j.a aVar) {
        this.X = aVar;
    }

    public final void K9(@Nullable kotlinx.coroutines.p2 p2Var) {
        this.Y = p2Var;
    }

    public final void L9(@Nullable androidx.compose.ui.spatial.h hVar) {
        this.f39436p0 = hVar;
    }

    public final void M9(boolean z10) {
        this.Z = z10;
    }

    public final void N9(@Nullable androidx.compose.ui.spatial.h hVar) {
        if (Intrinsics.areEqual(this.f39437p1, hVar)) {
            return;
        }
        this.f39437p1 = hVar;
        x9();
    }

    public final void O9(long j10) {
        this.f39438s = j10;
    }

    public final void P9(float f10) {
        this.f39439t = f10;
    }

    public final void Q9(@Nullable d0 d0Var) {
        this.f39441w = d0Var;
        T9();
    }

    public final void R9() {
        long j10 = this.f39438s;
        if (j10 == 0) {
            S9();
            return;
        }
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.Y = kotlinx.coroutines.k.f(Q8(), null, null, new b(j10, this, null), 3, null);
    }

    public final void S9() {
        androidx.compose.ui.node.j.a aVar = this.X;
        if (aVar != null) {
            aVar.a();
        }
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f39440v.invoke();
    }

    public final void T9() {
        if (this.f39441w == null) {
            N9(null);
        } else {
            androidx.compose.ui.node.r1.a(this, new c());
        }
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        T9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        androidx.compose.ui.node.j.a aVar = this.X;
        if (aVar != null) {
            aVar.a();
        }
        T9();
        this.X = s1.c(this, 0L, 0L, this.H1);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j.a aVar = this.X;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.Y = null;
        this.Z = false;
        this.f39436p0 = null;
        N9(null);
    }

    public final void v9() {
        kotlinx.coroutines.p2 p2Var = this.Y;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
    }

    public final void w9(float f10, @NotNull androidx.compose.ui.spatial.h hVar, @Nullable androidx.compose.ui.spatial.h hVar2) {
        this.f39436p0 = hVar;
        if (hVar2 != null || this.f39441w == null) {
            float fB = hVar2 != null ? hVar.b(hVar2) : hVar.d();
            boolean z10 = fB > f10 || fB == 1.0f;
            if (z10 && !this.Z) {
                R9();
            } else if (!z10 && this.Z) {
                v9();
            }
            this.Z = z10;
        }
    }

    public final void x9() {
        androidx.compose.ui.spatial.h hVar = this.f39436p0;
        if (hVar != null) {
            w9(this.f39439t, hVar, this.f39437p1);
        }
    }

    @NotNull
    public final Function0<Unit> y9() {
        return this.f39440v;
    }

    @Nullable
    public final androidx.compose.ui.node.j.a z9() {
        return this.X;
    }
}
