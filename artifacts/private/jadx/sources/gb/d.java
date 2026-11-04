package gb;

import com.planner5d.library.database.ApplicationDatabase;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<com.planner5d.library.database.model.chat.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ApplicationDatabase> f275425b;

    public d(a module, ij.c<ApplicationDatabase> databaseProvider) {
        this.f275424a = module;
        this.f275425b = databaseProvider;
    }

    public static d a(a module, ij.c<ApplicationDatabase> databaseProvider) {
        return new d(module, databaseProvider);
    }

    public static com.planner5d.library.database.model.chat.b c(a instance, ApplicationDatabase database) {
        return (com.planner5d.library.database.model.chat.b) p.f(instance.c(database));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.model.chat.b get() {
        return c(this.f275424a, this.f275425b.get());
    }
}
