package androidx.compose.runtime.snapshots;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotWeakSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n*L\n1#1,243:1\n27#2,2:244\n27#2,2:246\n27#2,2:248\n*S KotlinDebug\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n*L\n74#1:244,2\n80#1:246,2\n96#1:248,2\n*E\n"})
public final class t0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36590d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f36592b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.internal.e1<T>[] f36593c = new androidx.compose.runtime.internal.e1[16];

    private final int b(T t10, int i10) {
        int i11 = this.f36591a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f36592b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    androidx.compose.runtime.internal.e1<T> e1Var = this.f36593c[i13];
                    return t10 == (e1Var != null ? e1Var.get() : null) ? i13 : c(i13, t10, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i10, T t10, int i11) {
        int i12 = i10 - 1;
        while (true) {
            if (-1 >= i12 || this.f36592b[i12] != i11) {
                break;
            }
            androidx.compose.runtime.internal.e1<T> e1Var = this.f36593c[i12];
            if ((e1Var != null ? e1Var.get() : null) == t10) {
                return i12;
            }
            i12--;
        }
        int i13 = this.f36591a;
        for (int i14 = i10 + 1; i14 < i13; i14++) {
            if (this.f36592b[i14] != i11) {
                return -(i14 + 1);
            }
            androidx.compose.runtime.internal.e1<T> e1Var2 = this.f36593c[i14];
            if ((e1Var2 != null ? e1Var2.get() : null) == t10) {
                return i14;
            }
        }
        return -(this.f36591a + 1);
    }

    public final boolean a(@NotNull T t10) {
        int iB;
        int i10 = this.f36591a;
        int iA = androidx.compose.runtime.internal.x0.a(t10);
        if (i10 > 0) {
            iB = b(t10, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        androidx.compose.runtime.internal.e1<T>[] e1VarArr = this.f36593c;
        int length = e1VarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            androidx.compose.runtime.internal.e1<T>[] e1VarArr2 = new androidx.compose.runtime.internal.e1[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            System.arraycopy(e1VarArr, i11, e1VarArr2, i13, i10 - i11);
            System.arraycopy(this.f36593c, 0, e1VarArr2, 0, i11);
            ArraysKt.copyInto(this.f36592b, iArr, i13, i11, i10);
            ArraysKt.copyInto$default(this.f36592b, iArr, 0, 0, i11, 6, (Object) null);
            this.f36593c = e1VarArr2;
            this.f36592b = iArr;
        } else {
            int i14 = i11 + 1;
            System.arraycopy(e1VarArr, i11, e1VarArr, i14, i10 - i11);
            int[] iArr2 = this.f36592b;
            ArraysKt.copyInto(iArr2, iArr2, i14, i11, i10);
        }
        this.f36593c[i11] = new androidx.compose.runtime.internal.e1<>(t10);
        this.f36592b[i11] = iA;
        this.f36591a++;
        return true;
    }

    @NotNull
    public final int[] d() {
        return this.f36592b;
    }

    public final int e() {
        return this.f36591a;
    }

    @NotNull
    public final androidx.compose.runtime.internal.e1<T>[] f() {
        return this.f36593c;
    }

    @lm.n
    public final boolean g() {
        androidx.compose.runtime.internal.e1<T> e1Var;
        int i10 = this.f36591a;
        androidx.compose.runtime.internal.e1<T>[] e1VarArr = this.f36593c;
        int[] iArr = this.f36592b;
        int length = e1VarArr.length;
        if (i10 > length) {
            return false;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            if (i13 < i11 || (e1Var = e1VarArr[i12]) == null) {
                return false;
            }
            T t10 = e1Var.get();
            if (t10 != null && i13 != androidx.compose.runtime.internal.x0.a(t10)) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        while (i10 < length) {
            if (iArr[i10] == 0 && e1VarArr[i10] == null) {
                i10++;
            }
            return false;
        }
        return true;
    }

    public final void h(@NotNull Function1<? super T, Boolean> function1) {
        int iE = e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            androidx.compose.runtime.internal.e1<T> e1Var = f()[i10];
            T t10 = e1Var != null ? e1Var.get() : null;
            if (t10 != null && !function1.invoke(t10).booleanValue()) {
                if (i11 != i10) {
                    f()[i11] = e1Var;
                    d()[i11] = d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            f()[i12] = null;
            d()[i12] = 0;
        }
        if (i11 != iE) {
            j(i11);
        }
    }

    public final void i(@NotNull int[] iArr) {
        this.f36592b = iArr;
    }

    public final void j(int i10) {
        this.f36591a = i10;
    }

    public final void k(@NotNull androidx.compose.runtime.internal.e1<T>[] e1VarArr) {
        this.f36593c = e1VarArr;
    }
}
