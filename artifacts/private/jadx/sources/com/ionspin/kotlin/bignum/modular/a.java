package com.ionspin.kotlin.bignum.modular;

import ca.d;
import ca.e;
import ca.g;
import ca.h;
import com.ionspin.kotlin.bignum.integer.l;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.u1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ca.a<a>, e<a>, h<a>, d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1440a f131134d = new C1440a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f131135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ca.a.InterfaceC0803a<a> f131136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f131137c;

    /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.modular.a$a, reason: collision with other inner class name */
    public static final class C1440a {

        /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.modular.a$a$a, reason: collision with other inner class name */
        public static final class C1441a implements ca.a.InterfaceC0803a<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final a f131138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final a f131139b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final a f131140c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final a f131141d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.ionspin.kotlin.bignum.integer.a f131142e;

            /* JADX INFO: renamed from: com.ionspin.kotlin.bignum.modular.a$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1442a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f131143a;

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
                    f131143a = iArr;
                }
            }

            C1441a(com.ionspin.kotlin.bignum.integer.a aVar) {
                this.f131142e = aVar;
                com.ionspin.kotlin.bignum.integer.a.c cVar = com.ionspin.kotlin.bignum.integer.a.f131059e;
                DefaultConstructorMarker defaultConstructorMarker = null;
                this.f131138a = new a(cVar.h(), aVar, this, defaultConstructorMarker);
                this.f131139b = new a(cVar.k(), aVar, this, defaultConstructorMarker);
                this.f131140c = new a(cVar.p(), aVar, this, defaultConstructorMarker);
                this.f131141d = new a(cVar.j(), aVar, this, defaultConstructorMarker);
            }

            private final com.ionspin.kotlin.bignum.integer.a E(com.ionspin.kotlin.bignum.integer.a aVar) {
                com.ionspin.kotlin.bignum.integer.a aVar2 = (com.ionspin.kotlin.bignum.integer.a) aVar.d0(this.f131142e);
                int i10 = C1442a.f131143a[aVar2.h1().ordinal()];
                if (i10 == 1) {
                    return aVar2;
                }
                if (i10 == 2) {
                    return (com.ionspin.kotlin.bignum.integer.a) aVar2.V(this.f131142e);
                }
                if (i10 == 3) {
                    return com.ionspin.kotlin.bignum.integer.a.f131059e.h();
                }
                throw new k0();
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public a j() {
                return this.f131141d;
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public a p() {
                return this.f131140c;
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public a h() {
                return this.f131138a;
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public a q(@NotNull String string, int i10) {
                Intrinsics.checkNotNullParameter(string, "string");
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.q(string, i10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public a t(double d10, boolean z10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.t(d10, z10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public a r(float f10, boolean z10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.r(f10, z10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a s(@NotNull com.ionspin.kotlin.bignum.integer.a bigInteger) {
                Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
                return new a(E(bigInteger), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public a m(byte b10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.m(b10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public a b(int i10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.b(i10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public a n(long j10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.n(j10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public a o(short s10) {
                int i10 = 7 & 0;
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.o(s10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public a d(byte b10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.d(b10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public a i(int i10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.i(i10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public a f(long j10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.f(j10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public a c(short s10) {
                return new a(E(com.ionspin.kotlin.bignum.integer.a.f131059e.c(s10)), this.f131142e, this, null);
            }

            @Override // ca.a.InterfaceC0803a
            @NotNull
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public a k() {
                return this.f131139b;
            }
        }

        public /* synthetic */ C1440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> a(byte b10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.m(b10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> b(int i10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.b(i10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> c(long j10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.n(j10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> d(@NotNull com.ionspin.kotlin.bignum.integer.a modulo) {
            Intrinsics.checkNotNullParameter(modulo, "modulo");
            return new C1441a(modulo);
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> e(short s10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.o(s10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> f(byte b10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.d(b10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> g(long j10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.f(j10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> h(int i10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.i(i10));
        }

        @NotNull
        public final ca.a.InterfaceC0803a<a> i(short s10) {
            return d(com.ionspin.kotlin.bignum.integer.a.f131059e.c(s10));
        }

        private C1440a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131144a;

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
            f131144a = iArr;
        }
    }

    public /* synthetic */ a(com.ionspin.kotlin.bignum.integer.a aVar, com.ionspin.kotlin.bignum.integer.a aVar2, ca.a.InterfaceC0803a interfaceC0803a, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, interfaceC0803a);
    }

    public static /* synthetic */ String Y0(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10;
        }
        return aVar.X0(i10);
    }

    private final void g(a aVar) {
        if (Intrinsics.areEqual(this.f131135a, aVar.f131135a)) {
            return;
        }
        throw new RuntimeException("Different moduli! This " + this.f131135a + "\n Other " + aVar.f131135a);
    }

    private final void h(a aVar) {
        if (!Intrinsics.areEqual(aVar.f131137c.b1(this.f131135a), com.ionspin.kotlin.bignum.integer.a.f131059e.k())) {
            throw new ArithmeticException("BigInteger is not invertible. Operand and modulus are not relatively prime (coprime)");
        }
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a n(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        return new a((com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) other.f131137c.s1(this.f131135a).p0(this.f131137c)).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Pair<a, a> y0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        h(other);
        com.ionspin.kotlin.bignum.integer.a.d dVarY0 = this.f131137c.Y0(other.f131137c);
        return new Pair<>(new a((com.ionspin.kotlin.bignum.integer.a) dVarY0.e().d0(this.f131135a), this.f131135a, this.f131136b), new a((com.ionspin.kotlin.bignum.integer.a) dVarY0.f().d0(this.f131135a), this.f131135a, this.f131136b));
    }

    @NotNull
    public final g C(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Pair<a, a> pairY0 = y0(other);
        return new g(pairY0.getFirst(), pairY0.getSecond());
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public a D(long j10) {
        return (a) e.a.m(this, j10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public a V(@NotNull a aVar) {
        return (a) e.a.n(this, aVar);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public a E(short s10) {
        return (a) e.a.o(this, s10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a k() {
        return this;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public a t0(int i10) {
        return new a((com.ionspin.kotlin.bignum.integer.a) this.f131137c.t0(i10).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a G() {
        return this.f131135a;
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public a s0(long j10) {
        return new a((com.ionspin.kotlin.bignum.integer.a) this.f131137c.s0(j10).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.d
    @NotNull
    public byte[] H0() {
        return this.f131137c.H0();
    }

    @NotNull
    public final a I0(@NotNull com.ionspin.kotlin.bignum.integer.a exponent) {
        Intrinsics.checkNotNullParameter(exponent, "exponent");
        com.ionspin.kotlin.bignum.integer.a aVar = this.f131135a;
        com.ionspin.kotlin.bignum.integer.a.c cVar = com.ionspin.kotlin.bignum.integer.a.f131059e;
        if (Intrinsics.areEqual(aVar, cVar.k())) {
            return this.f131136b.h();
        }
        com.ionspin.kotlin.bignum.integer.a aVarK = cVar.k();
        com.ionspin.kotlin.bignum.integer.a aVar2 = this.f131137c;
        while (exponent.compareTo(0) > 0) {
            if (Intrinsics.areEqual(exponent.n0(2), com.ionspin.kotlin.bignum.integer.a.f131059e.k())) {
                aVarK = (com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) aVarK.p0(aVar2)).d0(this.f131135a);
            }
            exponent = exponent.j0(1);
            aVar2 = (com.ionspin.kotlin.bignum.integer.a) aVar2.t0(2).d0(this.f131135a);
        }
        return new a(aVarK, this.f131135a, this.f131136b);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a J() {
        return this.f131137c;
    }

    @NotNull
    public final a J0(@NotNull a exponent) {
        Intrinsics.checkNotNullParameter(exponent, "exponent");
        return I0(exponent.f131137c);
    }

    @NotNull
    public final a K() {
        return new a(this.f131137c.s1(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public a l0(byte b10) {
        return (a) e.a.p(this, b10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public a n0(int i10) {
        return (a) e.a.q(this, i10);
    }

    @Override // ca.d
    @NotNull
    public byte[] M() {
        return this.f131137c.M();
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public a m0(long j10) {
        return (a) e.a.r(this, j10);
    }

    @Override // ca.h
    public byte N(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n(127))) <= 0) {
            return this.f131137c.N(z10);
        }
        throw new ArithmeticException("Cannot convert to byte and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public a d0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return r0(other);
    }

    @Override // ca.h
    public short O(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n(65535))) <= 0) {
            return this.f131137c.O(z10);
        }
        throw new ArithmeticException("Cannot convert to unsigned short and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a o0(short s10) {
        return (a) e.a.t(this, s10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public a x0(byte b10) {
        return (a) e.a.f(this, b10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public a r0(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        h(other);
        return new a((com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) this.f131137c.d0(other.f131137c)).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a v0(int i10) {
        return (a) e.a.g(this, i10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public a Z(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        return new a((com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) this.f131137c.v(other.f131137c)).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.h
    public short R(boolean z10) {
        if (z10 && this.f131137c.compareTo(u1.c(u1.n(32767))) > 0) {
            throw new ArithmeticException("Cannot convert to short and provide exact value");
        }
        return this.f131137c.R(z10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public a r(byte b10) {
        return (a) e.a.u(this, b10);
    }

    @Override // ca.h
    public long S(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n((int) Long.MAX_VALUE))) <= 0) {
            return this.f131137c.S(z10);
        }
        throw new ArithmeticException("Cannot convert to long and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public a q(int i10) {
        return (a) e.a.v(this, i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public a p(long j10) {
        return (a) e.a.w(this, j10);
    }

    @Override // ca.h
    public int U(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n(Integer.MAX_VALUE))) <= 0) {
            return this.f131137c.U(z10);
        }
        throw new ArithmeticException("Cannot convert to int and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public a p0(@NotNull a aVar) {
        return (a) e.a.x(this, aVar);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public a t(short s10) {
        return (a) e.a.y(this, s10);
    }

    @Override // ca.h
    public byte W(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n(255))) <= 0) {
            return this.f131137c.W(z10);
        }
        throw new ArithmeticException("Cannot convert to unsigned byte and provide exact value");
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a W0() {
        return this.f131137c;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public a w0(long j10) {
        return (a) e.a.h(this, j10);
    }

    @NotNull
    public final String X0(int i10) {
        return this.f131137c.e0(i10) + " mod " + this.f131135a.e0(i10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public a v(@NotNull a aVar) {
        return (a) e.a.i(this, aVar);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public a L() {
        return negate();
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a A0() {
        return this;
    }

    @Override // ca.a
    public boolean a0() {
        return ca.a.b.b(this);
    }

    @Override // ca.h
    public float b(boolean z10) {
        return h.a.c(this.f131137c, false, 1, null);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public a u0(short s10) {
        return (a) e.a.j(this, s10);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a I(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        return new a((com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) this.f131137c.V(other.f131137c)).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public a T(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        return new a((com.ionspin.kotlin.bignum.integer.a) ((com.ionspin.kotlin.bignum.integer.a) this.f131137c.p0(other.f131137c)).d0(this.f131135a), this.f131135a, this.f131136b);
    }

    @Override // ca.a, java.lang.Comparable
    public int compareTo(@NotNull Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof a) {
            return j((a) other);
        }
        if (other instanceof com.ionspin.kotlin.bignum.integer.a) {
            return this.f131137c.M0((com.ionspin.kotlin.bignum.integer.a) other);
        }
        if (other instanceof Long) {
            return j(this.f131136b.n(((Number) other).longValue()));
        }
        if (other instanceof Integer) {
            return j(this.f131136b.b(((Number) other).intValue()));
        }
        if (other instanceof Short) {
            return j(this.f131136b.o(((Number) other).shortValue()));
        }
        if (other instanceof Byte) {
            return j(this.f131136b.m(((Number) other).byteValue()));
        }
        throw new RuntimeException("Invalid comparison type for BigInteger: " + other);
    }

    @Override // ca.a
    @NotNull
    public String e0(int i10) {
        return this.f131137c.e0(i10);
    }

    @Override // ca.a
    public boolean equals(@Nullable Object obj) {
        if (obj != null && compareTo(obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // ca.h
    public double f0(boolean z10) {
        return h.a.b(this.f131137c, false, 1, null);
    }

    @Override // ca.a
    public int g0() {
        return this.f131137c.g0();
    }

    @Override // ca.a
    public long h0() {
        return this.f131137c.h0();
    }

    public final boolean i(@NotNull a first, @NotNull a second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return Intrinsics.areEqual(second.f131137c.b1(first.f131135a), com.ionspin.kotlin.bignum.integer.a.f131059e.k());
    }

    @Override // ca.a
    @NotNull
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public a negate() {
        return this;
    }

    @Override // ca.a
    public boolean isNegative() {
        return ca.a.b.a(this);
    }

    @Override // ca.a
    public boolean isZero() {
        return this.f131137c.isZero();
    }

    public final int j(@NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        g(other);
        return this.f131137c.compareTo(other.f131137c);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a H(byte b10) {
        return (a) e.a.k(this, b10);
    }

    @Override // ca.a
    public void k0() {
        this.f131137c.k0();
    }

    @Override // ca.a, ca.e
    @NotNull
    public ca.a.InterfaceC0803a<a> l() {
        return this.f131136b;
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a o(byte b10) {
        return (a) e.a.a(this, b10);
    }

    @Override // ca.h
    public int q0(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(-1)) <= 0) {
            return this.f131137c.q0(z10);
        }
        throw new ArithmeticException("Cannot convert to unsigned int and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public a f(int i10) {
        return (a) e.a.b(this, i10);
    }

    @Override // ca.a
    @NotNull
    public String toString() {
        return this.f131137c.toString();
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public a e(long j10) {
        return (a) e.a.c(this, j10);
    }

    @Override // ca.h
    public long w(boolean z10) {
        if (!z10 || this.f131137c.compareTo(u1.c(u1.n((int) (-1)))) <= 0) {
            return this.f131137c.w(z10);
        }
        throw new ArithmeticException("Cannot convert to unsigned long and provide exact value");
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public a B0(@NotNull a aVar) {
        return (a) e.a.d(this, aVar);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a d(short s10) {
        return (a) e.a.e(this, s10);
    }

    @Override // ca.e
    @NotNull
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public a z(int i10) {
        return (a) e.a.l(this, i10);
    }

    private a(com.ionspin.kotlin.bignum.integer.a aVar, com.ionspin.kotlin.bignum.integer.a aVar2, ca.a.InterfaceC0803a<a> interfaceC0803a) {
        this.f131135a = aVar2;
        this.f131136b = interfaceC0803a;
        int i10 = b.f131144a[aVar.h1().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                aVar = (com.ionspin.kotlin.bignum.integer.a) aVar.V(aVar2);
            } else {
                if (i10 != 3) {
                    throw new k0();
                }
                aVar = com.ionspin.kotlin.bignum.integer.a.f131059e.h();
            }
        }
        this.f131137c = aVar;
        if (aVar2.h1() == l.NEGATIVE) {
            throw new ArithmeticException("Modulus must be a positive number");
        }
    }
}
