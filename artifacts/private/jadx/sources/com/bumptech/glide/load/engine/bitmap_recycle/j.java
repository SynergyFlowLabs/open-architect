package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96400h = 4194304;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final int f96401i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96402j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Object> f96403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f96404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f96405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f96406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f96407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96408g;

    private static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f96409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f96411c;

        a(b bVar) {
            this.f96409a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f96409a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f96410b = i10;
            this.f96411c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f96410b == aVar.f96410b && this.f96411c == aVar.f96411c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f96410b * 31;
            Class<?> cls = this.f96411c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f96410b + "array=" + this.f96411c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    private static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i10, cls);
            return aVarB;
        }
    }

    @l1
    public j() {
        this.f96403b = new h<>();
        this.f96404c = new b();
        this.f96405d = new HashMap();
        this.f96406e = new HashMap();
        this.f96407f = 4194304;
    }

    private void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapN = n(cls);
        Integer num = navigableMapN.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapN.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapN.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void g() {
        h(this.f96407f);
    }

    private void h(int i10) {
        while (this.f96408g > i10) {
            Object objF = this.f96403b.f();
            com.bumptech.glide.util.k.d(objF);
            com.bumptech.glide.load.engine.bitmap_recycle.a aVarI = i(objF);
            this.f96408g -= aVarI.a(objF) * aVarI.b();
            f(aVarI.a(objF), objF.getClass());
            if (Log.isLoggable(aVarI.E(), 2)) {
                aVarI.E();
                aVarI.a(objF);
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t10) {
        return j(t10.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> gVar;
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f96406e.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            gVar = new i();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            gVar = new g();
        }
        this.f96406e.put(cls, gVar);
        return gVar;
    }

    @p0
    private <T> T k(a aVar) {
        return (T) this.f96403b.a(aVar);
    }

    private <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        T t10 = (T) k(aVar);
        if (t10 != null) {
            this.f96408g -= aVarJ.a(t10) * aVarJ.b();
            f(aVarJ.a(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarJ.E(), 2)) {
            aVarJ.E();
            int i10 = aVar.f96410b;
        }
        return aVarJ.newArray(aVar.f96410b);
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> treeMap = this.f96405d.get(cls);
        if (treeMap == null) {
            treeMap = new TreeMap<>();
            this.f96405d.put(cls, treeMap);
        }
        return treeMap;
    }

    private boolean o() {
        int i10 = this.f96408g;
        if (i10 != 0 && this.f96407f / i10 < 2) {
            return false;
        }
        return true;
    }

    private boolean p(int i10) {
        return i10 <= this.f96407f / 2;
    }

    private boolean q(int i10, Integer num) {
        return num != null && (o() || num.intValue() <= i10 * 8);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T a(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m(q(i10, numCeilingKey) ? this.f96404c.e(numCeilingKey.intValue(), cls) : this.f96404c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b(int i10) {
        try {
            if (i10 >= 40) {
                c();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f96407f / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void c() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m(this.f96404c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void e(T t10, Class<T> cls) {
        put(t10);
    }

    int l() {
        int iIntValue = 0;
        for (Class<?> cls : this.f96405d.keySet()) {
            for (Integer num : this.f96405d.get(cls).keySet()) {
                iIntValue += num.intValue() * this.f96405d.get(cls).get(num).intValue() * j(cls).b();
            }
        }
        return iIntValue;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        int iA = aVarJ.a(t10);
        int iB = aVarJ.b() * iA;
        if (p(iB)) {
            a aVarE = this.f96404c.e(iA, cls);
            this.f96403b.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapN = n(cls);
            Integer num = navigableMapN.get(Integer.valueOf(aVarE.f96410b));
            Integer numValueOf = Integer.valueOf(aVarE.f96410b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapN.put(numValueOf, Integer.valueOf(iIntValue));
            this.f96408g += iB;
            g();
        }
    }

    public j(int i10) {
        this.f96403b = new h<>();
        this.f96404c = new b();
        this.f96405d = new HashMap();
        this.f96406e = new HashMap();
        this.f96407f = i10;
    }
}
