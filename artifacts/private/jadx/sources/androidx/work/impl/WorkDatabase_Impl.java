package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.d2;
import androidx.room.e2;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile androidx.work.impl.model.w f76567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile androidx.work.impl.model.b f76568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile androidx.work.impl.model.b0 f76569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile androidx.work.impl.model.k f76570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile androidx.work.impl.model.p f76571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile androidx.work.impl.model.s f76572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile androidx.work.impl.model.e f76573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile androidx.work.impl.model.g f76574i;

    class a extends e2.b {
        a(int version) {
            super(version);
        }

        @Override // androidx.room.e2.b
        public void createAllTables(w3.d _db) {
            _db.X8("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            _db.X8("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            _db.X8("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            _db.X8("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.X8("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.X8("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            _db.X8("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.X8(androidx.work.impl.utils.t.f77263c);
            _db.X8(d2.f74748g);
            _db.X8("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        @Override // androidx.room.e2.b
        public void dropAllTables(w3.d _db) {
            _db.X8("DROP TABLE IF EXISTS `Dependency`");
            _db.X8("DROP TABLE IF EXISTS `WorkSpec`");
            _db.X8("DROP TABLE IF EXISTS `WorkTag`");
            _db.X8("DROP TABLE IF EXISTS `SystemIdInfo`");
            _db.X8("DROP TABLE IF EXISTS `WorkName`");
            _db.X8("DROP TABLE IF EXISTS `WorkProgress`");
            _db.X8("DROP TABLE IF EXISTS `Preference`");
            if (((b2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((b2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((b2.b) ((b2) WorkDatabase_Impl.this).mCallbacks.get(i10)).b(_db);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onCreate(w3.d _db) {
            if (((b2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((b2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((b2.b) ((b2) WorkDatabase_Impl.this).mCallbacks.get(i10)).a(_db);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onOpen(w3.d _db) {
            ((b2) WorkDatabase_Impl.this).mDatabase = _db;
            _db.X8("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (((b2) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((b2) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((b2.b) ((b2) WorkDatabase_Impl.this).mCallbacks.get(i10)).c(_db);
                }
            }
        }

        @Override // androidx.room.e2.b
        public void onPostMigrate(w3.d _db) {
        }

        @Override // androidx.room.e2.b
        public void onPreMigrate(w3.d _db) throws IOException {
            androidx.room.util.b.b(_db);
        }

        @Override // androidx.room.e2.b
        public e2.c onValidateSchema(w3.d _db) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new androidx.room.util.g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new androidx.room.util.g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new androidx.room.util.g.f("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new androidx.room.util.g.f("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar = new androidx.room.util.g("Dependency", map, hashSet, hashSet2);
            androidx.room.util.g gVarA = androidx.room.util.g.a(_db, "Dependency");
            if (!gVar.equals(gVarA)) {
                return new e2.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
            }
            HashMap map2 = new HashMap(30);
            map2.put("id", new androidx.room.util.g.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new androidx.room.util.g.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new androidx.room.util.g.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new androidx.room.util.g.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put(MetricTracker.Object.INPUT, new androidx.room.util.g.a(MetricTracker.Object.INPUT, "BLOB", true, 0, null, 1));
            map2.put("output", new androidx.room.util.g.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new androidx.room.util.g.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new androidx.room.util.g.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new androidx.room.util.g.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new androidx.room.util.g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new androidx.room.util.g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new androidx.room.util.g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new androidx.room.util.g.a("last_enqueue_time", "INTEGER", true, 0, CreateTicketViewModelKt.EmailId, 1));
            map2.put("minimum_retention_duration", new androidx.room.util.g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new androidx.room.util.g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new androidx.room.util.g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new androidx.room.util.g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new androidx.room.util.g.a("period_count", "INTEGER", true, 0, com.facebook.appevents.p.f99189d0, 1));
            map2.put("generation", new androidx.room.util.g.a("generation", "INTEGER", true, 0, com.facebook.appevents.p.f99189d0, 1));
            map2.put("next_schedule_time_override", new androidx.room.util.g.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new androidx.room.util.g.a("next_schedule_time_override_generation", "INTEGER", true, 0, com.facebook.appevents.p.f99189d0, 1));
            map2.put(androidx.media3.exoplayer.offline.u.Z, new androidx.room.util.g.a(androidx.media3.exoplayer.offline.u.Z, "INTEGER", true, 0, "-256", 1));
            map2.put("required_network_type", new androidx.room.util.g.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new androidx.room.util.g.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new androidx.room.util.g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new androidx.room.util.g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new androidx.room.util.g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new androidx.room.util.g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new androidx.room.util.g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new androidx.room.util.g.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new androidx.room.util.g.f("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new androidx.room.util.g.f("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            androidx.room.util.g gVar2 = new androidx.room.util.g("WorkSpec", map2, hashSet3, hashSet4);
            androidx.room.util.g gVarA2 = androidx.room.util.g.a(_db, "WorkSpec");
            if (!gVar2.equals(gVarA2)) {
                return new e2.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new androidx.room.util.g.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new androidx.room.util.g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new androidx.room.util.g.f("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar3 = new androidx.room.util.g("WorkTag", map3, hashSet5, hashSet6);
            androidx.room.util.g gVarA3 = androidx.room.util.g.a(_db, "WorkTag");
            if (!gVar3.equals(gVarA3)) {
                return new e2.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + gVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new androidx.room.util.g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new androidx.room.util.g.a("generation", "INTEGER", true, 2, com.facebook.appevents.p.f99189d0, 1));
            map4.put("system_id", new androidx.room.util.g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.g gVar4 = new androidx.room.util.g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            androidx.room.util.g gVarA4 = androidx.room.util.g.a(_db, "SystemIdInfo");
            if (!gVar4.equals(gVarA4)) {
                return new e2.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + gVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new androidx.room.util.g.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new androidx.room.util.g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new androidx.room.util.g.f("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            androidx.room.util.g gVar5 = new androidx.room.util.g("WorkName", map5, hashSet8, hashSet9);
            androidx.room.util.g gVarA5 = androidx.room.util.g.a(_db, "WorkName");
            if (!gVar5.equals(gVarA5)) {
                return new e2.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + gVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new androidx.room.util.g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new androidx.room.util.g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new androidx.room.util.g.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.util.g gVar6 = new androidx.room.util.g("WorkProgress", map6, hashSet10, new HashSet(0));
            androidx.room.util.g gVarA6 = androidx.room.util.g.a(_db, "WorkProgress");
            if (!gVar6.equals(gVarA6)) {
                return new e2.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + gVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new androidx.room.util.g.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new androidx.room.util.g.a("long_value", "INTEGER", false, 0, null, 1));
            androidx.room.util.g gVar7 = new androidx.room.util.g("Preference", map7, new HashSet(0), new HashSet(0));
            androidx.room.util.g gVarA7 = androidx.room.util.g.a(_db, "Preference");
            if (gVar7.equals(gVarA7)) {
                return new e2.c(true, null);
            }
            return new e2.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + gVarA7);
        }
    }

    @Override // androidx.room.b2
    public void clearAllTables() {
        super.assertNotMainThread();
        w3.d writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.X8("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.X8("DELETE FROM `Dependency`");
            writableDatabase.X8("DELETE FROM `WorkSpec`");
            writableDatabase.X8("DELETE FROM `WorkTag`");
            writableDatabase.X8("DELETE FROM `SystemIdInfo`");
            writableDatabase.X8("DELETE FROM `WorkName`");
            writableDatabase.X8("DELETE FROM `WorkProgress`");
            writableDatabase.X8("DELETE FROM `Preference`");
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
    protected androidx.room.l0 createInvalidationTracker() {
        return new androidx.room.l0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.b2
    protected w3.e createOpenHelper(androidx.room.n configuration) {
        return configuration.f75015c.a(w3.e.b.a(configuration.f75013a).d(configuration.f75014b).c(new e2(configuration, new a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.b e() {
        androidx.work.impl.model.b bVar;
        if (this.f76568c != null) {
            return this.f76568c;
        }
        synchronized (this) {
            try {
                if (this.f76568c == null) {
                    this.f76568c = new androidx.work.impl.model.c(this);
                }
                bVar = this.f76568c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.e f() {
        androidx.work.impl.model.e eVar;
        if (this.f76573h != null) {
            return this.f76573h;
        }
        synchronized (this) {
            try {
                if (this.f76573h == null) {
                    this.f76573h = new androidx.work.impl.model.f(this);
                }
                eVar = this.f76573h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.g g() {
        androidx.work.impl.model.g gVar;
        if (this.f76574i != null) {
            return this.f76574i;
        }
        synchronized (this) {
            try {
                if (this.f76574i == null) {
                    this.f76574i = new androidx.work.impl.model.i(this);
                }
                gVar = this.f76574i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // androidx.room.b2
    public List<androidx.room.migration.b> getAutoMigrations(@NonNull Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecsMap) {
        return Arrays.asList(new j0(), new k0(), new l0(), new m0(), new n0(), new o0());
    }

    @Override // androidx.room.b2
    public Set<Class<? extends androidx.room.migration.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b2
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(androidx.work.impl.model.w.class, androidx.work.impl.model.y.Y());
        map.put(androidx.work.impl.model.b.class, androidx.work.impl.model.c.f());
        map.put(androidx.work.impl.model.b0.class, androidx.work.impl.model.c0.g());
        map.put(androidx.work.impl.model.k.class, androidx.work.impl.model.l.j());
        map.put(androidx.work.impl.model.p.class, androidx.work.impl.model.q.d());
        map.put(androidx.work.impl.model.s.class, androidx.work.impl.model.t.d());
        map.put(androidx.work.impl.model.e.class, androidx.work.impl.model.f.e());
        map.put(androidx.work.impl.model.g.class, androidx.work.impl.model.i.i());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.k h() {
        androidx.work.impl.model.k kVar;
        if (this.f76570e != null) {
            return this.f76570e;
        }
        synchronized (this) {
            try {
                if (this.f76570e == null) {
                    this.f76570e = new androidx.work.impl.model.l(this);
                }
                kVar = this.f76570e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.p i() {
        androidx.work.impl.model.p pVar;
        if (this.f76571f != null) {
            return this.f76571f;
        }
        synchronized (this) {
            try {
                if (this.f76571f == null) {
                    this.f76571f = new androidx.work.impl.model.q(this);
                }
                pVar = this.f76571f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.s j() {
        androidx.work.impl.model.s sVar;
        if (this.f76572g != null) {
            return this.f76572g;
        }
        synchronized (this) {
            try {
                if (this.f76572g == null) {
                    this.f76572g = new androidx.work.impl.model.t(this);
                }
                sVar = this.f76572g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.w k() {
        androidx.work.impl.model.w wVar;
        if (this.f76567b != null) {
            return this.f76567b;
        }
        synchronized (this) {
            try {
                if (this.f76567b == null) {
                    this.f76567b = new androidx.work.impl.model.y(this);
                }
                wVar = this.f76567b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.b0 l() {
        androidx.work.impl.model.b0 b0Var;
        if (this.f76569d != null) {
            return this.f76569d;
        }
        synchronized (this) {
            try {
                if (this.f76569d == null) {
                    this.f76569d = new androidx.work.impl.model.c0(this);
                }
                b0Var = this.f76569d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }
}
