package io.customer.sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.d0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDataPipelineInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataPipelineInstance.kt\nio/customer/sdk/DataPipelineInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n17#1:389\n17#1:391\n17#1:393\n17#1:395\n17#1:397\n17#1:399\n17#1:401\n1#2:388\n1#2:390\n1#2:392\n1#2:394\n1#2:396\n1#2:398\n1#2:400\n1#2:402\n*S KotlinDebug\n*F\n+ 1 DataPipelineInstance.kt\nio/customer/sdk/DataPipelineInstance\n*L\n110#1:389\n181#1:391\n261#1:393\n301#1:395\n318#1:397\n363#1:399\n377#1:401\n110#1:390\n181#1:392\n261#1:394\n301#1:396\n318#1:398\n363#1:400\n377#1:402\n*E\n"})
public abstract class l implements k {
    private final <T> T D(Function0<? extends T> function0) {
        T tInvoke;
        synchronized (this) {
            try {
                tInvoke = function0.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return tInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void J(l lVar, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        lVar.H(str, map);
    }

    @kotlin.l(message = "Use setDeviceAttributes() function instead")
    public static /* synthetic */ void g() {
    }

    @kotlin.l(message = "Use setProfileAttributes() function instead")
    public static /* synthetic */ void i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(l lVar, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        lVar.o(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z(l lVar, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: screen");
        }
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        lVar.x(str, map);
    }

    protected abstract <T> void A(@NotNull String str, T t10, @NotNull d0<? super T> d0Var);

    public abstract void B(@NotNull Map<String, ? extends Object> map);

    public abstract void C(@NotNull Map<String, ? extends Object> map);

    @oj.j
    public final void E(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        J(this, name, null, 2, null);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use track(name: String, properties: Map<String, Any?>) instead")
    public final /* synthetic */ <T> void F(String name, T t10) {
        Intrinsics.checkNotNullParameter(name, "name");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        G(name, t10, m0.o(serializersModule, null));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use track(name: String, properties: Map<String, Any?>) instead")
    public final <T> void G(@NotNull String name, T t10, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        synchronized (this) {
            try {
                K(name, t10, serializationStrategy);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @oj.j
    public final void H(@NotNull String name, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        G(name, io.customer.datapipelines.extensions.c.c(properties, null, 1, null), new e1(b3.f315897a, hk.a.v(m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class)))));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use track(name: String, properties: Map<String, Any?>) instead")
    public final void I(@NotNull String name, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        G(name, properties, JsonObject.Companion.serializer());
    }

    protected abstract <T> void K(@NotNull String str, T t10, @NotNull d0<? super T> d0Var);

    public final void L(@NotNull kh.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this) {
            try {
                M(event);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract void M(@NotNull kh.c cVar);

    public final void a() {
        synchronized (this) {
            b();
            Unit unit = Unit.f312394a;
        }
    }

    protected abstract void b();

    public final void c() {
        synchronized (this) {
            d();
            Unit unit = Unit.f312394a;
        }
    }

    protected abstract void d();

    @NotNull
    public abstract String e();

    @NotNull
    public abstract Map<String, Object> f();

    @NotNull
    public abstract Map<String, Object> h();

    @Nullable
    public abstract String j();

    @Nullable
    public abstract String k();

    @oj.j
    public final void l(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        q(this, userId, null, 2, null);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use identify(userId: String, traits: Map<String, Any?>) instead")
    public final /* synthetic */ <Traits> void m(String userId, Traits traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "Traits");
        q0.n("kotlinx.serialization.serializer.withModule");
        boolean z10 = true & false;
        n(userId, traits, m0.o(serializersModule, null));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use identify(userId: String, traits: Map<String, Any?>) instead")
    public final <Traits> void n(@NotNull String userId, Traits traits, @NotNull d0<? super Traits> serializationStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        synchronized (this) {
            r(userId, traits, serializationStrategy);
            Unit unit = Unit.f312394a;
        }
    }

    @oj.j
    public final void o(@NotNull String userId, @NotNull Map<String, ? extends Object> traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        n(userId, io.customer.datapipelines.extensions.c.c(traits, null, 1, null), new e1(b3.f315897a, hk.a.v(m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class)))));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use identify(userId: String, traits: Map<String, Any?>) instead")
    public final void p(@NotNull String userId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        n(userId, traits, JsonObject.Companion.serializer());
    }

    protected abstract <Traits> void r(@NotNull String str, Traits traits, @NotNull d0<? super Traits> d0Var);

    public final void s(@NotNull String deviceToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        synchronized (this) {
            try {
                t(deviceToken);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract void t(@NotNull String str);

    @oj.j
    public final void u(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        z(this, title, null, 2, null);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use screen(title: String, properties: Map<String, Any?>) instead")
    public final /* synthetic */ <T> void v(String title, T t10) {
        Intrinsics.checkNotNullParameter(title, "title");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        w(title, t10, m0.o(serializersModule, null));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use screen(title: String, properties: Map<String, Any?>) instead")
    public final <T> void w(@NotNull String title, T t10, @NotNull d0<? super T> serializationStrategy) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        synchronized (this) {
            A(title, t10, serializationStrategy);
            Unit unit = Unit.f312394a;
        }
    }

    @oj.j
    public final void x(@NotNull String title, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        w(title, io.customer.datapipelines.extensions.c.c(properties, null, 1, null), new e1(b3.f315897a, hk.a.v(m0.d(com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule(), j1.d(Object.class)))));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use screen(title: String, properties: Map<String, Any?>) instead")
    public final void y(@NotNull String title, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        w(title, properties, JsonObject.Companion.serializer());
    }
}
