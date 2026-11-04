package androidx.compose.ui.spatial;

import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.z0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class a implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41231a = new a();

    /* JADX INFO: renamed from: androidx.compose.ui.spatial.a$a, reason: collision with other inner class name */
    static final class C0331a extends l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0331a f41232a = new C0331a();

        C0331a() {
            super(1);
        }

        public final void c(i2.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    private a() {
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public b1 a(@NotNull c1 c1Var, @NotNull List<? extends z0> list, long j10) {
        return c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, C0331a.f41232a, 4, null);
    }
}
