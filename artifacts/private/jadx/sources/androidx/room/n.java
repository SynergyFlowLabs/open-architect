package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Context f75013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public final String f75014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final w3.e.c f75015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final b2.e f75016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @Nullable
    public final List<b2.b> f75017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    public final boolean f75018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public final b2.d f75019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Executor f75020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Executor f75021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent f75022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    public final boolean f75023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    public final boolean f75024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final Set<Integer> f75025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oj.f
    @Nullable
    public final String f75026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    @Nullable
    public final File f75027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Callable<InputStream> f75028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oj.f
    @Nullable
    public final b2.f f75029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oj.f
    @NotNull
    public final List<Object> f75030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oj.f
    @NotNull
    public final List<androidx.room.migration.a> f75031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oj.f
    public final boolean f75032t;

    /* JADX WARN: Multi-variable type inference failed */
    @e.a({"LambdaLast"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable b2.f fVar, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends androidx.room.migration.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f75013a = context;
        this.f75014b = str;
        this.f75015c = sqliteOpenHelperFactory;
        this.f75016d = migrationContainer;
        this.f75017e = list;
        this.f75018f = z10;
        this.f75019g = journalMode;
        this.f75020h = queryExecutor;
        this.f75021i = transactionExecutor;
        this.f75022j = intent;
        this.f75023k = z11;
        this.f75024l = z12;
        this.f75025m = set;
        this.f75026n = str2;
        this.f75027o = file;
        this.f75028p = callable;
        this.f75029q = fVar;
        this.f75030r = typeConverters;
        this.f75031s = autoMigrationSpecs;
        this.f75032t = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        return (i10 <= i11 || !this.f75024l) && this.f75023k && ((set = this.f75025m) == null || !set.contains(Integer.valueOf(i10)));
    }

    @kotlin.l(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @kotlin.b1(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean b(int i10) {
        return a(i10, i10 + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, boolean z11, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, (Intent) null, z11, false, set, (String) null, (File) null, (Callable<InputStream>) null, (b2.f) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, (String) null, (File) null, (Callable<InputStream>) null, (b2.f) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, (Callable<InputStream>) null, (b2.f) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (b2.f) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e.a({"LambdaLast"})
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable b2.f fVar) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, fVar, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e.a({"LambdaLast"})
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable b2.f fVar, @NotNull List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, fVar, typeConverters, (List<? extends androidx.room.migration.a>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e.a({"LambdaLast"})
    @kotlin.l(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public n(@NotNull Context context, @Nullable String str, @NotNull w3.e.c sqliteOpenHelperFactory, @NotNull b2.e migrationContainer, @Nullable List<? extends b2.b> list, boolean z10, @NotNull b2.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable b2.f fVar, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends androidx.room.migration.a> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (b2.f) null, typeConverters, autoMigrationSpecs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
