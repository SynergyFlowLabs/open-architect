package t0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import n0.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@androidx.annotation.w0(23)
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f376162b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f376163a;

    public a(@NotNull d dVar) {
        this.f376163a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f376163a.j(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f376163a.k(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode actionMode) {
        this.f376163a.l();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@Nullable ActionMode actionMode, @Nullable View view, @Nullable Rect rect) {
        j jVarI = this.f376163a.i();
        if (rect != null) {
            rect.set((int) jVarI.t(), (int) jVarI.B(), (int) jVarI.x(), (int) jVarI.j());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f376163a.m(actionMode, menu);
    }
}
