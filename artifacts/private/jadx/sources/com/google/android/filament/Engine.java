package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.filament.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes4.dex */
public class Engine {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a[] f103870g = a.values();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d[] f103871h = d.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f103873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final TransformManager f103874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final LightManager f103875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final RenderableManager f103876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final EntityManager f103877f;

    public enum a {
        DEFAULT,
        OPENGL,
        VULKAN,
        METAL,
        NOOP;

        static {
            int i10 = 6 << 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f103884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f103886c;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103887a;

            a(long j10) {
                this.f103887a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Engine.nDestroyBuilder(this.f103887a);
            }
        }

        public b() {
            long jNCreateBuilder = Engine.nCreateBuilder();
            this.f103885b = jNCreateBuilder;
            this.f103884a = new a(jNCreateBuilder);
        }

        public b a(a aVar) {
            Engine.nSetBuilderBackend(this.f103885b, aVar.ordinal());
            return this;
        }

        public Engine b() {
            long jNBuilderBuild = Engine.nBuilderBuild(this.f103885b);
            if (jNBuilderBuild != 0) {
                return new Engine(jNBuilderBuild, this.f103886c);
            }
            throw new IllegalStateException("Couldn't create Engine");
        }

        public b c(c cVar) {
            this.f103886c = cVar;
            Engine.nSetBuilderConfig(this.f103885b, cVar.f103892a, cVar.f103893b, cVar.f103894c, cVar.f103895d, cVar.f103896e, cVar.f103897f, cVar.f103899h, cVar.f103900i.ordinal(), cVar.f103901j, cVar.f103902k, cVar.f103903l, cVar.f103904m, cVar.f103905n.ordinal(), cVar.f103906o, cVar.f103907p);
            return this;
        }

        public b d(@NonNull String str, boolean z10) {
            Engine.nSetBuilderFeature(this.f103885b, str, z10);
            return this;
        }

        public b e(d dVar) {
            Engine.nSetBuilderFeatureLevel(this.f103885b, dVar.ordinal());
            return this;
        }

        public b f(boolean z10) {
            Engine.nSetBuilderPaused(this.f103885b, z10);
            return this;
        }

        public b g(Object obj) {
            if (n.a().h(obj)) {
                Engine.nSetBuilderSharedContext(this.f103885b, n.a().b(obj));
                return this;
            }
            throw new IllegalArgumentException("Invalid shared context " + obj);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final long f103888q = 3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final long f103889r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f103890s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f103891t = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f103892a = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f103893b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f103894c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f103895d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f103896e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f103897f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f103898g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f103899h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public e f103900i = e.NONE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f103901j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f103902k = 64;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f103903l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f103904m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f103905n = a.DEFAULT;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f103906o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f103907p = false;

        public enum a {
            DEFAULT,
            MSL,
            METAL_LIBRARY;

            static {
                int i10 = 1 >> 2;
            }
        }
    }

    public enum d {
        FEATURE_LEVEL_0,
        FEATURE_LEVEL_1,
        FEATURE_LEVEL_2,
        FEATURE_LEVEL_3
    }

    public enum e {
        NONE,
        INSTANCED,
        MULTIVIEW
    }

    public static native long getSteadyClockTimeNano();

    private static void j(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Object couldn't be destroyed (double destroy()?)");
        }
    }

    private void k() {
        this.f103872a = 0L;
    }

    @NonNull
    public static Engine l() {
        return new b().b();
    }

    @NonNull
    public static Engine m(@NonNull a aVar) {
        return new b().a(aVar).b();
    }

    @NonNull
    public static Engine n(@NonNull Object obj) {
        return new b().g(obj).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native long nCreateCamera(long j10, int i10);

    private static native long nCreateFence(long j10);

    private static native long nCreateRenderer(long j10);

    private static native long nCreateScene(long j10);

    private static native long nCreateSwapChain(long j10, Object obj, long j11);

    private static native long nCreateSwapChainFromRawPointer(long j10, long j11, long j12);

    private static native long nCreateSwapChainHeadless(long j10, int i10, int i11, long j11);

    private static native long nCreateView(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nDestroyCameraComponent(long j10, int i10);

    private static native boolean nDestroyColorGrading(long j10, long j11);

    private static native void nDestroyEngine(long j10);

    private static native void nDestroyEntity(long j10, int i10);

    private static native boolean nDestroyFence(long j10, long j11);

    private static native boolean nDestroyIndexBuffer(long j10, long j11);

    private static native boolean nDestroyIndirectLight(long j10, long j11);

    private static native boolean nDestroyMaterial(long j10, long j11);

    private static native boolean nDestroyMaterialInstance(long j10, long j11);

    private static native boolean nDestroyRenderTarget(long j10, long j11);

    private static native boolean nDestroyRenderer(long j10, long j11);

    private static native boolean nDestroyScene(long j10, long j11);

    private static native boolean nDestroySkinningBuffer(long j10, long j11);

    private static native boolean nDestroySkybox(long j10, long j11);

    private static native boolean nDestroyStream(long j10, long j11);

    private static native boolean nDestroySwapChain(long j10, long j11);

    private static native boolean nDestroyTexture(long j10, long j11);

    private static native boolean nDestroyVertexBuffer(long j10, long j11);

    private static native boolean nDestroyView(long j10, long j11);

    private static native void nFlush(long j10);

    private static native boolean nFlushAndWait(long j10, long j11);

    private static native int nGetActiveFeatureLevel(long j10);

    private static native long nGetBackend(long j10);

    private static native long nGetCameraComponent(long j10, int i10);

    private static native long nGetEntityManager(long j10);

    private static native boolean nGetFeatureFlag(long j10, String str);

    private static native long nGetJobSystem(long j10);

    private static native long nGetLightManager(long j10);

    private static native long nGetMaxStereoscopicEyes(long j10);

    private static native long nGetRenderableManager(long j10);

    private static native int nGetSupportedFeatureLevel(long j10);

    private static native long nGetTransformManager(long j10);

    private static native boolean nHasFeatureFlag(long j10, String str);

    private static native boolean nIsAutomaticInstancingEnabled(long j10);

    private static native boolean nIsPaused(long j10);

    private static native boolean nIsValidColorGrading(long j10, long j11);

    private static native boolean nIsValidExpensiveMaterialInstance(long j10, long j11);

    private static native boolean nIsValidFence(long j10, long j11);

    private static native boolean nIsValidIndexBuffer(long j10, long j11);

    private static native boolean nIsValidIndirectLight(long j10, long j11);

    private static native boolean nIsValidMaterial(long j10, long j11);

    private static native boolean nIsValidMaterialInstance(long j10, long j11, long j12);

    private static native boolean nIsValidRenderTarget(long j10, long j11);

    private static native boolean nIsValidRenderer(long j10, long j11);

    private static native boolean nIsValidScene(long j10, long j11);

    private static native boolean nIsValidSkinningBuffer(long j10, long j11);

    private static native boolean nIsValidSkybox(long j10, long j11);

    private static native boolean nIsValidStream(long j10, long j11);

    private static native boolean nIsValidSwapChain(long j10, long j11);

    private static native boolean nIsValidTexture(long j10, long j11);

    private static native boolean nIsValidVertexBuffer(long j10, long j11);

    private static native boolean nIsValidView(long j10, long j11);

    private static native int nSetActiveFeatureLevel(long j10, int i10);

    private static native void nSetAutomaticInstancingEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderBackend(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderConfig(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, int i10, long j17, long j18, long j19, boolean z11, int i11, boolean z12, boolean z13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderFeature(long j10, String str, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderFeatureLevel(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderPaused(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nSetBuilderSharedContext(long j10, long j11);

    private static native boolean nSetFeatureFlag(long j10, String str, boolean z10);

    private static native void nSetPaused(long j10, boolean z10);

    private static native void nUnprotected(long j10);

    public void A(@h int i10) {
        nDestroyEntity(getNativeObject(), i10);
    }

    @NonNull
    public d A0(@NonNull d dVar) {
        return f103871h[nSetActiveFeatureLevel(getNativeObject(), dVar.ordinal())];
    }

    public void B(@NonNull Fence fence) {
        j(nDestroyFence(getNativeObject(), fence.b()));
        fence.a();
    }

    public void B0(boolean z10) {
        nSetAutomaticInstancingEnabled(getNativeObject(), z10);
    }

    public void C(@NonNull IndexBuffer indexBuffer) {
        j(nDestroyIndexBuffer(getNativeObject(), indexBuffer.h()));
        indexBuffer.f();
    }

    public boolean C0(@NonNull String str, boolean z10) {
        return nSetFeatureFlag(this.f103872a, str, z10);
    }

    public void D(@NonNull IndirectLight indirectLight) {
        j(nDestroyIndirectLight(getNativeObject(), indirectLight.q()));
        indirectLight.j();
    }

    public void D0(boolean z10) {
        nSetPaused(getNativeObject(), z10);
    }

    public void E(@NonNull Material material) {
        j(nDestroyMaterial(getNativeObject(), material.m()));
        material.b();
    }

    public void E0() {
        nUnprotected(getNativeObject());
    }

    public void F(@NonNull MaterialInstance materialInstance) {
        j(nDestroyMaterialInstance(getNativeObject(), materialInstance.h()));
        materialInstance.a();
    }

    public void G(@NonNull RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.m());
        renderTarget.i();
    }

    public void H(@NonNull Renderer renderer) {
        j(nDestroyRenderer(getNativeObject(), renderer.i()));
        renderer.b();
    }

    public void I(@NonNull Scene scene) {
        j(nDestroyScene(getNativeObject(), scene.j()));
        scene.c();
    }

    public void J(@NonNull SkinningBuffer skinningBuffer) {
        j(nDestroySkinningBuffer(getNativeObject(), skinningBuffer.h()));
        skinningBuffer.f();
    }

    public void K(@NonNull Skybox skybox) {
        j(nDestroySkybox(getNativeObject(), skybox.k()));
        skybox.h();
    }

    public void L(@NonNull Stream stream) {
        j(nDestroyStream(getNativeObject(), stream.h()));
        stream.g();
    }

    public void M(@NonNull SwapChain swapChain) {
        j(nDestroySwapChain(getNativeObject(), swapChain.b()));
        swapChain.a();
    }

    public void N(@NonNull Texture texture) {
        j(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.n();
    }

    public void O(@NonNull VertexBuffer vertexBuffer) {
        j(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.j()));
        vertexBuffer.i();
    }

    public void P(@NonNull View view) {
        j(nDestroyView(getNativeObject(), view.s()));
        view.b();
    }

    public void Q() {
        e0().r(true);
    }

    public void R() {
        nFlush(getNativeObject());
    }

    public void S() {
        T(-1L);
    }

    public boolean T(long j10) {
        return nFlushAndWait(getNativeObject(), j10);
    }

    @NonNull
    public d U() {
        return f103871h[nGetActiveFeatureLevel(getNativeObject())];
    }

    @NonNull
    public a V() {
        return f103870g[(int) nGetBackend(getNativeObject())];
    }

    @p0
    public Camera W(@h int i10) {
        long jNGetCameraComponent = nGetCameraComponent(getNativeObject(), i10);
        if (jNGetCameraComponent == 0) {
            return null;
        }
        return new Camera(jNGetCameraComponent, i10);
    }

    @NonNull
    public c X() {
        if (this.f103873b == null) {
            this.f103873b = new c();
        }
        return this.f103873b;
    }

    @NonNull
    public EntityManager Y() {
        return this.f103877f;
    }

    public boolean Z(@NonNull String str) {
        if (f0(str)) {
            return nGetFeatureFlag(this.f103872a, str);
        }
        throw new IllegalArgumentException("The feature flag \"" + str + "\" doesn't exist");
    }

    @NonNull
    public LightManager a0() {
        return this.f103875d;
    }

    public long b0() {
        return nGetMaxStereoscopicEyes(getNativeObject());
    }

    @NonNull
    public RenderableManager c0() {
        return this.f103876e;
    }

    @NonNull
    public d d0() {
        return f103871h[nGetSupportedFeatureLevel(getNativeObject())];
    }

    @NonNull
    public TransformManager e0() {
        return this.f103874c;
    }

    public boolean f0(@NonNull String str) {
        return nHasFeatureFlag(this.f103872a, str);
    }

    public boolean g0() {
        return nIsAutomaticInstancingEnabled(getNativeObject());
    }

    @UsedByReflection("MaterialBuilder.java")
    public long getNativeJobSystem() {
        if (this.f103872a != 0) {
            return nGetJobSystem(getNativeObject());
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j10 = this.f103872a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    public boolean h0() {
        return nIsPaused(getNativeObject());
    }

    public boolean i0() {
        return this.f103872a != 0;
    }

    public boolean j0(@NonNull ColorGrading colorGrading) {
        return nIsValidColorGrading(getNativeObject(), colorGrading.v());
    }

    public boolean k0(@NonNull MaterialInstance materialInstance) {
        return nIsValidExpensiveMaterialInstance(getNativeObject(), materialInstance.h());
    }

    public boolean l0(@NonNull Fence fence) {
        return nIsValidFence(getNativeObject(), fence.b());
    }

    public boolean m0(@NonNull IndexBuffer indexBuffer) {
        return nIsValidIndexBuffer(getNativeObject(), indexBuffer.h());
    }

    public boolean n0(@NonNull IndirectLight indirectLight) {
        return nIsValidIndirectLight(getNativeObject(), indirectLight.q());
    }

    @NonNull
    public Camera o(@h int i10) {
        long jNCreateCamera = nCreateCamera(getNativeObject(), i10);
        if (jNCreateCamera != 0) {
            return new Camera(jNCreateCamera, i10);
        }
        throw new IllegalStateException("Couldn't create Camera");
    }

    public boolean o0(@NonNull Material material) {
        return nIsValidMaterial(getNativeObject(), material.m());
    }

    @NonNull
    public Fence p() {
        long jNCreateFence = nCreateFence(getNativeObject());
        if (jNCreateFence != 0) {
            return new Fence(jNCreateFence);
        }
        throw new IllegalStateException("Couldn't create Fence");
    }

    public boolean p0(@NonNull Material material, MaterialInstance materialInstance) {
        return nIsValidMaterialInstance(getNativeObject(), material.m(), materialInstance.h());
    }

    @NonNull
    public Renderer q() {
        long jNCreateRenderer = nCreateRenderer(getNativeObject());
        if (jNCreateRenderer != 0) {
            return new Renderer(this, jNCreateRenderer);
        }
        throw new IllegalStateException("Couldn't create Renderer");
    }

    public boolean q0(@NonNull RenderTarget renderTarget) {
        return nIsValidRenderTarget(getNativeObject(), renderTarget.m());
    }

    @NonNull
    public Scene r() {
        long jNCreateScene = nCreateScene(getNativeObject());
        if (jNCreateScene != 0) {
            return new Scene(jNCreateScene);
        }
        throw new IllegalStateException("Couldn't create Scene");
    }

    public boolean r0(@NonNull Renderer renderer) {
        return nIsValidRenderer(getNativeObject(), renderer.i());
    }

    @NonNull
    public SwapChain s(int i10, int i11, long j10) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        long jNCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i10, i11, j10);
        if (jNCreateSwapChainHeadless != 0) {
            return new SwapChain(jNCreateSwapChainHeadless, null);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    public boolean s0(@NonNull Scene scene) {
        return nIsValidScene(getNativeObject(), scene.j());
    }

    @NonNull
    public SwapChain t(@NonNull Object obj) {
        return u(obj, 0L);
    }

    public boolean t0(@NonNull SkinningBuffer skinningBuffer) {
        return nIsValidSkinningBuffer(getNativeObject(), skinningBuffer.h());
    }

    @NonNull
    public SwapChain u(@NonNull Object obj, long j10) {
        if (n.a().j(obj)) {
            long jNCreateSwapChain = nCreateSwapChain(getNativeObject(), obj, j10);
            if (jNCreateSwapChain != 0) {
                return new SwapChain(jNCreateSwapChain, obj);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid surface " + obj);
    }

    public boolean u0(@NonNull Skybox skybox) {
        return nIsValidSkybox(getNativeObject(), skybox.k());
    }

    @NonNull
    public SwapChain v(@NonNull NativeSurface nativeSurface, long j10) {
        long jNCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(getNativeObject(), nativeSurface.c(), j10);
        if (jNCreateSwapChainFromRawPointer != 0) {
            return new SwapChain(jNCreateSwapChainFromRawPointer, nativeSurface);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    public boolean v0(@NonNull Stream stream) {
        return nIsValidStream(getNativeObject(), stream.h());
    }

    @NonNull
    public View w() {
        long jNCreateView = nCreateView(getNativeObject());
        if (jNCreateView != 0) {
            return new View(jNCreateView);
        }
        throw new IllegalStateException("Couldn't create View");
    }

    public boolean w0(@NonNull SwapChain swapChain) {
        return nIsValidSwapChain(getNativeObject(), swapChain.b());
    }

    public void x() {
        nDestroyEngine(getNativeObject());
        k();
    }

    public boolean x0(@NonNull Texture texture) {
        return nIsValidTexture(getNativeObject(), texture.getNativeObject());
    }

    public void y(@h int i10) {
        nDestroyCameraComponent(getNativeObject(), i10);
    }

    public boolean y0(@NonNull VertexBuffer vertexBuffer) {
        return nIsValidVertexBuffer(getNativeObject(), vertexBuffer.j());
    }

    public void z(@NonNull ColorGrading colorGrading) {
        j(nDestroyColorGrading(getNativeObject(), colorGrading.v()));
        colorGrading.u();
    }

    public boolean z0(@NonNull View view) {
        return nIsValidView(getNativeObject(), view.s());
    }

    private Engine(long j10, c cVar) {
        this.f103872a = j10;
        this.f103874c = new TransformManager(nGetTransformManager(j10));
        this.f103875d = new LightManager(nGetLightManager(j10));
        this.f103876e = new RenderableManager(nGetRenderableManager(j10));
        this.f103877f = new EntityManager(nGetEntityManager(j10));
        this.f103873b = cVar;
    }
}
