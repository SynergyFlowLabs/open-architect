package androidx.room;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
public abstract class v<T> extends m2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull b2 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(@NotNull w3.i iVar, T t10);

    @Override // androidx.room.m2
    @NotNull
    protected abstract String createQuery();

    public final int d(T t10) {
        w3.i iVarAcquire = acquire();
        try {
            bind(iVarAcquire, t10);
            int iJ2 = iVarAcquire.j2();
            release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    public final int e(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int iJ2 = 0;
            while (it.hasNext()) {
                bind(iVarAcquire, it.next());
                iJ2 += iVarAcquire.j2();
            }
            release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    public final int f(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            int iJ2 = 0;
            for (T t10 : entities) {
                bind(iVarAcquire, t10);
                iJ2 += iVarAcquire.j2();
            }
            release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }
}
