package androidx.compose.runtime.snapshots;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotDoubleIndexHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,201:1\n55#2:202\n58#2,2:203\n55#2:205\n31#2:206\n55#2:207\n55#2:208\n55#2:209\n55#2:210\n31#2:211\n55#2:212\n31#2:213\n55#2:214\n31#2:215\n55#2:216\n31#2:217\n55#2:218\n55#2,5:219\n58#2,2:224\n62#2:226\n65#2,2:227\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n*L\n56#1:202\n66#1:203,2\n92#1:205\n92#1:206\n101#1:207\n102#1:208\n108#1:209\n112#1:210\n112#1:211\n132#1:212\n132#1:213\n133#1:214\n133#1:215\n137#1:216\n137#1:217\n153#1:218\n154#1:219,5\n155#1:224,2\n166#1:226\n171#1:227,2\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36582f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private long[] f36584b = w.o(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private int[] f36585c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private int[] f36586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36587e;

    public s() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f36586d = iArr;
    }

    private final int b() {
        int length = this.f36586d.length;
        if (this.f36587e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            ArraysKt.copyInto$default(this.f36586d, iArr, 0, 0, 0, 14, (Object) null);
            this.f36586d = iArr;
        }
        int i13 = this.f36587e;
        this.f36587e = this.f36586d[i13];
        return i13;
    }

    private final void c(int i10) {
        int length = this.f36584b.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrO = w.o(i11);
        int[] iArr = new int[i11];
        ArraysKt.copyInto$default(this.f36584b, jArrO, 0, 0, 0, 12, (Object) null);
        int i12 = 6 & 0;
        ArraysKt.copyInto$default(this.f36585c, iArr, 0, 0, 0, 14, (Object) null);
        this.f36584b = jArrO;
        this.f36585c = iArr;
    }

    private final void d(int i10) {
        this.f36586d[i10] = this.f36587e;
        this.f36587e = i10;
    }

    public static /* synthetic */ long g(s sVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return sVar.f(j10);
    }

    private final void i(int i10) {
        long[] jArr = this.f36584b;
        int i11 = this.f36583a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < this.f36583a && Intrinsics.compare(jArr[i12], jArr[i13]) < 0) {
                if (Intrinsics.compare(jArr[i12], jArr[i10]) >= 0) {
                    break;
                }
                k(i12, i10);
                i10 = i12;
            } else {
                if (Intrinsics.compare(jArr[i13], jArr[i10]) >= 0) {
                    break;
                }
                k(i13, i10);
                i10 = i13;
            }
        }
    }

    private final void j(int i10) {
        long[] jArr = this.f36584b;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i11], j10) <= 0) {
                return;
            }
            k(i11, i10);
            i10 = i11;
        }
    }

    private final void k(int i10, int i11) {
        long[] jArr = this.f36584b;
        int[] iArr = this.f36585c;
        int[] iArr2 = this.f36586d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public final int a(long j10) {
        c(this.f36583a + 1);
        int i10 = this.f36583a;
        this.f36583a = i10 + 1;
        int iB = b();
        this.f36584b[i10] = j10;
        this.f36585c[i10] = iB;
        this.f36586d[iB] = i10;
        j(i10);
        return iB;
    }

    public final int e() {
        return this.f36583a;
    }

    public final long f(long j10) {
        return this.f36583a > 0 ? this.f36584b[0] : j10;
    }

    public final void h(int i10) {
        int i11 = this.f36586d[i10];
        k(i11, this.f36583a - 1);
        this.f36583a--;
        j(i11);
        i(i11);
        d(i10);
    }

    @lm.n
    public final void l() {
        int i10 = this.f36583a;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            long[] jArr = this.f36584b;
            if (Intrinsics.compare(jArr[(i12 >> 1) - 1], jArr[i11]) > 0) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    @lm.n
    public final void m(int i10, long j10) {
        int i11 = this.f36586d[i10];
        if (this.f36585c[i11] != i10) {
            throw new IllegalStateException(("Index for handle " + i10 + " is corrupted").toString());
        }
        if (this.f36584b[i11] == j10) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + i10 + " was " + this.f36584b[i11] + " but was supposed to be " + j10).toString());
    }
}
