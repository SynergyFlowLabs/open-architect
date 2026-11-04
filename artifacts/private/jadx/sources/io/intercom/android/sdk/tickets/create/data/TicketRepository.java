package io.intercom.android.sdk.tickets.create.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import io.sentry.a8;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.i;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketRepository {
    public static final int $stable = 8;

    @NotNull
    private final AblyManager ablyManager;

    @NotNull
    private final TicketApi api;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final NexusClient nexusClient;

    @NotNull
    private final UploadRepository uploadRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.tickets.create.data.TicketRepository", f = "TicketRepository.kt", i = {0}, l = {36}, m = "createTicket", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TicketRepository.this.createTicket(null, 0, null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TicketRepository() {
        this(null, null, null, null, null, 31, null);
        int i10 = 6 | 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchTicketType$default(TicketRepository ticketRepository, int i10, List list, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return ticketRepository.fetchTicketType(i10, list, dVar);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j10, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return ticketRepository.fetchTickets(j10, i10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object createTicket(@Nullable String str, int i10, @NotNull List<TicketAttributeRequest> list, @NotNull kotlin.coroutines.d<? super NetworkResponse<Ticket>> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objCreateTicket = anonymousClass1.result;
        Object objL = b.l();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            ResultKt.m(objCreateTicket);
            TicketApi ticketApi = this.api;
            MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            if (str != null && !StringsKt.w3(str)) {
                mapCreateMapBuilder.put(CreateTicketDestinationKt.CONVERSATION_ID, str);
            }
            mapCreateMapBuilder.put("type_id", kotlin.coroutines.jvm.internal.b.f(i10));
            mapCreateMapBuilder.put(a8.b.f303905f, list);
            Unit unit = Unit.f312394a;
            e0 defaultRequestBody$intercom_sdk_base_release = messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.build(mapCreateMapBuilder));
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCreateTicket = ticketApi.createTicket(defaultRequestBody$intercom_sdk_base_release, anonymousClass1);
            if (objCreateTicket == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (TicketRepository) anonymousClass1.L$0;
            ResultKt.m(objCreateTicket);
        }
        NetworkResponse networkResponse = (NetworkResponse) objCreateTicket;
        if (networkResponse instanceof NetworkResponse.Success) {
            this.intercomDataLayer.updateTicket((Ticket) ((NetworkResponse.Success) networkResponse).getBody());
        }
        return networkResponse;
    }

    @Nullable
    public final Object fetchTicketDetail(@NotNull String str, @NotNull kotlin.coroutines.d<? super NetworkResponse<Ticket>> dVar) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), dVar);
    }

    @Nullable
    public final Object fetchTicketType(int i10, @NotNull List<TicketAttributeRequest> list, @NotNull kotlin.coroutines.d<? super NetworkResponse<TicketTypeV2>> dVar) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to(CreateTicketDestinationKt.TICKET_TYPE_ID, kotlin.coroutines.jvm.internal.b.f(i10)), TuplesKt.to(a8.b.f303905f, list))), dVar);
    }

    @Nullable
    public final Object fetchTickets(long j10, int i10, @NotNull kotlin.coroutines.d<? super NetworkResponse<TicketsResponse>> dVar) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to(net.openid.appauth.f.c.f332989a, kotlin.coroutines.jvm.internal.b.g(j10)), TuplesKt.to("per_page", kotlin.coroutines.jvm.internal.b.f(i10)))), dVar);
    }

    @Nullable
    public final Object markAsRead(@NotNull String str, @NotNull kotlin.coroutines.d<? super NetworkResponse<Unit>> dVar) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), dVar);
    }

    @NotNull
    public final i<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    @Nullable
    public final Object uploadFile(@NotNull MediaData.Media media, @NotNull kotlin.coroutines.d<? super NetworkResponse<Upload.Builder>> dVar) {
        return this.uploadRepository.uploadFile(media, dVar);
    }

    public TicketRepository(@NotNull TicketApi api, @NotNull UploadRepository uploadRepository, @NotNull NexusClient nexusClient, @NotNull AblyManager ablyManager, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.api = api;
        this.uploadRepository = uploadRepository;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ticketApi = (i10 & 1) != 0 ? Injector.get().getTicketApi() : ticketApi;
        if ((i10 & 2) != 0) {
            int i11 = (7 >> 0) | 0;
            uploadRepository = new UploadRepository(null, null, null, null, 15, null);
        }
        this(ticketApi, uploadRepository, (i10 & 4) != 0 ? Injector.get().getNexusClient() : nexusClient, (i10 & 8) != 0 ? Injector.get().getAblyManager() : ablyManager, (i10 & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
