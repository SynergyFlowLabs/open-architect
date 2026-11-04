package com.planner5d.library.engine.libgdx.rendering.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a implements gc.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final g f160830n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull g cardboardCamera) {
        super(cardboardCamera);
        Intrinsics.checkNotNullParameter(cardboardCamera, "cardboardCamera");
        this.f160830n = cardboardCamera;
    }

    @Override // com.planner5d.library.engine.g
    public void L1() {
        this.f160830n.r();
    }

    @Override // com.planner5d.library.engine.g
    public void Z1(boolean z10) {
        this.f160830n.s(z10);
    }

    @Override // gc.c
    public void c(@NotNull float[] projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f160830n.t(projection);
    }

    @Override // gc.c
    public void d(@NotNull float[] eyeViewAdjustMatrix) {
        Intrinsics.checkNotNullParameter(eyeViewAdjustMatrix, "eyeViewAdjustMatrix");
        this.f160830n.u(eyeViewAdjustMatrix);
    }
}
