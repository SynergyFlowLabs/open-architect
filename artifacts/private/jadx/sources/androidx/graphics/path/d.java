package androidx.graphics.path;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final e.a[] f52096a = e.a.values();

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.a c(int i10) {
        switch (i10) {
            case 0:
                return e.a.Move;
            case 1:
                return e.a.Line;
            case 2:
                return e.a.Quadratic;
            case 3:
                return e.a.Conic;
            case 4:
                return e.a.Cubic;
            case 5:
                return e.a.Close;
            case 6:
                return e.a.Done;
            default:
                throw new IllegalArgumentException("Unknown path segment type " + i10);
        }
    }
}
