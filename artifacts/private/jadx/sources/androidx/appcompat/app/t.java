package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Service {

    @w0(24)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a() {
            return 512;
        }
    }

    @NonNull
    public static ServiceInfo a(@NonNull Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) t.class), a.a() | 128);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
