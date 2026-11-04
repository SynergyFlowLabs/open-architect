package t0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class c implements ActionMode.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f376174b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f376175a;

    public c(@NotNull d dVar) {
        this.f376175a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f376175a.j(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f376175a.k(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode actionMode) {
        this.f376175a.l();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f376175a.m(actionMode, menu);
    }
}
