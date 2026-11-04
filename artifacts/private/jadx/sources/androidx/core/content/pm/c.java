package androidx.core.content.pm;

import android.content.pm.PermissionInfo;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    @w0(28)
    static class a {
        private a() {
        }

        static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: renamed from: androidx.core.content.pm.c$c, reason: collision with other inner class name */
    @e.a({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface InterfaceC0385c {
    }

    private c() {
    }

    @e.a({"WrongConstant"})
    public static int a(@NonNull PermissionInfo permissionInfo) {
        return a.a(permissionInfo);
    }

    @e.a({"WrongConstant"})
    public static int b(@NonNull PermissionInfo permissionInfo) {
        return a.b(permissionInfo);
    }
}
