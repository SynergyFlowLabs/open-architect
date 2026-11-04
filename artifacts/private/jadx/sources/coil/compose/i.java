package coil.compose;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f87055a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static pj.n<c0, androidx.compose.runtime.c0, Integer, Unit> f87056b = androidx.compose.runtime.internal.w.c(-1783408023, false, a.f87057a);

    static final class a implements pj.n<c0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87057a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, androidx.compose.runtime.c0 c0Var2, int i10) {
            if ((i10 & 14) == 0) {
                i10 |= c0Var2.D(c0Var) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && c0Var2.d()) {
                c0Var2.u();
            } else {
                a0.j(c0Var, null, null, null, null, null, 0.0f, null, false, c0Var2, i10 & 14, 255);
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
            c(c0Var, c0Var2, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final pj.n<c0, androidx.compose.runtime.c0, Integer, Unit> a() {
        return f87056b;
    }
}
