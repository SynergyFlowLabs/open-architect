package com.planner5d.library.engine.libgdx.compatibility;

import android.opengl.GLSurfaceView;
import com.facebook.appevents.internal.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements vb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f160787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GLSurfaceView f160788b;

    public f(boolean z10) {
        this.f160787a = z10;
    }

    @Override // vb.g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GLSurfaceView a(@NotNull vb.a application, @NotNull vb.b config, @Nullable GLSurfaceView.EGLConfigChooser eGLConfigChooser, @NotNull GLSurfaceView.EGLContextFactory eglContextFactory, @NotNull vb.c graphics) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(eglContextFactory, "eglContextFactory");
        Intrinsics.checkNotNullParameter(graphics, "graphics");
        com.badlogic.gdx.backends.android.surfaceview.c cVar = new com.badlogic.gdx.backends.android.surfaceview.c(application.getContext());
        this.f160788b = cVar;
        if (eGLConfigChooser == null) {
            cVar.setEGLConfigChooser(config.f385710a, config.f385711b, config.f385712c, config.f385713d, config.f385714e, config.f385715f);
        } else {
            cVar.setEGLConfigChooser(eGLConfigChooser);
        }
        cVar.setEGLContextFactory(eglContextFactory);
        cVar.setPreserveEGLContextOnPause(true);
        cVar.setRenderer(graphics);
        cVar.setZOrderMediaOverlay(this.f160787a);
        GLSurfaceView gLSurfaceView = this.f160788b;
        if (gLSurfaceView != null) {
            return gLSurfaceView;
        }
        Intrinsics.throwUninitializedPropertyAccessException(p.A);
        return null;
    }

    public f() {
        this(false);
    }
}
