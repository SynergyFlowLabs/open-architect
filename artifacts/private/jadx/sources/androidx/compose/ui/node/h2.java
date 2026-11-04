package androidx.compose.ui.node;

import androidx.collection.d3;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/RulerTrackingMap\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,686:1\n231#2,3:687\n200#2,7:690\n211#2,3:698\n214#2,9:702\n234#2:711\n231#2,3:712\n200#2,7:715\n211#2,3:723\n214#2,9:727\n234#2:736\n1399#3:697\n1270#3:701\n1399#3:722\n1270#3:726\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/RulerTrackingMap\n*L\n639#1:687,3\n639#1:690,7\n639#1:698,3\n639#1:702,9\n639#1:711\n646#1:712,3\n646#1:715,7\n646#1:723,3\n646#1:727,9\n646#1:736\n639#1:697\n639#1:701\n646#1:722\n646#1:726\n*E\n"})
final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.s2[] f39769b = new androidx.compose.ui.layout.s2[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private float[] f39770c = new float[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private byte[] f39771d = new byte[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.collection.l2<u2<l0>> f39772e = d3.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.collection.l2<androidx.compose.ui.layout.s2> f39773f = d3.b();

    public final void a() {
        int i10 = this.f39768a;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f39769b[i11] = null;
            this.f39770c[i11] = Float.NaN;
            this.f39771d[i11] = 0;
        }
        this.f39768a = 0;
    }

    public final boolean b(@NotNull androidx.compose.ui.layout.s2 s2Var) {
        return ArraysKt.contains(this.f39769b, s2Var);
    }

    public final float c(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
        int iIndexOf = ArraysKt.indexOf(this.f39769b, s2Var);
        return iIndexOf < 0 ? f10 : this.f39770c[iIndexOf];
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0144 A[LOOP:5: B:51:0x0109->B:65:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0147 A[EDGE_INSN: B:84:0x0147->B:66:0x0147 BREAK  A[LOOP:5: B:51:0x0109->B:65:0x0144], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(boolean z10, @NotNull u0 u0Var, @Nullable androidx.collection.k2<androidx.compose.ui.layout.s2, androidx.collection.l2<u2<l0>>> k2Var) {
        char c10;
        char c11;
        long j10;
        long j11;
        l0 l0Var;
        char c12;
        int i10 = this.f39768a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = this.f39771d[i11];
            if (b10 == 3) {
                androidx.collection.l2<androidx.compose.ui.layout.s2> l2Var = this.f39773f;
                androidx.compose.ui.layout.s2 s2Var = this.f39769b[i11];
                Intrinsics.checkNotNull(s2Var);
                l2Var.d0(s2Var);
            } else if (b10 != 0 && k2Var != null) {
                androidx.compose.ui.layout.s2 s2Var2 = this.f39769b[i11];
                Intrinsics.checkNotNull(s2Var2);
                androidx.collection.l2<u2<l0>> l2VarL0 = k2Var.l0(s2Var2);
                if (l2VarL0 != null) {
                    this.f39772e.b0(l2VarL0);
                }
            }
        }
        int i12 = this.f39768a;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            c10 = 2;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr = this.f39771d;
            if (bArr[i13] == 2) {
                i14++;
            } else if (i14 > 0) {
                androidx.compose.ui.layout.s2[] s2VarArr = this.f39769b;
                s2VarArr[i13 - i14] = s2VarArr[i13];
            }
            bArr[i13] = 2;
            i13++;
        }
        int i15 = this.f39768a;
        for (int i16 = i15 - i14; i16 < i15; i16++) {
            this.f39769b[i16] = null;
        }
        this.f39768a -= i14;
        u0 u0VarQ2 = u0Var.q2();
        androidx.collection.l2<androidx.compose.ui.layout.s2> l2Var2 = this.f39773f;
        Object[] objArr = l2Var2.f12171b;
        long[] jArr = l2Var2.f12170a;
        int length = jArr.length - 2;
        char c13 = 7;
        if (length >= 0) {
            int i17 = 0;
            j10 = 128;
            while (true) {
                long j12 = jArr[i17];
                j11 = 255;
                if ((((~j12) << c13) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j12 & 255) < 128) {
                            (u0VarQ2 == null ? u0Var : u0VarQ2).z2((androidx.compose.ui.layout.s2) objArr[(i17 << 3) + i19]);
                        }
                        j12 >>= 8;
                        i19++;
                        c10 = c10;
                        c13 = c13;
                    }
                    c12 = c10;
                    c11 = c13;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    c12 = c10;
                    c11 = c13;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                c10 = c12;
                c13 = c11;
            }
        } else {
            c11 = 7;
            j10 = 128;
            j11 = 255;
        }
        this.f39773f.L();
        androidx.collection.l2<u2<l0>> l2Var3 = this.f39772e;
        Object[] objArr2 = l2Var3.f12171b;
        long[] jArr2 = l2Var3.f12170a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j13 = jArr2[i20];
                if ((((~j13) << c11) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i20 != length2) {
                        break;
                        break;
                    }
                    i20++;
                } else {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j13 & j11) < j10 && (l0Var = (l0) ((u2) objArr2[(i20 << 3) + i22]).get()) != null) {
                            if (z10) {
                                l0Var.N1(false);
                            } else {
                                l0Var.R1(false);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    } else if (i20 != length2) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
        }
        this.f39772e.L();
    }

    public final void e(@NotNull androidx.compose.ui.layout.s2 s2Var, float f10) {
        int iIndexOf = ArraysKt.indexOf(this.f39769b, s2Var);
        if (iIndexOf >= 0) {
            float[] fArr = this.f39770c;
            if (fArr[iIndexOf] != f10) {
                fArr[iIndexOf] = f10;
                this.f39771d[iIndexOf] = 1;
                return;
            } else {
                byte[] bArr = this.f39771d;
                if (bArr[iIndexOf] == 2) {
                    bArr[iIndexOf] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = this.f39768a;
        androidx.compose.ui.layout.s2[] s2VarArr = this.f39769b;
        if (i10 == s2VarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(s2VarArr, i11);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f39769b = (androidx.compose.ui.layout.s2[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(this.f39770c, i11);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f39770c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(this.f39771d, i11);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f39771d = bArrCopyOf;
        }
        this.f39769b[i10] = s2Var;
        this.f39771d[i10] = 3;
        this.f39770c[i10] = f10;
        this.f39768a++;
    }
}
