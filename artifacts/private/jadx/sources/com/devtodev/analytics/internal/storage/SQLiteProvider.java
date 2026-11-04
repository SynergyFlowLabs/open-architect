package com.devtodev.analytics.internal.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.ReportEntry;
import com.devtodev.analytics.internal.storage.sqlite.SQLiteExtentionsKt;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSQLiteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteProvider.kt\ncom/devtodev/analytics/internal/storage/SQLiteProvider\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n37#2,2:136\n37#2,2:138\n37#2,2:142\n1855#3,2:140\n*S KotlinDebug\n*F\n+ 1 SQLiteProvider.kt\ncom/devtodev/analytics/internal/storage/SQLiteProvider\n*L\n43#1:136,2\n109#1:138,2\n132#1:142,2\n127#1:140,2\n*E\n"})
public final class SQLiteProvider implements IDatabase {

    @NotNull
    private final SQLiteDatabase database;

    @NotNull
    private final f0 sqlChecker$delegate;

    public SQLiteProvider(@NotNull SQLiteOpenHelper helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        SQLiteDatabase writableDatabase = helper.getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(writableDatabase, "helper.writableDatabase");
        this.database = writableDatabase;
        this.sqlChecker$delegate = g0.c(new SQLiteProvider$sqlChecker$2(this));
    }

    private final ISQLiteChecker getSqlChecker() {
        return (ISQLiteChecker) this.sqlChecker$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.storage.IDatabase
    public int delete(@NotNull String tableName, @NotNull List<EventParam> whereValues, @NotNull RemoverPattern removerPattern) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        Intrinsics.checkNotNullParameter(removerPattern, "removerPattern");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<EventParam> it = whereValues.iterator();
        while (it.hasNext()) {
            SqlCommand.Companion.parseWhereParameter$DTDAnalytics_androidRelease(it.next(), sb2, arrayList, removerPattern);
        }
        if (whereValues.size() > 1) {
            StringsKt.a0(sb2);
            sb2.append("_id IN (");
            int size = whereValues.size();
            for (int i10 = 1; i10 < size; i10++) {
                sb2.append("?, ");
            }
            sb2.append("?)");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "selectionBuilder.toString()");
        return this.database.delete(tableName, string, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.devtodev.analytics.internal.storage.IDatabase
    public int deleteByUser(@NotNull String tableName, @NotNull String columnName, @NotNull List<Long> whereValues) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb2.append(columnName + " IN (");
        int size = whereValues.size();
        for (int i10 = 1; i10 < size; i10++) {
            sb2.append("?, ");
        }
        sb2.append("?)");
        Iterator<T> it = whereValues.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "selectionBuilder.toString()");
        return this.database.delete(tableName, string, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.devtodev.analytics.internal.storage.IDatabase
    public long insert(@NotNull String tableName, @NotNull List<EventParam> values) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.database.insert(tableName, null, SQLiteExtentionsKt.addValues(new ContentValues(), values));
    }

    @Override // com.devtodev.analytics.internal.storage.IDatabase
    @NotNull
    public List<SelectRecords> select(@NotNull String tableName, @NotNull List<SelectParameter> tableColumns, @NotNull List<EventParam> selectParameters) {
        String str;
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableColumns, "tableColumns");
        Intrinsics.checkNotNullParameter(selectParameters, "selectParameters");
        int size = tableColumns.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = tableColumns.get(i10).getColumnName();
        }
        String[] stringArray = SQLiteExtentionsKt.toStringArray(selectParameters);
        String strCreateSelection$DTDAnalytics_androidRelease = SqlCommand.Companion.createSelection$DTDAnalytics_androidRelease(selectParameters);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                str = tableName;
                try {
                    cursorQuery = this.database.query(str, strArr, strCreateSelection$DTDAnalytics_androidRelease, stringArray, null, null, "_id");
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new SelectRecords(SqlCommand.Companion.getRecord$DTDAnalytics_androidRelease(cursorQuery, tableColumns)));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (RuntimeException e10) {
                    e = e10;
                    RuntimeException runtimeException = e;
                    if (Intrinsics.areEqual(str, EventEntry.tableName) || Intrinsics.areEqual(str, ReportEntry.tableName)) {
                        getSqlChecker().checkRows(str);
                    } else {
                        Logger.INSTANCE.error("[Database Module] select err:", runtimeException);
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                }
            } catch (RuntimeException e11) {
                e = e11;
                str = tableName;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // com.devtodev.analytics.internal.storage.IDatabase
    @NotNull
    public Integer update(@NotNull String tableName, @NotNull List<EventParam> whereValues, @NotNull List<EventParam> updateValues) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        Intrinsics.checkNotNullParameter(updateValues, "updateValues");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) whereValues);
        ContentValues contentValuesAddValues = SQLiteExtentionsKt.addValues(new ContentValues(), updateValues);
        Iterator it = mutableList.iterator();
        while (it.hasNext()) {
            SqlCommand.Companion.parseWhereParameter$DTDAnalytics_androidRelease((EventParam) it.next(), sb2, arrayList, RemoverPattern.JEST_ONE);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "selectionBuilder.toString()");
        return Integer.valueOf(this.database.update(tableName, contentValuesAddValues, string, (String[]) arrayList.toArray(new String[0])));
    }
}
