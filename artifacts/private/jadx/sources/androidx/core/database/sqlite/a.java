package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.database.sqlite.a$a, reason: collision with other inner class name */
    @w0(28)
    static class C0387a {
        private C0387a() {
        }

        static void a(SQLiteCursor sQLiteCursor, boolean z10) {
            sQLiteCursor.setFillWindowForwardOnly(z10);
        }
    }

    private a() {
    }

    public static void a(@NonNull SQLiteCursor sQLiteCursor, boolean z10) {
        C0387a.a(sQLiteCursor, z10);
    }
}
