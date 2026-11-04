package app.rive.runtime.kotlin.renderers;

import androidx.annotation.m1;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRiveArtboardRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveArtboardRenderer.kt\napp/rive/runtime/kotlin/renderers/RiveArtboardRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public class RiveArtboardRenderer extends Renderer {

    @NotNull
    private RiveFileController controller;

    public /* synthetic */ RiveArtboardRenderer(boolean z10, RendererType rendererType, RiveFileController riveFileController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, riveFileController);
    }

    private final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    private final Fit getFit() {
        return this.controller.getFit();
    }

    private final float getScaleFactor() {
        return this.controller.getLayoutScaleFactorActive$kotlin_release();
    }

    @m1
    private final void resizeArtboard() {
        if (getFit() != Fit.LAYOUT) {
            Artboard activeArtboard = this.controller.getActiveArtboard();
            if (activeArtboard != null) {
                activeArtboard.resetArtboardSize();
                return;
            }
            return;
        }
        float width = getWidth() / getScaleFactor();
        float height = getHeight() / getScaleFactor();
        Artboard activeArtboard2 = this.controller.getActiveArtboard();
        if (activeArtboard2 != null) {
            activeArtboard2.setWidth(width);
            activeArtboard2.setHeight(height);
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    @m1
    public void advance(float f10) {
        if (getHasCppObject()) {
            if (this.controller.isActive()) {
                this.controller.advance(f10);
            }
            synchronized (this.controller.getStartStopLock$kotlin_release()) {
                try {
                    if (!this.controller.isAdvancing()) {
                        stopThread$kotlin_release();
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    protected void disposeDependencies() {
        Object lock;
        File file = this.controller.getFile();
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                super.disposeDependencies();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    @m1
    public void draw() {
        ReentrantLock lock;
        File file = this.controller.getFile();
        synchronized (((file == null || (lock = file.getLock()) == null) ? this : lock)) {
            try {
                if (getHasCppObject() && this.controller.isActive()) {
                    if (this.controller.getRequireArtboardResize$kotlin_release().getAndSet(false)) {
                        resizeArtboard();
                    }
                    Artboard activeArtboard = this.controller.getActiveArtboard();
                    if (activeArtboard != null) {
                        activeArtboard.draw(getCppPointer(), getFit(), getAlignment(), getScaleFactor());
                        Unit unit = Unit.f312394a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset() {
        this.controller.stopAnimations();
        this.controller.reset$kotlin_release();
        stop();
        int i10 = 4 << 0;
        RiveFileController.selectArtboard$default(this.controller, null, 1, null);
        start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer(boolean z10, @NotNull RendererType rendererType, @NotNull RiveFileController controller) {
        super(rendererType, z10);
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        controller.setOnStart(new RiveArtboardRenderer$1$1(this));
        controller.acquire();
        getDependencies().add(controller);
    }
}
