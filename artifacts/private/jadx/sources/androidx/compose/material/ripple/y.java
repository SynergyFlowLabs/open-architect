package androidx.compose.material.ripple;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m4<w> f24841a = a1.m(new Function0() { // from class: androidx.compose.material.ripple.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return y.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final l f24842b = new l(0.16f, 0.24f, 0.08f, 0.24f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final l f24843c = new l(0.08f, 0.12f, 0.04f, 0.12f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final l f24844d = new l(0.08f, 0.12f, 0.04f, 0.1f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f24845e = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";

    /* JADX INFO: Access modifiers changed from: private */
    public static final w b() {
        return h.f24764b;
    }

    @NotNull
    public static final m4<w> f() {
        return f24841a;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = f24845e)
    public static /* synthetic */ void g() {
    }
}
