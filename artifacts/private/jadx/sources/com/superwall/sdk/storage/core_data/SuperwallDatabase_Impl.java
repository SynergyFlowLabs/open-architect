package com.superwall.sdk.storage.core_data;

import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.d2;
import androidx.room.e2;
import androidx.room.l0;
import androidx.room.n;
import androidx.room.util.g;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao;
import com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w3.d;
import w3.e;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallDatabase_Impl extends SuperwallDatabase {
    private volatile ManagedEventDataDao _managedEventDataDao;
    private volatile ManagedTriggerRuleOccurrenceDao _managedTriggerRuleOccurrenceDao;

    @Override // androidx.room.b2
    public void clearAllTables() {
        super.assertNotMainThread();
        d writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.X8("DELETE FROM `ManagedEventData`");
            writableDatabase.X8("DELETE FROM `ManagedTriggerRuleOccurrence`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            boolean zPe = writableDatabase.pe();
        } finally {
            super.endTransaction();
            writableDatabase.yd("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.pe()) {
                writableDatabase.X8("VACUUM");
            }
        }
    }

    @Override // androidx.room.b2
    @NonNull
    protected l0 createInvalidationTracker() {
        return new l0(this, new HashMap(0), new HashMap(0), "ManagedEventData", "ManagedTriggerRuleOccurrence");
    }

    @Override // androidx.room.b2
    @NonNull
    protected e createOpenHelper(@NonNull final n config) {
        return config.f75015c.a(e.b.a(config.f75013a).d(config.f75014b).c(new e2(config, new e2.b(1) { // from class: com.superwall.sdk.storage.core_data.SuperwallDatabase_Impl.1
            @Override // androidx.room.e2.b
            public void createAllTables(@NonNull final d db2) {
                db2.X8("CREATE TABLE IF NOT EXISTS `ManagedEventData` (`id` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `name` TEXT NOT NULL, `parameters` TEXT NOT NULL, PRIMARY KEY(`id`))");
                db2.X8("CREATE TABLE IF NOT EXISTS `ManagedTriggerRuleOccurrence` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `createdAt` INTEGER NOT NULL, `occurrenceKey` TEXT NOT NULL)");
                db2.X8(d2.f74748g);
                db2.X8("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '11f00dc53be30cfe213781d453297cf1')");
            }

            @Override // androidx.room.e2.b
            public void dropAllTables(@NonNull final d db2) {
                db2.X8("DROP TABLE IF EXISTS `ManagedEventData`");
                db2.X8("DROP TABLE IF EXISTS `ManagedTriggerRuleOccurrence`");
                List list = ((b2) SuperwallDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((b2.b) it.next()).b(db2);
                    }
                }
            }

            @Override // androidx.room.e2.b
            public void onCreate(@NonNull final d db2) {
                List list = ((b2) SuperwallDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((b2.b) it.next()).a(db2);
                    }
                }
            }

            @Override // androidx.room.e2.b
            public void onOpen(@NonNull final d db2) {
                ((b2) SuperwallDatabase_Impl.this).mDatabase = db2;
                SuperwallDatabase_Impl.this.internalInitInvalidationTracker(db2);
                List list = ((b2) SuperwallDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((b2.b) it.next()).c(db2);
                    }
                }
            }

            @Override // androidx.room.e2.b
            public void onPostMigrate(@NonNull final d db2) {
            }

            @Override // androidx.room.e2.b
            public void onPreMigrate(@NonNull final d db2) throws IOException {
                androidx.room.util.b.b(db2);
            }

            @Override // androidx.room.e2.b
            @NonNull
            public e2.c onValidateSchema(@NonNull final d db2) {
                HashMap map = new HashMap(4);
                map.put("id", new g.a("id", "TEXT", true, 1, null, 1));
                map.put("createdAt", new g.a("createdAt", "INTEGER", true, 0, null, 1));
                map.put("name", new g.a("name", "TEXT", true, 0, null, 1));
                map.put(ExperimentsEntry.parameters, new g.a(ExperimentsEntry.parameters, "TEXT", true, 0, null, 1));
                g gVar = new g("ManagedEventData", map, new HashSet(0), new HashSet(0));
                g gVarA = g.a(db2, "ManagedEventData");
                if (!gVar.equals(gVarA)) {
                    return new e2.c(false, "ManagedEventData(com.superwall.sdk.storage.core_data.entities.ManagedEventData).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
                }
                HashMap map2 = new HashMap(3);
                map2.put("id", new g.a("id", "INTEGER", false, 1, null, 1));
                map2.put("createdAt", new g.a("createdAt", "INTEGER", true, 0, null, 1));
                map2.put("occurrenceKey", new g.a("occurrenceKey", "TEXT", true, 0, null, 1));
                g gVar2 = new g("ManagedTriggerRuleOccurrence", map2, new HashSet(0), new HashSet(0));
                g gVarA2 = g.a(db2, "ManagedTriggerRuleOccurrence");
                if (gVar2.equals(gVarA2)) {
                    return new e2.c(true, null);
                }
                return new e2.c(false, "ManagedTriggerRuleOccurrence(com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrence).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
        }, "11f00dc53be30cfe213781d453297cf1", "ee4655b3ec0d2ace448aa481008538b7")).b());
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
        map.put(ManagedEventDataDao.class, ManagedEventDataDao_Impl.getRequiredConverters());
        map.put(ManagedTriggerRuleOccurrenceDao.class, ManagedTriggerRuleOccurrenceDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.superwall.sdk.storage.core_data.SuperwallDatabase
    public ManagedEventDataDao managedEventDataDao() {
        ManagedEventDataDao managedEventDataDao;
        if (this._managedEventDataDao != null) {
            return this._managedEventDataDao;
        }
        synchronized (this) {
            try {
                if (this._managedEventDataDao == null) {
                    this._managedEventDataDao = new ManagedEventDataDao_Impl(this);
                }
                managedEventDataDao = this._managedEventDataDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return managedEventDataDao;
    }

    @Override // com.superwall.sdk.storage.core_data.SuperwallDatabase
    public ManagedTriggerRuleOccurrenceDao managedTriggerRuleOccurrenceDao() {
        ManagedTriggerRuleOccurrenceDao managedTriggerRuleOccurrenceDao;
        if (this._managedTriggerRuleOccurrenceDao != null) {
            return this._managedTriggerRuleOccurrenceDao;
        }
        synchronized (this) {
            try {
                if (this._managedTriggerRuleOccurrenceDao == null) {
                    this._managedTriggerRuleOccurrenceDao = new ManagedTriggerRuleOccurrenceDao_Impl(this);
                }
                managedTriggerRuleOccurrenceDao = this._managedTriggerRuleOccurrenceDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return managedTriggerRuleOccurrenceDao;
    }
}
