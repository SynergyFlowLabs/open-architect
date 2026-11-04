package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 {
    @NotNull
    public static final Shader a(@NotNull Shader shader, @NotNull Shader shader2, int i10) {
        return x.a(shader, shader2, i10);
    }

    @NotNull
    public static final Shader b(@NotNull t1 t1Var, int i10, int i11) {
        return x.b(t1Var, i10, i11);
    }

    public static /* synthetic */ Shader c(t1 t1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = x3.f38688b.a();
        }
        if ((i12 & 4) != 0) {
            i11 = x3.f38688b.a();
        }
        return b(t1Var, i10, i11);
    }

    @NotNull
    public static final Shader d(long j10, long j11, @NotNull List<q0> list, @Nullable List<Float> list2, int i10) {
        return x.c(j10, j11, list, list2, i10);
    }

    public static /* synthetic */ Shader e(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = x3.f38688b.a();
        }
        return d(j10, j11, list, list3, i10);
    }

    @NotNull
    public static final Shader f(long j10, float f10, @NotNull List<q0> list, @Nullable List<Float> list2, int i10) {
        return x.d(j10, f10, list, list2, i10);
    }

    public static /* synthetic */ Shader g(long j10, float f10, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = x3.f38688b.a();
        }
        return f(j10, f10, list, list3, i10);
    }

    @NotNull
    public static final Shader h(long j10, @NotNull List<q0> list, @Nullable List<Float> list2) {
        return x.e(j10, list, list2);
    }

    public static /* synthetic */ Shader i(long j10, List list, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
            int i11 = 2 ^ 0;
        }
        return h(j10, list, list2);
    }
}
