package com.segment.analytics.kotlin.core;

import androidx.media2.session.SessionCommand;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTelemetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Telemetry.kt\ncom/segment/analytics/kotlin/core/Telemetry\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,364:1\n467#2,7:365\n113#3:372\n1#4:373\n48#5,4:374\n*S KotlinDebug\n*F\n+ 1 Telemetry.kt\ncom/segment/analytics/kotlin/core/Telemetry\n*L\n212#1:365,7\n264#1:372\n99#1:374,4\n*E\n"})
public final class w implements sovran.kotlin.g {

    @NotNull
    private static s0 H1 = null;
    private static int X = 0;
    private static boolean Y = false;
    private static long Z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f267063b = "analytics_mobile";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f267064c = "analytics_mobile.invoke";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f267065d = "analytics_mobile.invoke.error";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f267066e = "analytics_mobile.integration.invoke";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f267067f = "analytics_mobile.integration.invoke.error";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private static p2 f267069g3 = null;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final f0 f267071h3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f267076m = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final o0 f267080p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static z1 f267081p2 = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f267062a = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f267068g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static String f267070h = i.f266827c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static double f267072i = 1.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f267073j = SessionCommand.X;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static m f267074k = new m("", new p());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f267075l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private static Function1<? super Throwable, Unit> f267077n = b.f267087a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f267078o = 20;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f267082s = 4000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f267083t = 28000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f267084v = f267083t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final ConcurrentLinkedQueue<RemoteMetric> f267085w = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static boolean f267079p0 = true;

    static final class a extends l0 implements Function0<Map<String, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f267086a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke() {
            String osVersion = System.getProperty("os.version");
            Regex regex = new Regex("android[0-9][0-9]");
            Intrinsics.checkNotNullExpressionValue(osVersion, "osVersion");
            MatchResult matchResultD = Regex.d(regex, osVersion, 0, 2, null);
            if (matchResultD != null) {
                osVersion = matchResultD.getValue();
            } else {
                Regex regex2 = new Regex("[0-9]+");
                Intrinsics.checkNotNullExpressionValue(osVersion, "osVersion");
                MatchResult matchResultD2 = Regex.d(regex2, osVersion, 0, 2, null);
                if (matchResultD2 != null) {
                    osVersion = matchResultD2.getValue();
                }
            }
            return MapsKt.mapOf(TuplesKt.to("os", System.getProperty("os.name") + org.apache.commons.codec.language.l.f335457d + osVersion), TuplesKt.to("interpreter", System.getProperty("java.vendor") + org.apache.commons.codec.language.l.f335457d + System.getProperty("java.version")), TuplesKt.to(com.segment.analytics.kotlin.core.platform.plugins.a.f266897e, "analytics.kotlin"), TuplesKt.to("library_version", "1.19.2"));
        }
    }

    /* synthetic */ class b extends g0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f267087a = new b();

        b() {
            super(1, x.class, "logError", "logError(Ljava/lang/Throwable;)V", 1);
        }

        public final void X(@NotNull Throwable p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            x.a(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            X(th2);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Telemetry.kt\ncom/segment/analytics/kotlin/core/Telemetry\n*L\n1#1,110:1\n100#2,7:111\n*E\n"})
    public static final class c extends kotlin.coroutines.a implements o0 {
        public c(o0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            Function1<Throwable, Unit> function1J = w.f267062a.j();
            if (function1J != null) {
                function1J.invoke(new Exception("Caught Exception in Telemetry Scope: " + th2.getMessage(), th2));
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Telemetry$start$1", f = "Telemetry.kt", i = {0}, l = {136}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nTelemetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Telemetry.kt\ncom/segment/analytics/kotlin/core/Telemetry$start$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f267088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f267089b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f267089b = obj;
            return dVar2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x006a
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 3
                int r1 = r6.f267088a
                r2 = 1
                r5 = 6
                if (r1 == 0) goto L23
                r5 = 5
                if (r1 != r2) goto L18
                java.lang.Object r1 = r6.f267089b
                r5 = 2
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r7)     // Catch: java.util.concurrent.CancellationException -> L6a
                r5 = 1
                goto L2c
            L18:
                r5 = 6
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "u/sttrlueein/fm/ /bwkoistee/re/ino  r/o oaochvcle  "
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                r5 = 5
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f267089b
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                r1 = r7
            L2c:
                boolean r7 = kotlinx.coroutines.t0.k(r1)
                r5 = 6
                if (r7 == 0) goto L70
                com.segment.analytics.kotlin.core.w r7 = com.segment.analytics.kotlin.core.w.f267062a
                boolean r3 = r7.i()
                if (r3 != 0) goto L43
                r6 = 4
                r6 = 0
                com.segment.analytics.kotlin.core.w.a(r6)
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L43:
                r7.g()     // Catch: java.lang.Throwable -> L48
                r5 = 2
                goto L56
            L48:
                r7 = move-exception
                com.segment.analytics.kotlin.core.w r3 = com.segment.analytics.kotlin.core.w.f267062a
                r5 = 0
                kotlin.jvm.functions.Function1 r3 = r3.j()
                if (r3 == 0) goto L56
                r5 = 0
                r3.invoke(r7)
            L56:
                com.segment.analytics.kotlin.core.w r7 = com.segment.analytics.kotlin.core.w.f267062a     // Catch: java.util.concurrent.CancellationException -> L6a
                int r7 = r7.l()     // Catch: java.util.concurrent.CancellationException -> L6a
                r5 = 6
                long r3 = (long) r7     // Catch: java.util.concurrent.CancellationException -> L6a
                r5 = 5
                r6.f267089b = r1     // Catch: java.util.concurrent.CancellationException -> L6a
                r6.f267088a = r2     // Catch: java.util.concurrent.CancellationException -> L6a
                java.lang.Object r7 = kotlinx.coroutines.d1.b(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L6a
                if (r7 != r0) goto L2c
                return r0
            L6a:
                com.segment.analytics.kotlin.core.w r7 = com.segment.analytics.kotlin.core.w.f267062a
                r7.g()
                goto L2c
            L70:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.w.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class e extends g0 implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        e(Object obj) {
            super(2, obj, w.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull v vVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) this.receiver).K(vVar, dVar);
        }
    }

    static {
        c cVar = new c(o0.L2);
        f267080p1 = cVar;
        H1 = t0.a(q3.c(null, 1, null).plus(cVar));
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        f267081p2 = b2.d(executorServiceNewSingleThreadExecutor);
        f267071h3 = kotlin.g0.c(a.f267086a);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K(v vVar, kotlin.coroutines.d<? super Unit> dVar) {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        Settings settingsL = vVar.l();
        if (settingsL != null && (jsonElement = (JsonElement) settingsL.n().get("sampleRate")) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
            f267072i = JsonElementKt.getDouble(jsonPrimitive);
            f267062a.I();
        }
        return Unit.f312394a;
    }

    private final void c(String str, Map<String, String> map, int i10, String str2) {
        Object next;
        Map mapPlus = MapsKt.plus(map, h());
        Iterator<T> it = f267085w.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RemoteMetric remoteMetric = (RemoteMetric) next;
            if (Intrinsics.areEqual(remoteMetric.i(), str) && Intrinsics.areEqual(remoteMetric.j(), mapPlus)) {
                break;
            }
        }
        RemoteMetric remoteMetric2 = (RemoteMetric) next;
        if (remoteMetric2 != null) {
            remoteMetric2.m(remoteMetric2.l() + i10);
            return;
        }
        ConcurrentLinkedQueue<RemoteMetric> concurrentLinkedQueue = f267085w;
        if (concurrentLinkedQueue.size() >= f267078o) {
            return;
        }
        RemoteMetric remoteMetric3 = new RemoteMetric("Counter", str, i10, mapPlus, str2 != null ? MapsKt.mapOf(TuplesKt.to("timestamp", com.segment.analytics.kotlin.core.utilities.r.Companion.b()), TuplesKt.to("trace", str2)) : null);
        byte[] bytes = remoteMetric3.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        if (X + length <= f267084v) {
            concurrentLinkedQueue.add(remoteMetric3);
            X += length;
        }
    }

    static /* synthetic */ void d(w wVar, String str, Map map, int i10, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        wVar.c(str, map, i10, str2);
    }

    private final Map<String, String> h() {
        return (Map) f267071h3.getValue();
    }

    private final void v() {
        f267085w.clear();
        int i10 = 4 ^ 0;
        X = 0;
    }

    private final void w() {
        String str;
        if (f267072i == 0.0d) {
            return;
        }
        int size = f267085w.size();
        X = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                break;
            }
            ConcurrentLinkedQueue<RemoteMetric> concurrentLinkedQueue = f267085w;
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
            RemoteMetric remoteMetricPoll = concurrentLinkedQueue.poll();
            if (remoteMetricPoll != null) {
                remoteMetricPoll.m(kotlin.math.b.K0(((double) remoteMetricPoll.l()) / f267072i));
                arrayList.add(remoteMetricPoll);
            }
            size = i10;
        }
        Long lC1 = null;
        try {
            Json.Default r10 = Json.Default;
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("series", arrayList));
            r10.getSerializersModule();
            String strEncodeToString = r10.encodeToString(new e1(b3.f315897a, new kotlinx.serialization.internal.f(RemoteMetric$$serializer.INSTANCE)), mapMapOf);
            h hVarD = f267074k.d(f267070h);
            OutputStream outputStreamC = hVarD.c();
            if (outputStreamC != null) {
                try {
                    byte[] bytes = strEncodeToString.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStreamC.write(bytes);
                    outputStreamC.flush();
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(outputStreamC, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(outputStreamC, th2);
                        throw th3;
                    }
                }
            }
            InputStream inputStreamB = hVarD.b();
            if (inputStreamB != null) {
                inputStreamB.close();
            }
            OutputStream outputStreamC2 = hVarD.c();
            if (outputStreamC2 != null) {
                outputStreamC2.close();
            }
            hVarD.close();
        } catch (o e10) {
            Function1<? super Throwable, Unit> function1 = f267077n;
            if (function1 != null) {
                function1.invoke(e10);
            }
            if (e10.b() == 429) {
                List<String> list = e10.c().get(com.google.common.net.d.B0);
                if (list != null && (str = (String) CollectionsKt.firstOrNull((List) list)) != null) {
                    lC1 = StringsKt.c1(str);
                }
                if (lC1 != null) {
                    Z = lC1.longValue() + (System.currentTimeMillis() / ((long) 1000));
                }
            }
        } catch (Exception e11) {
            Function1<? super Throwable, Unit> function2 = f267077n;
            if (function2 != null) {
                function2.invoke(e11);
            }
        }
    }

    public final void A(int i10) {
        f267073j = i10;
    }

    public final void B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f267070h = str;
    }

    public final void C(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        f267074k = mVar;
    }

    public final void D(int i10) {
        f267084v = Math.min(i10, f267083t);
    }

    public final void E(int i10) {
        f267078o = i10;
    }

    public final void F(double d10) {
        f267072i = d10;
    }

    public final void G(boolean z10) {
        f267076m = z10;
    }

    public final void H(boolean z10) {
        f267075l = z10;
    }

    public final void I() {
        if (f267068g && !Y && f267072i != 0.0d) {
            Y = true;
            if (Math.random() > f267072i) {
                v();
            }
            f267069g3 = kotlinx.coroutines.k.f(H1, f267081p2, null, new d(null), 2, null);
        }
    }

    @Nullable
    public final Object J(@NotNull sovran.kotlin.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objR = eVar.r(this, j1.d(v.class), true, f267081p2, new e(this), dVar);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }

    @NotNull
    public final String e(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Regex("^[a-z][a-z0-9]\\.[a-z]:").replace(new Regex("[0-9a-fA-F]{6,}").replace(new Regex("0x[0-9a-fA-F]+").replace(new Regex("[0-9a-fA-F]{2,4}(:[0-9a-fA-F]{0,4}){2,8}[\\d._:port]*").replace(new Regex("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}[\\d._:port]*").replace(value, "_IP"), "_IP"), "0x00"), "0x00"), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public final void f(@NotNull String metric, @NotNull String log, @NotNull Function1<? super Map<String, String>, Unit> buildTags) {
        ?? linkedHashMap;
        String str;
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(buildTags, "buildTags");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        buildTags.invoke(linkedHashMap2);
        if (!f267068g || f267072i == 0.0d || !StringsKt.u2(metric, f267063b, false, 2, null) || linkedHashMap2.isEmpty() || Math.random() > f267072i) {
            return;
        }
        if (linkedHashMap2.containsKey("error")) {
            Object obj = linkedHashMap2.get("error");
            Intrinsics.checkNotNull(obj);
            linkedHashMap2.put("error", e((String) obj));
        }
        if (f267075l) {
            linkedHashMap = MapsKt.toMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!Intrinsics.areEqual(lowerCase, "writekey")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        ?? r10 = linkedHashMap;
        if (f267076m) {
            int length = log.length();
            int i10 = f267082s;
            if (length > i10) {
                log = log.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(log, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = log;
        } else {
            str = null;
        }
        d(this, metric, r10, 0, str, 4, null);
        if (f267079p0) {
            f267079p0 = false;
            g();
        }
    }

    public final synchronized void g() {
        try {
            if (f267068g && !f267085w.isEmpty()) {
                if (Z > ((int) (System.currentTimeMillis() / ((long) 1000)))) {
                    return;
                }
                Z = 0L;
                try {
                    w();
                    X = 0;
                } catch (Throwable th2) {
                    Function1<? super Throwable, Unit> function1 = f267077n;
                    if (function1 != null) {
                        function1.invoke(th2);
                    }
                    f267072i = 0.0d;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final boolean i() {
        return f267068g;
    }

    @Nullable
    public final Function1<Throwable, Unit> j() {
        return f267077n;
    }

    public final int k() {
        return f267082s;
    }

    public final int l() {
        return f267073j;
    }

    @NotNull
    public final String m() {
        return f267070h;
    }

    @NotNull
    public final m n() {
        return f267074k;
    }

    public final int o() {
        return f267084v;
    }

    public final int p() {
        return f267078o;
    }

    public final double q() {
        return f267072i;
    }

    public final boolean r() {
        return f267076m;
    }

    public final boolean s() {
        return f267075l;
    }

    public final void t(@NotNull String metric, @NotNull Function1<? super Map<String, String>, Unit> buildTags) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(buildTags, "buildTags");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        buildTags.invoke(linkedHashMap);
        if (!f267068g || f267072i == 0.0d || !StringsKt.u2(metric, f267063b, false, 2, null) || linkedHashMap.isEmpty() || Math.random() > f267072i) {
            return;
        }
        d(this, metric, linkedHashMap, 0, null, 12, null);
    }

    public final void u() {
        p2 p2Var = f267069g3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        v();
        Y = false;
        Z = 0L;
    }

    public final void x(boolean z10) {
        f267068g = z10;
        if (z10) {
            I();
        }
    }

    public final void y(@Nullable Function1<? super Throwable, Unit> function1) {
        f267077n = function1;
    }

    public final void z(int i10) {
        f267082s = i10;
    }
}
