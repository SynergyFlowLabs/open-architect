package androidx.compose.foundation.content.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w.d f14012c;

    public d(@NotNull w.d dVar) {
        this.f14012c = dVar;
    }

    public static /* synthetic */ d e(d dVar, w.d dVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar2 = dVar.f14012c;
        }
        return dVar.d(dVar2);
    }

    @Override // androidx.compose.foundation.content.internal.c
    @NotNull
    public w.d a() {
        return this.f14012c;
    }

    @NotNull
    public final w.d c() {
        return this.f14012c;
    }

    @NotNull
    public final d d(@NotNull w.d dVar) {
        return new d(dVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f14012c, ((d) obj).f14012c);
    }

    public int hashCode() {
        return this.f14012c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.f14012c + ')';
    }
}
