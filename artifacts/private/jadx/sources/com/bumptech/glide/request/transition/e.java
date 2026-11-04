package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes3.dex */
public class e<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e<?> f97437a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g<?> f97438b = new a();

    public static class a<R> implements g<R> {
        @Override // com.bumptech.glide.request.transition.g
        public f<R> a(com.bumptech.glide.load.a aVar, boolean z10) {
            return e.f97437a;
        }
    }

    public static <R> f<R> b() {
        return f97437a;
    }

    public static <R> g<R> c() {
        return (g<R>) f97438b;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(Object obj, f.a aVar) {
        return false;
    }
}
