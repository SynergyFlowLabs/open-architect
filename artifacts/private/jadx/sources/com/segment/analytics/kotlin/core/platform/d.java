package com.segment.analytics.kotlin.core.platform;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.k;
import com.segment.analytics.kotlin.core.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.p;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMediator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mediator.kt\ncom/segment/analytics/kotlin/core/platform/Mediator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1855#2,2:109\n1855#2,2:111\n1855#2,2:113\n766#2:115\n857#2,2:116\n*S KotlinDebug\n*F\n+ 1 Mediator.kt\ncom/segment/analytics/kotlin/core/platform/Mediator\n*L\n34#1:109,2\n75#1:111,2\n96#1:113,2\n105#1:115\n105#1:116,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private CopyOnWriteArrayList<e> f266869a;

    static final class a extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f266870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f266871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, e eVar) {
            super(1);
            this.f266870a = th2;
            this.f266871b = eVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("error", this.f266870a.toString());
            e eVar = this.f266871b;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266871b.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266871b.getClass());
                it.put("plugin", sb2.toString());
            } else {
                it.put("plugin", this.f266871b.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266871b).o());
            }
            it.put("writekey", this.f266871b.j().u().H());
            it.put("message", "Exception executing plugin");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseEvent f266872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f266873b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BaseEvent baseEvent, e eVar) {
            super(1);
            this.f266872a = baseEvent;
            this.f266873b = eVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("message", "event-" + this.f266872a.j());
            e eVar = this.f266873b;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266873b.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266873b.getClass());
                it.put("plugin", sb2.toString());
                return;
            }
            it.put("plugin", this.f266873b.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266873b).o());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    static final class c extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f266874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f266875b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Throwable th2, e eVar) {
            super(1);
            this.f266874a = th2;
            this.f266875b = eVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("error", this.f266874a.toString());
            e eVar = this.f266875b;
            if (!(eVar instanceof com.segment.analytics.kotlin.core.platform.a) || Intrinsics.areEqual(((com.segment.analytics.kotlin.core.platform.a) eVar).o(), "")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f266875b.c());
                sb2.append(l.f335457d);
                sb2.append(this.f266875b.getClass());
                it.put("plugin", sb2.toString());
            } else {
                it.put("plugin", this.f266875b.c() + l.f335457d + ((com.segment.analytics.kotlin.core.platform.a) this.f266875b).o());
            }
            it.put("writekey", this.f266875b.j().u().H());
            it.put("message", "Exception executing plugin");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f266869a.add(plugin);
    }

    public final void b(@NotNull Function1<? super e, Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        for (e plugin : this.f266869a) {
            try {
                Intrinsics.checkNotNullExpressionValue(plugin, "plugin");
                closure.invoke(plugin);
            } catch (Throwable th2) {
                k.a(null, th2, "Caught Exception applying closure to plugin: " + plugin, w.f267067f, p.i(th2), new a(th2, plugin));
            }
        }
    }

    @Nullable
    public final BaseEvent c(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (e eVar : this.f266869a) {
            if (event != null) {
                BaseEvent baseEventC = event.c();
                try {
                    w.f267062a.t(w.f267066e, new b(event, eVar));
                    if (eVar instanceof com.segment.analytics.kotlin.core.platform.a) {
                        eVar.a(baseEventC);
                    } else {
                        event = eVar.a(baseEventC);
                    }
                } catch (Throwable th2) {
                    vf.f.a(com.segment.analytics.kotlin.core.a.Companion, "Skipping plugin due to Exception: " + eVar, vf.b.WARNING);
                    k.a(null, th2, "Caught Exception in plugin", w.f267067f, p.i(th2), new c(th2, eVar));
                }
            }
        }
        return event;
    }

    @Nullable
    public final <T extends e> T d(@NotNull kotlin.reflect.d<T> pluginClass) {
        Intrinsics.checkNotNullParameter(pluginClass, "pluginClass");
        Iterator<T> it = this.f266869a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (pluginClass.K(t10)) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of com.segment.analytics.kotlin.core.platform.Mediator.find$lambda$3");
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public final <T extends e> List<T> e(@NotNull kotlin.reflect.d<T> pluginClass) {
        Intrinsics.checkNotNullParameter(pluginClass, "pluginClass");
        CopyOnWriteArrayList<e> copyOnWriteArrayList = this.f266869a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (pluginClass.K((e) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final CopyOnWriteArrayList<e> f() {
        return this.f266869a;
    }

    public final void g(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f266869a.removeAll(SetsKt.setOf(plugin));
    }

    public final void h(@NotNull CopyOnWriteArrayList<e> copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "<set-?>");
        this.f266869a = copyOnWriteArrayList;
    }

    public d(@NotNull CopyOnWriteArrayList<e> plugins) {
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        this.f266869a = plugins;
    }

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }
}
