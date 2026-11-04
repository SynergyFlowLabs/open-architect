package androidx.room.util;

import android.database.Cursor;
import io.sentry.k9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
public final class h {
    private static final Map<String, g.a> a(w3.d dVar, String str) throws IOException {
        Cursor cursorYd = dVar.yd("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorYd.getColumnCount() <= 0) {
                Map<String, g.a> mapEmptyMap = MapsKt.emptyMap();
                kotlin.io.c.a(cursorYd, null);
                return mapEmptyMap;
            }
            int columnIndex = cursorYd.getColumnIndex("name");
            int columnIndex2 = cursorYd.getColumnIndex("type");
            int columnIndex3 = cursorYd.getColumnIndex("notnull");
            int columnIndex4 = cursorYd.getColumnIndex("pk");
            int columnIndex5 = cursorYd.getColumnIndex("dflt_value");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            while (cursorYd.moveToNext()) {
                String name = cursorYd.getString(columnIndex);
                String type = cursorYd.getString(columnIndex2);
                boolean z10 = cursorYd.getInt(columnIndex3) != 0;
                int i10 = cursorYd.getInt(columnIndex4);
                String string = cursorYd.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                mapCreateMapBuilder.put(name, new g.a(name, type, z10, i10, string, 2));
            }
            Map<String, g.a> mapBuild = MapsKt.build(mapCreateMapBuilder);
            kotlin.io.c.a(cursorYd, null);
            return mapBuild;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorYd, th2);
                throw th3;
            }
        }
    }

    private static final List<g.e> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex(k9.b.f305799f);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listCreateListBuilder.add(new g.e(i10, i11, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }

    private static final Set<g.d> c(w3.d dVar, String str) throws IOException {
        Cursor cursorYd = dVar.yd("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorYd.getColumnIndex("id");
            int columnIndex2 = cursorYd.getColumnIndex(k9.b.f305799f);
            int columnIndex3 = cursorYd.getColumnIndex("table");
            int columnIndex4 = cursorYd.getColumnIndex("on_delete");
            int columnIndex5 = cursorYd.getColumnIndex("on_update");
            List<g.e> listB = b(cursorYd);
            cursorYd.moveToPosition(-1);
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (cursorYd.moveToNext()) {
                if (cursorYd.getInt(columnIndex2) == 0) {
                    int i10 = cursorYd.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<g.e> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((g.e) obj).l() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (g.e eVar : arrayList3) {
                        arrayList.add(eVar.k());
                        arrayList2.add(eVar.o());
                    }
                    String string = cursorYd.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorYd.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorYd.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setCreateSetBuilder.add(new g.d(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<g.d> setBuild = SetsKt.build(setCreateSetBuilder);
            kotlin.io.c.a(cursorYd, null);
            return setBuild;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorYd, th2);
                throw th3;
            }
        }
    }

    private static final g.f d(w3.d dVar, String str, boolean z10) throws IOException {
        Cursor cursorYd = dVar.yd("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorYd.getColumnIndex("seqno");
            int columnIndex2 = cursorYd.getColumnIndex(androidx.media3.exoplayer.upstream.f.f65973m);
            int columnIndex3 = cursorYd.getColumnIndex("name");
            int columnIndex4 = cursorYd.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorYd.moveToNext()) {
                    if (cursorYd.getInt(columnIndex2) >= 0) {
                        int i10 = cursorYd.getInt(columnIndex);
                        String columnName = cursorYd.getString(columnIndex3);
                        String str2 = cursorYd.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List list = CollectionsKt.toList(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                g.f fVar = new g.f(str, z10, list, CollectionsKt.toList(collectionValues2));
                kotlin.io.c.a(cursorYd, null);
                return fVar;
            }
            kotlin.io.c.a(cursorYd, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorYd, th2);
                throw th3;
            }
        }
    }

    private static final Set<g.f> e(w3.d dVar, String str) throws IOException {
        Cursor cursorYd = dVar.yd("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorYd.getColumnIndex("name");
            int columnIndex2 = cursorYd.getColumnIndex("origin");
            int columnIndex3 = cursorYd.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                while (cursorYd.moveToNext()) {
                    if (Intrinsics.areEqual("c", cursorYd.getString(columnIndex2))) {
                        String name = cursorYd.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorYd.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        g.f fVarD = d(dVar, name, z10);
                        if (fVarD == null) {
                            kotlin.io.c.a(cursorYd, null);
                            return null;
                        }
                        setCreateSetBuilder.add(fVarD);
                    }
                }
                Set<g.f> setBuild = SetsKt.build(setCreateSetBuilder);
                kotlin.io.c.a(cursorYd, null);
                return setBuild;
            }
            kotlin.io.c.a(cursorYd, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorYd, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final g f(@NotNull w3.d database, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new g(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
