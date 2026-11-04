package com.planner5d.library.engine.libgdx.compatibility;

import android.opengl.GLSurfaceView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements vb.f {
    @Override // vb.f
    @NotNull
    public GLSurfaceView.EGLConfigChooser a(@NotNull vb.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new com.badlogic.gdx.backends.android.surfaceview.d(config.f385710a, config.f385711b, config.f385712c, config.f385713d, config.f385714e, config.f385715f, config.f385716g);
    }
}
