package io.customer.messaginginapp.gist.data.model;

import eh.d;
import ih.e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class MessageKt {
    public static final boolean matchesRoute(@NotNull Message message, @Nullable String str) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(message, "<this>");
        String routeRule = message.getGistProperties().getRouteRule();
        if (routeRule == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(Boolean.valueOf(new Regex(routeRule).k(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m786isFailureimpl(objM785constructorimpl)) {
            Boolean bool = Boolean.FALSE;
            if (Result.m786isFailureimpl(objM785constructorimpl)) {
                objM785constructorimpl = bool;
            }
            return ((Boolean) objM785constructorimpl).booleanValue();
        }
        e.a.a(d.f274883c.w(), "Problem processing route rule message regex: " + routeRule, null, 2, null);
        return false;
    }
}
