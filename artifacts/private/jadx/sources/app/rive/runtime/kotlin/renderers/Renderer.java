package app.rive.runtime.kotlin.renderers;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.i;
import androidx.annotation.l1;
import androidx.annotation.m1;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.NativeObject;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Renderer.kt\napp/rive/runtime/kotlin/renderers/Renderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1863#2,2:240\n*S KotlinDebug\n*F\n+ 1 Renderer.kt\napp/rive/runtime/kotlin/renderers/Renderer\n*L\n236#1:240,2\n*E\n"})
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    private boolean isAttached;
    private boolean isPlaying;
    private final boolean trace;

    @NotNull
    private RendererType type;

    /* JADX WARN: Multi-variable type inference failed */
    public Renderer() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: align");
        }
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f10);
    }

    private final native long constructor(boolean z10, int i10);

    private final native void cppAlign(long j10, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f10);

    private final native float cppAvgFps(long j10);

    private final native void cppDestroySurface(long j10);

    private final native void cppDoFrame(long j10);

    private final native int cppHeight(long j10);

    private final native void cppRestore(long j10);

    private final native void cppSave(long j10);

    private final native void cppSetSurface(Surface surface, long j10);

    private final native void cppStart(long j10);

    private final native void cppStop(long j10);

    private final native void cppTransform(long j10, float f10, float f11, float f12, float f13, float f14, float f15);

    private final native int cppWidth(long j10);

    private final void destroySurface() {
        this.isAttached = false;
        stop();
        cppDestroySurface(getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFrame$lambda$1(Renderer renderer) {
        Choreographer.getInstance().postFrameCallback(renderer);
    }

    private final void setRendererType(int i10) {
        if (i10 != this.type.getValue()) {
            this.type = RendererType.Companion.fromIndex(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(Renderer renderer) {
        Choreographer.getInstance().removeFrameCallback(renderer);
    }

    @m1
    public abstract void advance(float f10);

    public final void align(@NotNull Fit fit, @NotNull Alignment alignment, @NotNull RectF targetBounds, @NotNull RectF sourceBounds, float f10) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(targetBounds, "targetBounds");
        Intrinsics.checkNotNullParameter(sourceBounds, "sourceBounds");
        cppAlign(getCppPointer(), fit, alignment, targetBounds, sourceBounds, f10);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    @i
    public void delete() {
        destroySurface();
        cppDelete(getCppPointer());
        setCppPointer(0L);
    }

    protected void disposeDependencies() {
        Iterator<T> it = getDependencies().iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        getDependencies().clear();
    }

    @Override // android.view.Choreographer.FrameCallback
    @i
    public void doFrame(long j10) {
        if (this.isPlaying) {
            cppDoFrame(getCppPointer());
            scheduleFrame();
        }
    }

    @m1
    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final boolean getTrace() {
        return this.trace;
    }

    @l1(otherwise = 2)
    @NotNull
    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    @i
    public void make() {
        if (getHasCppObject()) {
            return;
        }
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float f10, float f11) {
        transform(f10, 0.0f, 0.0f, f11, 0.0f, 0.0f);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: app.rive.runtime.kotlin.renderers.b
            @Override // java.lang.Runnable
            public final void run() {
                Renderer.scheduleFrame$lambda$1(this.f77477a);
            }
        });
    }

    public final void setAttached(boolean z10) {
        this.isAttached = z10;
    }

    public final void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        cppSetSurface(surface, getCppPointer());
        this.isAttached = true;
        start();
    }

    public final void setType(@NotNull RendererType rendererType) {
        Intrinsics.checkNotNullParameter(rendererType, "<set-?>");
        this.type = rendererType;
    }

    public final void start() {
        if (!this.isPlaying && this.isAttached && getHasCppObject()) {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    @i
    public final void stop() {
        stopThread$kotlin_release();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: app.rive.runtime.kotlin.renderers.a
            @Override // java.lang.Runnable
            public final void run() {
                Renderer.stop$lambda$0(this.f77476a);
            }
        });
    }

    @i
    public final void stopThread$kotlin_release() {
        if (this.isPlaying && getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        }
    }

    public final void transform(float f10, float f11, float f12, float f13, float f14, float f15) {
        cppTransform(getCppPointer(), f10, f11, f12, f13, f14, f15);
    }

    public final void translate(float f10, float f11) {
        transform(1.0f, 0.0f, 0.0f, 1.0f, f10, f11);
    }

    public /* synthetic */ Renderer(RendererType rendererType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Renderer(@NotNull RendererType type, boolean z10) {
        super(0L);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.trace = z10;
    }
}
