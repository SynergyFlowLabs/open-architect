package com.ionspin.kotlin.bignum.integer;

import kotlin.Pair;
import kotlin.q1;
import kotlin.v1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ q1[] a(b bVar, int[] iArr, ca.f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toUIntArrayRepresentedAsTypedUByteArray-LpG4sQ0");
            }
            if ((i10 & 2) != 0) {
                fVar = ca.f.BIG;
            }
            return bVar.n(iArr, fVar);
        }

        public static /* synthetic */ byte[] b(b bVar, int[] iArr, ca.f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toUIntArrayRepresentedAsUByteArray-1NjfPbc");
            }
            if ((i10 & 2) != 0) {
                fVar = ca.f.BIG;
            }
            return bVar.Y(iArr, fVar);
        }
    }

    @NotNull
    int[] A(long j10);

    int B(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    Pair<v1, v1> C(@NotNull int[] iArr, @NotNull int[] iArr2);

    long D(@NotNull int[] iArr);

    @NotNull
    int[] E();

    @NotNull
    int[] F(@NotNull int[] iArr, int i10);

    @NotNull
    Pair<v1, v1> G(@NotNull int[] iArr);

    @NotNull
    int[] H();

    @NotNull
    int[] I(@NotNull int[] iArr);

    @NotNull
    int[] J(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] K(int i10);

    @NotNull
    int[] L(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] M(int i10);

    int N(@NotNull int[] iArr);

    @NotNull
    int[] O(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] P(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] Q(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] R(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    int[] S(@NotNull String str, int i10);

    @NotNull
    int[] T(@NotNull int[] iArr, long j10, boolean z10);

    @NotNull
    Pair<v1, v1> U(@NotNull int[] iArr);

    int V(@NotNull int[] iArr);

    @NotNull
    int[] W();

    @NotNull
    byte[] X(@NotNull int[] iArr);

    @NotNull
    byte[] Y(@NotNull int[] iArr, @NotNull ca.f fVar);

    @NotNull
    int[] Z();

    int a();

    @NotNull
    Pair<v1, l> g(@NotNull byte[] bArr);

    @NotNull
    Pair<v1, l> l(@NotNull byte[] bArr);

    @NotNull
    int[] m(byte b10);

    @NotNull
    q1[] n(@NotNull int[] iArr, @NotNull ca.f fVar);

    @NotNull
    String o(@NotNull int[] iArr, int i10);

    @NotNull
    int[] p();

    @NotNull
    int[] q(@NotNull int[] iArr, int i10);

    @NotNull
    int[] r(@NotNull int[] iArr, @NotNull int[] iArr2);

    @NotNull
    byte[] s(@NotNull int[] iArr);

    boolean t(@NotNull int[] iArr, long j10);

    @NotNull
    int[] u(short s10);

    @NotNull
    int[] v(@NotNull int[] iArr, long j10);

    @NotNull
    int[] w(byte b10);

    int x(int i10);

    @NotNull
    int[] y(short s10);

    @NotNull
    int[] z(long j10);
}
