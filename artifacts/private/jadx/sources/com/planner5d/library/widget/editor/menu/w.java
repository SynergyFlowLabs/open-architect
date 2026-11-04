package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@kotlin.l(message = "Use ItemWallVisibilityListener")
public final class w implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257188b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257189a;

    public w(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257189a = helper;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Item selectedItem;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.a aVarS1 = this.f257189a.s1();
        if (aVarS1 != null && (selectedItem = aVarS1.getSelectedItem()) != null) {
            this.f257189a.B3.q(selectedItem, o3.h.toggle_show);
            l1.f256518a.s(this.f257189a, selectedItem);
        }
    }
}
