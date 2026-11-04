package klipper;

import com.devtodev.core.data.consts.RequestParams;
import io.ktor.http.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f312362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f312363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f312364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f312365d;

    public u(int i10, @NotNull k pt) {
        Intrinsics.checkNotNullParameter(pt, "pt");
        this.f312362a = i10;
        k kVar = new k(0L, 0L, 3, null);
        this.f312363b = kVar;
        kVar.j(pt);
    }

    public final double a() {
        double dE = 0.0d;
        u uVarF = this;
        do {
            dE += (uVarF.g().f312363b.e() + uVarF.f312363b.e()) * (uVarF.g().f312363b.f() - uVarF.f312363b.f());
            uVarF = uVarF.f();
        } while (!Intrinsics.areEqual(uVarF, this));
        return dE * 0.5d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    public final int b(@NotNull k pt) {
        Intrinsics.checkNotNullParameter(pt, "pt");
        long jE = pt.e();
        long jF = pt.f();
        long jE2 = this.f312363b.e();
        long jF2 = this.f312363b.f();
        u uVarF = this;
        int i10 = 0;
        while (true) {
            uVarF = uVarF.f();
            long jE3 = uVarF.f312363b.e();
            long jF3 = uVarF.f312363b.f();
            if (jF3 != jF) {
                jF = jF;
            } else {
                if (jE3 == jE) {
                    break;
                }
                if (jF2 == jF) {
                    if ((jE3 > jE) == (jE2 < jE)) {
                        break;
                    }
                } else {
                    jF = jF;
                }
            }
            if ((jF2 < jF) != (jF3 < jF)) {
                if (jE2 >= jE) {
                    if (jE3 > jE) {
                        i10 = 1 - i10;
                    } else {
                        double d10 = ((jE2 - jE) * (jF3 - jF)) - ((jE3 - jE) * (jF2 - jF));
                        if (d10 == 0.0d) {
                            return -1;
                        }
                        if ((d10 > 0.0d) == (jF3 > jF2)) {
                            i10 = 1 - i10;
                        }
                    }
                } else if (jE3 > jE) {
                    double d11 = ((jE2 - jE) * (jF3 - jF)) - ((jE3 - jE) * (jF2 - jF));
                    if (d11 == 0.0d) {
                        return -1;
                    }
                    if ((d11 > 0.0d) == (jF3 > jF2)) {
                        i10 = 1 - i10;
                    }
                }
            }
            if (Intrinsics.areEqual(this, uVarF)) {
                return i10;
            }
            jE2 = jE3;
            jF2 = jF3;
            jF = jF;
        }
        return -1;
    }

    public final boolean c(@NotNull u polygon) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        u uVarF = polygon;
        do {
            int iB = b(uVarF.f312363b);
            if (iB >= 0) {
                return iB > 0;
            }
            uVarF = uVarF.f();
        } while (!Intrinsics.areEqual(uVarF, polygon));
        return true;
    }

    @NotNull
    public final u d() {
        u uVarG = g();
        uVarG.l(f());
        f().m(uVarG);
        uVarG.f312362a = 0;
        return uVarG;
    }

    public final int e() {
        return this.f312362a;
    }

    @NotNull
    public final u f() {
        u uVar = this.f312364c;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(t1.b.f296120h);
        return null;
    }

    @NotNull
    public final u g() {
        u uVar = this.f312365d;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RequestParams.PREV);
        return null;
    }

    @NotNull
    public final k h() {
        return this.f312363b;
    }

    public final boolean i(@NotNull k ip) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        u uVarF = this;
        while (!Intrinsics.areEqual(uVarF.f312363b, ip)) {
            uVarF = uVarF.f();
            if (Intrinsics.areEqual(uVarF, this)) {
                return false;
            }
        }
        return true;
    }

    public final void j() {
        u uVar = this;
        while (true) {
            u uVarF = uVar.f();
            uVar.l(uVar.g());
            uVar.m(uVarF);
            if (Intrinsics.areEqual(uVarF, this)) {
                return;
            } else {
                uVar = uVarF;
            }
        }
    }

    public final void k(int i10) {
        this.f312362a = i10;
    }

    public final void l(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f312364c = uVar;
    }

    public final void m(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f312365d = uVar;
    }
}
