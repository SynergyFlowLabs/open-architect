package io.customer.datapipelines.plugins;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.v;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.n;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCustomerIODestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIODestination.kt\nio/customer/datapipelines/plugins/CustomerIODestination\n+ 2 Settings.kt\ncom/segment/analytics/kotlin/core/Settings\n*L\n1#1,140:1\n27#2,7:141\n*S KotlinDebug\n*F\n+ 1 CustomerIODestination.kt\nio/customer/datapipelines/plugins/CustomerIODestination\n*L\n118#1:141,7\n*E\n"})
public final class h extends com.segment.analytics.kotlin.core.platform.a implements com.segment.analytics.kotlin.core.platform.h, sovran.kotlin.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.segment.analytics.kotlin.core.platform.b f288334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<? extends com.segment.analytics.kotlin.core.platform.policies.b> f288335f = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f288336g = i.f288340a;

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.datapipelines.plugins.CustomerIODestination$setup$2$1", f = "CustomerIODestination.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f288338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f288339c;

        /* JADX INFO: renamed from: io.customer.datapipelines.plugins.h$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1952a extends kotlin.jvm.internal.a implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, n {
            C1952a(Object obj) {
                super(2, obj, h.class, "onEnableToggled", "onEnableToggled$datapipelines_release(Lcom/segment/analytics/kotlin/core/System;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v vVar, kotlin.coroutines.d<? super Unit> dVar) {
                return a.m((h) this.receiver, vVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.segment.analytics.kotlin.core.a aVar, h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f288338b = aVar;
            this.f288339c = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(h hVar, v vVar, kotlin.coroutines.d dVar) {
            hVar.u(vVar);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f288338b, this.f288339c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288337a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = this.f288338b.a();
                h hVar = this.f288339c;
                kotlin.reflect.d dVarD = j1.d(v.class);
                C1952a c1952a = new C1952a(this.f288339c);
                this.f288337a = 1;
                if (sovran.kotlin.e.s(eVarA, hVar, dVarD, true, null, c1952a, this, 8, null) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final void t(BaseEvent baseEvent) {
        com.segment.analytics.kotlin.core.platform.b bVar = this.f288334e;
        if (bVar != null) {
            bVar.q(baseEvent);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        super.b(analytics);
        List<com.segment.analytics.kotlin.core.platform.policies.b> listB = analytics.u().B();
        if (listB.isEmpty()) {
            listB = CollectionsKt.listOf((Object[]) new com.segment.analytics.kotlin.core.platform.policies.b[]{new com.segment.analytics.kotlin.core.platform.policies.a(analytics.u().z()), new com.segment.analytics.kotlin.core.platform.policies.c(((long) analytics.u().A()) * 1000)});
        }
        this.f288335f = listB;
        e(new com.segment.analytics.kotlin.core.platform.plugins.b());
        this.f288334e = new com.segment.analytics.kotlin.core.platform.b(analytics, o(), analytics.u().H(), this.f288335f, analytics.u().s());
        kotlinx.coroutines.k.f(analytics.c(), analytics.d(), null, new a(analytics, this, null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    @NotNull
    public BaseEvent d(@NotNull IdentifyEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        t(payload);
        return payload;
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    public void flush() {
        com.segment.analytics.kotlin.core.platform.b bVar = this.f288334e;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    @NotNull
    public BaseEvent g(@NotNull TrackEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        t(payload);
        return payload;
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    @NotNull
    public BaseEvent h(@NotNull ScreenEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        t(payload);
        return payload;
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c type) {
        String strE;
        com.segment.analytics.kotlin.core.platform.b bVar;
        JsonObject jsonObjectK;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(type, "type");
        super.i(settings, type);
        if (settings.q(this)) {
            String strO = o();
            Json.Default.getSerializersModule();
            KSerializer<CustomerIOSettings> kSerializerSerializer = CustomerIOSettings.Companion.serializer();
            JsonElement jsonElement = (JsonElement) settings.m().get((Object) strO);
            CustomerIOSettings customerIOSettings = (CustomerIOSettings) ((jsonElement == null || (jsonObjectK = com.segment.analytics.kotlin.core.utilities.o.k(jsonElement)) == null) ? null : com.segment.analytics.kotlin.core.utilities.o.e().decodeFromJsonElement(kSerializerSerializer, jsonObjectK));
            if (customerIOSettings == null || (strE = customerIOSettings.e()) == null || (bVar = this.f288334e) == null) {
                return;
            }
            bVar.t(strE);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    @NotNull
    public BaseEvent k(@NotNull GroupEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        t(payload);
        return payload;
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.c
    @NotNull
    public BaseEvent l(@NotNull AliasEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        t(payload);
        return payload;
    }

    @Override // com.segment.analytics.kotlin.core.platform.a
    @NotNull
    public String o() {
        return this.f288336g;
    }

    public final void u(@NotNull v state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.i()) {
            com.segment.analytics.kotlin.core.platform.b bVar = this.f288334e;
            if (bVar != null) {
                bVar.u();
            }
        } else {
            com.segment.analytics.kotlin.core.platform.b bVar2 = this.f288334e;
            if (bVar2 != null) {
                bVar2.v();
            }
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.h
    @NotNull
    public String version() {
        return "1.19.2";
    }
}
