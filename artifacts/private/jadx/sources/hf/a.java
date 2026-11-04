package hf;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f285791a = new a();

    private a() {
    }

    public final float a(float f10, float f11, float f12, float f13) {
        if (f10 == f11 || f12 == f13) {
            return 0.0f;
        }
        if (f11 <= f10) {
            f11 = f10;
            f10 = f11;
        }
        if (f13 > f12) {
            f13 = f12;
            f12 = f13;
        }
        if (f10 >= f12 || f13 >= f11) {
            return 0.0f;
        }
        return f10 <= f13 ? Math.abs(f11 - f13) : Math.abs(f10 - f12);
    }
}
