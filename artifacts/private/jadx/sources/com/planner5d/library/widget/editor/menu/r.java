package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class r implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257170b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257171a;

    public r(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257171a = helper;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Item selectedItem;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.a aVarS1 = this.f257171a.s1();
        if (aVarS1 == null || (selectedItem = aVarS1.getSelectedItem()) == null || !this.f257171a.s(selectedItem, false, t3.d.item_clone)) {
            return;
        }
        l1 l1Var = l1.f256518a;
        g1 g1Var = this.f257171a;
        ItemProject itemProjectW1 = g1Var.w1();
        if (itemProjectW1 == null) {
            return;
        }
        l1Var.f(g1Var, itemProjectW1, selectedItem);
    }
}
