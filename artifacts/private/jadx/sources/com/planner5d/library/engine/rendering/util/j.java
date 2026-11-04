package com.planner5d.library.engine.rendering.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final i f165386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final f f165387b;

    public j(@Nullable i iVar, @Nullable f fVar) {
        this.f165386a = iVar;
        this.f165387b = fVar;
    }

    public static /* synthetic */ j d(j jVar, i iVar, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = jVar.f165386a;
        }
        if ((i10 & 2) != 0) {
            fVar = jVar.f165387b;
        }
        return jVar.c(iVar, fVar);
    }

    @Nullable
    public final i a() {
        return this.f165386a;
    }

    @Nullable
    public final f b() {
        return this.f165387b;
    }

    @NotNull
    public final j c(@Nullable i iVar, @Nullable f fVar) {
        return new j(iVar, fVar);
    }

    @Nullable
    public final f e() {
        return this.f165387b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f165386a == jVar.f165386a && this.f165387b == jVar.f165387b;
    }

    @Nullable
    public final i f() {
        return this.f165386a;
    }

    public int hashCode() {
        i iVar = this.f165386a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        f fVar = this.f165387b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextureTiling(repeat=" + this.f165386a + ", alignment=" + this.f165387b + ")";
    }
}
