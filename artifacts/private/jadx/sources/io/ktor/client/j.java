package io.ktor.client;

import io.ktor.client.engine.j;
import io.ktor.client.plugins.a0;
import io.ktor.client.plugins.z;
import io.ktor.util.g1;
import io.ktor.utils.io.r0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r0
@SourceDebugExtension({"SMAP\nHttpClientConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientConfig.kt\nio/ktor/client/HttpClientConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1869#2,2:231\n1869#2,2:233\n*S KotlinDebug\n*F\n+ 1 HttpClientConfig.kt\nio/ktor/client/HttpClientConfig\n*L\n200#1:231,2\n201#1:233,2\n*E\n"})
public final class j<T extends io.ktor.client.engine.j> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f294374g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<io.ktor.util.a<?>, Function1<c, Unit>> f294368a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<io.ktor.util.a<?>, Function1<Object, Unit>> f294369b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Function1<c, Unit>> f294370c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f294371d = new Function1() { // from class: io.ktor.client.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j.j((io.ktor.client.engine.j) obj);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f294372e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f294373f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f294375h = g1.f296599a.b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, Function1 function2, io.ktor.client.engine.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        function1.invoke(jVar);
        function2.invoke(jVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(io.ktor.client.engine.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.f312394a;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Development mode is no longer required. The property will be removed in the future.", replaceWith = @b1(expression = "", imports = {}))
    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void t(j jVar, z zVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.u(obj2);
                }
            };
        }
        jVar.r(zVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, Function1 function2, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (function1 != null) {
            function1.invoke(obj);
        }
        function2.invoke(obj);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(z zVar, c scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        io.ktor.util.b bVar = (io.ktor.util.b) scope.getAttributes().i(a0.a(), new Function0() { // from class: io.ktor.client.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.x();
            }
        });
        Function1<Object, Unit> function1 = ((j) scope.m()).f294369b.get(zVar.getKey());
        Intrinsics.checkNotNull(function1);
        Object objA = zVar.a(function1);
        zVar.b(objA, scope);
        bVar.a(zVar.getKey(), objA);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.b x() {
        return io.ktor.util.d.a(true);
    }

    public final void A(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f294371d = function1;
    }

    public final void B(boolean z10) {
        this.f294374g = z10;
    }

    public final void C(boolean z10) {
        this.f294372e = z10;
    }

    public final void D(boolean z10) {
        this.f294373f = z10;
    }

    @NotNull
    public final j<T> g() {
        j<T> jVar = new j<>();
        jVar.y(this);
        return jVar;
    }

    public final void h(@NotNull final Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        final Function1<? super T, Unit> function1 = this.f294371d;
        this.f294371d = new Function1() { // from class: io.ktor.client.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.i(function1, block, (io.ktor.client.engine.j) obj);
            }
        };
    }

    public final boolean k() {
        return this.f294375h;
    }

    @NotNull
    public final Function1<T, Unit> m() {
        return this.f294371d;
    }

    public final boolean n() {
        return this.f294374g;
    }

    public final boolean o() {
        return this.f294372e;
    }

    public final boolean p() {
        return this.f294373f;
    }

    public final void q(@NotNull c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Iterator<T> it = this.f294368a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.f294370c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(client);
        }
    }

    public final <TBuilder, TPlugin> void r(@NotNull final z<? extends TBuilder, TPlugin> plugin, @NotNull final Function1<? super TBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        final Function1<Object, Unit> function1 = this.f294369b.get(plugin.getKey());
        this.f294369b.put(plugin.getKey(), new Function1() { // from class: io.ktor.client.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.v(function1, configure, obj);
            }
        });
        if (this.f294368a.containsKey(plugin.getKey())) {
            return;
        }
        this.f294368a.put(plugin.getKey(), new Function1() { // from class: io.ktor.client.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.w(plugin, (c) obj);
            }
        });
    }

    public final void s(@NotNull String key, @NotNull Function1<? super c, Unit> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f294370c.put(key, block);
    }

    public final void y(@NotNull j<? extends T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f294372e = other.f294372e;
        this.f294373f = other.f294373f;
        this.f294374g = other.f294374g;
        this.f294368a.putAll(other.f294368a);
        this.f294369b.putAll(other.f294369b);
        this.f294370c.putAll(other.f294370c);
    }

    public final void z(boolean z10) {
        this.f294375h = z10;
    }
}
