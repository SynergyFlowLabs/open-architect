package w2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f385875a = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final b a(@NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        return new b(s0Var);
    }

    @NotNull
    public static final b b() {
        CoroutineContext coroutineContextM0;
        try {
            coroutineContextM0 = l1.e().M0();
        } catch (IllegalStateException unused) {
            coroutineContextM0 = kotlin.coroutines.h.f312451a;
        } catch (l0 unused2) {
            coroutineContextM0 = kotlin.coroutines.h.f312451a;
        }
        return new b(coroutineContextM0.plus(q3.c(null, 1, null)));
    }
}
