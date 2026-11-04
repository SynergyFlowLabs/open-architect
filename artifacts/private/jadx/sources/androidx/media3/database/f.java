package androidx.media3.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.z;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class f extends SQLiteOpenHelper implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62243a = "exoplayer_internal.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f62244b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62245c = "SADatabaseProvider";

    public f(Context context) {
        super(context.getApplicationContext(), f62243a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e10) {
                        z.e(f62245c, "Error executing " + str, e10);
                    }
                }
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
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
