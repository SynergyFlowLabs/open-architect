package com.planner5d.library.engine.libgdx.rendering.util;

import androidx.annotation.NonNull;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.v;
import com.planner5d.library.engine.rendering.util.e;
import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.planner5d.library.engine.rendering.util.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v f160982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f160983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f160984l;

    /* JADX INFO: renamed from: com.planner5d.library.engine.libgdx.rendering.util.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1546a {
    }

    public a(float f10, int i10) {
        this(new v(d0.f94931f, f10), i10);
    }

    private v e(v vVar) {
        m mVar = new m(vVar.f95099a);
        float f10 = vVar.f95100b;
        if (f10 < 0.0f) {
            mVar.v0(-1.0f);
            f10 *= -1.0f;
        }
        mVar.f180482a = Math.round(mVar.f180482a * 100000.0f) / 100000.0f;
        mVar.f180483b = Math.round(mVar.f180483b * 100000.0f) / 100000.0f;
        mVar.f180484c = Math.round(mVar.f180484c * 100000.0f) / 100000.0f;
        if (Math.abs(mVar.f180482a) < 1.0E-5d) {
            mVar.f180482a = 0.0f;
        }
        if (Math.abs(mVar.f180483b) < 1.0E-5d) {
            mVar.f180483b = 0.0f;
        }
        if (Math.abs(mVar.f180484c) < 1.0E-5d) {
            mVar.f180484c = 0.0f;
        }
        return new v(t4.a.c(mVar), f10);
    }

    @Override // com.planner5d.library.engine.rendering.util.a
    public int a() {
        return this.f160984l;
    }

    @Override // com.planner5d.library.engine.rendering.util.a
    @NonNull
    public e b(@NonNull e eVar) {
        return d((v) eVar);
    }

    public v c() {
        return d(new v());
    }

    public v d(v vVar) {
        vVar.f95099a.L(this.f160982j.f95099a);
        vVar.f95100b = this.f160982j.f95100b;
        return vVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Math.abs(this.f160982j.f95100b - aVar.f160982j.f95100b) <= 1.0f && this.f160982j.f95099a.equals(aVar.f160982j.f95099a);
    }

    public int hashCode() {
        return this.f160983k;
    }

    public a(c cVar, k kVar, int i10) {
        this(new v(t4.a.a(cVar.e().f180480a + kVar.f180480a, 0.0f, cVar.e().f180481b + kVar.f180481b), t4.a.a(cVar.e().f180480a + cVar.b().f180480a + kVar.f180480a, 1.0f, cVar.e().f180481b + cVar.b().f180481b + kVar.f180481b), t4.a.a(cVar.c().f180480a + kVar.f180480a, 2.0f, cVar.c().f180481b + kVar.f180481b)), i10);
    }

    private a(v vVar, int i10) {
        v vVarE = e(vVar);
        this.f160982j = vVarE;
        this.f160984l = i10;
        this.f160983k = vVarE.f95099a.hashCode();
    }
}
