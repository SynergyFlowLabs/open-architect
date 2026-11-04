package io.sentry.android.core.performance;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f304443a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f304444b = new i();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f304443a.t(), cVar.f304443a.t());
        return iCompare == 0 ? Long.compare(this.f304444b.t(), cVar.f304444b.t()) : iCompare;
    }

    @NotNull
    public final i k() {
        return this.f304443a;
    }

    @NotNull
    public final i l() {
        return this.f304444b;
    }
}
