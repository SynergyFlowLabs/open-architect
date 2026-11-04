package io.customer.sdk;

import androidx.annotation.l1;
import com.segment.analytics.kotlin.core.BaseEvent;
import io.customer.sdk.data.model.Settings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.p;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import kotlinx.serialization.d0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.m0;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCustomerIO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIO.kt\nio/customer/sdk/CustomerIO\n+ 2 EventBus.kt\nio/customer/sdk/communication/EventBusKt\n+ 3 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n*L\n1#1,519:1\n28#2:520\n28#2:521\n28#2:522\n268#3,6:523\n1#4:529\n111#5:530\n*S KotlinDebug\n*F\n+ 1 CustomerIO.kt\nio/customer/sdk/CustomerIO\n*L\n143#1:520\n146#1:521\n149#1:522\n205#1:523,6\n348#1:530\n*E\n"})
public final class g extends l implements hh.a<tg.a> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f288542m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f288543n = "DataPipelines";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private static volatile g f288544o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg.a f288545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.e f288547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f288548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.data.store.j f288549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.data.store.h f288550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.communication.b f288551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private io.customer.tracking.migration.b f288552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final b f288553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f288554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.a f288555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final io.customer.datapipelines.plugins.f f288556l;

    @SourceDebugExtension({"SMAP\nCustomerIO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIO.kt\nio/customer/sdk/CustomerIO$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1208#2,2:520\n1236#2,4:522\n216#3,2:526\n1#4:528\n*S KotlinDebug\n*F\n+ 1 CustomerIO.kt\nio/customer/sdk/CustomerIO$Companion\n*L\n469#1:520,2\n469#1:522,4\n471#1:526,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @rg.a
        private final synchronized g b(eh.a aVar, tg.a aVar2) {
            try {
                eh.d dVar = eh.d.f274883c;
                m mVarB = ug.a.b(dVar);
                g gVar = g.f288544o;
                if (gVar != null) {
                    mVarB.b();
                    return gVar;
                }
                Function1<tg.a, com.segment.analytics.kotlin.core.a> function1A = ug.a.a(dVar);
                g gVar2 = new g(aVar, aVar2, function1A != null ? function1A.invoke(aVar2) : null, null);
                a aVar3 = g.f288542m;
                g.f288544o = gVar2;
                return gVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @l1(otherwise = 3)
        @rg.a
        public final void a() {
            eh.d.f274883c.n();
            g.f288544o = null;
        }

        @oj.n
        public final void c(@NotNull i config) {
            Intrinsics.checkNotNullParameter(config, "config");
            eh.d dVar = eh.d.f274883c;
            eh.a aVarQ = dVar.q();
            Map<String, hh.a<? extends hh.b>> mapX = dVar.x();
            m mVarB = ug.a.b(dVar);
            dVar.w().d(config.C());
            mVarB.c();
            mapX.put(g.f288543n, b(aVarQ, new tg.a(config.y(), config.F(), config.s(), config.x(), config.z(), config.A(), config.B(), config.u(), config.H(), config.w(), config.v(), config.D(), config.G())));
            List<hh.a<? extends hh.b>> listE = config.E();
            LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listE, 10)), 16));
            for (Object obj : listE) {
                linkedHashMap.put(((hh.a) obj).getModuleName(), obj);
            }
            mapX.putAll(linkedHashMap);
            Iterator<Map.Entry<String, hh.a<? extends hh.b>>> it = mapX.entrySet().iterator();
            while (it.hasNext()) {
                hh.a<? extends hh.b> value = it.next().getValue();
                mVarB.k(value);
                value.initialize();
                mVarB.l(value);
            }
            mVarB.d();
        }

        @oj.n
        @NotNull
        public final g d() {
            g gVar = g.f288544o;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("CustomerIO is not initialized. CustomerIO.initialize() must be called before obtaining SDK instance.");
        }

        private a() {
        }
    }

    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ih.e f288557a = eh.d.f274883c.w();

        b() {
        }

        public void c(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            ih.e eVar = this.f288557a;
            String message = error.getMessage();
            if (message == null) {
                message = p.i(error);
            }
            ih.e.a.b(eVar, message, null, null, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public static final class c implements vf.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ih.e f288558a = eh.d.f274883c.w();

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f288559a;

            static {
                int[] iArr = new int[vf.b.values().length];
                try {
                    iArr[vf.b.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vf.b.WARNING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vf.b.DEBUG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f288559a = iArr;
            }
        }

        c() {
        }

        @Override // vf.d
        public void a(vf.c log) {
            Intrinsics.checkNotNullParameter(log, "log");
            String strH = log.h();
            int i10 = a.f288559a[log.g().ordinal()];
            if (i10 == 1) {
                ih.e.a.b(this.f288558a, strH, null, null, 6, null);
            } else if (i10 == 2) {
                ih.e.a.c(this.f288558a, strH, null, 2, null);
            } else {
                if (i10 != 3) {
                    throw new k0();
                }
                ih.e.a.a(this.f288558a, strH, null, 2, null);
            }
        }
    }

    public /* synthetic */ class d extends g0 implements Function2<io.customer.sdk.communication.a.g, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        public d(Object obj) {
            super(2, obj, Intrinsics.a.class, "suspendConversion0", "subscribe$suspendConversion0(Lkotlin/jvm/functions/Function1;Lio/customer/sdk/communication/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(io.customer.sdk.communication.a.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            return io.customer.sdk.communication.d.c((Function1) this.receiver, gVar, dVar);
        }
    }

    public /* synthetic */ class e extends g0 implements Function2<io.customer.sdk.communication.a.f, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        public e(Object obj) {
            super(2, obj, Intrinsics.a.class, "suspendConversion0", "subscribe$suspendConversion0(Lkotlin/jvm/functions/Function1;Lio/customer/sdk/communication/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(io.customer.sdk.communication.a.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
            return io.customer.sdk.communication.d.c((Function1) this.receiver, fVar, dVar);
        }
    }

    public /* synthetic */ class f extends g0 implements Function2<io.customer.sdk.communication.a.c, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        public f(Object obj) {
            super(2, obj, Intrinsics.a.class, "suspendConversion0", "subscribe$suspendConversion0(Lkotlin/jvm/functions/Function1;Lio/customer/sdk/communication/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(io.customer.sdk.communication.a.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return io.customer.sdk.communication.d.c((Function1) this.receiver, cVar, dVar);
        }
    }

    public /* synthetic */ g(eh.a aVar, tg.a aVar2, com.segment.analytics.kotlin.core.a aVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent V(String str, BaseEvent baseEvent) {
        if (baseEvent == null) {
            return null;
        }
        baseEvent.t(String.valueOf(str));
        return baseEvent;
    }

    private final void W(Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        ih.e.a.c(this.f288547c, "deleting device token", null, 2, null);
        String strN = this.f288556l.n();
        if (strN != null && !StringsKt.w3(strN)) {
            JsonObject jsonObjectB = com.segment.analytics.kotlin.core.l.b();
            com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
            m0(mh.a.f332664c, jsonObjectB, JsonObject.Companion.serializer(), function1);
            return;
        }
        ih.e.a.a(this.f288547c, "No device token found to delete.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent a0(String str, BaseEvent baseEvent) {
        if (baseEvent == null) {
            return null;
        }
        if (str != null) {
            baseEvent.t(str);
        }
        return baseEvent;
    }

    @oj.n
    public static final void b0(@NotNull i iVar) {
        f288542m.c(iVar);
    }

    @oj.n
    @NotNull
    public static final g c0() {
        return f288542m.d();
    }

    private final void d0() {
        String strJ = getModuleConfig().j();
        if (strJ != null && !StringsKt.w3(strJ)) {
            ih.e.a.c(this.f288547c, "Migration site id found, migrating data from previous version.", null, 2, null);
            this.f288552h = new io.customer.datapipelines.migration.f(this.f288555k, strJ);
        }
    }

    private final void e0() {
        String strG0 = this.f288555k.G0();
        if (strG0 != null) {
            this.f288551g.d(new io.customer.sdk.communication.a.b(strG0));
        }
    }

    @kotlin.l(message = "Use setDeviceAttributes() function instead")
    public static /* synthetic */ void g() {
    }

    @kotlin.l(message = "Use setProfileAttributes() function instead")
    public static /* synthetic */ void i() {
    }

    private final void i0() {
        this.f288551g.c(j1.d(io.customer.sdk.communication.a.g.class), new d(new Function1() { // from class: io.customer.sdk.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.j0(this.f288482a, (io.customer.sdk.communication.a.g) obj);
            }
        }));
        this.f288551g.c(j1.d(io.customer.sdk.communication.a.f.class), new e(new Function1() { // from class: io.customer.sdk.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.k0(this.f288483a, (io.customer.sdk.communication.a.f) obj);
            }
        }));
        this.f288551g.c(j1.d(io.customer.sdk.communication.a.c.class), new f(new Function1() { // from class: io.customer.sdk.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.l0(this.f288484a, (io.customer.sdk.communication.a.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(g gVar, io.customer.sdk.communication.a.g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.L(new kh.c.b(it.k(), it.i(), it.j()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(g gVar, io.customer.sdk.communication.a.f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.L(new kh.c.a(it.j(), it.i(), it.a()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(g gVar, io.customer.sdk.communication.a.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.s(it.g());
        return Unit.f312394a;
    }

    private final <T> void m0(String str, T t10, d0<? super T> d0Var, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        ih.e.a.a(this.f288547c, "track an event with name " + str + " and attributes " + t10, null, 2, null);
        this.f288555k.u0(str, t10, d0Var, function1);
    }

    private final void n0(String str, Map<String, ? extends Object> map) {
        if (str == null || StringsKt.w3(str)) {
            this.f288548d.j();
            return;
        }
        final String strN = this.f288556l.n();
        if (strN != null && !Intrinsics.areEqual(strN, str)) {
            this.f288548d.f();
            W(new Function1() { // from class: io.customer.sdk.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.p0(strN, (BaseEvent) obj);
                }
            });
        }
        if (getModuleConfig().d()) {
            map = MapsKt.plus(this.f288550f.h(), map);
        }
        this.f288556l.o(str);
        ih.e.a.c(this.f288547c, "updating device attributes: " + map, null, 2, null);
        H(mh.a.f332663b, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void o0(g gVar, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        gVar.n0(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent p0(String str, BaseEvent baseEvent) {
        if (baseEvent == null) {
            return null;
        }
        Json.Default.getSerializersModule();
        return com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", x.f333313b, str, b3.f315897a);
    }

    @Override // io.customer.sdk.l
    protected <T> void A(@NotNull String title, T t10, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        ih.e.a.a(this.f288547c, "track a screen with title " + title + ", properties " + t10, null, 2, null);
        this.f288551g.d(new io.customer.sdk.communication.a.e(title));
        com.segment.analytics.kotlin.core.a.l0(this.f288555k, title, t10, serializationStrategy, null, null, 24, null);
    }

    @Override // io.customer.sdk.l
    public void B(@NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        n0(j(), attributes);
    }

    @Override // io.customer.sdk.l
    public void C(@NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        String strK = k();
        if (strK != null) {
            o(strK, attributes);
            return;
        }
        ih.e.a.a(this.f288547c, "No user profile found, updating sanitized traits for anonymous user " + this.f288555k.m(), null, 2, null);
        this.f288555k.J(io.customer.datapipelines.extensions.c.c(attributes, null, 1, null), new e1(b3.f315897a, hk.a.v(m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class)))), null);
    }

    @Override // io.customer.sdk.l
    protected <T> void K(@NotNull String name, T t10, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        m0(name, t10, serializationStrategy, null);
    }

    @Override // io.customer.sdk.l
    protected void M(@NotNull kh.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ih.e.a.c(this.f288547c, io.customer.datapipelines.extensions.e.b(event) + " metric received for " + event.e6() + " event", null, 2, null);
        ih.e.a.a(this.f288547c, "tracking " + io.customer.datapipelines.extensions.e.b(event) + " metric event with properties " + event, null, 2, null);
        H(mh.a.f332665d, io.customer.datapipelines.extensions.e.a(event));
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.a X() {
        return this.f288555k;
    }

    @Nullable
    public final io.customer.tracking.migration.b Y() {
        return this.f288552h;
    }

    @Override // hh.a
    @NotNull
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public tg.a getModuleConfig() {
        return this.f288545a;
    }

    @Override // io.customer.sdk.l
    protected void b() {
        int i10 = 6 >> 0;
        ih.e.a.c(this.f288547c, "resetting user profile with id " + k(), null, 2, null);
        ih.e.a.a(this.f288547c, "deleting device token to remove device from user profile", null, 2, null);
        final String strK = k();
        W(new Function1() { // from class: io.customer.sdk.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.V(strK, (BaseEvent) obj);
            }
        });
        ih.e.a.a(this.f288547c, "resetting user profile", null, 2, null);
        this.f288551g.d(io.customer.sdk.communication.a.d.f288490d);
        this.f288555k.d0();
    }

    @Override // io.customer.sdk.l
    protected void d() {
        W(null);
    }

    @Override // io.customer.sdk.l
    @NotNull
    public String e() {
        return this.f288555k.m();
    }

    @Override // io.customer.sdk.l
    @NotNull
    public Map<String, Object> f() {
        return MapsKt.emptyMap();
    }

    @oj.i(name = "setDeviceAttributesDeprecated")
    public void f0(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        B(value);
    }

    public final void g0(@Nullable io.customer.tracking.migration.b bVar) {
        this.f288552h = bVar;
    }

    @Override // hh.a
    @NotNull
    public String getModuleName() {
        return this.f288546b;
    }

    @Override // io.customer.sdk.l
    @NotNull
    public Map<String, Object> h() {
        JsonObject jsonObjectB0 = this.f288555k.B0();
        return jsonObjectB0 != null ? jsonObjectB0 : MapsKt.emptyMap();
    }

    @oj.i(name = "setProfileAttributesDeprecated")
    public void h0(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C(value);
    }

    @Override // hh.a
    public void initialize() {
        ih.e.a.a(this.f288547c, "CustomerIO SDK initialized with DataPipelines module.", null, 2, null);
        d0();
        com.segment.analytics.kotlin.core.f fVarU = this.f288555k.u();
        this.f288549e.h(new Settings(fVarU.H(), fVarU.s()));
        if (getModuleConfig().c()) {
            this.f288555k.j(new io.customer.datapipelines.plugins.b());
        }
        if (getModuleConfig().l()) {
            this.f288555k.j(new io.customer.datapipelines.plugins.d());
        }
    }

    @Override // io.customer.sdk.l
    @Nullable
    public String j() {
        return this.f288549e.b();
    }

    @Override // io.customer.sdk.l
    @Nullable
    public String k() {
        return this.f288555k.G0();
    }

    @Override // io.customer.sdk.l
    protected <Traits> void r(@NotNull String userId, Traits traits, @NotNull d0<? super Traits> serializationStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        if (StringsKt.w3(userId)) {
            ih.e.a.a(this.f288547c, "Profile cannot be identified: Identifier is blank. Please retry with a valid, non-empty identifier.", null, 2, null);
            return;
        }
        final String strK = k();
        if (strK == null || StringsKt.w3(strK)) {
            strK = null;
        }
        boolean z10 = (strK == null || Intrinsics.areEqual(strK, userId)) ? false : true;
        boolean z11 = strK == null;
        if (z10) {
            ih.e.a.c(this.f288547c, "changing profile from id " + strK + " to " + userId, null, 2, null);
            if (j() != null) {
                this.f288548d.e();
                W(new Function1() { // from class: io.customer.sdk.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.a0(strK, (BaseEvent) obj);
                    }
                });
            }
        }
        ih.e.a.c(this.f288547c, "identify profile with identifier " + userId + " and traits " + traits, null, 2, null);
        this.f288551g.d(new io.customer.sdk.communication.a.b(userId));
        com.segment.analytics.kotlin.core.a.U(this.f288555k, userId, traits, serializationStrategy, null, 8, null);
        if (z11 || z10) {
            ih.e.a.a(this.f288547c, "first time identified or changing identified profile", null, 2, null);
            String strJ = j();
            if (strJ != null) {
                this.f288548d.a(strJ, userId);
                o0(this, strJ, null, 2, null);
            }
        }
    }

    @Override // io.customer.sdk.l
    protected void t(@NotNull String deviceToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        if (StringsKt.w3(deviceToken)) {
            this.f288548d.h();
            return;
        }
        this.f288548d.i(deviceToken, k());
        this.f288549e.d(deviceToken);
        this.f288548d.g(deviceToken, k());
        o0(this, deviceToken, null, 2, null);
    }

    /* synthetic */ g(eh.a aVar, tg.a aVar2, com.segment.analytics.kotlin.core.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i10 & 4) != 0 ? null : aVar3);
    }

    private g(eh.a aVar, tg.a aVar2, com.segment.analytics.kotlin.core.a aVar3) {
        this.f288545a = aVar2;
        this.f288546b = f288543n;
        eh.d dVar = eh.d.f274883c;
        ih.e eVarW = dVar.w();
        this.f288547c = eVarW;
        this.f288548d = ug.a.b(dVar);
        this.f288549e = aVar.w();
        io.customer.sdk.data.store.h hVarV = aVar.v();
        this.f288550f = hVarV;
        this.f288551g = dVar.v();
        b bVar = new b();
        this.f288553i = bVar;
        c cVar = new c();
        this.f288554j = cVar;
        aVar3 = aVar3 == null ? tf.a.b(getModuleConfig().f(), aVar.r(), io.customer.datapipelines.extensions.b.b(getModuleConfig(), bVar)) : aVar3;
        this.f288555k = aVar3;
        io.customer.datapipelines.plugins.f fVar = new io.customer.datapipelines.plugins.f(hVarV, null, 2, null);
        this.f288556l = fVar;
        com.segment.analytics.kotlin.core.a.b bVar2 = com.segment.analytics.kotlin.core.a.Companion;
        bVar2.c(eVarW.b() == ih.a.DEBUG);
        bVar2.d(cVar);
        aVar3.j(fVar);
        if (getModuleConfig().b()) {
            aVar3.j(new io.customer.datapipelines.plugins.h());
        }
        if (getModuleConfig().d()) {
            aVar3.j(new io.customer.datapipelines.plugins.a());
        }
        aVar3.j(new io.customer.datapipelines.plugins.l(getModuleConfig().k()));
        i0();
        e0();
    }
}
