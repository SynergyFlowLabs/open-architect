package com.planner5d.library.widget.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.editor.toolbar.EditorSubmenu;
import com.planner5d.library.widget.editor.toolbar.EditorToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258328b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f258329a;

    public a0(@NotNull q listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f258329a = listeners;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        EditorToolbar editorToolbar = (EditorToolbar) activity.findViewById(com.planner5d.library.f.j.f168424ub);
        EditorSubmenu editorSubmenu = (EditorSubmenu) activity.findViewById(com.planner5d.library.f.j.f168400tb);
        if (menuItem.isChecked()) {
            editorToolbar.setMenuSelected(null);
            editorSubmenu.e();
        } else {
            editorToolbar.setMenuSelected(menuItem);
            q qVar = this.f258329a;
            Intrinsics.checkNotNull(editorToolbar);
            editorSubmenu.f(activity, menuItem, qVar, editorToolbar);
        }
    }

    @NotNull
    public final q b() {
        return this.f258329a;
    }
}
