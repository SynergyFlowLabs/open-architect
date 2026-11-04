package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.o4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDragAndDropSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropSource.kt\nandroidx/compose/foundation/draganddrop/DragAndDropSourceNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
public final class l extends androidx.compose.ui.node.m implements f0 {
    public static final int H1 = 8;

    @NotNull
    private Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> X;

    @NotNull
    private Function1<? super n0.g, androidx.compose.ui.draganddrop.k> Y;
    private long Z = androidx.compose.ui.unit.u.f42720b.a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.draganddrop.g f14159p0 = (androidx.compose.ui.draganddrop.g) v9(androidx.compose.ui.draganddrop.f.c(new Function2() { // from class: androidx.compose.foundation.draganddrop.k
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l.I9(this.f14158a, (androidx.compose.ui.draganddrop.h) obj, (n0.g) obj2);
        }
    }));

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private d2 f14160p1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> f14161w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.l$a$a, reason: collision with other inner class name */
        public static final class C0072a implements n, l0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ l0 f14163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f14164b;

            C0072a(l0 l0Var, l lVar) {
                this.f14164b = lVar;
                this.f14163a = l0Var;
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long C0(long j10) {
                return this.f14163a.C0(j10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float D3(int i10) {
                return this.f14163a.D3(i10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float F3(float f10) {
                return this.f14163a.F3(f10);
            }

            @Override // androidx.compose.foundation.draganddrop.n
            public void G(long j10) {
                this.f14164b.f14159p0.G(j10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public n0.j N3(androidx.compose.ui.unit.k kVar) {
                return this.f14163a.N3(kVar);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float S7(float f10) {
                return this.f14163a.S7(f10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public boolean U7() {
                return this.f14163a.U7();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public long a() {
                return this.f14163a.a();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public int c8(long j10) {
                return this.f14163a.c8(j10);
            }

            @Override // androidx.compose.ui.unit.n
            @k7
            public long d0(float f10) {
                return this.f14163a.d0(f10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public <R> Object g5(Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super R> dVar) {
                return this.f14163a.g5(function2, dVar);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public int g6(float f10) {
                return this.f14163a.g6(f10);
            }

            @Override // androidx.compose.ui.unit.d
            public float getDensity() {
                return this.f14163a.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public o4 getViewConfiguration() {
                return this.f14163a.getViewConfiguration();
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public long i0() {
                return this.f14163a.i0();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long j1(int i10) {
                return this.f14163a.j1(i10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long k4(long j10) {
                return this.f14163a.k4(j10);
            }

            @Override // androidx.compose.ui.unit.n
            public float m0() {
                return this.f14163a.m0();
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public long m1(float f10) {
                return this.f14163a.m1(f10);
            }

            @Override // androidx.compose.ui.unit.d
            @k7
            public float p6(long j10) {
                return this.f14163a.p6(j10);
            }

            @Override // androidx.compose.ui.input.pointer.l0
            public void t6(boolean z10) {
                this.f14163a.t6(z10);
            }

            @Override // androidx.compose.ui.unit.n
            @k7
            public float y(long j10) {
                return this.f14163a.y(j10);
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objInvoke = l.this.J9().invoke(new C0072a(l0Var, l.this), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
    }

    public l(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function3) {
        this.f14161w = function1;
        this.X = function2;
        this.Y = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9(l lVar, androidx.compose.ui.draganddrop.h hVar, n0.g gVar) {
        androidx.compose.ui.draganddrop.k kVarInvoke = lVar.Y.invoke(gVar);
        if (kVarInvoke != null) {
            hVar.a(kVarInvoke, androidx.compose.ui.unit.v.h(lVar.Z), lVar.f14161w);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final Function2<n, kotlin.coroutines.d<? super Unit>, Object> J9() {
        return this.X;
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> K9() {
        return this.f14161w;
    }

    @NotNull
    public final Function1<n0.g, androidx.compose.ui.draganddrop.k> L9() {
        return this.Y;
    }

    public final void M9(@NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.X = function2;
    }

    public final void N9(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f14161w = function1;
    }

    public final void O9(@NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        this.Y = function1;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        this.Z = j10;
        this.f14159p0.c0(j10);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        if (this.f14159p0.g0()) {
            this.f14160p1 = (d2) v9(androidx.compose.ui.input.pointer.w0.a(new a()));
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        d2 d2Var = this.f14160p1;
        if (d2Var != null) {
            C9(d2Var);
        }
    }

    @Override // androidx.compose.ui.node.f0
    public void x(@NotNull g0 g0Var) {
        this.f14159p0.x(g0Var);
    }
}
