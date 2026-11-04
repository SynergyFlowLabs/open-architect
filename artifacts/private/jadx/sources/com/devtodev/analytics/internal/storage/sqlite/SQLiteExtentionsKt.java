package com.devtodev.analytics.internal.storage.sqlite;

import android.content.ContentValues;
import com.devtodev.analytics.internal.storage.EventParam;
import com.facebook.appevents.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSQLiteExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteExtentions.kt\ncom/devtodev/analytics/internal/storage/sqlite/SQLiteExtentionsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,72:1\n37#2,2:73\n*S KotlinDebug\n*F\n+ 1 SQLiteExtentions.kt\ncom/devtodev/analytics/internal/storage/sqlite/SQLiteExtentionsKt\n*L\n71#1:73,2\n*E\n"})
public final class SQLiteExtentionsKt {
    @NotNull
    public static final ContentValues addValues(@NotNull ContentValues contentValues, @NotNull List<EventParam> params) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        for (EventParam eventParam : params) {
            SqlValue value = eventParam.getValue();
            if (value instanceof SqlValue.Int) {
                String name = eventParam.getName();
                SqlValue value2 = eventParam.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
                contentValues.put(name, Integer.valueOf(((SqlValue.Int) value2).getAnInt()));
            } else if (value instanceof SqlValue.Long) {
                String name2 = eventParam.getName();
                SqlValue value3 = eventParam.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
                contentValues.put(name2, Long.valueOf(((SqlValue.Long) value3).getALong()));
            } else if (value instanceof SqlValue.Double) {
                String name3 = eventParam.getName();
                SqlValue value4 = eventParam.getValue();
                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Double");
                contentValues.put(name3, Double.valueOf(((SqlValue.Double) value4).getADouble()));
            } else if (value instanceof SqlValue.Boolean) {
                String name4 = eventParam.getName();
                SqlValue value5 = eventParam.getValue();
                Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
                contentValues.put(name4, Boolean.valueOf(((SqlValue.Boolean) value5).getABoolean()));
            } else if (value instanceof SqlValue.String) {
                String name5 = eventParam.getName();
                SqlValue value6 = eventParam.getValue();
                Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
                contentValues.put(name5, ((SqlValue.String) value6).getString());
            } else if (value instanceof SqlValue.IntOrNull) {
                String name6 = eventParam.getName();
                SqlValue value7 = eventParam.getValue();
                Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.IntOrNull");
                contentValues.put(name6, ((SqlValue.IntOrNull) value7).getAnInt());
            } else if (value instanceof SqlValue.LongOrNull) {
                String name7 = eventParam.getName();
                SqlValue value8 = eventParam.getValue();
                Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
                contentValues.put(name7, ((SqlValue.LongOrNull) value8).getALong());
            } else if (value instanceof SqlValue.DoubleOrNull) {
                String name8 = eventParam.getName();
                SqlValue value9 = eventParam.getValue();
                Intrinsics.checkNotNull(value9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.DoubleOrNull");
                contentValues.put(name8, ((SqlValue.DoubleOrNull) value9).getADouble());
            } else if (value instanceof SqlValue.StringOrNull) {
                String name9 = eventParam.getName();
                SqlValue value10 = eventParam.getValue();
                Intrinsics.checkNotNull(value10, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
                contentValues.put(name9, ((SqlValue.StringOrNull) value10).getString());
            }
        }
        return contentValues;
    }

    @NotNull
    public static final String[] toStringArray(@NotNull List<EventParam> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (EventParam eventParam : list) {
            SqlValue value = eventParam.getValue();
            if (value instanceof SqlValue.Int) {
                SqlValue value2 = eventParam.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
                arrayList.add(String.valueOf(((SqlValue.Int) value2).getAnInt()));
            } else if (value instanceof SqlValue.Long) {
                SqlValue value3 = eventParam.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
                arrayList.add(String.valueOf(((SqlValue.Long) value3).getALong()));
            } else if (value instanceof SqlValue.Double) {
                SqlValue value4 = eventParam.getValue();
                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Double");
                arrayList.add(String.valueOf(((SqlValue.Double) value4).getADouble()));
            } else if (value instanceof SqlValue.Boolean) {
                SqlValue value5 = eventParam.getValue();
                Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
                if (((SqlValue.Boolean) value5).getABoolean()) {
                    arrayList.add("1");
                } else {
                    arrayList.add(p.f99189d0);
                }
            } else if (value instanceof SqlValue.String) {
                SqlValue value6 = eventParam.getValue();
                Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
                arrayList.add(((SqlValue.String) value6).getString());
            } else if (value instanceof SqlValue.IntOrNull) {
                SqlValue value7 = eventParam.getValue();
                Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.IntOrNull");
                arrayList.add(String.valueOf(((SqlValue.IntOrNull) value7).getAnInt()));
            } else if (value instanceof SqlValue.LongOrNull) {
                SqlValue value8 = eventParam.getValue();
                Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
                arrayList.add(String.valueOf(((SqlValue.LongOrNull) value8).getALong()));
            } else if (value instanceof SqlValue.DoubleOrNull) {
                SqlValue value9 = eventParam.getValue();
                Intrinsics.checkNotNull(value9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.DoubleOrNull");
                arrayList.add(String.valueOf(((SqlValue.DoubleOrNull) value9).getADouble()));
            } else if (value instanceof SqlValue.StringOrNull) {
                SqlValue value10 = eventParam.getValue();
                Intrinsics.checkNotNull(value10, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
                arrayList.add(String.valueOf(((SqlValue.StringOrNull) value10).getString()));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
