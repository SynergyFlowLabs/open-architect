package io.intercom.android.sdk.m5.conversation.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class NexusEventsRepository {
    public static final int $stable = 8;

    @NotNull
    private final NexusClient nexusClient;

    @NotNull
    private final s0 scope;

    @NotNull
    private final j0<NexusEvent> typingEventsFlow;

    @NotNull
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1", f = "NexusEventsRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return NexusEventsRepository.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarD1 = k.D1(NexusEventsRepository.this.typingEventsFlow, 200L);
                final NexusEventsRepository nexusEventsRepository = NexusEventsRepository.this;
                j jVar = new j() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((NexusEvent) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(NexusEvent nexusEvent, d<? super Unit> dVar) {
                        nexusEventsRepository.nexusClient.fire(nexusEvent);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarD1.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1", f = "NexusEventsRepository.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class C28021 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28021(String str, d<? super C28021> dVar) {
            super(2, dVar);
            this.$conversationId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return NexusEventsRepository.this.new C28021(this.$conversationId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = NexusEventsRepository.this.typingEventsFlow;
                NexusEvent userIsTypingEvent = NexusEvent.getUserIsTypingEvent(this.$conversationId, NexusEventsRepository.this.userIdentity.getIntercomId());
                Intrinsics.checkNotNullExpressionValue(userIsTypingEvent, "getUserIsTypingEvent(...)");
                this.label = 1;
                if (j0Var.emit(userIsTypingEvent, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28021) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public NexusEventsRepository(@NotNull NexusClient nexusClient, @NotNull UserIdentity userIdentity, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.nexusClient = nexusClient;
        this.userIdentity = userIdentity;
        this.scope = scope;
        int i10 = 0 ^ 7;
        this.typingEventsFlow = q0.b(0, 0, null, 7, null);
        kotlinx.coroutines.k.f(scope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void markAsSeen(@NotNull String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.nexusClient.fire(NexusEvent.getConversationSeenEvent(conversationId, this.userIdentity.getIntercomId()));
    }

    public final void userTyping(@NotNull String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        kotlinx.coroutines.k.f(this.scope, null, null, new C28021(conversationId, null), 3, null);
    }

    public /* synthetic */ NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getNexusClient() : nexusClient, (i10 & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, s0Var);
    }
}
