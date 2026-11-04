package io.intercom.android.sdk.m5.home.reducers;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.reducers.HomeReducer;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHomeReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeReducer.kt\nio/intercom/android/sdk/m5/home/reducers/HomeReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n827#2:99\n855#2,2:100\n1557#2:102\n1628#2,3:103\n1557#2:107\n1628#2,3:108\n1#3:106\n*S KotlinDebug\n*F\n+ 1 HomeReducer.kt\nio/intercom/android/sdk/m5/home/reducers/HomeReducer\n*L\n46#1:99\n46#1:100,2\n51#1:102\n51#1:103,3\n80#1:107\n80#1:108,3\n*E\n"})
public final class HomeReducer {
    public static final int $stable = 8;

    @NotNull
    private final Function0<AppConfig> config;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeReducer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HomeCards> reduceHomeCards(List<? extends HomeCards> list, OpenMessengerResponse.NewConversationData newConversationData) {
        if (newConversationData == null) {
            return list;
        }
        List<? extends HomeCards> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (HomeCards homeNewConversationData : list2) {
            if (homeNewConversationData instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData2 = (HomeCards.HomeNewConversationData) homeNewConversationData;
                homeNewConversationData = new HomeCards.HomeNewConversationData("", HomeCardType.NEW_CONVERSATION, homeNewConversationData2.getAction(), homeNewConversationData2.getPreventMultipleInboundConversationsEnabled(), homeNewConversationData2.getOpenInboundConversationsIds(), homeNewConversationData2.getShowFinAvatar(), homeNewConversationData2.getShowTeammateExpectations(), newConversationData.getHomeCard());
            }
            arrayList.add(homeNewConversationData);
        }
        return arrayList;
    }

    @NotNull
    public final HomeUiState computeUiState$intercom_sdk_base_release(@NotNull HomeClientState homeClientState, @NotNull Function0<Unit> onRetryClicked) {
        Participant.Builder participant;
        Participant participantBuild;
        Intrinsics.checkNotNullParameter(homeClientState, "homeClientState");
        Intrinsics.checkNotNullParameter(onRetryClicked, "onRetryClicked");
        OpenMessengerResponse openMessengerResponseData = homeClientState.getOpenMessengerResponseData();
        AvatarWrapper avatarWrapper = null;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponseData != null ? openMessengerResponseData.getNewConversationData() : null;
        NetworkResponse<HomeV2Response> homeResponse = homeClientState.getHomeResponse();
        if (!(homeResponse instanceof NetworkResponse.ClientError) && !(homeResponse instanceof NetworkResponse.ServerError)) {
            if (homeResponse instanceof NetworkResponse.NetworkError) {
                return new HomeUiState.Error(null, new ErrorState.WithCTA(0, 0, null, 0, onRetryClicked, 15, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
            }
            if (!(homeResponse instanceof NetworkResponse.Success)) {
                if (homeResponse == null) {
                    return new HomeUiState.Loading(null);
                }
                throw new k0();
            }
            OpenMessengerResponse openMessengerResponseData2 = homeClientState.getOpenMessengerResponseData();
            PoweredBy poweredBy = openMessengerResponseData2 != null ? openMessengerResponseData2.getPoweredBy() : null;
            List<HomeCards> listReduceHomeCards = reduceHomeCards(((HomeV2Response) ((NetworkResponse.Success) homeResponse).getBody()).getCards(), newConversationData);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listReduceHomeCards) {
                HomeCards homeCards = (HomeCards) obj;
                if (homeCards instanceof HomeCards.HomeNewConversationData) {
                    HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                    if (!homeNewConversationData.getPreventMultipleInboundConversationsEnabled() || homeNewConversationData.getOpenInboundConversationsIds().isEmpty()) {
                    }
                }
                arrayList.add(obj);
            }
            List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
            for (Participant participant2 : builtActiveAdmins) {
                Avatar avatar = participant2.getAvatar();
                Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                Boolean boolIsBot = participant2.isBot();
                Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
                arrayList2.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
            }
            ActiveBot activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot();
            if (activeBot != null && (participant = activeBot.getParticipant()) != null && (participantBuild = participant.build()) != null) {
                Avatar avatar2 = participantBuild.getAvatar();
                Intrinsics.checkNotNullExpressionValue(avatar2, "getAvatar(...)");
                Boolean boolIsBot2 = participantBuild.isBot();
                Intrinsics.checkNotNullExpressionValue(boolIsBot2, "isBot(...)");
                avatarWrapper = new AvatarWrapper(avatar2, boolIsBot2.booleanValue());
            }
            return new HomeUiState.Content(poweredBy, arrayList, arrayList2, avatarWrapper, this.config.invoke().isAccessToTeammateEnabled(), HomeHeaderStateReducerKt.computeContentHeader(this.config.invoke().getConfigModules(), this.intercomDataLayer.getTeamPresence().getValue(), homeClientState.isHeaderImageLoaded()));
        }
        return new HomeUiState.Error(null, new ErrorState.WithoutCTA(0, 0, null, 7, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
    }

    public HomeReducer(@NotNull Function0<AppConfig> config, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ HomeReducer(Function0 function0, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: zh.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeReducer._init_$lambda$0();
            }
        } : function0, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
