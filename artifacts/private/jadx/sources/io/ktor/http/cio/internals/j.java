package io.ktor.http.cio.internals;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f295575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f295576b;

    public j(int i10, int i11) {
        this.f295575a = i10;
        this.f295576b = i11;
    }

    public final int a() {
        return this.f295576b;
    }

    public final int b() {
        return this.f295575a;
    }

    public final void c(int i10) {
        this.f295576b = i10;
    }

    public final void d(int i10) {
        this.f295575a = i10;
    }

    @NotNull
    public String toString() {
        return "MutableRange(start=" + this.f295575a + ", end=" + this.f295576b + ')';
    }
}
