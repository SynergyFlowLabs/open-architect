package com.planner5d.library.engine.libgdx.rendering.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a implements gc.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final h f160831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f160832o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull h orthographicCamera) {
        super(orthographicCamera);
        Intrinsics.checkNotNullParameter(orthographicCamera, "orthographicCamera");
        this.f160831n = orthographicCamera;
        this.f160832o = orthographicCamera.f160852o;
    }

    @Override // com.planner5d.library.engine.g
    public void L1() {
        this.f160831n.r();
    }

    @Override // com.planner5d.library.engine.g
    public void Z1(boolean z10) {
        this.f160831n.s(z10);
    }

    @Override // gc.a
    public float b() {
        return this.f160832o;
    }

    @Override // gc.a
    public void f(float f10) {
        this.f160831n.f160852o = f10;
        this.f160832o = f10;
    }
}
