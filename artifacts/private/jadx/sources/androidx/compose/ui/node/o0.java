package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,153:1\n86#2:154\n82#2:155\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n139#1:154\n140#1:155\n*E\n"})
public final class o0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0.d b(j jVar) {
        int iB = m1.b(4);
        int iB2 = m1.b(2);
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        int i10 = 5 << 0;
        if (dVarO8 == null || (dVarO8.N8() & iB) == 0) {
            return null;
        }
        while (dVarO8 != null && (dVarO8.T8() & iB2) == 0) {
            if ((dVarO8.T8() & iB) != 0) {
                return dVarO8;
            }
            dVarO8 = dVarO8.O8();
        }
        return null;
    }
}
