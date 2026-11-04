package com.activeandroid.util;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.room.util.g;
import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.activeandroid.TableInfo;
import com.activeandroid.annotation.Column;
import com.activeandroid.serializer.TypeSerializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteUtils {
    private static final HashMap<Class<?>, SQLiteType> TYPE_MAP = new HashMap<Class<?>, SQLiteType>() { // from class: com.activeandroid.util.SQLiteUtils.1
        {
            SQLiteType sQLiteType = SQLiteType.INTEGER;
            put(Byte.TYPE, sQLiteType);
            put(Short.TYPE, sQLiteType);
            put(Integer.TYPE, sQLiteType);
            put(Long.TYPE, sQLiteType);
            SQLiteType sQLiteType2 = SQLiteType.REAL;
            put(Float.TYPE, sQLiteType2);
            put(Double.TYPE, sQLiteType2);
            put(Boolean.TYPE, sQLiteType);
            SQLiteType sQLiteType3 = SQLiteType.TEXT;
            put(Character.TYPE, sQLiteType3);
            SQLiteType sQLiteType4 = SQLiteType.BLOB;
            put(byte[].class, sQLiteType4);
            put(Byte.class, sQLiteType);
            put(Short.class, sQLiteType);
            put(Integer.class, sQLiteType);
            put(Long.class, sQLiteType);
            put(Float.class, sQLiteType2);
            put(Double.class, sQLiteType2);
            put(Boolean.class, sQLiteType);
            put(Character.class, sQLiteType3);
            put(String.class, sQLiteType3);
            put(Byte[].class, sQLiteType4);
        }
    };
    private static HashMap<String, List<String>> sIndexGroupMap;
    private static HashMap<String, Column.ConflictAction> sOnUniqueConflictsMap;
    private static HashMap<String, List<String>> sUniqueGroupMap;

    public enum SQLiteType {
        INTEGER,
        REAL,
        TEXT,
        BLOB
    }

    @m1
    public static String createColumnDefinition(TableInfo tableInfo, Field field) {
        StringBuilder sb2 = new StringBuilder();
        Class<?> type = field.getType();
        String columnName = tableInfo.getColumnName(field);
        TypeSerializer parserForType = Cache.getParserForType(field.getType());
        Column column = (Column) field.getAnnotation(Column.class);
        if (parserForType != null) {
            type = parserForType.getSerializedType();
        }
        HashMap<Class<?>, SQLiteType> map = TYPE_MAP;
        if (map.containsKey(type)) {
            sb2.append(columnName);
            sb2.append(" ");
            sb2.append(map.get(type).toString());
        } else if (ReflectionUtils.isModel(type)) {
            sb2.append(columnName);
            sb2.append(" ");
            sb2.append(SQLiteType.INTEGER.toString());
        } else if (ReflectionUtils.isSubclassOf(type, Enum.class)) {
            sb2.append(columnName);
            sb2.append(" ");
            sb2.append(SQLiteType.TEXT.toString());
        }
        if (!TextUtils.isEmpty(sb2)) {
            if (columnName.equals(tableInfo.getIdName())) {
                sb2.append(" PRIMARY KEY AUTOINCREMENT");
            } else if (column != null) {
                if (column.length() > -1) {
                    sb2.append("(");
                    sb2.append(column.length());
                    sb2.append(")");
                }
                if (column.notNull()) {
                    sb2.append(" NOT NULL ON CONFLICT ");
                    sb2.append(column.onNullConflict().toString());
                }
                if (column.unique()) {
                    sb2.append(" UNIQUE ON CONFLICT ");
                    sb2.append(column.onUniqueConflict().toString());
                }
            }
            if (ReflectionUtils.isModel(type)) {
                sb2.append(" REFERENCES ");
                sb2.append(Cache.getTableInfo(type).getTableName());
                sb2.append("(" + tableInfo.getIdName() + ")");
                sb2.append(" ON DELETE ");
                sb2.append(column.onDelete().toString().replace("_", " "));
                sb2.append(" ON UPDATE ");
                sb2.append(column.onUpdate().toString().replace("_", " "));
            }
        }
        return sb2.toString();
    }

    public static void createIndexColumnDefinition(TableInfo tableInfo, Field field) {
        String columnName = tableInfo.getColumnName(field);
        Column column = (Column) field.getAnnotation(Column.class);
        if (field.getName().equals("mId")) {
            return;
        }
        if (column.index()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(columnName);
            sIndexGroupMap.put(columnName, arrayList);
        }
        for (String str : column.indexGroups()) {
            if (!TextUtils.isEmpty(str)) {
                List<String> arrayList2 = sIndexGroupMap.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                arrayList2.add(columnName);
                sIndexGroupMap.put(str, arrayList2);
            }
        }
    }

    public static String[] createIndexDefinition(TableInfo tableInfo) {
        ArrayList arrayList = new ArrayList();
        sIndexGroupMap = new HashMap<>();
        Iterator<Field> it = tableInfo.getFields().iterator();
        while (it.hasNext()) {
            createIndexColumnDefinition(tableInfo, it.next());
        }
        if (sIndexGroupMap.isEmpty()) {
            return new String[0];
        }
        for (Map.Entry<String, List<String>> entry : sIndexGroupMap.entrySet()) {
            arrayList.add(String.format("CREATE INDEX IF NOT EXISTS %s on %s(%s);", g.f.f75121f + tableInfo.getTableName() + "_" + entry.getKey(), tableInfo.getTableName(), TextUtils.join(", ", entry.getValue())));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @m1
    public static String createTableDefinition(TableInfo tableInfo) {
        ArrayList arrayList = new ArrayList();
        Iterator<Field> it = tableInfo.getFields().iterator();
        while (it.hasNext()) {
            String strCreateColumnDefinition = createColumnDefinition(tableInfo, it.next());
            if (!TextUtils.isEmpty(strCreateColumnDefinition)) {
                arrayList.add(strCreateColumnDefinition);
            }
        }
        arrayList.addAll(createUniqueDefinition(tableInfo));
        return String.format("CREATE TABLE IF NOT EXISTS %s (%s);", tableInfo.getTableName(), TextUtils.join(", ", arrayList));
    }

    public static void createUniqueColumnDefinition(TableInfo tableInfo, Field field) {
        String columnName = tableInfo.getColumnName(field);
        Column column = (Column) field.getAnnotation(Column.class);
        if (field.getName().equals("mId")) {
            return;
        }
        String[] strArrUniqueGroups = column.uniqueGroups();
        Column.ConflictAction[] conflictActionArrOnUniqueConflicts = column.onUniqueConflicts();
        if (strArrUniqueGroups.length != conflictActionArrOnUniqueConflicts.length) {
            return;
        }
        for (int i10 = 0; i10 < strArrUniqueGroups.length; i10++) {
            String str = strArrUniqueGroups[i10];
            Column.ConflictAction conflictAction = conflictActionArrOnUniqueConflicts[i10];
            if (!TextUtils.isEmpty(str)) {
                List<String> arrayList = sUniqueGroupMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(columnName);
                sUniqueGroupMap.put(str, arrayList);
                sOnUniqueConflictsMap.put(str, conflictAction);
            }
        }
    }

    public static ArrayList<String> createUniqueDefinition(TableInfo tableInfo) {
        ArrayList<String> arrayList = new ArrayList<>();
        sUniqueGroupMap = new HashMap<>();
        sOnUniqueConflictsMap = new HashMap<>();
        Iterator<Field> it = tableInfo.getFields().iterator();
        while (it.hasNext()) {
            createUniqueColumnDefinition(tableInfo, it.next());
        }
        if (!sUniqueGroupMap.isEmpty()) {
            for (String str : sUniqueGroupMap.keySet()) {
                arrayList.add(String.format("UNIQUE (%s) ON CONFLICT %s", TextUtils.join(", ", sUniqueGroupMap.get(str)), sOnUniqueConflictsMap.get(str).toString()));
            }
        }
        return arrayList;
    }

    @m1
    public static void execSql(String str) {
        Cache.openDatabase().execSQL(str);
    }

    @m1
    public static int intQuery(String str, String[] strArr) {
        Cursor cursorRawQuery = Cache.openDatabase().rawQuery(str, strArr);
        try {
            int iProcessIntCursor = processIntCursor(cursorRawQuery);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return iProcessIntCursor;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static List<String> lexSqlScript(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder(100);
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ';' || z10 || z11) {
                if (cCharAt == '\'' && !z11) {
                    z10 = !z10;
                }
                z11 = cCharAt == '\\' && !z11;
                sb2.append(cCharAt);
            } else {
                arrayList.add(sb2.toString());
                sb2 = new StringBuilder(100);
                z10 = false;
                z11 = false;
            }
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @m1
    public static <T extends Model> List<T> processCursor(Class<? extends Model> cls, Cursor cursor) {
        String idName = Cache.getTableInfo(cls).getIdName();
        ArrayList arrayList = new ArrayList();
        try {
            Constructor<? extends Model> constructor = cls.getConstructor(null);
            if (cursor.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(cursor.getColumnNames()));
                do {
                    Model entity = Cache.getEntity(cls, cursor.getLong(arrayList2.indexOf(idName)));
                    if (entity == null) {
                        entity = constructor.newInstance(null);
                    }
                    entity.loadFromCursor(cursor);
                    arrayList.add(entity);
                } while (cursor.moveToNext());
            }
        } catch (NoSuchMethodException unused) {
            throw new RuntimeException("Your model " + cls.getName() + " does not define a default constructor. The default constructor is required for now in ActiveAndroid models, as the process to populate the ORM model is : 1. instantiate default model 2. populate fields");
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    private static int processIntCursor(Cursor cursor) {
        if (cursor.moveToFirst()) {
            return cursor.getInt(0);
        }
        return 0;
    }

    @m1
    public static <T extends Model> List<T> rawQuery(Class<? extends Model> cls, String str, String[] strArr) {
        Cursor cursorRawQuery = Cache.openDatabase().rawQuery(str, strArr);
        try {
            List<T> listProcessCursor = processCursor(cls, cursorRawQuery);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return listProcessCursor;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @m1
    public static <T extends Model> T rawQuerySingle(Class<? extends Model> cls, String str, String[] strArr) {
        List listRawQuery = rawQuery(cls, str, strArr);
        if (listRawQuery.size() > 0) {
            return (T) listRawQuery.get(0);
        }
        return null;
    }

    @m1
    public static void execSql(String str, Object[] objArr) {
        Cache.openDatabase().execSQL(str, objArr);
    }
}
