package com.planner5d.library.contest.helper;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public abstract class a implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f153273a = 0;

    private final void e(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(com.planner5d.library.contest.e.i.G0);
        menuItemFindItem.setIcon(com.planner5d.library.contest.e.g.f150371a8);
        menuItemFindItem.setVisible(f());
    }

    @Override // androidx.core.view.r0
    public void a(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(com.planner5d.library.contest.e.m.f151337a, menu);
        e(menu);
    }

    @Override // androidx.core.view.r0
    public void c(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        e(menu);
    }

    @Override // androidx.core.view.r0
    public boolean d(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != com.planner5d.library.contest.e.i.G0) {
            return false;
        }
        g();
        return true;
    }

    public abstract boolean f();

    public abstract void g();
}
