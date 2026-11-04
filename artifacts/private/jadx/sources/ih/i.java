package ih;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f287228a;

    public i(@NotNull b dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f287228a = dispatchers;
    }

    @Override // ih.g
    @NotNull
    public s0 a() {
        return t0.a(this.f287228a.getDefault().plus(q3.c(null, 1, null)));
    }

    @Override // ih.g
    @NotNull
    public s0 b() {
        return t0.a(this.f287228a.getDefault().plus(q3.c(null, 1, null)));
    }

    @Override // ih.g
    @NotNull
    public s0 c() {
        return t0.a(this.f287228a.getDefault().plus(q3.c(null, 1, null)));
    }
}
