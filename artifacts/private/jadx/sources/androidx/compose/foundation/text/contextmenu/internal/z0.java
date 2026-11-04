package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z0 f18971a = new z0();

    private z0() {
    }

    public final void a(@NotNull ActionMode actionMode) {
        a1.f18835a.a(actionMode);
    }

    @Nullable
    public final ActionMode b(@NotNull View view, @NotNull m0 m0Var) {
        return a1.f18835a.b(view, new e0(m0Var), 1);
    }
}
