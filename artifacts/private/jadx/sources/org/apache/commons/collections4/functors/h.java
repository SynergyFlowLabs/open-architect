package org.apache.commons.collections4.functors;

/* JADX INFO: loaded from: classes14.dex */
public class h<T> implements org.apache.commons.collections4.w0<T, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final org.apache.commons.collections4.w0 f335681a = new h();

    private h() {
    }

    public static <T> org.apache.commons.collections4.w0<T, T> b() {
        return f335681a;
    }

    @Override // org.apache.commons.collections4.w0
    public T a(T t10) {
        if (t10 == null) {
            return null;
        }
        return (T) r0.a(t10).k();
    }
}
