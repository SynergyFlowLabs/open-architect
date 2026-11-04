package io.ktor.client.plugins.api;

import io.ktor.utils.io.o0;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nClientPluginInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientPluginInstance.kt\nio/ktor/client/plugins/api/ClientPluginInstance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1869#2,2:37\n*S KotlinDebug\n*F\n+ 1 ClientPluginInstance.kt\nio/ktor/client/plugins/api/ClientPluginInstance\n*L\n29#1:37,2\n*E\n"})
public final class g<PluginConfig> implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.a<g<PluginConfig>> f294396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final PluginConfig f294397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<d<PluginConfig>, Unit> f294398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f294399d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull io.ktor.util.a<g<PluginConfig>> key, @NotNull PluginConfig config, @NotNull Function1<? super d<PluginConfig>, Unit> body) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f294396a = key;
        this.f294397b = config;
        this.f294398c = body;
        this.f294399d = new Function0() { // from class: io.ktor.client.plugins.api.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f312394a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f294399d.invoke();
    }

    @o0
    public final void u8(@NotNull io.ktor.client.c scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        d<PluginConfig> dVar = new d<>(this.f294396a, scope, this.f294397b);
        this.f294398c.invoke(dVar);
        this.f294399d = dVar.e();
        Iterator<T> it = dVar.c().iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(scope);
        }
    }
}
