package io.intercom.android.sdk.m5.conversation.usecase;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.AttachmentSettings;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSendMediaUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMediaUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,359:1\n226#2,5:360\n226#2,3:365\n229#2,2:375\n226#2,5:377\n560#3:368\n545#3,6:369\n*S KotlinDebug\n*F\n+ 1 SendMediaUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase\n*L\n95#1:360,5\n124#1:365,3\n124#1:375,2\n143#1:377,5\n126#1:368\n126#1:369,6\n*E\n"})
public final class SendMediaUseCase {
    public static final int $stable = 8;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final Function0<AttachmentSettings> attachmentSettings;

    @NotNull
    private final ConversationRepository conversationRepository;

    @NotNull
    private final SendMessageUseCase sendMessageUseCase;

    @NotNull
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase", f = "SendMediaUseCase.kt", i = {0, 0, 0, 0, 1, 2, 2, 2, 2, 3}, l = {120, 129, 132, 182}, m = "sendMedia", n = {"this", "clientState", "uiEffect", "uuid", "compressedMediaData", "this", "clientState", "uuid", "compressedMediaData", "compressedMediaData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return SendMediaUseCase.this.sendMedia(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2", f = "SendMediaUseCase.kt", i = {0, 1, 2, 2, 3, 3, 4}, l = {267, 276, 287, 321, 346}, m = "invokeSuspend", n = {"$this$coroutineScope", "compressedMediaData", "compressedMediaData", "thumbnailUpload", "compressedMediaData", "upload", "compressedMediaData"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    @SourceDebugExtension({"SMAP\nSendMediaUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMediaUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase$sendMediaNewWay$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,359:1\n226#2,5:360\n226#2,3:365\n229#2,2:375\n226#2,5:377\n560#3:368\n545#3,6:369\n*S KotlinDebug\n*F\n+ 1 SendMediaUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase$sendMediaNewWay$2\n*L\n242#1:360,5\n271#1:365,3\n271#1:375,2\n298#1:377,5\n273#1:368\n273#1:369,6\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ k0<ConversationClientState> $clientState;
        final /* synthetic */ MediaData.Media $mediaData;
        final /* synthetic */ j0<ConversationUiEffect> $uiEffect;
        final /* synthetic */ String $uuid;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SendMediaUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediaData.Media media, String str, k0<ConversationClientState> k0Var, SendMediaUseCase sendMediaUseCase, j0<ConversationUiEffect> j0Var, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$mediaData = media;
            this.$uuid = str;
            this.$clientState = k0Var;
            this.this$0 = sendMediaUseCase;
            this.$uiEffect = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$mediaData, this.$uuid, this.$clientState, this.this$0, this.$uiEffect, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x039e  */
        /* JADX WARN: Code duplicated, block: B:114:0x0466  */
        /* JADX WARN: Code duplicated, block: B:92:0x0384  */
        /* JADX WARN: Code duplicated, block: B:93:0x0387  */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0440, code lost:
        
            if (r4.invoke(r5, r2, r6, r40) == r1) goto L107;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public SendMediaUseCase(@NotNull SendMessageUseCase sendMessageUseCase, @NotNull ConversationRepository conversationRepository, @NotNull UserIdentity userIdentity, @NotNull Context applicationContext, @NotNull Function0<AttachmentSettings> attachmentSettings) {
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        this.sendMessageUseCase = sendMessageUseCase;
        this.conversationRepository = conversationRepository;
        this.userIdentity = userIdentity;
        this.applicationContext = applicationContext;
        this.attachmentSettings = attachmentSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentSettings _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get().getAttachmentSettings();
    }

    public static /* synthetic */ Object invoke$default(SendMediaUseCase sendMediaUseCase, k0 k0Var, j0 j0Var, MediaData.Media media, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.invoke(k0Var, j0Var, media, str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:84:0x035c  */
    /* JADX WARN: Code duplicated, block: B:86:0x036e  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0353, code lost:
    
        if (r3.invoke(r2, r4, r1, r5) == r6) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMedia(kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r42, kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r43, io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media r44, java.lang.String r45, kotlin.coroutines.d<? super kotlin.Unit> r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase.sendMedia(kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.j0, io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendMediaNewWay(k0<ConversationClientState> k0Var, j0<ConversationUiEffect> j0Var, MediaData.Media media, String str, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new AnonymousClass2(media, str, k0Var, this, j0Var, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    static /* synthetic */ Object sendMediaNewWay$default(SendMediaUseCase sendMediaUseCase, k0 k0Var, j0 j0Var, MediaData.Media media, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.sendMediaNewWay(k0Var, j0Var, media, str, dVar);
    }

    @NotNull
    public final SendMessageUseCase getSendMessageUseCase() {
        return this.sendMessageUseCase;
    }

    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull j0<ConversationUiEffect> j0Var, @NotNull MediaData.Media media, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objSendMedia = sendMedia(k0Var, j0Var, media, str, dVar);
        return objSendMedia == kotlin.coroutines.intrinsics.b.l() ? objSendMedia : Unit.f312394a;
    }

    public /* synthetic */ SendMediaUseCase(SendMessageUseCase sendMessageUseCase, ConversationRepository conversationRepository, UserIdentity userIdentity, Context context, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendMessageUseCase, conversationRepository, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getApplication() : context, (i10 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SendMediaUseCase._init_$lambda$0();
            }
        } : function0);
    }
}
