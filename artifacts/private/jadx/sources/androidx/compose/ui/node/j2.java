package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,131:1\n90#2:132\n90#2:133\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n126#1:132\n129#1:133\n*E\n"})
public final class j2 {
    public static final boolean a(@NotNull SemanticsConfiguration semanticsConfiguration) {
        if (androidx.compose.ui.semantics.o.a(semanticsConfiguration, androidx.compose.ui.semantics.n.f41142a.l()) == null) {
            return false;
        }
        int i10 = 7 ^ 1;
        return true;
    }

    public static final void b(@NotNull i2 i2Var) {
        k.u(i2Var).d1();
    }

    @NotNull
    public static final n0.j c(@NotNull androidx.compose.ui.a0.d dVar, boolean z10) {
        if (dVar.w().a9()) {
            return !z10 ? androidx.compose.ui.layout.h0.b(k.p(dVar, m1.b(8))) : k.p(dVar, m1.b(8)).o7();
        }
        return n0.j.f332705e.a();
    }
}
