package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.http.w2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @Nullable
    public static final Object a(@NotNull f fVar, @NotNull String str, @NotNull Cookie cookie, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objNd = fVar.Nd(w2.f(str), cookie, dVar);
        return objNd == kotlin.coroutines.intrinsics.b.l() ? objNd : Unit.f312394a;
    }

    @NotNull
    public static final Cookie b(@NotNull Cookie cookie, @NotNull Url requestUrl) {
        Intrinsics.checkNotNullParameter(cookie, "<this>");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        String strX = cookie.x();
        Cookie cookieQ = (strX == null || !StringsKt.u2(strX, "/", false, 2, null)) ? Cookie.q(cookie, null, null, null, null, null, null, requestUrl.p(), false, false, null, 959, null) : cookie;
        String strR = cookieQ.r();
        return (strR == null || StringsKt.w3(strR)) ? Cookie.q(cookieQ, null, null, null, null, null, requestUrl.u(), null, false, false, null, 991, null) : cookieQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (kotlin.text.StringsKt.M1(r8, '.' + r0, false, 2, null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(@org.jetbrains.annotations.NotNull io.ktor.http.Cookie r12, @org.jetbrains.annotations.NotNull io.ktor.http.Url r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.g.c(io.ktor.http.Cookie, io.ktor.http.Url):boolean");
    }
}
