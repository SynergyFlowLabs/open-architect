package androidx.compose.ui.input.pointer;

import androidx.collection.b1;
import androidx.collection.g2;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.m1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,688:1\n633#1,5:697\n640#1:798\n633#1,5:799\n640#1:856\n424#2,8:689\n424#2,8:746\n424#2,8:848\n424#2,8:917\n94#3:702\n94#3:754\n94#3:804\n94#3:857\n94#3:925\n450#4,6:703\n460#4,2:710\n462#4,8:715\n470#4,9:726\n479#4,8:738\n450#4,6:755\n460#4,2:762\n462#4,8:767\n470#4,9:778\n479#4,8:790\n450#4,6:805\n460#4,2:812\n462#4,8:817\n470#4,9:828\n479#4,8:840\n450#4,6:858\n460#4,2:865\n462#4,8:870\n470#4,9:881\n479#4,8:893\n450#4,6:926\n460#4,2:933\n462#4,8:938\n470#4,9:949\n479#4,8:961\n247#5:709\n247#5:761\n247#5:811\n247#5:864\n247#5:932\n240#6,3:712\n243#6,3:735\n240#6,3:764\n243#6,3:787\n240#6,3:814\n243#6,3:837\n240#6,3:867\n243#6,3:890\n240#6,3:935\n243#6,3:958\n1107#7:723\n1085#7,2:724\n1107#7:775\n1085#7,2:776\n1107#7:825\n1085#7,2:826\n1107#7:878\n1085#7,2:879\n1107#7:946\n1085#7,2:947\n111#8,2:901\n111#8,2:906\n35#9,3:903\n39#9:908\n118#9:910\n35#9,5:911\n119#9:916\n35#9,3:969\n39#9:973\n40#10:909\n67#10:972\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n410#1:697,5\n410#1:798\n449#1:799,5\n449#1:856\n395#1:689,8\n421#1:746,8\n459#1:848,8\n650#1:917,8\n415#1:702\n435#1:754\n453#1:804\n487#1:857\n651#1:925\n415#1:703,6\n415#1:710,2\n415#1:715,8\n415#1:726,9\n415#1:738,8\n435#1:755,6\n435#1:762,2\n435#1:767,8\n435#1:778,9\n435#1:790,8\n453#1:805,6\n453#1:812,2\n453#1:817,8\n453#1:828,9\n453#1:840,8\n487#1:858,6\n487#1:865,2\n487#1:870,8\n487#1:881,9\n487#1:893,8\n651#1:926,6\n651#1:933,2\n651#1:938,8\n651#1:949,9\n651#1:961,8\n415#1:709\n435#1:761\n453#1:811\n487#1:864\n651#1:932\n415#1:712,3\n415#1:735,3\n435#1:764,3\n435#1:787,3\n453#1:814,3\n453#1:837,3\n487#1:867,3\n487#1:890,3\n651#1:935,3\n651#1:958,3\n415#1:723\n415#1:724,2\n435#1:775\n435#1:776,2\n453#1:825\n453#1:826,2\n487#1:878\n487#1:879,2\n651#1:946\n651#1:947,2\n504#1:901,2\n514#1:906,2\n509#1:903,3\n509#1:908\n563#1:910\n563#1:911,5\n563#1:916\n665#1:969,3\n665#1:973\n549#1:909\n676#1:972\n*E\n"})
public final class n extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39066l = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0.d f39067d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f39070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private q f39071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39072i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r0.c f39068e = new r0.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b1<c0> f39069f = new b1<>(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39073j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39074k = true;

    public n(@NotNull androidx.compose.ui.a0.d dVar) {
        this.f39067d = dVar;
    }

    private final void j() {
        this.f39069f.b();
        this.f39070g = null;
    }

    private final boolean k(Function0<Unit> function0) {
        if (!this.f39069f.k() && this.f39067d.a9()) {
            function0.invoke();
            return true;
        }
        return false;
    }

    private final boolean n(q qVar, q qVar2) {
        if (qVar == null || qVar.e().size() != qVar2.e().size()) {
            return true;
        }
        int size = qVar2.e().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!n0.g.l(qVar.e().get(i10).u(), qVar2.e().get(i10).u())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0296  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.o
    public boolean a(@org.jetbrains.annotations.NotNull androidx.collection.b1<androidx.compose.ui.input.pointer.c0> r46, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.g0 r47, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.i r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.n.a(androidx.collection.b1, androidx.compose.ui.layout.g0, androidx.compose.ui.input.pointer.i, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.o
    public void b(@NotNull i iVar) {
        super.b(iVar);
        q qVar = this.f39071h;
        if (qVar == null) {
            return;
        }
        this.f39072i = this.f39073j;
        List<c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = listE.get(i10);
            boolean zW = c0Var.w();
            boolean zA = iVar.a(c0Var.s());
            boolean z10 = this.f39073j;
            if ((!zW && !zA) || (!zW && !z10)) {
                this.f39068e.j(c0Var.s());
            }
        }
        this.f39073j = false;
        this.f39074k = u.k(qVar.j(), u.f39127b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // androidx.compose.ui.input.pointer.o
    public void d() {
        androidx.compose.runtime.collection.d<n> dVarG = g();
        n[] nVarArr = dVarG.f35552a;
        int iR = dVarG.R();
        for (int i10 = 0; i10 < iR; i10++) {
            nVarArr[i10].d();
        }
        androidx.compose.ui.a0.d dVarN = this.f39067d;
        int iB = m1.b(16);
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarN != 0) {
            if (dVarN instanceof d2) {
                ((d2) dVarN).p3();
            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                int i11 = 0;
                dVarN = dVarN;
                while (dVarY9 != null) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i11++;
                        if (i11 == 1) {
                            dVarN = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarN != 0) {
                                dVar.d(dVarN);
                                dVarN = 0;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                    dVarY9 = dVarY9.O8();
                    dVarN = dVarN;
                }
                if (i11 == 1) {
                }
            }
            dVarN = androidx.compose.ui.node.k.n(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.input.pointer.o
    public boolean e(@NotNull i iVar) {
        boolean z10 = false;
        z10 = false;
        if (!this.f39069f.k() && this.f39067d.a9()) {
            q qVar = this.f39071h;
            Intrinsics.checkNotNull(qVar);
            androidx.compose.ui.layout.g0 g0Var = this.f39070g;
            Intrinsics.checkNotNull(g0Var);
            long jA = g0Var.a();
            androidx.compose.ui.a0.d dVarN = this.f39067d;
            int iB = m1.b(16);
            androidx.compose.runtime.collection.d dVar = null;
            while (dVarN != 0) {
                if (dVarN instanceof d2) {
                    ((d2) dVarN).p5(qVar, s.Final, jA);
                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                    androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                    int i10 = 0;
                    while (dVarY9 != null) {
                        if ((dVarY9.T8() & iB) != 0) {
                            i10++;
                            if (i10 == 1) {
                                dVarN = dVarN;
                                dVarN = dVarY9;
                            } else {
                                if (dVar == null) {
                                    dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                }
                                if (dVarN != 0) {
                                    dVar.d(dVarN);
                                    dVarN = 0;
                                }
                                dVar.d(dVarY9);
                            }
                        } else {
                            dVarN = dVarN;
                        }
                        dVarY9 = dVarY9.O8();
                        dVarN = dVarN;
                    }
                    dVarN = dVarN;
                    if (i10 == 1) {
                    }
                }
                dVarN = androidx.compose.ui.node.k.n(dVar);
            }
            if (this.f39067d.a9()) {
                androidx.compose.runtime.collection.d<n> dVarG = g();
                n[] nVarArr = dVarG.f35552a;
                int iR = dVarG.R();
                for (int i11 = 0; i11 < iR; i11++) {
                    nVarArr[i11].e(iVar);
                }
            }
            z10 = true;
        }
        b(iVar);
        j();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.o
    public boolean f(@org.jetbrains.annotations.NotNull androidx.collection.b1<androidx.compose.ui.input.pointer.c0> r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.g0 r13, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.i r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.n.f(androidx.collection.b1, androidx.compose.ui.layout.g0, androidx.compose.ui.input.pointer.i, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.o
    public void h(long j10, @NotNull g2<n> g2Var) {
        if (this.f39068e.d(j10) && !g2Var.d(this)) {
            this.f39068e.j(j10);
            this.f39069f.q(j10);
        }
        androidx.compose.runtime.collection.d<n> dVarG = g();
        n[] nVarArr = dVarG.f35552a;
        int iR = dVarG.R();
        for (int i10 = 0; i10 < iR; i10++) {
            nVarArr[i10].h(j10, g2Var);
        }
    }

    @NotNull
    public final androidx.compose.ui.a0.d l() {
        return this.f39067d;
    }

    @NotNull
    public final r0.c m() {
        return this.f39068e;
    }

    public final void o() {
        this.f39073j = true;
    }

    @NotNull
    public String toString() {
        return "Node(modifierNode=" + this.f39067d + ", children=" + g() + ", pointerIds=" + this.f39068e + ')';
    }
}
