package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final t1 a(int i10, int i11, int i12, boolean z10, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        e(i12);
        return new i(b0.b(i10, i11, i12, z10, cVar));
    }

    @NotNull
    public static final Bitmap b(@NotNull t1 t1Var) {
        if (t1Var instanceof i) {
            return ((i) t1Var).g();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final t1 c(@NotNull Bitmap bitmap) {
        return new i(bitmap);
    }

    @NotNull
    public static final t1 d(@NotNull byte[] bArr) {
        return c(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    @NotNull
    public static final Bitmap.Config e(int i10) {
        u1.a aVar = u1.f38249b;
        if (u1.i(i10, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (u1.i(i10, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (u1.i(i10, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        if (u1.i(i10, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        return u1.i(i10, aVar.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int f(@NotNull Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return u1.f38249b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return u1.f38249b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return u1.f38249b.b();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return u1.f38249b.c();
        }
        return config == Bitmap.Config.HARDWARE ? u1.f38249b.d() : u1.f38249b.b();
    }
}
