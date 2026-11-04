package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import com.google.android.material.color.utilities.u5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u5 f112066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, com.google.android.material.color.utilities.j> f112067b;

    static {
        u5 u5Var = new u5();
        f112066a = u5Var;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(r6.a.e.Db), u5Var.P2());
        map.put(Integer.valueOf(r6.a.e.f359990sb), u5Var.y2());
        map.put(Integer.valueOf(r6.a.e.Fb), u5Var.p2());
        map.put(Integer.valueOf(r6.a.e.Eb), u5Var.Q2());
        map.put(Integer.valueOf(r6.a.e.f360005tb), u5Var.z2());
        map.put(Integer.valueOf(r6.a.e.Ib), u5Var.V2());
        map.put(Integer.valueOf(r6.a.e.f360020ub), u5Var.C2());
        map.put(Integer.valueOf(r6.a.e.Jb), u5Var.W2());
        map.put(Integer.valueOf(r6.a.e.f360035vb), u5Var.D2());
        map.put(Integer.valueOf(r6.a.e.Wb), u5Var.l3());
        map.put(Integer.valueOf(r6.a.e.f360095zb), u5Var.I2());
        map.put(Integer.valueOf(r6.a.e.Xb), u5Var.m3());
        map.put(Integer.valueOf(r6.a.e.Ab), u5Var.J2());
        map.put(Integer.valueOf(r6.a.e.f359855jb), u5Var.g2());
        map.put(Integer.valueOf(r6.a.e.f359945pb), u5Var.v2());
        map.put(Integer.valueOf(r6.a.e.Mb), u5Var.b3());
        map.put(Integer.valueOf(r6.a.e.f360050wb), u5Var.G2());
        map.put(Integer.valueOf(r6.a.e.Vb), u5Var.k3());
        map.put(Integer.valueOf(r6.a.e.f360080yb), u5Var.H2());
        map.put(Integer.valueOf(r6.a.e.Ub), u5Var.q2());
        map.put(Integer.valueOf(r6.a.e.f360065xb), u5Var.o2());
        map.put(Integer.valueOf(r6.a.e.Nb), u5Var.c3());
        map.put(Integer.valueOf(r6.a.e.Tb), u5Var.i3());
        map.put(Integer.valueOf(r6.a.e.Ob), u5Var.d3());
        map.put(Integer.valueOf(r6.a.e.Rb), u5Var.g3());
        map.put(Integer.valueOf(r6.a.e.Pb), u5Var.e3());
        map.put(Integer.valueOf(r6.a.e.Sb), u5Var.h3());
        map.put(Integer.valueOf(r6.a.e.Qb), u5Var.f3());
        map.put(Integer.valueOf(r6.a.e.Bb), u5Var.M2());
        map.put(Integer.valueOf(r6.a.e.Cb), u5Var.N2());
        map.put(Integer.valueOf(r6.a.e.f359915nb), u5Var.k2());
        map.put(Integer.valueOf(r6.a.e.f359960qb), u5Var.w2());
        map.put(Integer.valueOf(r6.a.e.f359930ob), u5Var.l2());
        map.put(Integer.valueOf(r6.a.e.f359975rb), u5Var.x2());
        map.put(Integer.valueOf(r6.a.e.f359870kb), u5Var.h2());
        map.put(Integer.valueOf(r6.a.e.f359900mb), u5Var.j2());
        map.put(Integer.valueOf(r6.a.e.f359885lb), u5Var.i2());
        map.put(Integer.valueOf(r6.a.e.Zb), u5Var.r3());
        map.put(Integer.valueOf(r6.a.e.f359736bc), u5Var.t3());
        map.put(Integer.valueOf(r6.a.e.f359751cc), u5Var.u3());
        map.put(Integer.valueOf(r6.a.e.f359721ac), u5Var.s3());
        map.put(Integer.valueOf(r6.a.e.Yb), u5Var.q3());
        f112067b = Collections.unmodifiableMap(map);
    }

    private t() {
    }

    @NonNull
    public static Map<Integer, Integer> a(@NonNull com.google.android.material.color.utilities.k kVar) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, com.google.android.material.color.utilities.j> entry : f112067b.entrySet()) {
            map.put(entry.getKey(), Integer.valueOf(entry.getValue().h(kVar)));
        }
        return Collections.unmodifiableMap(map);
    }
}
