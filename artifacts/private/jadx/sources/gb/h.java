package gb;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<com.planner5d.library.database.model.spaces.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f275433b;

    public h(a module, ij.c<ApplicationDatabase> databaseProvider) {
        this.f275432a = module;
        this.f275433b = databaseProvider;
    }

    public static h a(a module, ij.c<ApplicationDatabase> databaseProvider) {
        return new h(module, databaseProvider);
    }

    public static com.planner5d.library.database.model.spaces.d c(a instance, ApplicationDatabase database) {
        return (com.planner5d.library.database.model.spaces.d) p.f(instance.g(database));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.model.spaces.d get() {
        return c(this.f275432a, this.f275433b.get());
    }
}
