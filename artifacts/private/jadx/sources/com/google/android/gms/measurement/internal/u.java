package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: SQLiteException -> 0x00be, TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091 A[Catch: SQLiteException -> 0x00be, LOOP:0: B:29:0x0087->B:32:0x0091, LOOP_END, TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: SQLiteException -> 0x00be, LOOP:1: B:38:0x00c4->B:43:0x00d6, LOOP_START, PHI: r1
      0x00c4: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00c2, B:43:0x00d6] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[Catch: SQLiteException -> 0x00be, TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf A[Catch: SQLiteException -> 0x00be, TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df A[Catch: SQLiteException -> 0x00be, TryCatch #6 {SQLiteException -> 0x00be, blocks: (B:26:0x0049, B:28:0x0079, B:30:0x0089, B:32:0x0091, B:33:0x0094, B:34:0x00bd, B:38:0x00c4, B:40:0x00c7, B:42:0x00cf, B:43:0x00d6, B:44:0x00d9, B:46:0x00df, B:49:0x00f2, B:50:0x00f7, B:27:0x0072), top: B:67:0x0049, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    @androidx.annotation.m1
    static void a(w5 w5Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Throwable th2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i10;
        int i11;
        if (w5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            w5Var.r().c("Error querying for table", str, e);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            throw th2;
                        }
                        cursor.close();
                        throw th2;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorQuery = null;
                    w5Var.r().c("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb2 = new StringBuilder(str.length() + 22);
                    sb2.append("SELECT * FROM ");
                    sb2.append(str);
                    sb2.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb3.append("Table ");
                                sb3.append(str);
                                sb3.append(" is missing required column: ");
                                sb3.append(str4);
                                throw new SQLiteException(sb3.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i10 = 0; i10 < strArr.length; i10 += 2) {
                                if (!hashSet.remove(strArr[i10])) {
                                    sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        w5Var.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                }
            } catch (SQLiteException e12) {
                e = e12;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb4 = new StringBuilder(str.length() + 22);
                sb4.append("SELECT * FROM ");
                sb4.append(str);
                sb4.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i11 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb5 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb5.append("Table ");
                        sb5.append(str);
                        sb5.append(" is missing required column: ");
                        sb5.append(str4);
                        throw new SQLiteException(sb5.toString());
                    }
                }
                if (strArr != null) {
                    while (i10 < strArr.length) {
                        if (!hashSet.remove(strArr[i10])) {
                            sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    w5Var.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                }
            } catch (SQLiteException e13) {
                w5Var.o().b("Failed to verify columns on table that was just created", str);
                throw e13;
            }
        } catch (Throwable th5) {
            th2 = th5;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    static void b(w5 w5Var, SQLiteDatabase sQLiteDatabase) {
        if (w5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.x0.a();
        String path = sQLiteDatabase.getPath();
        int i10 = com.google.android.gms.internal.measurement.d1.f108350b;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            w5Var.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            w5Var.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            w5Var.r().a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            w5Var.r().a("Failed to turn on database write permission for owner");
        }
    }
}
