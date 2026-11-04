package w3;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    @w0(16)
    @b1({b1.a.LIBRARY_GROUP})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f385887a = new a();

        private a() {
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void a(@NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final boolean c(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void d(@NotNull SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final boolean e(@NotNull SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public static final Cursor f(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @NotNull String[] selectionArgs, @Nullable String str, @NotNull CancellationSignal cancellationSignal, @NotNull SQLiteDatabase.CursorFactory cursorFactory) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursorRawQueryWithFactory;
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void g(@NotNull SQLiteDatabase sQLiteDatabase, boolean z10) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z10);
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void h(@NotNull SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
    }

    @w0(19)
    @b1({b1.a.LIBRARY_GROUP})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f385888a = new b();

        private b() {
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public static final Uri a(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final boolean b(@NotNull ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* JADX INFO: renamed from: w3.c$c, reason: collision with other inner class name */
    @w0(21)
    @b1({b1.a.LIBRARY_GROUP})
    public static final class C2525c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2525c f385889a = new C2525c();

        private C2525c() {
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public static final File a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @w0(23)
    @b1({b1.a.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f385890a = new d();

        private d() {
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void a(@NotNull Cursor cursor, @NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @w0(29)
    @b1({b1.a.LIBRARY_GROUP})
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f385891a = new e();

        private e() {
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public static final List<Uri> a(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }

        @n
        @b1({b1.a.LIBRARY_GROUP})
        public static final void b(@NotNull Cursor cursor, @NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private c() {
    }
}
