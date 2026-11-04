package androidx.fragment.app;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 {
    @NotNull
    public static final <F extends Fragment> F a(@NotNull View view) {
        return (F) FragmentManager.u0(view);
    }
}
