package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,352:1\n277#1,7:353\n277#1,7:360\n277#1,7:367\n277#1,7:374\n277#1,7:381\n277#1,7:388\n277#1,7:395\n277#1,7:402\n277#1,7:409\n277#1,7:416\n277#1,7:423\n277#1,7:430\n277#1,7:437\n277#1,7:444\n277#1,7:451\n277#1,7:458\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:353,7\n157#1:360,7\n161#1:367,7\n165#1:374,7\n169#1:381,7\n173#1:388,7\n177#1:395,7\n188#1:402,7\n199#1:409,7\n208#1:416,7\n217#1:423,7\n226#1:430,7\n235#1:437,7\n239#1:444,7\n243#1:451,7\n255#1:458,7\n*E\n"})
public final class i {
    private static final int A = 4;
    private static final int B = 2;
    private static final int C = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f38485a = 'z';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f38486b = 'Z';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f38487c = 'm';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f38488d = 'M';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f38489e = 'l';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f38490f = 'L';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f38491g = 'h';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f38492h = 'H';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f38493i = 'v';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f38494j = 'V';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f38495k = 'c';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char f38496l = 'C';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final char f38497m = 's';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char f38498n = 'S';

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final char f38499o = 'q';

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final char f38500p = 'Q';

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final char f38501q = 't';

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final char f38502r = 'T';

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final char f38503s = 'a';

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final char f38504t = 'A';

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f38505u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f38506v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f38507w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f38508x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f38509y = 6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f38510z = 4;

    public static final void a(char c10, @NotNull ArrayList<h> arrayList, @NotNull float[] fArr, int i10) {
        int i11 = 0;
        switch (c10) {
            case 'A':
                int i12 = i10 - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new h.a(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'C':
                int i14 = i10 - 6;
                while (i11 <= i14) {
                    arrayList.add(new h.c(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'H':
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new h.d(fArr[i11]));
                    i11++;
                }
                return;
            case 'L':
                int i16 = i10 - 2;
                while (i11 <= i16) {
                    arrayList.add(new h.e(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                b(arrayList, fArr, i10);
                return;
            case com.planner5d.library.engine.input.f.b.f160732u0 /* 81 */:
                int i17 = i10 - 4;
                while (i11 <= i17) {
                    arrayList.add(new h.g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                int i18 = i10 - 4;
                while (i11 <= i18) {
                    arrayList.add(new h.C0293h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case com.planner5d.library.engine.input.f.b.B0 /* 84 */:
                int i19 = i10 - 2;
                while (i11 <= i19) {
                    arrayList.add(new h.i(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                int i20 = i10 - 1;
                while (i11 <= i20) {
                    arrayList.add(new h.s(fArr[i11]));
                    i11++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(h.b.f38433c);
                return;
            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                int i21 = i10 - 7;
                for (int i22 = 0; i22 <= i21; i22 += 7) {
                    arrayList.add(new h.j(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
                }
                return;
            case 'c':
                int i23 = i10 - 6;
                while (i11 <= i23) {
                    arrayList.add(new h.k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'h':
                int i24 = i10 - 1;
                while (i11 <= i24) {
                    arrayList.add(new h.l(fArr[i11]));
                    i11++;
                }
                return;
            case 'l':
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new h.m(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'm':
                d(arrayList, fArr, i10);
                return;
            case 'q':
                int i26 = i10 - 4;
                while (i11 <= i26) {
                    arrayList.add(new h.o(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 's':
                int i27 = i10 - 4;
                while (i11 <= i27) {
                    arrayList.add(new h.p(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case androidx.media3.extractor.metadata.dvbsi.b.f67479d /* 116 */:
                int i28 = i10 - 2;
                while (i11 <= i28) {
                    arrayList.add(new h.q(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'v':
                int i29 = i10 - 1;
                while (i11 <= i29) {
                    arrayList.add(new h.r(fArr[i11]));
                    i11++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    private static final void b(List<h> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new h.f(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new h.e(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    private static final void c(List<h> list, float[] fArr, int i10, int i11, Function2<? super float[], ? super Integer, ? extends h> function2) {
        int i12 = i10 - i11;
        int i13 = 0;
        while (i13 <= i12) {
            list.add(function2.invoke(fArr, Integer.valueOf(i13)));
            i13 += i11;
        }
    }

    private static final void d(List<h> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new h.n(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new h.m(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
