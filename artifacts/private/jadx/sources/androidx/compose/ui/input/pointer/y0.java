package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.d2;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface y0 extends d2 {
    @kotlin.l(level = kotlin.n.ERROR, message = "This property is deprecated. Use 'pointerInputEventHandler' instead.", replaceWith = @b1(expression = "pointerInputEventHandler", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode.pointerInputEventHandler"}))
    static /* synthetic */ void N2() {
    }

    void A6();

    default void M5(@NotNull PointerInputEventHandler pointerInputEventHandler) {
        throw new kotlin.l0("An operation is not implemented: " + ("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }

    void T3(@NotNull Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2);

    @NotNull
    default PointerInputEventHandler X0() {
        throw new kotlin.l0("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    @NotNull
    Function2<l0, kotlin.coroutines.d<? super Unit>, Object> s8();
}
