package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.platform.h;
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
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSegmentDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentDestination.kt\ncom/segment/analytics/kotlin/core/platform/plugins/SegmentDestination\n+ 2 Settings.kt\ncom/segment/analytics/kotlin/core/Settings\n*L\n1#1,126:1\n27#2,7:127\n*S KotlinDebug\n*F\n+ 1 SegmentDestination.kt\ncom/segment/analytics/kotlin/core/platform/plugins/SegmentDestination\n*L\n104#1:127,7\n*E\n"})
public final class e extends com.segment.analytics.kotlin.core.platform.a implements h, sovran.kotlin.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.segment.analytics.kotlin.core.platform.b f266911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<? extends com.segment.analytics.kotlin.core.platform.policies.b> f266912f = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f266913g = "Segment.io";

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.plugins.SegmentDestination$setup$1$1", f = "SegmentDestination.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f266916c;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.platform.plugins.e$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1867a extends kotlin.jvm.internal.a implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, n {
            C1867a(Object obj) {
                super(2, obj, e.class, "onEnableToggled", "onEnableToggled$core(Lcom/segment/analytics/kotlin/core/System;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull v vVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                return a.m((e) this.receiver, vVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.segment.analytics.kotlin.core.a aVar, e eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f266915b = aVar;
            this.f266916c = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(e eVar, v vVar, kotlin.coroutines.d dVar) {
            eVar.v(vVar);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f266915b, this.f266916c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266914a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = this.f266915b.a();
                e eVar = this.f266916c;
                kotlin.reflect.d dVarD = j1.d(v.class);
                C1867a c1867a = new C1867a(this.f266916c);
                this.f266914a = 1;
                if (sovran.kotlin.e.s(eVarA, eVar, dVarD, true, null, c1867a, this, 8, null) == objL) {
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

    private final void t(BaseEvent baseEvent) {
        com.segment.analytics.kotlin.core.platform.b bVar = this.f266911e;
        if (bVar != null) {
            bVar.q(baseEvent);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.a, com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        super.b(analytics);
        this.f266912f = analytics.u().B().isEmpty() ? CollectionsKt.listOf((Object[]) new com.segment.analytics.kotlin.core.platform.policies.b[]{new com.segment.analytics.kotlin.core.platform.policies.a(analytics.u().z()), new com.segment.analytics.kotlin.core.platform.policies.c(((long) analytics.u().A()) * 1000)}) : analytics.u().B();
        e(new b());
        this.f266911e = new com.segment.analytics.kotlin.core.platform.b(analytics, o(), analytics.u().H(), this.f266912f, analytics.u().s());
        k.f(analytics.c(), analytics.d(), null, new a(analytics, this, null), 2, null);
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
        com.segment.analytics.kotlin.core.platform.b bVar = this.f266911e;
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
            KSerializer<SegmentSettings> kSerializerSerializer = SegmentSettings.Companion.serializer();
            JsonElement jsonElement = (JsonElement) settings.m().get((Object) strO);
            SegmentSettings segmentSettings = (SegmentSettings) ((jsonElement == null || (jsonObjectK = com.segment.analytics.kotlin.core.utilities.o.k(jsonElement)) == null) ? null : com.segment.analytics.kotlin.core.utilities.o.e().decodeFromJsonElement(kSerializerSerializer, jsonObjectK));
            if (segmentSettings == null || (strE = segmentSettings.e()) == null || (bVar = this.f266911e) == null) {
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
        return this.f266913g;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> u() {
        return this.f266912f;
    }

    public final void v(@NotNull v state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.i()) {
            com.segment.analytics.kotlin.core.platform.b bVar = this.f266911e;
            if (bVar != null) {
                bVar.u();
            }
        } else {
            com.segment.analytics.kotlin.core.platform.b bVar2 = this.f266911e;
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

    public final void w(@NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f266912f = list;
    }
}
