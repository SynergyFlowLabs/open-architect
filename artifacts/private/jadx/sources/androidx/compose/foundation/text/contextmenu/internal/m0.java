package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@l1
public interface m0 {
    @NotNull
    n0.j a(@NotNull ActionMode actionMode, @Nullable View view);

    boolean onActionItemClicked(@NotNull ActionMode actionMode, @NotNull MenuItem menuItem);

    boolean onCreateActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu);

    void onDestroyActionMode(@NotNull ActionMode actionMode);

    boolean onPrepareActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu);
}
