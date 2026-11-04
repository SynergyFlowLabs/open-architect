package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.i1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
public final class k {
    public static final void a(@NotNull j jVar, float f10) {
        jVar.i(f10, f10, f10, f10);
    }

    public static final void b(@NotNull j jVar, float f10, float f11) {
        jVar.i(f10, f11, f10, f11);
    }

    public static /* synthetic */ void c(j jVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        jVar.i(f10, f11, f10, f11);
    }

    public static final void d(@NotNull j jVar, float f10, long j10) {
        jVar.h(i1.a(f10), j10);
    }

    public static /* synthetic */ void e(j jVar, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = jVar.Y();
        }
        jVar.h(i1.a(f10), j10);
    }

    public static final void f(@NotNull j jVar, float f10, long j10) {
        jVar.g(f10, f10, j10);
    }

    public static /* synthetic */ void g(j jVar, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = jVar.Y();
        }
        jVar.g(f10, f10, j10);
    }
}
