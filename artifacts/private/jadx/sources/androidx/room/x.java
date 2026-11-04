package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w<T> f75129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v<T> f75130b;

    public x(@NotNull w<T> insertionAdapter, @NotNull v<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.f75129a = insertionAdapter;
        this.f75130b = updateAdapter;
    }

    private final void a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        if (!StringsKt.S2(message, "unique", true) && !StringsKt.V2(message, "2067", false, 2, null) && !StringsKt.V2(message, "1555", false, 2, null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void b(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t10 : entities) {
            try {
                this.f75129a.insert(t10);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(t10);
            }
        }
    }

    public final void c(T t10) {
        try {
            this.f75129a.insert(t10);
        } catch (SQLiteConstraintException e10) {
            a(e10);
            this.f75130b.d(t10);
        }
    }

    public final void d(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        int i10 = 7 << 0;
        for (T t10 : entities) {
            try {
                this.f75129a.insert(t10);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(t10);
            }
        }
    }

    public final long e(T t10) {
        try {
            return this.f75129a.insertAndReturnId(t10);
        } catch (SQLiteConstraintException e10) {
            a(e10);
            this.f75130b.d(t10);
            return -1L;
        }
    }

    @NotNull
    public final long[] f(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f75129a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(next);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final long[] g(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.f75129a.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(entities[i10]);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final Long[] h(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f75129a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(next);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    @NotNull
    public final Long[] i(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.f75129a.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(entities[i10]);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    @NotNull
    public final List<Long> j(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f75129a.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    @NotNull
    public final List<Long> k(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f75129a.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f75130b.d(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
