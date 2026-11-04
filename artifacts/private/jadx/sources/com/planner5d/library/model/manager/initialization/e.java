package com.planner5d.library.model.manager.initialization;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.d;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class e<T extends androidx.appcompat.app.d> implements a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191616b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a<T> f191617a;

    public e(@NotNull a<T> initializable) {
        Intrinsics.checkNotNullParameter(initializable, "initializable");
        this.f191617a = initializable;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void a() {
        this.f191617a.a();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void b() {
        this.f191617a.b();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f191617a.c(intent);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void d() {
        this.f191617a.d();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void e(int i10, int i11, @Nullable Intent intent) {
        this.f191617a.e(i10, i11, intent);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void f(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f191617a.f(outState);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void g() {
        this.f191617a.g();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean h(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f191617a.h(item);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void j() {
        this.f191617a.j();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void k() {
        this.f191617a.k();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void l() {
        this.f191617a.l();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void m() {
        this.f191617a.m();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Void i(@NotNull T activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        throw new l0("Make sure to call onCreate of the handler instead!");
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean onBackPressed() {
        return this.f191617a.onBackPressed();
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f191617a.onConfigurationChanged(newConfig);
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] results) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(results, "results");
        this.f191617a.onRequestPermissionsResult(i10, permissions, results);
    }
}
