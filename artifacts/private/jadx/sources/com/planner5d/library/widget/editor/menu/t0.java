package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.wishlist.WishList;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class t0 implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257181c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f257183b;

    public t0(@NotNull g1 helper, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f257182a = helper;
        this.f257183b = dialogLauncher;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.activity.fragment.dialog.k kVar = this.f257183b;
        ItemProject itemProjectW1 = this.f257182a.w1();
        if (itemProjectW1 == null) {
            return;
        }
        WishList.show(kVar, itemProjectW1);
    }
}
