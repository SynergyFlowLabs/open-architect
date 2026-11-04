package coil.util;

import android.content.Context;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f87854a = new p();

    private p() {
    }

    @oj.n
    @kotlin.l(level = kotlin.n.ERROR, message = "ImageLoaders no longer (and should not) use OkHttp's disk cache. Use 'ImageLoader.Builder.diskCache' to configure a custom disk cache.")
    @NotNull
    public static final okhttp3.c a(@NotNull Context context) {
        l.K();
        throw new kotlin.a0();
    }

    @oj.n
    public static final void b(@NotNull View view) {
        l.t(view).a();
    }

    @oj.n
    @Nullable
    public static final coil.request.j c(@NotNull View view) {
        return l.t(view).c();
    }
}
