package coil.size;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "ViewSizeResolvers")
public final class m {
    @oj.j
    @oj.i(name = "create")
    @NotNull
    public static final <T extends View> l<T> a(@NotNull T t10) {
        return c(t10, false, 2, null);
    }

    @oj.j
    @oj.i(name = "create")
    @NotNull
    public static final <T extends View> l<T> b(@NotNull T t10, boolean z10) {
        return new g(t10, z10);
    }

    public static /* synthetic */ l c(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(view, z10);
    }
}
