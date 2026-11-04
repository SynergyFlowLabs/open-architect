package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<u3> f21874a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.foundation.v3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w3.b();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final u3 b() {
        return new u3(0L, null, 3, null);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<u3> c() {
        return f21874a;
    }

    @kotlin.l(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`", replaceWith = @kotlin.b1(expression = "LocalOverscrollFactory", imports = {"androidx.compose.foundation.LocalOverscrollFactory"}))
    @b2
    public static /* synthetic */ void d() {
    }
}
