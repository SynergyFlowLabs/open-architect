package androidx.media3.exoplayer.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements e0 {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 10;
    private static final int H = 11;
    private static final int I = 12;
    private static final int J = 13;
    private static final int K = 14;
    private static final String L = "id = ?";
    private static final String M = "state = 2";
    private static final String P = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    private static final String Q = "1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64369f = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final int f64370g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f64371h = "id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f64373j = "uri";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f64376m = "data";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64377n = "state";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f64381r = "stop_reason";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f64386w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f64387x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f64388y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f64389z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f64391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.database.b f64392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f64393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("initializationLock")
    private boolean f64394e;
    private static final String N = p(3, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64372i = "mime_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f64374k = "stream_keys";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f64375l = "custom_cache_key";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f64378o = "start_time_ms";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f64379p = "update_time_ms";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f64380q = "content_length";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f64382s = "failure_reason";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f64383t = "percent_downloaded";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f64384u = "bytes_downloaded";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f64385v = "key_set_id";
    private static final String[] O = {"id", f64372i, "uri", f64374k, f64375l, "data", "state", f64378o, f64379p, f64380q, "stop_reason", f64382s, f64383t, f64384u, f64385v};

    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f64395a;

        @Override // androidx.media3.exoplayer.offline.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f64395a.close();
        }

        @Override // androidx.media3.exoplayer.offline.e
        public int getCount() {
            return this.f64395a.getCount();
        }

        @Override // androidx.media3.exoplayer.offline.e
        public int getPosition() {
            return this.f64395a.getPosition();
        }

        @Override // androidx.media3.exoplayer.offline.e
        public boolean isClosed() {
            return this.f64395a.isClosed();
        }

        @Override // androidx.media3.exoplayer.offline.e
        public boolean moveToPosition(int i10) {
            return this.f64395a.moveToPosition(i10);
        }

        @Override // androidx.media3.exoplayer.offline.e
        public d z4() {
            return a.n(this.f64395a);
        }

        private b(Cursor cursor) {
            this.f64395a = cursor;
        }
    }

    public a(androidx.media3.database.b bVar) {
        this(bVar, "");
    }

    private static List<StreamKey> j(@p0 String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : k1.l2(str, ",")) {
                String[] strArrL2 = k1.l2(str2, "\\.");
                androidx.media3.common.util.a.i(strArrL2.length == 3);
                arrayList.add(new StreamKey(Integer.parseInt(strArrL2[0]), Integer.parseInt(strArrL2[1]), Integer.parseInt(strArrL2[2])));
            }
        }
        return arrayList;
    }

    @l1
    static String k(List<StreamKey> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            StreamKey streamKey = list.get(i10);
            sb2.append(streamKey.f60277a);
            sb2.append('.');
            sb2.append(streamKey.f60278b);
            sb2.append('.');
            sb2.append(streamKey.f60279c);
            sb2.append(AbstractJsonLexerKt.COMMA);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private void l() throws androidx.media3.database.a {
        synchronized (this.f64393d) {
            if (this.f64394e) {
                return;
            }
            try {
                int iB = androidx.media3.database.g.b(this.f64392c.getReadableDatabase(), 0, this.f64390a);
                int i10 = 5 & 3;
                if (iB != 3) {
                    SQLiteDatabase writableDatabase = this.f64392c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        androidx.media3.database.g.d(writableDatabase, 0, this.f64390a, 3);
                        List<d> listR = iB == 2 ? r(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f64391b);
                        writableDatabase.execSQL("CREATE TABLE " + this.f64391b + " " + P);
                        Iterator<d> it = listR.iterator();
                        while (it.hasNext()) {
                            s(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f64394e = true;
            } catch (SQLException e10) {
                throw new androidx.media3.database.a(e10);
            }
        }
    }

    private Cursor m(String str, @p0 String[] strArr) throws androidx.media3.database.a {
        try {
            return this.f64392c.getReadableDatabase().query(this.f64391b, O, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        DownloadRequest.b bVarG = new DownloadRequest.b((String) androidx.media3.common.util.a.g(cursor.getString(0)), Uri.parse((String) androidx.media3.common.util.a.g(cursor.getString(2)))).f(cursor.getString(1)).g(j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA = bVarG.e(blob).c(cursor.getString(4)).d(cursor.getBlob(5)).a();
        t tVar = new t();
        tVar.f64554a = cursor.getLong(13);
        tVar.f64555b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new d(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, tVar);
    }

    private static d o(Cursor cursor) {
        DownloadRequest downloadRequestA = new DownloadRequest.b((String) androidx.media3.common.util.a.g(cursor.getString(0)), Uri.parse((String) androidx.media3.common.util.a.g(cursor.getString(2)))).f(q(cursor.getString(1))).g(j(cursor.getString(3))).c(cursor.getString(4)).d(cursor.getBlob(5)).a();
        t tVar = new t();
        tVar.f64554a = cursor.getLong(13);
        tVar.f64555b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new d(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, tVar);
    }

    private static String p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state");
        sb2.append(" IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    private static String q(@p0 String str) {
        if ("dash".equals(str)) {
            return "application/dash+xml";
        }
        if ("hls".equals(str)) {
            return "application/x-mpegURL";
        }
        return "ss".equals(str) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    private List<d> r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!k1.r2(sQLiteDatabase, this.f64391b)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f64391b, new String[]{"id", "title", "uri", f64374k, f64375l, "data", "state", f64378o, f64379p, f64380q, "stop_reason", f64382s, f64383t, f64384u}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(o(cursorQuery));
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private void s(d dVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = dVar.f64421a.f64355e;
        if (bArr == null) {
            bArr = k1.f61545f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f64421a.f64351a);
        contentValues.put(f64372i, dVar.f64421a.f64353c);
        contentValues.put("uri", dVar.f64421a.f64352b.toString());
        contentValues.put(f64374k, k(dVar.f64421a.f64354d));
        contentValues.put(f64375l, dVar.f64421a.f64356f);
        contentValues.put("data", dVar.f64421a.f64357g);
        contentValues.put("state", Integer.valueOf(dVar.f64422b));
        contentValues.put(f64378o, Long.valueOf(dVar.f64423c));
        contentValues.put(f64379p, Long.valueOf(dVar.f64424d));
        contentValues.put(f64380q, Long.valueOf(dVar.f64425e));
        contentValues.put("stop_reason", Integer.valueOf(dVar.f64426f));
        contentValues.put(f64382s, Integer.valueOf(dVar.f64427g));
        contentValues.put(f64383t, Float.valueOf(dVar.b()));
        contentValues.put(f64384u, Long.valueOf(dVar.a()));
        contentValues.put(f64385v, bArr);
        sQLiteDatabase.replaceOrThrow(this.f64391b, null, contentValues);
    }

    @Override // androidx.media3.exoplayer.offline.n
    public e a(int... iArr) throws androidx.media3.database.a {
        l();
        return new b(m(p(iArr), null));
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void b(String str, int i10) throws androidx.media3.database.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f64392c.getWritableDatabase().update(this.f64391b, contentValues, N + " AND " + L, new String[]{str});
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void c(d dVar) throws androidx.media3.database.a {
        l();
        try {
            s(dVar, this.f64392c.getWritableDatabase());
        } catch (SQLiteException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void d(String str) throws androidx.media3.database.a {
        l();
        try {
            this.f64392c.getWritableDatabase().delete(this.f64391b, L, new String[]{str});
        } catch (SQLiteException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.n
    @p0
    public d e(String str) throws androidx.media3.database.a {
        l();
        try {
            Cursor cursorM = m(L, new String[]{str});
            try {
                if (cursorM.getCount() == 0) {
                    cursorM.close();
                    return null;
                }
                cursorM.moveToNext();
                d dVarN = n(cursorM);
                cursorM.close();
                return dVarN;
            } catch (Throwable th2) {
                if (cursorM != null) {
                    try {
                        cursorM.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLiteException e10) {
            throw new androidx.media3.database.a(e10);
        }
        throw new androidx.media3.database.a(e10);
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void f(int i10) throws androidx.media3.database.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f64392c.getWritableDatabase().update(this.f64391b, contentValues, N, null);
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void g() throws androidx.media3.database.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put(f64382s, (Integer) 0);
            int i10 = 6 | 0;
            this.f64392c.getWritableDatabase().update(this.f64391b, contentValues, null, null);
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.e0
    public void h() throws androidx.media3.database.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f64392c.getWritableDatabase().update(this.f64391b, contentValues, M, null);
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    public a(androidx.media3.database.b bVar, String str) {
        this.f64390a = str;
        this.f64392c = bVar;
        this.f64391b = f64369f + str;
        this.f64393d = new Object();
    }
}
