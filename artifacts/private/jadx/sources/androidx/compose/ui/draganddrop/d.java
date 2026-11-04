package androidx.compose.ui.draganddrop;

import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "This interface is deprecated in favor to DragAndDropSourceModifierNode and DragAndDropTargetModifierNode", replaceWith = @b1(expression = "DragAndDropSourceModifierNode", imports = {}))
public interface d extends androidx.compose.ui.node.j, i {
    @kotlin.l(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    void R6(@NotNull k kVar, long j10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1);

    boolean v6(@NotNull b bVar);
}
