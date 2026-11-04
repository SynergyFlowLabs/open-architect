package p0;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f340722b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f340723a;

    public c(@NotNull View view) {
        this.f340723a = view;
    }

    @Override // p0.a
    public void a(int i10) {
        b.a aVar = b.f340720b;
        if (b.d(i10, aVar.a())) {
            this.f340723a.performHapticFeedback(16);
            return;
        }
        if (b.d(i10, aVar.b())) {
            this.f340723a.performHapticFeedback(6);
            return;
        }
        if (b.d(i10, aVar.c())) {
            this.f340723a.performHapticFeedback(13);
            return;
        }
        if (b.d(i10, aVar.d())) {
            this.f340723a.performHapticFeedback(23);
            return;
        }
        if (b.d(i10, aVar.e())) {
            this.f340723a.performHapticFeedback(3);
            return;
        }
        if (b.d(i10, aVar.f())) {
            this.f340723a.performHapticFeedback(0);
            return;
        }
        if (b.d(i10, aVar.g())) {
            this.f340723a.performHapticFeedback(17);
            return;
        }
        if (b.d(i10, aVar.h())) {
            this.f340723a.performHapticFeedback(27);
            return;
        }
        if (b.d(i10, aVar.i())) {
            this.f340723a.performHapticFeedback(26);
            return;
        }
        if (b.d(i10, aVar.j())) {
            this.f340723a.performHapticFeedback(9);
            return;
        }
        if (b.d(i10, aVar.k())) {
            this.f340723a.performHapticFeedback(22);
        } else if (b.d(i10, aVar.l())) {
            this.f340723a.performHapticFeedback(21);
        } else if (b.d(i10, aVar.m())) {
            this.f340723a.performHapticFeedback(1);
        }
    }
}
