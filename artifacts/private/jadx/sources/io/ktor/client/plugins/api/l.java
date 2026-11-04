package io.ktor.client.plugins.api;

import io.ktor.events.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l<Param, Event extends io.ktor.events.a<Param>> implements a<Function1<? super Param, ? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Event f294403a;

    public l(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f294403a = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f312394a;
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull final Function1<? super Param, Unit> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.r().c(this.f294403a, new Function1() { // from class: io.ktor.client.plugins.api.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.d(handler, obj);
            }
        });
    }
}
