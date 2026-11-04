package w6;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.r;
import com.google.android.material.color.u;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    SURFACE_0(r6.a.f.C8),
    SURFACE_1(r6.a.f.D8),
    SURFACE_2(r6.a.f.E8),
    SURFACE_3(r6.a.f.F8),
    SURFACE_4(r6.a.f.G8),
    SURFACE_5(r6.a.f.H8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f385934a;

    static {
        int i10 = 5 & 3;
    }

    b(int i10) {
        this.f385934a = i10;
    }

    @l
    public static int c(@NonNull Context context, @r float f10) {
        return new a(context).c(u.b(context, r6.a.c.f359214e4, 0), f10);
    }

    @l
    public int b(@NonNull Context context) {
        return c(context, context.getResources().getDimension(this.f385934a));
    }
}
