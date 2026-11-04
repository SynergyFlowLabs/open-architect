package androidx.compose.ui.node;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDelegatableNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,34:1\n57#2,4:35\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n*L\n29#1:35,4\n*E\n"})
public final class l {
    @NotNull
    public static final View a(@NotNull j jVar) {
        if (!jVar.w().a9()) {
            s0.a.i("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objC = p0.c(k.u(jVar));
        Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type android.view.View");
        return (View) objC;
    }
}
