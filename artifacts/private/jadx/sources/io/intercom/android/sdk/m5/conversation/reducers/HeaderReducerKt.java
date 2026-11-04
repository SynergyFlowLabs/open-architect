package io.intercom.android.sdk.m5.conversation.reducers;

import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHeaderReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/HeaderReducerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1#2:197\n1557#3:198\n1628#3,3:199\n*S KotlinDebug\n*F\n+ 1 HeaderReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/HeaderReducerKt\n*L\n93#1:198\n93#1:199,3\n*E\n"})
public final class HeaderReducerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Header.Collapsed.HeaderIconType.values().length];
            try {
                iArr[Header.Collapsed.HeaderIconType.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Header.Collapsed.HeaderIconType.AI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String getCappedUnreadCountString(int i10) {
        if (i10 > 9) {
            return "9+";
        }
        return i10 == 0 ? "" : String.valueOf(i10);
    }

    private static final int getNavIcon(LaunchMode launchMode) {
        return launchMode == LaunchMode.PROGRAMMATIC ? R.drawable.intercom_ic_close : R.drawable.intercom_ic_back;
    }

    @NotNull
    public static final List<HeaderMenuItem> reduceHeaderMenuItems(@NotNull AppConfig config, int i10, boolean z10, @NotNull LaunchMode launchMode, int i11) {
        HeaderMenuItem.TotalCountIndicator unreadCountIndicator;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            String cappedUnreadCountString = getCappedUnreadCountString(i10);
            if (i10 != 0 || i11 <= 0) {
                unreadCountIndicator = i10 > 0 ? new HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator(cappedUnreadCountString) : HeaderMenuItem.TotalCountIndicator.NoIndicator.INSTANCE;
            } else {
                unreadCountIndicator = HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator.INSTANCE;
            }
            HeaderMenuItem.TotalCountIndicator totalCountIndicator = unreadCountIndicator;
            String spaceLabelIfExists = config.getSpaceLabelIfExists(Space.Type.MESSAGES);
            listCreateListBuilder.add(new HeaderMenuItem.Messages(totalCountIndicator, cappedUnreadCountString, false, spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_messages_space_title, null, 2, null), 4, null));
            if (AppConfigExtensionsKt.canStartNewConversation(config)) {
                listCreateListBuilder.add(new HeaderMenuItem.StartNewConversation(!z10, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_new_conversation, null, 2, null)));
            }
            if (config.isSpaceEnabled(Space.Type.HELP)) {
                listCreateListBuilder.add(new HeaderMenuItem.Help(true, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_help_space_title, null, 2, null)));
            }
            Space.Type type = Space.Type.TICKETS;
            if (config.isSpaceEnabled(type)) {
                boolean z11 = i11 > 0;
                String spaceLabelIfExists2 = config.getSpaceLabelIfExists(type);
                listCreateListBuilder.add(new HeaderMenuItem.Tickets(z11, true, spaceLabelIfExists2 != null ? new StringProvider.ActualString(spaceLabelIfExists2) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_tickets_space_title, null, 2, null)));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    @NotNull
    public static final TopAppBarUiState reduceTopAppBarUiState(boolean z10, boolean z11, @Nullable Conversation conversation, @Nullable Header header, @NotNull AppConfig config, int i10, int i11, @NotNull LaunchMode launchMode, @Nullable PushNotificationsBannerState pushNotificationsBannerState) {
        Header header2;
        Header header3;
        StringProvider.ActualString actualString;
        List listEmptyList;
        List<Avatar.Builder> avatars;
        int i12;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        List<HeaderMenuItem> listReduceHeaderMenuItems = reduceHeaderMenuItems(config, i10, z10, launchMode, i11);
        if (z10 && header == null) {
            TopAppBarUiState topAppBarUiState = TopAppBarUiState.Companion.getDefault();
            return topAppBarUiState.m188copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState.title : null, (32765 & 2) != 0 ? topAppBarUiState.navIcon : Integer.valueOf(getNavIcon(launchMode)), (32765 & 4) != 0 ? topAppBarUiState.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState.avatars : null, (32765 & 32) != 0 ? topAppBarUiState.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState.headerMenuItems : listReduceHeaderMenuItems, (32765 & 256) != 0 ? topAppBarUiState.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState.contentColor : null, (32765 & 2048) != 0 ? topAppBarUiState.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState.pushNotificationsBannerState : pushNotificationsBannerState);
        }
        if (conversation == null || (header2 = conversation.getHeader()) == null) {
            if (header == null) {
                TopAppBarUiState topAppBarUiState2 = TopAppBarUiState.Companion.getDefault();
                return topAppBarUiState2.m188copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState2.title : null, (32765 & 2) != 0 ? topAppBarUiState2.navIcon : Integer.valueOf(getNavIcon(launchMode)), (32765 & 4) != 0 ? topAppBarUiState2.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState2.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState2.avatars : null, (32765 & 32) != 0 ? topAppBarUiState2.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState2.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState2.headerMenuItems : listReduceHeaderMenuItems, (32765 & 256) != 0 ? topAppBarUiState2.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState2.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState2.contentColor : null, (32765 & 2048) != 0 ? topAppBarUiState2.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState2.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState2.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState2.pushNotificationsBannerState : pushNotificationsBannerState);
            }
            header2 = header;
        }
        Integer numValueOf = null;
        long composeColor$default = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColor(), 0.0f, 1, null);
        long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColorDark(), 0.0f, 1, null);
        long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColor(), 0.0f, 1, null);
        long composeColor$default4 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColorDark(), 0.0f, 1, null);
        long composeColor$default5 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColor(), 0.0f, 1, null);
        long composeColor$default6 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColorDark(), 0.0f, 1, null);
        TicketProgressRowState ticketProgressRowState = ((conversation != null ? conversation.getTicket() : null) == null || (!ConversationExtensionsKt.hasNonTicketParts(conversation) && !z11)) ? null : new TicketProgressRowState(conversation.getTicket().getTitle(), conversation.getTicket().getCurrentStatus().getTitle());
        Header.Collapsed collapsed = header2.getCollapsed();
        TicketProgressRowState ticketProgressRowState2 = ticketProgressRowState;
        StringProvider.ActualString actualString2 = new StringProvider.ActualString(collapsed.getTitle());
        Integer numValueOf2 = Integer.valueOf(getNavIcon(launchMode));
        String subtitle = collapsed.getSubtitle();
        StringProvider.ActualString actualString3 = subtitle != null ? new StringProvider.ActualString(subtitle) : null;
        Header.Collapsed.HeaderIconType icon = collapsed.getIcon();
        if (icon != null) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i13 == 1) {
                i12 = io.intercom.android.sdk.R.drawable.intercom_clock;
            } else {
                if (i13 != 2) {
                    throw new k0();
                }
                i12 = io.intercom.android.sdk.R.drawable.intercom_ic_ai;
            }
            numValueOf = Integer.valueOf(i12);
        }
        Integer num = numValueOf;
        AvatarDetails avatarDetails = collapsed.getAvatarDetails();
        if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
            header3 = header2;
            actualString = actualString2;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<Avatar.Builder> list = avatars;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Header header4 = header2;
                Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                listEmptyList.add(new AvatarWrapper(avatarBuild, header4.getUseBotHeader()));
                header2 = header4;
                actualString2 = actualString2;
            }
            header3 = header2;
            actualString = actualString2;
        }
        return new TopAppBarUiState(actualString, numValueOf2, actualString3, num, listEmptyList, header3.getDisplayActiveIndicator(), ticketProgressRowState2, listReduceHeaderMenuItems, q0.n(composeColor$default), q0.n(composeColor$default2), q0.n(composeColor$default3), q0.n(composeColor$default4), q0.n(composeColor$default5), q0.n(composeColor$default6), pushNotificationsBannerState, null);
    }
}
