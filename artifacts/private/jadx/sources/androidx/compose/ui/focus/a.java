package androidx.compose.ui.focus;

import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,59:1\n118#2:60\n278#3:61\n248#3,5:62\n91#3:67\n92#3,8:72\n450#3,5:80\n279#3:85\n455#3:86\n460#3,2:88\n462#3,8:93\n470#3,9:104\n479#3,8:116\n101#3,7:124\n281#3:131\n57#4,4:68\n247#5:87\n240#6,3:90\n243#6,3:113\n1107#7:101\n1085#7,2:102\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:60\n39#1:61\n39#1:62,5\n39#1:67\n39#1:72,8\n39#1:80,5\n39#1:85\n39#1:86\n39#1:88,2\n39#1:93,8\n39#1:104,9\n39#1:116,8\n39#1:124,7\n39#1:131\n39#1:68,4\n39#1:87\n39#1:90,3\n39#1:113,3\n39#1:101\n39#1:102,2\n*E\n"})
public final class a {
    @Nullable
    public static final <T> T a(@NotNull FocusTargetNode focusTargetNode, int i10, @NotNull Function1<? super androidx.compose.ui.layout.i.a, ? extends T> function1) {
        androidx.compose.ui.a0.d dVarN;
        androidx.compose.ui.layout.i iVarE9;
        int iC;
        i1 i1VarA0;
        int iB = m1.b(1024);
        if (!focusTargetNode.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.a0.d dVarW8 = focusTargetNode.w().W8();
        androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNode);
        loop0: while (true) {
            if (l0VarU == null) {
                dVarN = null;
                break;
            }
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar = null;
                        while (dVarN != null) {
                            if (dVarN instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarN;
        if ((focusTargetNode2 != null && Intrinsics.areEqual(focusTargetNode2.E9(), focusTargetNode.E9())) || (iVarE9 = focusTargetNode.E9()) == null) {
            return null;
        }
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.h())) {
            iC = androidx.compose.ui.layout.i.b.f39357b.a();
        } else if (f.l(i10, aVar.a())) {
            iC = androidx.compose.ui.layout.i.b.f39357b.d();
        } else if (f.l(i10, aVar.d())) {
            iC = androidx.compose.ui.layout.i.b.f39357b.e();
        } else if (f.l(i10, aVar.g())) {
            iC = androidx.compose.ui.layout.i.b.f39357b.f();
        } else if (f.l(i10, aVar.e())) {
            iC = androidx.compose.ui.layout.i.b.f39357b.b();
        } else {
            if (!f.l(i10, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = androidx.compose.ui.layout.i.b.f39357b.c();
        }
        return (T) iVarE9.t5(iC, function1);
    }
}
