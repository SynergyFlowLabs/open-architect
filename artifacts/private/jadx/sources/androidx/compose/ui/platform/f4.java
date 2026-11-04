package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(23)
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f4 f40442a = new f4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40443b = 0;

    private f4() {
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
