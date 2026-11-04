package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/FloatingTextActionModeCallback\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,495:1\n26#2:496\n26#2:497\n26#2:498\n26#2:499\n*S KotlinDebug\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/FloatingTextActionModeCallback\n*L\n400#1:496\n401#1:497\n402#1:498\n403#1:499\n*E\n"})
final class e0 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m0 f18857a;

    public e0(@NotNull m0 m0Var) {
        this.f18857a = m0Var;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@NotNull ActionMode actionMode, @NotNull MenuItem menuItem) {
        return this.f18857a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
        return this.f18857a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@NotNull ActionMode actionMode) {
        this.f18857a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@NotNull ActionMode actionMode, @Nullable View view, @NotNull Rect rect) {
        n0.j jVarA = this.f18857a.a(actionMode, view);
        rect.set(Math.round(jVarA.t()), Math.round(jVarA.B()), Math.round(jVarA.x()), Math.round(jVarA.j()));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@NotNull ActionMode actionMode, @NotNull Menu menu) {
        return this.f18857a.onPrepareActionMode(actionMode, menu);
    }
}
