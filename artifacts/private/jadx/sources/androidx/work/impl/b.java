package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.x1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@x1(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
@SourceDebugExtension({"SMAP\nWorkDatabaseMigrations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkDatabaseMigrations.kt\nandroidx/work/impl/AutoMigration_14_15\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,421:1\n26#2:422\n*S KotlinDebug\n*F\n+ 1 WorkDatabaseMigrations.kt\nandroidx/work/impl/AutoMigration_14_15\n*L\n231#1:422\n*E\n"})
public final class b implements androidx.room.migration.a {
    @Override // androidx.room.migration.a
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        int i10 = 0 >> 1;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.od("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
