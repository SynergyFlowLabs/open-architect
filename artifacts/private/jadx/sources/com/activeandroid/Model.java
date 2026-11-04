package com.activeandroid;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.activeandroid.serializer.TypeSerializer;
import com.activeandroid.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Model {
    private static final int HASH_PRIME = 739;
    private final String idName;
    private final TableInfo mTableInfo;
    private Long mId = null;
    private int mVersion = 0;

    @m1
    public Model() {
        TableInfo tableInfo = Cache.getTableInfo(getClass());
        this.mTableInfo = tableInfo;
        this.idName = tableInfo.getIdName();
    }

    @m1
    public static <T extends Model> T load(Class<T> cls, long j10) {
        TableInfo tableInfo = Cache.getTableInfo(cls);
        return (T) new Select().from(cls).where(tableInfo.getIdName() + "=?", Long.valueOf(j10)).executeSingle();
    }

    @m1
    public final void delete() {
        Cache.openDatabase().delete(this.mTableInfo.getTableName(), this.idName + "=?", new String[]{getId().toString()});
        Cache.removeEntity(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Model) {
            Model model = (Model) obj;
            Long l10 = this.mId;
            if (l10 != null) {
                return l10.equals(model.mId) && this.mTableInfo.getTableName().equals(model.mTableInfo.getTableName());
            }
        }
        return this == obj;
    }

    @p0
    public final Long getId() {
        return this.mId;
    }

    @m1
    protected final <T extends Model> List<T> getMany(Class<T> cls, String str) {
        return new Select().from(cls).where(Cache.getTableName(cls) + "." + str + "=?", getId()).execute();
    }

    public final int getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        Long l10 = this.mId;
        return ((l10 == null ? super.hashCode() : l10.hashCode()) * HASH_PRIME) + HASH_PRIME + (this.mTableInfo.getTableName().hashCode() * HASH_PRIME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final void loadFromCursor(Cursor cursor) {
        ArrayList arrayList = new ArrayList(Arrays.asList(cursor.getColumnNames()));
        for (Field field : this.mTableInfo.getFields()) {
            String columnName = this.mTableInfo.getColumnName(field);
            Class<?> type = field.getType();
            int iIndexOf = arrayList.indexOf(columnName);
            if (iIndexOf >= 0) {
                boolean z10 = true;
                field.setAccessible(true);
                try {
                    boolean zIsNull = cursor.isNull(iIndexOf);
                    TypeSerializer parserForType = Cache.getParserForType(type);
                    if (parserForType != null) {
                        type = parserForType.getSerializedType();
                    }
                    Object objValueOf = null;
                    if (zIsNull) {
                        field = null;
                    } else if (type.equals(Byte.class) || type.equals(Byte.TYPE) || type.equals(Short.class) || type.equals(Short.TYPE) || type.equals(Integer.class) || type.equals(Integer.TYPE)) {
                        objValueOf = Integer.valueOf(cursor.getInt(iIndexOf));
                    } else if (type.equals(Long.class) || type.equals(Long.TYPE)) {
                        objValueOf = Long.valueOf(cursor.getLong(iIndexOf));
                    } else if (type.equals(Float.class) || type.equals(Float.TYPE)) {
                        objValueOf = Float.valueOf(cursor.getFloat(iIndexOf));
                    } else if (type.equals(Double.class) || type.equals(Double.TYPE)) {
                        objValueOf = Double.valueOf(cursor.getDouble(iIndexOf));
                    } else if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
                        if (cursor.getInt(iIndexOf) == 0) {
                            z10 = false;
                        }
                        objValueOf = Boolean.valueOf(z10);
                    } else if (type.equals(Character.class) || type.equals(Character.TYPE)) {
                        objValueOf = Character.valueOf(cursor.getString(iIndexOf).charAt(0));
                    } else if (type.equals(String.class)) {
                        objValueOf = cursor.getString(iIndexOf);
                    } else if (type.equals(Byte[].class) || type.equals(byte[].class)) {
                        objValueOf = cursor.getBlob(iIndexOf);
                    } else if (ReflectionUtils.isModel(type)) {
                        long j10 = cursor.getLong(iIndexOf);
                        Model entity = Cache.getEntity(type, j10);
                        if (entity == null) {
                            entity = new Select().from(type).where(this.idName + "=?", Long.valueOf(j10)).executeSingle();
                        }
                        objValueOf = entity;
                    } else if (ReflectionUtils.isSubclassOf(type, Enum.class)) {
                        objValueOf = Enum.valueOf(type, cursor.getString(iIndexOf));
                    }
                    if (parserForType != null && !zIsNull) {
                        objValueOf = parserForType.deserialize(objValueOf);
                    }
                    if (objValueOf != null) {
                        field.set(this, objValueOf);
                    }
                } catch (IllegalAccessException | IllegalArgumentException | SecurityException unused) {
                }
            }
        }
        if (this.mId != null) {
            Cache.addEntity(this);
        }
    }

    @m1
    public final Long save() {
        return save(null);
    }

    public String toString() {
        return this.mTableInfo.getTableName() + "@" + getId();
    }

    @m1
    public final Long save(@p0 Long l10) {
        TypeSerializer parserForType;
        SQLiteDatabase sQLiteDatabaseOpenDatabase = Cache.openDatabase();
        ContentValues contentValues = new ContentValues();
        for (Field field : this.mTableInfo.getFields()) {
            String columnName = this.mTableInfo.getColumnName(field);
            Class<?> type = field.getType();
            field.setAccessible(true);
            try {
                Object objSerialize = field.get(this);
                if (objSerialize != null && (parserForType = Cache.getParserForType(type)) != null && (objSerialize = parserForType.serialize(objSerialize)) != null) {
                    type = objSerialize.getClass();
                }
                if (l10 != null) {
                    contentValues.put(this.idName, l10);
                }
                if (objSerialize == null) {
                    contentValues.putNull(columnName);
                } else if (type.equals(Byte.class) || type.equals(Byte.TYPE)) {
                    contentValues.put(columnName, (Byte) objSerialize);
                } else if (type.equals(Short.class) || type.equals(Short.TYPE)) {
                    contentValues.put(columnName, (Short) objSerialize);
                } else if (type.equals(Integer.class) || type.equals(Integer.TYPE)) {
                    contentValues.put(columnName, (Integer) objSerialize);
                } else if (type.equals(Long.class) || type.equals(Long.TYPE)) {
                    contentValues.put(columnName, (Long) objSerialize);
                } else if (type.equals(Float.class) || type.equals(Float.TYPE)) {
                    contentValues.put(columnName, (Float) objSerialize);
                } else if (type.equals(Double.class) || type.equals(Double.TYPE)) {
                    contentValues.put(columnName, (Double) objSerialize);
                } else if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
                    contentValues.put(columnName, (Boolean) objSerialize);
                } else if (type.equals(Character.class) || type.equals(Character.TYPE)) {
                    contentValues.put(columnName, objSerialize.toString());
                } else if (type.equals(String.class)) {
                    contentValues.put(columnName, objSerialize.toString());
                } else if (type.equals(Byte[].class) || type.equals(byte[].class)) {
                    contentValues.put(columnName, (byte[]) objSerialize);
                } else if (ReflectionUtils.isModel(type)) {
                    contentValues.put(columnName, ((Model) objSerialize).getId());
                } else if (ReflectionUtils.isSubclassOf(type, Enum.class)) {
                    contentValues.put(columnName, ((Enum) objSerialize).name());
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        if (this.mId == null) {
            this.mId = Long.valueOf(sQLiteDatabaseOpenDatabase.insert(this.mTableInfo.getTableName(), null, contentValues));
        } else {
            sQLiteDatabaseOpenDatabase.update(this.mTableInfo.getTableName(), contentValues, this.idName + "=" + this.mId, null);
        }
        this.mVersion++;
        return this.mId;
    }

    @m1
    public static void delete(Class<? extends Model> cls, long j10) {
        TableInfo tableInfo = Cache.getTableInfo(cls);
        new Delete().from(cls).where(tableInfo.getIdName() + "=?", Long.valueOf(j10)).execute();
    }
}
