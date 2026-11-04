package gb;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class b implements dagger.internal.h<ApplicationDatabase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase.a> f275421b;

    public b(a module, ij.c<ApplicationDatabase.a> factoryProvider) {
        this.f275420a = module;
        this.f275421b = factoryProvider;
    }

    public static b a(a module, ij.c<ApplicationDatabase.a> factoryProvider) {
        return new b(module, factoryProvider);
    }

    public static ApplicationDatabase c(a instance, ApplicationDatabase.a factory) {
        return (ApplicationDatabase) p.f(instance.a(factory));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ApplicationDatabase get() {
        return c(this.f275420a, this.f275421b.get());
    }
}
