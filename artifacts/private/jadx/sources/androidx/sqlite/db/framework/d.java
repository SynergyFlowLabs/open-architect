package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.w0;
import java.io.File;
import java.util.UUID;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements w3.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f75322h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f75323i = "SupportSQLite";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f75324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f75325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w3.e.a f75326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f75327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f75328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0<c> f75329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75330g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private androidx.sqlite.db.framework.c f75331a;

        public b(@Nullable androidx.sqlite.db.framework.c cVar) {
            this.f75331a = cVar;
        }

        @Nullable
        public final androidx.sqlite.db.framework.c a() {
            return this.f75331a;
        }

        public final void b(@Nullable androidx.sqlite.db.framework.c cVar) {
            this.f75331a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final C0756c f75332h = new C0756c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f75333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final b f75334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final w3.e.a f75335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f75336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f75337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final x3.a f75338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f75339g;

        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final b f75340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final Throwable f75341b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f75340a = callbackName;
                this.f75341b = cause;
            }

            @NotNull
            public final b a() {
                return this.f75340a;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.f75341b;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.d$c$c, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        public static final class C0756c {
            public /* synthetic */ C0756c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final androidx.sqlite.db.framework.c a(@NotNull b refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                androidx.sqlite.db.framework.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.c(sqLiteDatabase)) {
                    return cVarA;
                }
                androidx.sqlite.db.framework.c cVar = new androidx.sqlite.db.framework.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            private C0756c() {
            }
        }

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0757d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75348a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f75348a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Context context, @Nullable String str, @NotNull final b dbRef, @NotNull final w3.e.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f385894a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f75333a = context;
            this.f75334b = dbRef;
            this.f75335c = callback;
            this.f75336d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f75338f = new x3.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(w3.e.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0756c c0756c = f75332h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0756c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase h(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase j(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f75339g;
            if (databaseName != null && !z11 && (parentFile = this.f75333a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                return h(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return h(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = C0757d.f75348a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f75336d) {
                        throw th2;
                    }
                    this.f75333a.deleteDatabase(databaseName);
                    try {
                        return h(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        public final boolean c() {
            return this.f75336d;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                x3.a.c(this.f75338f, false, 1, null);
                super.close();
                this.f75334b.b(null);
                this.f75339g = false;
            } finally {
                this.f75338f.d();
            }
        }

        @NotNull
        public final w3.e.a d() {
            return this.f75335c;
        }

        @NotNull
        public final b e() {
            return this.f75334b;
        }

        @NotNull
        public final w3.d f(boolean z10) {
            w3.d dVarG;
            try {
                this.f75338f.b((this.f75339g || getDatabaseName() == null) ? false : true);
                this.f75337e = false;
                SQLiteDatabase sQLiteDatabaseJ = j(z10);
                if (this.f75337e) {
                    close();
                    dVarG = f(z10);
                } else {
                    dVarG = g(sQLiteDatabaseJ);
                }
                this.f75338f.d();
                return dVarG;
            } catch (Throwable th2) {
                this.f75338f.d();
                throw th2;
            }
        }

        @NotNull
        public final androidx.sqlite.db.framework.c g(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f75332h.a(this.f75334b, sqLiteDatabase);
        }

        @NotNull
        public final Context getContext() {
            return this.f75333a;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f75337e && this.f75335c.f385894a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f75335c.b(g(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f75335c.d(g(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f75337e = true;
            try {
                this.f75335c.e(g(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f75337e) {
                try {
                    this.f75335c.f(g(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f75339g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f75337e = true;
            try {
                this.f75335c.g(g(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.d$d, reason: collision with other inner class name */
    static final class C0758d extends l0 implements Function0<c> {
        C0758d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f75325b == null || !d.this.f75327d) {
                cVar = new c(d.this.f75324a, d.this.f75325b, new b(null), d.this.f75326c, d.this.f75328e);
            } else {
                cVar = new c(d.this.f75324a, new File(w3.c.C2525c.a(d.this.f75324a), d.this.f75325b).getAbsolutePath(), new b(null), d.this.f75326c, d.this.f75328e);
            }
            w3.c.a.h(cVar, d.this.f75330g);
            return cVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public d(@NotNull Context context, @Nullable String str, @NotNull w3.e.a callback) {
        this(context, str, callback, false, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    private final c g() {
        return this.f75329f.getValue();
    }

    private static Object h(d dVar) {
        return dVar.f75329f;
    }

    @Override // w3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f75329f.Z()) {
            g().close();
        }
    }

    @Override // w3.e
    @Nullable
    public String getDatabaseName() {
        return this.f75325b;
    }

    @Override // w3.e
    @NotNull
    public w3.d getReadableDatabase() {
        return g().f(false);
    }

    @Override // w3.e
    @NotNull
    public w3.d getWritableDatabase() {
        return g().f(true);
    }

    @Override // w3.e
    @w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f75329f.Z()) {
            w3.c.a.h(g(), z10);
        }
        this.f75330g = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public d(@NotNull Context context, @Nullable String str, @NotNull w3.e.a callback, boolean z10) {
        this(context, str, callback, z10, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @j
    public d(@NotNull Context context, @Nullable String str, @NotNull w3.e.a callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f75324a = context;
        this.f75325b = str;
        this.f75326c = callback;
        this.f75327d = z10;
        this.f75328e = z11;
        this.f75329f = g0.c(new C0758d());
    }

    public /* synthetic */ d(Context context, String str, w3.e.a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
