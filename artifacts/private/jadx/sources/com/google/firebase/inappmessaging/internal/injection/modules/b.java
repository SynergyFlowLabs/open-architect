package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.AnalyticsListener"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class b implements com.google.firebase.inappmessaging.dagger.internal.c<io.reactivex.flowables.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f122743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.f> f122744b;

    public b(a aVar, ij.c<com.google.firebase.inappmessaging.internal.f> cVar) {
        this.f122743a = aVar;
        this.f122744b = cVar;
    }

    public static b a(a aVar, ij.c<com.google.firebase.inappmessaging.internal.f> cVar) {
        return new b(aVar, cVar);
    }

    public static io.reactivex.flowables.a<String> c(a aVar, com.google.firebase.inappmessaging.internal.f fVar) {
        return (io.reactivex.flowables.a) com.google.firebase.inappmessaging.dagger.internal.e.f(aVar.a(fVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io.reactivex.flowables.a<String> get() {
        return c(this.f122743a, this.f122744b.get());
    }
}
