package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f315089a = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f315090b = false;

    private static final m0 a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        e();
        throw new kotlin.a0();
    }

    static /* synthetic */ m0 b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    private static /* synthetic */ void c() {
    }

    @k2
    public static final boolean d(@NotNull a3 a3Var) {
        return a3Var.M0() instanceof m0;
    }

    @NotNull
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @k2
    @NotNull
    public static final a3 f(@NotNull j0 j0Var, @NotNull List<? extends j0> list) {
        try {
            return j0Var.c(list);
        } catch (Throwable th2) {
            return a(th2, j0Var.b());
        }
    }
}
