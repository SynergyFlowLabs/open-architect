package androidx.compose.ui.platform;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
