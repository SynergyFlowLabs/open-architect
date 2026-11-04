package com.facebook;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f100302d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f100303e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final FacebookRequestError f100304c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull FacebookRequestError requestError, @Nullable String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f100304c = requestError;
    }

    @NotNull
    public final FacebookRequestError c() {
        return this.f100304c;
    }

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f100304c.q() + ", facebookErrorCode: " + this.f100304c.h() + ", facebookErrorType: " + this.f100304c.k() + ", message: " + this.f100304c.i() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
