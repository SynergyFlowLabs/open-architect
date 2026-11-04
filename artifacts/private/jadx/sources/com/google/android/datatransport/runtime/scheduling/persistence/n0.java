package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@m1
@ij.f
public class n0 implements com.google.android.datatransport.runtime.scheduling.persistence.d, b6.b, com.google.android.datatransport.runtime.scheduling.persistence.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f103745f = "SQLiteEventStore";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f103746g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f103747h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.android.datatransport.e f103748i = com.google.android.datatransport.e.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f103749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f103752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<String> f103753e;

    interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f103754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f103755b;

        private c(String str, String str2) {
            this.f103754a = str;
            this.f103755b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    @ij.a
    n0(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, e eVar, w0 w0Var, @ij.b("PACKAGE_NAME") ij.c<String> cVar) {
        this.f103749a = w0Var;
        this.f103750b = aVar;
        this.f103751c = aVar2;
        this.f103752d = eVar;
        this.f103753e = cVar;
    }

    public static /* synthetic */ Object E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(EventEntry.tableName, null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    public static /* synthetic */ Long H(n0 n0Var, com.google.android.datatransport.runtime.j jVar, com.google.android.datatransport.runtime.r rVar, SQLiteDatabase sQLiteDatabase) {
        if (n0Var.T0()) {
            n0Var.d(1L, com.google.android.datatransport.runtime.firebase.transport.c.b.CACHE_FULL, jVar.p());
            return -1L;
        }
        long jX0 = n0Var.x0(sQLiteDatabase, rVar);
        int iE = n0Var.f103752d.e();
        byte[] bArrA = jVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jX0));
        contentValues.put("transport_name", jVar.p());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.q()));
        contentValues.put("payload_encoding", jVar.e().b().a());
        contentValues.put("code", jVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, jVar.n());
        contentValues.put("pseudonymous_id", jVar.o());
        contentValues.put("experiment_ids_clear_blob", jVar.g());
        contentValues.put("experiment_ids_encrypted_blob", jVar.h());
        long jInsert = sQLiteDatabase.insert(EventEntry.tableName, null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : jVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private com.google.android.datatransport.runtime.firebase.transport.b H0() {
        return com.google.android.datatransport.runtime.firebase.transport.b.d().b(com.google.android.datatransport.runtime.firebase.transport.e.d().b(y0()).c(e.f103727f.f()).a()).a();
    }

    public static /* synthetic */ Object I(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private long M0() {
        return B0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Long N(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private com.google.android.datatransport.runtime.firebase.transport.f O0() {
        final long jV = this.f103750b.V();
        return (com.google.android.datatransport.runtime.firebase.transport.f) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.k0(jV, (SQLiteDatabase) obj);
            }
        });
    }

    @androidx.annotation.p0
    private Long Q0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.r rVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rVar.b(), String.valueOf(c6.a.a(rVar.d()))));
        if (rVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) p1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.N((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object R(Throwable th2) {
        throw new b6.a("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Object T(String str, com.google.android.datatransport.runtime.firebase.transport.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) p1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.i())}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.i())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put(io.sentry.clientreport.g.b.f305285a, Integer.valueOf(bVar.i()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    private boolean T0() {
        return M0() * t1() >= this.f103752d.f();
    }

    private List<k> U0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                com.google.android.datatransport.runtime.j.a aVarR = next.b().r();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarR.c(cVar.f103754a, cVar.f103755b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarR.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object X(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer Y(final n0 n0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        n0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        p1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.l(this.f103728a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(EventEntry.tableName, "timestamp_ms < ?", strArr));
    }

    private List<k> b1(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.r rVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lQ0 = Q0(sQLiteDatabase, rVar);
        if (lQ0 == null) {
            return arrayList;
        }
        p1(sQLiteDatabase.query(EventEntry.tableName, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lQ0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.d0(this.f103741a, arrayList, rVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ Object d0(n0 n0Var, List list, com.google.android.datatransport.runtime.r rVar, Cursor cursor) {
        n0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            com.google.android.datatransport.runtime.j.a aVarO = com.google.android.datatransport.runtime.j.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new com.google.android.datatransport.runtime.i(l1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new com.google.android.datatransport.runtime.i(l1(cursor.getString(4)), n0Var.h1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(k.a(j10, rVar, aVarO.d()));
        }
        return null;
    }

    private Map<Long, Set<c>> d1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(')');
        p1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.X(map, (Cursor) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return com.google.android.datatransport.runtime.firebase.transport.f.d().c(cursor.getLong(0)).b(j10).a();
    }

    private static byte[] e1(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ List f(n0 n0Var, com.google.android.datatransport.runtime.r rVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listB1 = n0Var.b1(sQLiteDatabase, rVar, n0Var.f103752d.d());
        for (com.google.android.datatransport.h hVar : com.google.android.datatransport.h.values()) {
            if (hVar != rVar.d()) {
                int iD = n0Var.f103752d.d() - listB1.size();
                if (iD <= 0) {
                    break;
                }
                listB1.addAll(n0Var.b1(sQLiteDatabase, rVar.f(hVar), iD));
            }
        }
        return n0Var.U0(listB1, n0Var.d1(sQLiteDatabase, listB1));
    }

    public static /* synthetic */ Object f0(n0 n0Var, SQLiteDatabase sQLiteDatabase) {
        n0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + n0Var.f103750b.V()).execute();
        return null;
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.r.a().b(cursor.getString(1)).d(c6.a.b(cursor.getInt(2))).c(e1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a g0(final n0 n0Var, String str, final Map map, final com.google.android.datatransport.runtime.firebase.transport.a.C0942a c0942a, SQLiteDatabase sQLiteDatabase) {
        n0Var.getClass();
        return (com.google.android.datatransport.runtime.firebase.transport.a) p1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.x(this.f103766a, map, c0942a, (Cursor) obj);
            }
        });
    }

    private void g1(com.google.android.datatransport.runtime.firebase.transport.a.C0942a c0942a, Map<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> map) {
        for (Map.Entry<String, List<com.google.android.datatransport.runtime.firebase.transport.c>> entry : map.entrySet()) {
            c0942a.a(com.google.android.datatransport.runtime.firebase.transport.d.d().d(entry.getKey()).c(entry.getValue()).b());
        }
    }

    public static /* synthetic */ Object h(n0 n0Var, Cursor cursor) {
        n0Var.getClass();
        while (cursor.moveToNext()) {
            n0Var.d(cursor.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private byte[] h1(long j10) {
        return (byte[]) p1(B0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.r((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ SQLiteDatabase j(Throwable th2) {
        throw new b6.a("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Long j0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private <T> T j1(d<T> dVar, b<Throwable, T> bVar) {
        long jV = this.f103751c.V();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f103751c.V() >= ((long) this.f103752d.b()) + jV) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.f k0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.f) p1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.e(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object l(n0 n0Var, Cursor cursor) {
        n0Var.getClass();
        while (cursor.moveToNext()) {
            n0Var.d(cursor.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private static com.google.android.datatransport.e l1(@androidx.annotation.p0 String str) {
        return str == null ? f103748i : com.google.android.datatransport.e.b(str);
    }

    public static /* synthetic */ Object m(final n0 n0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        n0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        p1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.h(this.f103744a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean o(n0 n0Var, com.google.android.datatransport.runtime.r rVar, SQLiteDatabase sQLiteDatabase) {
        Long lQ0 = n0Var.Q0(sQLiteDatabase, rVar);
        return lQ0 == null ? Boolean.FALSE : (Boolean) p1(n0Var.B0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lQ0.toString()}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private static String o1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @l1
    static <T> T p1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            T tApply = bVar.apply(cursor);
            cursor.close();
            return tApply;
        } catch (Throwable th2) {
            cursor.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object q(long j10, com.google.android.datatransport.runtime.r rVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(c6.a.a(rVar.d()))}) < 1) {
            contentValues.put("backend_name", rVar.b());
            contentValues.put("priority", Integer.valueOf(c6.a.a(rVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] r(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private com.google.android.datatransport.runtime.firebase.transport.c.b r0(int i10) {
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar = com.google.android.datatransport.runtime.firebase.transport.c.b.REASON_UNKNOWN;
        if (i10 == bVar.i()) {
            return bVar;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar2 = com.google.android.datatransport.runtime.firebase.transport.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.i()) {
            return bVar2;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar3 = com.google.android.datatransport.runtime.firebase.transport.c.b.CACHE_FULL;
        if (i10 == bVar3.i()) {
            return bVar3;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar4 = com.google.android.datatransport.runtime.firebase.transport.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.i()) {
            return bVar4;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar5 = com.google.android.datatransport.runtime.firebase.transport.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.i()) {
            return bVar5;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar6 = com.google.android.datatransport.runtime.firebase.transport.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.i()) {
            return bVar6;
        }
        com.google.android.datatransport.runtime.firebase.transport.c.b bVar7 = com.google.android.datatransport.runtime.firebase.transport.c.b.SERVER_ERROR;
        if (i10 == bVar7.i()) {
            return bVar7;
        }
        z5.a.c(f103745f, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    public static /* synthetic */ List t(SQLiteDatabase sQLiteDatabase) {
        return (List) p1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.g((Cursor) obj);
            }
        });
    }

    private long t1() {
        return B0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private void w0(final SQLiteDatabase sQLiteDatabase) {
        j1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return n0.I(sQLiteDatabase);
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.R((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a x(n0 n0Var, Map map, com.google.android.datatransport.runtime.firebase.transport.a.C0942a c0942a, Cursor cursor) {
        n0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            com.google.android.datatransport.runtime.firebase.transport.c.b bVarR0 = n0Var.r0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(com.google.android.datatransport.runtime.firebase.transport.c.d().c(bVarR0).b(j10).a());
        }
        n0Var.g1(c0942a, map);
        return c0942a.f(n0Var.O0()).d(n0Var.H0()).c(n0Var.f103753e.get()).b();
    }

    private long x0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.r rVar) {
        Long lQ0 = Q0(sQLiteDatabase, rVar);
        if (lQ0 != null) {
            return lQ0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", rVar.b());
        contentValues.put("priority", Integer.valueOf(c6.a.a(rVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (rVar.c() != null) {
            contentValues.put(com.facebook.bolts.e.f99330c, Base64.encodeToString(rVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @l1
    SQLiteDatabase B0() {
        final w0 w0Var = this.f103749a;
        Objects.requireNonNull(w0Var);
        return (SQLiteDatabase) j1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.d
            public final Object a() {
                return w0Var.getWritableDatabase();
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.j((Throwable) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public long Bb(com.google.android.datatransport.runtime.r rVar) {
        return ((Long) p1(B0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(c6.a.a(rVar.d()))}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.j0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<com.google.android.datatransport.runtime.r> E9() {
        return (Iterable) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.t((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public boolean Lb(final com.google.android.datatransport.runtime.r rVar) {
        return ((Boolean) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.o(this.f103764a, rVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void Q8(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            B0().compileStatement("DELETE FROM events WHERE _id in " + o1(iterable)).execute();
        }
    }

    @l1
    <T> T R0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseB0 = B0();
        sQLiteDatabaseB0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseB0);
            sQLiteDatabaseB0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseB0.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void Rb(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + o1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
                public final Object apply(Object obj) {
                    return n0.m(this.f103775a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void a() {
        R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.f0(this.f103771a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // b6.b
    public <T> T b(b6.b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseB0 = B0();
        w0(sQLiteDatabaseB0);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseB0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseB0.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public com.google.android.datatransport.runtime.firebase.transport.a c() {
        final com.google.android.datatransport.runtime.firebase.transport.a.C0942a c0942aH = com.google.android.datatransport.runtime.firebase.transport.a.h();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (com.google.android.datatransport.runtime.firebase.transport.a) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.g0(this.f103737a, str, map, c0942aH, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f103749a.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public void d(final long j10, final com.google.android.datatransport.runtime.firebase.transport.c.b bVar, final String str) {
        R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.T(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @b1({b1.a.TESTS})
    public void o0() {
        R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.E((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public int p0() {
        final long jV = this.f103750b.V() - this.f103752d.c();
        return ((Integer) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.Y(this.f103773a, jV, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    @androidx.annotation.p0
    public k te(final com.google.android.datatransport.runtime.r rVar, final com.google.android.datatransport.runtime.j jVar) {
        z5.a.e(f103745f, "Storing event with priority=%s, name=%s for destination %s", rVar.d(), jVar.p(), rVar.b());
        long jLongValue = ((Long) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.H(this.f103761a, jVar, rVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, rVar, jVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public void v2(final com.google.android.datatransport.runtime.r rVar, final long j10) {
        R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.q(j10, rVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public Iterable<k> wc(final com.google.android.datatransport.runtime.r rVar) {
        return (Iterable) R0(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
            public final Object apply(Object obj) {
                return n0.f(this.f103734a, rVar, (SQLiteDatabase) obj);
            }
        });
    }

    @l1
    long y0() {
        return M0() * t1();
    }
}
