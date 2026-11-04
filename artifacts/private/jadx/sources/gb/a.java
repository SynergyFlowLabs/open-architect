package gb;

import com.planner5d.library.database.ApplicationDatabase;
import fg.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@fg.h
public final class a {
    @i
    @ij.f
    @NotNull
    public final ApplicationDatabase a(@NotNull ApplicationDatabase.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a();
    }

    @i
    @NotNull
    public final com.planner5d.library.feed.data.a b(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.d();
    }

    @i
    @NotNull
    public final com.planner5d.library.database.model.chat.b c(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.e();
    }

    @i
    @NotNull
    public final va.b d(@NotNull com.planner5d.library.database.model.chat.d defaultChatRepository) {
        Intrinsics.checkNotNullParameter(defaultChatRepository, "defaultChatRepository");
        return defaultChatRepository;
    }

    @i
    @NotNull
    public final com.planner5d.library.database.model.spaces.documents.d e(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.f();
    }

    @i
    @NotNull
    public final com.planner5d.library.database.model.chat.i f(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.h();
    }

    @i
    @NotNull
    public final com.planner5d.library.database.model.spaces.d g(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database.i();
    }
}
