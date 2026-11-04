package androidx.media3.database;

import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface b {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f62241j0 = "ExoPlayer";

    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
