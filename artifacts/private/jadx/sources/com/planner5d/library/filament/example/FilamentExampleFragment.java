package com.planner5d.library.filament.example;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.media3.common.j;
import com.facebook.appevents.internal.p;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Skybox;
import com.google.android.filament.SwapChain;
import com.google.android.filament.TransformManager;
import com.google.android.filament.View;
import com.google.android.filament.h;
import com.google.android.filament.k;
import com.google.android.filament.w;
import com.planner5d.library.activity.fragment.FragmentController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nFilamentExampleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilamentExampleFragment.kt\ncom/planner5d/library/filament/example/FilamentExampleFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class FilamentExampleFragment extends FragmentController {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SurfaceView f179927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.filament.android.c f179928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.filament.android.a f179929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Choreographer f179930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Engine f179931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Renderer f179932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Scene f179933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f179934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Camera f179935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @h
    private int f179936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private SwapChain f179937o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final nc.a f179938s = new nc.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ValueAnimator f179939t = ValueAnimator.ofFloat(0.0f, 360.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final c f179940v = new c();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nFilamentExampleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilamentExampleFragment.kt\ncom/planner5d/library/filament/example/FilamentExampleFragment$SurfaceCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public final class b implements com.google.android.filament.android.c.InterfaceC0955c {
        public b() {
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void a(@NotNull Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            SwapChain swapChain = FilamentExampleFragment.this.f179937o;
            SurfaceView surfaceView = null;
            if (swapChain != null) {
                Engine engine = FilamentExampleFragment.this.f179931i;
                if (engine == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("engine");
                    engine = null;
                }
                engine.M(swapChain);
            }
            com.google.android.filament.android.c cVar = FilamentExampleFragment.this.f179928f;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uiHelper");
                cVar = null;
            }
            long jP = cVar.p();
            Engine engine2 = FilamentExampleFragment.this.f179931i;
            if (engine2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("engine");
                engine2 = null;
            }
            if (engine2.U() == Engine.d.FEATURE_LEVEL_0) {
                Engine engine3 = FilamentExampleFragment.this.f179931i;
                if (engine3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("engine");
                    engine3 = null;
                }
                if (SwapChain.e(engine3)) {
                    jP |= 16;
                }
            }
            FilamentExampleFragment filamentExampleFragment = FilamentExampleFragment.this;
            Engine engine4 = filamentExampleFragment.f179931i;
            if (engine4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("engine");
                engine4 = null;
            }
            filamentExampleFragment.f179937o = engine4.u(surface, jP);
            com.google.android.filament.android.a aVar = FilamentExampleFragment.this.f179929g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                aVar = null;
            }
            Renderer renderer = FilamentExampleFragment.this.f179932j;
            if (renderer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderer");
                renderer = null;
            }
            SurfaceView surfaceView2 = FilamentExampleFragment.this.f179927e;
            if (surfaceView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
            } else {
                surfaceView = surfaceView2;
            }
            aVar.b(renderer, surfaceView.getDisplay());
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void b(int i10, int i11) {
            Camera camera;
            double d10 = ((double) i10) / ((double) i11);
            Camera camera2 = FilamentExampleFragment.this.f179935m;
            Engine engine = null;
            if (camera2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("camera");
                camera = null;
            } else {
                camera = camera2;
            }
            camera.H(Camera.b.ORTHO, (-d10) * 1.5d, d10 * 1.5d, -1.5d, 1.5d, 0.0d, 10.0d);
            View view = FilamentExampleFragment.this.f179934l;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(p.A);
                view = null;
            }
            view.t0(new w(0, 0, i10, i11));
            Engine engine2 = FilamentExampleFragment.this.f179931i;
            if (engine2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("engine");
            } else {
                engine = engine2;
            }
            com.google.android.filament.android.b.a(engine);
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void c() {
            com.google.android.filament.android.a aVar = FilamentExampleFragment.this.f179929g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                aVar = null;
            }
            aVar.c();
            SwapChain swapChain = FilamentExampleFragment.this.f179937o;
            if (swapChain != null) {
                FilamentExampleFragment filamentExampleFragment = FilamentExampleFragment.this;
                Engine engine = filamentExampleFragment.f179931i;
                if (engine == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("engine");
                    engine = null;
                }
                engine.M(swapChain);
                Engine engine2 = filamentExampleFragment.f179931i;
                if (engine2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("engine");
                    engine2 = null;
                }
                engine2.S();
                filamentExampleFragment.f179937o = null;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nFilamentExampleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilamentExampleFragment.kt\ncom/planner5d/library/filament/example/FilamentExampleFragment$frameScheduler$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public static final class c implements Choreographer.FrameCallback {
        c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            SwapChain swapChain;
            Choreographer choreographer = FilamentExampleFragment.this.f179930h;
            Renderer renderer = null;
            if (choreographer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("choreographer");
                choreographer = null;
            }
            choreographer.postFrameCallback(this);
            com.google.android.filament.android.c cVar = FilamentExampleFragment.this.f179928f;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uiHelper");
                cVar = null;
            }
            if (cVar.s() && (swapChain = FilamentExampleFragment.this.f179937o) != null) {
                Renderer renderer2 = FilamentExampleFragment.this.f179932j;
                if (renderer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    renderer2 = null;
                }
                if (renderer2.a(swapChain, j10)) {
                    Renderer renderer3 = FilamentExampleFragment.this.f179932j;
                    if (renderer3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("renderer");
                        renderer3 = null;
                    }
                    View view = FilamentExampleFragment.this.f179934l;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(p.A);
                        view = null;
                    }
                    renderer3.n(view);
                    Renderer renderer4 = FilamentExampleFragment.this.f179932j;
                    if (renderer4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("renderer");
                    } else {
                        renderer = renderer4;
                    }
                    renderer.d();
                }
            }
        }
    }

    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f179943a = new float[16];

        d() {
        }

        public final float[] a() {
            return this.f179943a;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator a10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            float[] fArr = this.f179943a;
            Object animatedValue = a10.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            Matrix.setRotateM(fArr, 0, -((Float) animatedValue).floatValue(), 0.0f, 0.0f, 1.0f);
            Engine engine = FilamentExampleFragment.this.f179931i;
            if (engine == null) {
                Intrinsics.throwUninitializedPropertyAccessException("engine");
                engine = null;
            }
            TransformManager transformManagerE0 = engine.e0();
            Intrinsics.checkNotNullExpressionValue(transformManagerE0, "getTransformManager(...)");
            transformManagerE0.u(transformManagerE0.h(FilamentExampleFragment.this.f179936n), this.f179943a);
        }
    }

    static {
        k.a();
    }

    private final void A() {
        com.google.android.filament.android.c cVar = new com.google.android.filament.android.c(com.google.android.filament.android.c.a.DONT_CHECK);
        this.f179928f = cVar;
        cVar.w(new b());
        com.google.android.filament.android.c cVar2 = this.f179928f;
        SurfaceView surfaceView = null;
        boolean z10 = true;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiHelper");
            cVar2 = null;
        }
        SurfaceView surfaceView2 = this.f179927e;
        if (surfaceView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
        } else {
            surfaceView = surfaceView2;
        }
        cVar2.h(surfaceView);
    }

    private final void B() {
        Scene scene = this.f179933k;
        Scene scene2 = null;
        if (scene == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scene");
            scene = null;
        }
        Skybox.a aVarB = new Skybox.a().b(0.035f, 0.035f, 0.035f, 1.0f);
        Engine engine = this.f179931i;
        if (engine == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine = null;
        }
        scene.r(aVarB.a(engine));
        View view = this.f179934l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(p.A);
            view = null;
        }
        view.e0(false);
        View view2 = this.f179934l;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(p.A);
            view2 = null;
        }
        Camera camera = this.f179935m;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        view2.S(camera);
        View view3 = this.f179934l;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(p.A);
            view3 = null;
        }
        Scene scene3 = this.f179933k;
        if (scene3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scene");
        } else {
            scene2 = scene3;
        }
        view3.i0(scene2);
    }

    private final void C() {
        this.f179939t.setInterpolator(new LinearInterpolator());
        this.f179939t.setDuration(j.f60679f2);
        this.f179939t.setRepeatMode(1);
        this.f179939t.setRepeatCount(-1);
        this.f179939t.addUpdateListener(new d());
        this.f179939t.start();
    }

    private final void y() {
        Engine engineB = new Engine.b().b();
        this.f179931i = engineB;
        Engine engine = null;
        if (engineB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engineB = null;
        }
        engineB.A0(Engine.d.FEATURE_LEVEL_0);
        Engine engine2 = this.f179931i;
        if (engine2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine2 = null;
        }
        this.f179932j = engine2.q();
        Engine engine3 = this.f179931i;
        if (engine3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine3 = null;
        }
        this.f179933k = engine3.r();
        Engine engine4 = this.f179931i;
        if (engine4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine4 = null;
        }
        this.f179934l = engine4.w();
        Engine engine5 = this.f179931i;
        if (engine5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine5 = null;
        }
        Engine engine6 = this.f179931i;
        if (engine6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
        } else {
            engine = engine6;
        }
        this.f179935m = engine5.o(engine.Y().a());
    }

    private final void z() {
        nc.a aVar = this.f179938s;
        Engine engine = this.f179931i;
        Scene scene = null;
        if (engine == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine = null;
        }
        aVar.b(engine);
        this.f179936n = EntityManager.f().a();
        RenderableManager.a aVarJ = new RenderableManager.a(1).b(new com.google.android.filament.d(0.0f, 0.0f, 0.0f, 5.0f, 5.0f, 5.0f)).j(0, RenderableManager.b.TRIANGLES, this.f179938s.d(), this.f179938s.c(), 0, 3);
        Engine engine2 = this.f179931i;
        if (engine2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine2 = null;
        }
        aVarJ.c(engine2, this.f179936n);
        Scene scene2 = this.f179933k;
        if (scene2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scene");
        } else {
            scene = scene2;
        }
        scene.b(this.f179936n);
        C();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected android.view.View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        xb.a aVarD = xb.a.d(inflater, viewGroup, false);
        this.f179927e = new SurfaceView(getContext());
        FrameLayout root = aVarD.getRoot();
        SurfaceView surfaceView = this.f179927e;
        if (surfaceView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
            surfaceView = null;
        }
        root.addView(surfaceView);
        this.f179930h = Choreographer.getInstance();
        Context context = getContext();
        if (context != null) {
            this.f179929g = new com.google.android.filament.android.a(context);
        }
        A();
        y();
        B();
        z();
        FrameLayout root2 = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Choreographer choreographer = this.f179930h;
        Engine engine = null;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.removeFrameCallback(this.f179940v);
        this.f179939t.cancel();
        com.google.android.filament.android.c cVar = this.f179928f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiHelper");
            cVar = null;
        }
        cVar.l();
        Engine engine2 = this.f179931i;
        if (engine2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine2 = null;
        }
        engine2.A(this.f179936n);
        Engine engine3 = this.f179931i;
        if (engine3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine3 = null;
        }
        Renderer renderer = this.f179932j;
        if (renderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderer");
            renderer = null;
        }
        engine3.H(renderer);
        nc.a aVar = this.f179938s;
        Engine engine4 = this.f179931i;
        if (engine4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine4 = null;
        }
        aVar.a(engine4);
        Engine engine5 = this.f179931i;
        if (engine5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine5 = null;
        }
        View view = this.f179934l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(p.A);
            view = null;
        }
        engine5.P(view);
        Engine engine6 = this.f179931i;
        if (engine6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine6 = null;
        }
        Scene scene = this.f179933k;
        if (scene == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scene");
            scene = null;
        }
        engine6.I(scene);
        Engine engine7 = this.f179931i;
        if (engine7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            engine7 = null;
        }
        Camera camera = this.f179935m;
        if (camera == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera = null;
        }
        engine7.y(camera.g());
        EntityManager entityManagerF = EntityManager.f();
        Intrinsics.checkNotNullExpressionValue(entityManagerF, "get(...)");
        entityManagerF.d(this.f179936n);
        Camera camera2 = this.f179935m;
        if (camera2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("camera");
            camera2 = null;
        }
        entityManagerF.d(camera2.g());
        Engine engine8 = this.f179931i;
        if (engine8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
        } else {
            engine = engine8;
        }
        engine.x();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Choreographer choreographer = this.f179930h;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.removeFrameCallback(this.f179940v);
        this.f179939t.cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Choreographer choreographer = this.f179930h;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.postFrameCallback(this.f179940v);
        this.f179939t.start();
    }
}
