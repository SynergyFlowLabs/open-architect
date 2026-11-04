package com.superwall.sdk.misc;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o0;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Scopes.kt\ncom/superwall/sdk/misc/SuperwallScope$DefaultImpls\n+ 3 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,48:1\n17#2:49\n18#2:52\n20#2:61\n136#3,2:50\n138#3,8:53\n*S KotlinDebug\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/SuperwallScope$DefaultImpls\n*L\n17#1:50,2\n17#1:53,8\n*E\n"})
public final class SuperwallScope$DefaultImpls$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements o0 {
    public SuperwallScope$DefaultImpls$special$$inlined$CoroutineExceptionHandler$1(o0.b bVar) {
        super(bVar);
    }

    @Override // kotlinx.coroutines.o0
    public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        try {
            throw th2;
        } catch (Throwable th3) {
            if (ErrorTrackingKt.shouldLog(th3)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th3);
                }
            }
            new Either.Failure(th3);
        }
    }
}
