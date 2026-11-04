package com.google.gson;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.gson.internal.w f125296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w f125297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f125298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f125299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<c0> f125300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<c0> f125301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f125302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f125303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f125304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f125305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f125306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f125307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f125308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f125309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f125310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y f125311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f125312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a0 f125313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a0 f125314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque<x> f125315t;

    public g() {
        this.f125296a = com.google.gson.internal.w.f125528h;
        this.f125297b = w.f125637a;
        this.f125298c = c.f125252a;
        this.f125299d = new HashMap();
        this.f125300e = new ArrayList();
        this.f125301f = new ArrayList();
        this.f125302g = false;
        this.f125303h = f.H;
        this.f125304i = 2;
        this.f125305j = 2;
        this.f125306k = false;
        this.f125307l = false;
        this.f125308m = true;
        this.f125309n = f.B;
        this.f125310o = false;
        this.f125311p = f.A;
        this.f125312q = true;
        this.f125313r = f.J;
        this.f125314s = f.K;
        this.f125315t = new ArrayDeque<>();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    private static void d(String str, int i10, int i11, List<c0> list) {
        c0 c0VarB;
        c0 c0VarB2;
        boolean z10 = com.google.gson.internal.sql.d.f125517a;
        c0 c0VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            c0VarB = com.google.gson.internal.bind.c.b.f125332b.b(str);
            if (z10) {
                c0VarA = com.google.gson.internal.sql.d.f125519c.b(str);
                c0VarB2 = com.google.gson.internal.sql.d.f125518b.b(str);
            } else {
                c0VarB2 = null;
            }
            list.add(c0VarB);
            if (z10) {
                list.add(c0VarA);
                list.add(c0VarB2);
            }
        } else if (i10 != 2 || i11 != 2) {
            c0 c0VarA2 = com.google.gson.internal.bind.c.b.f125332b.a(i10, i11);
            if (z10) {
                c0VarA = com.google.gson.internal.sql.d.f125519c.a(i10, i11);
                c0 c0VarA3 = com.google.gson.internal.sql.d.f125518b.a(i10, i11);
                c0VarB = c0VarA2;
                c0VarB2 = c0VarA3;
            } else {
                c0VarB = c0VarA2;
                c0VarB2 = null;
            }
            list.add(c0VarB);
            if (z10) {
                list.add(c0VarA);
                list.add(c0VarB2);
            }
        }
    }

    private static int e(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            return i10;
        }
        throw new IllegalArgumentException("Invalid style: " + i10);
    }

    private static boolean n(Type type) {
        return type == Object.class;
    }

    @z7.a
    @z7.m(imports = {"com.google.gson.Strictness"}, replacement = "this.setStrictness(Strictness.LENIENT)")
    @Deprecated
    public g A() {
        return F(y.LENIENT);
    }

    @z7.a
    public g B(w wVar) {
        Objects.requireNonNull(wVar);
        this.f125297b = wVar;
        return this;
    }

    @z7.a
    public g C(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        this.f125314s = a0Var;
        return this;
    }

    @z7.a
    public g D(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        this.f125313r = a0Var;
        return this;
    }

    @z7.a
    public g E() {
        return z(e.f125261e);
    }

    @z7.a
    public g F(y yVar) {
        Objects.requireNonNull(yVar);
        this.f125311p = yVar;
        return this;
    }

    @z7.a
    public g G(double d10) {
        if (!Double.isNaN(d10) && d10 >= 0.0d) {
            this.f125296a = this.f125296a.l(d10);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d10);
    }

    @z7.a
    public g a(a aVar) {
        Objects.requireNonNull(aVar);
        this.f125296a = this.f125296a.j(aVar, false, true);
        return this;
    }

    @z7.a
    public g b(x xVar) {
        Objects.requireNonNull(xVar);
        this.f125315t.addFirst(xVar);
        return this;
    }

    @z7.a
    public g c(a aVar) {
        Objects.requireNonNull(aVar);
        this.f125296a = this.f125296a.j(aVar, true, false);
        return this;
    }

    public f f() {
        ArrayList arrayList = new ArrayList(this.f125300e.size() + this.f125301f.size() + 3);
        arrayList.addAll(this.f125300e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f125301f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        d(this.f125303h, this.f125304i, this.f125305j, arrayList);
        return new f(this.f125296a, this.f125298c, new HashMap(this.f125299d), this.f125302g, this.f125306k, this.f125310o, this.f125308m, this.f125309n, this.f125311p, this.f125307l, this.f125312q, this.f125297b, this.f125303h, this.f125304i, this.f125305j, new ArrayList(this.f125300e), new ArrayList(this.f125301f), arrayList, this.f125313r, this.f125314s, new ArrayList(this.f125315t));
    }

    @z7.a
    public g g() {
        this.f125308m = false;
        return this;
    }

    @z7.a
    public g h() {
        this.f125296a = this.f125296a.b();
        return this;
    }

    @z7.a
    public g i() {
        this.f125312q = false;
        return this;
    }

    @z7.a
    public g j() {
        this.f125306k = true;
        return this;
    }

    @z7.a
    public g k(int... iArr) {
        Objects.requireNonNull(iArr);
        this.f125296a = this.f125296a.k(iArr);
        return this;
    }

    @z7.a
    public g l() {
        this.f125296a = this.f125296a.e();
        return this;
    }

    @z7.a
    public g m() {
        this.f125310o = true;
        return this;
    }

    @z7.a
    public g o(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z10 = obj instanceof t;
        if (!z10 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof b0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (n(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof h) {
            this.f125299d.put(type, (h) obj);
        }
        if (z10 || (obj instanceof k)) {
            this.f125300e.add(com.google.gson.internal.bind.n.d(com.google.gson.reflect.a.get(type), obj));
        }
        if (obj instanceof b0) {
            this.f125300e.add(com.google.gson.internal.bind.p.a(com.google.gson.reflect.a.get(type), (b0) obj));
        }
        return this;
    }

    @z7.a
    public g p(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        this.f125300e.add(c0Var);
        return this;
    }

    @z7.a
    public g q(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(obj);
        boolean z10 = obj instanceof t;
        if (!z10 && !(obj instanceof k) && !(obj instanceof b0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if ((obj instanceof k) || z10) {
            this.f125301f.add(com.google.gson.internal.bind.n.e(cls, obj));
        }
        if (obj instanceof b0) {
            this.f125300e.add(com.google.gson.internal.bind.p.e(cls, (b0) obj));
        }
        return this;
    }

    @z7.a
    public g r() {
        this.f125302g = true;
        return this;
    }

    @z7.a
    public g s() {
        this.f125307l = true;
        return this;
    }

    @z7.a
    @Deprecated
    public g t(int i10) {
        this.f125304i = e(i10);
        this.f125303h = null;
        return this;
    }

    @z7.a
    public g u(int i10, int i11) {
        this.f125304i = e(i10);
        this.f125305j = e(i11);
        this.f125303h = null;
        return this;
    }

    @z7.a
    public g v(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e10);
            }
        }
        this.f125303h = str;
        return this;
    }

    @z7.a
    public g w(a... aVarArr) {
        Objects.requireNonNull(aVarArr);
        for (a aVar : aVarArr) {
            this.f125296a = this.f125296a.j(aVar, true, true);
        }
        return this;
    }

    @z7.a
    public g x(c cVar) {
        return y(cVar);
    }

    @z7.a
    public g y(d dVar) {
        Objects.requireNonNull(dVar);
        this.f125298c = dVar;
        return this;
    }

    @z7.a
    public g z(e eVar) {
        Objects.requireNonNull(eVar);
        this.f125309n = eVar;
        return this;
    }

    g(f fVar) {
        this.f125296a = com.google.gson.internal.w.f125528h;
        this.f125297b = w.f125637a;
        this.f125298c = c.f125252a;
        HashMap map = new HashMap();
        this.f125299d = map;
        ArrayList arrayList = new ArrayList();
        this.f125300e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f125301f = arrayList2;
        this.f125302g = false;
        this.f125303h = f.H;
        this.f125304i = 2;
        this.f125305j = 2;
        this.f125306k = false;
        this.f125307l = false;
        this.f125308m = true;
        this.f125309n = f.B;
        this.f125310o = false;
        this.f125311p = f.A;
        this.f125312q = true;
        this.f125313r = f.J;
        this.f125314s = f.K;
        ArrayDeque<x> arrayDeque = new ArrayDeque<>();
        this.f125315t = arrayDeque;
        this.f125296a = fVar.f125271f;
        this.f125298c = fVar.f125272g;
        map.putAll(fVar.f125273h);
        this.f125302g = fVar.f125274i;
        this.f125306k = fVar.f125275j;
        this.f125310o = fVar.f125276k;
        this.f125308m = fVar.f125277l;
        this.f125309n = fVar.f125278m;
        this.f125311p = fVar.f125279n;
        this.f125307l = fVar.f125280o;
        this.f125297b = fVar.f125285t;
        this.f125303h = fVar.f125282q;
        this.f125304i = fVar.f125283r;
        this.f125305j = fVar.f125284s;
        arrayList.addAll(fVar.f125286u);
        arrayList2.addAll(fVar.f125287v);
        this.f125312q = fVar.f125281p;
        this.f125313r = fVar.f125288w;
        this.f125314s = fVar.f125289x;
        arrayDeque.addAll(fVar.f125290y);
    }
}
