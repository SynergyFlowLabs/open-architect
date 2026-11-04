package androidx.compose.ui.modifier;

import androidx.compose.ui.a0;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,237:1\n103#2,4:238\n103#2,4:242\n103#2,4:246\n57#2,4:257\n98#3:250\n248#4,5:251\n91#4:256\n92#4,8:261\n450#4,6:269\n460#4,2:276\n462#4,8:281\n470#4,9:292\n479#4,8:304\n101#4,7:312\n247#5:275\n240#6,3:278\n243#6,3:301\n1107#7:289\n1085#7,2:290\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n151#1:238,4\n154#1:242,4\n167#1:246,4\n171#1:257,4\n171#1:250\n171#1:251,5\n171#1:256\n171#1:261,8\n171#1:269,6\n171#1:276,2\n171#1:281,8\n171#1:292,9\n171#1:304,8\n171#1:312,7\n171#1:275\n171#1:278,3\n171#1:301,3\n171#1:289\n171#1:290,2\n*E\n"})
public interface j extends n, androidx.compose.ui.node.j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // androidx.compose.ui.modifier.n
    default <T> T I(@NotNull c<T> cVar) {
        i1 i1VarA0;
        if (!w().a9()) {
            s0.a.g("ModifierLocal accessed from an unattached node");
        }
        int iB = m1.b(32);
        if (!w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        a0.d dVarW8 = w().W8();
        l0 l0VarU = androidx.compose.ui.node.k.u(this);
        while (l0VarU != null) {
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        ?? N = dVarW8;
                        ?? dVar = 0;
                        while (N != 0) {
                            if (N instanceof j) {
                                j jVar = (j) N;
                                if (jVar.x1().a(cVar)) {
                                    return (T) jVar.x1().b(cVar);
                                }
                            } else if ((N.T8() & iB) != 0 && (N instanceof androidx.compose.ui.node.m)) {
                                a0.d dVarY9 = ((androidx.compose.ui.node.m) N).y9();
                                int i10 = 0;
                                N = N;
                                dVar = dVar;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            N = dVarY9;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = dVar;
                                                dVar = new androidx.compose.runtime.collection.d(new a0.d[16], 0);
                                            }
                                            dVar = dVar;
                                            N = N;
                                            if (N != 0) {
                                                dVar.d(N);
                                                N = 0;
                                            }
                                            dVar.d(dVarY9);
                                        }
                                    }
                                    dVarY9 = dVarY9.O8();
                                    N = N;
                                    dVar = dVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            N = androidx.compose.ui.node.k.n(dVar);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        return cVar.a().invoke();
    }

    default <T> void o7(@NotNull c<T> cVar, T t10) {
        if (!(x1() != b.f39616b)) {
            s0.a.g("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!x1().a(cVar)) {
            s0.a.g("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + cVar + " was not found.");
        }
        x1().c(cVar, t10);
    }

    @NotNull
    default i x1() {
        return b.f39616b;
    }
}
