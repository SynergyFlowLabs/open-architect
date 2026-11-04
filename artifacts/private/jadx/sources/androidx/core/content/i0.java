package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47535a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f47536b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47537c = -2;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    private i0() {
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@NonNull Context context, @NonNull String str, @androidx.annotation.p0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, int i11, @androidx.annotation.p0 String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strF = androidx.core.app.k.f(str);
        if (strF == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid != null && packagesForUid.length > 0) {
                str2 = packagesForUid[0];
            }
            return -1;
        }
        return ((Process.myUid() != i11 || !androidx.core.util.o.a(context.getPackageName(), str2)) ? androidx.core.app.k.e(context, strF, str2) : androidx.core.app.k.a(context, i11, strF, str2)) == 0 ? 0 : -2;
    }

    public static int d(@NonNull Context context, @NonNull String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
