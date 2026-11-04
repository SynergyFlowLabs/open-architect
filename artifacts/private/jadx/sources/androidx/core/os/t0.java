package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class t0 {

    @w0(24)
    static class a {
        private a() {
        }

        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private t0() {
    }

    public static boolean a(@NonNull Context context) {
        return a.a(context);
    }
}
