package androidx.core.os;

import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f48042a = "unknown";

    @w0(21)
    static class a {
        private a() {
        }

        static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private i() {
    }

    @NonNull
    public static String a(@NonNull File file) {
        return a.a(file);
    }
}
