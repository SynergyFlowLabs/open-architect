package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SendQuickReplyUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    @NotNull
    private final RefreshConversationUseCase refreshConversationUseCase;

    @NotNull
    private final SoundEffectsUseCase soundEffectsUseCase;

    @NotNull
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase", f = "SendQuickReplyUseCase.kt", i = {0, 0, 0}, l = {37, 54}, m = "invoke", n = {"this", "clientStateFlow", "uuid"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            int i10 = 5 >> 0;
            return SendQuickReplyUseCase.this.invoke(null, null, null, this);
        }
    }

    public SendQuickReplyUseCase(@NotNull ConversationRepository conversationRepository, @NotNull RefreshConversationUseCase refreshConversationUseCase, @NotNull SoundEffectsUseCase soundEffectsUseCase, @NotNull UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
    
        if (r9.invoke(r10, r11, r6) == r0) goto L38;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r10, @org.jetbrains.annotations.NotNull io.intercom.android.sdk.models.ReplyOption r11, @org.jetbrains.annotations.NotNull io.intercom.android.sdk.models.Part r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase.invoke(kotlinx.coroutines.flow.k0, io.intercom.android.sdk.models.ReplyOption, io.intercom.android.sdk.models.Part, kotlin.coroutines.d):java.lang.Object");
    }

    public /* synthetic */ SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }
}
