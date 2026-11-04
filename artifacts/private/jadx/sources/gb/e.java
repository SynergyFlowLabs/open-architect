package gb;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<va.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f275426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.model.chat.d> f275427b;

    public e(a module, ij.c<com.planner5d.library.database.model.chat.d> defaultChatRepositoryProvider) {
        this.f275426a = module;
        this.f275427b = defaultChatRepositoryProvider;
    }

    public static e a(a module, ij.c<com.planner5d.library.database.model.chat.d> defaultChatRepositoryProvider) {
        return new e(module, defaultChatRepositoryProvider);
    }

    public static va.b c(a instance, com.planner5d.library.database.model.chat.d defaultChatRepository) {
        return (va.b) p.f(instance.d(defaultChatRepository));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public va.b get() {
        return c(this.f275426a, this.f275427b.get());
    }
}
