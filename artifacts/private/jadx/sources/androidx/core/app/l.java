package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.v0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class l {
    private l() {
    }

    @v0(expression = "bundle.getBinder(key)")
    @androidx.annotation.p0
    @Deprecated
    public static IBinder a(@NonNull Bundle bundle, @androidx.annotation.p0 String str) {
        return bundle.getBinder(str);
    }

    @v0(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void b(@NonNull Bundle bundle, @androidx.annotation.p0 String str, @androidx.annotation.p0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
