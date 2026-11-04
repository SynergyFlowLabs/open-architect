package com.planner5d.library.mesh;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.h f180509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.e f180510b;

    public i(@NotNull com.planner5d.library.math.h tessellator, @NotNull com.planner5d.library.math.e rectanglesMerger) {
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(rectanglesMerger, "rectanglesMerger");
        this.f180509a = tessellator;
        this.f180510b = rectanglesMerger;
    }

    @Override // com.planner5d.library.mesh.h
    @NotNull
    public f a(@NotNull h.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof d) {
            d dVar = (d) request;
            return new l(dVar.k(), dVar.n(), dVar.l(), dVar.m(), dVar.j(), this.f180509a, this.f180510b, dVar.i());
        }
        if (request instanceof a) {
            a aVar = (a) request;
            return new g(aVar.f(), this.f180509a, aVar.g(), aVar.h());
        }
        if (request instanceof b) {
            b bVar = (b) request;
            return new j(bVar.g(), this.f180509a, bVar.f(), bVar.h());
        }
        if (request instanceof c) {
            c cVar = (c) request;
            return new k(cVar.h(), cVar.f(), cVar.g());
        }
        throw new l0("Unsupported build request: " + j1.d(request.getClass()).m());
    }
}
