package com.google.android.filament.utils;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.filament.Camera;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.Fence;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.TransformManager;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.MaterialProvider;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nModelViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,424:1\n1#2:425\n791#3:426\n307#4:427\n323#4:428\n*S KotlinDebug\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n*L\n245#1:426\n247#1:427\n247#1:428\n*E\n"})
public final class u implements View.OnTouchListener {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    public static final a f104970h3 = new a(null);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final f f104971i3 = new f(0.0f, 0.0f, -4.0f);

    @NotNull
    private final double[] H1;

    @Nullable
    private SwapChain X;

    @NotNull
    private AssetLoader Y;

    @NotNull
    private MaterialProvider Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Engine f104972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.google.android.filament.android.c f104973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private FilamentAsset f104974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Animator f104975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f104976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f104977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f104978g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final double[] f104979g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f104980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Scene f104981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.google.android.filament.View f104982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Camera f104983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Renderer f104984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.google.android.filament.h
    private final int f104985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.filament.android.a f104986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Manipulator f104987o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private ResourceLoader f104988p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final int[] f104989p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final double[] f104990p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f104991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private SurfaceView f104992t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private TextureView f104993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private p2 f104994w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nModelViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer$SurfaceCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n1#2:425\n*E\n"})
    public final class b implements com.google.android.filament.android.c.InterfaceC0955c {
        public b() {
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void a(@NotNull Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            SwapChain swapChain = u.this.X;
            if (swapChain != null) {
                u.this.z().M(swapChain);
            }
            u uVar = u.this;
            uVar.X = uVar.z().t(surface);
            SurfaceView surfaceView = u.this.f104992t;
            com.google.android.filament.android.a aVar = null;
            if (surfaceView != null) {
                u uVar2 = u.this;
                com.google.android.filament.android.a aVar2 = uVar2.f104986n;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                    aVar2 = null;
                }
                aVar2.b(uVar2.E(), surfaceView.getDisplay());
            }
            TextureView textureView = u.this.f104993v;
            if (textureView != null) {
                u uVar3 = u.this;
                com.google.android.filament.android.a aVar3 = uVar3.f104986n;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                } else {
                    aVar = aVar3;
                }
                aVar.b(uVar3.E(), textureView.getDisplay());
            }
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void b(int i10, int i11) {
            u.this.G().t0(new com.google.android.filament.w(0, 0, i10, i11));
            Manipulator manipulator = u.this.f104987o;
            if (manipulator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
                manipulator = null;
            }
            manipulator.J(i10, i11);
            u.this.W();
            u uVar = u.this;
            uVar.T(uVar.z());
        }

        @Override // com.google.android.filament.android.c.InterfaceC0955c
        public void c() {
            com.google.android.filament.android.a aVar = u.this.f104986n;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                aVar = null;
            }
            aVar.c();
            SwapChain swapChain = u.this.X;
            if (swapChain != null) {
                u uVar = u.this;
                uVar.z().M(swapChain);
                uVar.z().S();
                uVar.X = null;
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            u.this.f104973b.l();
            u.this.r();
            u.this.Y.d();
            u.this.Z.b();
            u.this.Z.destroy();
            u.this.f104988p0.f();
            u.this.z().A(u.this.A());
            u.this.z().H(u.this.E());
            u.this.z().P(u.this.G());
            u.this.z().I(u.this.F());
            u.this.z().y(u.this.v().g());
            EntityManager.f().d(u.this.v().g());
            EntityManager.f().d(u.this.A());
            u.this.z().x();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.android.filament.utils.ModelViewer$fetchResources$2", f = "ModelViewer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f104997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<String, Buffer> f104998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f104999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FilamentAsset f105000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HashMap<String, Buffer> map, u uVar, FilamentAsset filamentAsset, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f104998b = map;
            this.f104999c = uVar;
            this.f105000d = filamentAsset;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f104998b, this.f104999c, this.f105000d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f104997a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            for (Map.Entry<String, Buffer> entry : this.f104998b.entrySet()) {
                this.f104999c.f104988p0.a(entry.getKey(), entry.getValue());
            }
            this.f104999c.f104988p0.b(this.f105000d);
            this.f104999c.f104975d = this.f105000d.j().e();
            this.f105000d.t();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.android.filament.utils.ModelViewer$loadModelGltfAsync$1", f = "ModelViewer.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f105001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Buffer> f105003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super String, ? extends Buffer> function1, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f105003c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new e(this.f105003c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f105001a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u uVar = u.this;
                FilamentAsset filamentAssetU = uVar.u();
                Intrinsics.checkNotNull(filamentAssetU);
                Function1<String, Buffer> function1 = this.f105003c;
                this.f105001a = 1;
                if (uVar.s(filamentAssetU, function1, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public u(@NotNull Engine engine, @NotNull com.google.android.filament.android.c uiHelper) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        this.f104972a = engine;
        this.f104973b = uiHelper;
        this.f104976e = true;
        this.f104977f = 28.0f;
        this.f104978g = 0.05f;
        this.f104980h = 1000.0f;
        this.f104989p1 = new int[128];
        this.H1 = new double[3];
        this.f104990p2 = new double[3];
        this.f104979g3 = new double[3];
        this.f104984l = engine.q();
        Scene sceneR = engine.r();
        this.f104981i = sceneR;
        Camera cameraO = engine.o(engine.Y().a());
        Intrinsics.checkNotNullExpressionValue(cameraO, "createCamera(...)");
        cameraO.B(16.0f, 0.008f, 100.0f);
        this.f104983k = cameraO;
        com.google.android.filament.View viewW = engine.w();
        this.f104982j = viewW;
        viewW.i0(sceneR);
        viewW.S(cameraO);
        UbershaderProvider ubershaderProvider = new UbershaderProvider(engine);
        this.Z = ubershaderProvider;
        this.Y = new AssetLoader(engine, ubershaderProvider, EntityManager.f());
        this.f104988p0 = new ResourceLoader(engine, this.f104976e);
        int iA = EntityManager.f().a();
        this.f104985m = iA;
        float[] fArrA = Colors.a(6500.0f);
        Intrinsics.checkNotNullExpressionValue(fArrA, "cct(...)");
        new LightManager.a(LightManager.d.DIRECTIONAL).d(fArrA[0], fArrA[1], fArrA[2]).g(100000.0f).e(0.0f, -1.0f, 0.0f).c(true).a(engine, iA);
        sceneR.b(iA);
    }

    public static /* synthetic */ void D() {
    }

    private final void M(final FilamentAsset filamentAsset) {
        RenderableManager renderableManagerC0 = this.f104972a.c0();
        Intrinsics.checkNotNullExpressionValue(renderableManagerC0, "getRenderableManager(...)");
        final i1.f fVar = new i1.f();
        Function0 function0 = new Function0() { // from class: com.google.android.filament.utils.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(u.N(fVar, filamentAsset, this));
            }
        };
        while (((Boolean) function0.invoke()).booleanValue()) {
            int i10 = fVar.f312749a;
            for (int i11 = 0; i11 < i10; i11++) {
                renderableManagerC0.i0(renderableManagerC0.H(this.f104989p1[i11]), true);
            }
            this.f104981i.a(CollectionsKt.toIntArray(ArraysKt.take(this.f104989p1, fVar.f312749a)));
        }
        this.f104981i.a(filamentAsset.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(i1.f fVar, FilamentAsset filamentAsset, u uVar) {
        int iS = filamentAsset.s(uVar.f104989p1);
        fVar.f312749a = iS;
        return iS != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Engine engine) {
        Fence fenceP = engine.p();
        Intrinsics.checkNotNullExpressionValue(fenceP, "createFence(...)");
        fenceP.c(Fence.b.FLUSH, -1L);
        engine.B(fenceP);
    }

    public static /* synthetic */ void V(u uVar, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = f104971i3;
        }
        uVar.U(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        this.f104983k.D(this.f104977f, ((double) this.f104982j.C().f105025c) / ((double) this.f104982j.C().f105026d), this.f104978g, this.f104980h);
    }

    private final void p(View view) {
        view.addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(FilamentAsset filamentAsset, Function1<? super String, ? extends Buffer> function1, kotlin.coroutines.d<? super Unit> dVar) {
        HashMap map = new HashMap();
        String[] strArrP = filamentAsset.p();
        Intrinsics.checkNotNullExpressionValue(strArrP, "getResourceUris(...)");
        for (String str : strArrP) {
            Intrinsics.checkNotNull(str);
            map.put(str, function1.invoke(str));
        }
        Object objH = kotlinx.coroutines.i.h(l1.e(), new d(map, this, filamentAsset, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final int A() {
        return this.f104985m;
    }

    public final boolean B() {
        return this.f104976e;
    }

    public final float C() {
        return this.f104988p0.d();
    }

    @NotNull
    public final Renderer E() {
        return this.f104984l;
    }

    @NotNull
    public final Scene F() {
        return this.f104981i;
    }

    @NotNull
    public final com.google.android.filament.View G() {
        return this.f104982j;
    }

    public final void H(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        r();
        FilamentAsset filamentAssetA = this.Y.a(buffer);
        this.f104974c = filamentAssetA;
        if (filamentAssetA != null) {
            this.f104988p0.b(filamentAssetA);
            this.f104975d = filamentAssetA.j().e();
            filamentAssetA.t();
        }
    }

    public final void I(@NotNull Buffer buffer, @NotNull Function1<? super String, ? extends Buffer> callback) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r();
        FilamentAsset filamentAssetA = this.Y.a(buffer);
        this.f104974c = filamentAssetA;
        if (filamentAssetA != null) {
            for (String str : filamentAssetA.p()) {
                Intrinsics.checkNotNull(str);
                Buffer bufferInvoke = callback.invoke(str);
                if (bufferInvoke == null) {
                    this.f104974c = null;
                    return;
                }
                this.f104988p0.a(str, bufferInvoke);
            }
            this.f104988p0.b(filamentAssetA);
            this.f104975d = filamentAssetA.j().e();
            filamentAssetA.t();
        }
    }

    public final void J(@NotNull Buffer buffer, @NotNull Function1<? super String, ? extends Buffer> callback) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r();
        this.f104974c = this.Y.a(buffer);
        int i10 = 5 ^ 0;
        this.f104994w = kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new e(callback, null), 3, null);
    }

    public final void L(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = this.f104991s;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
            hVar = null;
        }
        hVar.e(event);
    }

    public final void O(long j10) {
        if (this.f104973b.s()) {
            this.f104988p0.e();
            FilamentAsset filamentAsset = this.f104974c;
            if (filamentAsset != null) {
                M(filamentAsset);
            }
            Manipulator manipulator = this.f104987o;
            if (manipulator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
                manipulator = null;
            }
            manipulator.y(this.H1, this.f104990p2, this.f104979g3);
            Camera camera = this.f104983k;
            double[] dArr = this.H1;
            double d10 = dArr[0];
            double d11 = dArr[1];
            double d12 = dArr[2];
            double[] dArr2 = this.f104990p2;
            double d13 = dArr2[0];
            double d14 = dArr2[1];
            double d15 = dArr2[2];
            double[] dArr3 = this.f104979g3;
            camera.x(d10, d11, d12, d13, d14, d15, dArr3[0], dArr3[1], dArr3[2]);
            Renderer renderer = this.f104984l;
            SwapChain swapChain = this.X;
            Intrinsics.checkNotNull(swapChain);
            if (renderer.a(swapChain, j10)) {
                this.f104984l.n(this.f104982j);
                this.f104984l.d();
            }
        }
    }

    public final void P(float f10) {
        this.f104980h = f10;
        W();
    }

    public final void Q(float f10) {
        this.f104977f = f10;
        W();
    }

    public final void R(float f10) {
        this.f104978g = f10;
        W();
    }

    public final void S(boolean z10) {
        this.f104976e = z10;
    }

    public final void U(@NotNull f centerPoint) {
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        FilamentAsset filamentAsset = this.f104974c;
        if (filamentAsset != null) {
            TransformManager transformManagerE0 = this.f104972a.e0();
            Intrinsics.checkNotNullExpressionValue(transformManagerE0, "getTransformManager(...)");
            float[] fArrA = filamentAsset.b().a();
            f fVar = new f(fArrA[0], fArrA[1], fArrA[2]);
            float[] fArrB = filamentAsset.b().b();
            f fVar2 = new f(fArrB[0], fArrB[1], fArrB[2]);
            float fMax = 2.0f / (Math.max(fVar2.H(), Math.max(fVar2.K(), fVar2.L())) * 2.0f);
            f fVar3 = new f(centerPoint.H() / fMax, centerPoint.K() / fMax, centerPoint.L() / fMax);
            transformManagerE0.u(transformManagerE0.h(filamentAsset.q()), s.X(s.R(new f(fMax)).X(s.T(new f(fVar.H() - fVar3.H(), fVar.K() - fVar3.K(), fVar.L() - fVar3.L()).u0()))).a0());
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        L(event);
        return true;
    }

    public final void q() {
        FilamentAsset filamentAsset = this.f104974c;
        if (filamentAsset != null) {
            TransformManager transformManagerE0 = this.f104972a.e0();
            Intrinsics.checkNotNullExpressionValue(transformManagerE0, "getTransformManager(...)");
            transformManagerE0.u(transformManagerE0.h(filamentAsset.q()), new q((g) null, (g) null, (g) null, (g) null, 15, (DefaultConstructorMarker) null).a0());
        }
    }

    public final void r() {
        p2 p2Var = this.f104994w;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f104988p0.c();
        this.f104988p0.g();
        FilamentAsset filamentAsset = this.f104974c;
        if (filamentAsset != null) {
            this.f104981i.o(filamentAsset.e());
            this.Y.e(filamentAsset);
            this.f104974c = null;
            this.f104975d = null;
        }
    }

    @Nullable
    public final Animator t() {
        return this.f104975d;
    }

    @Nullable
    public final FilamentAsset u() {
        return this.f104974c;
    }

    @NotNull
    public final Camera v() {
        return this.f104983k;
    }

    public final float w() {
        return this.f104980h;
    }

    public final float x() {
        return this.f104977f;
    }

    public final float y() {
        return this.f104978g;
    }

    @NotNull
    public final Engine z() {
        return this.f104972a;
    }

    public /* synthetic */ u(SurfaceView surfaceView, Engine engine, com.google.android.filament.android.c cVar, Manipulator manipulator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(surfaceView, (i10 & 2) != 0 ? Engine.l() : engine, (i10 & 4) != 0 ? new com.google.android.filament.android.c(com.google.android.filament.android.c.a.DONT_CHECK) : cVar, (i10 & 8) != 0 ? null : manipulator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull SurfaceView surfaceView, @NotNull Engine engine, @NotNull com.google.android.filament.android.c uiHelper, @Nullable Manipulator manipulator) {
        this(engine, uiHelper);
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.a aVar = new Manipulator.a();
            f fVar = f104971i3;
            manipulator = aVar.q(fVar.H(), fVar.K(), fVar.L()).s(surfaceView.getWidth(), surfaceView.getHeight()).a(Manipulator.d.ORBIT);
            Intrinsics.checkNotNullExpressionValue(manipulator, "build(...)");
        }
        this.f104987o = manipulator;
        this.f104992t = surfaceView;
        if (manipulator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
            manipulator = null;
        }
        this.f104991s = new h(surfaceView, manipulator);
        this.f104986n = new com.google.android.filament.android.a(surfaceView.getContext());
        uiHelper.w(new b());
        uiHelper.h(surfaceView);
        p(surfaceView);
    }

    public /* synthetic */ u(TextureView textureView, Engine engine, com.google.android.filament.android.c cVar, Manipulator manipulator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(textureView, (i10 & 2) != 0 ? Engine.l() : engine, (i10 & 4) != 0 ? new com.google.android.filament.android.c(com.google.android.filament.android.c.a.DONT_CHECK) : cVar, (i10 & 8) != 0 ? null : manipulator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull TextureView textureView, @NotNull Engine engine, @NotNull com.google.android.filament.android.c uiHelper, @Nullable Manipulator manipulator) {
        this(engine, uiHelper);
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.a aVar = new Manipulator.a();
            f fVar = f104971i3;
            manipulator = aVar.q(fVar.H(), fVar.K(), fVar.L()).s(textureView.getWidth(), textureView.getHeight()).a(Manipulator.d.ORBIT);
            Intrinsics.checkNotNullExpressionValue(manipulator, "build(...)");
        }
        this.f104987o = manipulator;
        this.f104993v = textureView;
        if (manipulator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
            manipulator = null;
        }
        this.f104991s = new h(textureView, manipulator);
        this.f104986n = new com.google.android.filament.android.a(textureView.getContext());
        uiHelper.w(new b());
        uiHelper.i(textureView);
        p(textureView);
    }
}
