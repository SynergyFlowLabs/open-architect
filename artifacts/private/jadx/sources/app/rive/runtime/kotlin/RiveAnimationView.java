package app.rive.runtime.kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.l1;
import androidx.annotation.u0;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.n2;
import androidx.lifecycle.o0;
import app.rive.runtime.kotlin.controllers.ControllerState;
import app.rive.runtime.kotlin.controllers.ControllerStateManagement;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.ContextAssetLoader;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.FallbackAssetLoader;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import app.rive.runtime.kotlin.renderers.Renderer;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import app.rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import com.android.volley.a0;
import com.android.volley.t;
import com.android.volley.toolbox.e0;
import com.android.volley.v;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView\n+ 2 RiveTextureView.kt\napp/rive/runtime/kotlin/RiveTextureView\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1175:1\n30#2,8:1176\n1#3:1184\n*S KotlinDebug\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView\n*L\n188#1:1176,8\n*E\n"})
public class RiveAnimationView extends RiveTextureView implements Observable<RiveFileController.Listener> {

    @NotNull
    public static final String TAG = "RiveAnimationView";
    public static final boolean shouldLoadCDNAssetsDefault = true;
    public static final boolean traceAnimationsDefault = false;

    @NotNull
    private final RectF bounds;

    @NotNull
    private RiveFileController controller;
    private final boolean defaultAutoplay;

    @Nullable
    private Window.OnFrameMetricsAvailableListener frameMetricsListener;

    @Nullable
    private o0 lifecycleOwner;

    @NotNull
    private final RendererAttributes rendererAttributes;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int alignmentIndexDefault = Alignment.CENTER.ordinal();
    private static final int fitIndexDefault = Fit.CONTAIN.ordinal();
    private static final int loopIndexDefault = Loop.AUTO.ordinal();
    private static final int rendererIndexDefault = Rive.INSTANCE.getDefaultRendererType().getValue();

    @SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1175:1\n1#2:1176\n*E\n"})
    public static final class Builder {

        @Nullable
        private Alignment alignment;

        @Nullable
        private String animationName;

        @Nullable
        private String artboardName;

        @Nullable
        private FileAssetLoader assetLoader;
        private boolean autoBind;

        @Nullable
        private Boolean autoplay;

        @NotNull
        private final Context context;

        @Nullable
        private Fit fit;

        @Nullable
        private Loop loop;

        @Nullable
        private RendererType rendererType;

        @Nullable
        private Object resource;

        @Nullable
        private ResourceType resourceType;
        private boolean shouldLoadCDNAssets;

        @Nullable
        private String stateMachineName;

        @Nullable
        private Boolean traceAnimations;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.shouldLoadCDNAssets = true;
        }

        @NotNull
        public final RiveAnimationView build() {
            return new RiveAnimationView(this);
        }

        @Nullable
        public final Alignment getAlignment$kotlin_release() {
            return this.alignment;
        }

        @Nullable
        public final String getAnimationName$kotlin_release() {
            return this.animationName;
        }

        @Nullable
        public final String getArtboardName$kotlin_release() {
            return this.artboardName;
        }

        @Nullable
        public final FileAssetLoader getAssetLoader$kotlin_release() {
            return this.assetLoader;
        }

        public final boolean getAutoBind$kotlin_release() {
            return this.autoBind;
        }

        @Nullable
        public final Boolean getAutoplay$kotlin_release() {
            return this.autoplay;
        }

        @NotNull
        public final Context getContext$kotlin_release() {
            return this.context;
        }

        @Nullable
        public final Fit getFit$kotlin_release() {
            return this.fit;
        }

        @Nullable
        public final Loop getLoop$kotlin_release() {
            return this.loop;
        }

        @Nullable
        public final RendererType getRendererType$kotlin_release() {
            return this.rendererType;
        }

        @Nullable
        public final Object getResource$kotlin_release() {
            return this.resource;
        }

        @Nullable
        public final ResourceType getResourceType$kotlin_release() {
            return this.resourceType;
        }

        public final boolean getShouldLoadCDNAssets$kotlin_release() {
            return this.shouldLoadCDNAssets;
        }

        @Nullable
        public final String getStateMachineName$kotlin_release() {
            return this.stateMachineName;
        }

        @Nullable
        public final Boolean getTraceAnimations$kotlin_release() {
            return this.traceAnimations;
        }

        @NotNull
        public final Builder setAlignment(@NotNull Alignment value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.alignment = value;
            return this;
        }

        public final void setAlignment$kotlin_release(@Nullable Alignment alignment) {
            this.alignment = alignment;
        }

        @NotNull
        public final Builder setAnimationName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.animationName = value;
            return this;
        }

        public final void setAnimationName$kotlin_release(@Nullable String str) {
            this.animationName = str;
        }

        @NotNull
        public final Builder setArtboardName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.artboardName = value;
            return this;
        }

        public final void setArtboardName$kotlin_release(@Nullable String str) {
            this.artboardName = str;
        }

        @NotNull
        public final Builder setAssetLoader(@NotNull FileAssetLoader value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.assetLoader = value;
            return this;
        }

        public final void setAssetLoader$kotlin_release(@Nullable FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        @NotNull
        public final Builder setAutoBind(boolean z10) {
            this.autoBind = z10;
            return this;
        }

        public final void setAutoBind$kotlin_release(boolean z10) {
            this.autoBind = z10;
        }

        @NotNull
        public final Builder setAutoplay(boolean z10) {
            this.autoplay = Boolean.valueOf(z10);
            return this;
        }

        public final void setAutoplay$kotlin_release(@Nullable Boolean bool) {
            this.autoplay = bool;
        }

        @NotNull
        public final Builder setFit(@NotNull Fit value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.fit = value;
            return this;
        }

        public final void setFit$kotlin_release(@Nullable Fit fit) {
            this.fit = fit;
        }

        @NotNull
        public final Builder setLoop(@NotNull Loop value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.loop = value;
            return this;
        }

        public final void setLoop$kotlin_release(@Nullable Loop loop) {
            this.loop = loop;
        }

        @NotNull
        public final Builder setRendererType(@NotNull RendererType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.rendererType = value;
            return this;
        }

        public final void setRendererType$kotlin_release(@Nullable RendererType rendererType) {
            this.rendererType = rendererType;
        }

        @NotNull
        public final Builder setResource(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.resourceType = ResourceType.Companion.makeMaybeResource(value);
            this.resource = value;
            return this;
        }

        public final void setResource$kotlin_release(@Nullable Object obj) {
            this.resource = obj;
        }

        public final void setResourceType$kotlin_release(@Nullable ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        @NotNull
        public final Builder setShouldLoadCDNAssets(boolean z10) {
            this.shouldLoadCDNAssets = z10;
            return this;
        }

        public final void setShouldLoadCDNAssets$kotlin_release(boolean z10) {
            this.shouldLoadCDNAssets = z10;
        }

        @NotNull
        public final Builder setStateMachineName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.stateMachineName = value;
            return this;
        }

        public final void setStateMachineName$kotlin_release(@Nullable String str) {
            this.stateMachineName = str;
        }

        @NotNull
        public final Builder setTraceAnimations(boolean z10) {
            this.traceAnimations = Boolean.valueOf(z10);
            return this;
        }

        public final void setTraceAnimations$kotlin_release(@Nullable Boolean bool) {
            this.traceAnimations = bool;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAlignmentIndexDefault() {
            return RiveAnimationView.alignmentIndexDefault;
        }

        public final int getFitIndexDefault() {
            return RiveAnimationView.fitIndexDefault;
        }

        public final int getLoopIndexDefault() {
            return RiveAnimationView.loopIndexDefault;
        }

        public final int getRendererIndexDefault() {
            return RiveAnimationView.rendererIndexDefault;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RiveAnimationView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public static Unit d(RiveAnimationView riveAnimationView, File it) throws ViewModelException, StateMachineException {
        Intrinsics.checkNotNullParameter(it, "it");
        riveAnimationView.controller.setFile(it);
        riveAnimationView.controller.setupScene$kotlin_release(riveAnimationView.rendererAttributes);
        return Unit.f312394a;
    }

    @l1(otherwise = 2)
    public static /* synthetic */ void getRendererAttributes$annotations() {
    }

    private final void loadFileFromResource(Function1<? super File, Unit> function1) throws IOException {
        ResourceType resource = this.rendererAttributes.getResource();
        if (resource == null) {
            return;
        }
        if (resource instanceof ResourceType.ResourceRiveFile) {
            function1.invoke(((ResourceType.ResourceRiveFile) resource).getFile());
            return;
        }
        if (resource instanceof ResourceType.ResourceUrl) {
            loadFromNetwork(((ResourceType.ResourceUrl) resource).getUrl(), function1);
            return;
        }
        if (resource instanceof ResourceType.ResourceBytes) {
            File file = new File(((ResourceType.ResourceBytes) resource).getBytes(), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
            function1.invoke(file);
            file.release();
        } else {
            if (!(resource instanceof ResourceType.ResourceId)) {
                throw new k0();
            }
            InputStream inputStreamOpenRawResource = getResources().openRawResource(((ResourceType.ResourceId) resource).getId());
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                File file2 = new File(kotlin.io.b.p(inputStreamOpenRawResource), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
                function1.invoke(file2);
                file2.release();
                kotlin.io.c.a(inputStreamOpenRawResource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamOpenRawResource, th2);
                    throw th3;
                }
            }
        }
    }

    private final void loadFromNetwork(final String str, final Function1<? super File, Unit> function1) {
        t tVarA = e0.a(getContext().getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(tVarA, "newRequestQueue(...)");
        tVarA.a(new RiveFileRequest(str, this.rendererAttributes.getRendererType(), new v.b() { // from class: app.rive.runtime.kotlin.e
            @Override // com.android.volley.v.b
            public final void onResponse(Object obj) {
                RiveAnimationView.loadFromNetwork$lambda$5(function1, (File) obj);
            }
        }, new v.a() { // from class: app.rive.runtime.kotlin.f
            @Override // com.android.volley.v.a
            public final void b(a0 a0Var) throws IOException {
                RiveAnimationView.loadFromNetwork$lambda$6(str, a0Var);
            }
        }, this.rendererAttributes.getAssetLoader()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$5(Function1 function1, File file) {
        Intrinsics.checkNotNull(file);
        function1.invoke(file);
        file.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$6(String str, a0 a0Var) throws IOException {
        throw new IOException("Unable to download Rive file " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$19(RiveAnimationView riveAnimationView, File it) throws ViewModelException, StateMachineException {
        Intrinsics.checkNotNullParameter(it, "it");
        riveAnimationView.controller.setFile(it);
        riveAnimationView.controller.setupScene$kotlin_release(riveAnimationView.rendererAttributes);
        return Unit.f312394a;
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, List list, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveAnimationView.pause((List<String>) list, z10);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, Loop loop, Direction direction, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i10 & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i10 & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        riveAnimationView.play(loop, direction, z10);
    }

    public static /* synthetic */ void setRiveBytes$default(RiveAnimationView riveAnimationView, byte[] bArr, String str, String str2, String str3, boolean z10, boolean z11, Fit fit, Alignment alignment, Loop loop, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveBytes");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            z10 = riveAnimationView.controller.getAutoplay();
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i10 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i10 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveBytes(bArr, str, str2, str3, z10, z11, fit, alignment, loop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setRiveBytes$lambda$13(RiveAnimationView riveAnimationView, File it) throws ViewModelException, StateMachineException {
        Intrinsics.checkNotNullParameter(it, "it");
        riveAnimationView.controller.setFile(it);
        riveAnimationView.controller.setupScene$kotlin_release(riveAnimationView.rendererAttributes);
        return Unit.f312394a;
    }

    public static /* synthetic */ void setRiveFile$default(RiveAnimationView riveAnimationView, File file, String str, String str2, String str3, boolean z10, boolean z11, Fit fit, Alignment alignment, Loop loop, int i10, Object obj) throws RiveException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveFile");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            z10 = riveAnimationView.controller.getAutoplay();
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i10 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i10 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveFile(file, str, str2, str3, z10, z11, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveResource$default(RiveAnimationView riveAnimationView, int i10, String str, String str2, String str3, boolean z10, boolean z11, Fit fit, Alignment alignment, Loop loop, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveResource");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            z10 = riveAnimationView.controller.getAutoplay();
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        if ((i11 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i11 & 128) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i11 & 256) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveResource(i10, str, str2, str3, z10, z11, fit, alignment, loop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setRiveResource$lambda$11(RiveAnimationView riveAnimationView, File it) throws ViewModelException, StateMachineException {
        Intrinsics.checkNotNullParameter(it, "it");
        riveAnimationView.controller.setFile(it);
        riveAnimationView.controller.setupScene$kotlin_release(riveAnimationView.rendererAttributes);
        return Unit.f312394a;
    }

    @e.b(24)
    private final void startFrameMetrics() {
        RendererMetrics rendererMetrics = new RendererMetrics(getActivity());
        getActivity().getWindow().addOnFrameMetricsAvailableListener(rendererMetrics, new Handler(Looper.getMainLooper()));
        this.frameMetricsListener = rendererMetrics;
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, List list, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveAnimationView.stop((List<String>) list, z10);
    }

    @e.b(24)
    private final void stopFrameMetrics() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.frameMetricsListener;
        if (onFrameMetricsAvailableListener != null) {
            getActivity().getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    private final void validateLifecycleOwner() {
        c0 lifecycle;
        o0 o0VarA = n2.a(this);
        if (o0VarA == null || Intrinsics.areEqual(o0VarA, this.lifecycleOwner)) {
            return;
        }
        o0 o0Var = this.lifecycleOwner;
        if (o0Var != null && (lifecycle = o0Var.getLifecycle()) != null) {
            lifecycle.g(getLifecycleObserver());
        }
        this.lifecycleOwner = o0VarA;
        c0 lifecycle2 = o0VarA.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.c(getLifecycleObserver());
        }
    }

    public final void addEventListener(@NotNull RiveFileController.RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.addEventListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.RiveTextureView
    @NotNull
    public n0 createObserver() {
        return new RiveViewLifecycleObserver(CollectionsKt.toMutableList((Collection) CollectionsKt.listOfNotNull((Object[]) new RefCount[]{this.controller, this.rendererAttributes.getAssetLoader()})));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    @NotNull
    protected Renderer createRenderer() {
        return new RiveArtboardRenderer(this.rendererAttributes.getRiveTraceAnimations(), this.rendererAttributes.getRendererType(), this.controller);
    }

    public final void fireState(@NotNull String stateMachineName, @NotNull String inputName) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.fireState$default(this.controller, stateMachineName, inputName, null, 4, null);
    }

    public final void fireStateAtPath(@NotNull String inputName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.fireStateAtPath(inputName, path);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    @NotNull
    public final List<LinearAnimationInstance> getAnimations() {
        return this.controller.getAnimations();
    }

    @Nullable
    public final String getArtboardName() {
        Artboard activeArtboard = this.controller.getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getName();
        }
        return null;
    }

    @Nullable
    public final RiveArtboardRenderer getArtboardRenderer() {
        Renderer renderer = getRenderer();
        if (renderer == null ? true : renderer instanceof RiveArtboardRenderer) {
            return (RiveArtboardRenderer) getRenderer();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected RiveArtboardRenderer but got ");
        Renderer renderer2 = getRenderer();
        sb2.append(renderer2 != null ? renderer2.getClass().getSimpleName() : "NULL");
        throw new p1(sb2.toString());
    }

    public final boolean getAutoplay() {
        return this.controller.getAutoplay();
    }

    @NotNull
    public final RiveFileController getController() {
        return this.controller;
    }

    public boolean getDefaultAutoplay() {
        return this.defaultAutoplay;
    }

    @Nullable
    public final File getFile() {
        return this.controller.getFile();
    }

    @NotNull
    public final Fit getFit() {
        return this.controller.getFit();
    }

    @Nullable
    public final Float getLayoutScaleFactor() {
        return this.controller.getLayoutScaleFactor();
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.controller.getLayoutScaleFactorAutomatic();
    }

    @NotNull
    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.controller.getPlayingAnimations();
    }

    @NotNull
    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.controller.getPlayingStateMachines();
    }

    @NotNull
    public final RendererAttributes getRendererAttributes() {
        return this.rendererAttributes;
    }

    @NotNull
    public final List<StateMachineInstance> getStateMachines() {
        return this.controller.getStateMachines();
    }

    @Nullable
    public final String getTextRunValue(@NotNull String textRunName) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        return this.controller.getTextRunValue(textRunName);
    }

    @Nullable
    public final Float getVolume() {
        return this.controller.getVolume();
    }

    public final boolean isPlaying() {
        Renderer renderer = getRenderer();
        return renderer != null && renderer.isPlaying();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    protected void onAttachedToWindow() throws IOException {
        super.onAttachedToWindow();
        validateLifecycleOwner();
        if (this.controller.getFile() == null) {
            loadFileFromResource(new Function1() { // from class: app.rive.runtime.kotlin.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RiveAnimationView.onAttachedToWindow$lambda$19(this.f77459a, (File) obj);
                }
            });
        }
        Renderer renderer = getRenderer();
        Intrinsics.checkNotNull(renderer);
        if (renderer.getTrace()) {
            startFrameMetrics();
        }
        this.controller.setActive(true);
        Renderer renderer2 = getRenderer();
        Intrinsics.checkNotNull(renderer2);
        renderer2.start();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.View
    protected void onDetachedFromWindow() {
        this.controller.setActive(false);
        stopFrameMetrics();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getRenderer() == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int iWidth = mode == 0 ? (int) this.controller.getArtboardBounds().width() : View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int iHeight = mode2 == 0 ? (int) this.controller.getArtboardBounds().height() : View.MeasureSpec.getSize(i11);
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(getResources().getDisplayMetrics().density);
        this.controller.getRequireArtboardResize$kotlin_release().set(true);
        this.bounds.set(0.0f, 0.0f, iWidth, iHeight);
        RectF rectFCalculateRequiredBounds = Rive.INSTANCE.calculateRequiredBounds(this.controller.getFit(), this.controller.getAlignment(), this.bounds, this.controller.getArtboardBounds(), this.controller.getLayoutScaleFactorActive$kotlin_release());
        if (mode == Integer.MIN_VALUE) {
            iWidth = Math.min((int) rectFCalculateRequiredBounds.width(), iWidth);
        } else if (mode != 1073741824) {
            iWidth = (int) rectFCalculateRequiredBounds.width();
        }
        if (mode2 == Integer.MIN_VALUE) {
            iHeight = Math.min((int) rectFCalculateRequiredBounds.height(), iHeight);
        } else if (mode2 != 1073741824) {
            iHeight = (int) rectFCalculateRequiredBounds.height();
        }
        setMeasuredDimension(iWidth, iHeight);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, i10, i11));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        super.onSurfaceTextureSizeChanged(surface, i10, i11);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, i10, i11));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, event.getX(), event.getY());
        } else if (action == 1) {
            this.controller.pointerEvent(PointerEvents.POINTER_UP, event.getX(), event.getY());
        } else if (action == 2) {
            this.controller.pointerEvent(PointerEvents.POINTER_MOVE, event.getX(), event.getY());
        } else if (action == 3) {
            this.controller.pointerEvent(PointerEvents.POINTER_UP, event.getX(), event.getY());
        }
        return true;
    }

    public final void pause() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.stop();
        }
        this.controller.pause();
        stopFrameMetrics();
    }

    public final void play(@NotNull Loop loop, @NotNull Direction direction, boolean z10) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(loop, direction, z10);
    }

    public final void removeEventListener(@NotNull RiveFileController.RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.removeEventListener(listener);
    }

    public final void reset() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.reset();
        }
    }

    @ControllerStateManagement
    public final void restoreControllerState(@NotNull ControllerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.controller.restoreControllerState(state);
    }

    @ControllerStateManagement
    @Nullable
    public final ControllerState saveControllerState() {
        this.rendererAttributes.setResource(null);
        return this.controller.saveControllerState();
    }

    public final void setAlignment(@NotNull Alignment value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.controller.setAlignment(value);
    }

    public final void setArtboardName(@Nullable String str) {
        this.controller.selectArtboard(str);
    }

    public final void setAssetLoader(@Nullable FileAssetLoader fileAssetLoader) {
        if (Intrinsics.areEqual(fileAssetLoader, this.rendererAttributes.getAssetLoader())) {
            return;
        }
        FileAssetLoader assetLoader = this.rendererAttributes.getAssetLoader();
        this.rendererAttributes.setAssetLoader(fileAssetLoader);
        if (assetLoader != null) {
            assetLoader.release();
        }
        if (fileAssetLoader != null) {
            fileAssetLoader.acquire();
        }
        n0 lifecycleObserver = getLifecycleObserver();
        RiveViewLifecycleObserver riveViewLifecycleObserver = lifecycleObserver instanceof RiveViewLifecycleObserver ? (RiveViewLifecycleObserver) lifecycleObserver : null;
        if (riveViewLifecycleObserver != null) {
            if (assetLoader != null) {
                riveViewLifecycleObserver.remove(assetLoader);
            }
            if (fileAssetLoader != null) {
                riveViewLifecycleObserver.insert(fileAssetLoader);
            }
        }
    }

    public final void setAutoplay(boolean z10) {
        this.controller.setAutoplay(z10);
    }

    public final void setBooleanState(@NotNull String stateMachineName, @NotNull String inputName, boolean z10) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.setBooleanState$default(this.controller, stateMachineName, inputName, z10, null, 8, null);
    }

    public final void setBooleanStateAtPath(@NotNull String inputName, boolean z10, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setBooleanStateAtPath(inputName, z10, path);
    }

    public final void setController(@NotNull RiveFileController riveFileController) {
        Intrinsics.checkNotNullParameter(riveFileController, "<set-?>");
        this.controller = riveFileController;
    }

    public final void setFit(@NotNull Fit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.controller.setFit(value);
    }

    public final void setLayoutScaleFactor(@Nullable Float f10) {
        this.controller.setLayoutScaleFactor(f10);
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f10) {
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(f10);
    }

    public final void setMultipleStates(@NotNull ChangedInput... inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.controller.queueInputs$kotlin_release((ChangedInput[]) Arrays.copyOf(inputs, inputs.length));
    }

    public final void setNumberState(@NotNull String stateMachineName, @NotNull String inputName, float f10) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        RiveFileController.setNumberState$default(this.controller, stateMachineName, inputName, f10, null, 8, null);
    }

    public final void setNumberStateAtPath(@NotNull String inputName, float f10, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setNumberStateAtPath(inputName, f10, path);
    }

    public final void setRiveBytes(@NotNull byte[] bytes, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, boolean z11, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z10);
        rendererAttributes.setAutoBind(z11);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(bytes));
        loadFileFromResource(new Function1() { // from class: app.rive.runtime.kotlin.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiveAnimationView.setRiveBytes$lambda$13(this.f77468a, (File) obj);
            }
        });
    }

    public final void setRiveFile(@NotNull File file, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, boolean z11, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) throws RiveException {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        if (file.getRendererType() != this.rendererAttributes.getRendererType()) {
            throw new RiveException("Incompatible Renderer types: file initialized with " + file.getRendererType().name() + " but View is set up for " + this.rendererAttributes.getRendererType().name());
        }
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z10);
        rendererAttributes.setAutoBind(z11);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(file));
        this.controller.setFile(file);
        this.controller.setupScene$kotlin_release(this.rendererAttributes);
    }

    public final void setRiveResource(@u0 int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, boolean z11, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull Loop loop) throws IOException {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(loop, "loop");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z10);
        rendererAttributes.setAutoBind(z11);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(Integer.valueOf(i10)));
        loadFileFromResource(new Function1() { // from class: app.rive.runtime.kotlin.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiveAnimationView.setRiveResource$lambda$11(this.f77460a, (File) obj);
            }
        });
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        this.controller.setTextRunValue(textRunName, textValue);
    }

    public final void setVolume(float f10) {
        this.controller.setVolume(f10);
    }

    public final void stop() {
        this.controller.stopAnimations();
        stopFrameMetrics();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        c0 lifecycle;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultAutoplay = true;
        this.bounds = new RectF();
        Object context2 = getContext();
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = null;
                break;
            } else if (context2 instanceof o0) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.lifecycleOwner = (o0) context2;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RiveAnimationView, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RiveAnimationView_riveResource, -1);
            Object string = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveUrl);
            ResourceType.Companion companion = ResourceType.Companion;
            if (resourceId != -1) {
                string = Integer.valueOf(resourceId);
            }
            ResourceType resourceTypeMakeMaybeResource = companion.makeMaybeResource(string);
            RendererAttributes.Companion companion2 = RendererAttributes.Companion;
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAssetLoaderClass);
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FileAssetLoader fileAssetLoaderAssetLoaderFrom = companion2.assetLoaderFrom(string2, applicationContext);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveShouldLoadCDNAssets, true);
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveAlignment, alignmentIndexDefault);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveFit, fitIndexDefault);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveLoop, loopIndexDefault);
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoPlay, getDefaultAutoplay());
            boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoBind, false);
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTraceAnimations, false);
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveArtboard);
            String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAnimation);
            String string5 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveStateMachine);
            int integer4 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveRenderer, rendererIndexDefault);
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            RendererAttributes rendererAttributes = new RendererAttributes(integer, integer2, integer3, integer4, z11, z12, z13, string3, string4, string5, resourceTypeMakeMaybeResource, new FallbackAssetLoader(applicationContext2, z10, fileAssetLoaderAssetLoaderFrom));
            this.rendererAttributes = rendererAttributes;
            this.controller = new RiveFileController(rendererAttributes.getLoop(), rendererAttributes.getAutoplay(), null, null, null, 28, null);
            o0 o0Var = this.lifecycleOwner;
            if (o0Var != null && (lifecycle = o0Var.getLifecycle()) != null) {
                lifecycle.c(getLifecycleObserver());
            }
            if (resourceTypeMakeMaybeResource != null) {
                loadFileFromResource(new Function1() { // from class: app.rive.runtime.kotlin.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RiveAnimationView.d(this.f77461a, (File) obj);
                    }
                });
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveAnimationView.pause(str, z10);
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveAnimationView.stop(str, z10);
    }

    @Nullable
    public final String getTextRunValue(@NotNull String textRunName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(path, "path");
        return this.controller.getTextRunValue(textRunName, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(@NotNull RiveFileController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.registerListener(listener);
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue, @NotNull String path) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        this.controller.setTextRunValue(textRunName, textValue, path);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(@NotNull RiveFileController.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.controller.unregisterListener(listener);
    }

    public final void stop(@NotNull List<String> animationNames, boolean z10) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        this.controller.stopAnimations(animationNames, z10);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, List list, Loop loop, Direction direction, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i10 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i10 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        riveAnimationView.play((List<String>) list, loop2, direction2, z12, z11);
    }

    public final void pause(@NotNull List<String> animationNames, boolean z10) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        this.controller.pause(animationNames, z10);
    }

    public final void play(@NotNull List<String> animationNames, @NotNull Loop loop, @NotNull Direction direction, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.rendererAttributes.setLoop(loop);
        this.controller.play(animationNames, loop, direction, z10, z11);
    }

    public final void stop(@NotNull String animationName, boolean z10) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        this.controller.stopAnimations(animationName, z10);
    }

    public final void pause(@NotNull String animationName, boolean z10) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        this.controller.pause(animationName, z10);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, String str, Loop loop, Direction direction, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i10 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i10 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        riveAnimationView.play(str, loop2, direction2, z12, z11);
    }

    public final void play(@NotNull String animationName, @NotNull Loop loop, @NotNull Direction direction, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setAnimationName(z10 ? null : animationName);
        rendererAttributes.setStateMachineName(z10 ? animationName : null);
        rendererAttributes.setLoop(loop);
        this.controller.play(animationName, loop, direction, z10, z11);
    }

    public static final class RendererAttributes {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private Alignment alignment;

        @Nullable
        private String animationName;

        @Nullable
        private String artboardName;

        @Nullable
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private boolean autoplay;

        @NotNull
        private Fit fit;

        @NotNull
        private Loop loop;

        @NotNull
        private RendererType rendererType;

        @Nullable
        private ResourceType resource;
        private boolean riveTraceAnimations;

        @Nullable
        private String stateMachineName;

        @SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1175:1\n1#2:1176\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final FileAssetLoader assetLoaderFrom(@Nullable String str, @NotNull Context context) {
                Constructor<?> constructor;
                Constructor<?> constructor2;
                Object objNewInstance;
                Object objNewInstance2;
                Intrinsics.checkNotNullParameter(context, "context");
                if (str != null && str.length() != 0) {
                    try {
                        Class<?> cls = Class.forName(str);
                        Constructor<?>[] constructors = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
                        int length = constructors.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                constructor = null;
                                break;
                            }
                            constructor = constructors[i11];
                            if (constructor.getParameterTypes().length == 1 && Intrinsics.areEqual(constructor.getParameterTypes()[0], Context.class)) {
                                break;
                            }
                            i11++;
                        }
                        if (constructor != null && (objNewInstance2 = constructor.newInstance(context.getApplicationContext())) != null && (objNewInstance2 instanceof ContextAssetLoader)) {
                            return (FileAssetLoader) objNewInstance2;
                        }
                        Constructor<?>[] constructors2 = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors2, "getConstructors(...)");
                        int length2 = constructors2.length;
                        while (true) {
                            if (i10 >= length2) {
                                constructor2 = null;
                                break;
                            }
                            constructor2 = constructors2[i10];
                            Class<?>[] parameterTypes = constructor2.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                            i10++;
                        }
                        if (constructor2 != null && (objNewInstance = constructor2.newInstance(null)) != null && (objNewInstance instanceof FileAssetLoader)) {
                            return (FileAssetLoader) objNewInstance;
                        }
                    } catch (Exception unused) {
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public RendererAttributes(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ResourceType resourceType, @Nullable FileAssetLoader fileAssetLoader) {
            this.autoplay = z10;
            this.autoBind = z11;
            this.riveTraceAnimations = z12;
            this.artboardName = str;
            this.animationName = str2;
            this.stateMachineName = str3;
            this.resource = resourceType;
            this.assetLoader = fileAssetLoader;
            this.alignment = Alignment.Companion.fromIndex(i10);
            this.fit = Fit.Companion.fromIndex(i11);
            this.loop = Loop.Companion.fromIndex(i12);
            this.rendererType = RendererType.Companion.fromIndex(i13);
        }

        @NotNull
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final String getAnimationName() {
            return this.animationName;
        }

        @Nullable
        public final String getArtboardName() {
            return this.artboardName;
        }

        @Nullable
        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        public final boolean getAutoBind() {
            return this.autoBind;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        @NotNull
        public final Fit getFit() {
            return this.fit;
        }

        @NotNull
        public final Loop getLoop() {
            return this.loop;
        }

        @NotNull
        public final RendererType getRendererType() {
            return this.rendererType;
        }

        @Nullable
        public final ResourceType getResource() {
            return this.resource;
        }

        public final boolean getRiveTraceAnimations() {
            return this.riveTraceAnimations;
        }

        @Nullable
        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        public final void setAlignment(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "<set-?>");
            this.alignment = alignment;
        }

        public final void setAnimationName(@Nullable String str) {
            this.animationName = str;
        }

        public final void setArtboardName(@Nullable String str) {
            this.artboardName = str;
        }

        public final void setAssetLoader(@Nullable FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final void setAutoBind(boolean z10) {
            this.autoBind = z10;
        }

        public final void setAutoplay(boolean z10) {
            this.autoplay = z10;
        }

        public final void setFit(@NotNull Fit fit) {
            Intrinsics.checkNotNullParameter(fit, "<set-?>");
            this.fit = fit;
        }

        public final void setLoop(@NotNull Loop loop) {
            Intrinsics.checkNotNullParameter(loop, "<set-?>");
            this.loop = loop;
        }

        public final void setRendererType(@NotNull RendererType rendererType) {
            Intrinsics.checkNotNullParameter(rendererType, "<set-?>");
            this.rendererType = rendererType;
        }

        public final void setResource(@Nullable ResourceType resourceType) {
            this.resource = resourceType;
        }

        public final void setRiveTraceAnimations(boolean z10) {
            this.riveTraceAnimations = z10;
        }

        public final void setStateMachineName(@Nullable String str) {
            this.stateMachineName = str;
        }

        public /* synthetic */ RendererAttributes(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? RiveAnimationView.Companion.getAlignmentIndexDefault() : i10, (i14 & 2) != 0 ? RiveAnimationView.Companion.getFitIndexDefault() : i11, (i14 & 4) != 0 ? RiveAnimationView.Companion.getLoopIndexDefault() : i12, (i14 & 8) != 0 ? RiveAnimationView.Companion.getRendererIndexDefault() : i13, z10, (i14 & 32) != 0 ? false : z11, (i14 & 64) != 0 ? false : z12, str, str2, str3, resourceType, (i14 & 2048) != 0 ? null : fileAssetLoader);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RiveAnimationView(@NotNull Builder builder) {
        this(builder.getContext$kotlin_release(), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (getArtboardRenderer() != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RendererAttributes rendererAttributes = this.rendererAttributes;
        RendererType rendererType$kotlin_release = builder.getRendererType$kotlin_release();
        rendererAttributes.setRendererType(rendererType$kotlin_release == null ? RendererType.Companion.fromIndex(rendererIndexDefault) : rendererType$kotlin_release);
        Boolean autoplay$kotlin_release = builder.getAutoplay$kotlin_release();
        rendererAttributes.setAutoplay(autoplay$kotlin_release != null ? autoplay$kotlin_release.booleanValue() : getDefaultAutoplay());
        rendererAttributes.setAutoBind(builder.getAutoBind$kotlin_release());
        Boolean traceAnimations$kotlin_release = builder.getTraceAnimations$kotlin_release();
        rendererAttributes.setRiveTraceAnimations(traceAnimations$kotlin_release != null ? traceAnimations$kotlin_release.booleanValue() : false);
        rendererAttributes.setArtboardName(builder.getArtboardName$kotlin_release());
        rendererAttributes.setAnimationName(builder.getAnimationName$kotlin_release());
        rendererAttributes.setStateMachineName(builder.getStateMachineName$kotlin_release());
        rendererAttributes.setResource(builder.getResourceType$kotlin_release());
        FileAssetLoader assetLoader = rendererAttributes.getAssetLoader();
        Intrinsics.checkNotNull(assetLoader, "null cannot be cast to non-null type app.rive.runtime.kotlin.core.FallbackAssetLoader");
        ((FallbackAssetLoader) assetLoader).resetWith$kotlin_release(builder);
        Alignment alignment$kotlin_release = builder.getAlignment$kotlin_release();
        rendererAttributes.setAlignment(alignment$kotlin_release == null ? rendererAttributes.getAlignment() : alignment$kotlin_release);
        Fit fit$kotlin_release = builder.getFit$kotlin_release();
        rendererAttributes.setFit(fit$kotlin_release == null ? rendererAttributes.getFit() : fit$kotlin_release);
        Loop loop$kotlin_release = builder.getLoop$kotlin_release();
        rendererAttributes.setLoop(loop$kotlin_release == null ? rendererAttributes.getLoop() : loop$kotlin_release);
    }
}
