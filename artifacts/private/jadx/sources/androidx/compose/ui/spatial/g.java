package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.q;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n1#1,546:1\n545#1:547\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n534#1:547\n*E\n"})
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    public static final int c(float[] fArr) {
        int i10;
        int i11 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        if (fArr[0] == 1.0f && fArr[1] == 0.0f) {
            int i12 = 2 ^ 2;
            if (fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i11 = 1;
        }
        return (i10 << 1) | i11;
    }

    private static final boolean d(int i10) {
        return (i10 & 2) == 0;
    }

    private static /* synthetic */ void e(int i10) {
    }

    private static final boolean f(int i10) {
        return i10 == 3;
    }

    private static /* synthetic */ void g(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j10) {
        return !q.k(j10, q.f42709b.a());
    }

    public static final int i(boolean z10) {
        return z10 ? 1 : 0;
    }
}
