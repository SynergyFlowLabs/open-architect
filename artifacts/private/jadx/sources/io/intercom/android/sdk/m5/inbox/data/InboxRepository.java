package io.intercom.android.sdk.m5.inbox.data;

import androidx.compose.runtime.internal.w0;
import androidx.media3.extractor.text.ttml.c;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.ConversationsResponse;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class InboxRepository {
    public static final int $stable = 8;

    @NotNull
    private final AblyManager ablyManager;

    @NotNull
    private final MessengerApi api;

    @NotNull
    private final NexusClient nexusClient;

    public InboxRepository() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Object getConversations$default(InboxRepository inboxRepository, Long l10, int i10, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l10 = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 20;
        }
        return inboxRepository.getConversations(l10, i10, dVar);
    }

    @Nullable
    public final Object getConversations(@Nullable Long l10, int i10, @NotNull d<? super NetworkResponse<ConversationsResponse.Builder>> dVar) {
        return this.api.getConversationsSuspend(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(l10 == null ? MapsKt.mapOf(TuplesKt.to("per_page", b.f(i10))) : MapsKt.mapOf(TuplesKt.to("per_page", b.f(i10)), TuplesKt.to(c.f68676d0, l10))), dVar);
    }

    @NotNull
    public final i<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    public InboxRepository(@NotNull MessengerApi api, @NotNull NexusClient nexusClient, @NotNull AblyManager ablyManager) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        this.api = api;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
    }

    public /* synthetic */ InboxRepository(MessengerApi messengerApi, NexusClient nexusClient, AblyManager ablyManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getNexusClient() : nexusClient, (i10 & 4) != 0 ? Injector.get().getAblyManager() : ablyManager);
    }
}
