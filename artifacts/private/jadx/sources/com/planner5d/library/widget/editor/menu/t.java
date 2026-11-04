package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@kotlin.l(message = "Use OpenCloseListener")
public final class t implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257179b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257180a;

    public t(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257180a = helper;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Item selectedItem;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.a aVarS1 = this.f257180a.s1();
        if (aVarS1 != null && (selectedItem = aVarS1.getSelectedItem()) != null) {
            this.f257180a.B3.q(selectedItem, o3.h.toggle_closed);
            if (this.f257180a.s(selectedItem, false, t3.d.toggle_closed)) {
                l1.f256518a.r(this.f257180a, selectedItem);
            }
        }
    }
}
