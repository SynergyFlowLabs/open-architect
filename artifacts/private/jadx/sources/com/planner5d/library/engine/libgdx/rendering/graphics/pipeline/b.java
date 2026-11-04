package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import ac.i;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.math.m;
import com.planner5d.library.services.exceptions.ErrorMessageException;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.badlogic.gdx.graphics.g3d.c implements gc.e, ac.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f160857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.engine.a f160858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gc.g f160859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.badlogic.gdx.graphics.g3d.environment.c f160860h;

    public b(com.planner5d.library.engine.a aVar, boolean z10, gc.g gVar) {
        this.f160858f = aVar;
        this.f160857e = z10;
        this.f160859g = gVar;
    }

    @Override // ac.h
    /* JADX INFO: renamed from: D2, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a e0() {
        return (com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a) this.f94373d;
    }

    @Override // ac.h
    public void U(@NonNull m mVar) {
        com.badlogic.gdx.graphics.g3d.environment.c cVar = this.f160860h;
        if (cVar != null) {
            cVar.f94392b.A0(mVar);
        }
    }

    @Override // ac.h
    public void W() {
        com.badlogic.gdx.graphics.g3d.environment.c cVar = new com.badlogic.gdx.graphics.g3d.environment.c();
        this.f160860h = cVar;
        cVar.f(0.5f, 0.5f, 0.5f, 0.0f, 1.0f, 0.0f);
        r2(this.f160860h);
    }

    @Override // ac.h
    public void X0(@NonNull Context context, @p0 i iVar) throws ErrorMessageException {
        if (this.f160857e) {
            com.badlogic.gdx.graphics.g3d.environment.f fVar = this.f94373d;
            this.f94373d = null;
            if (fVar != null) {
                ((com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a) fVar).dispose();
            }
            if (!i.None.equals(iVar)) {
                this.f94373d = new com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a(context, this.f160858f, iVar, this.f160859g);
            }
        }
    }

    @Override // gc.e
    public void dispose() {
        com.badlogic.gdx.graphics.g3d.environment.f fVar = this.f94373d;
        this.f94373d = null;
        if (fVar != null) {
            ((com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a) fVar).dispose();
        }
    }

    @Override // ac.h
    public void n0(float f10, float f11, float f12, float f13) {
        h2(new com.badlogic.gdx.graphics.g3d.attributes.b(com.badlogic.gdx.graphics.g3d.attributes.b.f94316s, f10, f11, f12, f13));
    }
}
