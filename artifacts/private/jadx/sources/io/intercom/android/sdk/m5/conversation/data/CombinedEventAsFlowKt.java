package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCombinedEventAsFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedEventAsFlow.kt\nio/intercom/android/sdk/m5/conversation/data/CombinedEventAsFlowKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n17#2:55\n19#2:59\n49#2:60\n51#2:64\n17#2:65\n19#2:69\n46#3:56\n51#3:58\n46#3:61\n51#3:63\n46#3:66\n51#3:68\n105#4:57\n105#4:62\n105#4:67\n*S KotlinDebug\n*F\n+ 1 CombinedEventAsFlow.kt\nio/intercom/android/sdk/m5/conversation/data/CombinedEventAsFlowKt\n*L\n32#1:55\n32#1:59\n36#1:60\n36#1:64\n48#1:65\n48#1:69\n32#1:56\n32#1:58\n36#1:61\n36#1:63\n48#1:66\n48#1:68\n32#1:57\n36#1:62\n48#1:67\n*E\n"})
public final class CombinedEventAsFlowKt {
    public static final boolean ABLY_ENABLED = false;

    @NotNull
    public static final i<ParsedNexusEvent> combinedEventAsFlow(@NotNull NexusClient nexusClient, @NotNull AblyManager ablyManager) {
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        return NexusEventAsFlowKt.nexusEventAsFlow(nexusClient);
    }
}
