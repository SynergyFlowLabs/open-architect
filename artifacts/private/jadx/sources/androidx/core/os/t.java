package androidx.core.os;

import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f48089a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f48090b = true;

    @w0(22)
    static class a {
        private a() {
        }

        static boolean a(Message message) {
            return message.isAsynchronous();
        }

        static void b(Message message, boolean z10) {
            message.setAsynchronous(z10);
        }
    }

    private t() {
    }

    @e.a({"NewApi"})
    public static boolean a(@NonNull Message message) {
        return a.a(message);
    }

    @e.a({"NewApi"})
    public static void b(@NonNull Message message, boolean z10) {
        a.b(message, z10);
    }
}
