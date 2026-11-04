package com.devtodev.analytics.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Response {

    public static final class DoNotRetryIdentification extends Response {
        private final int responseCode;

        public DoNotRetryIdentification(int i10) {
            super(null);
            this.responseCode = i10;
        }

        public static /* synthetic */ DoNotRetryIdentification copy$default(DoNotRetryIdentification doNotRetryIdentification, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = doNotRetryIdentification.responseCode;
            }
            return doNotRetryIdentification.copy(i10);
        }

        public final int component1() {
            return this.responseCode;
        }

        @NotNull
        public final DoNotRetryIdentification copy(int i10) {
            return new DoNotRetryIdentification(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoNotRetryIdentification) && this.responseCode == ((DoNotRetryIdentification) obj).responseCode;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.responseCode);
        }

        @NotNull
        public String toString() {
            return "DoNotRetryIdentification(responseCode=" + this.responseCode + ")";
        }
    }

    public static final class ResponseConnectionNull extends Response {

        @NotNull
        public static final ResponseConnectionNull INSTANCE = new ResponseConnectionNull();

        private ResponseConnectionNull() {
            super(null);
        }
    }

    public static final class ResponseDataReadError extends Response {

        @Nullable
        private final String message;

        public ResponseDataReadError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ResponseDataReadError copy$default(ResponseDataReadError responseDataReadError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = responseDataReadError.message;
            }
            return responseDataReadError.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final ResponseDataReadError copy(@Nullable String str) {
            return new ResponseDataReadError(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseDataReadError) && Intrinsics.areEqual(this.message, ((ResponseDataReadError) obj).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ResponseDataReadError(message=" + this.message + ")";
        }
    }

    public static final class ResponseError extends Response {
        private final int responseCode;

        @NotNull
        private final String responseMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseError(int i10, @NotNull String responseMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
            this.responseCode = i10;
            this.responseMessage = responseMessage;
        }

        public static /* synthetic */ ResponseError copy$default(ResponseError responseError, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = responseError.responseCode;
            }
            if ((i11 & 2) != 0) {
                str = responseError.responseMessage;
            }
            return responseError.copy(i10, str);
        }

        public final int component1() {
            return this.responseCode;
        }

        @NotNull
        public final String component2() {
            return this.responseMessage;
        }

        @NotNull
        public final ResponseError copy(int i10, @NotNull String responseMessage) {
            Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
            return new ResponseError(i10, responseMessage);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseError)) {
                return false;
            }
            ResponseError responseError = (ResponseError) obj;
            return this.responseCode == responseError.responseCode && Intrinsics.areEqual(this.responseMessage, responseError.responseMessage);
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        @NotNull
        public final String getResponseMessage() {
            return this.responseMessage;
        }

        public int hashCode() {
            return this.responseMessage.hashCode() + (Integer.hashCode(this.responseCode) * 31);
        }

        @NotNull
        public String toString() {
            return "ResponseError(responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ")";
        }
    }

    public static final class ResponseInputNull extends Response {

        @NotNull
        public static final ResponseInputNull INSTANCE = new ResponseInputNull();

        private ResponseInputNull() {
            super(null);
        }
    }

    public static final class ResponseResult extends Response {

        @NotNull
        private final String result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseResult(@NotNull String result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ ResponseResult copy$default(ResponseResult responseResult, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = responseResult.result;
            }
            return responseResult.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.result;
        }

        @NotNull
        public final ResponseResult copy(@NotNull String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new ResponseResult(result);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseResult) && Intrinsics.areEqual(this.result, ((ResponseResult) obj).result);
        }

        @NotNull
        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "ResponseResult(result=" + this.result + ")";
        }
    }

    public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Response() {
    }
}
