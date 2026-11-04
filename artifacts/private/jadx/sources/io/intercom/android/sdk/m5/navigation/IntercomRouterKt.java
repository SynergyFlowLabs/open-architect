package io.intercom.android.sdk.m5.navigation;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomRouterKt {
    public static final void openConversation(@NotNull androidx.navigation.r2 r2Var, @Nullable String str, @Nullable String str2, boolean z10, @Nullable String str3, @Nullable androidx.navigation.w2 w2Var, @NotNull TransitionArgs transitionArgs) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        if (str2 == null) {
            str2 = "";
        }
        androidx.navigation.w0.y0(r2Var, new IntercomRootActivityArgs.ConversationScreenArgs(str, str2, z10, str3, null, transitionArgs, 16, null).getRoute(), w2Var, null, 4, null);
    }

    public static /* synthetic */ void openConversation$default(androidx.navigation.r2 r2Var, String str, String str2, boolean z10, String str3, androidx.navigation.w2 w2Var, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            w2Var = null;
        }
        if ((i10 & 32) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openConversation(r2Var, str, str2, z10, str3, w2Var, transitionArgs);
    }

    public static final void openCreateTicketsScreen(@NotNull androidx.navigation.r2 r2Var, @NotNull TicketType ticketTypeData, @Nullable String str, @NotNull String from) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(ticketTypeData, "ticketTypeData");
        Intrinsics.checkNotNullParameter(from, "from");
        androidx.navigation.w0.y0(r2Var, "CREATE_TICKET/" + ticketTypeData.getId() + "?conversation_id=" + str + "?from=" + from, null, null, 6, null);
    }

    public static final void openHelpCenter(@NotNull androidx.navigation.r2 r2Var, @NotNull TransitionArgs transitionArgs, boolean z10) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        androidx.navigation.w0.y0(r2Var, "HELP_CENTER?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, null, 6, null);
    }

    public static /* synthetic */ void openHelpCenter$default(androidx.navigation.r2 r2Var, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            int i11 = 4 ^ 0;
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openHelpCenter(r2Var, transitionArgs, z10);
    }

    public static final void openMessages(@NotNull androidx.navigation.r2 r2Var, @NotNull TransitionArgs transitionArgs, boolean z10) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        androidx.navigation.w0.y0(r2Var, "MESSAGES?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, null, 6, null);
    }

    public static /* synthetic */ void openMessages$default(androidx.navigation.r2 r2Var, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openMessages(r2Var, transitionArgs, z10);
    }

    public static final void openNewConversation(@NotNull androidx.navigation.r2 r2Var, boolean z10, @Nullable androidx.navigation.w2 w2Var, @NotNull TransitionArgs transitionArgs) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        openConversation$default(r2Var, null, null, z10, null, w2Var, transitionArgs, 11, null);
    }

    public static /* synthetic */ void openNewConversation$default(androidx.navigation.r2 r2Var, boolean z10, androidx.navigation.w2 w2Var, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            w2Var = null;
        }
        if ((i10 & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openNewConversation(r2Var, z10, w2Var, transitionArgs);
    }

    public static final void openTicketDetailScreen(@NotNull androidx.navigation.r2 r2Var, boolean z10, @NotNull TransitionArgs transitionArgs, boolean z11) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        androidx.navigation.w0.y0(r2Var, "TICKET_DETAIL?show_submission_card=" + z10 + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z11, null, null, 6, null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(androidx.navigation.r2 r2Var, boolean z10, TransitionArgs transitionArgs, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        openTicketDetailScreen(r2Var, z10, transitionArgs, z11);
    }

    public static final void openTicketList(@NotNull androidx.navigation.r2 r2Var, @NotNull TransitionArgs transitionArgs, boolean z10) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        androidx.navigation.w0.y0(r2Var, "TICKETS?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, null, 6, null);
    }

    public static /* synthetic */ void openTicketList$default(androidx.navigation.r2 r2Var, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        openTicketList(r2Var, transitionArgs, z10);
    }

    public static final void openTicketDetailScreen(@NotNull androidx.navigation.r2 r2Var, @NotNull String ticketId, @NotNull String from, @NotNull TransitionArgs transitionArgs, boolean z10) {
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
        int i10 = 3 ^ 0;
        androidx.navigation.w0.y0(r2Var, "TICKET_DETAIL/" + ticketId + "?from=" + from + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z10, null, null, 6, null);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(androidx.navigation.r2 r2Var, String str, String str2, TransitionArgs transitionArgs, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            boolean z11 = false & false;
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openTicketDetailScreen(r2Var, str, str2, transitionArgs, z10);
    }
}
