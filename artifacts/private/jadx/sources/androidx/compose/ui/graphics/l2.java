package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f37846a = a.f37847a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f37847a = new a();

        private a() {
        }

        public static /* synthetic */ l2 d(a aVar, float[] fArr, float f10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            return aVar.c(fArr, f10);
        }

        @NotNull
        public final l2 a(@NotNull l2 l2Var, @NotNull l2 l2Var2) {
            return p.a(l2Var, l2Var2);
        }

        @NotNull
        public final l2 b(float f10) {
            return p.b(f10);
        }

        @NotNull
        public final l2 c(@NotNull float[] fArr, float f10) {
            return p.c(fArr, f10);
        }

        @NotNull
        public final l2 e(@NotNull k2 k2Var, float f10, float f11, int i10) {
            return p.d(k2Var, f10, f11, i10);
        }
    }
}
