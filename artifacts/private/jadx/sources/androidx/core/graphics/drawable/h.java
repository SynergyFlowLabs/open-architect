package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.view.d0;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47783a = "RoundedBitmapDrawableFa";

    private static class a extends g {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.g
        void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
            d0.b(i10, i11, i12, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.g
        public boolean h() {
            Bitmap bitmap = this.f47770a;
            return bitmap != null && androidx.core.graphics.a.c(bitmap);
        }

        @Override // androidx.core.graphics.drawable.g
        public void o(boolean z10) {
            Bitmap bitmap = this.f47770a;
            if (bitmap != null) {
                androidx.core.graphics.a.d(bitmap, z10);
                invalidateSelf();
            }
        }
    }

    private h() {
    }

    @NonNull
    public static g a(@NonNull Resources resources, @p0 Bitmap bitmap) {
        return new f(resources, bitmap);
    }

    @NonNull
    public static g b(@NonNull Resources resources, @NonNull InputStream inputStream) {
        g gVarA = a(resources, BitmapFactory.decodeStream(inputStream));
        if (gVarA.b() == null) {
            Objects.toString(inputStream);
        }
        return gVarA;
    }

    @NonNull
    public static g c(@NonNull Resources resources, @NonNull String str) {
        g gVarA = a(resources, BitmapFactory.decodeFile(str));
        gVarA.b();
        return gVarA;
    }
}
