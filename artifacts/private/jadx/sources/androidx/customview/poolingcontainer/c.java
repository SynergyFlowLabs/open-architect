package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<b> f49188a = new ArrayList<>();

    public final void a(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f49188a.add(listener);
    }

    public final void b() {
        for (int lastIndex = CollectionsKt.getLastIndex(this.f49188a); -1 < lastIndex; lastIndex--) {
            this.f49188a.get(lastIndex).c();
        }
    }

    public final void c(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f49188a.remove(listener);
    }
}
