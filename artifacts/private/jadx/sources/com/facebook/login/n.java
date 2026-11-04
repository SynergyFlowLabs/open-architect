package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.w0;
import com.facebook.internal.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, @NotNull LoginClient.Request request) {
        super(context, 65536, w0.W, w0.f100181l, request.a(), request.n());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.facebook.internal.x0
    protected void f(@NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
