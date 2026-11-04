package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f52592a;

    public w1(@NotNull x generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.f52592a = generatedAdapter;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f52592a.a(source, event, false, null);
        this.f52592a.a(source, event, true, null);
    }
}
