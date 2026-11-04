package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.a1;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y3;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidParagraphIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class i {
    @NotNull
    public static final q0 a(@NotNull String str, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull List<androidx.compose.ui.text.f.e<v0>> list2, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar) {
        return new h(str, y3Var, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(y3 y3Var) {
        x0 x0VarA;
        a1 a1VarM = y3Var.M();
        androidx.compose.ui.text.u uVarD = (a1VarM == null || (x0VarA = a1VarM.a()) == null) ? null : androidx.compose.ui.text.u.d(x0VarA.b());
        return !(uVarD == null ? false : androidx.compose.ui.text.u.g(uVarD.j(), androidx.compose.ui.text.u.f42278b.c()));
    }

    public static final int d(int i10, @Nullable y0.f fVar) {
        Locale localeB;
        androidx.compose.ui.text.style.l.a aVar = androidx.compose.ui.text.style.l.f42221b;
        if (androidx.compose.ui.text.style.l.j(i10, aVar.b())) {
            return 2;
        }
        if (androidx.compose.ui.text.style.l.j(i10, aVar.c())) {
            return 3;
        }
        if (androidx.compose.ui.text.style.l.j(i10, aVar.d())) {
            return 0;
        }
        int i11 = 7 | 1;
        if (androidx.compose.ui.text.style.l.j(i10, aVar.e())) {
            return 1;
        }
        if (!androidx.compose.ui.text.style.l.j(i10, aVar.a()) && !androidx.compose.ui.text.style.l.j(i10, aVar.f())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (fVar == null || (localeB = fVar.k(0).b()) == null) {
            localeB = Locale.getDefault();
        }
        int iA = androidx.core.text.n.a(localeB);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }

    public static /* synthetic */ int e(int i10, y0.f fVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = null;
        }
        return d(i10, fVar);
    }
}
