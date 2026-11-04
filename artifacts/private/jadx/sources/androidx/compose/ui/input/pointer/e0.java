package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39005d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f0> f39007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private MotionEvent f39008c;

    public e0(long j10, @NotNull List<f0> list, @Nullable MotionEvent motionEvent) {
        this.f39006a = j10;
        this.f39007b = list;
        this.f39008c = motionEvent;
    }

    @Nullable
    public final MotionEvent a() {
        return this.f39008c;
    }

    @NotNull
    public final List<f0> b() {
        return this.f39007b;
    }

    public final long c() {
        return this.f39006a;
    }

    public final void d(@Nullable MotionEvent motionEvent) {
        this.f39008c = motionEvent;
    }
}
