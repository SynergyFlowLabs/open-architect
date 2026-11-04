package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62356c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f62357d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62358e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62359f = "length";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f62361h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f62362i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f62363j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f62364k = "name = ?";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62366m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.database.b f62367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62368b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62360g = "last_touch_timestamp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f62365l = {"name", "length", f62360g};

    public f(androidx.media3.database.b bVar) {
        this.f62367a = bVar;
    }

    @m1
    public static void a(androidx.media3.database.b bVar, long j10) throws androidx.media3.database.a {
        String hexString = Long.toHexString(j10);
        try {
            String strE = e(hexString);
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                androidx.media3.database.g.c(writableDatabase, 2, hexString);
                b(writableDatabase, strE);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor d() {
        androidx.media3.common.util.a.g(this.f62368b);
        return this.f62367a.getReadableDatabase().query(this.f62368b, f62365l, null, null, null, null, null);
    }

    private static String e(String str) {
        return f62356c + str;
    }

    @m1
    public Map<String, e> c() throws androidx.media3.database.a {
        try {
            Cursor cursorD = d();
            try {
                HashMap map = new HashMap(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    map.put((String) androidx.media3.common.util.a.g(cursorD.getString(0)), new e(cursorD.getLong(1), cursorD.getLong(2)));
                }
                cursorD.close();
                return map;
            } catch (Throwable th2) {
                if (cursorD != null) {
                    try {
                        cursorD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @m1
    public void f(long j10) throws androidx.media3.database.a {
        try {
            String hexString = Long.toHexString(j10);
            this.f62368b = e(hexString);
            if (androidx.media3.database.g.b(this.f62367a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f62367a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    androidx.media3.database.g.d(writableDatabase, 2, hexString, 1);
                    b(writableDatabase, this.f62368b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f62368b + " " + f62366m);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @m1
    public void g(String str) throws androidx.media3.database.a {
        androidx.media3.common.util.a.g(this.f62368b);
        try {
            this.f62367a.getWritableDatabase().delete(this.f62368b, f62364k, new String[]{str});
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @m1
    public void h(Set<String> set) throws androidx.media3.database.a {
        androidx.media3.common.util.a.g(this.f62368b);
        try {
            SQLiteDatabase writableDatabase = this.f62367a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f62368b, f62364k, new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }

    @m1
    public void i(String str, long j10, long j11) throws androidx.media3.database.a {
        androidx.media3.common.util.a.g(this.f62368b);
        try {
            SQLiteDatabase writableDatabase = this.f62367a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put(f62360g, Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f62368b, null, contentValues);
        } catch (SQLException e10) {
            throw new androidx.media3.database.a(e10);
        }
    }
}
