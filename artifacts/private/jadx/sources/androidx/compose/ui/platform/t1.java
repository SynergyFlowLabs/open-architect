package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t1 implements p0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40891b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40892a;

    public t1(@NotNull View view) {
        this.f40892a = view;
    }

    @Override // p0.a
    public void a(int i10) {
        p0.b.a aVar = p0.b.f340720b;
        if (p0.b.d(i10, aVar.a())) {
            this.f40892a.performHapticFeedback(16);
            return;
        }
        if (p0.b.d(i10, aVar.b())) {
            this.f40892a.performHapticFeedback(6);
            return;
        }
        if (p0.b.d(i10, aVar.c())) {
            this.f40892a.performHapticFeedback(13);
            return;
        }
        if (p0.b.d(i10, aVar.d())) {
            this.f40892a.performHapticFeedback(23);
            return;
        }
        if (p0.b.d(i10, aVar.e())) {
            this.f40892a.performHapticFeedback(3);
            return;
        }
        if (p0.b.d(i10, aVar.f())) {
            this.f40892a.performHapticFeedback(0);
            return;
        }
        if (p0.b.d(i10, aVar.g())) {
            this.f40892a.performHapticFeedback(17);
            return;
        }
        if (p0.b.d(i10, aVar.h())) {
            this.f40892a.performHapticFeedback(27);
            return;
        }
        if (p0.b.d(i10, aVar.i())) {
            this.f40892a.performHapticFeedback(26);
            return;
        }
        if (p0.b.d(i10, aVar.j())) {
            this.f40892a.performHapticFeedback(9);
            return;
        }
        if (p0.b.d(i10, aVar.k())) {
            this.f40892a.performHapticFeedback(22);
        } else if (p0.b.d(i10, aVar.l())) {
            this.f40892a.performHapticFeedback(21);
        } else if (p0.b.d(i10, aVar.m())) {
            this.f40892a.performHapticFeedback(1);
        }
    }
}
