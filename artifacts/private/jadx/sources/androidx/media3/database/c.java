package androidx.media3.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f62242a;

    public c(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f62242a = sQLiteOpenHelper;
    }

    @Override // androidx.media3.database.b
    public SQLiteDatabase getReadableDatabase() {
        return this.f62242a.getReadableDatabase();
    }

    @Override // androidx.media3.database.b
    public SQLiteDatabase getWritableDatabase() {
        return this.f62242a.getWritableDatabase();
    }
}
