package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.o4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@b2
public final class t extends androidx.compose.ui.node.m implements f0 {
    public static final int Z = 8;

    @NotNull
    private Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> X;
    private long Y = androidx.compose.ui.unit.u.f42720b.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> f14169w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.d f14171b;

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.t$a$a, reason: collision with other inner class name */
        public static final class C0073a implements m, l0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ l0 f14172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.draganddrop.d f14173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f14174c;

            C0073a(l0 l0Var, androidx.compose.ui.draganddrop.d dVar, t tVar) {
                this.f14173b = dVar;
                this.f14174c = tVar;
                this.f14172a = l0Var;
            }

            @Override // androidx.compose.foundation.draganddrop.m
            public void B8(androidx.compose.ui.draganddrop.k kVar) {
                this.f14173b.R6(kVar, androidx.compose.ui.unit.v.h(a()), this.f14174c.H9());
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long C0(long j10) {
                return this.f14172a.C0(j10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float D3(int i10) {
                return this.f14172a.D3(i10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float F3(float f10) {
                return this.f14172a.F3(f10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public n0.j N3(androidx.compose.ui.unit.k kVar) {
                return this.f14172a.N3(kVar);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float S7(float f10) {
                return this.f14172a.S7(f10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public boolean U7() {
                return this.f14172a.U7();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public long a() {
                return this.f14172a.a();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public int c8(long j10) {
                return this.f14172a.c8(j10);
            }

            @Override // androidx.compose.ui.unit.n
            @k7
            public long d0(float f10) {
                return this.f14172a.d0(f10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public <R> Object g5(Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super R> dVar) {
                return this.f14172a.g5(function2, dVar);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public int g6(float f10) {
                return this.f14172a.g6(f10);
            }

            @Override // androidx.compose.ui.unit.d
            public float getDensity() {
                return this.f14172a.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public o4 getViewConfiguration() {
                return this.f14172a.getViewConfiguration();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public long i0() {
                return this.f14172a.i0();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long j1(int i10) {
                return this.f14172a.j1(i10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long k4(long j10) {
                return this.f14172a.k4(j10);
            }

            @Override // androidx.compose.ui.unit.n
            public float m0() {
                return this.f14172a.m0();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long m1(float f10) {
                return this.f14172a.m1(f10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float p6(long j10) {
                return this.f14172a.p6(j10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public void t6(boolean z10) {
                this.f14172a.t6(z10);
            }

            @Override // androidx.compose.ui.unit.n
            @k7
            public float y(long j10) {
                return this.f14172a.y(j10);
            }
        }

        a(androidx.compose.ui.draganddrop.d dVar) {
            this.f14171b = dVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objInvoke = t.this.G9().invoke(new C0073a(l0Var, this.f14171b, t.this), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
    }

    public t(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14169w = function1;
        this.X = function2;
        v9(androidx.compose.ui.input.pointer.w0.a(new a((androidx.compose.ui.draganddrop.d) v9(androidx.compose.ui.draganddrop.f.a()))));
    }

    @NotNull
    public final Function2<m, kotlin.coroutines.d<? super Unit>, Object> G9() {
        return this.X;
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> H9() {
        return this.f14169w;
    }

    public final void I9(@NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.X = function2;
    }

    public final void J9(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f14169w = function1;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        this.Y = j10;
    }
}
