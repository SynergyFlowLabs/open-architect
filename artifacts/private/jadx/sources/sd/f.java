package sd;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b> f375969a;

    public f(ij.c<b> cVar) {
        this.f375969a = cVar;
    }

    public static f a(ij.c<b> cVar) {
        return new f(cVar);
    }

    public static e c(b bVar) {
        return new e(bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f375969a.get());
    }
}
