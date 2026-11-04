package io.ktor.client.engine.android;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fi.d0;
import fi.f0;
import fi.i0;
import fi.z;
import io.ktor.client.engine.v;
import io.ktor.client.plugins.e1;
import io.ktor.client.plugins.sse.h0;
import io.ktor.http.content.w;
import io.ktor.http.content.x;
import io.ktor.http.d1;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.http.x0;
import io.ktor.util.date.GMTDate;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAndroidClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1#2:142\n480#3:143\n426#3:144\n538#3:149\n523#3,6:150\n1252#4,4:145\n*S KotlinDebug\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine\n*L\n92#1:143\n92#1:144\n93#1:149\n93#1:150,6\n92#1:145,4\n*E\n"})
public final class d extends io.ktor.client.engine.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f294293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Set<io.ktor.client.engine.h<?>> f294294f;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", i = {0, 1, 1, 1, 1}, l = {37, com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.B0}, m = "execute", n = {"data", "data", "callContext", "requestTime", "outgoingContent"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f294299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f294300f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f294302h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294300f = obj;
            this.f294302h |= Integer.MIN_VALUE;
            int i10 = 2 ^ 0;
            return d.this.wb(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull h config) {
        super("ktor-android");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f294293e = config;
        this.f294294f = SetsKt.setOf((Object[]) new io.ktor.client.engine.h[]{e1.f294787a, h0.f295070a});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(HttpURLConnection httpURLConnection, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        httpURLConnection.addRequestProperty(key, value);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public static final f0 q(CoroutineContext coroutineContext, z zVar, w wVar, GMTDate gMTDate, HttpURLConnection current) throws IOException {
        Object obj;
        Object objA;
        String lowerCase;
        Intrinsics.checkNotNullParameter(current, "current");
        int responseCode = current.getResponseCode();
        String responseMessage = current.getResponseMessage();
        l1 l1Var = responseMessage != null ? new l1(responseCode, responseMessage) : l1.f295939c.a(responseCode);
        io.ktor.utils.io.h hVarA = i.a(current, responseCode, coroutineContext);
        Map<String, List<String>> headerFields = current.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
        Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (str != null) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                lowerCase = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    lowerCase = "";
                }
            } else {
                lowerCase = "";
            }
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!StringsKt.w3((CharSequence) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        k1 k1VarC = k1.f295916d.c();
        x0 x0Var = new x0(linkedHashMap2);
        i0 i0Var = (i0) zVar.a().e(d0.c());
        if (i0Var == null || (objA = i0Var.a(zVar, l1Var, x0Var, hVarA, wVar, coroutineContext)) == null) {
            l1Var = l1Var;
            obj = hVarA;
        } else {
            l1Var = l1Var;
            obj = objA;
        }
        return new f0(l1Var, gMTDate, x0Var, k1VarC, obj, coroutineContext);
    }

    private final HttpURLConnection t(String str) {
        URLConnection uRLConnection;
        URL url = new URL(str);
        Proxy proxyC = getConfig().c();
        if (proxyC == null || (uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxyC))) == null) {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNullExpressionValue(uRLConnection, "openConnection(...)");
        }
        return (HttpURLConnection) uRLConnection;
    }

    @Override // io.ktor.client.engine.f, io.ktor.client.engine.b
    @NotNull
    public Set<io.ktor.client.engine.h<?>> l6() {
        return this.f294294f;
    }

    @Override // io.ktor.client.engine.b
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public h getConfig() {
        return this.f294293e;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x019b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.ktor.client.engine.b
    @Nullable
    public Object wb(@NotNull z zVar, @NotNull kotlin.coroutines.d<? super f0> dVar) throws IOException {
        a aVar;
        final z zVar2;
        Object objE;
        final CoroutineContext coroutineContext;
        final GMTDate gMTDateC;
        final w wVarB;
        final HttpURLConnection httpURLConnectionT;
        CoroutineContext coroutineContext2;
        GMTDate gMTDate;
        HttpURLConnection httpURLConnection;
        w wVar;
        z zVar3;
        Object objE2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294302h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294302h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f294300f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294302h;
        if (i11 == 0) {
            ResultKt.m(obj);
            zVar2 = zVar;
            aVar.f294295a = zVar2;
            aVar.f294302h = 1;
            objE = v.e(aVar);
            if (objE != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            z zVar4 = (z) aVar.f294295a;
            ResultKt.m(obj);
            objE = obj;
            zVar2 = zVar4;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            httpURLConnection = (HttpURLConnection) aVar.f294299e;
            wVar = (w) aVar.f294298d;
            gMTDate = (GMTDate) aVar.f294297c;
            coroutineContext2 = (CoroutineContext) aVar.f294296b;
            zVar3 = (z) aVar.f294295a;
            ResultKt.m(obj);
        }
        httpURLConnectionT = httpURLConnection;
        wVarB = wVar;
        coroutineContext = coroutineContext2;
        zVar2 = zVar3;
        gMTDateC = gMTDate;
        Function1 function1 = new Function1() { // from class: io.ktor.client.engine.android.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d.q(coroutineContext, zVar2, wVarB, gMTDateC, (HttpURLConnection) obj2);
            }
        };
        aVar.f294295a = null;
        aVar.f294296b = null;
        aVar.f294297c = null;
        aVar.f294298d = null;
        aVar.f294299e = null;
        aVar.f294302h = 3;
        objE2 = i.e(httpURLConnectionT, zVar2, function1, aVar);
        if (objE2 == objL) {
            return objL;
        }
        return objE2;
        coroutineContext = (CoroutineContext) objE;
        gMTDateC = ni.a.c(null, 1, null);
        String string = zVar2.h().toString();
        wVarB = zVar2.b();
        v0 v0VarE = zVar2.e();
        d1 d1Var = d1.f295782a;
        String str = v0VarE.get(d1Var.z());
        Long lG = str != null ? kotlin.coroutines.jvm.internal.b.g(Long.parseLong(str)) : wVarB.a();
        httpURLConnectionT = t(string);
        httpURLConnectionT.setConnectTimeout(getConfig().l());
        httpURLConnectionT.setReadTimeout(getConfig().n());
        i.d(httpURLConnectionT, zVar2);
        if (httpURLConnectionT instanceof HttpsURLConnection) {
            getConfig().o().invoke(httpURLConnectionT);
        }
        httpURLConnectionT.setRequestMethod(zVar2.f().l());
        httpURLConnectionT.setUseCaches(false);
        httpURLConnectionT.setInstanceFollowRedirects(false);
        v.h(zVar2.e(), wVarB, new Function2() { // from class: io.ktor.client.engine.android.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return d.o(httpURLConnectionT, (String) obj2, (String) obj3);
            }
        });
        getConfig().m().invoke(httpURLConnectionT);
        if (e.f294303a.contains(zVar2.f())) {
            if (!x.a(wVarB)) {
                throw new IllegalStateException(("Request of type " + zVar2.f() + " couldn't send a body with the [Android] engine.").toString());
            }
            Function1 function2 = new Function1() { // from class: io.ktor.client.engine.android.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d.q(coroutineContext, zVar2, wVarB, gMTDateC, (HttpURLConnection) obj2);
                }
            };
            aVar.f294295a = null;
            aVar.f294296b = null;
            aVar.f294297c = null;
            aVar.f294298d = null;
            aVar.f294299e = null;
            aVar.f294302h = 3;
            objE2 = i.e(httpURLConnectionT, zVar2, function2, aVar);
            if (objE2 == objL) {
                return objE2;
            }
        } else {
            if (lG == null && httpURLConnectionT.getRequestProperty(d1Var.G0()) == null) {
                httpURLConnectionT.addRequestProperty(d1Var.G0(), "chunked");
            }
            if (lG != null) {
                httpURLConnectionT.setFixedLengthStreamingMode(lG.longValue());
            } else {
                httpURLConnectionT.setChunkedStreamingMode(0);
            }
            httpURLConnectionT.setDoOutput(true);
            OutputStream outputStream = httpURLConnectionT.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
            aVar.f294295a = zVar2;
            aVar.f294296b = coroutineContext;
            aVar.f294297c = gMTDateC;
            aVar.f294298d = wVarB;
            aVar.f294299e = httpURLConnectionT;
            aVar.f294302h = 2;
            if (e.b(wVarB, outputStream, coroutineContext, aVar) != objL) {
                coroutineContext2 = coroutineContext;
                gMTDate = gMTDateC;
                httpURLConnection = httpURLConnectionT;
                wVar = wVarB;
                zVar3 = zVar2;
                httpURLConnectionT = httpURLConnection;
                wVarB = wVar;
                coroutineContext = coroutineContext2;
                zVar2 = zVar3;
                gMTDateC = gMTDate;
                Function1 function3 = new Function1() { // from class: io.ktor.client.engine.android.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return d.q(coroutineContext, zVar2, wVarB, gMTDateC, (HttpURLConnection) obj2);
                    }
                };
                aVar.f294295a = null;
                aVar.f294296b = null;
                aVar.f294297c = null;
                aVar.f294298d = null;
                aVar.f294299e = null;
                aVar.f294302h = 3;
                objE2 = i.e(httpURLConnectionT, zVar2, function3, aVar);
                if (objE2 == objL) {
                    return objE2;
                }
            }
        }
        return objL;
    }
}
