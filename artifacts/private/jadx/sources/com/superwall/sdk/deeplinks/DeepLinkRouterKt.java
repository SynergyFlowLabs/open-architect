package com.superwall.sdk.deeplinks;

import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DeepLinkRouterKt {
    @NotNull
    public static final Object getRedeemableCode(@NotNull Uri uri) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Result.a aVar = Result.Companion;
        Object objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(new UnsupportedOperationException("Link not valid for redemption")));
        String host = uri.getHost();
        return (host == null || !StringsKt.V2(host, "superwall", false, 2, null) || !StringsKt.O1(uri.getLastPathSegment(), "redeem", false, 2, null) || (queryParameter = uri.getQueryParameter("code")) == null) ? objM785constructorimpl : Result.m785constructorimpl(queryParameter);
    }
}
