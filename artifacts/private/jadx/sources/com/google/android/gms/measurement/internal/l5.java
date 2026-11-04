package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class l5 extends com.google.android.gms.internal.measurement.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n5 f110221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l5(n5 n5Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(n5Var);
        this.f110221a = n5Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.m1
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            h7 h7Var = this.f110221a.f110184a;
            h7Var.a().o().a("Opening the local database failed, dropping and recreating it");
            h7Var.w();
            if (!h7Var.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                h7Var.a().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f110221a.f110184a.a().o().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.m1
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        u.b(this.f110221a.f110184a.a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.m1
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.m1
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        u.a(this.f110221a.f110184a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", n5.f110281e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.m1
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
