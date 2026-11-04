package sd;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f375957a;

    public c(ij.c<Application> cVar) {
        this.f375957a = cVar;
    }

    public static c a(ij.c<Application> cVar) {
        return new c(cVar);
    }

    public static b c(Application application) {
        return new b(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f375957a.get());
    }
}
