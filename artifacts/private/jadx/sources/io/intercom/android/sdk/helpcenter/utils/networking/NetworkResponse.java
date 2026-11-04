package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.w0;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 2)
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class ClientError extends NetworkResponse {
        public static final int $stable = 8;

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientError(@NotNull Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = clientError.error;
            }
            return clientError.copy(th2);
        }

        @NotNull
        public final Throwable component1() {
            return this.error;
        }

        @NotNull
        public final ClientError copy(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ClientError(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientError) && Intrinsics.areEqual(this.error, ((ClientError) obj).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClientError(error=" + this.error + ')';
        }
    }

    @w0(parameters = 0)
    public static final class NetworkError extends NetworkResponse {
        public static final int $stable = 8;

        @NotNull
        private final IOException error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull IOException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iOException = networkError.error;
            }
            return networkError.copy(iOException);
        }

        @NotNull
        public final IOException component1() {
            return this.error;
        }

        @NotNull
        public final NetworkError copy(@NotNull IOException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new NetworkError(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && Intrinsics.areEqual(this.error, ((NetworkError) obj).error);
        }

        @NotNull
        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkError(error=" + this.error + ')';
        }
    }

    @w0(parameters = 1)
    public static final class ServerError extends NetworkResponse {
        public static final int $stable = 0;
        private final int code;

        public ServerError(int i10) {
            super(null);
            this.code = i10;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = serverError.code;
            }
            return serverError.copy(i10);
        }

        public final int component1() {
            return this.code;
        }

        @NotNull
        public final ServerError copy(int i10) {
            return new ServerError(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && this.code == ((ServerError) obj).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return "ServerError(code=" + this.code + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Success<T> extends NetworkResponse<T> {
        public static final int $stable = 0;

        @NotNull
        private final T body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull T body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.body;
            }
            return success.copy(obj);
        }

        @NotNull
        public final T component1() {
            return this.body;
        }

        @NotNull
        public final Success<T> copy(@NotNull T body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return new Success<>(body);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.body, ((Success) obj).body);
        }

        @NotNull
        public final T getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(body=" + this.body + ')';
        }
    }

    public /* synthetic */ NetworkResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkResponse() {
    }
}
