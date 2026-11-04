package com.planner5d.library.api.support;

import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.d0;
import okhttp3.u;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nRequestEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestEditor.kt\ncom/planner5d/library/api/support/RequestEditor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1#2:83\n774#3:84\n865#3,2:85\n*S KotlinDebug\n*F\n+ 1 RequestEditor.kt\ncom/planner5d/library/api/support/RequestEditor\n*L\n28#1:84\n28#1:85,2\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f142368a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f142369b = "Cookie";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f142370c = "x-planner5d-application";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f142371d = "x-planner5d-device";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f142372e = "x-planner5d-operating-system";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f142373f = "x-planner5d-installation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f142374g = "x-planner5d-locale";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final d0.a b(d0.a aVar, String str, int i10, String str2) {
        return aVar.n(f142370c, str + " " + i10 + " " + str2);
    }

    private final d0.a d(d0.a aVar, String str, String str2, String str3) {
        return aVar.n(f142371d, str + " " + str2 + " " + str3);
    }

    private final d0.a e(d0.a aVar, String str) {
        return aVar.n(f142373f, str);
    }

    private final d0.a f(d0.a aVar, String str, String str2) {
        return aVar.n(f142374g, str + "_" + str2);
    }

    private final d0.a g(d0.a aVar, String str, String str2) {
        return aVar.n(f142372e, str + " " + str2);
    }

    private final String h(List<okhttp3.m> list) {
        return CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, new Function1() { // from class: com.planner5d.library.api.support.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.i((okhttp3.m) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(okhttp3.m it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.s() + "=" + it.z();
    }

    @NotNull
    public final d0 c(@NotNull d0 request, @NotNull e clientInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientInfo, "clientInfo");
        return e(f(g(d(b(request.n(), clientInfo.s(), clientInfo.w(), clientInfo.x()), clientInfo.n(), clientInfo.p(), clientInfo.o()), clientInfo.v(), clientInfo.u()), clientInfo.r(), clientInfo.t()), clientInfo.q()).b();
    }

    @Nullable
    public final String j(@NotNull v url, @NotNull u headers) {
        Object next;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Iterator<T> it = okhttp3.m.f334715j.g(url, headers).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((okhttp3.m) next).s(), com.planner5d.library.services.r.apiSessionId.f224891a));
        okhttp3.m mVar = (okhttp3.m) next;
        if (mVar != null) {
            return mVar.z();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final d0 k(@NotNull d0 request, @Nullable String str) {
        Intrinsics.checkNotNullParameter(request, "request");
        List<okhttp3.m> listG = okhttp3.m.f334715j.g(request.q(), request.k());
        List arrayList = new ArrayList();
        for (Object obj : listG) {
            if (!Intrinsics.areEqual(((okhttp3.m) obj).s(), com.planner5d.library.services.r.apiSessionId.f224891a)) {
                arrayList.add(obj);
            }
        }
        if (str != null && !StringsKt.w3(str)) {
            arrayList = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(new okhttp3.m.a().g(com.planner5d.library.services.r.apiSessionId.f224891a).j(str).b(request.q().F()).a()));
        }
        return request.n().t("Cookie").a("Cookie", h(arrayList)).b();
    }

    @l1
    @NotNull
    public final d0 l(@NotNull d0 request, @NotNull String headerName, @NotNull String parameterName, @NotNull String parameterValue) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        Intrinsics.checkNotNullParameter(parameterValue, "parameterValue");
        String strK = request.k().k(headerName);
        if (strK != null) {
            d0 d0VarB = request.n().t(headerName).a(headerName, new Regex("(?<=" + parameterName + "=)(.*?)(?=;|$)").replace(strK, parameterValue)).b();
            if (d0VarB != null) {
                return d0VarB;
            }
        }
        return request;
    }
}
