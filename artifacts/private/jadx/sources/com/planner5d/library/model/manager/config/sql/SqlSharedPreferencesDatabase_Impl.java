package com.planner5d.library.model.manager.config.sql;

import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.d2;
import androidx.room.e2;
import androidx.room.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class SqlSharedPreferencesDatabase_Impl extends SqlSharedPreferencesDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e f190634a;

    class a extends e2.b {
        a(int version) {
            super(version);
        }

        @Override // androidx.room.e2.b
        public void createAllTables(@NonNull final w3.d db2) {
            db2.X8("CREATE TABLE IF NOT EXISTS `shared_preferences_records` (`name` TEXT NOT NULL, `value` BLOB NOT NULL, PRIMARY KEY(`name`))");
            db2.X8(d2.f74748g);
            db2.X8("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '29bb7c8c2454f054f3c38e8c8a59a62f')");
        }

        @Override // androidx.room.e2.b
        public void dropAllTables(@NonNull final w3.d db2) {
            db2.X8("DROP TABLE IF EXISTS `shared_preferences_records`");
            List list = ((b2) SqlSharedPreferencesDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).b(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onCreate(@NonNull final w3.d db2) {
            List list = ((b2) SqlSharedPreferencesDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b2.b) it.next()).a(db2);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onOpen(@NonNull final w3.d db2) {
            ((b2) SqlSharedPreferencesDatabase_Impl.this).mDatabase = db2;
            SqlSharedPreferencesDatabase_Impl.this.internalInitInvalidationTracker(db2);
            List list = ((b2) SqlSharedPreferencesDatabase_Impl.this).mCallbacks;
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
            HashMap map = new HashMap(2);
            map.put("name", new androidx.room.util.g.a("name", "TEXT", true, 1, null, 1));
            map.put("value", new androidx.room.util.g.a("value", "BLOB", true, 0, null, 1));
            androidx.room.util.g gVar = new androidx.room.util.g("shared_preferences_records", map, new HashSet(0), new HashSet(0));
            androidx.room.util.g gVarA = androidx.room.util.g.a(db2, "shared_preferences_records");
            if (gVar.equals(gVarA)) {
                return new e2.c(true, null);
            }
            return new e2.c(false, "shared_preferences_records(com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesRecord).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
        }
    }

    @Override // androidx.room.b2
    public void clearAllTables() {
        super.assertNotMainThread();
        w3.d writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.X8("DELETE FROM `shared_preferences_records`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.pe()) {
                writableDatabase.X8("VACUUM");
            }
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
        return new l0(this, new HashMap(0), new HashMap(0), "shared_preferences_records");
    }

    @Override // androidx.room.b2
    @NonNull
    protected w3.e createOpenHelper(@NonNull final androidx.room.n config) {
        return config.f75015c.a(w3.e.b.a(config.f75013a).d(config.f75014b).c(new e2(config, new a(1), "29bb7c8c2454f054f3c38e8c8a59a62f", "d9443eaf079d831b612f6369449cb8d9")).b());
    }

    @Override // com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesDatabase
    public e d() {
        e eVar;
        if (this.f190634a != null) {
            return this.f190634a;
        }
        synchronized (this) {
            try {
                if (this.f190634a == null) {
                    this.f190634a = new f(this);
                }
                eVar = this.f190634a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
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
        map.put(e.class, f.z());
        return map;
    }
}
