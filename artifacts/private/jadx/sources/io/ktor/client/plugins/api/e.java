package io.ktor.client.plugins.api;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCreatePluginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/client/plugins/api/ClientPluginImpl\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,102:1\n21#2:103\n65#3,18:104\n*S KotlinDebug\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/client/plugins/api/ClientPluginImpl\n*L\n64#1:103\n64#1:104,18\n*E\n"})
final class e<PluginConfigT> implements b<PluginConfigT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<PluginConfigT> f294393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<d<PluginConfigT>, Unit> f294394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.a<g<PluginConfigT>> f294395c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String name, @NotNull Function0<? extends PluginConfigT> createConfiguration, @NotNull Function1<? super d<PluginConfigT>, Unit> body) {
        kotlin.reflect.s sVarB;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f294393a = createConfiguration;
        this.f294394b = body;
        kotlin.reflect.d dVarD = j1.d(g.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.f312969c;
            int i10 = 6 | 0;
            kotlin.reflect.t tVarF = j1.F(j1.d(e.class), "PluginConfigT", kotlin.reflect.u.INVARIANT, false);
            j1.y(tVarF, j1.A(Object.class));
            sVarB = j1.B(g.class, aVar.e(j1.E(tVarF)));
        } catch (Throwable unused) {
            sVarB = null;
        }
        this.f294395c = new io.ktor.util.a<>(name, new ri.b(dVarD, sVarB));
    }

    @Override // io.ktor.client.plugins.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull g<PluginConfigT> plugin, @NotNull io.ktor.client.c scope) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(scope, "scope");
        plugin.u8(scope);
    }

    @Override // io.ktor.client.plugins.z
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g<PluginConfigT> a(@NotNull Function1<? super PluginConfigT, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PluginConfigT pluginconfigtInvoke = this.f294393a.invoke();
        block.invoke(pluginconfigtInvoke);
        return new g<>(getKey(), pluginconfigtInvoke, this.f294394b);
    }

    @Override // io.ktor.client.plugins.z
    @NotNull
    public io.ktor.util.a<g<PluginConfigT>> getKey() {
        return this.f294395c;
    }
}
