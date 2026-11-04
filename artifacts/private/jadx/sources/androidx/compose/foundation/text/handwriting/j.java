package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f19368a;

    static {
        f19368a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f19368a;
    }
}
