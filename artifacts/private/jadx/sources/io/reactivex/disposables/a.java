package io.reactivex.disposables;

import io.reactivex.internal.util.k;

/* JADX INFO: loaded from: classes8.dex */
final class a extends f<dj.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f298658b = -8219729196779211169L;

    a(dj.a aVar) {
        super(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@cj.f dj.a aVar) {
        try {
            aVar.run();
        } catch (Throwable th2) {
            throw k.f(th2);
        }
    }
}
