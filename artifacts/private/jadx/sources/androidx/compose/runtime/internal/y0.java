package androidx.compose.runtime.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12734#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36150d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final long[] f36152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object[] f36153c;

    public y0(int i10, @NotNull long[] jArr, @NotNull Object[] objArr) {
        this.f36151a = i10;
        this.f36152b = jArr;
        this.f36153c = objArr;
    }

    private final int a(long j10) {
        int i10 = this.f36151a - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j11 = this.f36152b[i12] - j10;
                    if (j11 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j12 = this.f36152b[0];
            if (j12 == j10) {
                return 0;
            }
            if (j12 > j10) {
                return -2;
            }
        }
        return -1;
    }

    @Nullable
    public final Object b(long j10) {
        int iA = a(j10);
        if (iA >= 0) {
            return this.f36153c[iA];
        }
        return null;
    }

    @NotNull
    public final y0 c(long j10, @Nullable Object obj) {
        int i10 = this.f36151a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f36153c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (i11 < i13 && i14 < i10) {
                long j11 = this.f36152b[i14];
                Object obj3 = this.f36153c[i14];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j11;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j10;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = this.f36152b[i14];
                    Object obj4 = this.f36153c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j12;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr[0] = obj;
        }
        return new y0(i13, jArr, objArr);
    }

    public final boolean d(long j10, @Nullable Object obj) {
        int iA = a(j10);
        if (iA < 0) {
            return false;
        }
        this.f36153c[iA] = obj;
        return true;
    }
}
