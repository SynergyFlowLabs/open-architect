package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.g2;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.i2;
import androidx.compose.ui.node.j2;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.x1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,539:1\n407#1,7:618\n407#1,7:655\n521#2,10:540\n521#2,10:634\n521#2,3:644\n524#2,7:648\n1#3:550\n90#4:551\n90#4:617\n90#4:630\n90#4:647\n90#4:662\n90#4:663\n90#4:725\n628#5,11:552\n654#5,3:563\n639#5,2:566\n642#5,2:611\n657#5,3:613\n644#5:616\n633#5,6:664\n654#5,3:670\n639#5,2:673\n642#5,2:718\n657#5,3:720\n644#5:723\n634#5:724\n628#5,11:726\n654#5,3:737\n639#5,2:740\n642#5,2:785\n657#5,3:787\n644#5:790\n634#5:791\n629#5:792\n450#6,6:568\n460#6,2:575\n462#6,8:580\n470#6,9:591\n479#6,8:603\n450#6,6:675\n460#6,2:682\n462#6,8:687\n470#6,9:698\n479#6,8:710\n450#6,6:742\n460#6,2:749\n462#6,8:754\n470#6,9:765\n479#6,8:777\n247#7:574\n247#7:681\n247#7:748\n240#8,3:577\n243#8,3:600\n240#8,3:684\n243#8,3:707\n240#8,3:751\n243#8,3:774\n1107#9:588\n1085#9,2:589\n1107#9:695\n1085#9,2:696\n1107#9:762\n1085#9,2:763\n424#10,5:625\n429#10,3:631\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n253#1:618,7\n387#1:655,7\n102#1:540,10\n369#1:634,10\n375#1:644,3\n375#1:648,7\n200#1:551\n201#1:617\n295#1:630\n375#1:647\n424#1:662\n436#1:663\n444#1:725\n200#1:552,11\n200#1:563,3\n200#1:566,2\n200#1:611,2\n200#1:613,3\n200#1:616\n436#1:664,6\n436#1:670,3\n436#1:673,2\n436#1:718,2\n436#1:720,3\n436#1:723\n436#1:724\n444#1:726,11\n444#1:737,3\n444#1:740,2\n444#1:785,2\n444#1:787,3\n444#1:790\n444#1:791\n444#1:792\n200#1:568,6\n200#1:575,2\n200#1:580,8\n200#1:591,9\n200#1:603,8\n436#1:675,6\n436#1:682,2\n436#1:687,8\n436#1:698,9\n436#1:710,8\n444#1:742,6\n444#1:749,2\n444#1:754,8\n444#1:765,9\n444#1:777,8\n200#1:574\n436#1:681\n444#1:748\n200#1:577,3\n200#1:600,3\n436#1:684,3\n436#1:707,3\n444#1:751,3\n444#1:774,3\n200#1:588\n200#1:589,2\n436#1:695\n436#1:696,2\n444#1:762\n444#1:763,2\n290#1:625,5\n290#1:631,3\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41170h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0.d f41171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f41173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final SemanticsConfiguration f41174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private u f41176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41177g;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f41178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(1);
            this.f41178a = jVar;
        }

        public final void c(e0 e0Var) {
            b0.K1(e0Var, this.f41178a.p());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f41179a = str;
        }

        public final void c(e0 e0Var) {
            b0.v1(e0Var, this.f41179a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    public static final class c extends androidx.compose.ui.a0.d implements i2 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1<e0, Unit> f41180s;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super e0, Unit> function1) {
            this.f41180s = function1;
        }

        @Override // androidx.compose.ui.node.i2
        public void p0(e0 e0Var) {
            this.f41180s.invoke(e0Var);
        }
    }

    public u(@NotNull androidx.compose.ui.a0.d dVar, boolean z10, @NotNull l0 l0Var, @NotNull SemanticsConfiguration semanticsConfiguration) {
        this.f41171a = dVar;
        this.f41172b = z10;
        this.f41173c = l0Var;
        this.f41174d = semanticsConfiguration;
        this.f41177g = l0Var.K();
    }

    private final boolean H() {
        return this.f41172b && this.f41174d.v();
    }

    private final void L(List<u> list, SemanticsConfiguration semanticsConfiguration) {
        if (!this.f41174d.u()) {
            O(this, list, false, false, 6, null);
            int size = list.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                u uVar = list.get(size2);
                if (!uVar.H()) {
                    semanticsConfiguration.w(uVar.f41174d);
                    uVar.L(list, semanticsConfiguration);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List O(u uVar, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return uVar.N(list, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    private final n0.j a(androidx.compose.ui.layout.g0 g0Var) {
        ?? N;
        u uVarX = x();
        if (uVarX == null) {
            return n0.j.f332705e.a();
        }
        i1 i1VarA0 = uVarX.f41173c.A0();
        int iB = m1.b(8);
        if ((i1VarA0.j() & iB) == 0) {
            N = 0;
            break;
        }
        androidx.compose.ui.a0.d dVarL = i1VarA0.l();
        loop0: while (true) {
            if (dVarL != null) {
                if ((dVarL.T8() & iB) != 0) {
                    N = dVarL;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (N != 0) {
                        if (N instanceof i2) {
                            if (((i2) N).N4()) {
                                break loop0;
                            }
                        } else if ((N.T8() & iB) != 0 && (N instanceof androidx.compose.ui.node.m)) {
                            androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) N).y9();
                            int i10 = 0;
                            N = N;
                            while (dVarY9 != null) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        N = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (N != 0) {
                                            dVar.d(N);
                                            N = 0;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                                dVarY9 = dVarY9.O8();
                                N = N;
                            }
                            if (i10 == 1) {
                            }
                        }
                        N = androidx.compose.ui.node.k.n(dVar);
                    }
                }
                if ((dVarL.N8() & iB) != 0) {
                    dVarL = dVarL.O8();
                }
            }
            N = 0;
            break;
        }
        i2 i2Var = (i2) N;
        k1 k1VarP = i2Var != null ? androidx.compose.ui.node.k.p(i2Var, m1.b(8)) : null;
        return k1VarP == null ? uVarX.a(g0Var) : androidx.compose.ui.layout.g0.W(k1VarP, g0Var, false, 2, null);
    }

    private final void c(List<u> list) {
        j jVarI = v.i(this);
        if (jVarI != null && this.f41174d.v() && !list.isEmpty()) {
            list.add(d(jVarI, new a(jVarI)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f41174d;
        z zVar = z.f41190a;
        if (semanticsConfiguration.i(zVar.d()) && !list.isEmpty() && this.f41174d.v()) {
            List list2 = (List) o.a(this.f41174d, zVar.d());
            String str = list2 != null ? (String) CollectionsKt.firstOrNull(list2) : null;
            if (str != null) {
                list.add(0, d(null, new b(str)));
            }
        }
    }

    private final u d(j jVar, Function1<? super e0, Unit> function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.B(false);
        semanticsConfiguration.A(false);
        function1.invoke(semanticsConfiguration);
        u uVar = new u(new c(function1), false, new l0(true, jVar != null ? v.j(this) : v.g(this)), semanticsConfiguration);
        uVar.f41175e = true;
        uVar.f41176f = this;
        return uVar;
    }

    private final void e(l0 l0Var, List<u> list, boolean z10) {
        androidx.compose.runtime.collection.d<l0> dVarO0 = l0Var.O0();
        l0[] l0VarArr = dVarO0.f35552a;
        int iR = dVarO0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            if (l0Var2.I() && (z10 || !l0Var2.M())) {
                if (l0Var2.A0().s(m1.b(8))) {
                    list.add(v.a(l0Var2, this.f41172b));
                } else {
                    e(l0Var2, list, z10);
                }
            }
        }
    }

    private final List<u> g(List<u> list, List<u> list2) {
        O(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            u uVar = list.get(size2);
            if (uVar.H()) {
                list2.add(uVar);
            } else if (!uVar.f41174d.u()) {
                uVar.g(list, list2);
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List h(u uVar, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = new ArrayList();
        }
        return uVar.g(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r6v15, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    private final androidx.compose.ui.node.i2 i() {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.u.i():androidx.compose.ui.node.i2");
    }

    private final void j(List<u> list, Function1<? super u, Unit> function1) {
        boolean z10 = false;
        O(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            function1.invoke(list.get(size2));
        }
    }

    public static /* synthetic */ List q(u uVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !uVar.f41172b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return uVar.p(z10, z11, z12);
    }

    public final long A() {
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null) {
                return androidx.compose.ui.layout.h0.h(k1VarF);
            }
        }
        return n0.g.f332700b.e();
    }

    @NotNull
    public final List<u> B() {
        return q(this, false, true, false, 4, null);
    }

    @Nullable
    public final g2 C() {
        x1 x1VarI0 = this.f41173c.I0();
        if (x1VarI0 != null) {
            return x1VarI0.getRootForTest();
        }
        return null;
    }

    public final long D() {
        k1 k1VarF = f();
        return k1VarF != null ? k1VarF.a() : androidx.compose.ui.unit.u.f42720b.a();
    }

    @NotNull
    public final n0.j E() {
        i2 i2VarI = i();
        return i2VarI == null ? this.f41173c.e0().o7() : j2.c(i2VarI.w(), j2.a(this.f41174d));
    }

    @NotNull
    public final SemanticsConfiguration F() {
        return this.f41174d;
    }

    public final boolean G() {
        return this.f41175e;
    }

    public final boolean I() {
        return x() == null;
    }

    public final boolean J() {
        k1 k1VarF = f();
        if (k1VarF != null) {
            return k1VarF.z5();
        }
        return false;
    }

    public final boolean K() {
        if (!this.f41175e && B().isEmpty()) {
            l0 l0VarJ0 = this.f41173c.J0();
            while (true) {
                if (l0VarJ0 == null) {
                    l0VarJ0 = null;
                    break;
                }
                SemanticsConfiguration semanticsConfigurationQ0 = l0VarJ0.q0();
                if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.v()) {
                    break;
                }
                l0VarJ0 = l0VarJ0.J0();
            }
            if (l0VarJ0 == null) {
                return true;
            }
        }
        return false;
    }

    public final void M(boolean z10) {
        this.f41175e = z10;
    }

    @NotNull
    public final List<u> N(@NotNull List<u> list, boolean z10, boolean z11) {
        if (this.f41175e) {
            return CollectionsKt.emptyList();
        }
        e(this.f41173c, list, z11);
        if (z10) {
            c(list);
        }
        return list;
    }

    @NotNull
    public final u b() {
        return new u(this.f41171a, true, this.f41173c, this.f41174d);
    }

    @Nullable
    public final k1 f() {
        k1 k1VarP;
        if (!this.f41175e) {
            i2 i2VarI = i();
            return (i2VarI == null || (k1VarP = androidx.compose.ui.node.k.p(i2VarI, m1.b(8))) == null) ? this.f41173c.e0() : k1VarP;
        }
        u uVarX = x();
        if (uVarX != null) {
            return uVarX.f();
        }
        return null;
    }

    public final int k(@NotNull androidx.compose.ui.layout.a aVar) {
        k1 k1VarF = f();
        if (k1VarF != null) {
            return k1VarF.M(aVar);
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final n0.j l() {
        androidx.compose.ui.layout.g0 g0VarN;
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null && (g0VarN = k1VarF.n()) != null) {
                return a(g0VarN);
            }
        }
        return n0.j.f332705e.a();
    }

    @NotNull
    public final n0.j m() {
        n0.j jVarB;
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null && (jVarB = androidx.compose.ui.layout.h0.b(k1VarF)) != null) {
                return jVarB;
            }
        }
        return n0.j.f332705e.a();
    }

    @NotNull
    public final n0.j n() {
        n0.j jVarC;
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null && (jVarC = androidx.compose.ui.layout.h0.c(k1VarF)) != null) {
                return jVarC;
            }
        }
        return n0.j.f332705e.a();
    }

    @NotNull
    public final List<u> o() {
        return q(this, false, false, false, 7, null);
    }

    @NotNull
    public final List<u> p(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f41174d.u()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        return H() ? h(this, arrayList, null, 2, null) : N(arrayList, z11, z12);
    }

    @NotNull
    public final SemanticsConfiguration r() {
        if (!H()) {
            return this.f41174d;
        }
        SemanticsConfiguration semanticsConfigurationL = this.f41174d.l();
        L(new ArrayList(), semanticsConfigurationL);
        return semanticsConfigurationL;
    }

    public final int s() {
        return this.f41177g;
    }

    @NotNull
    public final androidx.compose.ui.layout.l0 t() {
        return this.f41173c;
    }

    @NotNull
    public final l0 u() {
        return this.f41173c;
    }

    public final boolean v() {
        return this.f41172b;
    }

    @NotNull
    public final androidx.compose.ui.a0.d w() {
        return this.f41171a;
    }

    @Nullable
    public final u x() {
        l0 l0VarJ0;
        u uVar = this.f41176f;
        if (uVar != null) {
            return uVar;
        }
        if (!this.f41172b) {
            l0VarJ0 = null;
            break;
        }
        l0VarJ0 = this.f41173c.J0();
        while (true) {
            if (l0VarJ0 != null) {
                SemanticsConfiguration semanticsConfigurationQ0 = l0VarJ0.q0();
                if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.v()) {
                    break;
                }
                l0VarJ0 = l0VarJ0.J0();
            } else {
                l0VarJ0 = null;
                break;
            }
        }
        if (l0VarJ0 == null) {
            l0VarJ0 = this.f41173c.J0();
            while (l0VarJ0 != null) {
                if (!l0VarJ0.A0().s(m1.b(8))) {
                    l0VarJ0 = l0VarJ0.J0();
                }
            }
            l0VarJ0 = null;
        }
        if (l0VarJ0 == null) {
            return null;
        }
        return v.a(l0VarJ0, this.f41172b);
    }

    public final long y() {
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null) {
                return androidx.compose.ui.layout.h0.f(k1VarF);
            }
        }
        return n0.g.f332700b.e();
    }

    public final long z() {
        k1 k1VarF = f();
        if (k1VarF != null) {
            if (!k1VarF.I()) {
                k1VarF = null;
            }
            if (k1VarF != null) {
                return androidx.compose.ui.layout.h0.g(k1VarF);
            }
        }
        return n0.g.f332700b.e();
    }
}
