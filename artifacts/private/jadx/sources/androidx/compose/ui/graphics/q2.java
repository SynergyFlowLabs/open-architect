package androidx.compose.ui.graphics;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface q2 extends Iterator<v2>, qj.a {

    public enum a {
        AsConic,
        AsQuadratics;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f38149d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f38149d;
        }
    }

    static /* synthetic */ int C0(q2 q2Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return q2Var.q0(z10);
    }

    static /* synthetic */ v2.a W(q2 q2Var, float[] fArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return q2Var.Z(fArr, i10);
    }

    @NotNull
    k2 S();

    float U();

    @NotNull
    a V();

    @NotNull
    v2.a Z(@NotNull float[] fArr, int i10);

    @Override // java.util.Iterator
    boolean hasNext();

    @Override // java.util.Iterator
    @NotNull
    v2 next();

    int q0(boolean z10);
}
