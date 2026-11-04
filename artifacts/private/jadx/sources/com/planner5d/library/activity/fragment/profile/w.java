package com.planner5d.library.activity.fragment.profile;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public abstract class w implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f134861a = 0;

    private final void e(Menu menu) {
        menu.findItem(com.planner5d.library.f.j.S0).setVisible(f());
    }

    @Override // androidx.core.view.r0
    public void a(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(com.planner5d.library.f.n.f168912e, menu);
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
        if (menuItem.getItemId() != com.planner5d.library.f.j.S0) {
            return false;
        }
        g();
        return true;
    }

    public abstract boolean f();

    public abstract void g();
}
