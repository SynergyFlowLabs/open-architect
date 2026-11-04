package androidx.media3.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f62246a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62247b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62248c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62249d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62250e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62251f = "ExoPlayerVersions";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62252g = "feature";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62253h = "instance_uid";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62254i = "version";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62255j = "feature = ? AND instance_uid = ?";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f62256k = "PRIMARY KEY (feature, instance_uid)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f62257l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        p0.a("media3.database");
    }

    private g() {
    }

    private static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws a {
        try {
            if (!k1.r2(sQLiteDatabase, f62251f)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query(f62251f, new String[]{"version"}, f62255j, a(i10, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i11 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i11;
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
            throw new a(e);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws a {
        try {
            if (k1.r2(sQLiteDatabase, f62251f)) {
                sQLiteDatabase.delete(f62251f, f62255j, a(i10, str));
            }
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws a {
        try {
            sQLiteDatabase.execSQL(f62257l);
            ContentValues contentValues = new ContentValues();
            contentValues.put(f62252g, Integer.valueOf(i10));
            contentValues.put(f62253h, str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow(f62251f, null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }
}
