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
@kotlin.l(message = "Use FlipListener")
public final class s implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257173c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f257175b;

    public s(@NotNull g1 helper, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257174a = helper;
        this.f257175b = z10;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Item selectedItem;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.widget.editor.a aVarS1 = this.f257174a.s1();
        if (aVarS1 == null || (selectedItem = aVarS1.getSelectedItem()) == null) {
            return;
        }
        this.f257174a.B3.q(selectedItem, o3.h.toggle_flip);
        if (this.f257174a.s(selectedItem, false, t3.d.toggle_flip)) {
            l1.f256518a.n(this.f257174a, selectedItem, this.f257175b);
        }
    }
}
