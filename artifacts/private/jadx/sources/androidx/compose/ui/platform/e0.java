package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(24)
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f40429a = new e0();

    private e0() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(24)
    public final void a(@NotNull View view, @Nullable androidx.compose.ui.input.pointer.x xVar) {
        PointerIcon pointerIconB = b(view.getContext(), xVar);
        if (Intrinsics.areEqual(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }

    @androidx.annotation.w0(24)
    @NotNull
    public final PointerIcon b(@NotNull Context context, @Nullable androidx.compose.ui.input.pointer.x xVar) {
        if (xVar instanceof androidx.compose.ui.input.pointer.a) {
            return ((androidx.compose.ui.input.pointer.a) xVar).a();
        }
        return xVar instanceof androidx.compose.ui.input.pointer.b ? PointerIcon.getSystemIcon(context, ((androidx.compose.ui.input.pointer.b) xVar).a()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
