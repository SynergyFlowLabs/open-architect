package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTeamPresenceReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresenceReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/TeamPresenceReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1557#2:40\n1628#2,3:41\n*S KotlinDebug\n*F\n+ 1 TeamPresenceReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/TeamPresenceReducerKt\n*L\n24#1:40\n24#1:41,3\n*E\n"})
public final class TeamPresenceReducerKt {
    @NotNull
    public static final TeamPresenceState reduceTeamPresenceState(@Nullable Conversation conversation, @Nullable OpenMessengerResponse openMessengerResponse) {
        Header.Expanded expanded;
        Header header;
        ExpandedTeamPresenceState expandedTeamPresenceState;
        String teamIntro;
        String specialNotice;
        Header header2;
        AvatarType avatarType;
        List listEmptyList;
        List<Avatar.Builder> avatars;
        Header header3;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (conversation == null || (header3 = conversation.getHeader()) == null || (expanded = header3.getExpanded()) == null) {
            expanded = (newConversationData == null || (header = newConversationData.getHeader()) == null) ? null : header.getExpanded();
        }
        if (expanded != null) {
            if (conversation == null || (header2 = conversation.getHeader()) == null) {
                header2 = newConversationData != null ? newConversationData.getHeader() : null;
            }
            String title = expanded.getTitle();
            List<Header.Expanded.Body> body = expanded.getBody();
            AvatarDetails avatarDetails = expanded.getAvatarDetails();
            if (avatarDetails == null || (avatarType = avatarDetails.getAvatarType()) == null) {
                avatarType = AvatarType.UNKNOWN;
            }
            AvatarType avatarType2 = avatarType;
            AvatarDetails avatarDetails2 = expanded.getAvatarDetails();
            if (avatarDetails2 == null || (avatars = avatarDetails2.getAvatars()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                List<Avatar.Builder> list = avatars;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                    Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                    listEmptyList.add(new AvatarWrapper(avatarBuild, false));
                }
            }
            expandedTeamPresenceState = new ExpandedTeamPresenceState(title, body, avatarType2, listEmptyList, expanded.getFooter(), expanded.getSocialAccounts(), header2 != null ? header2.getDisplayActiveIndicator() : false);
        } else {
            expandedTeamPresenceState = ExpandedTeamPresenceState.Companion.getDefault();
        }
        String str = "";
        if (conversation == null || (teamIntro = conversation.getTeamIntro()) == null) {
            teamIntro = newConversationData != null ? newConversationData.getTeamIntro() : null;
            if (teamIntro == null) {
                teamIntro = "";
            }
        }
        if (conversation == null || (specialNotice = conversation.getSpecialNotice()) == null) {
            String specialNotice2 = newConversationData != null ? newConversationData.getSpecialNotice() : null;
            if (specialNotice2 != null) {
                str = specialNotice2;
            }
        } else {
            str = specialNotice;
        }
        return new TeamPresenceState(expandedTeamPresenceState, teamIntro, str);
    }
}
