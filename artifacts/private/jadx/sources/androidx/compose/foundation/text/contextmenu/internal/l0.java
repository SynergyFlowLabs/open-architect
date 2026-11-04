package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m0 f18906a;

    public l0(@NotNull m0 m0Var) {
        this.f18906a = m0Var;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@NotNull ActionMode actionMode, @NotNull MenuItem menuItem) {
        return this.f18906a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
        return this.f18906a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@NotNull ActionMode actionMode) {
        this.f18906a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
        return this.f18906a.onPrepareActionMode(actionMode, menu);
    }
}
