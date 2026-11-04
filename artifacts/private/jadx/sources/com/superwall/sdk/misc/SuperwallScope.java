package com.superwall.sdk.misc;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface SuperwallScope extends s0 {

    @SourceDebugExtension({"SMAP\nScopes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/SuperwallScope$DefaultImpls\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,50:1\n46#2,4:51\n*S KotlinDebug\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/SuperwallScope$DefaultImpls\n*L\n16#1:51,4\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static o0 getExceptionHandler(@NotNull SuperwallScope superwallScope) {
            return new SuperwallScope$DefaultImpls$special$$inlined$CoroutineExceptionHandler$1(o0.L2);
        }
    }

    @NotNull
    o0 getExceptionHandler();
}
