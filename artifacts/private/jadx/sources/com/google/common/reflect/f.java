package com.google.common.reflect;

import com.google.common.collect.g5;
import com.google.common.collect.n6;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@d
public final class f<B> extends g5<q<? extends B>, B> implements p<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n6<q<? extends B>, B> f119826a;

    public static final class b<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6.b<q<? extends B>, B> f119827a;

        public f<B> a() {
            return new f<>(this.f119827a.d());
        }

        @z7.a
        public <T extends B> b<B> b(q<T> key, T value) {
            this.f119827a.i(key.U(), value);
            return this;
        }

        @z7.a
        public <T extends B> b<B> c(Class<T> key, T value) {
            this.f119827a.i(q.S(key), value);
            return this;
        }

        private b() {
            this.f119827a = n6.b();
        }
    }

    public static <B> b<B> c1() {
        return new b<>();
    }

    public static <B> f<B> f1() {
        return new f<>(n6.q());
    }

    @fj.a
    private <T extends B> T k1(q<T> qVar) {
        return this.f119826a.get(qVar);
    }

    @Override // com.google.common.reflect.p
    @fj.a
    public <T extends B> T G2(q<T> qVar) {
        return (T) k1(qVar.U());
    }

    @Override // com.google.common.reflect.p
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public <T extends B> T H3(q<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5, com.google.common.collect.m5
    /* JADX INFO: renamed from: L0 */
    public Map<q<? extends B>, B> i1() {
        return this.f119826a;
    }

    @Override // com.google.common.reflect.p
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    public <T extends B> T d1(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    @fj.a
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public B put(q<? extends B> key, B value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends q<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.p
    @fj.a
    public <T extends B> T u1(Class<T> cls) {
        return (T) k1(q.S(cls));
    }

    private f(n6<q<? extends B>, B> delegate) {
        this.f119826a = delegate;
    }
}
