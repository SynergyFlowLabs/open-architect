package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h<T> {

    class a extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f267149a;

        a(h hVar) {
            this.f267149a = hVar;
        }

        @Override // com.squareup.moshi.h
        @fj.h
        public T b(m mVar) throws IOException {
            return (T) this.f267149a.b(mVar);
        }

        @Override // com.squareup.moshi.h
        boolean g() {
            return this.f267149a.g();
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, @fj.h T t10) throws IOException {
            boolean zJ = tVar.j();
            tVar.I(true);
            try {
                this.f267149a.m(tVar, t10);
            } finally {
                tVar.I(zJ);
            }
        }

        public String toString() {
            return this.f267149a + ".serializeNulls()";
        }
    }

    class b extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f267151a;

        b(h hVar) {
            this.f267151a = hVar;
        }

        @Override // com.squareup.moshi.h
        @fj.h
        public T b(m mVar) throws IOException {
            boolean zB = mVar.b();
            mVar.C1(true);
            try {
                return (T) this.f267151a.b(mVar);
            } finally {
                mVar.C1(zB);
            }
        }

        @Override // com.squareup.moshi.h
        boolean g() {
            return true;
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, @fj.h T t10) throws IOException {
            boolean zL = tVar.l();
            tVar.C1(true);
            try {
                this.f267151a.m(tVar, t10);
            } finally {
                tVar.C1(zL);
            }
        }

        public String toString() {
            return this.f267151a + ".lenient()";
        }
    }

    class c extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f267153a;

        c(h hVar) {
            this.f267153a = hVar;
        }

        @Override // com.squareup.moshi.h
        @fj.h
        public T b(m mVar) throws IOException {
            boolean zA = mVar.a();
            mVar.q(true);
            try {
                T t10 = (T) this.f267153a.b(mVar);
                mVar.q(zA);
                return t10;
            } catch (Throwable th2) {
                mVar.q(zA);
                throw th2;
            }
        }

        @Override // com.squareup.moshi.h
        boolean g() {
            return this.f267153a.g();
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, @fj.h T t10) throws IOException {
            this.f267153a.m(tVar, t10);
        }

        public String toString() {
            return this.f267153a + ".failOnUnknown()";
        }
    }

    class d extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f267155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f267156b;

        d(h hVar, String str) {
            this.f267155a = hVar;
            this.f267156b = str;
        }

        @Override // com.squareup.moshi.h
        @fj.h
        public T b(m mVar) throws IOException {
            return (T) this.f267155a.b(mVar);
        }

        @Override // com.squareup.moshi.h
        boolean g() {
            return this.f267155a.g();
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, @fj.h T t10) throws IOException {
            String strH = tVar.h();
            tVar.H(this.f267156b);
            try {
                this.f267155a.m(tVar, t10);
            } finally {
                tVar.H(strH);
            }
        }

        public String toString() {
            return this.f267155a + ".indent(\"" + this.f267156b + "\")";
        }
    }

    public interface e {
        @fj.h
        @fj.c
        h<?> a(Type type, Set<? extends Annotation> set, w wVar);
    }

    @fj.c
    public final h<T> a() {
        return new c(this);
    }

    @fj.h
    @fj.c
    public abstract T b(m mVar) throws IOException;

    @fj.h
    @fj.c
    public final T c(String str) throws IOException {
        m mVarE = m.e(new okio.l().pa(str));
        T tB = b(mVarE);
        if (g() || mVarE.f() == m.c.END_DOCUMENT) {
            return tB;
        }
        throw new j("JSON document was not fully consumed.");
    }

    @fj.h
    @fj.c
    public final T d(okio.n nVar) throws IOException {
        return b(m.e(nVar));
    }

    @fj.h
    @fj.c
    public final T e(@fj.h Object obj) {
        try {
            return b(new q(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @fj.c
    public h<T> f(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean g() {
        return false;
    }

    @fj.c
    public final h<T> h() {
        return new b(this);
    }

    @fj.c
    public final h<T> i() {
        return this instanceof com.squareup.moshi.internal.a ? this : new com.squareup.moshi.internal.a(this);
    }

    @fj.c
    public final h<T> j() {
        return this instanceof com.squareup.moshi.internal.b ? this : new com.squareup.moshi.internal.b(this);
    }

    @fj.c
    public final h<T> k() {
        return new a(this);
    }

    @fj.c
    public final String l(@fj.h T t10) {
        okio.l lVar = new okio.l();
        try {
            n(lVar, t10);
            return lVar.O7();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void m(t tVar, @fj.h T t10) throws IOException;

    public final void n(okio.m mVar, @fj.h T t10) throws IOException {
        m(t.r(mVar), t10);
    }

    @fj.h
    @fj.c
    public final Object o(@fj.h T t10) {
        s sVar = new s();
        try {
            m(sVar, t10);
            return sVar.w0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
