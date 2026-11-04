package com.ionspin.kotlin.bignum.decimal;

import androidx.collection.g3;
import ca.h;
import com.facebook.appevents.p;
import com.ionspin.kotlin.bignum.integer.f;
import com.ionspin.kotlin.bignum.integer.g;
import com.ionspin.kotlin.bignum.integer.j;
import com.ionspin.kotlin.bignum.integer.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.n1;
import kotlin.ranges.r;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBigDecimal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigDecimal.kt\ncom/ionspin/kotlin/bignum/decimal/BigDecimal\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,2333:1\n384#2,4:2334\n384#2,4:2338\n384#2,4:2342\n*S KotlinDebug\n*F\n+ 1 BigDecimal.kt\ncom/ionspin/kotlin/bignum/decimal/BigDecimal\n*L\n2178#1:2334,4\n2302#1:2338,4\n2317#1:2342,4\n*E\n"})
public final class a implements ca.a<a>, ca.e<a>, h<a>, Comparable<Object> {

    @NotNull
    private static final a X;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C1436a f131005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f131006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final a f131007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final a f131008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final a f131009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f131010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final double[] f131011o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final a f131012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final a f131013t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final float[] f131014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final a f131015w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f131016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f131017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f131018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.ionspin.kotlin.bignum.decimal.c f131019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f131020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e f131021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f131022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f131023h;

    /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.decimal.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nBigDecimal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigDecimal.kt\ncom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,2333:1\n384#2,4:2334\n384#2,4:2338\n151#2,6:2342\n163#2,6:2348\n151#2,6:2354\n163#2,6:2360\n151#2,6:2366\n*S KotlinDebug\n*F\n+ 1 BigDecimal.kt\ncom/ionspin/kotlin/bignum/decimal/BigDecimal$Companion\n*L\n646#1:2334,4\n665#1:2338,4\n917#1:2342,6\n923#1:2348,6\n973#1:2354,6\n979#1:2360,6\n990#1:2366,6\n*E\n"})
    public static final class C1436a implements ca.a.InterfaceC0803a<a> {

        /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.decimal.a$a$a, reason: collision with other inner class name */
        private enum EnumC1437a {
            FIVE,
            LESS_THAN_FIVE,
            MORE_THAN_FIVE;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f131028e = kotlin.enums.c.c(k());

            @NotNull
            public static kotlin.enums.a<EnumC1437a> l() {
                return f131028e;
            }
        }

        /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.decimal.a$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f131029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f131030b;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.ZERO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f131029a = iArr;
                int[] iArr2 = new int[e.values().length];
                try {
                    iArr2[e.AWAY_FROM_ZERO.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[e.TOWARDS_ZERO.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[e.CEILING.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[e.FLOOR.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[e.ROUND_HALF_AWAY_FROM_ZERO.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[e.ROUND_HALF_TOWARDS_ZERO.ordinal()] = 6;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[e.ROUND_HALF_CEILING.ordinal()] = 7;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[e.ROUND_HALF_FLOOR.ordinal()] = 8;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[e.ROUND_HALF_TO_EVEN.ordinal()] = 9;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[e.ROUND_HALF_TO_ODD.ordinal()] = 10;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[e.NONE.ordinal()] = 11;
                } catch (NoSuchFieldError unused14) {
                }
                f131030b = iArr2;
            }
        }

        public /* synthetic */ C1436a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a B(C1436a c1436a, com.ionspin.kotlin.bignum.integer.a aVar, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.A(aVar, cVar);
        }

        public static /* synthetic */ a D(C1436a c1436a, com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return c1436a.C(aVar, j10, cVar);
        }

        public static /* synthetic */ a F0(C1436a c1436a, String str, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.E0(str, cVar);
        }

        public static /* synthetic */ a G(C1436a c1436a, byte b10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.F(b10, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.ionspin.kotlin.bignum.decimal.c G0(com.ionspin.kotlin.bignum.decimal.c cVar, com.ionspin.kotlin.bignum.decimal.c cVar2, com.ionspin.kotlin.bignum.decimal.c cVar3) {
            if (cVar3 != null) {
                return cVar3;
            }
            if (cVar == null && cVar2 == null) {
                return new com.ionspin.kotlin.bignum.decimal.c(0L, null, 0L, 7, null);
            }
            if (cVar == null && cVar2 != null) {
                return cVar2;
            }
            if (cVar2 == null && cVar != null) {
                return cVar;
            }
            Intrinsics.checkNotNull(cVar);
            e eVarI = cVar.i();
            Intrinsics.checkNotNull(cVar2);
            if (eVarI == cVar2.i()) {
                return cVar.h() >= cVar2.h() ? cVar : cVar2;
            }
            throw new ArithmeticException("Different rounding modes! This: " + cVar.i() + " Other: " + cVar2.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.ionspin.kotlin.bignum.integer.a H0(com.ionspin.kotlin.bignum.integer.a aVar, com.ionspin.kotlin.bignum.integer.a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar) {
            Pair pair;
            long jH0 = aVar.h0() - cVar.h();
            if (jH0 > 0) {
                com.ionspin.kotlin.bignum.integer.a.d dVarY0 = aVar.Y0(com.ionspin.kotlin.bignum.integer.a.f131059e.j().s0(jH0));
                pair = new Pair(dVarY0.e(), dVarY0.f());
            } else {
                pair = new Pair(aVar, aVar2);
            }
            com.ionspin.kotlin.bignum.integer.a aVarJ1 = (com.ionspin.kotlin.bignum.integer.a) pair.component1();
            com.ionspin.kotlin.bignum.integer.a aVar3 = (com.ionspin.kotlin.bignum.integer.a) pair.component2();
            com.ionspin.kotlin.bignum.integer.a.c cVar2 = com.ionspin.kotlin.bignum.integer.a.f131059e;
            l lVarH1 = Intrinsics.areEqual(aVar, cVar2.h()) ? aVar2.h1() : aVar.h1();
            if (cVar.i() == e.AWAY_FROM_ZERO || cVar.i() == e.TOWARDS_ZERO ? !aVar3.isZero() || !aVar2.isZero() : !aVar3.isZero()) {
                EnumC1437a enumC1437aW = w(aVar3);
                switch (b.f131030b[cVar.i().ordinal()]) {
                    case 1:
                        return lVarH1 == l.POSITIVE ? aVarJ1.j1() : aVarJ1.Q0();
                    case 2:
                    default:
                        break;
                    case 3:
                        if (lVarH1 == l.POSITIVE) {
                            return aVarJ1.j1();
                        }
                        break;
                    case 4:
                        if (lVarH1 != l.POSITIVE) {
                            return aVarJ1.Q0();
                        }
                        break;
                    case 5:
                        int i10 = b.f131029a[lVarH1.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2 && enumC1437aW != EnumC1437a.LESS_THAN_FIVE) {
                                return aVarJ1.Q0();
                            }
                        } else if (enumC1437aW != EnumC1437a.LESS_THAN_FIVE) {
                            return aVarJ1.j1();
                        }
                    case 6:
                        int i11 = b.f131029a[lVarH1.ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2 && enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                                return aVarJ1.Q0();
                            }
                        } else if (enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                            return aVarJ1.j1();
                        }
                    case 7:
                        int i12 = b.f131029a[lVarH1.ordinal()];
                        if (i12 != 1) {
                            if (i12 == 2 && enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                                return aVarJ1.Q0();
                            }
                        } else if (enumC1437aW != EnumC1437a.LESS_THAN_FIVE) {
                            return aVarJ1.j1();
                        }
                    case 8:
                        int i13 = b.f131029a[lVarH1.ordinal()];
                        if (i13 != 1) {
                            if (i13 == 2 && enumC1437aW != EnumC1437a.LESS_THAN_FIVE) {
                                return aVarJ1.Q0();
                            }
                        } else if (enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                            return aVarJ1.j1();
                        }
                    case 9:
                        if (enumC1437aW == EnumC1437a.FIVE) {
                            if (Intrinsics.areEqual(((com.ionspin.kotlin.bignum.integer.a) aVar.n0(2)).A0(), cVar2.k())) {
                                int i14 = b.f131029a[lVarH1.ordinal()];
                                if (i14 == 1) {
                                    return aVarJ1.j1();
                                }
                                if (i14 == 2) {
                                    return aVarJ1.Q0();
                                }
                            }
                        } else if (enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                            if (lVarH1 == l.POSITIVE) {
                                aVarJ1 = aVarJ1.j1();
                            }
                            return lVarH1 == l.NEGATIVE ? aVarJ1.Q0() : aVarJ1;
                        }
                    case 10:
                        if (enumC1437aW == EnumC1437a.FIVE) {
                            if (Intrinsics.areEqual(aVar.n0(2), cVar2.h())) {
                                int i15 = b.f131029a[lVarH1.ordinal()];
                                if (i15 == 1) {
                                    return aVarJ1.j1();
                                }
                                if (i15 == 2) {
                                    return aVarJ1.Q0();
                                }
                            }
                        } else if (enumC1437aW == EnumC1437a.MORE_THAN_FIVE) {
                            if (lVarH1 == l.POSITIVE) {
                                aVarJ1 = aVarJ1.j1();
                            }
                            return lVarH1 == l.NEGATIVE ? aVarJ1.Q0() : aVarJ1;
                        }
                    case 11:
                        throw new ArithmeticException("Non-terminating result of division operation. Specify decimalPrecision");
                }
            }
            return aVarJ1;
        }

        public static /* synthetic */ a I(C1436a c1436a, byte b10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.H(b10, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a I0(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar) {
            if (!cVar.l()) {
                return J0(aVar, j10, cVar);
            }
            return new a(aVar, j10, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a J0(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a.c cVar2 = com.ionspin.kotlin.bignum.integer.a.f131059e;
            if (Intrinsics.areEqual(aVar, cVar2.h())) {
                return new a(cVar2.h(), j10, cVar, null);
            }
            long jH0 = aVar.h0();
            long jH = cVar.k() ? cVar.h() + cVar.j() : cVar.h();
            if (jH > jH0) {
                return new a((com.ionspin.kotlin.bignum.integer.a) aVar.p0(cVar2.j().s0(jH - jH0)), j10, cVar, null);
            }
            if (jH >= jH0) {
                return new a(aVar, j10, cVar, null);
            }
            com.ionspin.kotlin.bignum.integer.a.d dVarY0 = aVar.Y0(cVar2.j().s0(jH0 - jH));
            com.ionspin.kotlin.bignum.integer.a aVarF = dVarY0.f();
            if (Intrinsics.areEqual(dVarY0.f(), cVar2.h())) {
                return new a(dVarY0.e(), j10, cVar, null);
            }
            if (aVar.h0() != dVarY0.e().h0() + dVarY0.f().h0()) {
                return B0(dVarY0.e(), j10, cVar);
            }
            com.ionspin.kotlin.bignum.integer.a aVarH0 = H0(dVarY0.e(), aVarF, cVar);
            return new a(aVarH0, j10 + (aVarH0.h0() - dVarY0.e().h0()), cVar, null);
        }

        public static /* synthetic */ a K(C1436a c1436a, byte b10, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return c1436a.J(b10, j10, cVar);
        }

        public static /* synthetic */ a M(C1436a c1436a, double d10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.L(d10, cVar);
        }

        public static /* synthetic */ a O(C1436a c1436a, float f10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.N(f10, cVar);
        }

        public static /* synthetic */ a R(C1436a c1436a, int i10, com.ionspin.kotlin.bignum.decimal.c cVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                cVar = null;
            }
            return c1436a.Q(i10, cVar);
        }

        public static /* synthetic */ a T(C1436a c1436a, int i10, com.ionspin.kotlin.bignum.decimal.c cVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                cVar = null;
            }
            return c1436a.S(i10, cVar);
        }

        public static /* synthetic */ a V(C1436a c1436a, int i10, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                cVar = null;
            }
            return c1436a.U(i10, j10, cVar);
        }

        public static /* synthetic */ a Y(C1436a c1436a, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.X(j10, cVar);
        }

        public static /* synthetic */ a a0(C1436a c1436a, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.Z(j10, cVar);
        }

        public static /* synthetic */ a c0(C1436a c1436a, long j10, long j11, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return c1436a.b0(j10, j11, cVar);
        }

        public static /* synthetic */ a f0(C1436a c1436a, short s10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.e0(s10, cVar);
        }

        public static /* synthetic */ a h0(C1436a c1436a, short s10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.g0(s10, cVar);
        }

        public static /* synthetic */ a j0(C1436a c1436a, short s10, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return c1436a.i0(s10, j10, cVar);
        }

        public static /* synthetic */ a l0(C1436a c1436a, byte b10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.k0(b10, cVar);
        }

        public static /* synthetic */ a p0(C1436a c1436a, int i10, com.ionspin.kotlin.bignum.decimal.c cVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                cVar = null;
            }
            return c1436a.o0(i10, cVar);
        }

        public static /* synthetic */ a r0(C1436a c1436a, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.q0(j10, cVar);
        }

        public static /* synthetic */ a u0(C1436a c1436a, short s10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.t0(s10, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a v(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.decimal.c cVar2;
            if (!cVar.k()) {
                return new a(aVar, j10, cVar, null);
            }
            if (j10 >= 0) {
                cVar2 = new com.ionspin.kotlin.bignum.decimal.c(cVar.j() + j10 + 1, cVar.i(), 0L, 4, null);
            } else {
                if (j10 >= 0) {
                    throw new RuntimeException("Unexpected state");
                }
                cVar2 = new com.ionspin.kotlin.bignum.decimal.c(cVar.j() + 1, cVar.i(), 0L, 4, null);
            }
            if (j10 >= 0) {
                return J0(aVar, j10, cVar2);
            }
            if (cVar.i() == e.ROUND_HALF_TO_EVEN) {
                a aVar2 = (a) new a(aVar, j10, null, 4, null).z(aVar.g0() * 2);
                return (a) J0(aVar2.g1(), aVar2.Z0(), cVar2).v0(aVar.g0() * 2);
            }
            a aVar3 = (a) new a(aVar, j10, null, 4, null).z(aVar.g0());
            return (a) J0(aVar3.g1(), aVar3.Z0(), cVar2).v0(aVar.g0());
        }

        private final EnumC1437a w(com.ionspin.kotlin.bignum.integer.a aVar) {
            com.ionspin.kotlin.bignum.integer.a.c cVar = com.ionspin.kotlin.bignum.integer.a.f131059e;
            com.ionspin.kotlin.bignum.integer.a.d dVarY0 = aVar.Y0(cVar.j().s0(aVar.h0() - 1));
            int iU = dVarY0.e().A0().U(true);
            com.ionspin.kotlin.bignum.integer.a aVarA0 = dVarY0.f().A0();
            if (iU == 5) {
                return Intrinsics.areEqual(aVarA0, cVar.h()) ? EnumC1437a.FIVE : EnumC1437a.MORE_THAN_FIVE;
            }
            if (iU > 5) {
                return EnumC1437a.MORE_THAN_FIVE;
            }
            if (iU < 5) {
                return EnumC1437a.LESS_THAN_FIVE;
            }
            throw new RuntimeException("Couldn't determine decider");
        }

        public static /* synthetic */ a y(C1436a c1436a, a aVar, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = null;
            }
            return c1436a.x(aVar, cVar);
        }

        @NotNull
        public final a A(@NotNull com.ionspin.kotlin.bignum.integer.a bigInteger, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
            int i10 = 7 & 0;
            return new a(bigInteger, bigInteger.h0() - 1, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public a h() {
            return a.f131006j;
        }

        @NotNull
        public final a B0(@NotNull com.ionspin.kotlin.bignum.integer.a significand, long j10, @NotNull com.ionspin.kotlin.bignum.decimal.c decimalMode) {
            Intrinsics.checkNotNullParameter(significand, "significand");
            Intrinsics.checkNotNullParameter(decimalMode, "decimalMode");
            if (significand.h1() == l.POSITIVE) {
                int i10 = b.f131030b[decimalMode.i().ordinal()];
                if (i10 != 1 && i10 != 3) {
                    return new a(significand, j10, decimalMode, null);
                }
                com.ionspin.kotlin.bignum.integer.a aVarJ1 = significand.j1();
                return new a(aVarJ1, j10 + (aVarJ1.h0() - significand.h0()), decimalMode, null);
            }
            if (significand.h1() != l.NEGATIVE) {
                return new a(significand, j10, decimalMode, null);
            }
            int i11 = b.f131030b[decimalMode.i().ordinal()];
            if (i11 != 1 && i11 != 4) {
                return new a(significand, j10, decimalMode, null);
            }
            com.ionspin.kotlin.bignum.integer.a aVarQ0 = significand.Q0();
            return new a(aVarQ0, j10 + (aVarQ0.h0() - significand.h0()), decimalMode, null);
        }

        @NotNull
        public final a C(@NotNull com.ionspin.kotlin.bignum.integer.a bigInteger, long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
            return new a(bigInteger, j10, cVar, null).T1(cVar);
        }

        @NotNull
        public final a C0(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return F0(this, string, null, 2, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public a q(@NotNull String string, int i10) {
            Intrinsics.checkNotNullParameter(string, "string");
            return E0(string, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public a m(byte b10) {
            return F(b10, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final a E0(@NotNull String floatingPointString, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            int length;
            int i10;
            int length2;
            int i11;
            int i12;
            long j10;
            String str;
            List listT4;
            Intrinsics.checkNotNullParameter(floatingPointString, "floatingPointString");
            if (floatingPointString.length() == 0) {
                throw new ArithmeticException("Empty string is not a valid decimal number");
            }
            if (!StringsKt.R2(floatingPointString, 'E', true)) {
                if (!StringsKt.U2(floatingPointString, '.', false, 2, null)) {
                    com.ionspin.kotlin.bignum.integer.a aVarQ = com.ionspin.kotlin.bignum.integer.a.f131059e.q(floatingPointString, 10);
                    return new a(aVarQ, aVarQ.h0() - 1, cVar, null);
                }
                List listT5 = StringsKt.T4(floatingPointString, new char[]{'.'}, false, 0, 6, null);
                if (listT5.size() != 2) {
                    throw new ArithmeticException("Invalid (or unsupported) floating point number format: " + floatingPointString);
                }
                int i13 = (floatingPointString.charAt(0) == '-' || floatingPointString.charAt(0) == '+') ? 1 : 0;
                l lVar = (i13 == 0 || floatingPointString.charAt(0) != '-') ? l.POSITIVE : l.NEGATIVE;
                String strSubstring = ((String) listT5.get(0)).substring(i13);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String str2 = (String) listT5.get(1);
                int length3 = strSubstring.length();
                int i14 = 0;
                while (true) {
                    if (i14 >= length3) {
                        i14 = -1;
                        break;
                    }
                    if (strSubstring.charAt(i14) != '0') {
                        break;
                    }
                    i14++;
                }
                int i15 = i14 == -1 ? 0 : i14;
                int length4 = str2.length() - 1;
                if (length4 < 0) {
                    length = -1;
                    break;
                }
                while (true) {
                    length = length4;
                    length4 = length - 1;
                    if (str2.charAt(length) != '0') {
                        break;
                    }
                    if (length4 < 0) {
                        length = -1;
                        break;
                    }
                }
                if (length == -1) {
                    i10 = 1;
                    length = str2.length() - 1;
                } else {
                    i10 = 1;
                }
                String strSubstring2 = strSubstring.substring(i15, strSubstring.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                String strSubstring3 = str2.substring(0, length + i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                com.ionspin.kotlin.bignum.integer.a aVarQ2 = com.ionspin.kotlin.bignum.integer.a.f131059e.q(strSubstring2 + strSubstring3, 10);
                if (strSubstring2.length() <= 0 || strSubstring2.charAt(0) == '0') {
                    int length5 = strSubstring3.length();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length5) {
                            i16 = -1;
                            break;
                        }
                        if (strSubstring3.charAt(i16) != '0') {
                            break;
                        }
                        i16++;
                    }
                    length2 = (i16 + 1) * (-1);
                } else {
                    length2 = strSubstring2.length() - 1;
                }
                if (Intrinsics.areEqual(aVarQ2, com.ionspin.kotlin.bignum.integer.a.f131059e.h())) {
                    lVar = l.ZERO;
                }
                if (lVar == l.NEGATIVE) {
                    aVarQ2 = aVarQ2.negate();
                }
                return new a(aVarQ2, length2, cVar, null);
            }
            if (StringsKt.U2(floatingPointString, '.', false, 2, null)) {
                i11 = -1;
                i12 = 0;
                j10 = 1;
                str = floatingPointString;
                listT4 = StringsKt.T4(str, new char[]{'.'}, false, 0, 6, null);
            } else {
                i11 = -1;
                i12 = 0;
                j10 = 1;
                List listT6 = StringsKt.T4(floatingPointString, new char[]{'E', 'e'}, false, 0, 6, null);
                listT4 = CollectionsKt.listOf((Object[]) new String[]{listT6.get(0), "0E" + ((String) listT6.get(1))});
                str = floatingPointString;
            }
            if (listT4.size() != 2) {
                throw new ArithmeticException("Invalid (or unsupported) floating point number format: " + str);
            }
            int i17 = (str.charAt(i12) == '-' || str.charAt(i12) == '+') ? 1 : i12;
            l lVar2 = (i17 == 0 || str.charAt(i12) != '-') ? l.POSITIVE : l.NEGATIVE;
            String strSubstring4 = ((String) listT4.get(i12)).substring(i17);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            List listT7 = StringsKt.T4((CharSequence) listT4.get(1), new char[]{'E', 'e'}, false, 0, 6, null);
            String str3 = (String) listT7.get(i12);
            String str4 = (String) listT7.get(1);
            int i18 = (str4.charAt(i12) == '-' || str4.charAt(i12) == '+') ? 1 : i12;
            l lVar3 = str4.charAt(i12) == '-' ? l.NEGATIVE : l.POSITIVE;
            String strSubstring5 = str4.substring(i18);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
            long j11 = lVar3 == l.POSITIVE ? Long.parseLong(strSubstring5, CharsKt.checkRadix(10)) : Long.parseLong(strSubstring5, CharsKt.checkRadix(10)) * ((long) i11);
            int length6 = strSubstring4.length();
            int i19 = i12;
            while (true) {
                if (i19 >= length6) {
                    i19 = i11;
                    break;
                }
                if (strSubstring4.charAt(i19) != '0') {
                    break;
                }
                i19++;
            }
            if (i19 == i11) {
                i19 = i12;
            }
            int length7 = str3.length() + i11;
            if (length7 < 0) {
                length7 = i11;
                break;
            }
            while (true) {
                int i20 = length7 - 1;
                if (str3.charAt(length7) != '0') {
                    break;
                }
                if (i20 < 0) {
                    length7 = i11;
                    break;
                }
                length7 = i20;
            }
            if (length7 == i11) {
                length7 = str3.length() - 1;
            }
            String strSubstring6 = strSubstring4.substring(i19, strSubstring4.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
            String strSubstring7 = str3.substring(i12, length7 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
            com.ionspin.kotlin.bignum.integer.a.c cVar2 = com.ionspin.kotlin.bignum.integer.a.f131059e;
            com.ionspin.kotlin.bignum.integer.a aVarQ3 = cVar2.q(strSubstring6 + strSubstring7, 10);
            if (Intrinsics.areEqual(aVarQ3, cVar2.h())) {
                lVar2 = l.ZERO;
            }
            if (lVar2 == l.NEGATIVE) {
                aVarQ3 = aVarQ3.negate();
            }
            com.ionspin.kotlin.bignum.integer.a aVar = aVarQ3;
            return new a(aVar, (!Intrinsics.areEqual(strSubstring6, p.f99189d0) ? j11 + ((long) strSubstring6.length()) : j11 - (((long) strSubstring7.length()) - aVar.h0())) - j10, cVar, null);
        }

        @NotNull
        public final a F(byte b10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarM = com.ionspin.kotlin.bignum.integer.a.f131059e.m(b10);
            return new a(aVarM, aVarM.h0() - 1, cVar, null).T1(cVar);
        }

        @NotNull
        public final a H(byte b10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.m(b10), 0L, cVar, null).T1(cVar);
        }

        @NotNull
        public final a J(byte b10, long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.m(b10), j10, cVar, null).T1(cVar);
        }

        public final void K0(boolean z10) {
            a.f131010n = z10;
        }

        @NotNull
        public final a L(double d10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            String strSubstring;
            String strValueOf = String.valueOf(d10);
            if (!StringsKt.U2(strValueOf, '.', false, 2, null) || StringsKt.R2(strValueOf, 'E', true)) {
                return E0(strValueOf, cVar).T1(cVar).T1(cVar);
            }
            for (int iI3 = StringsKt.i3(strValueOf); -1 < iI3; iI3--) {
                if (strValueOf.charAt(iI3) != '0') {
                    strSubstring = strValueOf.substring(0, iI3 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return E0(strSubstring, cVar).T1(cVar);
                }
            }
            strSubstring = "";
            return E0(strSubstring, cVar).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public a t(double d10, boolean z10) {
            return L(d10, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public a r(float f10, boolean z10) {
            return N(f10, null);
        }

        @NotNull
        public final a N(float f10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            String strSubstring;
            String strValueOf = String.valueOf(f10);
            if (!StringsKt.U2(strValueOf, '.', false, 2, null) || StringsKt.R2(strValueOf, 'E', true)) {
                return E0(strValueOf, cVar).T1(cVar);
            }
            for (int iI3 = StringsKt.i3(strValueOf); -1 < iI3; iI3--) {
                if (strValueOf.charAt(iI3) != '0') {
                    strSubstring = strValueOf.substring(0, iI3 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return E0(strSubstring, cVar).T1(cVar);
                }
            }
            strSubstring = "";
            return E0(strSubstring, cVar).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            return Q(i10, null);
        }

        @NotNull
        public final a Q(int i10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarB = com.ionspin.kotlin.bignum.integer.a.f131059e.b(i10);
            return new a(aVarB, aVarB.h0() - 1, cVar, null).T1(cVar);
        }

        @NotNull
        public final a S(int i10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.b(i10), 0L, cVar, null).T1(cVar);
        }

        @NotNull
        public final a U(int i10, long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.b(i10), j10, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public a n(long j10) {
            return X(j10, null);
        }

        @NotNull
        public final a X(long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarN = com.ionspin.kotlin.bignum.integer.a.f131059e.n(j10);
            return new a(aVarN, aVarN.h0() - 1, cVar, null).T1(cVar);
        }

        @NotNull
        public final a Z(long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.n(j10), 0L, cVar, null).T1(cVar);
        }

        @NotNull
        public final a b0(long j10, long j11, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.n(j10), j11, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public a o(short s10) {
            return e0(s10, null);
        }

        @NotNull
        public final a e0(short s10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarO = com.ionspin.kotlin.bignum.integer.a.f131059e.o(s10);
            return new a(aVarO, aVarO.h0() - 1, cVar, null).T1(cVar);
        }

        @NotNull
        public final a g0(short s10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.o(s10), 0L, cVar, null).T1(cVar);
        }

        @NotNull
        public final a i0(short s10, long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            return new a(com.ionspin.kotlin.bignum.integer.a.f131059e.o(s10), j10, cVar, null).T1(cVar);
        }

        @NotNull
        public final a k0(byte b10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarD = com.ionspin.kotlin.bignum.integer.a.f131059e.d(b10);
            return new a(aVarD, aVarD.h0() - 1, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public a d(byte b10) {
            return k0(b10, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public a i(int i10) {
            return o0(i10, null);
        }

        @NotNull
        public final a o0(int i10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarI = com.ionspin.kotlin.bignum.integer.a.f131059e.i(i10);
            return new a(aVarI, aVarI.h0() - 1, cVar, null).T1(cVar);
        }

        @NotNull
        public final a q0(long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarF = com.ionspin.kotlin.bignum.integer.a.f131059e.f(j10);
            return new a(aVarF, aVarF.h0() - 1, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public a f(long j10) {
            return q0(j10, null);
        }

        @NotNull
        public final a t0(short s10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            com.ionspin.kotlin.bignum.integer.a aVarC = com.ionspin.kotlin.bignum.integer.a.f131059e.c(s10);
            return new a(aVarC, aVarC.h0() - 1, cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public a c(short s10) {
            return t0(s10, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public a k() {
            return a.f131007k;
        }

        @NotNull
        public final a x(@NotNull a bigDecimal, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
            Intrinsics.checkNotNullParameter(bigDecimal, "bigDecimal");
            return new a(bigDecimal.g1(), bigDecimal.Z0(), cVar, null).T1(cVar);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
        public a j() {
            return a.f131009m;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public a p() {
            return a.f131008l;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a s(@NotNull com.ionspin.kotlin.bignum.integer.a bigInteger) {
            Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
            return A(bigInteger, null);
        }

        public final boolean z0() {
            return a.f131010n;
        }

        private C1436a() {
        }
    }

    private enum b {
        Max,
        Min,
        Add;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f131035e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f131035e;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131037b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131036a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.Max.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.Min.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.Add.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f131037b = iArr2;
        }
    }

    static {
        C1436a c1436a = new C1436a(null);
        f131005i = c1436a;
        com.ionspin.kotlin.bignum.integer.a.c cVar = com.ionspin.kotlin.bignum.integer.a.f131059e;
        f131006j = new a(cVar.h(), 0L, null, 6, null);
        f131007k = new a(cVar.k(), 0L, null, 6, null);
        f131008l = new a(cVar.p(), 0L, null, 6, null);
        f131009m = new a(cVar.j(), 1L, null, 4, null);
        f131011o = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        f131012s = C1436a.M(c1436a, Double.MAX_VALUE, null, 2, null);
        f131013t = C1436a.M(c1436a, Double.MIN_VALUE, null, 2, null);
        f131014v = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        f131015w = C1436a.O(c1436a, Float.MAX_VALUE, null, 2, null);
        X = C1436a.O(c1436a, Float.MIN_VALUE, null, 2, null);
    }

    public /* synthetic */ a(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, cVar);
    }

    private final String A1(String str, int i10) {
        String strSubstring;
        String strK5 = StringsKt.k5(str, r.W1(0, str.length() - i10));
        String strK6 = StringsKt.k5(str, r.W1(str.length() - i10, str.length()));
        int iI3 = StringsKt.i3(strK6);
        while (true) {
            if (-1 >= iI3) {
                strSubstring = "";
                break;
            }
            if (strK6.charAt(iI3) != '0') {
                strSubstring = strK6.substring(0, iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                break;
            }
            iI3--;
        }
        if (strSubstring.length() <= 0) {
            return strK5;
        }
        return strK5 + '.' + strSubstring;
    }

    public static /* synthetic */ a C0(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.z0(aVar2, cVar);
    }

    private final n1<com.ionspin.kotlin.bignum.integer.a, com.ionspin.kotlin.bignum.integer.a, Long> D0(a aVar, a aVar2) {
        a aVarD1 = d1(aVar);
        a aVarD2 = d1(aVar2);
        long j10 = aVarD1.f131018c;
        long j11 = aVarD2.f131018c;
        long j12 = aVar.f131018c;
        long j13 = aVar2.f131018c;
        if (j12 > j13) {
            long j14 = j10 - j11;
            if (j14 >= 0) {
                return new n1<>((com.ionspin.kotlin.bignum.integer.a) aVarD1.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j14)), aVar2.f131017b, Long.valueOf(j11));
            }
            return new n1<>(aVar.f131017b, (com.ionspin.kotlin.bignum.integer.a) aVarD2.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j14 * ((long) (-1)))), Long.valueOf(j10));
        }
        if (j12 < j13) {
            long j15 = j11 - j10;
            if (j15 < 0) {
                return new n1<>((com.ionspin.kotlin.bignum.integer.a) aVarD1.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j15 * ((long) (-1)))), aVar2.f131017b, Long.valueOf(j10));
            }
            return new n1<>(aVar.f131017b, (com.ionspin.kotlin.bignum.integer.a) aVarD2.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j15)), Long.valueOf(j10));
        }
        if (j12 != j13) {
            throw new RuntimeException("Invalid comparison state BigInteger: " + aVar.f131018c + ", " + aVar2.f131018c);
        }
        long j16 = j10 - j11;
        if (j16 > 0) {
            return new n1<>((com.ionspin.kotlin.bignum.integer.a) aVar.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j16)), aVar2.f131017b, Long.valueOf(j10));
        }
        if (j16 < 0) {
            return new n1<>(aVar.f131017b, (com.ionspin.kotlin.bignum.integer.a) aVar2.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j16 * ((long) (-1)))), Long.valueOf(j10));
        }
        if (Intrinsics.compare(j16, 0L) == 0) {
            return new n1<>(aVar.f131017b, aVar2.f131017b, Long.valueOf(j10));
        }
        throw new RuntimeException("Invalid delta: " + j16);
    }

    private final void F0(boolean z10) {
        if (z10 && !l1()) {
            throw new ArithmeticException("Cannot convert to int and provide exact value");
        }
    }

    private final com.ionspin.kotlin.bignum.decimal.c H0(a aVar, b bVar) {
        com.ionspin.kotlin.bignum.decimal.c cVar;
        long jMax;
        com.ionspin.kotlin.bignum.decimal.c cVar2 = this.f131019d;
        if (cVar2 != null && !cVar2.l() && (cVar = aVar.f131019d) != null && !cVar.l()) {
            long jMax2 = Math.max(this.f131019d.h(), aVar.f131019d.h());
            e eVarI = this.f131019d.i();
            if (this.f131019d.k() && aVar.f131019d.k()) {
                int i10 = c.f131037b[bVar.ordinal()];
                int i11 = 3 << 1;
                if (i10 == 1) {
                    jMax = Math.max(this.f131019d.j(), aVar.f131019d.j());
                } else if (i10 == 2) {
                    jMax = Math.min(this.f131019d.j(), aVar.f131019d.j());
                } else {
                    if (i10 != 3) {
                        throw new k0();
                    }
                    jMax = this.f131019d.j() + aVar.f131019d.j();
                }
            } else {
                jMax = -1;
            }
            return new com.ionspin.kotlin.bignum.decimal.c(jMax2, eVarI, jMax);
        }
        return com.ionspin.kotlin.bignum.decimal.c.f131038f.a();
    }

    public static /* synthetic */ a J0(a aVar, com.ionspin.kotlin.bignum.integer.a aVar2, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar2 = aVar.f131017b;
        }
        if ((i10 & 2) != 0) {
            j10 = aVar.f131018c;
        }
        if ((i10 & 4) != 0) {
            cVar = aVar.f131019d;
        }
        return aVar.I0(aVar2, j10, cVar);
    }

    private final a N1(a aVar, com.ionspin.kotlin.bignum.decimal.c cVar) {
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, aVar.f131019d, cVar);
        return c1436a.I0((com.ionspin.kotlin.bignum.integer.a) this.f131017b.d0(aVar.f131017b), this.f131018c - aVar.f131018c, cVarG0);
    }

    static /* synthetic */ a P1(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.N1(aVar2, cVar);
    }

    public static /* synthetic */ a S0(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
            int i11 = 7 & 0;
        }
        return aVar.R0(aVar2, cVar);
    }

    private final a S1(a aVar) {
        if (Intrinsics.areEqual(aVar, f131006j)) {
            return this;
        }
        com.ionspin.kotlin.bignum.integer.a aVarE = aVar.f131017b;
        com.ionspin.kotlin.bignum.integer.a.d dVar = new com.ionspin.kotlin.bignum.integer.a.d(aVarE, com.ionspin.kotlin.bignum.integer.a.f131059e.h());
        while (true) {
            com.ionspin.kotlin.bignum.integer.a aVarE2 = dVar.e();
            com.ionspin.kotlin.bignum.integer.a.c cVar = com.ionspin.kotlin.bignum.integer.a.f131059e;
            dVar = aVarE2.Y0(cVar.j());
            if (Intrinsics.areEqual(dVar.f(), cVar.h())) {
                aVarE = dVar.e();
            }
            com.ionspin.kotlin.bignum.integer.a aVar2 = aVarE;
            if (!Intrinsics.areEqual(dVar.f(), cVar.h())) {
                return new a(aVar2, aVar.f131018c, null, 4, null);
            }
            aVarE = aVar2;
        }
    }

    private final Pair<a, a> V0(a aVar, com.ionspin.kotlin.bignum.decimal.c cVar) {
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, aVar.f131019d, cVar);
        long jMax = Math.max(this.f131018c, aVar.f131018c);
        return new Pair<>(c1436a.I0((com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(aVar.f131017b), jMax, cVarG0), c1436a.I0((com.ionspin.kotlin.bignum.integer.a) this.f131017b.d0(aVar.f131017b), jMax, cVarG0));
    }

    public static /* synthetic */ a V1(a aVar, long j10, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = aVar.f131021f;
        }
        return aVar.U1(j10, eVar);
    }

    static /* synthetic */ Pair W0(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.V0(aVar2, cVar);
    }

    public static /* synthetic */ a a2(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.Z1(aVar2, cVar);
    }

    private final a d1(a aVar) {
        return new a(aVar.f131017b, (aVar.f131018c - aVar.f131017b.h0()) + 1, null, 4, null);
    }

    private final a j1(a aVar, com.ionspin.kotlin.bignum.decimal.c cVar) {
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, aVar.f131019d, cVar);
        return c1436a.I0((com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(aVar.f131017b), this.f131018c - aVar.f131018c, cVarG0);
    }

    static /* synthetic */ a k1(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.j1(aVar2, cVar);
    }

    private final int m1(Number number) {
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue > 9.223372036854776E18d) {
            return G0(f131005i.C0(String.valueOf(dDoubleValue)));
        }
        return dDoubleValue % ((double) 1) == 0.0d ? G0(f131005i.n(number.longValue())) : G0(com.ionspin.kotlin.bignum.decimal.b.M(number.doubleValue(), null, null, 3, null));
    }

    public static /* synthetic */ a w1(a aVar, a aVar2, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return aVar.v1(aVar2, cVar);
    }

    private final String y1(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z1(str, str.length() - 1));
        sb2.append("E+");
        sb2.append(str.length() - 1);
        return sb2.toString();
    }

    private final String z1(String str, int i10) {
        String str2 = StringsKt.k5(str, r.W1(0, str.length() - i10)) + '.' + StringsKt.k5(str, r.W1(str.length() - i10, str.length()));
        for (int iI3 = StringsKt.i3(str2); -1 < iI3; iI3--) {
            if (str2.charAt(iI3) != '0') {
                String strSubstring = str2.substring(0, iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public a H(byte b10) {
        return (a) ca.e.a.k(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public a z(int i10) {
        return (a) ca.e.a.l(this, i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public a D(long j10) {
        return (a) ca.e.a.m(this, j10);
    }

    @NotNull
    public final a E0() {
        if (isZero()) {
            return f131006j;
        }
        if (this.f131018c >= 0) {
            return T1(new com.ionspin.kotlin.bignum.decimal.c(this.f131018c + 1, e.CEILING, 0L, 4, null));
        }
        int i10 = c.f131036a[this.f131017b.h1().ordinal()];
        if (i10 == 1) {
            return f131007k;
        }
        if (i10 != 2 && i10 != 3) {
            throw new k0();
        }
        return f131006j;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public a V(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return z0(other, H0(other, b.Max));
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public a E(short s10) {
        return (a) ca.e.a.o(this, s10);
    }

    public final int G0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f131018c == other.f131018c && this.f131016a == other.f131016a) {
            return this.f131017b.M0(other.f131017b);
        }
        n1<com.ionspin.kotlin.bignum.integer.a, com.ionspin.kotlin.bignum.integer.a, Long> n1VarD0 = D0(this, other);
        return n1VarD0.a().M0(n1VarD0.b());
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public a t0(int i10) {
        return s0(i10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
    public a s0(long j10) {
        long j11 = 0;
        if (Intrinsics.areEqual(this, f131006j) && j10 < 0) {
            throw new ArithmeticException("Negative exponentiation of zero is not defined.");
        }
        if (j10 > 0) {
            long j12 = j10 - 1;
            a aVarP0 = this;
            while (j11 < j12) {
                aVarP0 = aVarP0.p0(this);
                j11++;
            }
            return aVarP0;
        }
        if (j10 >= 0) {
            return f131007k;
        }
        if (j10 == Long.MIN_VALUE) {
            a aVarB0 = this;
            while (true) {
                aVarB0 = aVarB0.B0(this);
                if (j11 == Long.MAX_VALUE) {
                    return aVarB0.B0(this);
                }
                j11++;
            }
        } else {
            long jAbs = Math.abs(j10);
            if (0 > jAbs) {
                return this;
            }
            a aVarB1 = this;
            while (true) {
                aVarB1 = aVarB1.B0(this);
                if (j11 == jAbs) {
                    return aVarB1;
                }
                j11++;
            }
        }
    }

    @NotNull
    public final a I0(@NotNull com.ionspin.kotlin.bignum.integer.a significand, long j10, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        Intrinsics.checkNotNullParameter(significand, "significand");
        return new a(significand, j10, cVar);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public a l0(byte b10) {
        return (a) ca.e.a.p(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public a n0(int i10) {
        return (a) ca.e.a.q(this, i10);
    }

    @NotNull
    public final a K0() {
        return (a) v0(1);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public a m0(long j10) {
        return (a) ca.e.a.r(this, j10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public a o(byte b10) {
        return (a) ca.e.a.a(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public a d0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N1(other, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public a f(int i10) {
        return (a) ca.e.a.b(this, i10);
    }

    @Override // ca.h
    public byte N(boolean z10) {
        F0(z10);
        return h2().N(z10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public a e(long j10) {
        return (a) ca.e.a.c(this, j10);
    }

    @Override // ca.h
    public short O(boolean z10) {
        F0(z10);
        return h2().O(z10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a B0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R0(other, H0(other, b.Max));
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public a o0(short s10) {
        return (a) ca.e.a.t(this, s10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public a d(short s10) {
        return (a) ca.e.a.e(this, s10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public a n(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R0(other, H0(other, b.Max));
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public a r0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y0(other).getSecond();
    }

    @Override // ca.h
    public short R(boolean z10) {
        F0(z10);
        return h2().R(z10);
    }

    @NotNull
    public final a R0(@NotNull a other, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        com.ionspin.kotlin.bignum.integer.a aVar;
        Intrinsics.checkNotNullParameter(other, "other");
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, other.f131019d, cVar);
        if (cVarG0.l() && !cVarG0.k()) {
            long j10 = this.f131018c - other.f131018c;
            long j11 = (other.f131016a * ((long) 2)) + ((long) 6);
            com.ionspin.kotlin.bignum.integer.a aVar2 = this.f131017b;
            com.ionspin.kotlin.bignum.integer.a.c cVar2 = com.ionspin.kotlin.bignum.integer.a.f131059e;
            com.ionspin.kotlin.bignum.integer.a aVar3 = (com.ionspin.kotlin.bignum.integer.a) aVar2.p0(cVar2.j().s0(j11));
            com.ionspin.kotlin.bignum.integer.a.d dVarY0 = aVar3.Y0(other.f131017b);
            com.ionspin.kotlin.bignum.integer.a aVarE = dVarY0.e();
            long jH0 = (other.f131016a - 1) + (aVarE.h0() - aVar3.h0());
            if (Intrinsics.areEqual(dVarY0.f(), cVar2.h())) {
                return new a(aVarE, j10 + jH0, cVarG0);
            }
            throw new ArithmeticException("Non-terminating result of division operation (i.e. 1/3 = 0.3333... library needs to know when to stop and how to round up at that point). Specify decimalPrecision inside your decimal mode.");
        }
        long j12 = this.f131018c - other.f131018c;
        long j13 = j12 - 1;
        long jH = (cVarG0.h() - this.f131016a) + other.f131016a;
        if (jH > 0) {
            aVar = (com.ionspin.kotlin.bignum.integer.a) this.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(jH));
        } else {
            aVar = jH < 0 ? (com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(Math.abs(jH))) : this.f131017b;
        }
        com.ionspin.kotlin.bignum.integer.a.d dVarY1 = aVar.Y0(other.f131017b);
        com.ionspin.kotlin.bignum.integer.a aVarE2 = dVarY1.e();
        if (Intrinsics.areEqual(aVarE2, com.ionspin.kotlin.bignum.integer.a.f131059e.h())) {
            j13 = j12 - 2;
        }
        long jH1 = aVarE2.h0() - cVarG0.h();
        if (!this.f131023h) {
            return new a(c1436a.H0(aVarE2, dVarY1.f(), cVarG0), j13 + jH1, cVarG0);
        }
        int i10 = 3 & 6;
        return new a(c1436a.H0(aVarE2, dVarY1.f(), cVarG0), j13 + jH1, com.ionspin.kotlin.bignum.decimal.c.g(cVarG0, aVarE2.h0(), null, 0L, 6, null));
    }

    @NotNull
    public final a R1() {
        e eVarI;
        com.ionspin.kotlin.bignum.integer.a aVar = this.f131017b;
        long j10 = this.f131018c;
        com.ionspin.kotlin.bignum.decimal.c cVar = this.f131019d;
        long jH = cVar != null ? cVar.h() : 0L;
        com.ionspin.kotlin.bignum.decimal.c cVar2 = this.f131019d;
        if (cVar2 == null || (eVarI = cVar2.i()) == null) {
            eVarI = e.NONE;
        }
        return new a(aVar, j10, new com.ionspin.kotlin.bignum.decimal.c(jH, eVarI, -1L));
    }

    @Override // ca.h
    public long S(boolean z10) {
        F0(z10);
        return h2().S(z10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public Pair<a, a> y0(@NotNull a other) {
        com.ionspin.kotlin.bignum.decimal.c cVar;
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f131018c >= 0 && other.A0().compareTo(A0()) <= 0) {
            com.ionspin.kotlin.bignum.decimal.c cVar2 = this.f131019d;
            if (cVar2 == null || (cVar = com.ionspin.kotlin.bignum.decimal.c.g(cVar2, (this.f131018c - other.f131018c) + 1, null, 0L, 6, null)) == null) {
                cVar = new com.ionspin.kotlin.bignum.decimal.c((this.f131018c - other.f131018c) + 1, e.FLOOR, 0L, 4, null);
            }
            a aVarR0 = R0(other, cVar);
            return new Pair<>(aVarR0, v(J0(aVarR0, null, 0L, com.ionspin.kotlin.bignum.decimal.c.f131038f.a(), 3, null).p0(other)));
        }
        return new Pair<>(f131006j, this);
    }

    @NotNull
    public final a T1(@Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        return cVar == null ? this : f131005i.J0(this.f131017b, this.f131018c, cVar);
    }

    @Override // ca.h
    public int U(boolean z10) {
        F0(z10);
        return h2().U(z10);
    }

    @NotNull
    public final Pair<a, a> U0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y0(other);
    }

    @NotNull
    public final a U1(long j10, @NotNull e roundingMode) {
        a aVarT1;
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (j10 == 0) {
            throw new ArithmeticException("Rounding to 0 position is not supported");
        }
        if (this.f131018c >= 0) {
            aVarT1 = T1(new com.ionspin.kotlin.bignum.decimal.c(j10, roundingMode, 0L, 4, null));
        } else {
            aVarT1 = roundingMode == e.ROUND_HALF_TO_EVEN ? (a) ((a) z(g0() * 2)).T1(new com.ionspin.kotlin.bignum.decimal.c(j10, roundingMode, 0L, 4, null)).v0(g0() * 2) : (a) ((a) z(g0())).T1(new com.ionspin.kotlin.bignum.decimal.c(j10, roundingMode, 0L, 4, null)).v0(g0());
        }
        com.ionspin.kotlin.bignum.decimal.c cVar = this.f131019d;
        if (cVar == null) {
            return new a(aVarT1.f131017b, aVarT1.f131018c, null, 4, null);
        }
        return new a(aVarT1.f131017b, aVarT1.f131018c, cVar);
    }

    @Override // ca.h
    public byte W(boolean z10) {
        F0(z10);
        return h2().W(z10);
    }

    @NotNull
    public final a W1(long j10, @NotNull e roundingMode) {
        a aVarU1;
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (j10 < 0) {
            throw new ArithmeticException("This method doesn't support negative digit position");
        }
        long j11 = this.f131018c;
        if (j11 >= 0) {
            aVarU1 = U1(j11 + j10 + 1, roundingMode);
        } else {
            if (j11 >= 0) {
                throw new RuntimeException("Unexpected state");
            }
            aVarU1 = U1(j10 + 1, roundingMode);
        }
        com.ionspin.kotlin.bignum.decimal.c cVar = this.f131019d;
        if (cVar != null) {
            return new a(aVarU1.f131017b, aVarU1.f131018c, cVar);
        }
        return new a(aVarU1.f131017b, aVarU1.f131018c, null, 4, null);
    }

    @NotNull
    public final a X0() {
        if (this.f131018c >= 0) {
            return T1(new com.ionspin.kotlin.bignum.decimal.c(this.f131018c + 1, e.FLOOR, 0L, 4, null));
        }
        int i10 = c.f131036a[this.f131017b.h1().ordinal()];
        int i11 = 6 << 1;
        if (i10 == 1) {
            return f131006j;
        }
        if (i10 == 2) {
            return f131007k.negate();
        }
        if (i10 == 3) {
            return f131006j;
        }
        throw new k0();
    }

    @NotNull
    public final a X1(long j10) {
        com.ionspin.kotlin.bignum.decimal.c cVar;
        if (j10 < 0) {
            throw new ArithmeticException("Negative Scale is unsupported.");
        }
        if (this.f131019d == null) {
            cVar = j10 == -1 ? com.ionspin.kotlin.bignum.decimal.c.f131038f.a() : new com.ionspin.kotlin.bignum.decimal.c(0L, e.ROUND_HALF_AWAY_FROM_ZERO, j10);
        } else {
            cVar = new com.ionspin.kotlin.bignum.decimal.c(this.f131019d.h() - this.f131019d.j(), this.f131019d.i(), j10);
        }
        return new a(this.f131017b, this.f131018c, cVar);
    }

    @Nullable
    public final com.ionspin.kotlin.bignum.decimal.c Y0() {
        return this.f131019d;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public a Z(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Z1(other, H0(other, b.Max));
    }

    public final long Z0() {
        return this.f131018c;
    }

    @NotNull
    public final a Z1(@NotNull a other, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        Intrinsics.checkNotNullParameter(other, "other");
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, other.f131019d, cVar);
        a aVar = f131006j;
        if (Intrinsics.areEqual(this, aVar)) {
            return c1436a.I0(other.f131017b.negate(), other.f131018c, cVarG0);
        }
        if (Intrinsics.areEqual(other, aVar)) {
            return c1436a.I0(this.f131017b, this.f131018c, cVarG0);
        }
        n1<com.ionspin.kotlin.bignum.integer.a, com.ionspin.kotlin.bignum.integer.a, Long> n1VarD0 = D0(this, other);
        com.ionspin.kotlin.bignum.integer.a aVarA = n1VarD0.a();
        com.ionspin.kotlin.bignum.integer.a aVarB = n1VarD0.b();
        long jH0 = aVarA.h0();
        long jH1 = aVarB.h0();
        com.ionspin.kotlin.bignum.integer.a aVar2 = (com.ionspin.kotlin.bignum.integer.a) aVarA.v(aVarB);
        long j10 = jH0;
        long jH2 = aVar2.h0();
        if (j10 <= jH1) {
            j10 = jH1;
        }
        long jMax = (jH2 - j10) + Math.max(this.f131018c, other.f131018c);
        return this.f131023h ? c1436a.I0(aVar2, jMax, com.ionspin.kotlin.bignum.decimal.c.g(cVarG0, jH2, null, 0L, 6, null)) : c1436a.I0(aVar2, jMax, cVarG0);
    }

    @Override // ca.a
    public boolean a0() {
        return ca.a.b.b(this);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public a k() {
        return this;
    }

    @Override // ca.h
    public float b(boolean z10) {
        long j10;
        int iF;
        long j11 = 0;
        if (z10) {
            long j12 = this.f131018c;
            boolean z11 = j12 >= -45 && j12 <= 38;
            if ((this.f131016a - j12) - 1 > 0) {
                int iF2 = f.a().f((j12 >= 0 ? (com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(com.ionspin.kotlin.bignum.integer.a.f131059e.j().s0((this.f131016a - this.f131018c) - 1)) : com.ionspin.kotlin.bignum.integer.a.f131059e.h()).e1());
                j10 = 1;
                a aVar = new a(this.f131017b.Y0(com.ionspin.kotlin.bignum.integer.a.f131059e.j().s0((this.f131016a - this.f131018c) - 1)).f(), -1L, null, 4, null);
                ArrayList arrayList = new ArrayList();
                a second = aVar;
                for (int i10 = 0; !Intrinsics.areEqual(second, f131006j) && i10 <= 24; i10++) {
                    second = (a) second.q(2);
                    a aVar2 = f131007k;
                    int i11 = second.compareTo(aVar2) >= 0 ? 1 : 0;
                    arrayList.add(Integer.valueOf(i11));
                    if (i11 == 1) {
                        second = second.U0(aVar2).getSecond();
                    }
                }
                iF = iF2 + arrayList.size();
            } else {
                j11 = 0;
                j10 = 1;
                iF = f.a().f(this.f131017b.e1()) - f.a().j(this.f131017b.e1());
            }
            if (!(iF <= 24 ? z11 : false)) {
                throw new ArithmeticException("Value cannot be narrowed to float");
            }
        } else {
            j11 = 0;
            j10 = 1;
        }
        long j13 = (this.f131016a - j10) - this.f131018c;
        long jS = this.f131017b.S(z10);
        if (j13 >= j11) {
            float[] fArr = f131014v;
            if (j13 < fArr.length) {
                return jS / fArr[(int) j13];
            }
        }
        return Float.parseFloat(toString());
    }

    public final long b1() {
        return this.f131016a;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public a r(byte b10) {
        return (a) ca.e.a.u(this, b10);
    }

    public final long c1() {
        return this.f131020e;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public a q(int i10) {
        return (a) ca.e.a.v(this, i10);
    }

    @Override // ca.a, java.lang.Comparable
    public int compareTo(@NotNull Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof Number) {
            j jVar = j.f131119a;
            if (jVar.a() == g.JS || jVar.a() == g.WASMJS) {
                return m1((Number) other);
            }
        }
        if (other instanceof a) {
            return G0((a) other);
        }
        if (other instanceof Long) {
            return G0(f131005i.n(((Number) other).longValue()));
        }
        if (other instanceof Integer) {
            return G0(f131005i.b(((Number) other).intValue()));
        }
        if (other instanceof Short) {
            return G0(f131005i.o(((Number) other).shortValue()));
        }
        if (other instanceof Byte) {
            return G0(f131005i.m(((Number) other).byteValue()));
        }
        if (other instanceof Double) {
            return G0(C1436a.M(f131005i, ((Number) other).doubleValue(), null, 2, null));
        }
        if (other instanceof Float) {
            return G0(C1436a.O(f131005i, ((Number) other).floatValue(), null, 2, null));
        }
        throw new RuntimeException("Invalid comparison type for BigDecimal: " + j1.d(other.getClass()).Q());
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public a p(long j10) {
        return (a) ca.e.a.w(this, j10);
    }

    @Override // ca.a
    @NotNull
    public String e0(int i10) {
        if (i10 == 10) {
            return toString();
        }
        throw new RuntimeException("BigDecimal in base other than 10 is not supported yet");
    }

    @NotNull
    public final e e1() {
        return this.f131021f;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public a p0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return v1(other, H0(other, b.Max));
    }

    @Override // ca.a
    public boolean equals(@Nullable Object obj) {
        int iG0;
        if (obj instanceof a) {
            iG0 = G0((a) obj);
        } else if (obj instanceof Long) {
            iG0 = G0(f131005i.n(((Number) obj).longValue()));
        } else if (obj instanceof Integer) {
            iG0 = G0(f131005i.b(((Number) obj).intValue()));
        } else if (obj instanceof Short) {
            iG0 = G0(f131005i.o(((Number) obj).shortValue()));
        } else if (obj instanceof Byte) {
            iG0 = G0(f131005i.m(((Number) obj).byteValue()));
        } else if (obj instanceof Double) {
            iG0 = G0(C1436a.M(f131005i, ((Number) obj).doubleValue(), null, 2, null));
        } else {
            iG0 = obj instanceof Float ? G0(C1436a.O(f131005i, ((Number) obj).floatValue(), null, 2, null)) : -1;
        }
        return iG0 == 0;
    }

    @Override // ca.h
    public double f0(boolean z10) {
        long j10;
        int iF;
        long j11 = 0;
        if (z10) {
            long j12 = this.f131018c;
            boolean z11 = j12 >= -324 && j12 <= 308;
            if ((this.f131016a - j12) - 1 > 0) {
                int iF2 = f.a().f((j12 >= 0 ? (com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(com.ionspin.kotlin.bignum.integer.a.f131059e.j().s0((this.f131016a - this.f131018c) - 1)) : com.ionspin.kotlin.bignum.integer.a.f131059e.h()).e1());
                j10 = 1;
                a aVar = new a(this.f131017b.Y0(com.ionspin.kotlin.bignum.integer.a.f131059e.j().s0((this.f131016a - this.f131018c) - 1)).f(), -1L, null, 4, null);
                ArrayList arrayList = new ArrayList();
                a second = aVar;
                for (int i10 = 0; !Intrinsics.areEqual(second, f131006j) && i10 <= 53; i10++) {
                    second = (a) second.q(2);
                    a aVar2 = f131007k;
                    int i11 = second.compareTo(aVar2) >= 0 ? 1 : 0;
                    arrayList.add(Integer.valueOf(i11));
                    if (i11 == 1) {
                        second = second.U0(aVar2).getSecond();
                    }
                }
                iF = iF2 + arrayList.size();
            } else {
                j11 = 0;
                j10 = 1;
                iF = f.a().f(this.f131017b.e1()) - f.a().j(this.f131017b.e1());
            }
            if (!(iF <= 53 ? z11 : false)) {
                throw new ArithmeticException("Value cannot be narrowed to float");
            }
        } else {
            j11 = 0;
            j10 = 1;
        }
        long j13 = (this.f131016a - j10) - this.f131018c;
        long jS = this.f131017b.S(z10);
        if (this.f131017b.compareTo(Long.MAX_VALUE) > 0 || this.f131017b.compareTo(Long.MIN_VALUE) < 0) {
            return Double.parseDouble(toString());
        }
        double d10 = jS;
        if (((long) d10) == jS && j13 >= j11) {
            double[] dArr = f131011o;
            if (j13 < dArr.length) {
                return d10 / dArr[(int) j13];
            }
        }
        return Double.parseDouble(toString());
    }

    public final long f1() {
        return this.f131022g;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public a t(short s10) {
        return (a) ca.e.a.y(this, s10);
    }

    @Override // ca.a
    public int g0() {
        return this.f131017b.g0();
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a g1() {
        return this.f131017b;
    }

    @NotNull
    public final String g2(long j10, char c10) {
        if (j10 < 0) {
            throw new RuntimeException("Char cannot be multiplied with negative number");
        }
        StringBuilder sb2 = new StringBuilder();
        while (j10 > 0) {
            sb2.append(c10);
            j10--;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // ca.a
    public long h0() {
        long j10 = this.f131016a;
        long j11 = this.f131018c;
        if (1 <= j11 && j11 < j10) {
            return j10;
        }
        if (j11 > 0 && j11 > j10) {
            return j11 + 1;
        }
        if (j11 > 0 && j11 == j10) {
            return j10 + 1;
        }
        if (j11 < 0) {
            return Math.abs(j11) + this.f131016a;
        }
        if (j11 == 0) {
            return S1(this).f131016a;
        }
        throw new RuntimeException("Invalid case when getting number of decimal digits");
    }

    public final boolean h1() {
        return this.f131023h;
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a h2() {
        long j10 = this.f131018c;
        if (j10 < 0) {
            return com.ionspin.kotlin.bignum.integer.a.f131059e.h();
        }
        long j11 = j10 - this.f131016a;
        if (j11 > 0) {
            return (com.ionspin.kotlin.bignum.integer.a) this.f131017b.p0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(j11 + 1));
        }
        return j11 < 0 ? (com.ionspin.kotlin.bignum.integer.a) this.f131017b.B0(com.ionspin.kotlin.bignum.integer.d.P(10).s0(Math.abs(j11) - 1)) : (com.ionspin.kotlin.bignum.integer.a) this.f131017b.q(10);
    }

    public int hashCode() {
        if (Intrinsics.areEqual(this, f131006j)) {
            return 0;
        }
        return S1(this).f131017b.hashCode() + Long.hashCode(this.f131018c);
    }

    @NotNull
    public final a i1() {
        return (a) z(1);
    }

    @NotNull
    public final String i2() {
        String strJ2 = j2();
        if (this.f131023h && this.f131022g > 0) {
            int i10 = 5 >> 0;
            List listSplit$default = StringsKt.split$default(strJ2, new String[]{"."}, false, 0, 6, null);
            int i11 = 0 << 1;
            if (listSplit$default.size() == 1) {
                return strJ2 + '.' + com.ionspin.kotlin.bignum.integer.util.c.f(org.locationtech.jts.geom.l.f338160j, this.f131022g);
            }
            long length = this.f131022g - ((long) ((String) listSplit$default.get(1)).length());
            if (length > 0) {
                return strJ2 + com.ionspin.kotlin.bignum.integer.util.c.f(org.locationtech.jts.geom.l.f338160j, length);
            }
        }
        return strJ2;
    }

    @Override // ca.a
    public boolean isNegative() {
        return ca.a.b.a(this);
    }

    @Override // ca.a
    public boolean isZero() {
        return this.f131017b.isZero();
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a I(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return z0(other, H0(other, b.Max));
    }

    @NotNull
    public final String j2() {
        String strA1;
        if (Intrinsics.areEqual(this, f131006j)) {
            return p.f99189d0;
        }
        long jH0 = this.f131017b.h0();
        if (this.f131018c > g3.f12256c) {
            throw new RuntimeException("Invalid toStringExpanded request (exponent > Int.MAX_VALUE)");
        }
        String strC2 = this.f131017b.c2(10);
        String str = this.f131017b.h1() == l.NEGATIVE ? "-" : "";
        long j10 = this.f131018c;
        if (j10 > 0) {
            long j11 = (j10 - jH0) + 1;
            if (j11 > 0) {
                strA1 = strC2 + g2(j11, org.locationtech.jts.geom.l.f338160j);
            } else {
                strA1 = A1(strC2, (strC2.length() - ((int) this.f131018c)) - 1);
            }
        } else if (j10 < 0) {
            int iAbs = Math.abs((int) j10);
            if (iAbs > 0) {
                strA1 = A1(g2(Math.abs(this.f131018c), org.locationtech.jts.geom.l.f338160j) + strC2, (iAbs + strC2.length()) - 1);
            } else {
                strA1 = A1(strC2, strC2.length() - 1);
            }
        } else {
            if (j10 != 0) {
                throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
            }
            if (jH0 == 1) {
                return str + strC2;
            }
            strA1 = A1(strC2, strC2.length() - 1);
        }
        return str + strA1;
    }

    @Override // ca.a
    public void k0() {
        this.f131017b.k0();
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public a L() {
        return new a(this.f131017b.negate(), this.f131018c, this.f131019d);
    }

    @Override // ca.a, ca.e
    @NotNull
    public ca.a.InterfaceC0803a<a> l() {
        return f131005i;
    }

    public final boolean l1() {
        return A0().U0(f131007k).getSecond().isZero();
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public a x0(byte b10) {
        return (a) ca.e.a.f(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public a v0(int i10) {
        return (a) ca.e.a.g(this, i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public a w0(long j10) {
        return (a) ca.e.a.h(this, j10);
    }

    @Override // ca.h
    public int q0(boolean z10) {
        F0(z10);
        return h2().q0(z10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public a v(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Z1(other, H0(other, b.Max));
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public a u0(short s10) {
        return (a) ca.e.a.j(this, s10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public a A0() {
        return new a(this.f131017b.A0(), this.f131018c, this.f131019d);
    }

    @NotNull
    public final a s1(int i10) {
        return i10 == 0 ? this : J0(this, null, this.f131018c + ((long) i10), null, 5, null);
    }

    @NotNull
    public final a t1(long j10) {
        return j10 == 0 ? this : J0(this, null, this.f131018c + j10, null, 5, null);
    }

    @Override // ca.a
    @NotNull
    public String toString() {
        String strSubstring;
        if (f131010n) {
            return j2();
        }
        String strE0 = this.f131017b.e0(10);
        int i10 = this.f131017b.compareTo(0) < 0 ? 2 : 1;
        String string = this.f131017b.toString();
        int iI3 = StringsKt.i3(string);
        while (true) {
            if (-1 >= iI3) {
                strSubstring = "";
                break;
            }
            if (string.charAt(iI3) != '0') {
                strSubstring = string.substring(0, iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                break;
            }
            iI3--;
        }
        String str = strSubstring.length() <= 1 ? p.f99189d0 : "";
        long j10 = this.f131018c;
        if (j10 > 0) {
            return z1(strE0, strE0.length() - i10) + str + "E+" + this.f131018c;
        }
        if (j10 < 0) {
            return z1(strE0, strE0.length() - i10) + str + 'E' + this.f131018c;
        }
        if (j10 != 0) {
            throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
        }
        return z1(strE0, strE0.length() - i10) + str;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public a T(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return v1(other, H0(other, b.Max));
    }

    @NotNull
    public final a v1(@NotNull a other, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        Intrinsics.checkNotNullParameter(other, "other");
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, other.f131019d, cVar);
        long jH0 = this.f131017b.h0();
        long jH1 = other.f131017b.h0();
        com.ionspin.kotlin.bignum.integer.a aVar = (com.ionspin.kotlin.bignum.integer.a) this.f131017b.p0(other.f131017b);
        long jH2 = aVar.h0();
        long j10 = 1 + this.f131018c + other.f131018c + (jH2 - (jH0 + jH1));
        return cVarG0.k() ? c1436a.I0(aVar, j10, com.ionspin.kotlin.bignum.decimal.c.g(cVarG0, jH2, null, 0L, 6, null)) : c1436a.I0(aVar, j10, cVarG0);
    }

    @Override // ca.h
    public long w(boolean z10) {
        F0(z10);
        return h2().w(z10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public a negate() {
        return new a(this.f131017b.negate(), this.f131018c, this.f131019d);
    }

    @NotNull
    public final a z0(@NotNull a other, @Nullable com.ionspin.kotlin.bignum.decimal.c cVar) {
        Intrinsics.checkNotNullParameter(other, "other");
        C1436a c1436a = f131005i;
        com.ionspin.kotlin.bignum.decimal.c cVarG0 = c1436a.G0(this.f131019d, other.f131019d, cVar);
        a aVar = f131006j;
        if (Intrinsics.areEqual(this, aVar)) {
            return c1436a.I0(other.f131017b, other.f131018c, cVarG0);
        }
        if (Intrinsics.areEqual(other, aVar)) {
            return c1436a.I0(this.f131017b, this.f131018c, cVarG0);
        }
        n1<com.ionspin.kotlin.bignum.integer.a, com.ionspin.kotlin.bignum.integer.a, Long> n1VarD0 = D0(this, other);
        com.ionspin.kotlin.bignum.integer.a aVarA = n1VarD0.a();
        com.ionspin.kotlin.bignum.integer.a aVarB = n1VarD0.b();
        long jH0 = aVarA.h0();
        long jH1 = aVarB.h0();
        com.ionspin.kotlin.bignum.integer.a aVar2 = (com.ionspin.kotlin.bignum.integer.a) aVarA.V(aVarB);
        long j10 = jH0;
        long jH2 = aVar2.h0();
        if (j10 <= jH1) {
            j10 = jH1;
        }
        long jMax = Math.max(this.f131018c, other.f131018c) + (jH2 - j10);
        return cVarG0.k() ? c1436a.I0(aVar2, jMax, com.ionspin.kotlin.bignum.decimal.c.g(cVarG0, jH2, null, 0L, 6, null)) : c1436a.I0(aVar2, jMax, cVarG0);
    }

    private a(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar) {
        e eVarI;
        if (cVar == null || !cVar.k()) {
            this.f131017b = aVar;
            this.f131016a = aVar.h0();
            this.f131018c = j10;
            this.f131019d = cVar;
        } else {
            a aVarV = f131005i.v(aVar, j10, cVar);
            if (aVarV.isZero()) {
                this.f131017b = aVarV.f131017b;
                this.f131018c = aVarV.f131018c * (cVar.h() + cVar.j());
                long jH = cVar.h() + cVar.j();
                this.f131016a = jH;
                boolean z10 = true & false;
                this.f131019d = com.ionspin.kotlin.bignum.decimal.c.g(cVar, jH, null, 0L, 6, null);
            } else {
                com.ionspin.kotlin.bignum.integer.a aVar2 = aVarV.f131017b;
                this.f131017b = aVar2;
                this.f131018c = aVarV.f131018c;
                long jH0 = aVar2.h0();
                this.f131016a = jH0;
                this.f131019d = com.ionspin.kotlin.bignum.decimal.c.g(cVar, jH0, null, 0L, 6, null);
            }
        }
        com.ionspin.kotlin.bignum.decimal.c cVar2 = this.f131019d;
        this.f131020e = cVar2 != null ? cVar2.h() : 0L;
        com.ionspin.kotlin.bignum.decimal.c cVar3 = this.f131019d;
        this.f131021f = (cVar3 == null || (eVarI = cVar3.i()) == null) ? e.NONE : eVarI;
        com.ionspin.kotlin.bignum.decimal.c cVar4 = this.f131019d;
        long j11 = cVar4 != null ? cVar4.j() : -1L;
        this.f131022g = j11;
        this.f131023h = j11 >= 0;
    }

    /* synthetic */ a(com.ionspin.kotlin.bignum.integer.a aVar, long j10, com.ionspin.kotlin.bignum.decimal.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? null : cVar);
    }
}
