package com.nineoldandroids.animation;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends q {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final boolean f131222w3 = false;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final Map<String, com.nineoldandroids.util.d> f131223x3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private Object f131224t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private String f131225u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private com.nineoldandroids.util.d f131226v3;

    static {
        HashMap map = new HashMap();
        f131223x3 = map;
        map.put("alpha", m.f131227a);
        map.put("pivotX", m.f131228b);
        map.put("pivotY", m.f131229c);
        map.put("translationX", m.f131230d);
        map.put("translationY", m.f131231e);
        map.put(androidx.constraintlayout.motion.widget.f.f45124i, m.f131232f);
        map.put("rotationX", m.f131233g);
        map.put("rotationY", m.f131234h);
        map.put("scaleX", m.f131235i);
        map.put("scaleY", m.f131236j);
        map.put("scrollX", m.f131237k);
        map.put("scrollY", m.f131238l);
        map.put("x", m.f131239m);
        map.put("y", m.f131240n);
    }

    public l() {
    }

    public static <T> l t0(T t10, com.nineoldandroids.util.d<T, Float> dVar, float... fArr) {
        l lVar = new l(t10, dVar);
        lVar.h0(fArr);
        return lVar;
    }

    public static l u0(Object obj, String str, float... fArr) {
        l lVar = new l(obj, str);
        lVar.h0(fArr);
        return lVar;
    }

    public static <T> l v0(T t10, com.nineoldandroids.util.d<T, Integer> dVar, int... iArr) {
        l lVar = new l(t10, dVar);
        lVar.j0(iArr);
        return lVar;
    }

    public static l w0(Object obj, String str, int... iArr) {
        l lVar = new l(obj, str);
        lVar.j0(iArr);
        return lVar;
    }

    public static <T, V> l x0(T t10, com.nineoldandroids.util.d<T, V> dVar, p<V> pVar, V... vArr) {
        l lVar = new l(t10, dVar);
        lVar.k0(vArr);
        lVar.g0(pVar);
        return lVar;
    }

    public static l y0(Object obj, String str, p pVar, Object... objArr) {
        l lVar = new l(obj, str);
        lVar.k0(objArr);
        lVar.g0(pVar);
        return lVar;
    }

    public static l z0(Object obj, n... nVarArr) {
        l lVar = new l();
        lVar.f131224t3 = obj;
        lVar.n0(nVarArr);
        return lVar;
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public l k(long j10) {
        super.k(j10);
        return this;
    }

    public void B0(com.nineoldandroids.util.d dVar) {
        n[] nVarArr = this.f131297w;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String strF = nVar.f();
            nVar.w(dVar);
            this.X.remove(strF);
            this.X.put(this.f131225u3, nVar);
        }
        if (this.f131226v3 != null) {
            this.f131225u3 = dVar.b();
        }
        this.f131226v3 = dVar;
        this.f131290l = false;
    }

    public void C0(String str) {
        n[] nVarArr = this.f131297w;
        if (nVarArr != null) {
            n nVar = nVarArr[0];
            String strF = nVar.f();
            nVar.x(str);
            this.X.remove(strF);
            this.X.put(str, nVar);
        }
        this.f131225u3 = str;
        this.f131290l = false;
    }

    @Override // com.nineoldandroids.animation.q
    void F(float f10) {
        super.F(f10);
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].q(this.f131224t3);
        }
    }

    @Override // com.nineoldandroids.animation.q
    void W() {
        if (this.f131290l) {
            return;
        }
        if (this.f131226v3 == null && com.nineoldandroids.view.animation.a.f131306t && (this.f131224t3 instanceof View)) {
            Map<String, com.nineoldandroids.util.d> map = f131223x3;
            if (map.containsKey(this.f131225u3)) {
                B0(map.get(this.f131225u3));
            }
        }
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].C(this.f131224t3);
        }
        super.W();
    }

    @Override // com.nineoldandroids.animation.q
    public void h0(float... fArr) {
        n[] nVarArr = this.f131297w;
        if (nVarArr != null && nVarArr.length != 0) {
            super.h0(fArr);
            return;
        }
        com.nineoldandroids.util.d dVar = this.f131226v3;
        if (dVar != null) {
            n0(n.h(dVar, fArr));
        } else {
            n0(n.i(this.f131225u3, fArr));
        }
    }

    @Override // com.nineoldandroids.animation.q
    public void j0(int... iArr) {
        n[] nVarArr = this.f131297w;
        if (nVarArr != null && nVarArr.length != 0) {
            super.j0(iArr);
            return;
        }
        com.nineoldandroids.util.d dVar = this.f131226v3;
        if (dVar != null) {
            n0(n.j(dVar, iArr));
        } else {
            n0(n.k(this.f131225u3, iArr));
        }
    }

    @Override // com.nineoldandroids.animation.q
    public void k0(Object... objArr) {
        n[] nVarArr = this.f131297w;
        if (nVarArr != null && nVarArr.length != 0) {
            super.k0(objArr);
            return;
        }
        com.nineoldandroids.util.d dVar = this.f131226v3;
        if (dVar != null) {
            n0(n.o(dVar, null, objArr));
        } else {
            n0(n.p(this.f131225u3, null, objArr));
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void o(Object obj) {
        Object obj2 = this.f131224t3;
        if (obj2 != obj) {
            this.f131224t3 = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.f131290l = false;
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void p() {
        W();
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].z(this.f131224t3);
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void q() {
        W();
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].E(this.f131224t3);
        }
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public l clone() {
        return (l) super.clone();
    }

    @Override // com.nineoldandroids.animation.q, com.nineoldandroids.animation.a
    public void r() {
        super.r();
    }

    public String r0() {
        return this.f131225u3;
    }

    public Object s0() {
        return this.f131224t3;
    }

    @Override // com.nineoldandroids.animation.q
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f131224t3;
        if (this.f131297w != null) {
            for (int i10 = 0; i10 < this.f131297w.length; i10++) {
                str = str + "\n    " + this.f131297w[i10].toString();
            }
        }
        return str;
    }

    private l(Object obj, String str) {
        this.f131224t3 = obj;
        C0(str);
    }

    private <T> l(T t10, com.nineoldandroids.util.d<T, ?> dVar) {
        this.f131224t3 = t10;
        B0(dVar);
    }
}
