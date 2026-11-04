package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n16#3:132\n16#3:134\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n124#1:131\n126#1:133\n124#1:132\n126#1:134\n*E\n"})
final class c0 extends p0<Integer> implements z0<Integer> {
    public c0(int i10) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.j.DROP_OLDEST);
        f(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.z0
    @NotNull
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(O().intValue());
        }
        return numValueOf;
    }

    public final boolean d0(int i10) {
        boolean zF;
        synchronized (this) {
            zF = f(Integer.valueOf(O().intValue() + i10));
        }
        return zF;
    }
}
