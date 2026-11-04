package com.planner5d.library.activity.helper;

import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137185b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f137186a = true;

    public final void a(@Nullable androidx.appcompat.app.d dVar) {
        androidx.appcompat.app.a supportActionBar;
        if (dVar == null || (supportActionBar = dVar.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.l0(false);
        supportActionBar.X(false);
        supportActionBar.k0(null);
    }

    public final void b(@Nullable androidx.appcompat.app.d dVar) {
        if (!this.f137186a) {
            a(dVar);
        }
    }

    public final void c(@Nullable androidx.appcompat.app.d dVar, @NotNull Toolbar toolbar, boolean z10) {
        androidx.appcompat.app.a supportActionBar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.f137186a = z10;
        if (dVar != null) {
            dVar.setSupportActionBar(toolbar);
        }
        if (dVar != null && (supportActionBar = dVar.getSupportActionBar()) != null) {
            supportActionBar.X(this.f137186a);
        }
        b(dVar);
    }
}
