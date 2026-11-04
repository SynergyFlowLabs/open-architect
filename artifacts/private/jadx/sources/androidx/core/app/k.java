package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47064a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f47065b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47066c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47067d = 3;

    @w0(23)
    static class a {
        private a() {
        }

        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @w0(29)
    static class b {
        private b() {
        }

        static int a(@androidx.annotation.p0 AppOpsManager appOpsManager, @NonNull String str, int i10, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        @NonNull
        static String b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @androidx.annotation.p0
        static AppOpsManager c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private k() {
    }

    public static int a(@NonNull Context context, int i10, @NonNull String str, @NonNull String str2) {
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i10, b.b(context));
    }

    public static int b(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i10, str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i10, str2);
    }

    public static int d(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    @androidx.annotation.p0
    public static String f(@NonNull String str) {
        return a.d(str);
    }
}
