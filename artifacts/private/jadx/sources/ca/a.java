package ca;

import ca.a;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface a<BigType extends a<BigType>> {

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    public interface InterfaceC0803a<BigType> {

        /* JADX INFO: renamed from: ca.a$a$a, reason: collision with other inner class name */
        public static final class C0804a {
            public static /* synthetic */ Object a(InterfaceC0803a interfaceC0803a, String str, int i10, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseString");
                }
                if ((i11 & 2) != 0) {
                    i10 = 10;
                }
                return interfaceC0803a.q(str, i10);
            }

            public static /* synthetic */ Object b(InterfaceC0803a interfaceC0803a, double d10, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromDouble");
                }
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return interfaceC0803a.t(d10, z10);
            }

            public static /* synthetic */ Object c(InterfaceC0803a interfaceC0803a, float f10, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromFloat");
                }
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return interfaceC0803a.r(f10, z10);
            }
        }

        BigType b(int i10);

        BigType c(short s10);

        BigType d(byte b10);

        BigType f(long j10);

        BigType h();

        BigType i(int i10);

        BigType j();

        BigType k();

        BigType m(byte b10);

        BigType n(long j10);

        BigType o(short s10);

        BigType p();

        BigType q(@NotNull String str, int i10);

        BigType r(float f10, boolean z10);

        BigType s(@NotNull com.ionspin.kotlin.bignum.integer.a aVar);

        BigType t(double d10, boolean z10);
    }

    public static final class b {
        public static <BigType extends a<BigType>> boolean a(@NotNull a<BigType> aVar) {
            return aVar.g0() < 0;
        }

        public static <BigType extends a<BigType>> boolean b(@NotNull a<BigType> aVar) {
            return aVar.g0() > 0;
        }
    }

    public interface c<BigType> {
        BigType e(BigType bigtype, BigType bigtype2);

        BigType g(BigType bigtype, BigType bigtype2);
    }

    @NotNull
    BigType A0();

    @NotNull
    BigType I(@NotNull BigType bigtype);

    @NotNull
    BigType L();

    @NotNull
    BigType T(@NotNull BigType bigtype);

    @NotNull
    BigType Z(@NotNull BigType bigtype);

    boolean a0();

    int compareTo(@NotNull Object obj);

    @NotNull
    String e0(int i10);

    boolean equals(@Nullable Object obj);

    int g0();

    long h0();

    boolean isNegative();

    boolean isZero();

    void k0();

    @NotNull
    InterfaceC0803a<BigType> l();

    @NotNull
    BigType n(@NotNull BigType bigtype);

    @NotNull
    BigType negate();

    @NotNull
    BigType r0(@NotNull BigType bigtype);

    @NotNull
    BigType s0(long j10);

    @NotNull
    BigType t0(int i10);

    @NotNull
    String toString();

    @NotNull
    Pair<BigType, BigType> y0(@NotNull BigType bigtype);
}
