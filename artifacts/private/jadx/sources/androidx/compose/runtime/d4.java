package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,5012:1\n34#2,4:5013\n397#3,3:5017\n354#3,6:5020\n364#3,3:5027\n367#3,9:5031\n400#3:5040\n397#3,3:5041\n354#3,6:5044\n364#3,3:5051\n367#3,9:5055\n400#3:5064\n397#3,3:5065\n354#3,6:5068\n364#3,3:5075\n367#3,9:5079\n400#3:5088\n397#3,3:5089\n354#3,6:5092\n364#3,3:5099\n367#3,9:5103\n400#3:5112\n397#3,3:5113\n354#3,6:5116\n364#3,3:5123\n367#3,9:5127\n400#3:5136\n1399#4:5026\n1270#4:5030\n1399#4:5050\n1270#4:5054\n1399#4:5074\n1270#4:5078\n1399#4:5098\n1270#4:5102\n1399#4:5122\n1270#4:5126\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n124#1:5013,4\n168#1:5017,3\n168#1:5020,6\n168#1:5027,3\n168#1:5031,9\n168#1:5040\n174#1:5041,3\n174#1:5044,6\n174#1:5051,3\n174#1:5055,9\n174#1:5064\n184#1:5065,3\n184#1:5068,6\n184#1:5075,3\n184#1:5079,9\n184#1:5088\n190#1:5089,3\n190#1:5092,6\n190#1:5099,3\n190#1:5103,9\n190#1:5112\n210#1:5113,3\n210#1:5116,6\n210#1:5123,3\n210#1:5127,9\n210#1:5136\n168#1:5026\n168#1:5030\n174#1:5050\n174#1:5054\n184#1:5074\n184#1:5078\n190#1:5098\n190#1:5102\n210#1:5122\n210#1:5126\n*E\n"})
final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<w2> f35582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<w2> f35585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<i2> f35586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f35587f;

    static final class a implements Function0<androidx.compose.runtime.collection.c<Object, w2>> {
        a() {
        }

        public final androidx.collection.k2<Object, Object> c() {
            androidx.collection.k2<Object, Object> k2VarM0 = m0.m0(d4.this.b().size());
            d4 d4Var = d4.this;
            int size = d4Var.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                w2 w2Var = d4Var.b().get(i10);
                androidx.compose.runtime.collection.c.a(k2VarM0, m0.S(w2Var), w2Var);
            }
            return k2VarM0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.runtime.collection.c<Object, w2> invoke() {
            return androidx.compose.runtime.collection.c.b(c());
        }
    }

    public d4(@NotNull List<w2> list, int i10) {
        this.f35582a = list;
        this.f35583b = i10;
        if (!(i10 >= 0)) {
            f4.d("Invalid start index");
        }
        this.f35585d = new ArrayList();
        androidx.collection.t1<i2> t1Var = new androidx.collection.t1<>(0, 1, null);
        int size = list.size();
        int iD = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w2 w2Var = this.f35582a.get(i11);
            t1Var.j0(w2Var.c(), new i2(i11, iD, w2Var.d()));
            iD += w2Var.d();
        }
        this.f35586e = t1Var;
        this.f35587f = kotlin.g0.c(new a());
    }

    public final int a() {
        return this.f35584c;
    }

    @NotNull
    public final List<w2> b() {
        return this.f35582a;
    }

    @NotNull
    public final androidx.collection.k2<Object, Object> c() {
        return ((androidx.compose.runtime.collection.c) this.f35587f.getValue()).r();
    }

    @Nullable
    public final w2 d(int i10, @Nullable Object obj) {
        return (w2) androidx.compose.runtime.collection.c.n(c(), obj != null ? new v2(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f35583b;
    }

    @NotNull
    public final List<w2> f() {
        return this.f35585d;
    }

    public final int g(@NotNull w2 w2Var) {
        i2 i2VarN = this.f35586e.n(w2Var.c());
        if (i2VarN != null) {
            return i2VarN.b();
        }
        return -1;
    }

    public final boolean h(@NotNull w2 w2Var) {
        return this.f35585d.add(w2Var);
    }

    public final void i(@NotNull w2 w2Var, int i10) {
        this.f35586e.j0(w2Var.c(), new i2(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            androidx.collection.t1<i2> t1Var = this.f35586e;
            Object[] objArr = t1Var.f12303c;
            long[] jArr = t1Var.f12301a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            i2 i2Var = (i2) objArr[(i13 << 3) + i15];
                            j11 = j12;
                            int iB = i2Var.b();
                            if (i10 <= iB && iB < i10 + i12) {
                                i2Var.e((iB - i10) + i11);
                            } else if (i11 <= iB && iB < i10) {
                                i2Var.e(iB + i12);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i15++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            androidx.collection.t1<i2> t1Var2 = this.f35586e;
            Object[] objArr2 = t1Var2.f12303c;
            long[] jArr2 = t1Var2.f12301a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr2[i16];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j14 & 255) < 128) {
                            i2 i2Var2 = (i2) objArr2[(i16 << 3) + i18];
                            int iB2 = i2Var2.b();
                            if (i10 <= iB2 && iB2 < i10 + i12) {
                                i2Var2.e((iB2 - i10) + i11);
                            } else if (i10 + 1 <= iB2 && iB2 < i11) {
                                i2Var2.e(iB2 - i12);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            androidx.collection.t1<i2> t1Var = this.f35586e;
            Object[] objArr = t1Var.f12303c;
            long[] jArr = t1Var.f12301a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j13 = jArr[i12];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            i2 i2Var = (i2) objArr[(i12 << 3) + i14];
                            j11 = j12;
                            int iC = i2Var.c();
                            if (iC == i10) {
                                i2Var.f(i11);
                            } else if (i11 <= iC && iC < i10) {
                                i2Var.f(iC + 1);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i13 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            androidx.collection.t1<i2> t1Var2 = this.f35586e;
            Object[] objArr2 = t1Var2.f12303c;
            long[] jArr2 = t1Var2.f12301a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j14 = jArr2[i15];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j14 & 255) < 128) {
                            i2 i2Var2 = (i2) objArr2[(i15 << 3) + i17];
                            int iC2 = i2Var2.c();
                            if (iC2 == i10) {
                                i2Var2.f(i11);
                            } else if (i10 + 1 <= iC2 && iC2 < i11) {
                                i2Var2.f(iC2 - 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }

    public final void l(int i10) {
        this.f35584c = i10;
    }

    public final int m(@NotNull w2 w2Var) {
        i2 i2VarN = this.f35586e.n(w2Var.c());
        if (i2VarN != null) {
            return i2VarN.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int iB;
        i2 i2VarN = this.f35586e.n(i10);
        if (i2VarN == null) {
            return false;
        }
        int iB2 = i2VarN.b();
        int iA = i11 - i2VarN.a();
        i2VarN.d(i11);
        if (iA == 0) {
            return true;
        }
        androidx.collection.t1<i2> t1Var = this.f35586e;
        Object[] objArr = t1Var.f12303c;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        i2 i2Var = (i2) objArr[(i12 << 3) + i14];
                        if (i2Var.b() >= iB2 && !Intrinsics.areEqual(i2Var, i2VarN) && (iB = i2Var.b() + iA) >= 0) {
                            i2Var.e(iB);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    public final int o(@NotNull w2 w2Var) {
        i2 i2VarN = this.f35586e.n(w2Var.c());
        return i2VarN != null ? i2VarN.a() : w2Var.d();
    }
}
