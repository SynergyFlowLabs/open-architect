package gb;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class c implements dagger.internal.h<com.planner5d.library.feed.data.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f275423b;

    public c(a module, ij.c<ApplicationDatabase> databaseProvider) {
        this.f275422a = module;
        this.f275423b = databaseProvider;
    }

    public static c a(a module, ij.c<ApplicationDatabase> databaseProvider) {
        return new c(module, databaseProvider);
    }

    public static com.planner5d.library.feed.data.a c(a instance, ApplicationDatabase database) {
        return (com.planner5d.library.feed.data.a) p.f(instance.b(database));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.data.a get() {
        return c(this.f275422a, this.f275423b.get());
    }
}
