package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class w0 extends SQLiteOpenHelper {
    private static final a H1;
    private static final a X;
    private static final a Y;
    private static final a Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f103778c = "com.google.android.datatransport.events";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f103779d = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f103780e = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f103781f = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f103782g = "CREATE INDEX events_backend_id on events(context_id)";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final List<a> f103783g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f103784h = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f103785i = "DROP TABLE events";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f103786j = "DROP TABLE event_metadata";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f103787k = "DROP TABLE transport_contexts";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f103788l = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f103789m = "DROP TABLE IF EXISTS event_payloads";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f103790n = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f103791o = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final a f103792p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final a f103793p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final a f103794p2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f103796t = "DROP TABLE IF EXISTS log_event_dropped";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f103797v = "DROP TABLE IF EXISTS global_log_event_state";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103800b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f103795s = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static int f103798w = 7;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.a(sQLiteDatabase);
            }
        };
        X = aVar;
        a aVar2 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.f(sQLiteDatabase);
            }
        };
        Y = aVar2;
        a aVar3 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        Z = aVar3;
        a aVar4 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.g(sQLiteDatabase);
            }
        };
        f103792p0 = aVar4;
        a aVar5 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.d(sQLiteDatabase);
            }
        };
        f103793p1 = aVar5;
        a aVar6 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        H1 = aVar6;
        a aVar7 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.w0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                w0.b(sQLiteDatabase);
            }
        };
        f103794p2 = aVar7;
        f103783g3 = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    @ij.a
    w0(Context context, @ij.b("SQLITE_DB_NAME") String str, @ij.b("SCHEMA_VERSION") int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f103800b = false;
        this.f103799a = i10;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f103779d);
        sQLiteDatabase.execSQL(f103780e);
        sQLiteDatabase.execSQL(f103781f);
        sQLiteDatabase.execSQL(f103782g);
        sQLiteDatabase.execSQL(f103784h);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f103796t);
        sQLiteDatabase.execSQL(f103797v);
        sQLiteDatabase.execSQL(f103790n);
        sQLiteDatabase.execSQL(f103791o);
        sQLiteDatabase.execSQL(f103795s);
    }

    public static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f103789m);
        sQLiteDatabase.execSQL(f103788l);
    }

    private void h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f103800b) {
            onConfigure(sQLiteDatabase);
        }
    }

    private void j(SQLiteDatabase sQLiteDatabase, int i10) {
        h(sQLiteDatabase);
        l(sQLiteDatabase, 0, i10);
    }

    private void l(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f103783g3;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f103783g3.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f103800b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        j(sQLiteDatabase, this.f103799a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(f103785i);
        sQLiteDatabase.execSQL(f103786j);
        sQLiteDatabase.execSQL(f103787k);
        sQLiteDatabase.execSQL(f103789m);
        sQLiteDatabase.execSQL(f103796t);
        sQLiteDatabase.execSQL(f103797v);
        j(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        h(sQLiteDatabase);
        l(sQLiteDatabase, i10, i11);
    }
}
