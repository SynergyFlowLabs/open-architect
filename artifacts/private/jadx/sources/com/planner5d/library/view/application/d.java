package com.planner5d.library.view.application;

import android.content.Context;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.i2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@fg.h
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i2 f244832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y1 f244833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f244834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f244835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f244836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u1 f244837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f244838g;

    public d(@NotNull i2 navigationClassProvider, @NotNull y1 menuManager, @NotNull x fragmentControllerNavigator, int i10, @NotNull Context context, @NotNull u1 logRecordManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(navigationClassProvider, "navigationClassProvider");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(fragmentControllerNavigator, "fragmentControllerNavigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f244832a = navigationClassProvider;
        this.f244833b = menuManager;
        this.f244834c = fragmentControllerNavigator;
        this.f244835d = i10;
        this.f244836e = context;
        this.f244837f = logRecordManager;
        this.f244838g = dialogLauncher;
    }

    @fg.i
    public final int a() {
        return this.f244835d;
    }

    @fg.i
    @NotNull
    public final Context b() {
        return this.f244836e;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k c() {
        return this.f244838g;
    }

    @fg.i
    @NotNull
    public final Class<? extends FragmentController> d() {
        return this.f244832a.a();
    }

    @fg.i
    @NotNull
    public final x e() {
        return this.f244834c;
    }

    @fg.i
    @NotNull
    public final u1 f() {
        return this.f244837f;
    }

    @fg.i
    @NotNull
    public final y1 g() {
        return this.f244833b;
    }

    @fg.i
    @NotNull
    public final i2 h() {
        return this.f244832a;
    }
}
