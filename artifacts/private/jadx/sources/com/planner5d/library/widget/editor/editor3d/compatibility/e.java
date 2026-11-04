package com.planner5d.library.widget.editor.editor3d.compatibility;

import android.opengl.GLSurfaceView;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vb.f;
import vb.g;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class e implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f255406c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final GLTextureView f255407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f255408b;

    public e(@NotNull GLTextureView view, @NotNull f configChooserFactory) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(configChooserFactory, "configChooserFactory");
        this.f255407a = view;
        this.f255408b = configChooserFactory;
    }

    @Override // vb.g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GLTextureView a(@NotNull vb.a application, @NotNull vb.b config, @Nullable GLSurfaceView.EGLConfigChooser eGLConfigChooser, @NotNull GLSurfaceView.EGLContextFactory eglContextFactory, @NotNull vb.c graphics) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(eglContextFactory, "eglContextFactory");
        Intrinsics.checkNotNullParameter(graphics, "graphics");
        GLTextureView gLTextureView = this.f255407a;
        if (eGLConfigChooser == null) {
            eGLConfigChooser = this.f255408b.a(config);
        }
        return gLTextureView.b(eGLConfigChooser, eglContextFactory, graphics);
    }
}
