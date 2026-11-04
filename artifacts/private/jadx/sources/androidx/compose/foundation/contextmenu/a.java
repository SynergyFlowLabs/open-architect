package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.a0;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14016a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static pj.n<h, c0, Integer, Unit> f14017b = androidx.compose.runtime.internal.w.c(-355168742, false, C0070a.f14018a);

    /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.a$a, reason: collision with other inner class name */
    static final class C0070a implements pj.n<h, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0070a f14018a = new C0070a();

        C0070a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(h hVar, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(hVar) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-355168742, i10, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUi_androidKt.lambda$-355168742.<anonymous> (ContextMenuUi.android.kt:305)");
            }
            a0.a aVar = a0.E;
            q qVar = q.f14065a;
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(i6.i(i6.h(d5.t(aVar, 0.0f, qVar.e(), 1, null), 0.0f, 1, null), qVar.d()), hVar.d(), null, 2, null), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(h hVar, c0 c0Var, Integer num) {
            c(hVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<h, c0, Integer, Unit> a() {
        return f14017b;
    }
}
