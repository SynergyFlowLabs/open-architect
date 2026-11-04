package androidx.compose.ui.graphics;

import android.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38247a;

        static {
            int[] iArr = new int[k2.c.values().length];
            try {
                iArr[k2.c.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k2.c.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38247a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final k2 a() {
        return new n(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public static final Path c(@NotNull k2 k2Var) {
        if (k2Var instanceof n) {
            return ((n) k2Var).Z();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final k2 d(@NotNull Path path) {
        return new n(path);
    }

    public static final void e(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction f(k2.c cVar) {
        int i10 = a.f38247a[cVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new kotlin.k0();
    }
}
