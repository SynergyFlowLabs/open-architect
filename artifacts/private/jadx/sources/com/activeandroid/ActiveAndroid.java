package com.activeandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class ActiveAndroid {
    @m1
    public static void beginTransaction() {
        Cache.openDatabase().beginTransaction();
    }

    @m1
    public static void clearCache() {
        Cache.clear();
    }

    @m1
    public static void dispose() {
        Cache.dispose();
    }

    @m1
    public static void endTransaction() {
        Cache.openDatabase().endTransaction();
    }

    @m1
    public static void execSQL(String str) {
        Cache.openDatabase().execSQL(str);
    }

    @m1
    public static SQLiteDatabase getDatabase() {
        return Cache.openDatabase();
    }

    @m1
    public static boolean inTransaction() {
        return Cache.openDatabase().inTransaction();
    }

    @m1
    public static void initialize(Context context) {
        initialize(new Configuration.Builder(context).create());
    }

    @m1
    public static void setTransactionSuccessful() {
        Cache.openDatabase().setTransactionSuccessful();
    }

    @m1
    public static void execSQL(String str, Object[] objArr) {
        Cache.openDatabase().execSQL(str, objArr);
    }

    @m1
    public static void initialize(Configuration configuration) {
        Cache.initialize(configuration);
    }
}
