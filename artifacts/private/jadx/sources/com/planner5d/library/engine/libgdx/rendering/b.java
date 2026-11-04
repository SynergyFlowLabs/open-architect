package com.planner5d.library.engine.libgdx.rendering;

import ac.j;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.badlogic.gdx.graphics.g3d.g;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class b implements j<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f160800a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.model.c[] f160801b = {null, null, null};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f160802c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f160803d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.a f160804e = null;

    b() {
    }

    @Override // ac.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g l0() {
        if (this.f160800a != null) {
            m mVarA = this.f160804e.a(this.f160802c);
            Objects.requireNonNull(mVarA);
            m mVar = this.f160802c;
            gc.d.f(mVarA.y0(mVar.f180482a, mVar.f180484c, mVar.f180483b));
            if (!this.f160803d.equals(this.f160802c)) {
                this.f160803d.A0(this.f160802c);
                d0 d0Var = this.f160801b[0].f94443d;
                m mVar2 = this.f160802c;
                d0Var.y0(0.0f, mVar2.f180483b, mVar2.f180484c);
                d0 d0Var2 = this.f160801b[1].f94443d;
                m mVar3 = this.f160802c;
                d0Var2.y0(mVar3.f180482a, 0.0f, mVar3.f180484c);
                d0 d0Var3 = this.f160801b[2].f94443d;
                m mVar4 = this.f160802c;
                d0Var3.y0(mVar4.f180482a, mVar4.f180483b, 0.0f);
                for (com.badlogic.gdx.graphics.g3d.model.c cVar : this.f160801b) {
                    cVar.f(false);
                }
            }
        }
        return this.f160800a;
    }

    @Override // gc.e
    public void dispose() {
        this.f160804e = null;
        g gVar = this.f160800a;
        if (gVar != null) {
            gVar.f94417d.dispose();
            this.f160800a = null;
        }
    }

    @Override // ac.j
    @m1
    public void z0(com.planner5d.library.engine.a aVar, @p0 j.a aVar2, @NonNull k kVar, @NonNull dc.d<cc.a> dVar) {
        if (aVar2 != null) {
            this.f160804e = aVar2;
            cc.a aVarA = dVar.e(gc.d.e(new k(kVar))).a(aVar);
            if (!(aVarA instanceof com.planner5d.library.engine.libgdx.rendering.model.d)) {
                throw new RuntimeException();
            }
            g gVarY = ((com.planner5d.library.engine.libgdx.rendering.model.d) aVarA).Y();
            this.f160800a = gVarY;
            this.f160801b[0] = gVarY.y("axisX");
            this.f160801b[1] = this.f160800a.y("axisY");
            this.f160801b[2] = this.f160800a.y("axisZ");
            this.f160803d.E0();
        }
    }
}
