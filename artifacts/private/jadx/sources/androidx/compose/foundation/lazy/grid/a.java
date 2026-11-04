package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.runtime.k7;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nLazyGridPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,341:1\n1107#2:342\n1085#2,2:343\n424#3,8:345\n136#3:353\n424#3,8:354\n424#3,8:362\n136#3:370\n424#3,8:371\n*S KotlinDebug\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n*L\n164#1:342\n164#1:343,2\n192#1:345,8\n197#1:353\n208#1:354,8\n217#1:362,8\n246#1:370\n303#1:371,8\n*E\n"})
final class a implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> f16756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16759f;

    public a() {
        this(0, 1, null);
    }

    private final int e(n0 n0Var, boolean z10) {
        return z10 ? ((x) CollectionsKt.last((List) n0Var.h())).getIndex() + 1 : ((x) CollectionsKt.first((List) n0Var.h())).getIndex() - 1;
    }

    private final int g(n0 n0Var, boolean z10) {
        if (z10) {
            x xVar = (x) CollectionsKt.last((List) n0Var.h());
            return (n0Var.getOrientation() == q3.Vertical ? xVar.l() : xVar.f()) + 1;
        }
        x xVar2 = (x) CollectionsKt.first((List) n0Var.h());
        return (n0Var.getOrientation() == q3.Vertical ? xVar2.l() : xVar2.f()) - 1;
    }

    private final void h(n0 n0Var, int i10, boolean z10) {
        if (i10 == -1 || n0Var.h().isEmpty() || i10 == g(n0Var, z10)) {
            return;
        }
        i();
    }

    private final void i() {
        this.f16755b = -1;
        androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar = this.f16756c;
        androidx.compose.foundation.lazy.layout.i1.b[] bVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            bVarArr[i10].cancel();
        }
        this.f16756c.r();
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void a(@NotNull m2 m2Var, int i10) {
        int iE = m2Var.e() == -1 ? this.f16754a : m2Var.e();
        for (int i11 = 0; i11 < iE; i11++) {
            m2Var.d(i10 + i11);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void d(@NotNull c1 c1Var, float f10, @NotNull n0 n0Var) {
        if (!n0Var.h().isEmpty()) {
            int i10 = 0;
            boolean z10 = f10 < 0.0f;
            int iG = g(n0Var, z10);
            int iE = e(n0Var, z10);
            if (iE >= 0 && iE < n0Var.c()) {
                if (iG != this.f16755b && iG >= 0) {
                    if (this.f16757d != z10) {
                        androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar = this.f16756c;
                        androidx.compose.foundation.lazy.layout.i1.b[] bVarArr = dVar.f35552a;
                        int iR = dVar.R();
                        for (int i11 = 0; i11 < iR; i11++) {
                            bVarArr[i11].cancel();
                        }
                    }
                    this.f16757d = z10;
                    this.f16755b = iG;
                    this.f16756c.r();
                    androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar2 = this.f16756c;
                    dVar2.k(dVar2.R(), c1Var.b(iG));
                }
                if (z10) {
                    x xVar = (x) CollectionsKt.last((List) n0Var.h());
                    if (((androidx.compose.foundation.gestures.snapping.e.d(xVar, n0Var.getOrientation()) + androidx.compose.foundation.gestures.snapping.e.f(xVar, n0Var.getOrientation())) + n0Var.g()) - n0Var.e() < (-f10)) {
                        androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar3 = this.f16756c;
                        androidx.compose.foundation.lazy.layout.i1.b[] bVarArr2 = dVar3.f35552a;
                        int iR2 = dVar3.R();
                        while (i10 < iR2) {
                            bVarArr2[i10].c();
                            i10++;
                        }
                    }
                } else if (n0Var.d() - androidx.compose.foundation.gestures.snapping.e.d((x) CollectionsKt.first((List) n0Var.h()), n0Var.getOrientation()) < f10) {
                    androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar4 = this.f16756c;
                    androidx.compose.foundation.lazy.layout.i1.b[] bVarArr3 = dVar4.f35552a;
                    int iR3 = dVar4.R();
                    while (i10 < iR3) {
                        bVarArr3[i10].c();
                        i10++;
                    }
                }
            }
        }
        this.f16759f = f10;
    }

    @Override // androidx.compose.foundation.lazy.grid.d1
    public void f(@NotNull c1 c1Var, @NotNull n0 n0Var) {
        h(n0Var, this.f16755b, this.f16757d);
        int iC = n0Var.c();
        int i10 = this.f16758e;
        if (i10 != -1 && this.f16759f != 0.0f && i10 != iC && !n0Var.h().isEmpty()) {
            int i11 = 1 << 0;
            int iG = g(n0Var, this.f16759f < 0.0f);
            int iE = e(n0Var, this.f16759f < 0.0f);
            if (iE >= 0 && iE < n0Var.c() && iG != this.f16755b && iG >= 0) {
                this.f16755b = iG;
                this.f16756c.r();
                androidx.compose.runtime.collection.d<androidx.compose.foundation.lazy.layout.i1.b> dVar = this.f16756c;
                dVar.k(dVar.R(), c1Var.b(iG));
            }
        }
        this.f16758e = iC;
    }

    public a(int i10) {
        this.f16754a = i10;
        this.f16755b = -1;
        this.f16756c = new androidx.compose.runtime.collection.d<>(new androidx.compose.foundation.lazy.layout.i1.b[16], 0);
        this.f16758e = -1;
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
