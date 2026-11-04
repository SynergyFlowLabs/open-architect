package androidx.compose.ui.semantics;

import androidx.collection.b3;
import androidx.collection.c3;
import androidx.collection.d3;
import androidx.collection.k2;
import androidx.collection.l2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.platform.w2;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,210:1\n320#2:211\n320#2:212\n320#2:213\n385#2:215\n357#2,4:216\n329#2,6:220\n339#2,3:227\n342#2,9:231\n361#2:240\n386#2:241\n357#2,4:242\n329#2,6:246\n339#2,3:253\n342#2,9:257\n361#2:266\n357#2,4:267\n329#2,6:271\n339#2,3:278\n342#2,9:282\n361#2:291\n357#2,4:292\n329#2,6:296\n339#2,3:303\n342#2,9:307\n361#2:316\n1#3:214\n1399#4:226\n1270#4:230\n1399#4:252\n1270#4:256\n1399#4:277\n1270#4:281\n1399#4:302\n1270#4:306\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n48#1:211\n56#1:212\n62#1:213\n90#1:215\n90#1:216,4\n90#1:220,6\n90#1:227,3\n90#1:231,9\n90#1:240\n90#1:241\n112#1:242,4\n112#1:246,6\n112#1:253,3\n112#1:257,9\n112#1:266\n139#1:267,4\n139#1:271,6\n139#1:278,3\n139#1:282,9\n139#1:291\n196#1:292,4\n196#1:296,6\n196#1:303,3\n196#1:307,9\n196#1:316\n90#1:226\n90#1:230\n112#1:252\n112#1:256\n139#1:277\n139#1:281\n196#1:302\n196#1:306\n*E\n"})
public final class SemanticsConfiguration implements e0, Iterable<Map.Entry<? extends d0<?>, ? extends Object>>, qj.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41060f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<d0<?>, Object> f41061a = b3.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<d0<?>, ? extends Object> f41062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private l2<d0<?>> f41063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41065e;

    public final void A(boolean z10) {
        this.f41065e = z10;
    }

    public final void B(boolean z10) {
        this.f41064d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.e0
    public <T> void c(@NotNull d0<T> d0Var, T t10) {
        if ((t10 instanceof a) && i(d0Var)) {
            Object objP = this.f41061a.p(d0Var);
            Intrinsics.checkNotNull(objP, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objP;
            k2<d0<?>, Object> k2Var = this.f41061a;
            a aVar2 = (a) t10;
            String strB = aVar2.b();
            if (strB == null) {
                strB = aVar.b();
            }
            kotlin.x xVarA = aVar2.a();
            if (xVarA == null) {
                xVarA = aVar.a();
            }
            k2Var.q0(d0Var, new a(strB, xVarA));
        } else {
            this.f41061a.q0(d0Var, t10);
        }
        if (d0Var.a() != null) {
            if (this.f41063c == null) {
                this.f41063c = d3.b();
            }
            l2<d0<?>> l2Var = this.f41063c;
            if (l2Var != null) {
                l2Var.C(d0Var);
            }
        }
    }

    public final void d(@NotNull SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.f41064d) {
            this.f41064d = true;
        }
        if (semanticsConfiguration.f41065e) {
            this.f41065e = true;
        }
        k2<d0<?>, Object> k2Var = semanticsConfiguration.f41061a;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        d0<?> d0Var = (d0) obj;
                        if (!this.f41061a.f(d0Var)) {
                            this.f41061a.q0(d0Var, obj2);
                        } else if (obj2 instanceof a) {
                            Object objP = this.f41061a.p(d0Var);
                            Intrinsics.checkNotNull(objP, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            a aVar = (a) objP;
                            k2<d0<?>, Object> k2Var2 = this.f41061a;
                            String strB = aVar.b();
                            if (strB == null) {
                                strB = ((a) obj2).b();
                            }
                            String str = strB;
                            kotlin.x xVarA = aVar.a();
                            if (xVarA == null) {
                                xVarA = ((a) obj2).a();
                            }
                            k2Var2.q0(d0Var, new a(str, xVarA));
                        }
                    }
                    j10 >>= i11;
                    i13++;
                    i11 = i11;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.areEqual(this.f41061a, semanticsConfiguration.f41061a) && this.f41064d == semanticsConfiguration.f41064d && this.f41065e == semanticsConfiguration.f41065e;
    }

    public int hashCode() {
        return (((this.f41061a.hashCode() * 31) + Boolean.hashCode(this.f41064d)) * 31) + Boolean.hashCode(this.f41065e);
    }

    public final <T> boolean i(@NotNull d0<T> d0Var) {
        return this.f41061a.g(d0Var);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<? extends d0<?>, ? extends Object>> iterator() {
        Map<d0<?>, ? extends Object> mapE = this.f41062b;
        if (mapE == null) {
            mapE = this.f41061a.e();
            this.f41062b = mapE;
        }
        return mapE.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005c A[LOOP:0: B:5:0x0015->B:19:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[SYNTHETIC] */
    public final boolean k() {
        k2<d0<?>, Object> k2Var = this.f41061a;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (((d0) obj).e()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public final SemanticsConfiguration l() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f41064d = this.f41064d;
        semanticsConfiguration.f41065e = this.f41065e;
        semanticsConfiguration.f41061a.g0(this.f41061a);
        return semanticsConfiguration;
    }

    public final <T> T m(@NotNull d0<T> d0Var) {
        T t10 = (T) this.f41061a.p(d0Var);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + d0Var + " - consider getOrElse or getOrNull");
    }

    @Nullable
    public final c3<d0<?>> n() {
        return this.f41063c;
    }

    public final <T> T p(@NotNull d0<T> d0Var, @NotNull Function0<? extends T> function0) {
        T tInvoke = (T) this.f41061a.p(d0Var);
        if (tInvoke == null) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }

    @Nullable
    public final <T> T s(@NotNull d0<T> d0Var, @NotNull Function0<? extends T> function0) {
        T tInvoke = (T) this.f41061a.p(d0Var);
        if (tInvoke == null) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }

    @NotNull
    public final k2<d0<?>, Object> t() {
        return this.f41061a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e A[DONT_INVERT, PHI: r4
      0x007e: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0043, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0080 A[LOOP:0: B:11:0x0035->B:21:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[EDGE_INSN: B:25:0x0083->B:22:0x0083 BREAK  A[LOOP:0: B:11:0x0035->B:21:0x0080], SYNTHETIC] */
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f41064d) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f41065e) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        k2<d0<?>, Object> k2Var = this.f41061a;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb2.append(str);
                            sb2.append(((d0) obj).c());
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return w2.b(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final boolean u() {
        return this.f41065e;
    }

    public final boolean v() {
        return this.f41064d;
    }

    public final void w(@NotNull SemanticsConfiguration semanticsConfiguration) {
        k2<d0<?>, Object> k2Var = semanticsConfiguration.f41061a;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        d0<?> d0Var = (d0) obj;
                        Object objP = this.f41061a.p(d0Var);
                        Intrinsics.checkNotNull(d0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objF = d0Var.f(objP, obj2);
                        if (objF != null) {
                            this.f41061a.q0(d0Var, objF);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
