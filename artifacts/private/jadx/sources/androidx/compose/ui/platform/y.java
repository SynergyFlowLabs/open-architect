package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(24)
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f40969a = new y();

    private y() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(24)
    public final boolean a(@NotNull View view, @NotNull androidx.compose.ui.draganddrop.k kVar, @NotNull androidx.compose.ui.draganddrop.a aVar) {
        return view.startDragAndDrop(kVar.a(), aVar, kVar.c(), kVar.b());
    }
}
