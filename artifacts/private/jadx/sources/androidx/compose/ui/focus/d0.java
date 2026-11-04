package androidx.compose.ui.focus;

import androidx.compose.ui.node.m1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusPropertiesModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusPropertiesModifierNode.kt\nandroidx/compose/ui/focus/FocusPropertiesModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,44:1\n118#2:45\n284#3,5:46\n149#3:51\n150#3:56\n151#3,3:60\n154#3:64\n155#3,9:66\n450#3,6:75\n460#3,2:82\n462#3,17:87\n479#3,8:107\n164#3,6:115\n57#4,4:52\n1107#5:57\n1085#5,2:58\n519#6:63\n44#6:65\n247#7:81\n240#8,3:84\n243#8,3:104\n*S KotlinDebug\n*F\n+ 1 FocusPropertiesModifierNode.kt\nandroidx/compose/ui/focus/FocusPropertiesModifierNodeKt\n*L\n38#1:45\n38#1:46,5\n38#1:51\n38#1:56\n38#1:60,3\n38#1:64\n38#1:66,9\n38#1:75,6\n38#1:82,2\n38#1:87,17\n38#1:107,8\n38#1:115,6\n38#1:52,4\n38#1:57\n38#1:58,2\n38#1:63\n38#1:65\n38#1:81\n38#1:84,3\n38#1:104,3\n*E\n"})
public final class d0 {
    public static final void a(@NotNull c0 c0Var) {
        int iB = m1.b(1024);
        if (!c0Var.w().a9()) {
            s0.a.i("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
        androidx.compose.ui.a0.d dVarO8 = c0Var.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar, c0Var.w(), false);
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
                                t0.a((FocusTargetNode) dVarN);
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
    }
}
