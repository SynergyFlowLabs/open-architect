package io.intercom.android.sdk;

import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class NexusWrapper extends NexusClient implements NexusListener {

    @NotNull
    private static final String CONVERSATION_ID = "conversationId";

    @Nullable
    private ScheduledFuture<?> actionFuture;

    @NotNull
    private final Api api;

    @NotNull
    private final IntercomDataLayer dataLayer;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;

    @NotNull
    private final Twig twig;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationSeen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NexusEventType.NewContent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NexusWrapper(@NotNull Twig twig, @NotNull okhttp3.b0 okHttpClient, @NotNull Api api, long j10, @NotNull IntercomDataLayer dataLayer) {
        super(twig, okHttpClient);
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        this.twig = twig;
        this.api = api;
        this.debouncePeriodMs = j10;
        this.dataLayer = dataLayer;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(NexusWrapper this$0, NexusConfig config, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        this$0.connectNow(config, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnect$lambda$1(NexusWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.disconnectNow();
    }

    private final void fetchUnreadConversationsIfBackgrounded() {
        if (this.dataLayer.getOverlayState().getValue().getResumedHostActivity() == null && !this.dataLayer.getHostAppState().getValue().isBackgrounded()) {
            return;
        }
        this.api.getUnreadConversations();
    }

    private final void logKnownEvent(NexusEvent nexusEvent) {
        this.twig.internal("Nexus", "Received " + nexusEvent.getEventType() + " event");
    }

    private final Boolean removeCallbacks() {
        ScheduledFuture<?> scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            return Boolean.valueOf(scheduledFuture.cancel(false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleDisconnect$lambda$2(NexusWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.disconnectNow();
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void connect(@NotNull final NexusConfig config, final boolean z10) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getEndpoints().isEmpty()) {
            this.twig.w("No realtime endpoints present so we can't connect", new Object[0]);
        } else {
            removeCallbacks();
            this.actionFuture = this.executor.schedule(new Runnable() { // from class: io.intercom.android.sdk.d0
                @Override // java.lang.Runnable
                public final void run() {
                    NexusWrapper.connect$lambda$0(this.f291550a, config, z10);
                }
            }, this.debouncePeriodMs, TimeUnit.MILLISECONDS);
        }
    }

    @l1
    public final void connectNow(@NotNull NexusConfig config, boolean z10) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (isConnected()) {
            return;
        }
        super.connect(config, z10);
        setTopics(CollectionsKt.listOf("*"));
        addEventListener(this);
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new Runnable() { // from class: io.intercom.android.sdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                NexusWrapper.disconnect$lambda$1(this.f291555a);
            }
        }, this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    @l1
    public final void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void notifyEvent(@NotNull NexusEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String strOptString = event.getEventData().optString(CONVERSATION_ID);
        NexusEventType eventType = event.getEventType();
        int i10 = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i10 == 1) {
            logKnownEvent(event);
            return;
        }
        if (i10 == 2) {
            logKnownEvent(event);
            fetchUnreadConversationsIfBackgrounded();
            return;
        }
        if (i10 == 3) {
            logKnownEvent(event);
            return;
        }
        if (i10 == 4) {
            logKnownEvent(event);
            IntercomDataLayer intercomDataLayer = this.dataLayer;
            Intrinsics.checkNotNull(strOptString);
            intercomDataLayer.markConversationAsRead(strOptString);
            return;
        }
        if (i10 != 5) {
            this.twig.internal("Nexus", "Unexpected event: " + event.getEventType());
            return;
        }
        logKnownEvent(event);
        long jOptLong = event.getEventData().optLong("entity_type");
        String strOptString2 = event.getEventData().optString("entity_id");
        if (jOptLong == 44) {
            this.api.fetchCarouselByEntityId(strOptString2);
            return;
        }
        if (jOptLong == 85) {
            this.api.fetchSurveyByEntityId(strOptString2);
            return;
        }
        this.twig.internal("Nexus NewContent", "Unexpected entity type: " + jOptLong);
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnect() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnectFailed() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onShutdown() {
    }

    public final void scheduleDisconnect(long j10) {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new Runnable() { // from class: io.intercom.android.sdk.f0
            @Override // java.lang.Runnable
            public final void run() {
                NexusWrapper.scheduleDisconnect$lambda$2(this.f291557a);
            }
        }, j10, TimeUnit.MILLISECONDS);
    }
}
