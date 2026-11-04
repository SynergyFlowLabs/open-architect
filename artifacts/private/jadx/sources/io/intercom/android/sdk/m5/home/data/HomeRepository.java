package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HomeRepository {
    public static final int $stable = 8;

    @NotNull
    private final MessengerApi messengerApi;

    @NotNull
    private final NexusClient nexusClient;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Object getHomeCards(@NotNull d<? super NetworkResponse<HomeV2Response>> dVar) {
        return MessengerApi.DefaultImpls.getHomeCardsV2Suspend$default(this.messengerApi, null, dVar, 1, null);
    }

    @NotNull
    public final i<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public HomeRepository(@NotNull MessengerApi messengerApi, @NotNull NexusClient nexusClient) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        this.messengerApi = messengerApi;
        this.nexusClient = nexusClient;
    }

    public /* synthetic */ HomeRepository(MessengerApi messengerApi, NexusClient nexusClient, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient);
    }
}
