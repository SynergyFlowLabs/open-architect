package com.planner5d.library.services.utility;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t2 f229750a = new t2();

    private t2() {
    }

    @oj.n
    @NotNull
    public static final String a(@NotNull String columnName, @NotNull Iterable<?> targetValues) {
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(targetValues, "targetValues");
        return f229750a.b(columnName, CollectionsKt.joinToString$default(targetValues, null, null, null, 0, null, null, 63, null));
    }

    private final String b(String str, String str2) {
        return str + " IN (" + str2 + ")";
    }

    @oj.n
    @NotNull
    public static final String c(@NotNull String columnName, @NotNull Object... targetValues) {
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(targetValues, "targetValues");
        return f229750a.b(columnName, ArraysKt.joinToString$default(targetValues, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
    }

    @oj.n
    public static final boolean d(@NotNull SQLiteDatabase database, @NotNull String table, @NotNull String columnToCheck) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(columnToCheck, "columnToCheck");
        try {
            Cursor cursorRawQuery = database.rawQuery("SELECT * FROM " + table + " LIMIT 0", null);
            try {
                boolean z10 = cursorRawQuery.getColumnIndex(columnToCheck) != -1;
                kotlin.io.c.a(cursorRawQuery, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorRawQuery, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
