package com.nineoldandroids.animation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes5.dex */
public class n implements Cloneable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p f131241k = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p f131242l = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Class[] f131243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Class[] f131244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Class[] f131245o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final HashMap<Class, HashMap<String, Method>> f131246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final HashMap<Class, HashMap<String, Method>> f131247t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f131248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.nineoldandroids.util.d f131249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Method f131250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f131251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Class f131252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    k f131253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ReentrantReadWriteLock f131254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Object[] f131255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f131256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f131257j;

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f131243m = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f131244n = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f131245o = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f131246s = new HashMap<>();
        f131247t = new HashMap<>();
    }

    private void A(Class cls) {
        this.f131251d = D(cls, f131247t, "get", null);
    }

    private Method D(Class cls, HashMap<Class, HashMap<String, Method>> map, String str, Class cls2) {
        try {
            this.f131254g.writeLock().lock();
            HashMap<String, Method> map2 = map.get(cls);
            Method methodE = map2 != null ? map2.get(this.f131248a) : null;
            if (methodE == null) {
                methodE = e(cls, str, cls2);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    map.put(cls, map2);
                }
                map2.put(this.f131248a, methodE);
            }
            this.f131254g.writeLock().unlock();
            return methodE;
        } catch (Throwable th2) {
            this.f131254g.writeLock().unlock();
            throw th2;
        }
    }

    private void F(Object obj, j jVar) {
        com.nineoldandroids.util.d dVar = this.f131249b;
        if (dVar != null) {
            jVar.p(dVar.a(obj));
        }
        try {
            if (this.f131251d == null) {
                A(obj.getClass());
            }
            jVar.p(this.f131251d.invoke(obj, null));
        } catch (IllegalAccessException e10) {
            e10.toString();
        } catch (InvocationTargetException e11) {
            e11.toString();
        }
    }

    static String d(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
    }

    private Method e(Class cls, String str, Class cls2) {
        Class[] clsArr;
        String strD = d(str, this.f131248a);
        Method declaredMethod = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(strD, null);
            } catch (NoSuchMethodException e10) {
                try {
                    declaredMethod = cls.getDeclaredMethod(strD, null);
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    e10.toString();
                }
            }
        } else {
            if (this.f131252e.equals(Float.class)) {
                clsArr = f131243m;
            } else if (this.f131252e.equals(Integer.class)) {
                clsArr = f131244n;
            } else {
                clsArr = this.f131252e.equals(Double.class) ? f131245o : new Class[]{this.f131252e};
            }
            for (Class cls3 : clsArr) {
                Class<?>[] clsArr2 = {cls3};
                try {
                    try {
                        Method method = cls.getMethod(strD, clsArr2);
                        this.f131252e = cls3;
                        return method;
                    } catch (NoSuchMethodException unused2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    declaredMethod = cls.getDeclaredMethod(strD, clsArr2);
                    declaredMethod.setAccessible(true);
                    this.f131252e = cls3;
                    return declaredMethod;
                }
            }
            Objects.toString(this.f131252e);
        }
        return declaredMethod;
    }

    public static n h(com.nineoldandroids.util.d<?, Float> dVar, float... fArr) {
        return new b(dVar, fArr);
    }

    public static n i(String str, float... fArr) {
        return new b(str, fArr);
    }

    public static n j(com.nineoldandroids.util.d<?, Integer> dVar, int... iArr) {
        return new c(dVar, iArr);
    }

    public static n k(String str, int... iArr) {
        return new c(str, iArr);
    }

    public static n l(com.nineoldandroids.util.d dVar, j... jVarArr) {
        k kVarE = k.e(jVarArr);
        if (kVarE instanceof i) {
            return new c(dVar, (i) kVarE);
        }
        if (kVarE instanceof g) {
            return new b(dVar, (g) kVarE);
        }
        n nVar = new n(dVar);
        nVar.f131253f = kVarE;
        nVar.f131252e = jVarArr[0].d();
        return nVar;
    }

    public static n n(String str, j... jVarArr) {
        k kVarE = k.e(jVarArr);
        if (kVarE instanceof i) {
            return new c(str, (i) kVarE);
        }
        if (kVarE instanceof g) {
            return new b(str, (g) kVarE);
        }
        n nVar = new n(str);
        nVar.f131253f = kVarE;
        nVar.f131252e = jVarArr[0].d();
        return nVar;
    }

    public static <V> n o(com.nineoldandroids.util.d dVar, p<V> pVar, V... vArr) {
        n nVar = new n(dVar);
        nVar.v(vArr);
        nVar.r(pVar);
        return nVar;
    }

    public static n p(String str, p pVar, Object... objArr) {
        n nVar = new n(str);
        nVar.v(objArr);
        nVar.r(pVar);
        return nVar;
    }

    void B(Class cls) {
        this.f131250c = D(cls, f131246s, "set", this.f131252e);
    }

    void C(Object obj) {
        com.nineoldandroids.util.d dVar = this.f131249b;
        if (dVar != null) {
            try {
                dVar.a(obj);
                for (j jVar : this.f131253f.f131220e) {
                    if (!jVar.f()) {
                        jVar.p(this.f131249b.a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                this.f131249b.b();
                Objects.toString(obj);
                this.f131249b = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f131250c == null) {
            B(cls);
        }
        for (j jVar2 : this.f131253f.f131220e) {
            if (!jVar2.f()) {
                if (this.f131251d == null) {
                    A(cls);
                }
                try {
                    jVar2.p(this.f131251d.invoke(obj, null));
                } catch (IllegalAccessException e10) {
                    e10.toString();
                } catch (InvocationTargetException e11) {
                    e11.toString();
                }
            }
        }
    }

    void E(Object obj) {
        F(obj, this.f131253f.f131220e.get(0));
    }

    void a(float f10) {
        this.f131257j = this.f131253f.b(f10);
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f131248a = this.f131248a;
            nVar.f131249b = this.f131249b;
            nVar.f131253f = this.f131253f.clone();
            nVar.f131256i = this.f131256i;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    Object c() {
        return this.f131257j;
    }

    public String f() {
        return this.f131248a;
    }

    void g() {
        p pVar;
        if (this.f131256i == null) {
            Class cls = this.f131252e;
            if (cls == Integer.class) {
                pVar = f131241k;
            } else {
                pVar = cls == Float.class ? f131242l : null;
            }
            this.f131256i = pVar;
        }
        p pVar2 = this.f131256i;
        if (pVar2 != null) {
            this.f131253f.g(pVar2);
        }
    }

    void q(Object obj) {
        com.nineoldandroids.util.d dVar = this.f131249b;
        if (dVar != null) {
            dVar.f(obj, c());
        }
        if (this.f131250c != null) {
            try {
                this.f131255h[0] = c();
                this.f131250c.invoke(obj, this.f131255h);
            } catch (IllegalAccessException e10) {
                e10.toString();
            } catch (InvocationTargetException e11) {
                e11.toString();
            }
        }
    }

    public void r(p pVar) {
        this.f131256i = pVar;
        this.f131253f.g(pVar);
    }

    public void s(float... fArr) {
        this.f131252e = Float.TYPE;
        this.f131253f = k.c(fArr);
    }

    public void t(int... iArr) {
        this.f131252e = Integer.TYPE;
        this.f131253f = k.d(iArr);
    }

    public String toString() {
        return this.f131248a + ": " + this.f131253f.toString();
    }

    public void u(j... jVarArr) {
        int length = jVarArr.length;
        j[] jVarArr2 = new j[Math.max(length, 2)];
        this.f131252e = jVarArr[0].d();
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr2[i10] = jVarArr[i10];
        }
        this.f131253f = new k(jVarArr2);
    }

    public void v(Object... objArr) {
        this.f131252e = objArr[0].getClass();
        this.f131253f = k.f(objArr);
    }

    public void w(com.nineoldandroids.util.d dVar) {
        this.f131249b = dVar;
    }

    public void x(String str) {
        this.f131248a = str;
    }

    void z(Object obj) {
        ArrayList<j> arrayList = this.f131253f.f131220e;
        F(obj, arrayList.get(arrayList.size() - 1));
    }

    private n(String str) {
        this.f131250c = null;
        this.f131251d = null;
        this.f131253f = null;
        this.f131254g = new ReentrantReadWriteLock();
        this.f131255h = new Object[1];
        this.f131248a = str;
    }

    static class b extends n {
        float X;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private com.nineoldandroids.util.a f131258v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        g f131259w;

        public b(String str, g gVar) {
            super(str);
            this.f131252e = Float.TYPE;
            this.f131253f = gVar;
            this.f131259w = gVar;
        }

        @Override // com.nineoldandroids.animation.n
        void B(Class cls) {
            if (this.f131249b != null) {
                return;
            }
            super.B(cls);
        }

        @Override // com.nineoldandroids.animation.n
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = (b) super.clone();
            bVar.f131259w = (g) bVar.f131253f;
            return bVar;
        }

        @Override // com.nineoldandroids.animation.n
        void a(float f10) {
            this.X = this.f131259w.i(f10);
        }

        @Override // com.nineoldandroids.animation.n
        Object c() {
            return Float.valueOf(this.X);
        }

        @Override // com.nineoldandroids.animation.n
        void q(Object obj) {
            com.nineoldandroids.util.a aVar = this.f131258v;
            if (aVar != null) {
                aVar.h(obj, this.X);
                return;
            }
            com.nineoldandroids.util.d dVar = this.f131249b;
            if (dVar != null) {
                dVar.f(obj, Float.valueOf(this.X));
                return;
            }
            if (this.f131250c != null) {
                try {
                    this.f131255h[0] = Float.valueOf(this.X);
                    this.f131250c.invoke(obj, this.f131255h);
                } catch (IllegalAccessException e10) {
                    e10.toString();
                } catch (InvocationTargetException e11) {
                    e11.toString();
                }
            }
        }

        @Override // com.nineoldandroids.animation.n
        public void s(float... fArr) {
            super.s(fArr);
            this.f131259w = (g) this.f131253f;
        }

        public b(com.nineoldandroids.util.d dVar, g gVar) {
            super(dVar);
            this.f131252e = Float.TYPE;
            this.f131253f = gVar;
            this.f131259w = gVar;
            if (dVar instanceof com.nineoldandroids.util.a) {
                this.f131258v = (com.nineoldandroids.util.a) this.f131249b;
            }
        }

        public b(String str, float... fArr) {
            super(str);
            s(fArr);
        }

        public b(com.nineoldandroids.util.d dVar, float... fArr) {
            super(dVar);
            s(fArr);
            if (dVar instanceof com.nineoldandroids.util.a) {
                this.f131258v = (com.nineoldandroids.util.a) this.f131249b;
            }
        }
    }

    static class c extends n {
        int X;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private com.nineoldandroids.util.b f131260v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        i f131261w;

        public c(String str, i iVar) {
            super(str);
            this.f131252e = Integer.TYPE;
            this.f131253f = iVar;
            this.f131261w = iVar;
        }

        @Override // com.nineoldandroids.animation.n
        void B(Class cls) {
            if (this.f131249b != null) {
                return;
            }
            super.B(cls);
        }

        @Override // com.nineoldandroids.animation.n
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public c clone() {
            c cVar = (c) super.clone();
            cVar.f131261w = (i) cVar.f131253f;
            return cVar;
        }

        @Override // com.nineoldandroids.animation.n
        void a(float f10) {
            this.X = this.f131261w.i(f10);
        }

        @Override // com.nineoldandroids.animation.n
        Object c() {
            return Integer.valueOf(this.X);
        }

        @Override // com.nineoldandroids.animation.n
        void q(Object obj) {
            com.nineoldandroids.util.b bVar = this.f131260v;
            if (bVar != null) {
                bVar.h(obj, this.X);
                return;
            }
            com.nineoldandroids.util.d dVar = this.f131249b;
            if (dVar != null) {
                dVar.f(obj, Integer.valueOf(this.X));
                return;
            }
            if (this.f131250c != null) {
                try {
                    this.f131255h[0] = Integer.valueOf(this.X);
                    this.f131250c.invoke(obj, this.f131255h);
                } catch (IllegalAccessException e10) {
                    e10.toString();
                } catch (InvocationTargetException e11) {
                    e11.toString();
                }
            }
        }

        @Override // com.nineoldandroids.animation.n
        public void t(int... iArr) {
            super.t(iArr);
            this.f131261w = (i) this.f131253f;
        }

        public c(com.nineoldandroids.util.d dVar, i iVar) {
            super(dVar);
            this.f131252e = Integer.TYPE;
            this.f131253f = iVar;
            this.f131261w = iVar;
            if (dVar instanceof com.nineoldandroids.util.b) {
                this.f131260v = (com.nineoldandroids.util.b) this.f131249b;
            }
        }

        public c(String str, int... iArr) {
            super(str);
            t(iArr);
        }

        public c(com.nineoldandroids.util.d dVar, int... iArr) {
            super(dVar);
            t(iArr);
            if (dVar instanceof com.nineoldandroids.util.b) {
                this.f131260v = (com.nineoldandroids.util.b) this.f131249b;
            }
        }
    }

    private n(com.nineoldandroids.util.d dVar) {
        this.f131250c = null;
        this.f131251d = null;
        this.f131253f = null;
        this.f131254g = new ReentrantReadWriteLock();
        this.f131255h = new Object[1];
        this.f131249b = dVar;
        if (dVar != null) {
            this.f131248a = dVar.b();
        }
    }
}
