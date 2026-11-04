package com.planner5d.library.activity.fragment.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface g0 {
    void E(@NotNull com.planner5d.library.services.utility.i iVar, @Nullable Bundle bundle);

    void F(@Nullable Bundle bundle, @Nullable com.planner5d.library.database.model.j jVar, @Nullable l1.e eVar, @NotNull Function0<Unit> function0);

    void J(@NotNull Bundle bundle, @NotNull com.planner5d.library.database.model.j jVar);

    void L();

    int N();

    @NotNull
    int[] Q();

    void T(@NotNull Bundle bundle, @Nullable List<? extends Object> list);

    void a(@NotNull Bundle bundle, @NotNull Object obj);

    @Nullable
    Object h(@NotNull l1.j jVar, @NotNull l1.d<com.planner5d.library.database.model.j> dVar, @NotNull kotlin.coroutines.d<? super List<h0>> dVar2);

    boolean l(@NotNull List<? extends Object> list);

    boolean m(@NotNull Activity activity, @NotNull Object obj, @NotNull MenuItem menuItem);

    void p(@NotNull Activity activity, @Nullable List<? extends Object> list, @NotNull Function0<Unit> function0);

    @NotNull
    EnhancedRecyclerView.e x();

    void z(@NotNull Bundle bundle, @NotNull l1.g gVar, @NotNull b0 b0Var, @Nullable com.planner5d.library.database.model.j jVar);
}
