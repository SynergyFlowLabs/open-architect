package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    @w0(api = 21)
    private static class C0726a {
        private C0726a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @w0(api = 24)
    private static class b {
        private b() {
        }

        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    private a() {
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    static void b(@NonNull Context context, @NonNull ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 34 ? b.a(context).getCacheDir() : C0726a.a(b.a(context)))) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
