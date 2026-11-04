package com.planner5d.library.model.manager.push;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCompositePushBackend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePushBackend.kt\ncom/planner5d/library/model/manager/push/CompositePushBackend\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,19:1\n13409#2,2:20\n*S KotlinDebug\n*F\n+ 1 CompositePushBackend.kt\ncom/planner5d/library/model/manager/push/CompositePushBackend\n*L\n16#1:20,2\n*E\n"})
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g[] f193301a;

    public b(@NotNull g... backends) {
        Intrinsics.checkNotNullParameter(backends, "backends");
        this.f193301a = backends;
    }

    @Override // com.planner5d.library.model.manager.push.g
    public void a(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        for (g gVar : this.f193301a) {
            gVar.a(token);
        }
    }

    @Override // com.planner5d.library.model.manager.push.g
    public boolean b(@NotNull Object pushMessage) {
        Intrinsics.checkNotNullParameter(pushMessage, "pushMessage");
        for (g gVar : this.f193301a) {
            if (gVar.b(pushMessage)) {
                return true;
            }
        }
        return false;
    }
}
