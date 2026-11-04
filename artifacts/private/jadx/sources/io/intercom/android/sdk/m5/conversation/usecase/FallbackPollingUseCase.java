package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFallbackPollingUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackPollingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n543#2,6:43\n*S KotlinDebug\n*F\n+ 1 FallbackPollingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase\n*L\n24#1:43,6\n*E\n"})
public final class FallbackPollingUseCase {
    public static final int $stable = 8;

    @NotNull
    private final Function0<AppConfig> appConfig;

    @NotNull
    private final RefreshConversationUseCase refreshConversationUseCase;

    @NotNull
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase", f = "FallbackPollingUseCase.kt", i = {0, 0, 1, 1}, l = {32, 38}, m = "invoke", n = {"this", "clientStateFlow", "this", "clientStateFlow"}, s = {"L$0", "L$1", "L$0", "L$1"})
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
            return FallbackPollingUseCase.this.invoke(null, this);
        }
    }

    public FallbackPollingUseCase(@NotNull Function0<AppConfig> appConfig, @NotNull TimeProvider timeProvider, @NotNull RefreshConversationUseCase refreshConversationUseCase) {
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
        this.refreshConversationUseCase = refreshConversationUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getDataLayer().getConfig().getValue();
    }

    @NotNull
    public final Function0<AppConfig> getAppConfig() {
        return this.appConfig;
    }

    @NotNull
    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    @NotNull
    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:25:0x008f->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0110 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase.invoke(kotlinx.coroutines.flow.k0, kotlin.coroutines.d):java.lang.Object");
    }

    public /* synthetic */ FallbackPollingUseCase(Function0 function0, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FallbackPollingUseCase._init_$lambda$0();
            }
        } : function0, (i10 & 2) != 0 ? Injector.get().getTimeProvider() : timeProvider, refreshConversationUseCase);
    }
}
