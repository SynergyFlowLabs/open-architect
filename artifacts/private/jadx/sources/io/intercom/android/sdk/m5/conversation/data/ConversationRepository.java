package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import com.facebook.internal.z0;
import com.google.gson.f;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRequestBody;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ConversationRepository {
    public static final int $stable = 8;

    @NotNull
    private final AblyManager ablyManager;

    @NotNull
    private final Api api;

    @NotNull
    private final MessengerApi messengerApi;

    @NotNull
    private final NexusClient nexusClient;

    @NotNull
    private final i<ParsedNexusEvent> nexusEventFlow;

    @NotNull
    private final f0 nexusEventsRepository$delegate;

    @NotNull
    private final UploadRepository uploadRepository;

    @NotNull
    private final UserIdentity userIdentity;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetConversationReason.values().length];
            try {
                iArr[GetConversationReason.NEW_COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetConversationReason.NEXUS_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetConversationReason.NETWORK_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetConversationReason.OPEN_CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetConversationReason.POLLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConversationRepository(@NotNull MessengerApi messengerApi, @NotNull UploadRepository uploadRepository, @NotNull Api api, @NotNull UserIdentity userIdentity, @NotNull AblyManager ablyManager, @NotNull NexusClient nexusClient, @NotNull final s0 scope) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.messengerApi = messengerApi;
        this.uploadRepository = uploadRepository;
        this.api = api;
        this.userIdentity = userIdentity;
        this.ablyManager = ablyManager;
        this.nexusClient = nexusClient;
        this.nexusEventsRepository$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.data.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationRepository.nexusEventsRepository_delegate$lambda$0(this.f291925a, scope);
            }
        });
        this.nexusEventFlow = CombinedEventAsFlowKt.combinedEventAsFlow(nexusClient, ablyManager);
    }

    private final NexusEventsRepository getNexusEventsRepository() {
        return (NexusEventsRepository) this.nexusEventsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusEventsRepository nexusEventsRepository_delegate$lambda$0(ConversationRepository this$0, s0 scope) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        return new NexusEventsRepository(this$0.nexusClient, this$0.userIdentity, scope);
    }

    @Nullable
    public final Object addQuickReplyToConversation(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull d<? super NetworkResponse<Part.Builder>> dVar) {
        Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reply_option_uuid", str), TuplesKt.to("client_assigned_uuid", str4));
        if (str3.length() > 0) {
            mapMutableMapOf.put("quick_reply_part_id", str3);
        }
        return this.messengerApi.addConversationQuickReplySuspend(str2, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapMutableMapOf), dVar);
    }

    @Nullable
    public final Object createConversationFromSuggestion(@NotNull String str, @Nullable String str2, @NotNull d<? super NetworkResponse<Conversation>> dVar) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("id", str);
        if (str2 != null) {
            mapCreateMapBuilder.put("messenger_open_request_id", str2);
        }
        return this.messengerApi.triggerInboundConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.build(mapCreateMapBuilder)), dVar);
    }

    @Nullable
    public final Object createNewConversation(@NotNull List<Block.Builder> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<ComposerSuggestions.Suggestion> list2, @Nullable Long l10, @Nullable String str4, @NotNull String str5, @NotNull d<? super NetworkResponse<ConversationResponse.Builder>> dVar) {
        Map<String, ? extends Object> mapBaseNewConversationParams = this.api.baseNewConversationParams();
        mapBaseNewConversationParams.put("blocks", list);
        mapBaseNewConversationParams.put("client_assigned_uuid", str5);
        if (str != null) {
            mapBaseNewConversationParams.put("bot_intro", str);
        }
        if (str2 != null) {
            mapBaseNewConversationParams.put("article_id", str2);
        }
        if (str3 != null) {
            mapBaseNewConversationParams.put("resolution_bot_behavior_version_id", str3);
        }
        if (list2 != null) {
            mapBaseNewConversationParams.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, new f().D(list2));
        }
        if (l10 != null) {
            mapBaseNewConversationParams.put("snapshot_id", l10);
        }
        if (str4 != null) {
            mapBaseNewConversationParams.put("messenger_open_request_id", str4);
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Intrinsics.checkNotNull(mapBaseNewConversationParams);
        return this.messengerApi.startNewConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapBaseNewConversationParams), dVar);
    }

    public final void dismissPrivacyPolicy() {
        this.api.updateUser(UserUpdateRequest.create(false, false, MapsKt.mapOf(TuplesKt.to("dismissed_privacy_policy_notice_at", Long.valueOf(System.currentTimeMillis() / ((long) 1000)))), true), new IntercomStatusCallback() { // from class: io.intercom.android.sdk.m5.conversation.data.ConversationRepository.dismissPrivacyPolicy.1
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                Intrinsics.checkNotNullParameter(intercomError, "intercomError");
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
            }
        });
    }

    @NotNull
    public final AblyManager getAblyManager() {
        return this.ablyManager;
    }

    @NotNull
    public final Api getApi() {
        return this.api;
    }

    @Nullable
    public final Object getConversation(@NotNull String str, @NotNull GetConversationReason getConversationReason, @NotNull d<? super NetworkResponse<Conversation>> dVar) {
        String str2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getConversationReason.ordinal()];
        if (i10 == 1) {
            str2 = "Nexus New Comment";
        } else if (i10 == 2) {
            str2 = "Nexus Reconnected";
        } else if (i10 == 3) {
            str2 = "Internet Reconnected";
        } else if (i10 == 4) {
            str2 = "Click Conversation";
        } else {
            if (i10 != 5) {
                throw new k0();
            }
            str2 = "State Sync";
        }
        Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("request_origin", str2));
        if (getConversationReason == GetConversationReason.POLLING) {
            mapMutableMapOf.put("sync", z0.P);
        }
        return this.messengerApi.getConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mapMutableMapOf), dVar);
    }

    @NotNull
    public final MessengerApi getMessengerApi() {
        return this.messengerApi;
    }

    @NotNull
    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    @Nullable
    public final Object loadGifs(@NotNull String str, @NotNull d<? super NetworkResponse<? extends GifResponse>> dVar) {
        return this.messengerApi.getGifsSuspended(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(!StringsKt.w3(str) ? MapsKt.mapOf(TuplesKt.to("query", str)) : MapsKt.emptyMap()), dVar);
    }

    @Nullable
    public final Object markAsRead(@NotNull String str, @NotNull d<? super Unit> dVar) {
        Object objMarkAsReadSuspend = this.messengerApi.markAsReadSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("app_id", Injector.get().getAppIdentity().appId()))), dVar);
        return objMarkAsReadSuspend == kotlin.coroutines.intrinsics.b.l() ? objMarkAsReadSuspend : Unit.f312394a;
    }

    @NotNull
    public final NexusEventsRepository nexusEventsRepository() {
        return getNexusEventsRepository();
    }

    @NotNull
    public final i<ParsedNexusEvent> realTimeEvents() {
        return this.nexusEventFlow;
    }

    public final void recordInteractions(@NotNull String conversationId, @NotNull String[] interactions) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        this.api.recordInteractions(conversationId, interactions);
    }

    @Nullable
    public final Object replyToConversation(@NotNull String str, @NotNull String str2, @NotNull List<Block.Builder> list, @Nullable Long l10, @NotNull d<? super NetworkResponse<Part.Builder>> dVar) {
        Map<String, ? extends Object> mapCreateBaseReplyParams = this.api.createBaseReplyParams();
        mapCreateBaseReplyParams.put("blocks", list);
        mapCreateBaseReplyParams.put("client_assigned_uuid", str2);
        if (l10 != null) {
            mapCreateBaseReplyParams.put("last_admin_part_created_at", TimeFormatterExtKt.toISOFormat(l10.longValue()));
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Intrinsics.checkNotNull(mapCreateBaseReplyParams);
        return this.messengerApi.replyToConversationSuspend(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapCreateBaseReplyParams), dVar);
    }

    @Nullable
    public final Object submitForm(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull d<? super NetworkResponse<Conversation>> dVar) {
        return this.messengerApi.submitFormSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("form_params", MapsKt.mapOf(TuplesKt.to("conversation_part_id", str2), TuplesKt.to("identifier", str3), TuplesKt.to("value", str4), TuplesKt.to("type", str5))))), dVar);
    }

    @Nullable
    public final Object transcribe(@NotNull File file, @NotNull d<? super NetworkResponse<TranscribedText>> dVar) {
        String strD;
        String email = this.userIdentity.getEmail();
        Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
        if (email.length() == 0) {
            strD = new f().D(MapsKt.mapOf(TuplesKt.to(UserIdentity.ANONYMOUS_ID, this.userIdentity.getAnonymousId())));
        } else {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            String email2 = this.userIdentity.getEmail();
            Intrinsics.checkNotNullExpressionValue(email2, "getEmail(...)");
            mapCreateMapBuilder.put("email", email2);
            String userId = this.userIdentity.getUserId();
            Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
            if (userId.length() != 0) {
                String userId2 = this.userIdentity.getUserId();
                Intrinsics.checkNotNullExpressionValue(userId2, "getUserId(...)");
                mapCreateMapBuilder.put("user_id", userId2);
            }
            strD = new f().D(MapsKt.build(mapCreateMapBuilder));
        }
        AudioRequestBody audioRequestBody = new AudioRequestBody(file);
        y.c.a aVar = y.c.f334834c;
        y.c cVarD = aVar.d("audio", file.getName(), audioRequestBody);
        Intrinsics.checkNotNull(strD);
        y.c cVarC = aVar.c("user_data", strD);
        String strAppId = Injector.get().getAppIdentity().appId();
        Intrinsics.checkNotNull(strAppId);
        return this.messengerApi.transcribeSuspend(cVarD, cVarC, aVar.c("app_id", strAppId), MessengerApiHelper.INSTANCE.getDefaultMultipartFields$intercom_sdk_base_release(), dVar);
    }

    @Nullable
    public final Object uploadMedia(@NotNull MediaData.Media media, @NotNull d<? super NetworkResponse<Upload.Builder>> dVar) {
        return this.uploadRepository.uploadFile(media, dVar);
    }

    public /* synthetic */ ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, AblyManager ablyManager, NexusClient nexusClient, s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i10 & 4) != 0 ? Injector.get().getApi() : api, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 16) != 0 ? Injector.get().getAblyManager() : ablyManager, (i10 & 32) != 0 ? Injector.get().getNexusClient() : nexusClient, s0Var);
    }
}
