package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,64:1\n53#2,4:65\n*S KotlinDebug\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n*L\n55#1:65,4\n*E\n"})
public interface n {

    public static final class a {
        @k7
        public static /* synthetic */ void a() {
        }

        @k7
        @Deprecated
        public static float b(@NotNull n nVar, long j10) {
            return n.super.y(j10);
        }

        @k7
        @Deprecated
        public static long c(@NotNull n nVar, float f10) {
            return n.super.d0(f10);
        }
    }

    @k7
    default long d0(float f10) {
        f1.b bVar = f1.b.f274919a;
        if (!bVar.h(m0())) {
            return a0.l(f10 / m0());
        }
        f1.a aVarB = bVar.b(m0());
        return a0.l(aVarB != null ? aVarB.a(f10) : f10 / m0());
    }

    float m0();

    @k7
    default float y(long j10) {
        f1.a aVarB;
        if (!b0.g(z.m(j10), b0.f42661b.b())) {
            p.d("Only Sp can convert to Px");
        }
        f1.b bVar = f1.b.f274919a;
        if (bVar.h(m0()) && (aVarB = bVar.b(m0())) != null) {
            return h.r(aVarB.b(z.n(j10)));
        }
        return h.r(z.n(j10) * m0());
    }
}
