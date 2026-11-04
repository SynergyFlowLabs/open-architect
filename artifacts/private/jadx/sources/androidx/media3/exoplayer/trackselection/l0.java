package androidx.media3.exoplayer.trackselection;

import androidx.annotation.p0;
import androidx.media3.common.i4;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.c5;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5[] f65719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0[] f65720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4 f65721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Object f65722e;

    @Deprecated
    public l0(c5[] c5VarArr, c0[] c0VarArr, @p0 Object obj) {
        this(c5VarArr, c0VarArr, i4.f60639b, obj);
    }

    public boolean a(@p0 l0 l0Var) {
        if (l0Var == null || l0Var.f65720c.length != this.f65720c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f65720c.length; i10++) {
            if (!b(l0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@p0 l0 l0Var, int i10) {
        if (l0Var == null) {
            return false;
        }
        return Objects.equals(this.f65719b[i10], l0Var.f65719b[i10]) && Objects.equals(this.f65720c[i10], l0Var.f65720c[i10]);
    }

    public boolean c(int i10) {
        return this.f65719b[i10] != null;
    }

    public l0(c5[] c5VarArr, c0[] c0VarArr, i4 i4Var, @p0 Object obj) {
        androidx.media3.common.util.a.a(c5VarArr.length == c0VarArr.length);
        this.f65719b = c5VarArr;
        this.f65720c = (c0[]) c0VarArr.clone();
        this.f65721d = i4Var;
        this.f65722e = obj;
        this.f65718a = c5VarArr.length;
    }
}
