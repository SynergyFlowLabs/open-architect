package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.p;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a<h> {

    @p0
    private static h B3;

    @p0
    private static h C3;

    @p0
    private static h D3;

    @p0
    private static h E3;

    @p0
    private static h F3;

    @p0
    private static h G3;

    @p0
    private static h H3;

    @p0
    private static h I3;

    @NonNull
    @androidx.annotation.j
    public static h V0(@NonNull n<Bitmap> nVar) {
        return new h().M0(nVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h W0() {
        if (F3 == null) {
            F3 = new h().d().b();
        }
        return F3;
    }

    @NonNull
    @androidx.annotation.j
    public static h X0() {
        if (E3 == null) {
            E3 = new h().h().b();
        }
        return E3;
    }

    @NonNull
    @androidx.annotation.j
    public static h Y0() {
        if (G3 == null) {
            G3 = new h().i().b();
        }
        return G3;
    }

    @NonNull
    @androidx.annotation.j
    public static h Z0(@NonNull Class<?> cls) {
        return new h().p(cls);
    }

    @NonNull
    @androidx.annotation.j
    public static h a1(@NonNull com.bumptech.glide.load.engine.j jVar) {
        return new h().s(jVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h b1(@NonNull p pVar) {
        return new h().v(pVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h c1(@NonNull Bitmap.CompressFormat compressFormat) {
        return new h().w(compressFormat);
    }

    @NonNull
    @androidx.annotation.j
    public static h d1(@g0(from = 0, to = 100) int i10) {
        return new h().x(i10);
    }

    @NonNull
    @androidx.annotation.j
    public static h e1(@v int i10) {
        return new h().z(i10);
    }

    @NonNull
    @androidx.annotation.j
    public static h f1(@p0 Drawable drawable) {
        return new h().A(drawable);
    }

    @NonNull
    @androidx.annotation.j
    public static h g1() {
        if (D3 == null) {
            D3 = new h().D().b();
        }
        return D3;
    }

    @NonNull
    @androidx.annotation.j
    public static h h1(@NonNull com.bumptech.glide.load.b bVar) {
        return new h().E(bVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h i1(@g0(from = 0) long j10) {
        return new h().F(j10);
    }

    @NonNull
    @androidx.annotation.j
    public static h j1() {
        if (I3 == null) {
            I3 = new h().t().b();
        }
        return I3;
    }

    @NonNull
    @androidx.annotation.j
    public static h k1() {
        if (H3 == null) {
            H3 = new h().u().b();
        }
        return H3;
    }

    @NonNull
    @androidx.annotation.j
    public static <T> h l1(@NonNull com.bumptech.glide.load.i<T> iVar, @NonNull T t10) {
        return new h().G0(iVar, t10);
    }

    @NonNull
    @androidx.annotation.j
    public static h m1(int i10) {
        return n1(i10, i10);
    }

    @NonNull
    @androidx.annotation.j
    public static h n1(int i10, int i11) {
        return new h().y0(i10, i11);
    }

    @NonNull
    @androidx.annotation.j
    public static h p1(@v int i10) {
        return new h().z0(i10);
    }

    @NonNull
    @androidx.annotation.j
    public static h q1(@p0 Drawable drawable) {
        return new h().A0(drawable);
    }

    @NonNull
    @androidx.annotation.j
    public static h r1(@NonNull com.bumptech.glide.h hVar) {
        return new h().B0(hVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h s1(@NonNull com.bumptech.glide.load.g gVar) {
        return new h().H0(gVar);
    }

    @NonNull
    @androidx.annotation.j
    public static h t1(@x(from = 0.0d, to = 1.0d) float f10) {
        return new h().I0(f10);
    }

    @NonNull
    @androidx.annotation.j
    public static h u1(boolean z10) {
        if (z10) {
            if (B3 == null) {
                B3 = new h().J0(true).b();
            }
            return B3;
        }
        if (C3 == null) {
            C3 = new h().J0(false).b();
        }
        return C3;
    }

    @NonNull
    @androidx.annotation.j
    public static h v1(@g0(from = 0) int i10) {
        return new h().L0(i10);
    }
}
