package com.planner5d.library.model.manager.statistics;

import android.app.Activity;
import android.content.Intent;
import com.planner5d.library.model.manager.statistics.events.h3;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public interface m {
    void a();

    void b(@NotNull g0 g0Var);

    void c(Intent intent);

    void d(h3 h3Var);

    void e(@Nullable Activity activity);

    void f(Activity activity);

    void g(@Nullable Activity activity, @NotNull j jVar, @NotNull String str, @NotNull String str2);

    void h(String str);

    void i(Activity activity);

    boolean isEnabled();

    @NotNull
    Result<JSONObject> j();

    void k(Activity activity);

    void m();
}
