package io.ktor.client.plugins.cookies;

import io.ktor.client.plugins.a0;
import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.http.h0;
import io.ktor.http.w2;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294757a = pi.a.a("io.ktor.client.plugins.HttpCookies");

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.G1}, m = "cookies", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294759b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294758a = obj;
            this.f294759b |= Integer.MIN_VALUE;
            return i.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {androidx.media2.widget.f.i.f59797r0}, m = "cookies", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294761b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294760a = obj;
            this.f294761b |= Integer.MIN_VALUE;
            return i.d(null, null, this);
        }
    }

    /* synthetic */ class c extends g0 implements Function1<Cookie, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f294762a = new c();

        c() {
            super(1, h0.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(Cookie p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return h0.q(p10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object c(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294759b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294759b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objR8 = aVar.f294758a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294759b;
        if (i11 == 0) {
            ResultKt.m(objR8);
            h hVar = (h) a0.c(cVar, h.f294719d);
            if (hVar != null) {
                aVar.f294759b = 1;
                objR8 = hVar.R8(url, aVar);
                if (objR8 == objL) {
                    return objL;
                }
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objR8);
        List list = (List) objR8;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object d(@NotNull io.ktor.client.c cVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294761b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294761b = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objR8 = bVar.f294760a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f294761b;
        if (i11 == 0) {
            ResultKt.m(objR8);
            h hVar = (h) a0.c(cVar, h.f294719d);
            if (hVar != null) {
                Url urlF = w2.f(str);
                bVar.f294761b = 1;
                objR8 = hVar.R8(urlF, bVar);
                if (objR8 == objL) {
                    return objL;
                }
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objR8);
        List list = (List) objR8;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    public static final Cookie e(@NotNull List<Cookie> list, @NotNull String name) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Cookie) next).getName(), name)) {
                return (Cookie) next;
            }
        }
        next = null;
        return (Cookie) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(List<Cookie> list) {
        return CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, c.f294762a, 30, null);
    }
}
