package com.segment.analytics.kotlin.core;

import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = d.class)
public abstract class BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f266644b = "All";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function1<? super BaseEvent, ? extends BaseEvent> f266645a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BaseEvent> serializer() {
            return d.f266805a;
        }

        private Companion() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.BaseEvent", f = "Events.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160700j1}, m = "applyBaseEventData$core", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f266647b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266649d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266647b = obj;
            this.f266649d |= Integer.MIN_VALUE;
            return BaseEvent.this.b(null, this);
        }
    }

    public /* synthetic */ BaseEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(@Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        this.f266645a = function1;
        r(com.segment.analytics.kotlin.core.utilities.r.Companion.b());
        n(l.b());
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        q(string);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object b(@NotNull sovran.kotlin.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f266649d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f266649d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objF = aVar.f266647b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f266649d;
        if (i11 == 0) {
            ResultKt.m(objF);
            kotlin.reflect.d dVarD = j1.d(y.class);
            aVar.f266646a = this;
            aVar.f266649d = 1;
            objF = eVar.f(dVarD, aVar);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (BaseEvent) aVar.f266646a;
            ResultKt.m(objF);
        }
        y yVar = (y) objF;
        if (yVar == null) {
            return Unit.f312394a;
        }
        this.m(yVar.f());
        this.p(l.b());
        if (StringsKt.w3(this.k())) {
            String strH = yVar.h();
            if (strH == null) {
                strH = "";
            }
            this.t(strH);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final <T extends BaseEvent> T c() {
        T trackEvent;
        if (this instanceof AliasEvent) {
            trackEvent = new AliasEvent(k(), ((AliasEvent) this).z());
        } else if (this instanceof GroupEvent) {
            GroupEvent groupEvent = (GroupEvent) this;
            trackEvent = new GroupEvent(groupEvent.z(), groupEvent.A());
        } else if (this instanceof IdentifyEvent) {
            trackEvent = new IdentifyEvent(k(), ((IdentifyEvent) this).z());
        } else if (this instanceof ScreenEvent) {
            ScreenEvent screenEvent = (ScreenEvent) this;
            trackEvent = new ScreenEvent(screenEvent.B(), screenEvent.A(), screenEvent.C());
        } else {
            if (!(this instanceof TrackEvent)) {
                throw new k0();
            }
            TrackEvent trackEvent2 = (TrackEvent) this;
            trackEvent = new TrackEvent(trackEvent2.A(), trackEvent2.z());
        }
        trackEvent.m(d());
        trackEvent.q(h());
        trackEvent.r(i());
        trackEvent.n(e());
        trackEvent.p(g());
        trackEvent.t(k());
        trackEvent.u(l());
        trackEvent.f266645a = this.f266645a;
        return trackEvent;
    }

    @NotNull
    public abstract String d();

    @NotNull
    public abstract JsonObject e();

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.BaseEvent");
        BaseEvent baseEvent = (BaseEvent) obj;
        return j() == baseEvent.j() && Intrinsics.areEqual(d(), baseEvent.d()) && Intrinsics.areEqual(h(), baseEvent.h()) && Intrinsics.areEqual(i(), baseEvent.i()) && Intrinsics.areEqual(e(), baseEvent.e()) && Intrinsics.areEqual(g(), baseEvent.g()) && Intrinsics.areEqual(k(), baseEvent.k()) && Intrinsics.areEqual(l(), baseEvent.l());
    }

    @Nullable
    public final Function1<BaseEvent, BaseEvent> f() {
        return this.f266645a;
    }

    @NotNull
    public abstract JsonObject g();

    @NotNull
    public abstract String h();

    public int hashCode() {
        return (((((((((((((j().hashCode() * 31) + d().hashCode()) * 31) + h().hashCode()) * 31) + i().hashCode()) * 31) + e().hashCode()) * 31) + g().hashCode()) * 31) + k().hashCode()) * 31) + l().hashCode();
    }

    @NotNull
    public abstract String i();

    @NotNull
    public abstract EventType j();

    @NotNull
    public abstract String k();

    @NotNull
    public abstract DestinationMetadata l();

    public abstract void m(@NotNull String str);

    public abstract void n(@NotNull JsonObject jsonObject);

    public final void o(@Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        this.f266645a = function1;
    }

    public abstract void p(@NotNull JsonObject jsonObject);

    public abstract void q(@NotNull String str);

    public abstract void r(@NotNull String str);

    public abstract void s(@NotNull EventType eventType);

    public abstract void t(@NotNull String str);

    public abstract void u(@NotNull DestinationMetadata destinationMetadata);

    private BaseEvent() {
    }
}
