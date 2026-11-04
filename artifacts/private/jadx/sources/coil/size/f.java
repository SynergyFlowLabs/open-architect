package coil.size;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f87775a;

    public f(@NotNull i iVar) {
        this.f87775a = iVar;
    }

    @Override // coil.size.j
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super i> dVar) {
        return this.f87775a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f87775a, ((f) obj).f87775a);
    }

    public int hashCode() {
        return this.f87775a.hashCode();
    }
}
