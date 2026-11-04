package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(api = 35)
public final class m extends n0<m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Bundle f48061c = new Bundle();

    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    @NotNull
    protected Bundle b() {
        return this.f48061c;
    }

    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    protected int c() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public m d() {
        return this;
    }

    @NotNull
    public final m h(int i10) {
        this.f48061c.putInt("KEY_SIZE_KB", i10);
        return this;
    }

    @NotNull
    public final m i(int i10) {
        this.f48061c.putInt("KEY_DURATION_MS", i10);
        return this;
    }

    @NotNull
    public final m j(long j10) {
        this.f48061c.putLong("KEY_SAMPLING_INTERVAL_BYTES", j10);
        return this;
    }

    @NotNull
    public final m k(boolean z10) {
        this.f48061c.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z10);
        return this;
    }
}
