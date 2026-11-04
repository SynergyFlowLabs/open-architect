package io.ktor.client.plugins.cache;

import com.superwall.sdk.network.Api;
import io.ktor.client.engine.v;
import io.ktor.http.content.w;
import io.ktor.http.d1;
import io.ktor.http.m;
import io.ktor.http.s2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294525a = pi.a.a("io.ktor.client.plugins.HttpCache");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(s2 s2Var) {
        return Intrinsics.areEqual(s2Var.getName(), "http") || Intrinsics.areEqual(s2Var.getName(), Api.scheme);
    }

    @NotNull
    public static final org.slf4j.c d() {
        return f294525a;
    }

    @NotNull
    public static final Function1<String, String> e(@NotNull final w content, @NotNull final Function1<? super String, String> headerExtractor, @NotNull final Function1<? super String, ? extends List<String>> allHeadersExtractor) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headerExtractor, "headerExtractor");
        Intrinsics.checkNotNullParameter(allHeadersExtractor, "allHeadersExtractor");
        return new Function1() { // from class: io.ktor.client.plugins.cache.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.f(content, headerExtractor, allHeadersExtractor, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(w wVar, Function1 function1, Function1 function2, String header) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(header, "header");
        d1 d1Var = d1.f295782a;
        if (Intrinsics.areEqual(header, d1Var.z())) {
            Long lA = wVar.a();
            return (lA == null || (string2 = lA.toString()) == null) ? "" : string2;
        }
        if (Intrinsics.areEqual(header, d1Var.C())) {
            m mVarB = wVar.b();
            if (mVarB != null && (string = mVarB.toString()) != null) {
                return string;
            }
            return "";
        }
        if (Intrinsics.areEqual(header, d1Var.L0())) {
            String strF = wVar.c().get(d1Var.L0());
            if (strF == null && (strF = (String) function1.invoke(d1Var.L0())) == null) {
                strF = v.f();
            }
            return strF;
        }
        List<String> listB = wVar.c().b(header);
        if (listB == null && (listB = (List) function2.invoke(header)) == null) {
            listB = CollectionsKt.emptyList();
        }
        return CollectionsKt.joinToString$default(listB, ";", null, null, 0, null, null, 62, null);
    }
}
