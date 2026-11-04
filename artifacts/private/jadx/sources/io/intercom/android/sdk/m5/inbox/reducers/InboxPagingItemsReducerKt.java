package io.intercom.android.sdk.m5.inbox.reducers;

import androidx.annotation.v;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.ui.graphics.q0;
import androidx.paging.compose.b;
import androidx.paging.x0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.i;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxPagingItemsReducerKt {
    @o
    @NotNull
    public static final InboxUiState reduceToInboxUiState(@NotNull final b<Conversation> bVar, @NotNull EmptyState emptyState, @Nullable AppConfig appConfig, @v int i10, @Nullable c0 c0Var, int i11, int i12) {
        InboxUiState loading;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        c0Var.E(886365946);
        AppConfig appConfig2 = (i12 & 2) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig;
        String spaceLabelIfExists = appConfig2.getSpaceLabelIfExists(Space.Type.MESSAGES);
        c0Var.E(-261437153);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = i.d(R.string.intercom_messages_space_title, c0Var, 0);
        }
        String str = spaceLabelIfExists;
        c0Var.A();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        IntercomTopBarState intercomTopBarState = new IntercomTopBarState(Integer.valueOf(i10), str, null, q0.n(intercomTheme.getColors(c0Var, i13).m704getHeader0d7_KjU()), q0.n(intercomTheme.getColors(c0Var, i13).m711getOnHeader0d7_KjU()), null, 36, null);
        if (bVar.h().size() != 0) {
            boolean zShouldShowSendMessageButton = shouldShowSendMessageButton(appConfig2);
            boolean z10 = bVar.i().b() instanceof x0.b;
            x0 x0VarB = bVar.i().b();
            ErrorState withCTA = null;
            x0.a aVar = x0VarB instanceof x0.a ? (x0.a) x0VarB : null;
            if (aVar != null) {
                withCTA = aVar.b() instanceof IOException ? new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: ai.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$1$lambda$0(bVar);
                    }
                }, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null);
            }
            loading = new InboxUiState.Content(intercomTopBarState, bVar, zShouldShowSendMessageButton, z10, withCTA);
        } else if (bVar.i().e() instanceof x0.a) {
            x0 x0VarE = bVar.i().e();
            Intrinsics.checkNotNull(x0VarE, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            loading = ((x0.a) x0VarE).b() instanceof IOException ? new InboxUiState.Error(intercomTopBarState, new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: ai.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$2(bVar);
                }
            }, 15, null)) : new InboxUiState.Error(intercomTopBarState, new ErrorState.WithoutCTA(0, 0, null, 7, null));
        } else if (Intrinsics.areEqual(emptyState, EmptyState.Companion.getNULL())) {
            loading = bVar.i().e() instanceof x0.b ? new InboxUiState.Loading(intercomTopBarState) : new InboxUiState.Initial(intercomTopBarState);
        } else {
            loading = new InboxUiState.Empty(intercomTopBarState, emptyState, shouldShowSendMessageButton(appConfig2));
        }
        c0Var.A();
        return loading;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToInboxUiState$lambda$1$lambda$0(b this_reduceToInboxUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        this_reduceToInboxUiState.l();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToInboxUiState$lambda$2(b this_reduceToInboxUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        this_reduceToInboxUiState.k();
        return Unit.f312394a;
    }

    private static final boolean shouldShowSendMessageButton(AppConfig appConfig) {
        return AppConfigExtensionsKt.canStartNewConversation(appConfig) && !appConfig.isHelpCenterRequireSearchEnabled();
    }
}
