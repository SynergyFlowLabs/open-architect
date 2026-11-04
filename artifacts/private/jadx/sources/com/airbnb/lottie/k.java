package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.collection.j3;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<com.airbnb.lottie.model.layer.e>> f88300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, x0> f88301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f88302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.c> f88303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.airbnb.lottie.model.h> f88304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j3<com.airbnb.lottie.model.d> f88305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.collection.b1<com.airbnb.lottie.model.layer.e> f88306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<com.airbnb.lottie.model.layer.e> f88307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f88308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f88309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f88310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f88311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f88312o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f88298a = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f88299b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f88313p = 0;

    @Deprecated
    public static class b {

        private static final class a implements y0<k>, com.airbnb.lottie.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g1 f88314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f88315b;

            @Override // com.airbnb.lottie.y0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(k kVar) {
                if (this.f88315b) {
                    return;
                }
                this.f88314a.a(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f88315b = true;
            }

            private a(g1 g1Var) {
                this.f88315b = false;
                this.f88314a = g1Var;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, g1 g1Var) {
            a aVar = new a(g1Var);
            c0.u(context, str).d(aVar);
            return aVar;
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k b(Context context, String str) {
            return c0.w(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, g1 g1Var) {
            a aVar = new a(g1Var);
            c0.z(inputStream, null).d(aVar);
            return aVar;
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k d(InputStream inputStream) {
            return c0.B(inputStream, null).b();
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k e(InputStream inputStream, boolean z10) {
            if (z10) {
                com.airbnb.lottie.utils.d.e("Lottie now auto-closes input stream!");
            }
            return c0.B(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(com.airbnb.lottie.parser.moshi.c cVar, g1 g1Var) {
            a aVar = new a(g1Var);
            c0.D(cVar, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, g1 g1Var) {
            a aVar = new a(g1Var);
            c0.H(str, null).d(aVar);
            return aVar;
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return c0.J(jSONObject, null).b();
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k i(com.airbnb.lottie.parser.moshi.c cVar) {
            return c0.E(cVar, null).b();
        }

        @m1
        @androidx.annotation.p0
        @Deprecated
        public static k j(String str) {
            return c0.I(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @androidx.annotation.u0 int i10, g1 g1Var) {
            a aVar = new a(g1Var);
            c0.K(context, i10).d(aVar);
            return aVar;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.d.e(str);
        this.f88299b.add(str);
    }

    public Rect b() {
        return this.f88308k;
    }

    public j3<com.airbnb.lottie.model.d> c() {
        return this.f88305h;
    }

    public float d() {
        return (long) ((e() / this.f88311n) * 1000.0f);
    }

    public float e() {
        return this.f88310m - this.f88309l;
    }

    public float f() {
        return this.f88310m;
    }

    public Map<String, com.airbnb.lottie.model.c> g() {
        return this.f88303f;
    }

    public float h(float f10) {
        return com.airbnb.lottie.utils.i.k(this.f88309l, this.f88310m, f10);
    }

    public float i() {
        return this.f88311n;
    }

    public Map<String, x0> j() {
        float fE = com.airbnb.lottie.utils.j.e();
        if (fE != this.f88302e) {
            for (Map.Entry<String, x0> entry : this.f88301d.entrySet()) {
                this.f88301d.put(entry.getKey(), entry.getValue().a(this.f88302e / fE));
            }
        }
        this.f88302e = fE;
        return this.f88301d;
    }

    public List<com.airbnb.lottie.model.layer.e> k() {
        return this.f88307j;
    }

    @androidx.annotation.p0
    public com.airbnb.lottie.model.h l(String str) {
        int size = this.f88304g.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.airbnb.lottie.model.h hVar = this.f88304g.get(i10);
            if (hVar.d(str)) {
                return hVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.h> m() {
        return this.f88304g;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public int n() {
        return this.f88313p;
    }

    public h1 o() {
        return this.f88298a;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.p0
    public List<com.airbnb.lottie.model.layer.e> p(String str) {
        return this.f88300c.get(str);
    }

    public float q(float f10) {
        float f11 = this.f88309l;
        return (f10 - f11) / (this.f88310m - f11);
    }

    public float r() {
        return this.f88309l;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f88299b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public boolean t() {
        return this.f88312o;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.airbnb.lottie.model.layer.e> it = this.f88307j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public boolean u() {
        return !this.f88301d.isEmpty();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void v(int i10) {
        this.f88313p += i10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void w(Rect rect, float f10, float f11, float f12, List<com.airbnb.lottie.model.layer.e> list, androidx.collection.b1<com.airbnb.lottie.model.layer.e> b1Var, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, x0> map2, float f13, j3<com.airbnb.lottie.model.d> j3Var, Map<String, com.airbnb.lottie.model.c> map3, List<com.airbnb.lottie.model.h> list2) {
        this.f88308k = rect;
        this.f88309l = f10;
        this.f88310m = f11;
        this.f88311n = f12;
        this.f88307j = list;
        this.f88306i = b1Var;
        this.f88300c = map;
        this.f88301d = map2;
        this.f88302e = f13;
        this.f88305h = j3Var;
        this.f88303f = map3;
        this.f88304g = list2;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public com.airbnb.lottie.model.layer.e x(long j10) {
        return this.f88306i.g(j10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void y(boolean z10) {
        this.f88312o = z10;
    }

    public void z(boolean z10) {
        this.f88298a.g(z10);
    }
}
