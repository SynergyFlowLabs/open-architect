package com.planner5d.library.engine.libgdx.rendering.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a implements gc.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final i f160833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f160834o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull i perspectiveCamera) {
        super(perspectiveCamera);
        Intrinsics.checkNotNullParameter(perspectiveCamera, "perspectiveCamera");
        this.f160833n = perspectiveCamera;
        this.f160834o = perspectiveCamera.f160854o;
    }

    @Override // com.planner5d.library.engine.g
    public void L1() {
        this.f160833n.r();
    }

    @Override // com.planner5d.library.engine.g
    public void Z1(boolean z10) {
        this.f160833n.s(z10);
    }

    @Override // gc.b
    public float a() {
        return this.f160834o;
    }

    @Override // gc.b
    public void e(float f10) {
        this.f160833n.f160854o = f10;
        this.f160834o = f10;
    }
}
