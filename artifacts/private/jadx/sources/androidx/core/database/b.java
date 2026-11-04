package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @w0(28)
    static class a {
        private a() {
        }

        static CursorWindow a(String str, long j10) {
            return new CursorWindow(str, j10);
        }
    }

    private b() {
    }

    @NonNull
    public static CursorWindow a(@p0 String str, long j10) {
        return a.a(str, j10);
    }
}
