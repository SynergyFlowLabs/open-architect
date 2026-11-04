package yb;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nLibGdxTexturePreviewApplicationListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LibGdxTexturePreviewApplicationListener.kt\ncom/planner5d/library/engine/libgdx/LibGdxTexturePreviewApplicationListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1863#2,2:183\n1863#2,2:185\n1863#2,2:188\n1#3:187\n*S KotlinDebug\n*F\n+ 1 LibGdxTexturePreviewApplicationListener.kt\ncom/planner5d/library/engine/libgdx/LibGdxTexturePreviewApplicationListener\n*L\n57#1:183,2\n140#1:185,2\n68#1:188,2\n*E\n"})
public final class n implements com.planner5d.library.engine.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f395352m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f395353n = "preview_material_id";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f395354o = 16640;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f395355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final gc.g f395356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f395357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f395358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f395359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f395360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f395361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.badlogic.gdx.graphics.g3d.g f395362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.engine.o.a, com.badlogic.gdx.graphics.g3d.g> f395363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<gc.e> f395364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private com.badlogic.gdx.graphics.g3d.attributes.k f395365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f395366l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(@NotNull Context context, @NotNull gc.g errorHandler, @NotNull final Function0<? extends com.planner5d.library.engine.a> application) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f395355a = context;
        this.f395356b = errorHandler;
        this.f395357c = g0.c(new Function0() { // from class: yb.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.q(application);
            }
        });
        this.f395358d = g0.c(new Function0() { // from class: yb.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.z(this.f395350a);
            }
        });
        this.f395359e = g0.c(new Function0() { // from class: yb.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.u(this.f395351a);
            }
        });
        this.f395360f = g0.c(new Function0() { // from class: yb.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.x();
            }
        });
        this.f395361g = g0.c(new Function0() { // from class: yb.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.H();
            }
        });
        this.f395363i = new LinkedHashMap();
        this.f395364j = new ArrayList();
        int i10 = 7 | 0;
        this.f395365k = new com.badlogic.gdx.graphics.g3d.attributes.k(null, 1.0f, Float.valueOf(0.0f));
        this.f395366l = 1.0f;
    }

    private final com.planner5d.library.engine.a A() {
        return (com.planner5d.library.engine.a) this.f395357c.getValue();
    }

    private final com.badlogic.gdx.graphics.g3d.f B() {
        return (com.badlogic.gdx.graphics.g3d.f) this.f395359e.getValue();
    }

    private final com.planner5d.library.engine.libgdx.rendering.graphics.d C() {
        return (com.planner5d.library.engine.libgdx.rendering.graphics.d) this.f395360f.getValue();
    }

    private final com.badlogic.gdx.graphics.g3d.c E() {
        return (com.badlogic.gdx.graphics.g3d.c) this.f395358d.getValue();
    }

    private final com.badlogic.gdx.graphics.g3d.d G() {
        return (com.badlogic.gdx.graphics.g3d.d) this.f395361g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.badlogic.gdx.graphics.g3d.d H() {
        return new com.badlogic.gdx.graphics.g3d.d(f395353n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(n nVar) {
        Iterator<T> it = nVar.f395363i.values().iterator();
        while (it.hasNext()) {
            ((com.badlogic.gdx.graphics.g3d.g) it.next()).f94418e.d0(0.0f, 1.0f, 0.0f, nVar.f395366l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(n nVar, Bitmap bitmap) {
        nVar.N(bitmap != null ? com.planner5d.library.engine.libgdx.rendering.model.managing.h.a(nVar.A(), bitmap) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(n nVar, com.planner5d.library.engine.o.a aVar) {
        nVar.f395362h = nVar.f395363i.get(aVar);
    }

    private final void N(com.badlogic.gdx.graphics.k kVar) {
        com.badlogic.gdx.graphics.k kVar2 = (com.badlogic.gdx.graphics.k) this.f395365k.f94361d.f94685a;
        if (kVar2 != null) {
            this.f395364j.remove(kVar2);
            kVar2.dispose();
        }
        if (kVar == null) {
            kVar = com.planner5d.library.engine.libgdx.rendering.model.managing.h.b(A(), -16777216);
        }
        com.badlogic.gdx.graphics.k kVar3 = kVar;
        com.badlogic.gdx.graphics.g3d.attributes.k kVar4 = this.f395365k;
        P(new com.badlogic.gdx.graphics.g3d.attributes.k(kVar3, kVar4.f94369p2, Float.valueOf(kVar4.H1), Float.valueOf(this.f395365k.f94367g3), Float.valueOf(this.f395365k.f94368h3)));
        this.f395364j.add(kVar3);
    }

    private final void P(com.badlogic.gdx.graphics.g3d.attributes.k kVar) {
        this.f395365k = kVar;
        Iterator<T> it = this.f395363i.values().iterator();
        while (it.hasNext()) {
            com.badlogic.gdx.graphics.g3d.d dVarD = ((com.badlogic.gdx.graphics.g3d.g) it.next()).d(f395353n);
            if (dVarD != null) {
                dVarD.h2(kVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(n nVar, float f10) {
        com.badlogic.gdx.graphics.g3d.attributes.k kVar = nVar.f395365k;
        nVar.P(new com.badlogic.gdx.graphics.g3d.attributes.k(kVar, kVar.f94369p2, f10, kVar.f94367g3, kVar.f94368h3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(n nVar, float f10) {
        com.badlogic.gdx.graphics.g3d.attributes.k kVar = nVar.f395365k;
        nVar.P(new com.badlogic.gdx.graphics.g3d.attributes.k(kVar, f10 / 100.0f, kVar.H1, kVar.f94367g3, kVar.f94368h3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.engine.a q(Function0 function0) {
        return (com.planner5d.library.engine.a) function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.a u(n nVar) {
        com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.a aVar = new com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.a(nVar.f395355a, nVar.A(), nVar.f395356b);
        nVar.f395364j.add(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.engine.libgdx.rendering.graphics.d x() {
        com.planner5d.library.engine.libgdx.rendering.graphics.d dVar = new com.planner5d.library.engine.libgdx.rendering.graphics.d(new com.planner5d.library.engine.libgdx.rendering.graphics.i());
        dVar.e(67.0f);
        dVar.getPosition().y0(8.0f, 8.0f, 8.0f);
        dVar.P1(0.0f, 0.0f, 0.0f);
        return dVar;
    }

    private final void y(com.planner5d.library.engine.o.a aVar, com.badlogic.gdx.graphics.g3d.e eVar) {
        this.f395363i.put(aVar, new com.badlogic.gdx.graphics.g3d.g(eVar));
        this.f395364j.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.b z(n nVar) {
        com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.b bVar = new com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.b(nVar.A(), false, nVar.f395356b);
        bVar.h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94316s, 0.4f, 0.4f, 0.4f, 1.0f));
        bVar.r2(new com.badlogic.gdx.graphics.g3d.environment.c().f(0.8f, 0.8f, 0.8f, -1.0f, -0.8f, -0.2f));
        return bVar;
    }

    @NotNull
    public final Context D() {
        return this.f395355a;
    }

    @NotNull
    public final gc.g F() {
        return this.f395356b;
    }

    @Override // com.planner5d.library.engine.o
    public void F0(final float f10) {
        A().i(new Runnable() { // from class: yb.g
            @Override // java.lang.Runnable
            public final void run() {
                n.Q(this.f395346a, f10);
            }
        });
    }

    @Override // com.planner5d.library.engine.o
    public void L1(@Nullable final Bitmap bitmap) {
        A().i(new Runnable() { // from class: yb.e
            @Override // java.lang.Runnable
            public final void run() {
                n.J(this.f395342a, bitmap);
            }
        });
    }

    @Override // com.planner5d.library.engine.o
    public void T(final float f10) {
        A().i(new Runnable() { // from class: yb.f
            @Override // java.lang.Runnable
            public final void run() {
                n.X(this.f395344a, f10);
            }
        });
    }

    @Override // com.planner5d.library.engine.b
    public void c(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        C().b2(i10);
        C().R1(i11);
        C().L1();
    }

    @Override // com.planner5d.library.engine.o
    public void c1(@NotNull final com.planner5d.library.engine.o.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        A().i(new Runnable() { // from class: yb.d
            @Override // java.lang.Runnable
            public final void run() {
                n.K(this.f395340a, type);
            }
        });
    }

    @Override // com.planner5d.library.engine.o
    public void d(float f10) {
        if (this.f395366l == f10) {
            return;
        }
        this.f395366l = f10;
        A().i(new Runnable() { // from class: yb.h
            @Override // java.lang.Runnable
            public final void run() {
                n.I(this.f395348a);
            }
        });
    }

    @Override // com.planner5d.library.engine.b, gc.e
    public void dispose() {
        Iterator<T> it = this.f395364j.iterator();
        while (it.hasNext()) {
            ((gc.e) it.next()).dispose();
        }
    }

    @Override // com.planner5d.library.engine.b
    public void k() {
        com.badlogic.gdx.graphics.g3d.utils.h hVar = new com.badlogic.gdx.graphics.g3d.utils.h(A());
        com.planner5d.library.engine.o.a aVar = com.planner5d.library.engine.o.a.CUBE;
        com.badlogic.gdx.graphics.g3d.e eVarE = hVar.e(10.0f, 10.0f, 10.0f, G(), 25L);
        Intrinsics.checkNotNullExpressionValue(eVarE, "createBox(...)");
        y(aVar, eVarE);
        com.planner5d.library.engine.o.a aVar2 = com.planner5d.library.engine.o.a.GRID;
        com.badlogic.gdx.graphics.g3d.e eVarE2 = hVar.e(10.0f, 10.0f, 1.0f, G(), 25L);
        Intrinsics.checkNotNullExpressionValue(eVarE2, "createBox(...)");
        y(aVar2, eVarE2);
        com.planner5d.library.engine.o.a aVar3 = com.planner5d.library.engine.o.a.SPHERE;
        com.badlogic.gdx.graphics.g3d.e eVarU = hVar.u(10.0f, 10.0f, 10.0f, 20, 20, G(), 25L);
        Intrinsics.checkNotNullExpressionValue(eVarU, "createSphere(...)");
        y(aVar3, eVarU);
        N(null);
        this.f395362h = this.f395363i.get(aVar);
    }

    @Override // com.planner5d.library.engine.b
    public void n1() {
        GLES20.glClear(f395354o);
        GLES20.glClearColor(0.9f, 0.9f, 0.9f, 1.0f);
        com.badlogic.gdx.graphics.g3d.g gVar = this.f395362h;
        if (gVar != null) {
            B().f(C());
            B().q(gVar, E());
            B().end();
        }
    }

    @Override // com.planner5d.library.engine.m
    public void p() {
    }

    @Override // com.planner5d.library.engine.m
    public void pause() {
    }
}
