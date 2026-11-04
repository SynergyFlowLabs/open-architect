package gb;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<com.planner5d.library.database.model.spaces.documents.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f275429b;

    public f(a module, ij.c<ApplicationDatabase> databaseProvider) {
        this.f275428a = module;
        this.f275429b = databaseProvider;
    }

    public static f a(a module, ij.c<ApplicationDatabase> databaseProvider) {
        return new f(module, databaseProvider);
    }

    public static com.planner5d.library.database.model.spaces.documents.d c(a instance, ApplicationDatabase database) {
        return (com.planner5d.library.database.model.spaces.documents.d) p.f(instance.e(database));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.model.spaces.documents.d get() {
        return c(this.f275428a, this.f275429b.get());
    }
}
