package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.o;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class c implements w3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f75316b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f75317c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String[] f75318d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SQLiteDatabase f75319a;

    @w0(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f75320a = new a();

        private a() {
        }

        @u
        public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.c$c, reason: collision with other inner class name */
    static final class C0755c extends l0 implements o<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w3.g f75321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0755c(w3.g gVar) {
            super(4);
            this.f75321a = gVar;
        }

        @Override // pj.o
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable SQLiteCursorDriver sQLiteCursorDriver, @Nullable String str, @Nullable SQLiteQuery sQLiteQuery) {
            w3.g gVar = this.f75321a;
            Intrinsics.checkNotNull(sQLiteQuery);
            gVar.c(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f75319a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(o tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(w3.g query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.c(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // w3.d
    public boolean B3() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // w3.d
    @NotNull
    public Cursor C5(@NotNull String query, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return qf(new w3.b(query, bindArgs));
    }

    @Override // w3.d
    @w0(api = 16)
    public void C6(boolean z10) {
        w3.c.a.g(this.f75319a, z10);
    }

    @Override // w3.d
    public boolean E3() {
        return this.f75319a.isDbLockedByCurrentThread();
    }

    @Override // w3.d
    public void Ea() {
        this.f75319a.endTransaction();
    }

    @Override // w3.d
    @w0(api = 16)
    public boolean Ge() {
        return w3.c.a.e(this.f75319a);
    }

    @Override // w3.d
    public long J6() {
        return this.f75319a.getMaximumSize();
    }

    @Override // w3.d
    public void Je(int i10) {
        this.f75319a.setMaxSqlCacheSize(i10);
    }

    @Override // w3.d
    public int N1(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        w3.i iVarUc = uc(string);
        w3.b.f385884c.b(iVarUc, objArr);
        return iVarUc.j2();
    }

    @Override // w3.d
    public void Q1() {
        this.f75319a.beginTransaction();
    }

    @Override // w3.d
    @Nullable
    public String S() {
        return this.f75319a.getPath();
    }

    @Override // w3.d
    public void Sb(@NotNull String sql, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a.f75320a.a(this.f75319a, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i10);
    }

    @Override // w3.d
    public boolean U3(int i10) {
        return this.f75319a.needUpgrade(i10);
    }

    @Override // w3.d
    public void Ue(long j10) {
        this.f75319a.setPageSize(j10);
    }

    @Override // w3.d
    public boolean V9() {
        return this.f75319a.enableWriteAheadLogging();
    }

    @Override // w3.d
    public void W9() {
        this.f75319a.setTransactionSuccessful();
    }

    @Override // w3.d
    @Nullable
    public List<Pair<String, String>> X1() {
        return this.f75319a.getAttachedDbs();
    }

    @Override // w3.d
    public void X8(@NotNull String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f75319a.execSQL(sql);
    }

    @Override // w3.d
    @w0(api = 16)
    public void Y1() {
        w3.c.a.d(this.f75319a);
    }

    @Override // w3.d
    public boolean b9() {
        return this.f75319a.isDatabaseIntegrityOk();
    }

    public final boolean c(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.f75319a, sqLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f75319a.close();
    }

    @Override // w3.d
    public void da(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f75319a.execSQL(sql, bindArgs);
    }

    public void f(long j10) {
        this.f75319a.setMaximumSize(j10);
    }

    @Override // w3.d
    public long f7(@NotNull String table, int i10, @NotNull ContentValues values) throws SQLException {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f75319a.insertWithOnConflict(table, null, values, i10);
    }

    @Override // w3.d
    public long fa(long j10) {
        this.f75319a.setMaximumSize(j10);
        return this.f75319a.getMaximumSize();
    }

    @Override // w3.d
    public int getVersion() {
        return this.f75319a.getVersion();
    }

    @Override // w3.d
    public boolean hc(long j10) {
        return this.f75319a.yieldIfContendedSafely(j10);
    }

    @Override // w3.d
    public void he(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f75319a.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // w3.d
    public boolean isOpen() {
        return this.f75319a.isOpen();
    }

    @Override // w3.d
    public void j3() {
        this.f75319a.beginTransactionNonExclusive();
    }

    @Override // w3.d
    public void kc(int i10) {
        this.f75319a.setVersion(i10);
    }

    @Override // w3.d
    public int od(@NotNull String table, int i10, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f75317c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        w3.i iVarUc = uc(string);
        w3.b.f385884c.b(iVarUc, objArr2);
        return iVarUc.j2();
    }

    @Override // w3.d
    public boolean pe() {
        return this.f75319a.inTransaction();
    }

    @Override // w3.d
    @NotNull
    public Cursor qf(@NotNull w3.g query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final C0755c c0755c = new C0755c(query);
        Cursor cursorRawQueryWithFactory = this.f75319a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.d(c0755c, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.b(), f75318d, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // w3.d
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f75319a.setLocale(locale);
    }

    @Override // w3.d
    public long t1() {
        return this.f75319a.getPageSize();
    }

    @Override // w3.d
    @w0(16)
    @NotNull
    public Cursor u4(@NotNull final w3.g query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f75319a;
        String strB = query.b();
        String[] strArr = f75318d;
        Intrinsics.checkNotNull(cancellationSignal);
        return w3.c.a.f(sQLiteDatabase, strB, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.e(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // w3.d
    public void ua(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f75319a.beginTransactionWithListener(transactionListener);
    }

    @Override // w3.d
    @NotNull
    public w3.i uc(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f75319a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // w3.d
    public boolean wd() {
        return this.f75319a.yieldIfContendedSafely();
    }

    @Override // w3.d
    @NotNull
    public Cursor yd(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return qf(new w3.b(query));
    }

    @Override // w3.d
    public boolean z1() {
        return this.f75319a.isReadOnly();
    }
}
