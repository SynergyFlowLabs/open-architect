package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSendMessageUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMessageUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n226#2,5:200\n1#3:205\n*S KotlinDebug\n*F\n+ 1 SendMessageUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase\n*L\n106#1:200,5\n*E\n"})
public final class SendMessageUseCase {

    @NotNull
    private final ConversationRepository conversationRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final AtomicBoolean newConversationRequestPending;

    @NotNull
    private final RefreshConversationUseCase refreshConversationUseCase;

    @NotNull
    private final SoundEffectsUseCase soundEffectsUseCase;

    @NotNull
    private final UserIdentity userIdentity;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SourceDebugExtension({"SMAP\nSendMessageUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMessageUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase$Companion\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,199:1\n226#2,5:200\n226#2,5:205\n*S KotlinDebug\n*F\n+ 1 SendMessageUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase$Companion\n*L\n171#1:200,5\n185#1:205,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addBlocksToPendingMessages(@NotNull k0<ConversationClientState> clientState, @NotNull List<Block.Builder> blocks, @NotNull String uuid, @NotNull UserIdentity userIdentity) {
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
            Part partBuild = new Part.Builder().withBlocks(blocks).withCreatedAt(TimeUnit.MILLISECONDS.toSeconds(TimeProvider.SYSTEM.currentTimeMillis())).withParticipantIsAdmin(false).withClientAssignedUuid(uuid).build();
            partBuild.setParticipant(new Participant.Builder().withId(userIdentity.getIntercomId()).build());
            partBuild.setMessageState(Part.MessageState.SENDING);
            while (true) {
                ConversationClientState value = clientState.getValue();
                ConversationClientState conversationClientState = value;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                Intrinsics.checkNotNull(partBuild);
                Part part = partBuild;
                linkedHashMap.put(uuid, new PendingMessage(part, false, null, 4, null));
                if (clientState.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null))) {
                    return;
                } else {
                    partBuild = part;
                }
            }
        }

        public final void updateFailedPendingMessages(@NotNull k0<ConversationClientState> clientState, @NotNull String clientUUID) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            Map mutableMap;
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(clientUUID, "clientUUID");
            do {
                value = clientState.getValue();
                conversationClientState = value;
                mutableMap = MapsKt.toMutableMap(clientState.getValue().getPendingMessages());
                PendingMessage pendingMessage = (PendingMessage) mutableMap.get(clientUUID);
                if (pendingMessage != null) {
                    mutableMap.put(clientUUID, PendingMessage.copy$default(pendingMessage, null, true, null, 5, null));
                }
            } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, mutableMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase", f = "SendMessageUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, l = {72, 99, 123, 128, 145}, m = "invoke", n = {"this", "clientState", "clientUUID", "this", "clientState", "clientUUID", "conversationResponse", "this", "clientState", "blocks", "clientUUID", "this", "clientState", "clientUUID"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageUseCase.this.invoke(null, null, null, this);
        }
    }

    public SendMessageUseCase(@NotNull ConversationRepository conversationRepository, @NotNull RefreshConversationUseCase refreshConversationUseCase, @NotNull SoundEffectsUseCase soundEffectsUseCase, @NotNull UserIdentity userIdentity, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.newConversationRequestPending = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, k0 k0Var, List list, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMessageUseCase.invoke(k0Var, list, str, dVar);
    }

    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(StringsKt.E5(str).toString());
        if (str.length() <= 0) {
            return Unit.f312394a;
        }
        Intrinsics.checkNotNull(blocksForText);
        Object objInvoke = invoke(k0Var, blocksForText, string, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    public /* synthetic */ SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295  */
    /* JADX WARN: Code duplicated, block: B:103:0x029d  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x0241  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:96:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c1, code lost:
    
        if (r0.invoke(r1, r2, r11) == r12) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0231, code lost:
    
        if (r2 == r12) goto L112;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r30, @org.jetbrains.annotations.NotNull java.util.List<io.intercom.android.sdk.blocks.lib.models.Block.Builder> r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.invoke(kotlinx.coroutines.flow.k0, java.util.List, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }
}
