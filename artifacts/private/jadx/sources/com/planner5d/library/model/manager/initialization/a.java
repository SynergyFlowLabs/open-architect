package com.planner5d.library.model.manager.initialization;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface a<T extends androidx.appcompat.app.d> {
    void a();

    void b();

    void c(@NotNull Intent intent);

    void d();

    void e(int i10, int i11, @Nullable Intent intent);

    void f(@NotNull Bundle bundle);

    void g();

    boolean h(@NotNull MenuItem menuItem);

    void i(@NotNull T t10, @Nullable Bundle bundle);

    void j();

    void k();

    void l();

    void m();

    boolean onBackPressed();

    void onConfigurationChanged(@NotNull Configuration configuration);

    void onRequestPermissionsResult(int i10, @NotNull String[] strArr, @NotNull int[] iArr);
}
