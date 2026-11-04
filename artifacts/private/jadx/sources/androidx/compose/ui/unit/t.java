package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,277:1\n54#2:278\n59#2:280\n85#3:279\n90#3:281\n26#4:282\n26#4:283\n26#4:284\n26#4:285\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n210#1:278\n211#1:280\n210#1:279\n211#1:281\n272#1:282\n273#1:283\n274#1:284\n275#1:285\n*E\n"})
public final class t {
    @k7
    @NotNull
    public static final s a(long j10, long j11) {
        return new s(q.n(j10), q.p(j10), q.n(j11), q.p(j11));
    }

    @k7
    @NotNull
    public static final s b(long j10, long j11) {
        return new s(q.n(j10), q.p(j10), q.n(j10) + ((int) (j11 >> 32)), q.p(j10) + ((int) (j11 & k0.f265952a)));
    }

    @k7
    @NotNull
    public static final s c(long j10, int i10) {
        return new s(q.n(j10) - i10, q.p(j10) - i10, q.n(j10) + i10, q.p(j10) + i10);
    }

    @k7
    @NotNull
    public static final s d(@NotNull s sVar, @NotNull s sVar2, float f10) {
        return new s(androidx.compose.ui.util.e.s(sVar.t(), sVar2.t(), f10), androidx.compose.ui.util.e.s(sVar.B(), sVar2.B(), f10), androidx.compose.ui.util.e.s(sVar.x(), sVar2.x(), f10), androidx.compose.ui.util.e.s(sVar.j(), sVar2.j(), f10));
    }

    @k7
    @NotNull
    public static final s e(@NotNull n0.j jVar) {
        return new s(Math.round(jVar.t()), Math.round(jVar.B()), Math.round(jVar.x()), Math.round(jVar.j()));
    }

    @k7
    @NotNull
    public static final n0.j f(@NotNull s sVar) {
        return new n0.j(sVar.t(), sVar.B(), sVar.x(), sVar.j());
    }
}
