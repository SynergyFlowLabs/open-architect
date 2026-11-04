package androidx.compose.ui.input.pointer;

import androidx.collection.a2;
import androidx.collection.g2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n+ 4 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,688:1\n348#2,7:689\n128#3:696\n128#3:701\n679#4:697\n679#4:702\n1516#5:698\n1516#5:703\n1#6:699\n1#6:700\n1#6:704\n382#7,4:705\n354#7,6:709\n364#7,3:716\n367#7,9:720\n386#7:729\n1399#8:715\n1270#8:719\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n89#1:689,7\n93#1:696\n108#1:701\n96#1:697\n111#1:702\n97#1:698\n111#1:703\n96#1:699\n111#1:704\n121#1:705,4\n121#1:709,6\n121#1:716,3\n121#1:720,9\n121#1:729\n121#1:715\n121#1:719\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39025i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.g0 f39026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g2<androidx.compose.ui.a0.d> f39031f = new g2<>(0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final o f39032g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final a2<g2<n>> f39033h = new a2<>(10);

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0.d f39035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.a0.d dVar) {
            super(0);
            this.f39035b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            g.this.j(this.f39035b);
        }
    }

    public g(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f39026a = g0Var;
    }

    public static /* synthetic */ void c(g gVar, long j10, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        gVar.b(j10, list, z10);
    }

    public static /* synthetic */ boolean f(g gVar, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return gVar.e(iVar, z10);
    }

    private final void i(long j10, g2<n> g2Var) {
        this.f39032g.h(j10, g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(androidx.compose.ui.a0.d dVar) {
        if (!this.f39027b) {
            this.f39032g.i(dVar);
        } else {
            this.f39030e = true;
            this.f39031f.a0(dVar);
        }
    }

    public final void b(long j10, @NotNull List<? extends androidx.compose.ui.a0.d> list, boolean z10) {
        n nVar;
        o oVar = this.f39032g;
        this.f39033h.P();
        int size = list.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.a0.d dVar = list.get(i10);
            if (dVar.a9()) {
                dVar.n9(new a(dVar));
                if (z11) {
                    androidx.compose.runtime.collection.d<n> dVarG = oVar.g();
                    n[] nVarArr = dVarG.f35552a;
                    int iR = dVarG.R();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iR) {
                            nVar = null;
                            break;
                        }
                        nVar = nVarArr[i11];
                        if (Intrinsics.areEqual(nVar.l(), dVar)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    n nVar2 = nVar;
                    if (nVar2 != null) {
                        nVar2.o();
                        nVar2.m().a(j10);
                        a2<g2<n>> a2Var = this.f39033h;
                        g2<n> g2VarN = a2Var.n(j10);
                        if (g2VarN == null) {
                            g2VarN = new g2<>(0, 1, null);
                            a2Var.j0(j10, g2VarN);
                        }
                        g2VarN.a0(nVar2);
                        oVar = nVar2;
                    } else {
                        z11 = false;
                    }
                }
                n nVar3 = new n(dVar);
                nVar3.m().a(j10);
                a2<g2<n>> a2Var2 = this.f39033h;
                g2<n> g2VarN2 = a2Var2.n(j10);
                if (g2VarN2 == null) {
                    g2VarN2 = new g2<>(0, 1, null);
                    a2Var2.j0(j10, g2VarN2);
                }
                g2VarN2.a0(nVar3);
                oVar.g().d(nVar3);
                oVar = nVar3;
            }
        }
        if (!z10) {
            return;
        }
        a2<g2<n>> a2Var3 = this.f39033h;
        long[] jArr = a2Var3.f12510b;
        Object[] objArr = a2Var3.f12511c;
        long[] jArr2 = a2Var3.f12509a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr2[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i12 << 3) + i14;
                        i(jArr[i15], (g2) objArr[i15]);
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void d() {
        if (this.f39029d) {
            this.f39029d = true;
        } else {
            this.f39032g.c();
        }
    }

    public final boolean e(@NotNull i iVar, boolean z10) {
        if (!this.f39032g.a(iVar.b(), this.f39026a, iVar, z10)) {
            return false;
        }
        boolean z11 = true;
        this.f39027b = true;
        boolean zF = this.f39032g.f(iVar.b(), this.f39026a, iVar, z10);
        if (!this.f39032g.e(iVar) && !zF) {
            z11 = false;
        }
        this.f39027b = false;
        if (this.f39030e) {
            this.f39030e = false;
            int iC = this.f39031f.C();
            for (int i10 = 0; i10 < iC; i10++) {
                j(this.f39031f.y(i10));
            }
            this.f39031f.l0();
        }
        if (this.f39028c) {
            this.f39028c = false;
            h();
        }
        if (this.f39029d) {
            this.f39029d = false;
            d();
        }
        return z11;
    }

    @NotNull
    public final o g() {
        return this.f39032g;
    }

    public final void h() {
        if (this.f39027b) {
            this.f39028c = true;
        } else {
            this.f39032g.d();
            d();
        }
    }
}
