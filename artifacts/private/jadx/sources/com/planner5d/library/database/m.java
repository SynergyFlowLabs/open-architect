package com.planner5d.library.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.annotation.m1;
import com.activeandroid.Cache;
import com.activeandroid.util.SQLiteUtils;
import com.planner5d.library.services.utility.t2;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f154036c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f154037d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f154038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<String, String, Boolean> f154039b;

    @SourceDebugExtension({"SMAP\nDatabaseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatabaseUtils.kt\ncom/planner5d/library/database/DatabaseUtils$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SQLiteUtils.execSql(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(String table, String column) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(column, "column");
            a aVar = m.f154036c;
            SQLiteDatabase sQLiteDatabaseOpenDatabase = Cache.openDatabase();
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabaseOpenDatabase, "openDatabase(...)");
            return aVar.l(sQLiteDatabaseOpenDatabase, table, column);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(w3.d dVar, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            dVar.X8(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(w3.d dVar, String table, String column) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(column, "column");
            return m.f154036c.m(dVar, table, column);
        }

        private final boolean k(Cursor cursor, String str) {
            int columnIndex = cursor.getColumnIndex("name");
            if (columnIndex == -1) {
                return false;
            }
            while (cursor.moveToNext()) {
                if (Intrinsics.areEqual(str, cursor.getString(columnIndex))) {
                    return true;
                }
            }
            return false;
        }

        private final boolean l(SQLiteDatabase sQLiteDatabase, String str, String str2) {
            return t2.d(sQLiteDatabase, str, str2);
        }

        private final boolean m(w3.d dVar, String str, String str2) throws IOException {
            try {
                Cursor cursorYd = dVar.yd("PRAGMA table_info(" + str + ")");
                try {
                    boolean zK = m.f154036c.k(cursorYd, str2);
                    kotlin.io.c.a(cursorYd, null);
                    return zK;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(cursorYd, th2);
                        throw th3;
                    }
                }
            } catch (SQLiteException unused) {
                return false;
            }
        }

        @oj.n
        @NotNull
        public final m e() {
            return new m(new Function1() { // from class: com.planner5d.library.database.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.a.f((String) obj);
                }
            }, new Function2() { // from class: com.planner5d.library.database.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(m.a.g((String) obj, (String) obj2));
                }
            }, null);
        }

        @oj.n
        @NotNull
        public final m h(@NotNull final w3.d database) {
            Intrinsics.checkNotNullParameter(database, "database");
            return new m(new Function1() { // from class: com.planner5d.library.database.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.a.i(database, (String) obj);
                }
            }, new Function2() { // from class: com.planner5d.library.database.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(m.a.j(database, (String) obj, (String) obj2));
                }
            }, null);
        }

        private a() {
        }
    }

    public /* synthetic */ m(Function1 function1, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2);
    }

    @oj.n
    @NotNull
    public static final m b() {
        return f154036c.e();
    }

    @oj.n
    @NotNull
    public static final m c(@NotNull w3.d dVar) {
        return f154036c.h(dVar);
    }

    @m1
    public final boolean a(@NotNull String table, @NotNull String name, @NotNull String definition) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(definition, "definition");
        try {
            if (!e(table, name)) {
                this.f154038a.invoke("ALTER TABLE " + table + " ADD COLUMN " + name + " " + definition);
                return true;
            }
        } catch (SQLiteException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return false;
    }

    @m1
    public final boolean d(@NotNull String table, @NotNull String name) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            if (e(table, name)) {
                this.f154038a.invoke("ALTER TABLE " + table + " DELETE COLUMN " + name);
                return true;
            }
        } catch (SQLiteException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return false;
    }

    @m1
    public final boolean e(@NotNull String tableName, @NotNull String columName) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(columName, "columName");
        return this.f154039b.invoke(tableName, columName).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(Function1<? super String, Unit> function1, Function2<? super String, ? super String, Boolean> function2) {
        this.f154038a = function1;
        this.f154039b = function2;
    }
}
