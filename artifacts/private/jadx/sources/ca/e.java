package ca;

import ca.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface e<BigType extends ca.a<BigType>> {

    public static final class a {
        @NotNull
        public static <BigType extends ca.a<BigType>> BigType a(@NotNull e<BigType> eVar, byte b10) {
            return (BigType) eVar.k().n(eVar.l().m(b10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType b(@NotNull e<BigType> eVar, int i10) {
            return (BigType) eVar.k().n(eVar.l().b(i10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType c(@NotNull e<BigType> eVar, long j10) {
            return (BigType) eVar.k().n(eVar.l().n(j10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType d(@NotNull e<BigType> eVar, @NotNull BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) eVar.k().n(other);
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType e(@NotNull e<BigType> eVar, short s10) {
            return (BigType) eVar.k().n(eVar.l().o(s10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType f(@NotNull e<BigType> eVar, byte b10) {
            return (BigType) eVar.k().Z(eVar.l().m(b10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType g(@NotNull e<BigType> eVar, int i10) {
            return (BigType) eVar.k().Z(eVar.l().b(i10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType h(@NotNull e<BigType> eVar, long j10) {
            return (BigType) eVar.k().Z(eVar.l().n(j10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType i(@NotNull e<BigType> eVar, @NotNull BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) eVar.k().Z(other);
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType j(@NotNull e<BigType> eVar, short s10) {
            return (BigType) eVar.k().Z(eVar.l().o(s10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType k(@NotNull e<BigType> eVar, byte b10) {
            return (BigType) eVar.k().I(eVar.l().m(b10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType l(@NotNull e<BigType> eVar, int i10) {
            return (BigType) eVar.k().I(eVar.l().b(i10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType m(@NotNull e<BigType> eVar, long j10) {
            return (BigType) eVar.k().I(eVar.l().n(j10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType n(@NotNull e<BigType> eVar, @NotNull BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) eVar.k().I(other);
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType o(@NotNull e<BigType> eVar, short s10) {
            return (BigType) eVar.k().I(eVar.l().o(s10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType p(@NotNull e<BigType> eVar, byte b10) {
            return (BigType) eVar.k().r0(eVar.l().m(b10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType q(@NotNull e<BigType> eVar, int i10) {
            return (BigType) eVar.k().r0(eVar.l().b(i10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType r(@NotNull e<BigType> eVar, long j10) {
            return (BigType) eVar.k().r0(eVar.l().n(j10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType s(@NotNull e<BigType> eVar, @NotNull BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) eVar.k().r0(other);
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType t(@NotNull e<BigType> eVar, short s10) {
            return (BigType) eVar.k().r0(eVar.l().o(s10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType u(@NotNull e<BigType> eVar, byte b10) {
            return (BigType) eVar.k().T(eVar.l().m(b10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType v(@NotNull e<BigType> eVar, int i10) {
            return (BigType) eVar.k().T(eVar.l().b(i10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType w(@NotNull e<BigType> eVar, long j10) {
            return (BigType) eVar.k().T(eVar.l().n(j10));
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType x(@NotNull e<BigType> eVar, @NotNull BigType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return (BigType) eVar.k().T(other);
        }

        @NotNull
        public static <BigType extends ca.a<BigType>> BigType y(@NotNull e<BigType> eVar, short s10) {
            return (BigType) eVar.k().T(eVar.l().o(s10));
        }
    }

    @NotNull
    BigType B0(@NotNull BigType bigtype);

    @NotNull
    BigType D(long j10);

    @NotNull
    BigType E(short s10);

    @NotNull
    BigType H(byte b10);

    @NotNull
    BigType V(@NotNull BigType bigtype);

    @NotNull
    BigType d(short s10);

    @NotNull
    BigType d0(@NotNull BigType bigtype);

    @NotNull
    BigType e(long j10);

    @NotNull
    BigType f(int i10);

    @NotNull
    BigType k();

    @NotNull
    ca.a.InterfaceC0803a<BigType> l();

    @NotNull
    BigType l0(byte b10);

    @NotNull
    BigType m0(long j10);

    @NotNull
    BigType n0(int i10);

    @NotNull
    BigType o(byte b10);

    @NotNull
    BigType o0(short s10);

    @NotNull
    BigType p(long j10);

    @NotNull
    BigType p0(@NotNull BigType bigtype);

    @NotNull
    BigType q(int i10);

    @NotNull
    BigType r(byte b10);

    @NotNull
    BigType t(short s10);

    @NotNull
    BigType u0(short s10);

    @NotNull
    BigType v(@NotNull BigType bigtype);

    @NotNull
    BigType v0(int i10);

    @NotNull
    BigType w0(long j10);

    @NotNull
    BigType x0(byte b10);

    @NotNull
    BigType z(int i10);
}
