package androidx.compose.ui.input.pointer;

import androidx.collection.b1;
import androidx.collection.g2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,688:1\n1107#2:689\n1085#2,2:690\n424#3,8:692\n424#3,8:700\n424#3,8:708\n424#3,8:716\n472#3:724\n424#3,8:725\n44#3:733\n472#3:734\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n234#1:689\n234#1:690,2\n246#1:692,8\n273#1:700,8\n293#1:708,8\n302#1:716,8\n319#1:724\n343#1:725,8\n347#1:733\n348#1:734\n*E\n"})
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39092c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<n> f39093a = new androidx.compose.runtime.collection.d<>(new n[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g2<o> f39094b = new g2<>(10);

    public boolean a(@NotNull b1<c0> b1Var, @NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull i iVar, boolean z10) {
        androidx.compose.runtime.collection.d<n> dVar = this.f39093a;
        n[] nVarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z11 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            z11 = nVarArr[i10].a(b1Var, g0Var, iVar, z10) || z11;
        }
        return z11;
    }

    public void b(@NotNull i iVar) {
        int iR = this.f39093a.R();
        while (true) {
            iR--;
            if (-1 >= iR) {
                return;
            }
            if (this.f39093a.f35552a[iR].m().i()) {
                this.f39093a.r0(iR);
            }
        }
    }

    public final void c() {
        this.f39093a.r();
    }

    public void d() {
        androidx.compose.runtime.collection.d<n> dVar = this.f39093a;
        n[] nVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            nVarArr[i10].d();
        }
    }

    public boolean e(@NotNull i iVar) {
        androidx.compose.runtime.collection.d<n> dVar = this.f39093a;
        n[] nVarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z10 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            z10 = nVarArr[i10].e(iVar) || z10;
        }
        b(iVar);
        return z10;
    }

    public boolean f(@NotNull b1<c0> b1Var, @NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull i iVar, boolean z10) {
        androidx.compose.runtime.collection.d<n> dVar = this.f39093a;
        n[] nVarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z11 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            z11 = nVarArr[i10].f(b1Var, g0Var, iVar, z10) || z11;
        }
        return z11;
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<n> g() {
        return this.f39093a;
    }

    public void h(long j10, @NotNull g2<n> g2Var) {
        androidx.compose.runtime.collection.d<n> dVar = this.f39093a;
        n[] nVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            nVarArr[i10].h(j10, g2Var);
        }
    }

    public void i(@NotNull androidx.compose.ui.a0.d dVar) {
        this.f39094b.l0();
        this.f39094b.a0(this);
        while (this.f39094b.I()) {
            g2<o> g2Var = this.f39094b;
            o oVarJ0 = g2Var.J0(g2Var.C() - 1);
            int i10 = 0;
            while (i10 < oVarJ0.f39093a.R()) {
                n nVar = oVarJ0.f39093a.f35552a[i10];
                if (Intrinsics.areEqual(nVar.l(), dVar)) {
                    oVarJ0.f39093a.n0(nVar);
                    nVar.d();
                } else {
                    this.f39094b.a0(nVar);
                    i10++;
                }
            }
        }
    }
}
