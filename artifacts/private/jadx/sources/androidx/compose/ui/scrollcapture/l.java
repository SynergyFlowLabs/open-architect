package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.g0;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.unit.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u f41049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s f41051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g0 f41052d;

    public l(@NotNull u uVar, int i10, @NotNull s sVar, @NotNull g0 g0Var) {
        this.f41049a = uVar;
        this.f41050b = i10;
        this.f41051c = sVar;
        this.f41052d = g0Var;
    }

    @NotNull
    public final g0 a() {
        return this.f41052d;
    }

    public final int b() {
        return this.f41050b;
    }

    @NotNull
    public final u c() {
        return this.f41049a;
    }

    @NotNull
    public final s d() {
        return this.f41051c;
    }

    @NotNull
    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f41049a + ", depth=" + this.f41050b + ", viewportBoundsInWindow=" + this.f41051c + ", coordinates=" + this.f41052d + ')';
    }
}
