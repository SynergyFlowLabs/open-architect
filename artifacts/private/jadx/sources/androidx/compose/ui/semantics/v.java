package androidx.compose.ui.semantics;

import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.i2;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,539:1\n90#2:540\n698#3:541\n633#3,6:542\n654#3,3:548\n639#3,2:551\n699#3:558\n642#3,2:597\n657#3,3:599\n644#3:602\n634#3:603\n701#3:604\n450#4,5:553\n455#4:559\n460#4,2:561\n462#4,8:566\n470#4,9:577\n479#4,8:589\n247#5:560\n240#6,3:563\n243#6,3:586\n1107#7:574\n1085#7,2:575\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n46#1:540\n46#1:541\n46#1:542,6\n46#1:548,3\n46#1:551,2\n46#1:558\n46#1:597,2\n46#1:599,3\n46#1:602\n46#1:603\n46#1:604\n46#1:553,5\n46#1:559\n46#1:561,2\n46#1:566,8\n46#1:577,9\n46#1:589,8\n46#1:560\n46#1:563,3\n46#1:586,3\n46#1:574\n46#1:575,2\n*E\n"})
public final class v {
    /* JADX WARN: Code duplicated, block: B:38:0x0087 A[LOOP:0: B:5:0x001a->B:38:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d A[EDGE_INSN: B:46:0x008d->B:39:0x008d BREAK  A[LOOP:0: B:5:0x001a->B:38:0x0087], SYNTHETIC] */
    @NotNull
    public static final u a(@NotNull l0 l0Var, boolean z10) {
        i1 i1VarA0 = l0Var.A0();
        int iB = m1.b(8);
        Object obj = null;
        if ((i1VarA0.j() & iB) != 0) {
            loop0: for (androidx.compose.ui.a0.d dVarL = i1VarA0.l(); dVarL != null; dVarL = dVarL.O8()) {
                if ((dVarL.T8() & iB) == 0) {
                    if ((dVarL.N8() & iB) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.a0.d dVarN = dVarL;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != null) {
                        if (dVarN instanceof i2) {
                            obj = dVarN;
                            break loop0;
                        }
                        if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                            int i10 = 0;
                            for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (dVarN != null) {
                                            dVar.d(dVarN);
                                            dVarN = null;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarN = androidx.compose.ui.node.k.n(dVar);
                    }
                    if ((dVarL.N8() & iB) != 0) {
                        break;
                    }
                }
            }
        }
        Intrinsics.checkNotNull(obj);
        androidx.compose.ui.a0.d dVarW = ((i2) obj).w();
        SemanticsConfiguration semanticsConfigurationQ0 = l0Var.q0();
        if (semanticsConfigurationQ0 == null) {
            semanticsConfigurationQ0 = new SemanticsConfiguration();
        }
        return new u(dVarW, z10, l0Var, semanticsConfigurationQ0);
    }

    @NotNull
    public static final u b(@NotNull i2 i2Var, boolean z10, @NotNull l0 l0Var) {
        androidx.compose.ui.a0.d dVarW = i2Var.w();
        SemanticsConfiguration semanticsConfigurationQ0 = l0Var.q0();
        if (semanticsConfigurationQ0 == null) {
            semanticsConfigurationQ0 = new SemanticsConfiguration();
        }
        return new u(dVarW, z10, l0Var, semanticsConfigurationQ0);
    }

    public static /* synthetic */ u c(i2 i2Var, boolean z10, l0 l0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            l0Var = androidx.compose.ui.node.k.u(i2Var);
        }
        return b(i2Var, z10, l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(u uVar) {
        return uVar.s() + 2000000000;
    }

    @Nullable
    public static final l0 h(@NotNull l0 l0Var, @NotNull Function1<? super l0, Boolean> function1) {
        for (l0 l0VarJ0 = l0Var.J0(); l0VarJ0 != null; l0VarJ0 = l0VarJ0.J0()) {
            if (function1.invoke(l0VarJ0).booleanValue()) {
                return l0VarJ0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j i(u uVar) {
        return (j) o.a(uVar.F(), z.f41190a.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(u uVar) {
        return uVar.s() + 1000000000;
    }
}
