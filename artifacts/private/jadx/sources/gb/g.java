package gb;

import com.planner5d.library.database.ApplicationDatabase;
import com.planner5d.library.database.model.chat.i;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f275431b;

    public g(a module, ij.c<ApplicationDatabase> databaseProvider) {
        this.f275430a = module;
        this.f275431b = databaseProvider;
    }

    public static g a(a module, ij.c<ApplicationDatabase> databaseProvider) {
        return new g(module, databaseProvider);
    }

    public static i c(a instance, ApplicationDatabase database) {
        return (i) p.f(instance.f(database));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f275430a, this.f275431b.get());
    }
}
