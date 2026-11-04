package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n5 extends b5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f110281e = {io.sentry.protocol.a.b.f306114f, "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l5 f110282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f110283d;

    n5(h7 h7Var) {
        super(h7Var);
        Context contextD = this.f110184a.d();
        this.f110184a.w();
        this.f110282c = new l5(this, contextD, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141 A[Catch: all -> 0x017d, TRY_ENTER, TryCatch #15 {all -> 0x017d, blocks: (B:30:0x0096, B:32:0x009c, B:43:0x00c5, B:45:0x00e9, B:47:0x00f3, B:49:0x00fb, B:59:0x0117, B:73:0x0141, B:75:0x0147, B:76:0x014a, B:93:0x0184, B:83:0x016d), top: B:109:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179 A[PHI: r8 r10 r17
      0x0179: PHI (r8v6 int) = (r8v4 int), (r8v4 int), (r8v7 int) binds: [B:79:0x0164, B:96:0x019b, B:87:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x0164, B:96:0x019b, B:87:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r17v8 boolean) = (r17v5 boolean), (r17v6 boolean), (r17v9 boolean) binds: [B:79:0x0164, B:96:0x019b, B:87:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    @androidx.annotation.m1
    private final boolean z(int i10, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseW;
        boolean z10;
        boolean z11;
        Cursor cursorRawQuery;
        h();
        boolean z12 = false;
        z12 = false;
        if (!this.f110283d) {
            h7 h7Var = this.f110184a;
            k kVarW = h7Var.w();
            y4 y4Var = z4.f110753c1;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarO = kVarW.H(null, y4Var) ? this.f110184a.L().o(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (h7Var.w().H(null, y4Var) && zzrVarO != null) {
                contentValues.put(io.sentry.protocol.a.b.f306114f, zzrVarO.f110883c);
                contentValues.put("app_version_int", Long.valueOf(zzrVarO.f110893j));
            }
            h7Var.w();
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseW = w();
                    if (sQLiteDatabaseW == null) {
                        this.f110283d = true;
                    } else {
                        try {
                            sQLiteDatabaseW.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseW.rawQuery("select count(1) from messages", null);
                            long j10 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j10 = cursorRawQuery.getLong(z12 ? 1 : 0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseW != null) {
                                            sQLiteDatabaseW.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    Object[] objArr = z12 ? 1 : 0;
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseW != null) {
                                        sQLiteDatabaseW.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    Object[] objArr2 = z12 ? 1 : 0;
                                    z10 = z12 ? 1 : 0;
                                    this.f110184a.a().o().b("Error writing entry; local database full", e);
                                    this.f110283d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseW != null) {
                                        sQLiteDatabaseW.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabaseW != null) {
                                        sQLiteDatabaseW.endTransaction();
                                    }
                                    this.f110184a.a().o().b("Error writing entry to local database", e);
                                    this.f110283d = z11;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseW != null) {
                                        sQLiteDatabaseW.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                }
                            }
                            if (j10 >= androidx.media3.exoplayer.audio.s0.f63372z) {
                                h7Var.a().o().a("Data loss, local db full");
                                long j11 = 100001 - j10;
                                long jDelete = sQLiteDatabaseW.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j11)});
                                if (jDelete != j11) {
                                    u5 u5VarO = h7Var.a().o();
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                            try {
                                                u5VarO.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                                            } catch (SQLiteFullException e12) {
                                                e = e12;
                                                this.f110184a.a().o().b("Error writing entry; local database full", e);
                                                this.f110283d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseW != null) {
                                                    sQLiteDatabaseW.close();
                                                }
                                                i11++;
                                                z12 = z10;
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                if (sQLiteDatabaseW != null) {
                                                    sQLiteDatabaseW.endTransaction();
                                                }
                                                this.f110184a.a().o().b("Error writing entry to local database", e);
                                                this.f110283d = z11;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseW != null) {
                                                    sQLiteDatabaseW.close();
                                                }
                                                i11++;
                                                z12 = z10;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i12);
                                            i12 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseW != null) {
                                                sQLiteDatabaseW.close();
                                            }
                                            i11++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e14) {
                                        e = e14;
                                        this.f110184a.a().o().b("Error writing entry; local database full", e);
                                        this.f110283d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseW != null) {
                                            sQLiteDatabaseW.close();
                                        }
                                        i11++;
                                        z12 = z10;
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        z11 = true;
                                        if (sQLiteDatabaseW != null && sQLiteDatabaseW.inTransaction()) {
                                            sQLiteDatabaseW.endTransaction();
                                        }
                                        this.f110184a.a().o().b("Error writing entry to local database", e);
                                        this.f110283d = z11;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseW != null) {
                                            sQLiteDatabaseW.close();
                                        }
                                        i11++;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                }
                            } else {
                                z10 = z12 ? 1 : 0;
                                z11 = true;
                            }
                            sQLiteDatabaseW.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseW.setTransactionSuccessful();
                            sQLiteDatabaseW.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseW.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            Object[] objArr3 = z12 ? 1 : 0;
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseW = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseW = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e19) {
                    e = e19;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabaseW = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseW = null;
                }
            }
            Object[] objArr4 = z12 ? 1 : 0;
            boolean z13 = z12 ? 1 : 0;
            this.f110184a.a().w().a("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return false;
    }

    @androidx.annotation.m1
    public final void o() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseW = w();
            if (sQLiteDatabaseW == null || (iDelete = sQLiteDatabaseW.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f110184a.a().w().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.f110184a.a().o().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        e0.a(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(0, bArrMarshall);
        }
        this.f110184a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        we.a(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(1, bArrMarshall);
        }
        this.f110184a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(zzah zzahVar) {
        h7 h7Var = this.f110184a;
        byte[] bArrT = h7Var.C().T(zzahVar);
        if (bArrT.length <= 131072) {
            return z(2, bArrT);
        }
        h7Var.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(zzbe zzbeVar) {
        h7 h7Var = this.f110184a;
        byte[] bArrT = h7Var.C().T(zzbeVar);
        if (bArrT == null) {
            h7Var.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrT.length <= 131072) {
            return z(4, bArrT);
        }
        h7Var.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0377 A[Catch: all -> 0x03ac, TryCatch #8 {all -> 0x03ac, blocks: (B:38:0x00f1, B:40:0x00f7, B:42:0x010a, B:44:0x0110, B:56:0x0154, B:61:0x016e, B:63:0x0173, B:181:0x0371, B:183:0x0377, B:184:0x037a, B:191:0x039c, B:201:0x03b8, B:78:0x01ac, B:79:0x01af, B:77:0x01a8, B:87:0x01c4, B:89:0x01d8, B:96:0x01f3, B:97:0x01fc, B:98:0x01ff, B:94:0x01ed, B:101:0x0203, B:105:0x021b, B:119:0x0242, B:120:0x024c, B:121:0x024f, B:117:0x023c, B:124:0x0255, B:128:0x0269, B:142:0x0290, B:144:0x029a, B:145:0x029d, B:140:0x028a, B:148:0x02a2, B:149:0x02b2, B:156:0x02ff, B:158:0x031c, B:159:0x032b), top: B:224:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x038c  */
    /* JADX WARN: Code duplicated, block: B:194:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a8 A[PHI: r6 r11 r13 r17 r19 r21
      0x03a8: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r19v9 java.lang.String) = (r19v4 java.lang.String), (r19v6 java.lang.String), (r19v10 java.lang.String) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r21v9 java.lang.String) = (r21v4 java.lang.String), (r21v6 java.lang.String), (r21v10 java.lang.String) binds: [B:187:0x038f, B:204:0x03cd, B:195:0x03a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:208:0x03df  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:224:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.k] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v49 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    public final List t(int i10) {
        Cursor cursor;
        ?? r13;
        ?? W;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j10;
        ?? r17;
        ?? r16;
        long j11;
        String string;
        h7 h7Var;
        int i11;
        int i12;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        String str = "entry";
        String str2 = "type";
        String str3 = "rowid";
        h();
        ?? r10 = 0;
        if (this.f110283d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!x()) {
            return arrayList;
        }
        int i13 = 0;
        int i14 = 5;
        int i15 = 0;
        for (int i16 = 5; i15 < i16; i16 = 5) {
            try {
                W = w();
                try {
                    if (W == 0) {
                        this.f110283d = true;
                        return r10;
                    }
                    try {
                        W.beginTransaction();
                        try {
                            cursorQuery2 = W.query("messages", new String[]{str3}, "type=?", new String[]{androidx.exifinterface.media.a.f51345a5}, null, null, "rowid desc", "1");
                            try {
                                long j12 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j10 = cursorQuery2.getLong(i13);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j10 = -1;
                                }
                                if (j10 != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i13] = String.valueOf(j10);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r10;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                h7 h7Var2 = this.f110184a;
                                ?? W2 = h7Var2.w();
                                int i17 = 1;
                                y4 y4Var = z4.f110753c1;
                                boolean zH = W2.H(r10, y4Var);
                                int i18 = 4;
                                int i19 = 3;
                                int i20 = 2;
                                if (zH) {
                                    strArr2 = new String[i16];
                                    strArr2[i13] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = io.sentry.protocol.a.b.f306114f;
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                h7 h7Var3 = h7Var2;
                                cursorQuery = W.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j12 = cursorQuery.getLong(i13);
                                        int i21 = cursorQuery.getInt(i17);
                                        byte[] blob = cursorQuery.getBlob(i20);
                                        try {
                                            if (h7Var3.w().H(null, y4Var)) {
                                                string = cursorQuery.getString(i19);
                                                j11 = cursorQuery.getLong(i18);
                                            } else {
                                                j11 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j13 = j11;
                                            str2 = str2;
                                            if (i21 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    h7Var = h7Var3;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                        arrayList.add(new m5(zzbgVarCreateFromParcel, string, j13));
                                                                    }
                                                                    str = str4;
                                                                    i12 = 2;
                                                                    i11 = 3;
                                                                    i13 = 0;
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    SystemClock.sleep(i14);
                                                                    i14 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (W != 0) {
                                                                        W.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r10 = 0;
                                                                } catch (SQLiteFullException e10) {
                                                                    e = e10;
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                    this.f110283d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (W != 0) {
                                                                        W.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r10 = 0;
                                                                } catch (SQLiteException e11) {
                                                                    e = e11;
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    if (W != 0) {
                                                                        try {
                                                                            if (W.inTransaction()) {
                                                                                W.endTransaction();
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            cursor = cursorQuery;
                                                                            r13 = W;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r13 != 0) {
                                                                                r13.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                    this.f110283d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (W != 0) {
                                                                        W.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r10 = 0;
                                                                }
                                                            } catch (i6.a.C1923a unused2) {
                                                                this.f110184a.a().o().a("Failed to load event from local database");
                                                                parcelObtain.recycle();
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            parcelObtain.recycle();
                                                            throw th;
                                                        }
                                                    } catch (i6.a.C1923a unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e12) {
                                                    e = e12;
                                                    str3 = str3;
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    str3 = str3;
                                                }
                                            } else {
                                                h7Var = h7Var3;
                                                str3 = str3;
                                                if (i21 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (i6.a.C1923a unused5) {
                                                            this.f110184a.a().o().a("Failed to load user property from local database");
                                                            parcelObtain2.recycle();
                                                            zzplVarCreateFromParcel = null;
                                                        }
                                                        if (zzplVarCreateFromParcel != null) {
                                                            arrayList.add(new m5(zzplVarCreateFromParcel, string, j13));
                                                        }
                                                        str = str4;
                                                        i12 = 2;
                                                        i11 = 3;
                                                        i13 = 0;
                                                    } catch (Throwable th5) {
                                                        parcelObtain2.recycle();
                                                        throw th5;
                                                    }
                                                } else {
                                                    i12 = 2;
                                                    if (i21 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                        if (zzahVarCreateFromParcel != null) {
                                                                            arrayList.add(new m5(zzahVarCreateFromParcel, string, j13));
                                                                        }
                                                                        i11 = 3;
                                                                        i13 = 0;
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i13 = 0;
                                                                        SystemClock.sleep(i14);
                                                                        i14 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (W != 0) {
                                                                            W.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r10 = 0;
                                                                    } catch (SQLiteFullException e14) {
                                                                        e = e14;
                                                                        i13 = 0;
                                                                        this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                        this.f110283d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (W != 0) {
                                                                            W.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r10 = 0;
                                                                    } catch (SQLiteException e15) {
                                                                        e = e15;
                                                                        i13 = 0;
                                                                        if (W != 0) {
                                                                            if (W.inTransaction()) {
                                                                                W.endTransaction();
                                                                            }
                                                                        }
                                                                        this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                        this.f110283d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (W != 0) {
                                                                            W.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r10 = 0;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    parcelObtain3.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (i6.a.C1923a unused7) {
                                                                this.f110184a.a().o().a("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                zzahVarCreateFromParcel = null;
                                                            }
                                                        } catch (i6.a.C1923a unused8) {
                                                            str = str4;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            str = str4;
                                                        }
                                                    } else {
                                                        str = str4;
                                                        if (i21 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i13 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (zzbeVarCreateFromParcel != null) {
                                                                                arrayList.add(new m5(zzbeVarCreateFromParcel, string, j13));
                                                                            }
                                                                            i11 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i14);
                                                                            i14 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (W != 0) {
                                                                                W.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r10 = 0;
                                                                        } catch (SQLiteFullException e16) {
                                                                            e = e16;
                                                                            this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                            this.f110283d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (W != 0) {
                                                                                W.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r10 = 0;
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                            if (W != 0) {
                                                                                if (W.inTransaction()) {
                                                                                    W.endTransaction();
                                                                                }
                                                                            }
                                                                            this.f110184a.a().o().b("Error reading entries from local database", e);
                                                                            this.f110283d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (W != 0) {
                                                                                W.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r10 = 0;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        parcelObtain4.recycle();
                                                                        throw th;
                                                                    }
                                                                } catch (i6.a.C1923a unused10) {
                                                                    this.f110184a.a().o().a("Failed to load default event parameters from local database");
                                                                    parcelObtain4.recycle();
                                                                    zzbeVarCreateFromParcel = null;
                                                                }
                                                            } catch (i6.a.C1923a unused11) {
                                                                i13 = 0;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } else {
                                                            i11 = 3;
                                                            i13 = 0;
                                                            if (i21 == 3) {
                                                                this.f110184a.a().w().a("Skipping app launch break");
                                                            } else {
                                                                this.f110184a.a().o().a("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i19 = i11;
                                            i13 = i13;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i17 = 1;
                                            i18 = 4;
                                            i20 = i12;
                                            h7Var3 = h7Var;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e18) {
                                            e = e18;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e19) {
                                            e = e19;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    } catch (SQLiteFullException e20) {
                                        e = e20;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    }
                                }
                                if (W.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                    this.f110184a.a().o().a("Fewer entries removed from local database than expected");
                                }
                                W.setTransactionSuccessful();
                                W.endTransaction();
                                cursorQuery.close();
                                W.close();
                                return arrayList;
                            } catch (Throwable th10) {
                                th = th10;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i14);
                                        i14 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (W != 0) {
                                            W.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r10 = 0;
                                    } catch (SQLiteFullException e22) {
                                        e = e22;
                                        W = W;
                                        cursorQuery = null;
                                        this.f110184a.a().o().b("Error reading entries from local database", e);
                                        this.f110283d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (W != 0) {
                                            W.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r10 = 0;
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                        W = W;
                                        cursorQuery = null;
                                        if (W != 0) {
                                            if (W.inTransaction()) {
                                                W.endTransaction();
                                            }
                                        }
                                        this.f110184a.a().o().b("Error reading entries from local database", e);
                                        this.f110283d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (W != 0) {
                                            W.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r10 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                    } catch (SQLiteFullException e24) {
                        e = e24;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                        W = W;
                    } catch (SQLiteException e25) {
                        e = e25;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                        W = W;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    cursor = null;
                    r13 = W;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                W = 0;
            } catch (SQLiteFullException e26) {
                e = e26;
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                W = 0;
            } catch (SQLiteException e27) {
                e = e27;
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                W = 0;
            } catch (Throwable th13) {
                th = th13;
                cursor = null;
                r13 = 0;
            }
        }
        this.f110184a.a().r().a("Failed to read events from database in reasonable time");
        return null;
    }

    @androidx.annotation.m1
    public final boolean u() {
        return z(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[PHI: r4
      0x0078: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:25:0x006e, B:32:0x008f, B:28:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.m1
    public final boolean v() {
        h();
        if (!this.f110283d && x()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseW = w();
                        if (sQLiteDatabaseW != null) {
                            sQLiteDatabaseW.beginTransaction();
                            sQLiteDatabaseW.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseW.setTransactionSuccessful();
                            sQLiteDatabaseW.endTransaction();
                            sQLiteDatabaseW.close();
                            return true;
                        }
                        this.f110283d = true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e10) {
                    this.f110184a.a().o().b("Error deleting app launch break from local database", e10);
                    this.f110283d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    this.f110184a.a().o().b("Error deleting app launch break from local database", e11);
                    this.f110283d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f110184a.a().r().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    @androidx.annotation.l1
    @androidx.annotation.m1
    final SQLiteDatabase w() throws SQLiteException {
        if (this.f110283d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f110282c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f110283d = true;
        return null;
    }

    @androidx.annotation.l1
    final boolean x() {
        h7 h7Var = this.f110184a;
        Context contextD = h7Var.d();
        h7Var.w();
        return contextD.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
