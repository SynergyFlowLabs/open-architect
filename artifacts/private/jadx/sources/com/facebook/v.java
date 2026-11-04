package com.facebook;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final q0 f102159c;

    public v(@Nullable q0 q0Var, @Nullable String str) {
        super(str);
        this.f102159c = q0Var;
    }

    @Nullable
    public final q0 c() {
        return this.f102159c;
    }

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        q0 q0Var = this.f102159c;
        FacebookRequestError facebookRequestErrorG = q0Var == null ? null : q0Var.g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (facebookRequestErrorG != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(facebookRequestErrorG.q());
            sb2.append(", facebookErrorCode: ");
            sb2.append(facebookRequestErrorG.h());
            sb2.append(", facebookErrorType: ");
            sb2.append(facebookRequestErrorG.k());
            sb2.append(", message: ");
            sb2.append(facebookRequestErrorG.i());
            sb2.append("}");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "errorStringBuilder.toString()");
        return string;
    }
}
