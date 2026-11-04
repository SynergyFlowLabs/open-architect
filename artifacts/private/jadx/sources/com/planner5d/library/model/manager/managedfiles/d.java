package com.planner5d.library.model.manager.managedfiles;

import android.database.Cursor;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.activeandroid.query.Update;
import com.activeandroid.util.SQLiteUtils;
import com.activeandroid.util.TransactionUtils;
import com.planner5d.library.model.ManagedFile;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nDatafileDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatafileDao.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1863#2,2:149\n1863#2,2:151\n*S KotlinDebug\n*F\n+ 1 DatafileDao.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileDao\n*L\n104#1:149,2\n123#1:151,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191978b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.l f191979a;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f191980c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f191981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f191982b;

        public a(long j10, long j11) {
            this.f191981a = j10;
            this.f191982b = j11;
        }

        public final long a() {
            return this.f191982b;
        }

        public final long b() {
            return this.f191981a;
        }
    }

    @ij.a
    public d(@NotNull com.planner5d.library.model.manager.l databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f191979a = databaseManager;
    }

    @m1
    private final a l(Cursor cursor) throws IOException {
        try {
            try {
                try {
                    if (cursor.moveToNext()) {
                        a aVar = new a(cursor.getLong(0), cursor.getLong(1));
                        kotlin.io.c.a(cursor, null);
                        return aVar;
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(cursor, null);
                    return new a(0L, 0L);
                } catch (Exception e10) {
                    timber.log.b.f381052a.e(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            throw th2;
        } catch (Throwable th3) {
            kotlin.io.c.a(cursor, th2);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list, Set set) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ManagedFile managedFile = (ManagedFile) it.next();
            int iS = managedFile.s(set);
            if (iS != managedFile.downloadPriority) {
                managedFile.downloadPriority = iS;
                managedFile.save();
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ManagedFile) it.next()).save();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new Update(ManagedFile.class).set("download_status = ?", 0).where("id = ?", Long.valueOf(((Number) it.next()).longValue())).execute();
        }
        return Unit.f312394a;
    }

    @m1
    public final void d(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        new Delete().from(ManagedFile.class).where("datafile_version = ?", datafileVersion).execute();
    }

    @m1
    @Nullable
    public final ManagedFile e(@NotNull String datafileVersion, @NotNull String path) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        return (ManagedFile) new Select().from(ManagedFile.class).where("datafile_version = ? AND path = ?", datafileVersion, path).executeSingle();
    }

    @m1
    @NotNull
    public final List<ManagedFile> f(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        List<ManagedFile> listExecute = new Select().from(ManagedFile.class).where("datafile_version = ? AND storage = ? AND in_catalog = 1 AND download_status = ? AND path LIKE ?", datafileVersion, 1, 0, "models/%").execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    @m1
    @NotNull
    public final a g(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        int i10 = 2 | 0;
        Cursor cursorQuery = com.planner5d.library.application.b.f142455c.b().query(this.f191979a.f(ManagedFile.class), new String[]{"COUNT(id) AS total", "SUM(size) AS size"}, "datafile_version = ? AND ((in_catalog = 1 AND storage = ?) OR (storage = ? AND download_status = ?))", new String[]{datafileVersion, com.facebook.appevents.p.f99189d0, "1", "2"}, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        return l(cursorQuery);
    }

    @m1
    @NotNull
    public final a h(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        Cursor cursorQuery = com.planner5d.library.application.b.f142455c.b().query(this.f191979a.f(ManagedFile.class), new String[]{"COUNT(id) AS total", "SUM(size) AS size"}, "datafile_version = ? AND ((in_catalog = 1 AND storage = ?) OR (storage = ? AND (download_status = ? OR download_priority > ?)))", new String[]{datafileVersion, com.facebook.appevents.p.f99189d0, "1", "2", com.facebook.appevents.p.f99189d0}, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        return l(cursorQuery);
    }

    @m1
    public final int i(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        return SQLiteUtils.intQuery("SELECT MAX(download_priority) FROM " + this.f191979a.f(ManagedFile.class) + " WHERE datafile_version = ?", new String[]{datafileVersion});
    }

    @m1
    @NotNull
    public final List<ManagedFile> j(@NotNull String datafileVersion) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        List<ManagedFile> listExecute = new Select().from(ManagedFile.class).where("datafile_version = ? AND in_catalog = 1 AND storage = ? AND download_status = ?", datafileVersion, 1, 2).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    @m1
    @Nullable
    public final ManagedFile k(@NotNull String datafileVersion, int i10) {
        Intrinsics.checkNotNullParameter(datafileVersion, "datafileVersion");
        return (ManagedFile) new Select().from(ManagedFile.class).where("datafile_version = ? AND storage = ? AND download_status = ? AND download_priority >= ?", datafileVersion, 1, 0, Integer.valueOf(i10)).orderBy("download_priority DESC").executeSingle();
    }

    @m1
    public final void m(@NotNull final List<? extends ManagedFile> files, @NotNull final Set<String> itemsNsUser) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(itemsNsUser, "itemsNsUser");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.managedfiles.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.n(files, itemsNsUser);
            }
        });
    }

    @m1
    public final void o() {
        new Update(ManagedFile.class).set("download_status = ?", 0).where("download_status = ?", 1).execute();
    }

    @m1
    public final void p(@NotNull final List<? extends ManagedFile> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.managedfiles.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.q(files);
            }
        });
    }

    @m1
    public final void r(@NotNull final List<Long> missing) {
        Intrinsics.checkNotNullParameter(missing, "missing");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.managedfiles.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.s(missing);
            }
        });
    }
}
