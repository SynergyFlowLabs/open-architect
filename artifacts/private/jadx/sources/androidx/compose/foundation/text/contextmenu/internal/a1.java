package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a1 f18835a = new a1();

    private a1() {
    }

    @androidx.annotation.w0(23)
    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @androidx.annotation.w0(23)
    @Nullable
    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
