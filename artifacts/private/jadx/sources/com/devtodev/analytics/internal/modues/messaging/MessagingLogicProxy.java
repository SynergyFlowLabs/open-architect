package com.devtodev.analytics.internal.modues.messaging;

import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingLogicProxy implements IMessagingProxy {

    @Nullable
    private IMessaging messagingLogic;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.messaging.MessagingLogicProxy$pushOpened$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $button;
        final /* synthetic */ int $pushId;
        final /* synthetic */ long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, int i10, String str) {
            super(0);
            this.$timestamp = j10;
            this.$pushId = i10;
            this.$button = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IMessaging iMessaging = MessagingLogicProxy.this.messagingLogic;
            MessagingLogicProxy messagingLogicProxy = MessagingLogicProxy.this;
            long j10 = this.$timestamp;
            int i10 = this.$pushId;
            String str = this.$button;
            if (iMessaging == null) {
                messagingLogicProxy.validateInitialization("pushOpened");
            } else {
                iMessaging.pushOpened(j10, i10, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.messaging.MessagingLogicProxy$pushReceive$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25891 extends l0 implements Function0<Unit> {
        final /* synthetic */ int $pushId;
        final /* synthetic */ long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25891(long j10, int i10) {
            super(0);
            this.$timestamp = j10;
            this.$pushId = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IMessaging iMessaging = MessagingLogicProxy.this.messagingLogic;
            MessagingLogicProxy messagingLogicProxy = MessagingLogicProxy.this;
            long j10 = this.$timestamp;
            int i10 = this.$pushId;
            if (iMessaging == null) {
                messagingLogicProxy.validateInitialization("pushReceive");
            } else {
                iMessaging.pushReceive(j10, i10);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.messaging.MessagingLogicProxy$pushToken$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25901 extends l0 implements Function0<Unit> {
        final /* synthetic */ boolean $isAllowed;
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25901(String str, boolean z10) {
            super(0);
            this.$token = str;
            this.$isAllowed = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IMessaging iMessaging = MessagingLogicProxy.this.messagingLogic;
            MessagingLogicProxy messagingLogicProxy = MessagingLogicProxy.this;
            String str = this.$token;
            boolean z10 = this.$isAllowed;
            if (iMessaging == null) {
                messagingLogicProxy.validateInitialization("pushToken");
            } else {
                iMessaging.pushToken(str, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateInitialization(String str) {
        Logger.INSTANCE.error("In the " + str + " method an error has occurred: The SDK is not initialized yet!", null);
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessagingProxy
    public void initialize(@NotNull IMessaging messagingLogic) {
        Intrinsics.checkNotNullParameter(messagingLogic, "messagingLogic");
        this.messagingLogic = messagingLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushOpened(long j10, int i10, @Nullable String str) {
        QueueManager.Companion.runIncoming(new AnonymousClass1(j10, i10, str));
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushReceive(long j10, int i10) {
        QueueManager.Companion.runIncoming(new C25891(j10, i10));
    }

    @Override // com.devtodev.analytics.internal.modues.messaging.IMessaging
    public void pushToken(@NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(token, "token");
        QueueManager.Companion.runIncoming(new C25901(token, z10));
    }
}
