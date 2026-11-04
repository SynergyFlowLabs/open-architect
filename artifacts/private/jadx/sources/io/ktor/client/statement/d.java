package io.ktor.client.statement;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ri.b f295331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f295332b;

    public d(@NotNull ri.b expectedType, @NotNull Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f295331a = expectedType;
        this.f295332b = response;
    }

    public static /* synthetic */ d d(d dVar, ri.b bVar, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bVar = dVar.f295331a;
        }
        if ((i10 & 2) != 0) {
            obj = dVar.f295332b;
        }
        return dVar.c(bVar, obj);
    }

    @NotNull
    public final ri.b a() {
        return this.f295331a;
    }

    @NotNull
    public final Object b() {
        return this.f295332b;
    }

    @NotNull
    public final d c(@NotNull ri.b expectedType, @NotNull Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        return new d(expectedType, response);
    }

    @NotNull
    public final ri.b e() {
        return this.f295331a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f295331a, dVar.f295331a) && Intrinsics.areEqual(this.f295332b, dVar.f295332b);
    }

    @NotNull
    public final Object f() {
        return this.f295332b;
    }

    public int hashCode() {
        return (this.f295331a.hashCode() * 31) + this.f295332b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f295331a + ", response=" + this.f295332b + ')';
    }
}
