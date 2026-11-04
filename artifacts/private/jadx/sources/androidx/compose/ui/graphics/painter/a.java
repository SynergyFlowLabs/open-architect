package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n1#2:156\n30#3:157\n80#4:158\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n*L\n49#1:157\n49#1:158\n*E\n"})
public final class a {
    @NotNull
    public static final BitmapPainter a(@NotNull t1 t1Var, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(t1Var, j10, j11, null);
        bitmapPainter.p(i10);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(t1 t1Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = q.f42709b.b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = u.e((((long) t1Var.getHeight()) & k0.f265952a) | (((long) t1Var.getWidth()) << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = l1.f37840b.b();
        }
        return a(t1Var, j12, j13, i10);
    }
}
