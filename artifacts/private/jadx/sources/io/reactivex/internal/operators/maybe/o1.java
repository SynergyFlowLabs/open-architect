package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public enum o1 implements dj.o<io.reactivex.y<Object>, org.reactivestreams.u<Object>> {
    INSTANCE;

    public static <T> dj.o<io.reactivex.y<T>, org.reactivestreams.u<T>> k() {
        return INSTANCE;
    }

    @Override // dj.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.reactivestreams.u<Object> apply(io.reactivex.y<Object> yVar) throws Exception {
        return new m1(yVar);
    }
}
