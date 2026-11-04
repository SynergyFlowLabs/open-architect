package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.i;
import androidx.lifecycle.n0;
import app.rive.runtime.kotlin.renderers.Renderer;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRiveTextureView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n30#1,8:96\n1#2:95\n*S KotlinDebug\n*F\n+ 1 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n*L\n21#1:96,8\n*E\n"})
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    @NotNull
    private final f0 activity$delegate;

    @NotNull
    private final f0 lifecycleObserver$delegate;

    @Nullable
    private Renderer renderer;
    private Surface viewSurface;

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity activity_delegate$lambda$0(RiveTextureView riveTextureView) {
        Context context = riveTextureView.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                Intrinsics.checkNotNull(context);
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        context = null;
        Intrinsics.checkNotNull(context);
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract n0 createObserver();

    @NotNull
    protected abstract Renderer createRenderer();

    @NotNull
    protected final Activity getActivity() {
        return (Activity) this.activity$delegate.getValue();
    }

    protected final /* synthetic */ <T> T getContextAsType() {
        for (T t10 = (T) getContext(); t10 instanceof ContextWrapper; t10 = (T) ((ContextWrapper) t10).getBaseContext()) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    protected final n0 getLifecycleObserver() {
        return (n0) this.lifecycleObserver$delegate.getValue();
    }

    @Nullable
    protected final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    @i
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    @i
    protected void onDetachedFromWindow() {
        Renderer renderer = this.renderer;
        Intrinsics.checkNotNull(renderer);
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    @i
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Surface surface = this.viewSurface;
        Surface surface2 = null;
        if (surface != null) {
            if (surface == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewSurface");
                surface = null;
            }
            surface.release();
        }
        this.viewSurface = new Surface(surfaceTexture);
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            Surface surface3 = this.viewSurface;
            if (surface3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewSurface");
            } else {
                surface2 = surface3;
            }
            renderer.setSurface(surface2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    @i
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = this.viewSurface;
        if (surface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewSurface");
            surface2 = null;
        }
        surface2.release();
        return false;
    }

    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        onSurfaceTextureAvailable(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView, android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i10) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.start();
                return;
            }
            return;
        }
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.stop();
        }
    }

    protected final void setRenderer(@Nullable Renderer renderer) {
        this.renderer = renderer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.activity$delegate = g0.b(j0.NONE, new Function0() { // from class: app.rive.runtime.kotlin.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveTextureView.activity_delegate$lambda$0(this.f77474a);
            }
        });
        this.lifecycleObserver$delegate = g0.c(new Function0() { // from class: app.rive.runtime.kotlin.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f77475a.createObserver();
            }
        });
    }
}
