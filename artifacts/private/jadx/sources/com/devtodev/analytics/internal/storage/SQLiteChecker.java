package com.devtodev.analytics.internal.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.devtodev.analytics.internal.storage.sqlite.ReportEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteChecker implements ISQLiteChecker {

    @NotNull
    private final SQLiteDatabase database;

    public SQLiteChecker(@NotNull SQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
    }

    private final void deleteBrokenRow(String str, String str2) {
        try {
            this.database.delete(str2, "_id = " + str, null);
        } catch (RuntimeException e10) {
            Logger.INSTANCE.error("[Database Module] deleteBrokenRow err:", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    private final void findBrokenRow(List<String> list, String str) throws Throwable {
        String str2;
        int columnIndex;
        int size = list.size();
        Cursor cursor = null;
        Cursor cursorRawQuery = null;
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    if (Intrinsics.areEqual(str, EventEntry.tableName)) {
                        str2 = "SELECT eventJson FROM events WHERE _id = ?";
                    } else {
                        if (Intrinsics.areEqual(str, ReportEntry.tableName)) {
                            str2 = "SELECT packagesJson FROM reports WHERE _id = ?";
                        } else if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                    cursorRawQuery = this.database.rawQuery(str2, new String[]{list.get(i10)});
                    while (cursorRawQuery.moveToNext()) {
                        if (Intrinsics.areEqual(str, EventEntry.tableName)) {
                            columnIndex = cursorRawQuery.getColumnIndex(EventEntry.eventJson);
                        } else if (Intrinsics.areEqual(str, ReportEntry.tableName)) {
                            columnIndex = cursorRawQuery.getColumnIndex(ReportEntry.packagesJson);
                        }
                        cursorRawQuery.getString(columnIndex);
                    }
                    cursorRawQuery.close();
                } catch (RuntimeException unused) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    try {
                        deleteBrokenRow(list.get(i10), str);
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    @Override // com.devtodev.analytics.internal.storage.ISQLiteChecker
    public void checkRows(@NotNull String tableName) throws Throwable {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.database.rawQuery("SELECT _id FROM " + tableName, null);
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(String.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"))));
                }
            } catch (RuntimeException e10) {
                Logger.INSTANCE.error("[Database Module] checkRows err:", e10);
                if (cursorRawQuery != null) {
                }
                if (!arrayList.isEmpty()) {
                    findBrokenRow(arrayList, tableName);
                }
            }
            cursorRawQuery.close();
            if (!arrayList.isEmpty()) {
                findBrokenRow(arrayList, tableName);
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }
}
