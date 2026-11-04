package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f38233a = a.f38234a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f38234a = new a();

        private a() {
        }
    }

    public static final class b {
    }

    static /* synthetic */ void e(t1 t1Var, int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i16 & 2) != 0) {
            i10 = 0;
        }
        if ((i16 & 4) != 0) {
            i11 = 0;
        }
        if ((i16 & 8) != 0) {
            i12 = t1Var.getWidth();
        }
        if ((i16 & 16) != 0) {
            i13 = t1Var.getHeight();
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        t1Var.a(iArr, i10, i11, i12, i13, i14, i15);
    }

    void a(@NotNull int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15);

    void b();

    boolean c();

    int d();

    @NotNull
    androidx.compose.ui.graphics.colorspace.c f();

    int getHeight();

    int getWidth();
}
