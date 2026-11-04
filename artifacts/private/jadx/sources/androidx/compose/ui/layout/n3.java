package androidx.compose.ui.layout;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsRulers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/WindowInsetsRulers_androidKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets\n*L\n1#1,576:1\n146#2:577\n146#2:635\n117#3:578\n106#3,5:579\n111#3,8:627\n117#3:636\n106#3,5:637\n111#3,8:685\n450#4,6:584\n460#4,2:591\n462#4,8:596\n470#4,9:607\n479#4,8:619\n450#4,6:642\n460#4,2:649\n462#4,8:654\n470#4,9:665\n479#4,8:677\n247#5:590\n247#5:648\n240#6,3:593\n243#6,3:616\n240#6,3:651\n243#6,3:674\n1107#7:604\n1085#7,2:605\n1107#7:662\n1085#7,2:663\n28#8:693\n31#8:694\n34#8:695\n37#8:696\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/WindowInsetsRulers_androidKt\n*L\n95#1:577\n111#1:635\n95#1:578\n95#1:579,5\n95#1:627,8\n111#1:636\n111#1:637,5\n111#1:685,8\n95#1:584,6\n95#1:591,2\n95#1:596,8\n95#1:607,9\n95#1:619,8\n111#1:642,6\n111#1:649,2\n111#1:654,8\n111#1:665,9\n111#1:677,8\n95#1:590\n111#1:648\n95#1:593,3\n95#1:616,3\n111#1:651,3\n111#1:674,3\n95#1:604\n95#1:605,2\n111#1:662\n111#1:663,2\n228#1:693\n229#1:694\n230#1:695\n231#1:696\n*E\n"})
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f39452a = "androidx.compose.ui.layout.WindowInsetsRulers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.j0<k3> f39453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final k3[] f39454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.t1<k3> f39455d;

    static {
        androidx.collection.t1 t1Var = new androidx.collection.t1(8);
        int iH = androidx.core.view.g3.m.h();
        k3.a aVar = k3.f39390a;
        t1Var.j0(iH, aVar.i());
        t1Var.j0(androidx.core.view.g3.m.g(), aVar.e());
        t1Var.j0(androidx.core.view.g3.m.b(), aVar.a());
        t1Var.j0(androidx.core.view.g3.m.d(), aVar.c());
        t1Var.j0(androidx.core.view.g3.m.j(), aVar.k());
        t1Var.j0(androidx.core.view.g3.m.f(), aVar.d());
        t1Var.j0(androidx.core.view.g3.m.k(), aVar.l());
        f39453b = t1Var;
        f39454c = new k3[]{aVar.i(), aVar.e(), aVar.a(), aVar.l(), aVar.k(), aVar.d(), aVar.c(), aVar.m(), aVar.b()};
        androidx.collection.t1<k3> t1Var2 = new androidx.collection.t1<>(7);
        t1Var2.j0(androidx.core.view.g3.m.h(), aVar.i());
        t1Var2.j0(androidx.core.view.g3.m.g(), aVar.e());
        t1Var2.j0(androidx.core.view.g3.m.b(), aVar.a());
        t1Var2.j0(androidx.core.view.g3.m.j(), aVar.k());
        t1Var2.j0(androidx.core.view.g3.m.k(), aVar.l());
        t1Var2.j0(androidx.core.view.g3.m.f(), aVar.d());
        t1Var2.j0(androidx.core.view.g3.m.d(), aVar.c());
        f39455d = t1Var2;
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull x xVar) {
        return a0Var.B2(new RulerProviderModifierElement(xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    @NotNull
    public static final List<m2> f(@NotNull i2.a aVar) {
        g0 g0VarN = aVar.n();
        g0 g0VarD = g0VarN != null ? h0.d(g0VarN) : null;
        for (androidx.compose.ui.node.k1 k1VarY4 = g0VarD instanceof androidx.compose.ui.node.k1 ? (androidx.compose.ui.node.k1) g0VarD : null; k1VarY4 != null; k1VarY4 = k1VarY4.Y4()) {
            int iB = androidx.compose.ui.node.m1.b(262144);
            boolean zJ = androidx.compose.ui.node.n1.j(iB);
            androidx.compose.ui.a0.d dVarV4 = k1VarY4.V4();
            if (zJ || (dVarV4 = dVarV4.W8()) != null) {
                for (androidx.compose.ui.a0.d dVarM5 = k1VarY4.m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
                    if ((dVarM5.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar = null;
                        androidx.compose.ui.a0.d dVarN = dVarM5;
                        while (dVarN != 0) {
                            if (dVarN instanceof androidx.compose.ui.node.p2) {
                                androidx.compose.ui.node.p2 p2Var = (androidx.compose.ui.node.p2) dVarN;
                                if (p2Var.R4() == f39452a) {
                                    return ((u2) p2Var).w9();
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            dVarN = dVarN;
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
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar);
                        }
                    }
                    if (dVarM5 == dVarV4) {
                        break;
                    }
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    @NotNull
    public static final j3 g(@NotNull i2.a aVar, @NotNull k3 k3Var) {
        g0 g0VarN = aVar.n();
        g0 g0VarD = g0VarN != null ? h0.d(g0VarN) : null;
        for (androidx.compose.ui.node.k1 k1VarY4 = g0VarD instanceof androidx.compose.ui.node.k1 ? (androidx.compose.ui.node.k1) g0VarD : null; k1VarY4 != null; k1VarY4 = k1VarY4.Y4()) {
            int iB = androidx.compose.ui.node.m1.b(262144);
            boolean zJ = androidx.compose.ui.node.n1.j(iB);
            androidx.compose.ui.a0.d dVarV4 = k1VarY4.V4();
            if (zJ || (dVarV4 = dVarV4.W8()) != null) {
                for (androidx.compose.ui.a0.d dVarM5 = k1VarY4.m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
                    if ((dVarM5.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar = null;
                        androidx.compose.ui.a0.d dVarN = dVarM5;
                        while (dVarN != 0) {
                            if (dVarN instanceof androidx.compose.ui.node.p2) {
                                androidx.compose.ui.node.p2 p2Var = (androidx.compose.ui.node.p2) dVarN;
                                if (p2Var.R4() == f39452a) {
                                    o3 o3VarP = ((u2) p2Var).z9().p(k3Var);
                                    return o3VarP != null ? o3VarP : l1.f39414a;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar);
                        }
                    }
                    if (dVarM5 == dVarV4) {
                        break;
                    }
                }
            }
        }
        return l1.f39414a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(v2 v2Var, m2 m2Var, long j10, int i10, int i11) {
        if (f3.d(j10, g3.c())) {
            return;
        }
        float f10 = (int) ((j10 >>> 48) & okhttp3.internal.ws.g.f334653t);
        float f11 = (int) ((j10 >>> 32) & okhttp3.internal.ws.g.f334653t);
        float f12 = i10 - ((int) ((j10 >>> 16) & okhttp3.internal.ws.g.f334653t));
        float f13 = i11 - ((int) (j10 & okhttp3.internal.ws.g.f334653t));
        v2Var.e2(m2Var.y(), f10);
        v2Var.e2(m2Var.n(), f11);
        v2Var.e2(m2Var.x(), f12);
        v2Var.e2(m2Var.b(), f13);
    }
}
