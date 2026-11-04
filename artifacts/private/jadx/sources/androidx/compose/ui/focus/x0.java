package androidx.compose.ui.focus;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,272:1\n44#2:273\n472#2:274\n472#2:275\n1107#3:276\n1085#3,2:277\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n251#1:273\n255#1:274\n256#1:275\n263#1:276\n263#1:277,2\n*E\n"})
final class x0 implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f37474a = new x0();

    private x0() {
    }

    private final androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> b(androidx.compose.ui.node.l0 l0Var) {
        androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> dVar = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.node.l0[16], 0);
        while (l0Var != null) {
            dVar.c(0, l0Var);
            l0Var = l0Var.J0();
        }
        return dVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull FocusTargetNode focusTargetNode, @NotNull FocusTargetNode focusTargetNode2) {
        int i10 = 0;
        if (v0.g(focusTargetNode) && v0.g(focusTargetNode2)) {
            androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNode);
            androidx.compose.ui.node.l0 l0VarU2 = androidx.compose.ui.node.k.u(focusTargetNode2);
            if (Intrinsics.areEqual(l0VarU, l0VarU2)) {
                return 0;
            }
            androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> dVarB = b(l0VarU);
            androidx.compose.runtime.collection.d<androidx.compose.ui.node.l0> dVarB2 = b(l0VarU2);
            int iMin = Math.min(dVarB.R() - 1, dVarB2.R() - 1);
            if (iMin >= 0) {
                while (Intrinsics.areEqual(dVarB.f35552a[i10], dVarB2.f35552a[i10])) {
                    if (i10 != iMin) {
                        i10++;
                    }
                }
                return Intrinsics.compare(dVarB.f35552a[i10].K0(), dVarB2.f35552a[i10].K0());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if (v0.g(focusTargetNode)) {
            return -1;
        }
        return v0.g(focusTargetNode2) ? 1 : 0;
    }
}
