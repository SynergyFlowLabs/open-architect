package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nEntityInsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n13579#2,2:230\n13644#2,3:237\n13579#2,2:240\n1855#3,2:232\n1864#3,3:234\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:230,2\n137#1:237,3\n199#1:240,2\n82#1:232,2\n117#1:234,3\n219#1:242,2\n*E\n"})
public abstract class w<T> extends m2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull b2 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(@NotNull w3.i iVar, T t10);

    public final void insert(T t10) {
        w3.i iVarAcquire = acquire();
        try {
            bind(iVarAcquire, t10);
            iVarAcquire.Yb();
            release(iVarAcquire);
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    public final long insertAndReturnId(T t10) {
        w3.i iVarAcquire = acquire();
        try {
            bind(iVarAcquire, t10);
            long jYb = iVarAcquire.Yb();
            release(iVarAcquire);
            return jYb;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (T t10 : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bind(iVarAcquire, t10);
                jArr[i10] = iVarAcquire.Yb();
                i10 = i11;
            }
            return jArr;
        } finally {
            release(iVarAcquire);
        }
    }

    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(iVarAcquire, it.next());
                lArr[i10] = Long.valueOf(iVarAcquire.Yb());
            }
            release(iVarAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            for (T t10 : entities) {
                bind(iVarAcquire, t10);
                listCreateListBuilder.add(Long.valueOf(iVarAcquire.Yb()));
            }
            List<Long> listBuild = CollectionsKt.build(listCreateListBuilder);
            release(iVarAcquire);
            return listBuild;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    public final void insert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            for (T t10 : entities) {
                bind(iVarAcquire, t10);
                iVarAcquire.Yb();
            }
            release(iVarAcquire);
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(iVarAcquire, entities[i10]);
                jArr[i11] = iVarAcquire.Yb();
                i10++;
                i11 = i12;
            }
            release(iVarAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        Iterator itA = kotlin.jvm.internal.i.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(iVarAcquire, itA.next());
                lArr[i10] = Long.valueOf(iVarAcquire.Yb());
            }
            release(iVarAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(iVarAcquire, it.next());
                listCreateListBuilder.add(Long.valueOf(iVarAcquire.Yb()));
            }
            return CollectionsKt.build(listCreateListBuilder);
        } finally {
            release(iVarAcquire);
        }
    }

    public final void insert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        w3.i iVarAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(iVarAcquire, it.next());
                iVarAcquire.Yb();
            }
            release(iVarAcquire);
        } catch (Throwable th2) {
            release(iVarAcquire);
            throw th2;
        }
    }
}
