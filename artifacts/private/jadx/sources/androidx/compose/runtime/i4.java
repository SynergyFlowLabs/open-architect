package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,4061:1\n366#2:4062\n65#2:4063\n65#2:4064\n363#2:4065\n366#2:4066\n65#2:4067\n366#2:4072\n65#2:4073\n65#2:4074\n65#2:4075\n65#2:4076\n4802#3,4:4068\n58#4,4:4077\n58#4,4:4081\n905#5:4085\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3973#1:4062\n3973#1:4063\n3975#1:4064\n3990#1:4065\n3992#1:4066\n3998#1:4067\n4005#1:4072\n4008#1:4073\n4010#1:4074\n4011#1:4075\n4042#1:4076\n3998#1:4068,4\n4046#1:4077,4\n4047#1:4081,4\n3969#1:4085\n*E\n"})
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.r1 f35869a;

    private /* synthetic */ i4(androidx.collection.r1 r1Var) {
        this.f35869a = r1Var;
    }

    public static final void a(androidx.collection.r1 r1Var, int i10) {
        if (r1Var.f12216b == 0 || !(r1Var.w(0) == i10 || r1Var.w(r1Var.f12216b - 1) == i10)) {
            int i11 = r1Var.f12216b;
            r1Var.b0(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iW = r1Var.w(i12);
                if (i10 <= iW) {
                    break;
                }
                r1Var.w0(i11, iW);
                i11 = i12;
            }
            r1Var.w0(i11, i10);
        }
    }

    public static final /* synthetic */ i4 b(androidx.collection.r1 r1Var) {
        return new i4(r1Var);
    }

    @NotNull
    public static androidx.collection.r1 c(@NotNull androidx.collection.r1 r1Var) {
        return r1Var;
    }

    public static /* synthetic */ androidx.collection.r1 d(androidx.collection.r1 r1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            r1Var = new androidx.collection.r1(0, i11, null);
        }
        return c(r1Var);
    }

    public static boolean e(androidx.collection.r1 r1Var, Object obj) {
        return (obj instanceof i4) && Intrinsics.areEqual(r1Var, ((i4) obj).m());
    }

    public static final boolean f(androidx.collection.r1 r1Var, androidx.collection.r1 r1Var2) {
        return Intrinsics.areEqual(r1Var, r1Var2);
    }

    public static int g(androidx.collection.r1 r1Var) {
        return r1Var.hashCode();
    }

    public static final boolean h(androidx.collection.r1 r1Var) {
        return r1Var.f12216b == 0;
    }

    public static final boolean i(androidx.collection.r1 r1Var) {
        return r1Var.f12216b != 0;
    }

    public static final int j(androidx.collection.r1 r1Var) {
        return r1Var.m();
    }

    public static final int k(androidx.collection.r1 r1Var) {
        int iW;
        int i10 = r1Var.f12216b;
        int iW2 = r1Var.w(0);
        while (r1Var.f12216b != 0 && r1Var.w(0) == iW2) {
            r1Var.w0(0, r1Var.V());
            r1Var.s0(r1Var.f12216b - 1);
            int i11 = r1Var.f12216b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iW3 = r1Var.w(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iW4 = r1Var.w(i15);
                if (i14 < i11 && (iW = r1Var.w(i14)) > iW4) {
                    if (iW <= iW3) {
                        break;
                    }
                    r1Var.w0(i13, iW);
                    r1Var.w0(i14, iW3);
                    i13 = i14;
                } else {
                    if (iW4 <= iW3) {
                        break;
                    }
                    r1Var.w0(i13, iW4);
                    r1Var.w0(i15, iW3);
                    i13 = i15;
                }
            }
        }
        return iW2;
    }

    public static String l(androidx.collection.r1 r1Var) {
        return "PrioritySet(list=" + r1Var + ')';
    }

    public static final void n(androidx.collection.r1 r1Var) {
        int i10 = r1Var.f12216b;
        int i11 = i10 / 2;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            boolean z10 = true;
            if (!(r1Var.w(i12) >= r1Var.w(i14 + (-1)))) {
                f4.e("Check failed.");
            }
            if (i14 < i10 && r1Var.w(i12) < r1Var.w(i14)) {
                z10 = false;
            }
            if (!z10) {
                f4.e("Check failed.");
            }
            i12 = i13;
        }
    }

    public boolean equals(Object obj) {
        return e(this.f35869a, obj);
    }

    public int hashCode() {
        return g(this.f35869a);
    }

    public final /* synthetic */ androidx.collection.r1 m() {
        return this.f35869a;
    }

    public String toString() {
        return l(this.f35869a);
    }
}
