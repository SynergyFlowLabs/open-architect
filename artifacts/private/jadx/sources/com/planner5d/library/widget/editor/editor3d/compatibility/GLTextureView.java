package com.planner5d.library.widget.editor.editor3d.compatibility;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class GLTextureView extends TextureView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f255383b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f255384a;

    public static final class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f255385a;

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            d dVar = new d(GLTextureView.this.f255384a, surface);
            this.f255385a = dVar;
            dVar.c(i10, i11);
            d dVar2 = this.f255385a;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderThread");
                dVar2 = null;
            }
            dVar2.start();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            d dVar = this.f255385a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderThread");
                dVar = null;
            }
            dVar.e();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            d dVar = this.f255385a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderThread");
                dVar = null;
            }
            dVar.c(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @j
    public GLTextureView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final GLTextureView b(@NotNull GLSurfaceView.EGLConfigChooser eglConfigChooser, @NotNull GLSurfaceView.EGLContextFactory eglContextFactory, @NotNull GLSurfaceView.Renderer renderer) {
        Intrinsics.checkNotNullParameter(eglConfigChooser, "eglConfigChooser");
        Intrinsics.checkNotNullParameter(eglContextFactory, "eglContextFactory");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f255384a.d(eglConfigChooser);
        this.f255384a.e(eglContextFactory);
        this.f255384a.f(renderer);
        return this;
    }

    public /* synthetic */ GLTextureView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public GLTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f255384a = new c();
        setSurfaceTextureListener(new a());
    }
}
