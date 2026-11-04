package com.planner5d.library.widget.menu;

import android.app.Activity;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SparseArray<p> f258372a = new SparseArray<>();

    public boolean a(@Nullable Activity activity, @NotNull MenuItem selectedMenuItem) {
        p pVar;
        Intrinsics.checkNotNullParameter(selectedMenuItem, "selectedMenuItem");
        if (activity == null || !selectedMenuItem.isEnabled() || (pVar = this.f258372a.get(selectedMenuItem.getItemId(), null)) == null) {
            return false;
        }
        pVar.a(activity, selectedMenuItem);
        return true;
    }

    public final void b(@d0 int i10, @Nullable p pVar) {
        this.f258372a.put(i10, pVar);
    }
}
