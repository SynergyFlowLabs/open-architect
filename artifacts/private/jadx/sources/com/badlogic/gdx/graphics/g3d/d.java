package com.badlogic.gdx.graphics.g3d;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.badlogic.gdx.graphics.g3d.attributes.k;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b implements bc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f94374g = new AtomicInteger();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.badlogic.gdx.graphics.g3d.attributes.d f94375h = new com.badlogic.gdx.graphics.g3d.attributes.d(com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.badlogic.gdx.graphics.g3d.attributes.g f94376i = com.badlogic.gdx.graphics.g3d.attributes.g.r(androidx.media3.exoplayer.analytics.b.f62814h0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.badlogic.gdx.graphics.g3d.attributes.g f94377j = com.badlogic.gdx.graphics.g3d.attributes.g.r(1029);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.badlogic.gdx.graphics.g3d.attributes.g f94378k = com.badlogic.gdx.graphics.g3d.attributes.g.r(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f94379l = new d(1.0f, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f94380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f94381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f94382f;

    public d() {
        this(1.0f, true);
    }

    @Override // bc.b
    public void D(@p0 Integer num) {
        if (num == null) {
            e2(com.badlogic.gdx.graphics.g3d.attributes.b.f94306f);
        } else {
            h2(com.badlogic.gdx.graphics.g3d.attributes.b.v(new com.badlogic.gdx.graphics.b(Color.red(num.intValue()) / 255.0f, Color.green(num.intValue()) / 255.0f, Color.blue(num.intValue()) / 255.0f, Color.alpha(num.intValue()) / 255.0f)));
        }
    }

    @Override // bc.b
    public void D1(@p0 Float f10) {
        if (f10 == null) {
            e2(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i);
        } else {
            h2(new com.badlogic.gdx.graphics.g3d.attributes.a(f10.floatValue()));
        }
    }

    @Override // bc.b
    public void F1(@NonNull com.planner5d.library.engine.rendering.util.g gVar) {
        k kVar;
        if (!y1() || (kVar = (k) W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k)) == null) {
            return;
        }
        h2(new k((com.badlogic.gdx.graphics.k) kVar.f94361d.f94685a, gVar));
    }

    @Override // bc.b
    public void H1(@p0 Boolean bool) {
        if (bool == null) {
            e2(com.badlogic.gdx.graphics.g3d.attributes.d.f94326i);
        } else if (bool.booleanValue()) {
            h2(new com.badlogic.gdx.graphics.g3d.attributes.d(bool.booleanValue()));
        } else {
            h2(f94375h);
        }
    }

    @Override // bc.b
    public void L0(@p0 String str, @p0 com.planner5d.library.engine.rendering.util.h hVar, @p0 com.planner5d.library.engine.rendering.util.g gVar) {
        com.badlogic.gdx.graphics.k kVar = (str == null || hVar == null) ? null : (com.badlogic.gdx.graphics.k) hVar.a(str);
        if (kVar == null || gVar == null) {
            e2(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k);
        } else {
            h2(new k(kVar, gVar));
        }
    }

    @Override // bc.b
    public void N(@p0 Object obj) {
        if (obj instanceof com.badlogic.gdx.graphics.c) {
            h2(new com.badlogic.gdx.graphics.g3d.attributes.c(com.badlogic.gdx.graphics.g3d.attributes.c.f94322f, (com.badlogic.gdx.graphics.c) obj));
        }
    }

    @Override // bc.b
    @p0
    public Float O0() {
        if (!f1()) {
            return null;
        }
        a aVarW1 = W1(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i);
        Objects.requireNonNull(aVarW1);
        return Float.valueOf(((com.badlogic.gdx.graphics.g3d.attributes.a) aVarW1).f94304g);
    }

    @Override // bc.b
    @p0
    public com.planner5d.library.engine.rendering.util.g Y0(@NonNull com.planner5d.library.engine.rendering.util.j jVar) {
        k kVar;
        if (!y1() || (kVar = (k) W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k)) == null) {
            return null;
        }
        return kVar.S(jVar);
    }

    @Override // bc.b
    public void Z0(boolean z10, boolean z11) {
        if (z10) {
            h2(f94378k);
        } else {
            h2(z11 ? f94376i : f94377j);
        }
    }

    @Override // bc.b
    public void c0(@p0 Integer num) {
        if (num == null) {
            e2(com.badlogic.gdx.graphics.g3d.attributes.b.f94310j);
        } else {
            h2(com.badlogic.gdx.graphics.g3d.attributes.b.s(new com.badlogic.gdx.graphics.b(Color.red(num.intValue()) / 255.0f, Color.green(num.intValue()) / 255.0f, Color.blue(num.intValue()) / 255.0f, Color.alpha(num.intValue()) / 255.0f)));
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.b, java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (obj == this) {
                return true;
            }
            if (((d) obj).f94382f.equals(this.f94382f) && super.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // bc.b
    public boolean f1() {
        return a2(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i);
    }

    @Override // bc.b
    @p0
    public String getName() {
        return this.f94382f;
    }

    @Override // bc.b
    public void h0() {
        if (y1()) {
            a aVarW1 = W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k);
            if (!(aVarW1 instanceof com.badlogic.gdx.graphics.g3d.attributes.j) || (aVarW1 instanceof k)) {
                return;
            }
            h2(new k((com.badlogic.gdx.graphics.g3d.attributes.j) aVarW1));
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.b
    public int hashCode() {
        return super.hashCode() + (this.f94382f.hashCode() * 3);
    }

    @Override // bc.b
    public void t0(float f10) {
        h2(com.badlogic.gdx.graphics.g3d.attributes.f.r(f10));
    }

    @Override // bc.b
    public void v0(float f10) {
        h2(com.badlogic.gdx.graphics.g3d.attributes.f.s(f10));
    }

    @Override // bc.b
    public boolean y1() {
        return a2(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k);
    }

    @Override // bc.b
    public boolean z1() {
        if (f1()) {
            a aVarW1 = W1(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i);
            Objects.requireNonNull(aVarW1);
            if (((com.badlogic.gdx.graphics.g3d.attributes.a) aVarW1).f94301d) {
                return true;
            }
        }
        return false;
    }

    public d(String str) {
        this(str, 1.0f, true);
    }

    public d(float f10, boolean z10) {
        this((String) null, f10, z10);
    }

    private d(String str, float f10, boolean z10) {
        if (str == null) {
            str = "mtl" + f94374g.getAndIncrement();
        }
        this.f94382f = str;
        this.f94380d = f10;
        this.f94381e = z10;
    }

    public d(a... aVarArr) {
        this();
        n2(aVarArr);
    }

    public d(d dVar) {
        this(dVar, dVar.f94380d, dVar.f94381e);
    }

    public d(d dVar, boolean z10) {
        this(dVar, 1.0f, z10);
    }

    public d(d dVar, float f10) {
        this(dVar, f10, true);
    }

    private d(d dVar, float f10, boolean z10) {
        this.f94382f = dVar.f94382f;
        this.f94380d = f10;
        this.f94381e = z10;
        Iterator<a> it = dVar.iterator();
        while (it.hasNext()) {
            h2(it.next().k());
        }
    }
}
