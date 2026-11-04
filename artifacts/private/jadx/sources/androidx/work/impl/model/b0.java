package androidx.work.impl.model;

import androidx.room.i0;
import androidx.room.x0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
@SourceDebugExtension({"SMAP\nWorkTagDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n*L\n64#1:68,2\n*E\n"})
public interface b0 {

    public static final class a {
        @Deprecated
        public static void a(@NotNull b0 b0Var, @NotNull String id2, @NotNull Set<String> tags) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            b0.super.c(id2, tags);
        }
    }

    @x0("DELETE FROM worktag WHERE work_spec_id=:id")
    void a(@NotNull String str);

    default void c(@NotNull String id2, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            e(new a0((String) it.next(), id2));
        }
    }

    @x0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> d(@NotNull String str);

    @i0(onConflict = 5)
    void e(@NotNull a0 a0Var);

    @x0("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> f(@NotNull String str);
}
