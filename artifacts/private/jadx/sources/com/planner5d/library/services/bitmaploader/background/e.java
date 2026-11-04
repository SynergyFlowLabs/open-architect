package com.planner5d.library.services.bitmaploader.background;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import androidx.annotation.m1;
import com.facebook.share.internal.k;
import com.planner5d.library.services.utility.i0;
import java.io.File;
import java.net.URL;
import java.util.Date;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f224064g = "files";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f224065h = "errors";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f224066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f224067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f224068c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f224069d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f224070e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.g f224071f;

    @m1
    e(Context context) {
        com.planner5d.library.services.bitmaploader.g gVar = new com.planner5d.library.services.bitmaploader.g(context);
        this.f224071f = gVar;
        this.f224066a = gVar.a();
        this.f224067b = SQLiteDatabase.openOrCreateDatabase(e(context).getAbsolutePath(), (SQLiteDatabase.CursorFactory) null);
        i();
    }

    @m1
    private void c(String table, String field) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f224067b.query(table, null, "expire < ?", new String[]{String.valueOf(new Date().getTime())}, null, null, null, null);
            int columnIndex = cursorQuery.getColumnIndex(field);
            if (columnIndex >= 0) {
                while (cursorQuery.moveToNext()) {
                    File file = new File(this.f224066a, cursorQuery.getString(columnIndex));
                    if (!file.exists() || file.delete()) {
                        this.f224067b.delete(table, "file = ?", new String[]{file.getName()});
                    }
                }
            }
            p.j(cursorQuery);
        } catch (Throwable unused) {
            p.j(cursorQuery);
        }
    }

    private long d(long cacheExpire) {
        if (cacheExpire == 1) {
            return i0.b(1825L);
        }
        if (cacheExpire == 5 || cacheExpire == -5) {
            return i0.b(7L);
        }
        if (cacheExpire == 4 || cacheExpire == -4) {
            return i0.b(1L);
        }
        if (cacheExpire == 3 || cacheExpire == -3) {
            return i0.d(6L);
        }
        if (cacheExpire == 2 || cacheExpire == -2 || cacheExpire == 0) {
            return 0L;
        }
        throw new RuntimeException("Invalid expiration: " + cacheExpire);
    }

    public static File e(Context context) {
        return new File(context.getFilesDir(), "database.images.sqlite");
    }

    private File f(File file, long cacheExpire) {
        if (this.f224066a == null || cacheExpire == 0) {
            return null;
        }
        if (cacheExpire < 0) {
            n(f224064g, k.f101891c, file.getName(), cacheExpire);
        }
        return file;
    }

    private void i() {
        this.f224067b.execSQL("CREATE TABLE IF NOT EXISTS files (file VARCHAR(255) PRIMARY KEY ASC, expire INTEGER)");
        this.f224067b.execSQL("CREATE TABLE IF NOT EXISTS errors (uri VARCHAR(255) PRIMARY KEY ASC, expire INTEGER)");
    }

    private void n(String table, String field, String value, long cacheExpire) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(field, value);
        contentValues.put("expire", Long.valueOf(new Date().getTime() + d(cacheExpire)));
        this.f224067b.insertWithOnConflict(table, null, contentValues, 5);
    }

    void a(int delta) {
        while (true) {
            synchronized (this.f224070e) {
                try {
                    if (!this.f224069d) {
                        this.f224068c += delta;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Thread.yield();
        }
    }

    @m1
    void b() {
        while (true) {
            synchronized (this.f224070e) {
                try {
                    if (this.f224068c <= 0) {
                        this.f224069d = true;
                        c(f224064g, k.f101891c);
                        c("errors", "uri");
                        synchronized (this.f224070e) {
                            try {
                                this.f224069d = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Thread.yield();
        }
    }

    @m1
    File g(URL url, long cacheExpire) {
        return f(this.f224071f.d(url), cacheExpire);
    }

    @m1
    File h(int source, String uri, int width, int height, long cacheExpire) {
        File fileB = this.f224071f.b(source, uri, width, height);
        if (fileB == null) {
            return null;
        }
        return f(fileB, cacheExpire);
    }

    @m1
    boolean j(File file, long cacheExpire) {
        if (file != null && file.isFile() && new Date().getTime() < file.lastModified() + d(cacheExpire)) {
            return false;
        }
        return true;
    }

    @m1
    boolean k(URL url, long cacheExpire) {
        if (cacheExpire < 0) {
            this.f224067b.delete("errors", "uri = ?", new String[]{url.toString()});
        }
        Cursor cursorQuery = this.f224067b.query("errors", null, "uri = ? AND expire >= ?", new String[]{url.toString(), String.valueOf(new Date().getTime())}, null, null, null, null);
        try {
            return cursorQuery.getCount() > 0;
        } finally {
            p.j(cursorQuery);
        }
    }

    Bitmap l(Bitmap bitmap, File cacheFile) {
        td.a.f380845a.u(bitmap, cacheFile);
        return bitmap;
    }

    void m(URL url, long cacheExpire) {
        n("errors", "uri", url.toString(), cacheExpire);
    }
}
