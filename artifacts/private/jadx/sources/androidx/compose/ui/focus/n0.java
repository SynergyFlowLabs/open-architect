package androidx.compose.ui.focus;

import androidx.compose.ui.layout.g2;
import androidx.compose.ui.layout.h2;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,160:1\n118#2:161\n118#2:237\n284#3,5:162\n149#3:167\n150#3:172\n151#3,3:176\n154#3:180\n155#3,9:182\n450#3,6:191\n460#3,2:198\n462#3,17:203\n479#3,8:223\n164#3,6:231\n284#3,5:238\n149#3:243\n150#3:248\n151#3,3:252\n154#3:256\n155#3,9:258\n450#3,6:267\n460#3,2:274\n462#3,17:279\n479#3,8:299\n164#3,6:307\n57#4,4:168\n57#4,4:244\n1107#5:173\n1085#5,2:174\n1107#5:249\n1085#5,2:250\n519#6:179\n44#6:181\n519#6:255\n44#6:257\n247#7:197\n247#7:273\n240#8,3:200\n243#8,3:220\n240#8,3:276\n243#8,3:296\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n39#1:161\n59#1:237\n39#1:162,5\n39#1:167\n39#1:172\n39#1:176,3\n39#1:180\n39#1:182,9\n39#1:191,6\n39#1:198,2\n39#1:203,17\n39#1:223,8\n39#1:231,6\n59#1:238,5\n59#1:243\n59#1:248\n59#1:252,3\n59#1:256\n59#1:258,9\n59#1:267,6\n59#1:274,2\n59#1:279,17\n59#1:299,8\n59#1:307,6\n39#1:168,4\n59#1:244,4\n39#1:173\n39#1:174,2\n59#1:249\n59#1:250,2\n39#1:179\n39#1:181\n59#1:255\n59#1:257\n39#1:197\n59#1:273\n39#1:200,3\n39#1:220,3\n59#1:276,3\n59#1:296,3\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f37435a = "previouslyFocusedChildHash";

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f37436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FocusTargetNode focusTargetNode) {
            super(0);
            this.f37436a = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(this.f37436a.G9());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g0 g0Var) {
        return a0Var.B2(new FocusRestorerElement(g0Var));
    }

    @androidx.compose.ui.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use focusRestorer(FocusRequester) instead", replaceWith = @kotlin.b1(expression = "this.focusRestorer(onRestoreFailed())", imports = {}))
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @Nullable Function0<g0> function0) {
        g0 g0VarC;
        if (function0 == null || (g0VarC = function0.invoke()) == null) {
            g0VarC = g0.f37418b.c();
        }
        return a(a0Var, g0VarC);
    }

    public static /* synthetic */ androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, g0 g0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0Var = g0.f37418b.c();
        }
        return a(a0Var, g0Var);
    }

    @Nullable
    public static final g2.a d(@NotNull FocusTargetNode focusTargetNode) {
        g2 g2Var;
        FocusTargetNode focusTargetNodeB = v0.b(focusTargetNode);
        if (focusTargetNodeB == null || (g2Var = (g2) androidx.compose.ui.node.i.a(focusTargetNodeB, h2.a())) == null) {
            return null;
        }
        return g2Var.a();
    }

    public static final boolean e(@NotNull FocusTargetNode focusTargetNode) {
        androidx.compose.runtime.saveable.v vVar;
        Object objF;
        if (focusTargetNode.G9() == 0 && (vVar = (androidx.compose.runtime.saveable.v) androidx.compose.ui.node.i.a(focusTargetNode, androidx.compose.runtime.saveable.y.g())) != null && (objF = vVar.f(f37435a)) != null) {
            focusTargetNode.I9(((Integer) objF).intValue());
        }
        if (focusTargetNode.G9() == 0) {
            return false;
        }
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = focusTargetNode.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar, focusTargetNode.w(), false);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                androidx.compose.ui.node.k.c(dVar, dVarN, false);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
                                if (focusTargetNode2.a9() && androidx.compose.ui.node.k.u(focusTargetNode2).f() == focusTargetNode.G9()) {
                                    if (!e(focusTargetNode2) && !r0.B1(focusTargetNode2, 0, 1, null)) {
                                        return false;
                                    }
                                    return true;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar2.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar2.d(dVarY9);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar2);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
        return false;
    }

    public static final boolean f(@NotNull FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.c5().n()) {
            return false;
        }
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = focusTargetNode.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar, focusTargetNode.w(), false);
        } else {
            dVar.d(dVarO8);
        }
        while (dVar.R() != 0) {
            androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar.r0(dVar.R() - 1);
            if ((dVarN.N8() & iB) == 0) {
                androidx.compose.ui.node.k.c(dVar, dVarN, false);
            } else {
                while (dVarN != null) {
                    if ((dVarN.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
                                if (focusTargetNode2.c5().n()) {
                                    focusTargetNode.I9(androidx.compose.ui.node.k.u(focusTargetNode2).f());
                                    androidx.compose.runtime.saveable.v vVar = (androidx.compose.runtime.saveable.v) androidx.compose.ui.node.i.a(focusTargetNode, androidx.compose.runtime.saveable.y.g());
                                    if (vVar != null) {
                                        vVar.b(f37435a, new a(focusTargetNode));
                                    }
                                    return true;
                                }
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                dVar2.d(dVarN);
                                                dVarN = null;
                                            }
                                            dVar2.d(dVarY9);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar2);
                        }
                        break;
                    }
                    dVarN = dVarN.O8();
                }
            }
        }
        return false;
    }
}
