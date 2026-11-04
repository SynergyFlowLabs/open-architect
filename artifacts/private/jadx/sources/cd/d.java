package cd;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@e
@s("javax.inject.Singleton")
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f86902a;

    public d(ij.c<Application> cVar) {
        this.f86902a = cVar;
    }

    public static d a(ij.c<Application> cVar) {
        return new d(cVar);
    }

    public static c c(Application application) {
        return new c(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f86902a.get());
    }
}
