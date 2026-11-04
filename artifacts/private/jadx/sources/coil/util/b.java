package coil.util;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCalls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Calls.kt\ncoil/util/-Calls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,44:1\n318#2,11:45\n*S KotlinDebug\n*F\n+ 1 Calls.kt\ncoil/util/-Calls\n*L\n16#1:45,11\n*E\n"})
@oj.i(name = "-Calls")
public final class b {
    @Nullable
    public static final Object a(@NotNull okhttp3.e eVar, @NotNull kotlin.coroutines.d<? super f0> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        q qVar = new q(eVar, pVar);
        FirebasePerfOkHttpClient.enqueue(eVar, qVar);
        pVar.e0(qVar);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }
}
