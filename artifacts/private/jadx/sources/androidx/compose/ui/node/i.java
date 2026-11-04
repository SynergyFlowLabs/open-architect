package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCompositionLocalConsumerModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,77:1\n57#2,4:78\n*S KotlinDebug\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n*L\n72#1:78,4\n*E\n"})
public final class i {
    public static final <T> T a(@NotNull h hVar, @NotNull androidx.compose.runtime.u0<T> u0Var) {
        if (!hVar.w().a9()) {
            s0.a.i("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) k.u(hVar).m().a(u0Var);
    }
}
