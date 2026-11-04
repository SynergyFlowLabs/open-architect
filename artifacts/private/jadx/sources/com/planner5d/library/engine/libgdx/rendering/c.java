package com.planner5d.library.engine.libgdx.rendering;

import ac.e;
import ac.h;
import ac.j;
import ac.m;
import ac.n;
import android.content.Context;
import android.opengl.GLES20;
import com.badlogic.gdx.graphics.g3d.f;
import com.badlogic.gdx.graphics.g3d.i;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.v;
import com.badlogic.gdx.utils.w0;
import gc.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nLibGdxRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LibGdxRenderer.kt\ncom/planner5d/library/engine/libgdx/rendering/LibGdxRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
public final class c implements e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f160805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f160806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f160807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.c f160808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ac.b<i> f160809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.rendering.util.b f160810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m<i> f160811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final j<com.badlogic.gdx.graphics.g3d.g> f160812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f160813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final v f160814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f160815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private com.badlogic.gdx.graphics.glutils.c f160816l;

    public c(@NotNull g errorHandler, @NotNull f batch, int i10, @NotNull com.badlogic.gdx.graphics.g3d.c environment, @NotNull ac.b<i> gridScaleResetter, @NotNull com.planner5d.library.engine.rendering.util.b scaler, @NotNull m<i> transparentWallsRenderer, @NotNull j<com.badlogic.gdx.graphics.g3d.g> targetLinesProvider) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(batch, "batch");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(gridScaleResetter, "gridScaleResetter");
        Intrinsics.checkNotNullParameter(scaler, "scaler");
        Intrinsics.checkNotNullParameter(transparentWallsRenderer, "transparentWallsRenderer");
        Intrinsics.checkNotNullParameter(targetLinesProvider, "targetLinesProvider");
        this.f160805a = errorHandler;
        this.f160806b = batch;
        this.f160807c = i10;
        this.f160808d = environment;
        this.f160809e = gridScaleResetter;
        this.f160810f = scaler;
        this.f160811g = transparentWallsRenderer;
        this.f160812h = targetLinesProvider;
        this.f160813i = new Object();
        this.f160814j = new v();
    }

    private final void f(com.planner5d.library.engine.g gVar, n nVar, ac.c<i> cVar) {
        for (int[] iArr : cVar.b()) {
            for (int i10 : iArr) {
                h(gVar, nVar, cVar, i10);
            }
        }
    }

    private final void g(com.planner5d.library.engine.g gVar, n nVar, ac.d<i>[] dVarArr, com.badlogic.gdx.graphics.g3d.c cVar) {
        v vVar = (v) dVarArr[0].C0(this.f160814j);
        if (vVar != null) {
            d0 d0Var = vVar.f95099a;
            if (d0Var.f180482a == 0.0f && d0Var.f180483b == 1.0f && d0Var.f180484c == 0.0f && gVar.getPosition().f180483b < this.f160810f.a(vVar.f95100b)) {
                int length = dVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i10 = length - 1;
                    ac.d<i> dVar = dVarArr[length];
                    j(gVar, nVar, dVar, dVar.u0(), cVar);
                    if (i10 < 0) {
                        return;
                    } else {
                        length = i10;
                    }
                }
            }
        }
        for (ac.d<i> dVar2 : dVarArr) {
            j(gVar, nVar, dVar2, dVar2.u0(), cVar);
        }
    }

    private final void h(com.planner5d.library.engine.g gVar, n nVar, ac.c<i> cVar, int i10) {
        g(gVar, nVar, cVar.f()[i10], this.f160808d);
        g(gVar, nVar, cVar.e()[i10], null);
    }

    private final void i(com.planner5d.library.engine.g gVar, n nVar, ac.c<i> cVar, boolean z10) {
        for (ac.d<i> dVar : cVar.d()) {
            j(gVar, nVar, dVar, z10 ? dVar.B0() : dVar.x0(), this.f160808d);
        }
    }

    private final void j(com.planner5d.library.engine.g gVar, n nVar, ac.d<i> dVar, i iVar, com.badlogic.gdx.graphics.g3d.c cVar) {
        if ((((nVar == null || !nVar.c()) && dVar.v0()) || !gVar.W1().b(dVar.getBounds())) && !dVar.D0()) {
            return;
        }
        if (dVar.D0() && !dVar.E0()) {
            if (nVar == null || !nVar.a()) {
                return;
            }
            if (nVar != null) {
                this.f160809e.a(nVar, dVar);
            }
        }
        this.f160806b.q(iVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k(f fVar, com.planner5d.library.engine.g gVar, n nVar, ac.d<i>[] dVarArr) {
        if (fVar != 0) {
            boolean z10 = fVar instanceof ac.g;
            ac.g gVar2 = z10 ? (ac.g) fVar : null;
            if (gVar2 == null || !gVar2.D(gVar)) {
                return;
            }
            gc.e eVar = this.f160806b;
            Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type com.planner5d.library.engine.rendering.Batch");
            ((ac.a) eVar).s0(z10 ? (ac.g) fVar : null);
            fVar.f(gVar);
            GLES20.glClear(this.f160807c);
            for (ac.d<i> dVar : dVarArr) {
                if (dVar.w0() || (nVar != null && nVar.c() && (dVar.z0() || dVar.y0()))) {
                    cc.c cVarK = dVar.k();
                    Intrinsics.checkNotNull(cVarK, "null cannot be cast to non-null type com.badlogic.gdx.graphics.g3d.RenderableProvider");
                    fVar.q((i) cVarK, null);
                }
            }
            fVar.end();
        }
    }

    @Override // ac.e
    public void a(@NotNull Context context, @Nullable ac.i iVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.f160813i) {
            try {
                if (this.f160815k) {
                    this.f160815k = false;
                    Unit unit = Unit.f312394a;
                    try {
                        Object obj = this.f160808d;
                        h hVar = obj instanceof h ? (h) obj : null;
                        if (hVar != null) {
                            hVar.X0(context, iVar);
                        }
                    } catch (Exception e10) {
                        this.f160805a.b(e10);
                    }
                    this.f160806b.j().dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ac.e
    @NotNull
    public byte[] b(int i10, int i11) {
        byte[] bArrA = w0.a(0, 0, i10, i11, true);
        com.badlogic.gdx.graphics.glutils.c cVar = this.f160816l;
        if (cVar != null) {
            cVar.end();
            cVar.dispose();
        }
        this.f160816l = null;
        Intrinsics.checkNotNull(bArrA);
        return bArrA;
    }

    @Override // ac.e
    public void c(@NotNull com.planner5d.library.engine.a application, int i10, int i11) {
        Intrinsics.checkNotNullParameter(application, "application");
        com.badlogic.gdx.graphics.glutils.c cVar = this.f160816l;
        if (cVar != null) {
            cVar.end();
            cVar.dispose();
        }
        com.badlogic.gdx.graphics.glutils.c cVar2 = new com.badlogic.gdx.graphics.glutils.c(application, com.badlogic.gdx.graphics.i.c.RGB888, i10, i11, true);
        this.f160816l = cVar2;
        cVar2.s();
        GLES20.glEnable(2929);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(this.f160807c);
    }

    @Override // ac.e
    public void d() {
        synchronized (this.f160813i) {
            try {
                this.f160815k = true;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ac.e
    public void e(@NotNull com.planner5d.library.engine.g camera, @Nullable n nVar, @NotNull ac.c<i> renderData, @Nullable ac.d<i> dVar) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(renderData, "renderData");
        Object obj = this.f160808d;
        h hVar = obj instanceof h ? (h) obj : null;
        Object objE0 = hVar != null ? hVar.e0() : null;
        k(objE0 instanceof f ? (f) objE0 : null, camera, nVar, renderData.a());
        GLES20.glClear(this.f160807c);
        this.f160811g.a(nVar, camera, renderData);
        this.f160806b.f(camera);
        try {
            gc.e eVar = this.f160806b;
            com.planner5d.library.engine.rendering.util.d dVar2 = eVar instanceof com.planner5d.library.engine.rendering.util.d ? (com.planner5d.library.engine.rendering.util.d) eVar : null;
            if (dVar2 != null) {
                dVar2.e(com.planner5d.library.engine.rendering.util.c.ByShader);
            }
            if (dVar != null) {
                f fVar = this.f160806b;
                cc.c cVarK = dVar.k();
                Intrinsics.checkNotNull(cVarK, "null cannot be cast to non-null type com.badlogic.gdx.graphics.g3d.RenderableProvider");
                fVar.q((i) cVarK, null);
            }
            com.badlogic.gdx.graphics.g3d.g gVarL0 = this.f160812h.l0();
            if (gVarL0 != null && nVar != null && nVar.f()) {
                this.f160806b.q(gVarL0, null);
            }
            i(camera, nVar, renderData, false);
            this.f160806b.end();
            this.f160806b.f(camera);
            try {
                gc.e eVar2 = this.f160806b;
                com.planner5d.library.engine.rendering.util.d dVar3 = eVar2 instanceof com.planner5d.library.engine.rendering.util.d ? (com.planner5d.library.engine.rendering.util.d) eVar2 : null;
                if (dVar3 != null) {
                    dVar3.e(com.planner5d.library.engine.rendering.util.c.None);
                }
                f(camera, nVar, renderData);
                this.f160806b.end();
                this.f160806b.f(camera);
                try {
                    gc.e eVar3 = this.f160806b;
                    com.planner5d.library.engine.rendering.util.d dVar4 = eVar3 instanceof com.planner5d.library.engine.rendering.util.d ? (com.planner5d.library.engine.rendering.util.d) eVar3 : null;
                    if (dVar4 != null) {
                        dVar4.e(com.planner5d.library.engine.rendering.util.c.Blended);
                    }
                    i(camera, nVar, renderData, true);
                    this.f160806b.end();
                } catch (Throwable th2) {
                    this.f160806b.end();
                    throw th2;
                }
            } catch (Throwable th3) {
                this.f160806b.end();
                throw th3;
            }
        } catch (Throwable th4) {
            this.f160806b.end();
            throw th4;
        }
    }
}
