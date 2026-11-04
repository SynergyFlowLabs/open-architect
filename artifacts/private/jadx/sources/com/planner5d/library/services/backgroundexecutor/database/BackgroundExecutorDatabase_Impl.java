package com.planner5d.library.services.backgroundexecutor.database;

import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.d2;
import androidx.room.e2;
import androidx.room.l0;
import androidx.room.n;
import androidx.room.util.g;
import io.sentry.o7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class BackgroundExecutorDatabase_Impl extends BackgroundExecutorDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile c f223998a;

    class a extends e2.b {
        a(int version) {
            super(version);
        }

        @Override // androidx.room.e2.b
        public void createAllTables(@NonNull final w3.d db2) {
            db2.X8("CREATE TABLE IF NOT EXISTS `crash_record` (`timestamp_millis` INTEGER NOT NULL, `thread_id` INTEGER NOT NULL, `thread_name` TEXT NOT NULL, `exception` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            db2.X8(d2.f74748g);
            db2.X8("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0d610a7e1031352bae62e91b2681e2ba')");
        }

        @Override // androidx.room.e2.b
        public void dropAllTables(@NonNull final w3.d db2) {
            db2.X8("DROP TABLE IF EXISTS `crash_record`");
            List list = ((b2) BackgroundExecutorDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).b(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onCreate(@NonNull final w3.d db2) {
            List list = ((b2) BackgroundExecutorDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).a(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onOpen(@NonNull final w3.d db2) {
            ((b2) BackgroundExecutorDatabase_Impl.this).mDatabase = db2;
            BackgroundExecutorDatabase_Impl.this.internalInitInvalidationTracker(db2);
            List list = ((b2) BackgroundExecutorDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).c(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onPostMigrate(@NonNull final w3.d db2) {
        }

        @Override // androidx.room.e2.b
        public void onPreMigrate(@NonNull final w3.d db2) throws IOException {
            androidx.room.util.b.b(db2);
        }

        @Override // androidx.room.e2.b
        @NonNull
        public e2.c onValidateSchema(@NonNull final w3.d db2) {
            HashMap map = new HashMap(5);
            map.put("timestamp_millis", new g.a("timestamp_millis", "INTEGER", true, 0, null, 1));
            map.put("thread_id", new g.a("thread_id", "INTEGER", true, 0, null, 1));
            int i10 = 7 & 0;
            map.put("thread_name", new g.a("thread_name", "TEXT", true, 0, null, 1));
            map.put(o7.b.f305964e, new g.a(o7.b.f305964e, "BLOB", true, 0, null, 1));
            map.put("id", new g.a("id", "INTEGER", true, 1, null, 1));
            g gVar = new g("crash_record", map, new HashSet(0), new HashSet(0));
            g gVarA = g.a(db2, "crash_record");
            if (gVar.equals(gVarA)) {
                return new e2.c(true, null);
            }
            return new e2.c(false, "crash_record(com.planner5d.library.services.backgroundexecutor.database.CrashRecord).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
        }
    }

    @Override // androidx.room.b2
    public void clearAllTables() {
        super.assertNotMainThread();
        w3.d writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.X8("DELETE FROM `crash_record`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (writableDatabase.pe()) {
                return;
            }
            writableDatabase.X8("VACUUM");
        } catch (Throwable th2) {
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.pe()) {
                writableDatabase.X8("VACUUM");
            }
            throw th2;
        }
    }

    @Override // androidx.room.b2
    @NonNull
    protected l0 createInvalidationTracker() {
        return new l0(this, new HashMap(0), new HashMap(0), "crash_record");
    }

    @Override // androidx.room.b2
    @NonNull
    protected w3.e createOpenHelper(@NonNull final n config) {
        return config.f75015c.a(w3.e.b.a(config.f75013a).d(config.f75014b).c(new e2(config, new a(1), "0d610a7e1031352bae62e91b2681e2ba", "390a829a7d65f4b2c618276a92525f36")).b());
    }

    @Override // com.planner5d.library.services.backgroundexecutor.database.BackgroundExecutorDatabase
    public c d() {
        c cVar;
        if (this.f223998a != null) {
            return this.f223998a;
        }
        synchronized (this) {
            try {
                if (this.f223998a == null) {
                    this.f223998a = new d(this);
                }
                cVar = this.f223998a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.room.b2
    @NonNull
    public List<androidx.room.migration.b> getAutoMigrations(@NonNull final Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // androidx.room.b2
    @NonNull
    public Set<Class<? extends androidx.room.migration.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b2
    @NonNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(c.class, d.h());
        return map;
    }
}
