package io.intercom.android.sdk.tickets.create.data;

import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import kotlin.Unit;
import kotlin.coroutines.d;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
public interface TicketApi {
    @POST("tickets/create")
    @Nullable
    Object createTicket(@Body @NotNull e0 e0Var, @NotNull d<? super NetworkResponse<Ticket>> dVar);

    @POST("tickets/{ticketId}")
    @Nullable
    Object fetchTicketDetail(@Path("ticketId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull d<? super NetworkResponse<Ticket>> dVar);

    @POST("tickets/ticket_form")
    @Nullable
    Object fetchTicketType(@Body @NotNull e0 e0Var, @NotNull d<? super NetworkResponse<TicketTypeV2>> dVar);

    @POST("tickets")
    @Nullable
    Object fetchTickets(@Body @NotNull e0 e0Var, @NotNull d<? super NetworkResponse<TicketsResponse>> dVar);

    @POST("tickets/{ticketId}/read")
    @Nullable
    Object markAsRead(@Path("ticketId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull d<? super NetworkResponse<Unit>> dVar);
}
