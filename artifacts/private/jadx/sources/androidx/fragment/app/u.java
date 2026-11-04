package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    @NonNull
    @Deprecated
    public Fragment b(@NonNull Context context, @NonNull String str, @androidx.annotation.p0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @androidx.annotation.p0
    public abstract View c(@androidx.annotation.d0 int i10);

    public abstract boolean d();
}
