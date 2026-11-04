package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@w0(22)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f48204a;

    /* JADX INFO: renamed from: androidx.core.telephony.a$a, reason: collision with other inner class name */
    @w0(29)
    private static class C0402a {
        private C0402a() {
        }

        static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    private a() {
    }

    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        return C0402a.a(i10);
    }
}
