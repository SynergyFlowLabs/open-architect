package com.planner5d.library.model.manager.payments;

import android.app.Activity;
import android.net.Uri;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.statistics.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface a0 {
    void b(@NotNull g0 g0Var);

    boolean c();

    void d(@NotNull Activity activity, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, @NotNull Function2<? super Boolean, ? super Boolean, Unit> function2);

    @Nullable
    y3.c e(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar);

    boolean f(@NotNull Uri uri);

    void g();

    void h();

    @Nullable
    Object i(@NotNull Activity activity, @NotNull h3 h3Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean isEnabled();
}
