package io.sentry.internal.eventprocessor;

import io.sentry.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f305618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Long f305619b;

    public a(@NotNull i0 i0Var, @Nullable Long l10) {
        this.f305618a = i0Var;
        if (l10 == null) {
            this.f305619b = Long.valueOf(System.nanoTime());
        } else {
            this.f305619b = l10;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull a aVar) {
        return this.f305619b.compareTo(aVar.f305619b);
    }

    @NotNull
    public i0 k() {
        return this.f305618a;
    }

    @NotNull
    public Long l() {
        return this.f305619b;
    }
}
