package androidx.compose.runtime;

import android.os.Looper;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f35574a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f35575b = kotlin.g0.c(new Function0() { // from class: androidx.compose.runtime.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final c3 b() {
        return Looper.getMainLooper() != null ? n1.f36261a : f2.f35770a;
    }

    @NotNull
    public static final c3 c() {
        return (c3) f35575b.getValue();
    }

    @kotlin.l(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void d() {
    }
}
