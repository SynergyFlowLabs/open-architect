package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.j0;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<T> f125391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.k<T> f125392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.gson.f f125393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f125394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f125395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n<T>.b f125396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f125397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile b0<T> f125398h;

    private final class b implements s, com.google.gson.j {
        private b() {
        }

        @Override // com.google.gson.s
        public com.google.gson.l a(Object obj, Type type) {
            return n.this.f125393c.L(obj, type);
        }

        @Override // com.google.gson.j
        public <R> R b(com.google.gson.l lVar, Type type) throws com.google.gson.p {
            return (R) n.this.f125393c.k(lVar, type);
        }

        @Override // com.google.gson.s
        public com.google.gson.l c(Object obj) {
            return n.this.f125393c.K(obj);
        }
    }

    private static final class c implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f125400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f125401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f125402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t<?> f125403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.gson.k<?> f125404e;

        c(Object obj, com.google.gson.reflect.a<?> aVar, boolean z10, Class<?> cls) {
            t<?> tVar = obj instanceof t ? (t) obj : null;
            this.f125403d = tVar;
            com.google.gson.k<?> kVar = obj instanceof com.google.gson.k ? (com.google.gson.k) obj : null;
            this.f125404e = kVar;
            if (tVar != null || kVar != null) {
                this.f125400a = aVar;
                this.f125401b = z10;
                this.f125402c = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            boolean zIsAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f125400a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.f125401b && this.f125400a.getType() == aVar.getRawType());
            } else {
                zIsAssignableFrom = this.f125402c.isAssignableFrom(aVar.getRawType());
            }
            if (zIsAssignableFrom) {
                return new n(this.f125403d, this.f125404e, fVar, aVar, this);
            }
            return null;
        }
    }

    public n(t<T> tVar, com.google.gson.k<T> kVar, com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar, c0 c0Var, boolean z10) {
        this.f125396f = new b();
        this.f125391a = tVar;
        this.f125392b = kVar;
        this.f125393c = fVar;
        this.f125394d = aVar;
        this.f125395e = c0Var;
        this.f125397g = z10;
    }

    private b0<T> b() {
        b0<T> b0VarV = this.f125398h;
        if (b0VarV == null) {
            b0VarV = this.f125393c.v(this.f125395e, this.f125394d);
            this.f125398h = b0VarV;
        }
        return b0VarV;
    }

    public static c0 c(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new c(obj, aVar, false, null);
    }

    public static c0 d(com.google.gson.reflect.a<?> aVar, Object obj) {
        boolean z10;
        if (aVar.getType() == aVar.getRawType()) {
            z10 = true;
            int i10 = 6 << 1;
        } else {
            z10 = false;
        }
        return new c(obj, aVar, z10, null);
    }

    public static c0 e(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.m
    public b0<T> a() {
        return this.f125391a != null ? this : b();
    }

    @Override // com.google.gson.b0
    public T read(com.google.gson.stream.a aVar) throws IOException {
        if (this.f125392b == null) {
            return b().read(aVar);
        }
        com.google.gson.l lVarA = j0.a(aVar);
        if (!this.f125397g || !lVarA.G()) {
            return this.f125392b.a(lVarA, this.f125394d.getType(), this.f125396f);
        }
        int i10 = 2 & 0;
        return null;
    }

    @Override // com.google.gson.b0
    public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
        t<T> tVar = this.f125391a;
        if (tVar == null) {
            b().write(dVar, t10);
        } else if (this.f125397g && t10 == null) {
            dVar.y();
        } else {
            j0.b(tVar.b(t10, this.f125394d.getType(), this.f125396f), dVar);
        }
    }

    public n(t<T> tVar, com.google.gson.k<T> kVar, com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar, c0 c0Var) {
        this(tVar, kVar, fVar, aVar, c0Var, true);
    }
}
