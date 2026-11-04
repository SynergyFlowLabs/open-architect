package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
@w0(19)
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    static final int f51300d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    static final int f51301e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    static final int f51302f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<androidx.emoji2.text.flatbuffer.o> f51303g = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final p f51305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f51306c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    @b1({b1.a.LIBRARY})
    r(@NonNull p pVar, @g0(from = 0) int i10) {
        this.f51305b = pVar;
        this.f51304a = i10;
    }

    private androidx.emoji2.text.flatbuffer.o h() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.o> threadLocal = f51303g;
        androidx.emoji2.text.flatbuffer.o oVar = threadLocal.get();
        if (oVar == null) {
            oVar = new androidx.emoji2.text.flatbuffer.o();
            threadLocal.set(oVar);
        }
        this.f51305b.g().J(oVar, this.f51304a);
        return oVar;
    }

    public void a(@NonNull Canvas canvas, float f10, float f11, @NonNull Paint paint) {
        Typeface typefaceJ = this.f51305b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceJ);
        canvas.drawText(this.f51305b.f(), this.f51304a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return h().F(i10);
    }

    public int c() {
        return h().I();
    }

    @b1({b1.a.LIBRARY})
    public short d() {
        return h().L();
    }

    @e.a({"KotlinPropertyAccess"})
    @b1({b1.a.LIBRARY})
    public int e() {
        return this.f51306c & 3;
    }

    public int f() {
        return h().S();
    }

    @b1({b1.a.LIBRARY})
    public int g() {
        return h().T();
    }

    @b1({b1.a.LIBRARY})
    public short i() {
        return h().U();
    }

    @NonNull
    public Typeface j() {
        return this.f51305b.j();
    }

    public int k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    public boolean m() {
        return (this.f51306c & 4) > 0;
    }

    @l1
    @b1({b1.a.LIBRARY})
    public void n() {
        if (!m()) {
            this.f51306c = 0;
        } else {
            int i10 = 7 << 4;
            this.f51306c = 4;
        }
    }

    @b1({b1.a.LIBRARY})
    public void o(boolean z10) {
        int iE = e();
        if (z10) {
            this.f51306c = iE | 4;
        } else {
            this.f51306c = iE;
        }
    }

    @e.a({"KotlinPropertyAccess"})
    @b1({b1.a.LIBRARY})
    public void p(boolean z10) {
        int i10 = this.f51306c & 4;
        this.f51306c = z10 ? i10 | 2 : i10 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(g()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
