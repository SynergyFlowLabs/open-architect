package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x[] f52357a;

    public h(@NotNull x[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f52357a = generatedAdapters;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        b1 b1Var = new b1();
        for (x xVar : this.f52357a) {
            xVar.a(source, event, false, b1Var);
        }
        for (x xVar2 : this.f52357a) {
            xVar2.a(source, event, true, b1Var);
        }
    }
}
