package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38713a;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38713a = iArr;
        }
    }

    public static final boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 31 || !x3.h(i10, x3.f38688b.b());
    }

    @NotNull
    public static final Shader.TileMode b(int i10) {
        x3.a aVar = x3.f38688b;
        if (x3.h(i10, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (x3.h(i10, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (x3.h(i10, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (x3.h(i10, aVar.b()) && Build.VERSION.SDK_INT >= 31) {
            return y3.f38712a.b();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int c(@NotNull Shader.TileMode tileMode) {
        int i10 = a.f38713a[tileMode.ordinal()];
        if (i10 == 1) {
            return x3.f38688b.a();
        }
        if (i10 == 2) {
            return x3.f38688b.c();
        }
        if (i10 != 3) {
            return (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? x3.f38688b.a() : y3.f38712a.a();
        }
        return x3.f38688b.d();
    }
}
