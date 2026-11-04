package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n+ 2 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n1#1,316:1\n453#2:317\n*S KotlinDebug\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n*L\n127#1:317\n*E\n"})
public final class n2 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38081a;

        static {
            int[] iArr = new int[v2.a.values().length];
            try {
                iArr[v2.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v2.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v2.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v2.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v2.a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v2.a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38081a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f2  */
    @NotNull
    public static final k2.c a(@NotNull k2 k2Var) {
        q2 it = k2Var.iterator();
        float[] fArr = new float[8];
        v2.a aVarW = q2.W(it, fArr, 0, 2, null);
        boolean z10 = true;
        float fK = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (aVarW != v2.a.Done) {
            switch (a.f38081a[aVarW.ordinal()]) {
                case 1:
                    if (!z10) {
                        return fK >= 0.0f ? k2.c.Clockwise : k2.c.CounterClockwise;
                    }
                    f12 = fArr[0];
                    f13 = fArr[1];
                    z10 = false;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                    break;
                case 2:
                    float f14 = fArr[0];
                    float f15 = fArr[1];
                    float f16 = fArr[2];
                    float f17 = fArr[3];
                    fK += c0.k(f14, f15, f14, f15, f16, f17, f16, f17);
                    f10 = f16;
                    f11 = f17;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 3:
                    float f18 = fArr[0];
                    float f19 = fArr[1];
                    float f20 = fArr[2];
                    float f21 = fArr[3];
                    float f22 = fArr[4];
                    float f23 = fArr[5];
                    fK += c0.k(f18, f19, f18 + ((f20 - f18) * 0.6666667f), f19 + ((f21 - f19) * 0.6666667f), f22 + ((f20 - f22) * 0.6666667f), f23 + ((f21 - f23) * 0.6666667f), f22, f23);
                    f10 = f22;
                    f11 = f23;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 4:
                    break;
                case 5:
                    fK += c0.k(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    float f24 = fArr[6];
                    f11 = fArr[7];
                    f10 = f24;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 6:
                    if (Math.abs(f10 - f12) >= 1.05E-6f || Math.abs(f11 - f13) >= 1.05E-6f) {
                        fK += c0.k(f10, f11, f10, f11, f12, f13, f12, f13);
                        f10 = f12;
                        f11 = f13;
                    }
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 7:
                    if (fK >= 0.0f) {
                    }
                default:
                    throw new kotlin.k0();
            }
        }
        if (fK >= 0.0f) {
        }
    }

    @NotNull
    public static final List<k2> b(@NotNull k2 k2Var, @NotNull List<k2> list) {
        k2 k2VarA = u.a();
        q2 it = k2Var.iterator();
        float[] fArr = new float[8];
        v2.a aVarW = q2.W(it, fArr, 0, 2, null);
        k2 k2VarA2 = k2VarA;
        boolean z10 = true;
        boolean z11 = true;
        while (aVarW != v2.a.Done) {
            switch (a.f38081a[aVarW.ordinal()]) {
                case 1:
                    if (!z10 && !z11) {
                        list.add(k2VarA2);
                        k2VarA2 = u.a();
                    }
                    k2VarA2.A(fArr[0], fArr[1]);
                    z10 = false;
                    z11 = true;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 2:
                    k2VarA2.F(fArr[2], fArr[3]);
                    z11 = false;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 3:
                    k2VarA2.N(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z11 = false;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 4:
                case 7:
                    break;
                case 5:
                    k2VarA2.V(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z11 = false;
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                case 6:
                    k2VarA2.close();
                    aVarW = q2.W(it, fArr, 0, 2, null);
                    break;
                default:
                    throw new kotlin.k0();
            }
        }
        if (!z10 && !z11) {
            list.add(k2VarA2);
        }
        return list;
    }

    public static /* synthetic */ List c(k2 k2Var, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return b(k2Var, list);
    }

    private static final int d(v2.a aVar) {
        switch (a.f38081a[aVar.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
                return 8;
            case 6:
            case 7:
                return 0;
            default:
                throw new kotlin.k0();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public static final k2 e(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
        boolean z10;
        float[] fArr;
        q2 it = k2Var.iterator();
        int iQ0 = it.q0(false);
        ArrayList arrayList = new ArrayList(iQ0);
        ArrayList arrayList2 = new ArrayList(iQ0);
        float[] fArr2 = new float[8];
        for (v2.a aVarW = q2.W(it, fArr2, 0, 2, null); aVarW != v2.a.Done; aVarW = q2.W(it, fArr2, 0, 2, null)) {
            arrayList.add(aVarW);
            if (aVarW != v2.a.Close) {
                float[] fArrCopyOf = Arrays.copyOf(fArr2, d(aVarW));
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
                arrayList2.add(fArrCopyOf);
            }
        }
        int size = arrayList2.size();
        boolean z11 = false;
        boolean z12 = true;
        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
            if (z12) {
                size--;
                fArr = (float[]) arrayList2.get(size);
                int lastIndex = ArraysKt.getLastIndex(fArr);
                k2Var2.A(fArr[lastIndex - 1], fArr[lastIndex]);
                z10 = false;
            } else {
                z10 = z12;
                fArr = (float[]) arrayList2.get(size);
            }
            int i10 = size;
            switch (a.f38081a[((v2.a) arrayList.get(size2)).ordinal()]) {
                case 1:
                    if (z11) {
                        k2Var2.close();
                        z11 = false;
                    }
                    z12 = true;
                    size = i10;
                    break;
                case 2:
                    float[] fArr3 = fArr;
                    k2Var2.F(fArr3[0], fArr3[1]);
                    i10--;
                    size = i10;
                    z12 = z10;
                    break;
                case 3:
                    float[] fArr4 = fArr;
                    k2Var2.N(fArr4[2], fArr4[3], fArr4[0], fArr4[1]);
                    i10--;
                    size = i10;
                    z12 = z10;
                    break;
                case 4:
                case 7:
                    size = i10;
                    z12 = z10;
                    break;
                case 5:
                    float[] fArr5 = fArr;
                    k2Var2.V(fArr[4], fArr[5], fArr[2], fArr5[3], fArr5[0], fArr5[1]);
                    i10--;
                    size = i10;
                    z12 = z10;
                    break;
                case 6:
                    z11 = true;
                    size = i10;
                    z12 = z10;
                    break;
                default:
                    throw new kotlin.k0();
            }
        }
        if (z11) {
            k2Var2.close();
        }
        return k2Var2;
    }

    public static /* synthetic */ k2 f(k2 k2Var, k2 k2Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k2Var2 = u.a();
        }
        return e(k2Var, k2Var2);
    }
}
