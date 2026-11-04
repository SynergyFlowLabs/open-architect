package com.planner5d.library.widget.editor.editor3d.compatibility;

import android.opengl.GLSurfaceView;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f255392d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile GLSurfaceView.EGLConfigChooser f255393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile GLSurfaceView.EGLContextFactory f255394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile GLSurfaceView.Renderer f255395c;

    @NotNull
    public final GLSurfaceView.EGLConfigChooser a() {
        GLSurfaceView.EGLConfigChooser eGLConfigChooser = this.f255393a;
        if (eGLConfigChooser != null) {
            return eGLConfigChooser;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eglConfigChooser");
        return null;
    }

    @NotNull
    public final GLSurfaceView.EGLContextFactory b() {
        GLSurfaceView.EGLContextFactory eGLContextFactory = this.f255394b;
        if (eGLContextFactory != null) {
            return eGLContextFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eglContextFactory");
        return null;
    }

    @NotNull
    public final GLSurfaceView.Renderer c() {
        GLSurfaceView.Renderer renderer = this.f255395c;
        if (renderer != null) {
            return renderer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renderer");
        return null;
    }

    public final void d(@NotNull GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        Intrinsics.checkNotNullParameter(eGLConfigChooser, "<set-?>");
        this.f255393a = eGLConfigChooser;
    }

    public final void e(@NotNull GLSurfaceView.EGLContextFactory eGLContextFactory) {
        Intrinsics.checkNotNullParameter(eGLContextFactory, "<set-?>");
        this.f255394b = eGLContextFactory;
    }

    public final void f(@NotNull GLSurfaceView.Renderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "<set-?>");
        this.f255395c = renderer;
    }
}
