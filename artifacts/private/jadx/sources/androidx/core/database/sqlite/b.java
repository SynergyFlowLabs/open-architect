package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final <T> T a(@NotNull SQLiteDatabase sQLiteDatabase, boolean z10, @NotNull Function1<? super SQLiteDatabase, ? extends T> function1) {
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            h0.d(1);
            sQLiteDatabase.endTransaction();
            h0.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            h0.d(1);
            sQLiteDatabase.endTransaction();
            h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            sQLiteDatabase.endTransaction();
            h0.c(1);
            throw th2;
        }
    }
}
