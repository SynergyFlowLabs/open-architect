package z0;

import android.text.Spannable;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import androidx.emoji2.text.k;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w0.j;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n35#2,5:94\n13409#3,2:99\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,5\n48#1:99,2\n*E\n"})
public final class b {
    private static final int a(long j10) {
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            return 0;
        }
        return b0.g(jM, aVar.a()) ? 1 : 2;
    }

    private static /* synthetic */ void b(long j10) {
    }

    private static final int c(int i10) {
        w0.a aVar = w0.f42324b;
        if (w0.k(i10, aVar.a())) {
            return 0;
        }
        if (w0.k(i10, aVar.g())) {
            return 1;
        }
        if (w0.k(i10, aVar.b())) {
            return 2;
        }
        if (w0.k(i10, aVar.c())) {
            return 3;
        }
        if (w0.k(i10, aVar.f())) {
            return 4;
        }
        if (w0.k(i10, aVar.d())) {
            return 5;
        }
        if (w0.k(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static /* synthetic */ void d(int i10) {
    }

    private static final void e(Spannable spannable, v0 v0Var, int i10, int i11, androidx.compose.ui.unit.d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, k.class)) {
            spannable.removeSpan((k) obj);
        }
        d.y(spannable, new j(z.n(v0Var.e()), a(v0Var.e()), z.n(v0Var.c()), a(v0Var.c()), dVar.m0() * dVar.getDensity(), c(v0Var.d())), i10, i11);
    }

    public static final void f(@NotNull Spannable spannable, @NotNull List<androidx.compose.ui.text.f.e<v0>> list, @NotNull androidx.compose.ui.unit.d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.f.e<v0> eVar = list.get(i10);
            e(spannable, eVar.a(), eVar.b(), eVar.c(), dVar);
        }
    }
}
