package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.GistEnvironment;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.MessagePosition;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InAppMessagingAction {

    public static final class ClearMessageQueue extends InAppMessagingAction {

        @NotNull
        public static final ClearMessageQueue INSTANCE = new ClearMessageQueue();

        private ClearMessageQueue() {
            super(null);
        }
    }

    public static final class DismissMessage extends InAppMessagingAction {

        @NotNull
        private final Message message;
        private final boolean shouldLog;
        private final boolean viaCloseAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissMessage(@NotNull Message message, boolean z10, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.shouldLog = z10;
            this.viaCloseAction = z11;
        }

        public static /* synthetic */ DismissMessage copy$default(DismissMessage dismissMessage, Message message, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = dismissMessage.message;
            }
            if ((i10 & 2) != 0) {
                z10 = dismissMessage.shouldLog;
            }
            if ((i10 & 4) != 0) {
                z11 = dismissMessage.viaCloseAction;
            }
            return dismissMessage.copy(message, z10, z11);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        public final boolean component2() {
            return this.shouldLog;
        }

        public final boolean component3() {
            return this.viaCloseAction;
        }

        @NotNull
        public final DismissMessage copy(@NotNull Message message, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new DismissMessage(message, z10, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DismissMessage)) {
                return false;
            }
            DismissMessage dismissMessage = (DismissMessage) obj;
            return Intrinsics.areEqual(this.message, dismissMessage.message) && this.shouldLog == dismissMessage.shouldLog && this.viaCloseAction == dismissMessage.viaCloseAction;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public final boolean getShouldLog() {
            return this.shouldLog;
        }

        public final boolean getViaCloseAction() {
            return this.viaCloseAction;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Boolean.hashCode(this.shouldLog)) * 31) + Boolean.hashCode(this.viaCloseAction);
        }

        @NotNull
        public String toString() {
            return "DismissMessage(message=" + this.message + ", shouldLog=" + this.shouldLog + ", viaCloseAction=" + this.viaCloseAction + ")";
        }

        public /* synthetic */ DismissMessage(Message message, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(message, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11);
        }
    }

    public static final class DisplayMessage extends InAppMessagingAction {

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayMessage(@NotNull Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ DisplayMessage copy$default(DisplayMessage displayMessage, Message message, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = displayMessage.message;
            }
            return displayMessage.copy(message);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @NotNull
        public final DisplayMessage copy(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new DisplayMessage(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayMessage) && Intrinsics.areEqual(this.message, ((DisplayMessage) obj).message);
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "DisplayMessage(message=" + this.message + ")";
        }
    }

    public static final class EmbedMessages extends InAppMessagingAction {

        @NotNull
        private final List<Message> messages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmbedMessages(@NotNull List<Message> messages) {
            super(null);
            Intrinsics.checkNotNullParameter(messages, "messages");
            this.messages = messages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EmbedMessages copy$default(EmbedMessages embedMessages, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = embedMessages.messages;
            }
            return embedMessages.copy(list);
        }

        @NotNull
        public final List<Message> component1() {
            return this.messages;
        }

        @NotNull
        public final EmbedMessages copy(@NotNull List<Message> messages) {
            Intrinsics.checkNotNullParameter(messages, "messages");
            return new EmbedMessages(messages);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmbedMessages) && Intrinsics.areEqual(this.messages, ((EmbedMessages) obj).messages);
        }

        @NotNull
        public final List<Message> getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        @NotNull
        public String toString() {
            return "EmbedMessages(messages=" + this.messages + ")";
        }
    }

    public static abstract class EngineAction {

        public static final class MessageLoadingFailed extends InAppMessagingAction {

            @NotNull
            private final Message message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageLoadingFailed(@NotNull Message message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ MessageLoadingFailed copy$default(MessageLoadingFailed messageLoadingFailed, Message message, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    message = messageLoadingFailed.message;
                }
                return messageLoadingFailed.copy(message);
            }

            @NotNull
            public final Message component1() {
                return this.message;
            }

            @NotNull
            public final MessageLoadingFailed copy(@NotNull Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new MessageLoadingFailed(message);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MessageLoadingFailed) && Intrinsics.areEqual(this.message, ((MessageLoadingFailed) obj).message);
            }

            @NotNull
            public final Message getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return "MessageLoadingFailed(message=" + this.message + ")";
            }
        }

        public static final class Tap extends InAppMessagingAction {

            @NotNull
            private final String action;

            @NotNull
            private final Message message;

            @NotNull
            private final String name;

            @NotNull
            private final String route;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tap(@NotNull Message message, @NotNull String route, @NotNull String name, @NotNull String action) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(action, "action");
                this.message = message;
                this.route = route;
                this.name = name;
                this.action = action;
            }

            public static /* synthetic */ Tap copy$default(Tap tap, Message message, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    message = tap.message;
                }
                if ((i10 & 2) != 0) {
                    str = tap.route;
                }
                if ((i10 & 4) != 0) {
                    str2 = tap.name;
                }
                if ((i10 & 8) != 0) {
                    str3 = tap.action;
                }
                return tap.copy(message, str, str2, str3);
            }

            @NotNull
            public final Message component1() {
                return this.message;
            }

            @NotNull
            public final String component2() {
                return this.route;
            }

            @NotNull
            public final String component3() {
                return this.name;
            }

            @NotNull
            public final String component4() {
                return this.action;
            }

            @NotNull
            public final Tap copy(@NotNull Message message, @NotNull String route, @NotNull String name, @NotNull String action) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(action, "action");
                return new Tap(message, route, name, action);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tap)) {
                    return false;
                }
                Tap tap = (Tap) obj;
                return Intrinsics.areEqual(this.message, tap.message) && Intrinsics.areEqual(this.route, tap.route) && Intrinsics.areEqual(this.name, tap.name) && Intrinsics.areEqual(this.action, tap.action);
            }

            @NotNull
            public final String getAction() {
                return this.action;
            }

            @NotNull
            public final Message getMessage() {
                return this.message;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getRoute() {
                return this.route;
            }

            public int hashCode() {
                return (((((this.message.hashCode() * 31) + this.route.hashCode()) * 31) + this.name.hashCode()) * 31) + this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "Tap(message=" + this.message + ", route=" + this.route + ", name=" + this.name + ", action=" + this.action + ")";
            }
        }

        public /* synthetic */ EngineAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EngineAction() {
        }
    }

    public static final class Initialize extends InAppMessagingAction {

        @NotNull
        private final String dataCenter;

        @NotNull
        private final GistEnvironment environment;

        @NotNull
        private final String siteId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(@NotNull String siteId, @NotNull String dataCenter, @NotNull GistEnvironment environment) {
            super(null);
            Intrinsics.checkNotNullParameter(siteId, "siteId");
            Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.siteId = siteId;
            this.dataCenter = dataCenter;
            this.environment = environment;
        }

        public static /* synthetic */ Initialize copy$default(Initialize initialize, String str, String str2, GistEnvironment gistEnvironment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initialize.siteId;
            }
            if ((i10 & 2) != 0) {
                str2 = initialize.dataCenter;
            }
            if ((i10 & 4) != 0) {
                gistEnvironment = initialize.environment;
            }
            return initialize.copy(str, str2, gistEnvironment);
        }

        @NotNull
        public final String component1() {
            return this.siteId;
        }

        @NotNull
        public final String component2() {
            return this.dataCenter;
        }

        @NotNull
        public final GistEnvironment component3() {
            return this.environment;
        }

        @NotNull
        public final Initialize copy(@NotNull String siteId, @NotNull String dataCenter, @NotNull GistEnvironment environment) {
            Intrinsics.checkNotNullParameter(siteId, "siteId");
            Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new Initialize(siteId, dataCenter, environment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Initialize)) {
                return false;
            }
            Initialize initialize = (Initialize) obj;
            return Intrinsics.areEqual(this.siteId, initialize.siteId) && Intrinsics.areEqual(this.dataCenter, initialize.dataCenter) && this.environment == initialize.environment;
        }

        @NotNull
        public final String getDataCenter() {
            return this.dataCenter;
        }

        @NotNull
        public final GistEnvironment getEnvironment() {
            return this.environment;
        }

        @NotNull
        public final String getSiteId() {
            return this.siteId;
        }

        public int hashCode() {
            return (((this.siteId.hashCode() * 31) + this.dataCenter.hashCode()) * 31) + this.environment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Initialize(siteId=" + this.siteId + ", dataCenter=" + this.dataCenter + ", environment=" + this.environment + ")";
        }
    }

    public static final class LoadMessage extends InAppMessagingAction {

        @NotNull
        private final Message message;

        @Nullable
        private final MessagePosition position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMessage(@NotNull Message message, @Nullable MessagePosition messagePosition) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.position = messagePosition;
        }

        public static /* synthetic */ LoadMessage copy$default(LoadMessage loadMessage, Message message, MessagePosition messagePosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                message = loadMessage.message;
            }
            if ((i10 & 2) != 0) {
                messagePosition = loadMessage.position;
            }
            return loadMessage.copy(message, messagePosition);
        }

        @NotNull
        public final Message component1() {
            return this.message;
        }

        @Nullable
        public final MessagePosition component2() {
            return this.position;
        }

        @NotNull
        public final LoadMessage copy(@NotNull Message message, @Nullable MessagePosition messagePosition) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new LoadMessage(message, messagePosition);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadMessage)) {
                return false;
            }
            LoadMessage loadMessage = (LoadMessage) obj;
            return Intrinsics.areEqual(this.message, loadMessage.message) && this.position == loadMessage.position;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @Nullable
        public final MessagePosition getPosition() {
            return this.position;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            MessagePosition messagePosition = this.position;
            return iHashCode + (messagePosition == null ? 0 : messagePosition.hashCode());
        }

        @NotNull
        public String toString() {
            return "LoadMessage(message=" + this.message + ", position=" + this.position + ")";
        }

        public /* synthetic */ LoadMessage(Message message, MessagePosition messagePosition, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(message, (i10 & 2) != 0 ? null : messagePosition);
        }
    }

    public static final class ProcessMessageQueue extends InAppMessagingAction {

        @NotNull
        private final List<Message> messages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessMessageQueue(@NotNull List<Message> messages) {
            super(null);
            Intrinsics.checkNotNullParameter(messages, "messages");
            this.messages = messages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProcessMessageQueue copy$default(ProcessMessageQueue processMessageQueue, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = processMessageQueue.messages;
            }
            return processMessageQueue.copy(list);
        }

        @NotNull
        public final List<Message> component1() {
            return this.messages;
        }

        @NotNull
        public final ProcessMessageQueue copy(@NotNull List<Message> messages) {
            Intrinsics.checkNotNullParameter(messages, "messages");
            return new ProcessMessageQueue(messages);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessMessageQueue) && Intrinsics.areEqual(this.messages, ((ProcessMessageQueue) obj).messages);
        }

        @NotNull
        public final List<Message> getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProcessMessageQueue(messages=" + this.messages + ")";
        }
    }

    public static final class ReportError extends InAppMessagingAction {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportError(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ ReportError copy$default(ReportError reportError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = reportError.message;
            }
            return reportError.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final ReportError copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ReportError(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportError) && Intrinsics.areEqual(this.message, ((ReportError) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ReportError(message=" + this.message + ")";
        }
    }

    public static final class Reset extends InAppMessagingAction {

        @NotNull
        public static final Reset INSTANCE = new Reset();

        private Reset() {
            super(null);
        }
    }

    public static final class SetPageRoute extends InAppMessagingAction {

        @NotNull
        private final String route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetPageRoute(@NotNull String route) {
            super(null);
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
        }

        public static /* synthetic */ SetPageRoute copy$default(SetPageRoute setPageRoute, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setPageRoute.route;
            }
            return setPageRoute.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.route;
        }

        @NotNull
        public final SetPageRoute copy(@NotNull String route) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new SetPageRoute(route);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPageRoute) && Intrinsics.areEqual(this.route, ((SetPageRoute) obj).route);
        }

        @NotNull
        public final String getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetPageRoute(route=" + this.route + ")";
        }
    }

    public static final class SetPollingInterval extends InAppMessagingAction {
        private final long interval;

        public SetPollingInterval(long j10) {
            super(null);
            this.interval = j10;
        }

        public static /* synthetic */ SetPollingInterval copy$default(SetPollingInterval setPollingInterval, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = setPollingInterval.interval;
            }
            return setPollingInterval.copy(j10);
        }

        public final long component1() {
            return this.interval;
        }

        @NotNull
        public final SetPollingInterval copy(long j10) {
            return new SetPollingInterval(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPollingInterval) && this.interval == ((SetPollingInterval) obj).interval;
        }

        public final long getInterval() {
            return this.interval;
        }

        public int hashCode() {
            return Long.hashCode(this.interval);
        }

        @NotNull
        public String toString() {
            return "SetPollingInterval(interval=" + this.interval + ")";
        }
    }

    public static final class SetUserIdentifier extends InAppMessagingAction {

        @NotNull
        private final String user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetUserIdentifier(@NotNull String user) {
            super(null);
            Intrinsics.checkNotNullParameter(user, "user");
            this.user = user;
        }

        public static /* synthetic */ SetUserIdentifier copy$default(SetUserIdentifier setUserIdentifier, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setUserIdentifier.user;
            }
            return setUserIdentifier.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.user;
        }

        @NotNull
        public final SetUserIdentifier copy(@NotNull String user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return new SetUserIdentifier(user);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SetUserIdentifier) && Intrinsics.areEqual(this.user, ((SetUserIdentifier) obj).user)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetUserIdentifier(user=" + this.user + ")";
        }
    }

    public /* synthetic */ InAppMessagingAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InAppMessagingAction() {
    }
}
