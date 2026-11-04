package com.ionspin.kotlin.bignum.integer;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.e2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n1;
import kotlin.k0;
import kotlin.q1;
import kotlin.text.StringsKt;
import kotlin.u1;
import kotlin.y1;
import kotlin.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBigInteger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigInteger.kt\ncom/ionspin/kotlin/bignum/integer/BigInteger\n+ 2 BigInteger.kt\ncom/ionspin/kotlin/bignum/integer/BigInteger$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,888:1\n131#2,34:889\n131#2,34:923\n131#2,34:957\n131#2,34:991\n1#3:1025\n*S KotlinDebug\n*F\n+ 1 BigInteger.kt\ncom/ionspin/kotlin/bignum/integer/BigInteger\n*L\n45#1:889,34\n46#1:923,34\n47#1:957,34\n48#1:991,34\n*E\n"})
public final class a implements ca.a<a>, ca.e<a>, ca.h<a>, ca.b<a>, Comparable<Object>, ca.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final c f131059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final com.ionspin.kotlin.bignum.integer.c f131060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f131061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f131062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f131063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f131064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final double f131065k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final long[] f131066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f131067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f131069d;

    /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.integer.a$a, reason: collision with other inner class name */
    public static final class C1438a implements Iterator<a>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f131070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private a f131071b;

        public C1438a(@NotNull a start, @NotNull a endInclusive) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
            this.f131070a = endInclusive;
            this.f131071b = start;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a next() {
            a aVar = this.f131071b;
            this.f131071b = aVar.j1();
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f131071b.compareTo(this.f131070a) <= 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements kotlin.ranges.g<a>, Iterable<a>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f131072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f131073b;

        public b(@NotNull a start, @NotNull a endInclusive) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
            this.f131072a = start;
            this.f131073b = endInclusive;
        }

        @Override // kotlin.ranges.g
        public boolean isEmpty() {
            return kotlin.ranges.g.a.b(this);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<a> iterator() {
            return new C1438a(u(), i());
        }

        @Override // kotlin.ranges.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean c(@NotNull a aVar) {
            return kotlin.ranges.g.a.a(this, aVar);
        }

        @Override // kotlin.ranges.g
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a i() {
            return this.f131073b;
        }

        @Override // kotlin.ranges.g
        @NotNull
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a u() {
            return this.f131072a;
        }
    }

    public static final class c implements ca.a.InterfaceC0803a<a>, ca.a.c<a>, ca.c<a> {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final /* synthetic */ <T> l v(Comparable<? super T> comparable) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            kotlin.reflect.d dVarD = j1.d(Object.class);
            if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
                Intrinsics.checkNotNull(comparable, "null cannot be cast to non-null type kotlin.Long");
                Number number = (Number) comparable;
                if (number.longValue() < 0) {
                    return l.NEGATIVE;
                }
                return number.longValue() > 0 ? l.POSITIVE : l.ZERO;
            }
            if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE))) {
                Intrinsics.checkNotNull(comparable, "null cannot be cast to non-null type kotlin.Int");
                Number number2 = (Number) comparable;
                if (number2.intValue() < 0) {
                    return l.NEGATIVE;
                }
                return number2.intValue() > 0 ? l.POSITIVE : l.ZERO;
            }
            if (Intrinsics.areEqual(dVarD, j1.d(Short.TYPE))) {
                Intrinsics.checkNotNull(comparable, "null cannot be cast to non-null type kotlin.Short");
                Number number3 = (Number) comparable;
                if (number3.shortValue() < 0) {
                    return l.NEGATIVE;
                }
                return number3.shortValue() > 0 ? l.POSITIVE : l.ZERO;
            }
            if (!Intrinsics.areEqual(dVarD, j1.d(Byte.TYPE))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported type ");
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                sb2.append(j1.d(Object.class));
                throw new RuntimeException(sb2.toString());
            }
            Intrinsics.checkNotNull(comparable, "null cannot be cast to non-null type kotlin.Byte");
            Number number4 = (Number) comparable;
            if (number4.byteValue() < 0) {
                return l.NEGATIVE;
            }
            return number4.byteValue() > 0 ? l.POSITIVE : l.ZERO;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public a n(long j10) {
            return new a(j10);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public a o(short s10) {
            return new a(s10);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public a d(byte b10) {
            return new a(a.f131060f.K(b10), l.POSITIVE, null);
        }

        @Override // ca.c
        @NotNull
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public a l(@NotNull byte[] source, @NotNull l sign) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new a(a.f131060f.P(source), sign, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public a i(int i10) {
            return new a(a.f131060f.x(i10), l.POSITIVE, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public a f(long j10) {
            return new a(a.f131060f.t(j10), l.POSITIVE, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public a c(short s10) {
            boolean z10 = true | false;
            return new a(a.f131060f.A(s10), l.POSITIVE, null);
        }

        @NotNull
        public final a H(@NotNull long[] wordArray, @NotNull l sign) {
            Intrinsics.checkNotNullParameter(wordArray, "wordArray");
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new a(wordArray, sign, null);
        }

        public final double I() {
            return a.f131065k;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public a k() {
            return a.f131062h;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public a j() {
            return a.f131064j;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public a p() {
            return a.f131063i;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public a h() {
            return a.f131061g;
        }

        @Override // ca.a.c
        @NotNull
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public a g(@NotNull a first, @NotNull a second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return first.compareTo(second) > 0 ? first : second;
        }

        @Override // ca.a.c
        @NotNull
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public a e(@NotNull a first, @NotNull a second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return first.compareTo(second) < 0 ? first : second;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public a q(@NotNull String string, int i10) {
            Intrinsics.checkNotNullParameter(string, "string");
            if (i10 < 2 || i10 > 36) {
                throw new NumberFormatException("Unsupported base: " + i10 + ". Supported base range is from 2 to 36");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (StringsKt.U2(string, '.', false, 2, null)) {
                com.ionspin.kotlin.bignum.decimal.a aVarC0 = com.ionspin.kotlin.bignum.decimal.a.f131005i.C0(string);
                if (aVarC0.v(aVarC0.X0()).compareTo(0) <= 0) {
                    return aVarC0.h2();
                }
                throw new NumberFormatException("Supplied string is decimal, which cannot be converted to BigInteger without precision loss.");
            }
            if (string.charAt(0) != '-' && string.charAt(0) != '+') {
                return (string.length() == 1 && string.charAt(0) == '0') ? h() : new a(a.f131060f.D(string, i10), l.POSITIVE, defaultConstructorMarker);
            }
            if (string.length() == 1) {
                throw new NumberFormatException("Invalid big integer: " + string);
            }
            l lVar = string.charAt(0) == '-' ? l.NEGATIVE : l.POSITIVE;
            if (string.length() == 2 && string.charAt(1) == '0') {
                return h();
            }
            com.ionspin.kotlin.bignum.integer.c cVar = a.f131060f;
            String strSubstring = string.substring(1, string.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new a(cVar.D(strSubstring, i10), lVar, defaultConstructorMarker);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public a t(double d10, boolean z10) {
            double dFloor = d10 - Math.floor(d10);
            com.ionspin.kotlin.bignum.decimal.a aVarL = com.ionspin.kotlin.bignum.decimal.a.f131005i.L(Math.floor(d10), null);
            if (z10 && dFloor > 0.0d) {
                throw new ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
            }
            return aVarL.h2();
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public a r(float f10, boolean z10) {
            double d10 = f10;
            float fFloor = f10 - ((float) Math.floor(d10));
            com.ionspin.kotlin.bignum.decimal.a aVarN = com.ionspin.kotlin.bignum.decimal.a.f131005i.N((float) Math.floor(d10), null);
            if (!z10 || fFloor <= 0.0f) {
                return aVarN.h2();
            }
            throw new ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
        }

        @NotNull
        public final a u(@NotNull long[] wordArray, @NotNull l requestedSign) {
            Intrinsics.checkNotNullParameter(wordArray, "wordArray");
            Intrinsics.checkNotNullParameter(requestedSign, "requestedSign");
            return new a(wordArray, requestedSign, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a s(@NotNull a bigInteger) {
            Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
            return bigInteger;
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a m(byte b10) {
            return new a(b10);
        }

        @Override // ca.c
        @NotNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull byte[] source, @NotNull l sign) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new a(a.f131060f.g(source), sign, null);
        }

        @Override // ca.a.InterfaceC0803a
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            return new a(i10);
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f131074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f131075b;

        public d(@NotNull a quotient, @NotNull a remainder) {
            Intrinsics.checkNotNullParameter(quotient, "quotient");
            Intrinsics.checkNotNullParameter(remainder, "remainder");
            this.f131074a = quotient;
            this.f131075b = remainder;
        }

        public static /* synthetic */ d d(d dVar, a aVar, a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = dVar.f131074a;
            }
            if ((i10 & 2) != 0) {
                aVar2 = dVar.f131075b;
            }
            return dVar.c(aVar, aVar2);
        }

        @NotNull
        public final a a() {
            return this.f131074a;
        }

        @NotNull
        public final a b() {
            return this.f131075b;
        }

        @NotNull
        public final d c(@NotNull a quotient, @NotNull a remainder) {
            Intrinsics.checkNotNullParameter(quotient, "quotient");
            Intrinsics.checkNotNullParameter(remainder, "remainder");
            return new d(quotient, remainder);
        }

        @NotNull
        public final a e() {
            return this.f131074a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f131074a, dVar.f131074a) && Intrinsics.areEqual(this.f131075b, dVar.f131075b);
        }

        @NotNull
        public final a f() {
            return this.f131075b;
        }

        public int hashCode() {
            return (this.f131074a.hashCode() * 31) + this.f131075b.hashCode();
        }

        @NotNull
        public String toString() {
            return "QuotientAndRemainder(quotient=" + this.f131074a + ", remainder=" + this.f131075b + ')';
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f131076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f131077b;

        public e(@NotNull a squareRoot, @NotNull a remainder) {
            Intrinsics.checkNotNullParameter(squareRoot, "squareRoot");
            Intrinsics.checkNotNullParameter(remainder, "remainder");
            this.f131076a = squareRoot;
            this.f131077b = remainder;
        }

        public static /* synthetic */ e d(e eVar, a aVar, a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = eVar.f131076a;
            }
            if ((i10 & 2) != 0) {
                aVar2 = eVar.f131077b;
            }
            return eVar.c(aVar, aVar2);
        }

        @NotNull
        public final a a() {
            return this.f131076a;
        }

        @NotNull
        public final a b() {
            return this.f131077b;
        }

        @NotNull
        public final e c(@NotNull a squareRoot, @NotNull a remainder) {
            Intrinsics.checkNotNullParameter(squareRoot, "squareRoot");
            Intrinsics.checkNotNullParameter(remainder, "remainder");
            return new e(squareRoot, remainder);
        }

        @NotNull
        public final a e() {
            return this.f131077b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f131076a, eVar.f131076a) && Intrinsics.areEqual(this.f131077b, eVar.f131077b);
        }

        @NotNull
        public final a f() {
            return this.f131076a;
        }

        public int hashCode() {
            return (this.f131076a.hashCode() * 31) + this.f131077b.hashCode();
        }

        @NotNull
        public String toString() {
            return "SqareRootAndRemainder(squareRoot=" + this.f131076a + ", remainder=" + this.f131077b + ')';
        }
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131078a;

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
            f131078a = iArr;
        }
    }

    static final class g extends l0 implements Function1<a, Integer> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@NotNull a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(a.this.M0(it));
        }
    }

    static final class h extends l0 implements Function1<a, Integer> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@NotNull a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(a.this.M0(it));
        }
    }

    static final class i extends l0 implements Function1<a, Integer> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@NotNull a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(a.this.M0(it));
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f131059e = new c(defaultConstructorMarker);
        com.ionspin.kotlin.bignum.integer.c cVarA = com.ionspin.kotlin.bignum.integer.f.a();
        f131060f = cVarA;
        f131061g = new a(cVarA.E(), l.ZERO, defaultConstructorMarker);
        long[] jArrO = cVarA.o();
        l lVar = l.POSITIVE;
        f131062h = new a(jArrO, lVar, defaultConstructorMarker);
        f131063i = new a(cVarA.B(), lVar, defaultConstructorMarker);
        f131064j = new a(cVarA.m(), lVar, defaultConstructorMarker);
        f131065k = Math.log10(2.0d);
    }

    public /* synthetic */ a(long[] jArr, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, lVar);
    }

    private final a P0() {
        return new a(f131060f.L(this.f131066a).getFirst().G(), this.f131067b, null);
    }

    private final a Z0(a aVar, a aVar2, a aVar3) {
        while (true) {
            a aVar4 = f131061g;
            if (Intrinsics.areEqual(aVar3, aVar4)) {
                return aVar;
            }
            if (Intrinsics.areEqual(aVar3, f131062h)) {
                return (a) aVar2.p0(aVar);
            }
            if (Intrinsics.areEqual(aVar3.r1(f131063i), aVar4)) {
                aVar2 = (a) aVar2.p0(aVar2);
                aVar3 = (a) aVar3.f(2);
            } else {
                aVar = (a) aVar2.p0(aVar);
                aVar2 = (a) aVar2.p0(aVar2);
                aVar3 = (a) ((a) aVar3.v0(1)).f(2);
            }
        }
    }

    private final boolean k1(long[] jArr) {
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        return cVar.H(jArr, cVar.E()) == 0;
    }

    private final int l1(Number number) {
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue > 9.223372036854776E18d) {
            return M0((a) ca.a.InterfaceC0803a.C0804a.a(f131059e, String.valueOf(dDoubleValue), 0, 2, null));
        }
        return dDoubleValue % ((double) 1) == 0.0d ? M0(f131059e.n(number.longValue())) : O0(number.floatValue(), new i());
    }

    private final a u1(a aVar) {
        while (true) {
            a aVar2 = aVar;
            a aVar3 = this;
            this = aVar2;
            if (Intrinsics.areEqual(this, f131061g)) {
                return aVar3;
            }
            aVar = (a) aVar3.d0(this);
        }
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public a D(long j10) {
        return (a) ca.e.a.m(this, j10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public a V(@NotNull a aVar) {
        return (a) ca.e.a.n(this, aVar);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public a A0() {
        return new a(this.f131066a, l.POSITIVE, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public a E(short s10) {
        return (a) ca.e.a.o(this, s10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public a t0(int i10) {
        return s0(i10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public a s0(long j10) {
        if (j10 < 0) {
            throw new ArithmeticException("Negative exponent not supported with BigInteger");
        }
        a aVar = f131061g;
        if (Intrinsics.areEqual(this, aVar)) {
            return aVar;
        }
        a aVar2 = f131062h;
        if (Intrinsics.areEqual(this, aVar2)) {
            return aVar2;
        }
        l lVar = this.f131067b;
        l lVar2 = l.NEGATIVE;
        if (lVar != lVar2 || j10 % ((long) 2) == 0) {
            lVar2 = l.POSITIVE;
        }
        return new a(f131060f.N(this.f131066a, j10), lVar2, null);
    }

    @NotNull
    public final a F1(@NotNull a exponent) {
        Intrinsics.checkNotNullParameter(exponent, "exponent");
        if (exponent.compareTo(f131061g) >= 0) {
            return exponent.compareTo(Long.MAX_VALUE) <= 0 ? s0(z1.t(exponent.f131066a, 0)) : Z0(f131062h, this, exponent);
        }
        throw new ArithmeticException("Negative exponent not supported with BigInteger");
    }

    @NotNull
    public final b G1(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new b(this, other);
    }

    @Override // ca.d
    @NotNull
    public byte[] H0() {
        return f131060f.p(this.f131066a);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
    public a l0(byte b10) {
        return (a) ca.e.a.p(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public a n0(int i10) {
        return (a) ca.e.a.q(this, i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public a m0(long j10) {
        return (a) ca.e.a.r(this, j10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public a I(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        int iH = cVar.H(this.f131066a, other.f131066a);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (other.f131067b == this.f131067b) {
            return new a(cVar.F(this.f131066a, other.f131066a), this.f131067b, defaultConstructorMarker);
        }
        if (iH > 0) {
            return new a(cVar.v(this.f131066a, other.f131066a), this.f131067b, defaultConstructorMarker);
        }
        return iH < 0 ? new a(cVar.v(other.f131066a, this.f131066a), other.f131067b, defaultConstructorMarker) : f131061g;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public a d0(@NotNull a aVar) {
        return (a) ca.e.a.s(this, aVar);
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public a Y(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new a(f131060f.i(this.f131066a, other.f131066a), this.f131067b, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public a o0(short s10) {
        return (a) ca.e.a.t(this, s10);
    }

    @Override // ca.d
    @NotNull
    public byte[] M() {
        return f131060f.k(this.f131066a);
    }

    public final int M0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isZero() && other.isZero()) {
            return 0;
        }
        if (other.isZero() && this.f131067b == l.POSITIVE) {
            return 1;
        }
        if (other.isZero() && this.f131067b == l.NEGATIVE) {
            return -1;
        }
        if (isZero() && other.f131067b == l.POSITIVE) {
            return -1;
        }
        if (isZero() && other.f131067b == l.NEGATIVE) {
            return 1;
        }
        l lVar = this.f131067b;
        if (lVar != other.f131067b) {
            return lVar == l.POSITIVE ? 1 : -1;
        }
        int iH = f131060f.H(this.f131066a, other.f131066a);
        l lVar2 = this.f131067b;
        l lVar3 = l.NEGATIVE;
        return (lVar2 == lVar3 && other.f131067b == lVar3) ? iH * (-1) : iH;
    }

    @Override // ca.h
    public byte N(boolean z10) {
        if (!z10 || (compareTo((byte) 127) <= 0 && compareTo((byte) -128) >= 0)) {
            return (byte) (((byte) z1.t(this.f131066a, 0)) * g0());
        }
        throw new ArithmeticException("Cannot convert to byte and provide exact value");
    }

    public final int N0(double d10, @NotNull Function1<? super a, Integer> comparisonBlock) {
        Intrinsics.checkNotNullParameter(comparisonBlock, "comparisonBlock");
        double dFloor = Math.floor(d10);
        double d11 = 1;
        if (d10 % d11 == 0.0d) {
            return comparisonBlock.invoke(ca.a.InterfaceC0803a.C0804a.b(f131059e, dFloor, false, 2, null)).intValue();
        }
        int i10 = 5 | 0;
        int iIntValue = comparisonBlock.invoke(ca.a.InterfaceC0803a.C0804a.b(f131059e, dFloor + d11, false, 2, null)).intValue();
        if (iIntValue == 0) {
            return 1;
        }
        return iIntValue;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: N1, reason: merged with bridge method [inline-methods] */
    public a r0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.isZero()) {
            throw new ArithmeticException("Division by zero! " + this + " / " + other);
        }
        l lVar = this.f131067b != other.f131067b ? l.NEGATIVE : l.POSITIVE;
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        long[] jArrG = cVar.Q(this.f131066a, other.f131066a).getSecond().G();
        if (z1.s(jArrG, cVar.E())) {
            lVar = l.ZERO;
        }
        return new a(jArrG, lVar, null);
    }

    @Override // ca.h
    public short O(boolean z10) {
        if ((!z10 || compareTo(u1.c(u1.n(65535))) <= 0) && !isNegative()) {
            return e2.n((short) z1.t(this.f131066a, 0));
        }
        throw new ArithmeticException("Cannot convert to unsigned short and provide exact value");
    }

    public final int O0(float f10, @NotNull Function1<? super a, Integer> comparisonBlock) {
        Intrinsics.checkNotNullParameter(comparisonBlock, "comparisonBlock");
        float fFloor = (float) Math.floor(f10);
        float f11 = 1;
        if (f10 % f11 == 0.0f) {
            return comparisonBlock.invoke(ca.a.InterfaceC0803a.C0804a.c(f131059e, fFloor, false, 2, null)).intValue();
        }
        int iIntValue = comparisonBlock.invoke(ca.a.InterfaceC0803a.C0804a.c(f131059e, fFloor + f11, false, 2, null)).intValue();
        if (iIntValue == 0) {
            return 1;
        }
        return iIntValue;
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public a z0(long j10, boolean z10) {
        return new a(f131060f.r(this.f131066a, j10, z10), this.f131067b, null);
    }

    public final void P1(@Nullable String str) {
        this.f131069d = str;
    }

    @NotNull
    public final a Q0() {
        return (a) v(f131062h);
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public a i0(int i10) {
        return new a(f131060f.w(this.f131066a, i10), this.f131067b, null);
    }

    @Override // ca.h
    public short R(boolean z10) {
        if (!z10 || (compareTo(Short.valueOf(n1.f312766c)) <= 0 && compareTo(Short.valueOf(n1.f312765b)) >= 0)) {
            return (short) (((short) z1.t(this.f131066a, 0)) * g0());
        }
        throw new ArithmeticException("Cannot convert to short and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public a o(byte b10) {
        return (a) ca.e.a.a(this, b10);
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
    public a j0(int i10) {
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        a aVar = new a(cVar.M(this.f131066a, i10), this.f131067b, null);
        return z1.s(aVar.f131066a, cVar.E()) ? f131061g : aVar;
    }

    @Override // ca.h
    public long S(boolean z10) {
        long jT;
        int iG0;
        if (z10 && (compareTo(Long.MAX_VALUE) > 0 || compareTo(Long.MIN_VALUE) < 0)) {
            throw new ArithmeticException("Cannot convert to long and provide exact value");
        }
        if (z1.v(this.f131066a) > 1) {
            jT = z1.t(this.f131066a, 0) | y1.n(z1.t(this.f131066a, 1) << 63);
            iG0 = g0();
        } else {
            jT = z1.t(this.f131066a, 0);
            iG0 = g0();
        }
        return jT * ((long) iG0);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public a f(int i10) {
        return (a) ca.e.a.b(this, i10);
    }

    @NotNull
    public final a S1() {
        return new a(f131060f.h(this.f131066a).getFirst().G(), this.f131067b, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public a e(long j10) {
        return (a) ca.e.a.c(this, j10);
    }

    @NotNull
    public final e T1() {
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new e(new a(cVar.h(this.f131066a).getFirst().G(), this.f131067b, defaultConstructorMarker), new a(cVar.h(this.f131066a).getSecond().G(), this.f131067b, defaultConstructorMarker));
    }

    @Override // ca.h
    public int U(boolean z10) {
        if (!z10 || (compareTo(Integer.MAX_VALUE) <= 0 && compareTo(Integer.MIN_VALUE) >= 0)) {
            return ((int) z1.t(this.f131066a, 0)) * g0();
        }
        throw new ArithmeticException("Cannot convert to int and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public a B0(@NotNull a aVar) {
        return (a) ca.e.a.d(this, aVar);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
    public a Z(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
        int iH = cVar.H(this.f131066a, other.f131066a);
        a aVar = f131061g;
        if (Intrinsics.areEqual(this, aVar)) {
            return other.negate();
        }
        if (Intrinsics.areEqual(other, aVar)) {
            return this;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (other.f131067b != this.f131067b) {
            return new a(cVar.F(this.f131066a, other.f131066a), this.f131067b, defaultConstructorMarker);
        }
        if (iH > 0) {
            return new a(cVar.v(this.f131066a, other.f131066a), this.f131067b, defaultConstructorMarker);
        }
        return iH < 0 ? new a(cVar.v(other.f131066a, this.f131066a), this.f131067b.n(), defaultConstructorMarker) : aVar;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public a d(short s10) {
        return (a) ca.e.a.e(this, s10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] */
    public a r(byte b10) {
        return (a) ca.e.a.u(this, b10);
    }

    @Override // ca.h
    public byte W(boolean z10) {
        if (z10 && (compareTo(u1.c(u1.n(255))) > 0 || isNegative())) {
            throw new ArithmeticException("Cannot convert to unsigned byte and provide exact value");
        }
        return q1.n((byte) z1.t(this.f131066a, 0));
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public a n(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!other.isZero()) {
            com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
            long[] jArrG = cVar.Q(this.f131066a, other.f131066a).getFirst().G();
            if (z1.s(jArrG, cVar.E())) {
                return f131061g;
            }
            return new a(jArrG, this.f131067b != other.f131067b ? l.NEGATIVE : l.POSITIVE, null);
        }
        throw new ArithmeticException("Division by zero! " + this + " / " + other);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] */
    public a q(int i10) {
        return (a) ca.e.a.v(this, i10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public Pair<a, a> y0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!other.isZero()) {
            l lVar = this.f131067b != other.f131067b ? l.NEGATIVE : l.POSITIVE;
            com.ionspin.kotlin.bignum.integer.c cVar = f131060f;
            Pair<z1, z1> pairQ = cVar.Q(this.f131066a, other.f131066a);
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Pair<>(z1.s(pairQ.getFirst().G(), cVar.E()) ? f131061g : new a(pairQ.getFirst().G(), lVar, defaultConstructorMarker), z1.s(pairQ.getSecond().G(), cVar.E()) ? f131061g : new a(pairQ.getSecond().G(), this.f131067b, defaultConstructorMarker));
        }
        throw new ArithmeticException("Division by zero! " + this + " / " + other);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public a p(long j10) {
        return (a) ca.e.a.w(this, j10);
    }

    @NotNull
    public final d Y0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Pair<a, a> pairY0 = y0(other);
        return new d(pairY0.getFirst(), pairY0.getSecond());
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public a p0(@NotNull a aVar) {
        return (a) ca.e.a.x(this, aVar);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public a t(short s10) {
        return (a) ca.e.a.y(this, s10);
    }

    @Override // ca.a
    public boolean a0() {
        return ca.a.b.b(this);
    }

    @NotNull
    public final a a1() {
        a aVarJ1 = f131062h;
        a aVarA0 = A0();
        a aVar = aVarJ1;
        while (aVarJ1.compareTo(aVarA0) <= 0) {
            aVar = (a) aVar.p0(aVarJ1);
            aVarJ1 = aVarJ1.j1();
        }
        return isNegative() ? aVar.L() : aVar;
    }

    @NotNull
    public final String a2(char c10) {
        if (compareTo(0) < 0) {
            throw new RuntimeException("Char cannot be multiplied with negative number");
        }
        StringBuilder sb2 = new StringBuilder();
        while (this.compareTo(0) > 0) {
            sb2.append(c10);
            this = this.Q0();
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // ca.h
    public float b(boolean z10) {
        if (!z10 || A0().compareTo(Float.valueOf(Float.MAX_VALUE)) <= 0) {
            return Float.parseFloat(toString());
        }
        throw new ArithmeticException("Cannot convert to float and provide exact value");
    }

    @NotNull
    public final a b1(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new a(f131060f.z(this.f131066a, other.f131066a), l.POSITIVE, null);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.modular.a b2(@NotNull a modulo) {
        Intrinsics.checkNotNullParameter(modulo, "modulo");
        return com.ionspin.kotlin.bignum.modular.a.f131134d.d(modulo).s(this);
    }

    @Override // ca.b
    public boolean c0(long j10) {
        return f131060f.n(this.f131066a, j10);
    }

    @NotNull
    public final long[] c1() {
        long[] jArr = this.f131066a;
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return z1.k(jArrCopyOf);
    }

    @NotNull
    public final String c2(int i10) {
        return f131060f.y(this.f131066a, i10);
    }

    @Override // ca.a, java.lang.Comparable
    public int compareTo(@NotNull Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if ((other instanceof Number) && j.f131119a.a() == com.ionspin.kotlin.bignum.integer.g.JS) {
            return l1((Number) other);
        }
        if (other instanceof a) {
            return M0((a) other);
        }
        if (other instanceof Long) {
            return M0(f131059e.n(((Number) other).longValue()));
        }
        if (other instanceof Integer) {
            return M0(f131059e.b(((Number) other).intValue()));
        }
        if (other instanceof Short) {
            return M0(f131059e.o(((Number) other).shortValue()));
        }
        if (other instanceof Byte) {
            return M0(f131059e.m(((Number) other).byteValue()));
        }
        if (other instanceof y1) {
            return M0(f131059e.f(((y1) other).z0()));
        }
        if (other instanceof u1) {
            return M0(f131059e.i(((u1) other).z0()));
        }
        if (other instanceof e2) {
            return M0(f131059e.c(((e2) other).x0()));
        }
        if (other instanceof q1) {
            return M0(f131059e.d(((q1) other).x0()));
        }
        if (other instanceof Float) {
            return O0(((Number) other).floatValue(), new g());
        }
        if (other instanceof Double) {
            return N0(((Number) other).doubleValue(), new h());
        }
        throw new RuntimeException("Invalid comparison type for BigInteger: " + j1.d(other.getClass()));
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public a k() {
        return this;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public a L() {
        return negate();
    }

    @Override // ca.a
    @NotNull
    public String e0(int i10) {
        return (this.f131067b == l.NEGATIVE ? "-" : "") + c2(i10);
    }

    @NotNull
    public final long[] e1() {
        return this.f131066a;
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public a c(@NotNull a other) {
        l lVar;
        Intrinsics.checkNotNullParameter(other, "other");
        long[] jArrJ = f131060f.J(this.f131066a, other.f131066a);
        if (other.isNegative() ^ isNegative()) {
            lVar = l.NEGATIVE;
        } else {
            lVar = k1(jArrJ) ? l.ZERO : l.POSITIVE;
        }
        return new a(jArrJ, lVar, null);
    }

    @Override // ca.a
    public boolean equals(@Nullable Object obj) {
        int iM0;
        if (obj instanceof a) {
            iM0 = M0((a) obj);
        } else if (obj instanceof Long) {
            iM0 = M0(f131059e.n(((Number) obj).longValue()));
        } else if (obj instanceof Integer) {
            iM0 = M0(f131059e.b(((Number) obj).intValue()));
        } else if (obj instanceof Short) {
            iM0 = M0(f131059e.o(((Number) obj).shortValue()));
        } else if (obj instanceof Byte) {
            iM0 = M0(f131059e.m(((Number) obj).byteValue()));
        } else if (obj instanceof y1) {
            iM0 = M0(f131059e.f(((y1) obj).z0()));
        } else if (obj instanceof u1) {
            iM0 = M0(f131059e.i(((u1) obj).z0()));
        } else if (obj instanceof e2) {
            iM0 = M0(f131059e.c(((e2) obj).x0()));
        } else {
            iM0 = obj instanceof q1 ? M0(f131059e.d(((q1) obj).x0())) : -1;
        }
        return iM0 == 0;
    }

    @Override // ca.h
    public double f0(boolean z10) {
        Double dValueOf = Double.valueOf(Double.MAX_VALUE);
        if (!z10 || A0().compareTo(dValueOf) <= 0) {
            return Double.parseDouble(toString());
        }
        System.out.println(A0());
        System.out.println(Double.MAX_VALUE);
        if (A0().compareTo(dValueOf) > 0) {
            System.out.println((Object) "huh");
        }
        throw new ArithmeticException("Cannot convert to double and provide exact value");
    }

    public final int f1() {
        return this.f131068c;
    }

    @Override // ca.a
    public int g0() {
        int i10 = f.f131078a[this.f131067b.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return -1;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new k0();
    }

    @NotNull
    public final l g1() {
        return this.f131067b;
    }

    @Override // ca.a
    public long h0() {
        if (isZero()) {
            return 1L;
        }
        int iCeil = (int) Math.ceil(((double) (f131060f.f(this.f131066a) - 1)) * f131065k);
        a aVar = (a) B0(com.ionspin.kotlin.bignum.integer.d.P(10).t0(iCeil));
        long j10 = 0;
        while (aVar.compareTo(0) != 0) {
            aVar = (a) aVar.f(10);
            j10++;
        }
        return j10 + ((long) iCeil);
    }

    @NotNull
    public final l h1() {
        return this.f131067b;
    }

    public int hashCode() {
        long[] jArr = this.f131066a;
        int iV = z1.v(jArr);
        int iH = 0;
        for (int i10 = 0; i10 < iV; i10++) {
            iH += y1.H(z1.t(jArr, i10));
        }
        return iH + this.f131067b.hashCode();
    }

    @Nullable
    public final String i1() {
        return this.f131069d;
    }

    @Override // ca.a
    public boolean isNegative() {
        return ca.a.b.a(this);
    }

    @Override // ca.a
    public boolean isZero() {
        return this.f131067b == l.ZERO || com.ionspin.kotlin.bignum.integer.f.a().H(this.f131066a, com.ionspin.kotlin.bignum.integer.f.a().E()) == 0;
    }

    @NotNull
    public final a j1() {
        return (a) V(f131062h);
    }

    @Override // ca.a
    public void k0() {
        int iV = z1.v(this.f131066a);
        for (int i10 = 0; i10 < iV; i10++) {
            z1.D(this.f131066a, i10, 0L);
        }
    }

    @Override // ca.a, ca.e
    @NotNull
    public ca.a.InterfaceC0803a<a> l() {
        return f131059e;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public a x0(byte b10) {
        return (a) ca.e.a.f(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public a v0(int i10) {
        return (a) ca.e.a.g(this, i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public a w0(long j10) {
        return (a) ca.e.a.h(this, j10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public a v(@NotNull a aVar) {
        return (a) ca.e.a.i(this, aVar);
    }

    @Override // ca.h
    public int q0(boolean z10) {
        if (!z10 || (compareTo(u1.c(-1)) <= 0 && !isNegative())) {
            return u1.n((int) z1.t(this.f131066a, 0));
        }
        throw new ArithmeticException("Cannot convert to unsigned int and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public a u0(short s10) {
        return (a) ca.e.a.j(this, s10);
    }

    @NotNull
    public final a r1(@NotNull a modulo) {
        Intrinsics.checkNotNullParameter(modulo, "modulo");
        a aVar = (a) d0(modulo);
        return aVar.compareTo(0) < 0 ? (a) aVar.V(modulo) : aVar;
    }

    @Override // ca.b
    public int s() {
        return f131060f.f(this.f131066a);
    }

    @NotNull
    public final a s1(@NotNull a modulo) {
        Intrinsics.checkNotNullParameter(modulo, "modulo");
        a aVarB1 = b1(modulo);
        a aVar = f131062h;
        if (!Intrinsics.areEqual(aVarB1, aVar)) {
            throw new ArithmeticException("BigInteger is not invertible. This and modulus are not relatively prime (coprime)");
        }
        a aVar2 = f131061g;
        a aVar3 = this;
        a aVar4 = modulo;
        while (!Intrinsics.areEqual(aVar4, f131061g)) {
            d dVarY0 = aVar3.Y0(aVar4);
            a aVarA = dVarY0.a();
            a aVarB = dVarY0.b();
            a aVar5 = (a) aVar.v(aVarA.p0(aVar2));
            aVar3 = aVar4;
            aVar4 = aVarB;
            aVar = aVar2;
            aVar2 = aVar5;
        }
        return aVar;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public a T(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!isZero() && !other.isZero()) {
            if (Intrinsics.areEqual(other, f131062h)) {
                return this;
            }
            l lVar = this.f131067b != other.f131067b ? l.NEGATIVE : l.POSITIVE;
            DefaultConstructorMarker defaultConstructorMarker = null;
            return lVar == l.POSITIVE ? new a(f131060f.I(this.f131066a, other.f131066a), lVar, defaultConstructorMarker) : new a(f131060f.I(this.f131066a, other.f131066a), lVar, defaultConstructorMarker);
        }
        return f131061g;
    }

    @Override // ca.a
    @NotNull
    public String toString() {
        return e0(10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public a negate() {
        return new a(this.f131066a, this.f131067b.n(), null);
    }

    @Override // ca.h
    public long w(boolean z10) {
        if (z10 && (compareTo(y1.c(-1L)) > 0 || isNegative())) {
            throw new ArithmeticException("Cannot convert to unsigned long and provide exact value");
        }
        if (z1.v(this.f131066a) <= 1) {
            return z1.t(this.f131066a, 0);
        }
        return y1.n(z1.t(this.f131066a, 0) | y1.n(z1.t(this.f131066a, 1) << 63));
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public a x() {
        return new a(f131060f.G(this.f131066a), this.f131067b, null);
    }

    @Override // ca.b
    @NotNull
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public a X(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new a(f131060f.R(this.f131066a, other.f131066a), this.f131067b, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public a H(byte b10) {
        return (a) ca.e.a.k(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public a z(int i10) {
        return (a) ca.e.a.l(this, i10);
    }

    private a(long[] wordArray, l requestedSign) {
        Intrinsics.checkNotNullParameter(wordArray, "wordArray");
        Intrinsics.checkNotNullParameter(requestedSign, "requestedSign");
        l lVar = l.ZERO;
        if (requestedSign == lVar && !k1(wordArray)) {
            throw new IllegalArgumentException("sign should be Sign.ZERO iff magnitude has a value of 0");
        }
        long[] jArrH1 = ea.a.f274713a.h1(wordArray);
        this.f131066a = jArrH1;
        this.f131067b = k1(jArrH1) ? lVar : requestedSign;
        this.f131068c = z1.v(jArrH1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(long j10) {
        l lVar;
        long[] jArrU = f131060f.u(j10);
        Number numberValueOf = Long.valueOf(j10);
        kotlin.reflect.d dVarD = j1.d(Long.class);
        if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.longValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.intValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.shortValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.byteValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + j1.d(Long.class));
        }
        this(jArrU, lVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10) {
        l lVar;
        long[] jArrS = f131060f.s(i10);
        Number numberValueOf = Integer.valueOf(i10);
        kotlin.reflect.d dVarD = j1.d(Integer.class);
        if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.longValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.intValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.shortValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.byteValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + j1.d(Integer.class));
        }
        this(jArrS, lVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(short s10) {
        l lVar;
        long[] jArrQ = f131060f.q(s10);
        Number numberValueOf = Short.valueOf(s10);
        kotlin.reflect.d dVarD = j1.d(Short.class);
        if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.longValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.intValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.shortValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.byteValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else {
            throw new RuntimeException("Unsupported type " + j1.d(Short.class));
        }
        this(jArrQ, lVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(byte b10) {
        l lVar;
        long[] jArrO = f131060f.O(b10);
        Number numberValueOf = Byte.valueOf(b10);
        kotlin.reflect.d dVarD = j1.d(Byte.class);
        if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.longValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.intValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else if (Intrinsics.areEqual(dVarD, j1.d(Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.shortValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        } else {
            if (!Intrinsics.areEqual(dVarD, j1.d(Byte.TYPE))) {
                throw new RuntimeException("Unsupported type " + j1.d(Byte.class));
            }
            if (numberValueOf.byteValue() < 0) {
                lVar = l.NEGATIVE;
            } else {
                lVar = numberValueOf.byteValue() > 0 ? l.POSITIVE : l.ZERO;
            }
        }
        this(jArrO, lVar, null);
    }
}
