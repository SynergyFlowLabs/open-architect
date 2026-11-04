package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p0 implements o4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40697b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewConfiguration f40698a;

    public p0(@NotNull ViewConfiguration viewConfiguration) {
        this.f40698a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.o4
    public long a() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.o4
    public float b() {
        return Build.VERSION.SDK_INT >= 34 ? s0.f40877a.b(this.f40698a) : super.b();
    }

    @Override // androidx.compose.ui.platform.o4
    public float g() {
        return this.f40698a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.o4
    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? s0.f40877a.a(this.f40698a) : super.h();
    }

    @Override // androidx.compose.ui.platform.o4
    public long i() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.o4
    public long j() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.o4
    public float k() {
        return this.f40698a.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.o4
    public float m() {
        return this.f40698a.getScaledMaximumFlingVelocity();
    }
}
