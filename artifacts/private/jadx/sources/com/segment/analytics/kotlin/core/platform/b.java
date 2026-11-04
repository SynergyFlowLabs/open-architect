package com.segment.analytics.kotlin.core.platform;

import androidx.core.app.w;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.i;
import com.segment.analytics.kotlin.core.l;
import com.segment.analytics.kotlin.core.m;
import com.segment.analytics.kotlin.core.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n211#2:215\n540#3:216\n525#3,6:217\n113#4:223\n1855#5,2:224\n1855#5,2:226\n1#6:228\n*S KotlinDebug\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline\n*L\n93#1:215\n94#1:216\n94#1:217,6\n99#1:223\n166#1:224,2\n170#1:226,2\n*E\n"})
public class b {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f266845i = "#!flush";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final ScreenEvent f266846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f266847k = "#!upload";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.a f266848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.segment.analytics.kotlin.core.platform.policies.b> f266850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f266851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private p<BaseEvent> f266852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private p<String> f266853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m f266854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f266855h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScreenEvent a() {
            return b.f266846j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.platform.b$b, reason: collision with other inner class name */
    public static final class C1865b extends Thread {
        C1865b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.v();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.EventPipeline$upload$1", f = "EventPipeline.kt", i = {0, 1}, l = {222, 130}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
    @SourceDebugExtension({"SMAP\nEventPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline$upload$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,214:1\n105#2:215\n82#2,6:216\n106#2,2:222\n92#2:224\n88#2,3:225\n*S KotlinDebug\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline$upload$1\n*L\n128#1:215\n128#1:216,6\n128#1:222,2\n128#1:224\n128#1:225,3\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f266859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266860d;

        @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.EventPipeline$upload$1$1$1", f = "EventPipeline.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f266862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f266863b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f266863b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f266863b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f266862a;
                int i11 = 6 | 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s sVarO = this.f266863b.o();
                    this.f266862a = 1;
                    if (sVarO.e(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006c  */
        /* JADX WARN: Code duplicated, block: B:21:0x006d  */
        /* JADX WARN: Code duplicated, block: B:24:0x007b A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:7:0x0021, B:27:0x00ba, B:28:0x00cf, B:18:0x005a, B:22:0x0072, B:24:0x007b, B:43:0x0153, B:30:0x00d6, B:33:0x00e9, B:35:0x00fc, B:38:0x0118, B:42:0x014a, B:40:0x013d, B:14:0x0045, B:17:0x0056), top: B:51:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0153 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:7:0x0021, B:27:0x00ba, B:28:0x00cf, B:18:0x005a, B:22:0x0072, B:24:0x007b, B:43:0x0153, B:30:0x00d6, B:33:0x00e9, B:35:0x00fc, B:38:0x0118, B:42:0x014a, B:40:0x013d, B:14:0x0045, B:17:0x0056), top: B:51:0x000d, inners: #1 }] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
        
            if (kotlinx.coroutines.i.h(r15, r7, r14) == r0) goto L26;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x007b, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b7 -> B:8:0x0024). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 353
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.platform.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.EventPipeline$write$1", f = "EventPipeline.kt", i = {1, 1}, l = {104, 110}, m = "invokeSuspend", n = {w.I0, "isPoison"}, s = {"L$1", "Z$0"})
    @SourceDebugExtension({"SMAP\nEventPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline$write$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1855#2,2:215\n1747#2,3:217\n1855#2,2:220\n*S KotlinDebug\n*F\n+ 1 EventPipeline.kt\ncom/segment/analytics/kotlin/core/platform/EventPipeline$write$1\n*L\n112#1:215,2\n120#1:217,3\n122#1:220,2\n*E\n"})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f266866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266867d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new d(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0132  */
        /* JADX WARN: Code duplicated, block: B:48:0x0161 A[LOOP:2: B:46:0x0159->B:48:0x0161, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:54:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0140 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:1: B:41:0x012b->B:56:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:31:0x00df). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:26:0x00bf). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.platform.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        ScreenEvent screenEvent = new ScreenEvent(f266845i, f266845i, l.b());
        screenEvent.q(f266845i);
        f266846j = screenEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull com.segment.analytics.kotlin.core.a analytics, @NotNull String logTag, @NotNull String apiKey, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, @NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f266848a = analytics;
        this.f266849b = logTag;
        this.f266850c = flushPolicies;
        this.f266851d = apiHost;
        this.f266854g = new m(apiKey, analytics.u().C());
        this.f266855h = false;
        this.f266852e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        this.f266853f = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(Exception exc, String str) {
        if (!(exc instanceof com.segment.analytics.kotlin.core.o)) {
            vf.f.a(com.segment.analytics.kotlin.core.a.Companion, StringsKt.r("\n                    | Error uploading events from batch file\n                    | fileUrl=\"" + str + "\"\n                    | msg=" + exc.getMessage() + "\n                ", null, 1, null), vf.b.ERROR);
            return false;
        }
        vf.e.c(this.f266848a, this.f266849b + " exception while uploading, " + exc.getMessage(), null, 2, null);
        com.segment.analytics.kotlin.core.o oVar = (com.segment.analytics.kotlin.core.o) exc;
        if (!oVar.e() || oVar.b() == 429) {
            vf.f.a(com.segment.analytics.kotlin.core.a.Companion, "Error while uploading payloads", vf.b.ERROR);
            return false;
        }
        vf.f.a(com.segment.analytics.kotlin.core.a.Companion, "Payloads were rejected by server. Marked for removal.", vf.b.ERROR);
        return true;
    }

    private final void r() {
        Runtime.getRuntime().addShutdownHook(new C1865b());
    }

    private final void s() {
        Iterator<T> it = this.f266850c.iterator();
        while (it.hasNext()) {
            ((com.segment.analytics.kotlin.core.platform.policies.b) it.next()).b(this.f266848a);
        }
    }

    private final void x() {
        Iterator<T> it = this.f266850c.iterator();
        while (it.hasNext()) {
            ((com.segment.analytics.kotlin.core.platform.policies.b) it.next()).d();
        }
    }

    private final p2 y() {
        return k.f(n(), l(), null, new c(null), 2, null);
    }

    private final p2 z() {
        return k.f(n(), j(), null, new d(null), 2, null);
    }

    public final void h() {
        this.f266852e.p(f266846j);
    }

    @NotNull
    public final String i() {
        return this.f266851d;
    }

    @NotNull
    protected n0 j() {
        return this.f266848a.e();
    }

    @NotNull
    protected m k() {
        return this.f266854g;
    }

    @NotNull
    protected n0 l() {
        return this.f266848a.b();
    }

    public final boolean m() {
        return this.f266855h;
    }

    @NotNull
    protected s0 n() {
        return this.f266848a.c();
    }

    @NotNull
    protected s o() {
        return this.f266848a.w();
    }

    public final void q(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f266852e.p(event);
    }

    public final void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266851d = str;
    }

    public final void u() {
        if (this.f266855h) {
            return;
        }
        this.f266855h = true;
        if (this.f266852e.B() || this.f266852e.C()) {
            this.f266852e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
            this.f266853f = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        }
        s();
        z();
        y();
    }

    public final void v() {
        if (this.f266855h) {
            this.f266855h = false;
            kotlinx.coroutines.channels.n0.a.b(this.f266853f, null, 1, null);
            kotlinx.coroutines.channels.n0.a.b(this.f266852e, null, 1, null);
            x();
        }
    }

    @NotNull
    public String w(@NotNull BaseEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Json jsonC = com.segment.analytics.kotlin.core.utilities.o.c();
        jsonC.getSerializersModule();
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonC.encodeToJsonElement(BaseEvent.Companion.serializer(), payload));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!Intrinsics.areEqual(key, "userId") || !StringsKt.w3(JsonElementKt.getJsonPrimitive(value).getContent())) {
                if (!Intrinsics.areEqual(key, "traits") || !Intrinsics.areEqual(value, l.b())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Json.Default r10 = Json.Default;
        r10.getSerializersModule();
        return r10.encodeToString(new e1(b3.f315897a, JsonElementSerializer.INSTANCE), linkedHashMap);
    }

    public /* synthetic */ b(com.segment.analytics.kotlin.core.a aVar, String str, String str2, List list, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, str2, list, (i10 & 16) != 0 ? i.f266827c : str3);
    }
}
