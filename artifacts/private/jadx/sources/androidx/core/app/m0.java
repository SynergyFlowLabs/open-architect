package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47093a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f47094b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47095c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47096d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47097e = 1073745919;

    @w0(24)
    static class a {
        private a() {
        }

        static void a(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    @w0(29)
    static class b {
        private b() {
        }

        static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & 255);
            }
        }
    }

    @w0(34)
    static class c {
        private c() {
        }

        static void a(Service service, int i10, Notification notification, int i11) {
            if (i11 == 0 || i11 == -1) {
                service.startForeground(i10, notification, i11);
            } else {
                service.startForeground(i10, notification, i11 & m0.f47097e);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    private m0() {
    }

    public static void a(@NonNull Service service, int i10, @NonNull Notification notification, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a(service, i10, notification, i11);
        } else {
            b.a(service, i10, notification, i11);
        }
    }

    public static void b(@NonNull Service service, int i10) {
        a.a(service, i10);
    }
}
