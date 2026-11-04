package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38150a;

        static {
            int[] iArr = new int[androidx.graphics.path.e.a.values().length];
            try {
                iArr[androidx.graphics.path.e.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.graphics.path.e.a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38150a = iArr;
        }
    }

    @NotNull
    public static final q2 a(@NotNull k2 k2Var, @NotNull q2.a aVar, float f10) {
        return new q(k2Var, aVar, f10);
    }

    public static /* synthetic */ q2 b(k2 k2Var, q2.a aVar, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = q2.a.AsQuadratics;
        }
        if ((i10 & 4) != 0) {
            f10 = 0.25f;
        }
        return a(k2Var, aVar, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v2.a d(androidx.graphics.path.e.a aVar) {
        switch (a.f38150a[aVar.ordinal()]) {
            case 1:
                return v2.a.Move;
            case 2:
                return v2.a.Line;
            case 3:
                return v2.a.Quadratic;
            case 4:
                return v2.a.Conic;
            case 5:
                return v2.a.Cubic;
            case 6:
                return v2.a.Close;
            case 7:
                return v2.a.Done;
            default:
                throw new kotlin.k0();
        }
    }
}
