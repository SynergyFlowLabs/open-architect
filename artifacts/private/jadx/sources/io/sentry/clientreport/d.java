package io.sentry.clientreport;

import io.sentry.util.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f305278b;

    d(@NotNull String str, @NotNull String str2) {
        this.f305277a = str;
        this.f305278b = str2;
    }

    @NotNull
    public String a() {
        return this.f305278b;
    }

    @NotNull
    public String b() {
        return this.f305277a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return y.a(b(), dVar.b()) && y.a(a(), dVar.a());
    }

    public int hashCode() {
        return y.b(b(), a());
    }
}
