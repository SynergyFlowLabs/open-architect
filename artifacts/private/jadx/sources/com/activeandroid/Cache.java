package com.activeandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;
import androidx.collection.d1;
import com.activeandroid.serializer.TypeSerializer;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class Cache {
    public static final int DEFAULT_CACHE_SIZE = 1024;
    private static Context sContext;
    private static DatabaseHelper sDatabaseHelper;
    private static d1<String, Model> sEntities;
    private static boolean sIsInitialized;
    private static ModelInfo sModelInfo;

    private Cache() {
    }

    @m1
    public static synchronized void addEntity(Model model) {
        try {
            sEntities.j(getIdentifier(model), model);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m1
    public static synchronized void clear() {
        sEntities.d();
    }

    @m1
    public static synchronized void closeDatabase() {
        try {
            sDatabaseHelper.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m1
    public static synchronized void dispose() {
        closeDatabase();
        sEntities = null;
        sModelInfo = null;
        sDatabaseHelper = null;
        sIsInitialized = false;
    }

    public static Context getContext() {
        return sContext;
    }

    @m1
    public static synchronized Model getEntity(Class<? extends Model> cls, long j10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return sEntities.f(getIdentifier(cls, Long.valueOf(j10)));
    }

    @m1
    public static String getIdentifier(Class<? extends Model> cls, Long l10) {
        return getTableName(cls) + "@" + l10;
    }

    @m1
    public static synchronized TypeSerializer getParserForType(Class<?> cls) {
        return sModelInfo.getTypeSerializer(cls);
    }

    @m1
    public static synchronized TableInfo getTableInfo(Class<? extends Model> cls) {
        return sModelInfo.getTableInfo(cls);
    }

    @m1
    public static synchronized Collection<TableInfo> getTableInfos() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return sModelInfo.getTableInfos();
    }

    @m1
    public static synchronized String getTableName(Class<? extends Model> cls) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return sModelInfo.getTableInfo(cls).getTableName();
    }

    @m1
    public static synchronized void initialize(Configuration configuration) {
        if (sIsInitialized) {
            return;
        }
        sContext = configuration.getContext();
        sModelInfo = new ModelInfo(configuration);
        sDatabaseHelper = new DatabaseHelper(configuration);
        sEntities = new d1<>(configuration.getCacheSize());
        openDatabase();
        sIsInitialized = true;
    }

    public static boolean isInitialized() {
        return sIsInitialized;
    }

    @m1
    public static synchronized SQLiteDatabase openDatabase() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return sDatabaseHelper.getWritableDatabase();
    }

    @m1
    public static synchronized void removeEntity(Model model) {
        try {
            sEntities.l(getIdentifier(model));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @m1
    public static String getIdentifier(Model model) {
        return getIdentifier(model.getClass(), model.getId());
    }
}
