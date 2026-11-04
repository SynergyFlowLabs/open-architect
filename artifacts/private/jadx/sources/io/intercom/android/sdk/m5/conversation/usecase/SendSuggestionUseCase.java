package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSendSuggestionUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendSuggestionUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,87:1\n226#2,5:88\n226#2,5:93\n*S KotlinDebug\n*F\n+ 1 SendSuggestionUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase\n*L\n33#1:88,5\n75#1:93,5\n*E\n"})
public final class SendSuggestionUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final SoundEffectsUseCase soundEffectsUseCase;

    @NotNull
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase", f = "SendSuggestionUseCase.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "invoke", n = {"this", "clientStateFlow"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return SendSuggestionUseCase.this.invoke(null, null, this);
        }
    }

    public SendSuggestionUseCase(@NotNull ConversationRepository conversationRepository, @NotNull SoundEffectsUseCase soundEffectsUseCase, @NotNull UserIdentity userIdentity, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.conversationRepository = conversationRepository;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull ReplySuggestion replySuggestion, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        ConversationClientState value2;
        SendSuggestionUseCase sendSuggestionUseCase = this;
        k0<ConversationClientState> k0Var2 = k0Var;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = sendSuggestionUseCase.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = sendSuggestionUseCase.new AnonymousClass1(dVar);
        }
        Object objCreateConversationFromSuggestion = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objCreateConversationFromSuggestion);
            BlockFactory blockFactory = new BlockFactory(new TextSplittingStrategy());
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            do {
                value = k0Var2.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                Part partBuild = new Part.Builder().withBlocks(blockFactory.getBlocksForText(replySuggestion.getText())).withClientAssignedUuid(string).build();
                partBuild.setParticipant(new Participant.Builder().withId(sendSuggestionUseCase.userIdentity.getIntercomId()).build());
                partBuild.setMessageState(Part.MessageState.SENDING);
                Unit unit = Unit.f312394a;
                Intrinsics.checkNotNullExpressionValue(partBuild, "apply(...)");
                linkedHashMap.put(string, new PendingMessage(partBuild, false, null, 4, null));
            } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
            if (k0Var2.getValue().getConversation() == null) {
                ConversationRepository conversationRepository = sendSuggestionUseCase.conversationRepository;
                String id2 = replySuggestion.getId();
                OpenMessengerResponse openResponse = sendSuggestionUseCase.intercomDataLayer.getOpenResponse();
                String requestId = openResponse != null ? openResponse.getRequestId() : null;
                anonymousClass1.L$0 = sendSuggestionUseCase;
                anonymousClass1.L$1 = k0Var2;
                anonymousClass1.label = 1;
                objCreateConversationFromSuggestion = conversationRepository.createConversationFromSuggestion(id2, requestId, anonymousClass1);
                if (objCreateConversationFromSuggestion == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k0<ConversationClientState> k0Var3 = (k0) anonymousClass1.L$1;
        SendSuggestionUseCase sendSuggestionUseCase2 = (SendSuggestionUseCase) anonymousClass1.L$0;
        ResultKt.m(objCreateConversationFromSuggestion);
        k0Var2 = k0Var3;
        sendSuggestionUseCase = sendSuggestionUseCase2;
        NetworkResponse networkResponse = (NetworkResponse) objCreateConversationFromSuggestion;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new kotlin.k0();
            }
            sendSuggestionUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
            Conversation conversation = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            do {
                value2 = k0Var2.getValue();
            } while (!k0Var2.compareAndSet(value2, ConversationClientState.copy$default(value2, MapsKt.emptyMap(), conversation, conversation.getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194296, null)));
        }
        return Unit.f312394a;
    }

    public /* synthetic */ SendSuggestionUseCase(ConversationRepository conversationRepository, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, soundEffectsUseCase, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
