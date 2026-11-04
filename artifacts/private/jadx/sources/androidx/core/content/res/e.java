package androidx.core.content.res;

import android.content.res.Resources;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private e() {
    }

    public static int a(@NonNull Resources resources) {
        return resources.getConfiguration().densityDpi;
    }
}
