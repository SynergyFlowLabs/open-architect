package io.ktor.client.plugins.cache;

import com.facebook.appevents.p;
import fi.y;
import io.ktor.http.c1;
import io.ktor.http.d1;
import io.ktor.http.i1;
import io.ktor.http.j0;
import io.ktor.http.r0;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.date.GMTDate;
import io.sentry.protocol.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.io.c0;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1761#2,3:147\n295#2,2:150\n295#2,2:152\n295#2,2:155\n1#3:154\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntryKt\n*L\n70#1:147,3\n72#1:150,2\n107#1:152,2\n129#1:155,2\n*E\n"})
public final class e {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {n.f306405g, "isShared"}, s = {"L$0", "Z$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f294518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294521d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294520c = obj;
            this.f294521d |= Integer.MIN_VALUE;
            return e.b(false, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object b(boolean z10, @NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super c> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294521d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294521d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objI = aVar.f294520c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294521d;
        if (i11 == 0) {
            ResultKt.m(objI);
            io.ktor.utils.io.h hVarC = cVar.c();
            aVar.f294519b = cVar;
            aVar.f294518a = z10;
            aVar.f294521d = 1;
            objI = io.ktor.utils.io.k.I(hVarC, aVar);
            if (objI == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f294518a;
            cVar = (io.ktor.client.statement.c) aVar.f294519b;
            ResultKt.m(objI);
        }
        return new c(d(cVar, z10, null, 2, null), g(cVar), cVar, g0.c((c0) objI));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e A[EDGE_INSN: B:15:0x004e->B:16:0x0050 BREAK  A[LOOP:0: B:10:0x0033->B:54:?]] */
    @NotNull
    public static final GMTDate c(@NotNull io.ktor.client.statement.c cVar, boolean z10, @NotNull Function0<GMTDate> fallback) {
        String str;
        Object next;
        String strG;
        List listSplit$default;
        String str2;
        String strG2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        List<r0> listA = i1.a(cVar);
        Long lC1 = null;
        if (!z10) {
            str = io.ktor.client.utils.d.f295388b;
            break;
        }
        List<r0> list = listA;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    str = io.ktor.client.utils.d.f295388b;
                    break;
                }
                strG2 = ((r0) it.next()).g();
                str = io.ktor.client.utils.d.f295399m;
            } while (!StringsKt.u2(strG2, io.ktor.client.utils.d.f295399m, false, 2, null));
        } else {
            str = io.ktor.client.utils.d.f295388b;
            break;
        }
        Iterator<T> it2 = listA.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!StringsKt.u2(((r0) next).g(), str, false, 2, null));
        r0 r0Var = (r0) next;
        if (r0Var != null && (strG = r0Var.g()) != null && (listSplit$default = StringsKt.split$default(strG, new String[]{"="}, false, 0, 6, null)) != null && (str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1)) != null) {
            lC1 = StringsKt.c1(str2);
        }
        if (lC1 != null) {
            return ni.b.c(cVar.f(), lC1.longValue() * 1000);
        }
        String str3 = cVar.O().get(d1.f295782a.L());
        if (str3 == null) {
            return fallback.invoke();
        }
        if (Intrinsics.areEqual(str3, p.f99189d0) || StringsKt.w3(str3)) {
            return fallback.invoke();
        }
        try {
            return j0.b(str3);
        } catch (Throwable unused) {
            return fallback.invoke();
        }
    }

    public static /* synthetic */ GMTDate d(io.ktor.client.statement.c cVar, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: io.ktor.client.plugins.cache.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.e();
                }
            };
        }
        return c(cVar, z10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GMTDate e() {
        return ni.a.c(null, 1, null);
    }

    @NotNull
    public static final k f(@NotNull GMTDate cacheExpires, @NotNull v0 responseHeaders, @NotNull y request) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String strG;
        Integer intOrNull;
        String strG2;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(cacheExpires, "cacheExpires");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(request, "request");
        w0 w0VarO = request.O();
        d1 d1Var = d1.f295782a;
        List<String> listB = responseHeaders.b(d1Var.u());
        Object obj = null;
        List<r0> listF = c1.f(listB != null ? CollectionsKt.joinToString$default(listB, ",", null, null, 0, null, null, 62, null) : null);
        List<String> listB2 = w0VarO.b(d1Var.u());
        List<r0> listF2 = c1.f(listB2 != null ? CollectionsKt.joinToString$default(listB2, ",", null, null, 0, null, null, 62, null) : null);
        if (listF2.contains(io.ktor.client.plugins.cache.a.f294466a.b())) {
            g.d().J("\"no-cache\" is set for " + request.i() + ", should validate cached response");
            return k.ShouldValidate;
        }
        List<r0> list = listF2;
        Iterator<T> it = list.iterator();
        do {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.u2(((r0) next).g(), "max-age=", false, 2, null));
        r0 r0Var = (r0) next;
        if (r0Var == null || (strG2 = r0Var.g()) == null || (listSplit$default = StringsKt.split$default(strG2, new String[]{"="}, false, 0, 6, null)) == null || (str = (String) listSplit$default.get(1)) == null) {
            numValueOf = null;
        } else {
            Integer intOrNull2 = StringsKt.toIntOrNull(str);
            numValueOf = Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            g.d().J("\"max-age\" is not set for " + request.i() + ", should validate cached response");
            return k.ShouldValidate;
        }
        io.ktor.client.plugins.cache.a aVar = io.ktor.client.plugins.cache.a.f294466a;
        if (listF.contains(aVar.b())) {
            g.d().J("\"no-cache\" is set for " + request.i() + ", should validate cached response");
            return k.ShouldValidate;
        }
        long jW = cacheExpires.W() - ni.a.d();
        if (jW > 0) {
            g.d().J("Cached response is valid for " + request.i() + ", should not validate");
            return k.ShouldNotValidate;
        }
        if (listF.contains(aVar.a())) {
            g.d().J("\"must-revalidate\" is set for " + request.i() + ", should validate cached response");
            return k.ShouldValidate;
        }
        for (Object obj2 : list) {
            if (StringsKt.u2(((r0) obj2).g(), "max-stale=", false, 2, null)) {
                obj = obj2;
                break;
            }
        }
        r0 r0Var2 = (r0) obj;
        if (r0Var2 != null && (strG = r0Var2.g()) != null) {
            String strSubstring = strG.substring(10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null && (intOrNull = StringsKt.toIntOrNull(strSubstring)) != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        if (jW + (((long) iIntValue) * 1000) > 0) {
            g.d().J("Cached response is stale for " + request.i() + " but less than max-stale, should warn");
            return k.ShouldWarn;
        }
        g.d().J("Cached response is stale for " + request.i() + ", should validate cached response");
        return k.ShouldValidate;
    }

    @NotNull
    public static final Map<String, String> g(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List<String> listQ = i1.q(cVar);
        if (listQ == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v0 v0VarO = cVar.h().j().O();
        for (String str : listQ) {
            String str2 = v0VarO.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
