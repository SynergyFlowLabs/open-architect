package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
abstract class q {

    @u7.d.a
    public static abstract class a {
        public abstract q a();

        abstract a b(com.google.android.datatransport.e eVar);

        abstract a c(com.google.android.datatransport.f<?> fVar);

        public <T> a d(com.google.android.datatransport.f<T> fVar, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar) {
            c(fVar);
            b(eVar);
            e(kVar);
            return this;
        }

        abstract a e(com.google.android.datatransport.k<?, byte[]> kVar);

        public abstract a f(r rVar);

        public abstract a g(String str);
    }

    q() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract com.google.android.datatransport.e b();

    abstract com.google.android.datatransport.f<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract com.google.android.datatransport.k<?, byte[]> e();

    public abstract r f();

    public abstract String g();
}
