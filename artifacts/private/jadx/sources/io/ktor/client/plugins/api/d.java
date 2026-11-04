package io.ktor.client.plugins.api;

import fi.y;
import io.ktor.utils.io.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@r0
public final class d<PluginConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.a<g<PluginConfig>> f294388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.c f294389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final PluginConfig f294390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<j<?>> f294391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f294392e;

    public d(@NotNull io.ktor.util.a<g<PluginConfig>> key, @NotNull io.ktor.client.c client, @NotNull PluginConfig pluginConfig) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.f294388a = key;
        this.f294389b = client;
        this.f294390c = pluginConfig;
        this.f294391d = new ArrayList();
        this.f294392e = new Function0() { // from class: io.ktor.client.plugins.api.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.i();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f312394a;
    }

    @NotNull
    public final io.ktor.client.c b() {
        return this.f294389b;
    }

    @NotNull
    public final List<j<?>> c() {
        return this.f294391d;
    }

    @NotNull
    public final io.ktor.util.a<g<PluginConfig>> d() {
        return this.f294388a;
    }

    @NotNull
    public final Function0<Unit> e() {
        return this.f294392e;
    }

    @NotNull
    public final PluginConfig f() {
        return this.f294390c;
    }

    public final <HookHandler> void g(@NotNull a<HookHandler> hook, HookHandler hookhandler) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f294391d.add(new j<>(hook, hookhandler));
    }

    public final void h(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f294392e = block;
    }

    public final void j(@NotNull pj.o<? super m, ? super y, Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        g(o.f294404a, block);
    }

    public final void k(@NotNull pj.n<? super n, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        g(p.f294408a, block);
    }

    public final void l(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f294392e = function0;
    }

    public final void m(@NotNull pj.p<? super t, ? super y, Object, ? super ri.b, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        g(u.f294428a, block);
    }

    public final void n(@NotNull pj.p<? super v, ? super io.ktor.client.statement.c, ? super io.ktor.utils.io.h, ? super ri.b, ? super kotlin.coroutines.d<Object>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        g(w.f294432a, block);
    }
}
