package com.davidehrmann.vcdiff.mina_buffer;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Comparable<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f97993a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f97994b = false;

    protected d() {
    }

    public static void I2(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("allocator");
        }
        e eVar2 = f97993a;
        f97993a = eVar;
        if (eVar2 != null) {
            eVar2.dispose();
        }
    }

    public static void L2(boolean z10) {
        f97994b = z10;
    }

    public static d R2(ByteBuffer byteBuffer) {
        return f97993a.a(byteBuffer);
    }

    public static d S2(byte[] bArr) {
        return R2(ByteBuffer.wrap(bArr));
    }

    public static d T2(byte[] bArr, int i10, int i11) {
        return R2(ByteBuffer.wrap(bArr, i10, i11));
    }

    public static e Z() {
        return f97993a;
    }

    public static d b(int i10) {
        return c(i10, f97994b);
    }

    public static d c(int i10, boolean z10) {
        if (i10 >= 0) {
            return f97993a.b(i10, z10);
        }
        throw new IllegalArgumentException("capacity: " + i10);
    }

    public static boolean d1() {
        return f97994b;
    }

    protected static int k1(int i10) {
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        int iHighestOneBit = Integer.highestOneBit(i10);
        int i11 = iHighestOneBit << (iHighestOneBit < i10 ? 1 : 0);
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public abstract long A0(int i10);

    public abstract d A1(int i10, double d10);

    public abstract d A2(int i10, int i11);

    public abstract int B0();

    public abstract d B1(int i10, Enum<?> r10);

    public abstract d B2(int i10, long j10);

    public abstract int C0(int i10);

    public abstract d C1(Enum<?> r10);

    public abstract d C2(int i10, short s10);

    public abstract d D(int i10);

    public abstract Object D0() throws ClassNotFoundException;

    public abstract d D1(int i10, Enum<?> r10);

    public abstract d D2(long j10);

    public abstract d E();

    public abstract Object E0(ClassLoader classLoader) throws ClassNotFoundException;

    public abstract d E1(Enum<?> r10);

    public abstract d E2(short s10);

    public abstract String F0(int i10, CharsetDecoder charsetDecoder) throws CharacterCodingException;

    public abstract <E extends Enum<E>> d F1(int i10, Set<E> set);

    public abstract int F2();

    public abstract String G0(CharsetDecoder charsetDecoder) throws CharacterCodingException;

    public abstract <E extends Enum<E>> d G1(Set<E> set);

    public abstract d G2();

    public abstract d H();

    public abstract short H0();

    public abstract <E extends Enum<E>> d H1(int i10, Set<E> set);

    public abstract d H2();

    public abstract d I();

    public abstract short I0(int i10);

    public abstract <E extends Enum<E>> d I1(Set<E> set);

    public abstract d J0(int i10);

    public abstract <E extends Enum<E>> d J1(int i10, Set<E> set);

    public abstract d J2(boolean z10);

    public abstract d K0(int i10, int i11);

    public abstract <E extends Enum<E>> d K1(Set<E> set);

    public abstract d K2(boolean z10);

    public abstract d L(int i10);

    public abstract String L0(int i10, CharsetDecoder charsetDecoder) throws CharacterCodingException;

    public abstract <E extends Enum<E>> d L1(int i10, Set<E> set);

    public abstract d M(int i10, int i11);

    public abstract String M0(CharsetDecoder charsetDecoder) throws CharacterCodingException;

    public abstract d M2();

    public abstract d N(byte b10, int i10);

    public abstract short N0();

    public abstract <E extends Enum<E>> d N1(Set<E> set);

    public abstract d N2(int i10);

    public abstract d O(int i10);

    public abstract short O0(int i10);

    public abstract d O1(int i10, Enum<?> r10);

    public abstract d O2();

    public abstract long P0();

    public abstract d P1(Enum<?> r10);

    public abstract d P2();

    public abstract long Q0(int i10);

    public abstract d Q1(float f10);

    public abstract d Q2(byte b10);

    public abstract d R(byte b10, int i10);

    public abstract int R0();

    public abstract d R1(int i10, float f10);

    public abstract d S(int i10);

    public abstract int S0(int i10);

    public abstract d S1(int i10);

    public abstract d T();

    public abstract int T0();

    public abstract d T1(int i10, int i11);

    public abstract void U();

    public abstract int U0(int i10);

    public abstract d U1(int i10, long j10);

    public abstract byte V();

    public abstract boolean V0();

    public abstract d V1(long j10);

    public abstract byte W(int i10);

    public abstract boolean W0();

    public abstract d W1(int i10);

    public abstract d X(byte[] bArr);

    public abstract int X0(byte b10);

    public abstract d X1(int i10, int i11);

    public abstract d Y(byte[] bArr, int i10, int i11);

    public abstract boolean Y0();

    public abstract d Y1(Object obj);

    public abstract boolean Z0();

    public abstract d Z1(CharSequence charSequence, int i10, int i11, byte b10, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract char a0();

    public abstract boolean a1();

    public abstract d a2(CharSequence charSequence, int i10, int i11, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract boolean b1();

    public abstract d b2(CharSequence charSequence, int i10, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract char c0(int i10);

    public abstract boolean c1();

    public abstract d c2(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract double d0();

    public abstract d d2(int i10, short s10);

    public abstract double e0(int i10);

    public abstract int e1();

    public abstract d e2(short s10);

    public abstract <E extends Enum<E>> E f0(int i10, Class<E> cls);

    public abstract d f1(int i10);

    public abstract d f2(CharSequence charSequence, int i10, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract <E extends Enum<E>> E g0(Class<E> cls);

    public abstract d g1();

    public abstract d g2(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException;

    public abstract <E extends Enum<E>> E h0(int i10, Class<E> cls);

    public abstract int h1();

    public abstract d h2(byte b10);

    public abstract <E extends Enum<E>> E i0(Class<E> cls);

    public abstract int i1();

    public abstract d i2(int i10);

    public abstract <E extends Enum<E>> EnumSet<E> j0(int i10, Class<E> cls);

    public abstract d j1(int i10);

    public abstract d j2(int i10, byte b10);

    public abstract byte[] k();

    public abstract <E extends Enum<E>> EnumSet<E> k0(Class<E> cls);

    public abstract d k2(int i10, int i11);

    public abstract int l();

    public abstract <E extends Enum<E>> EnumSet<E> l0(int i10, Class<E> cls);

    public abstract d l1(ByteOrder byteOrder);

    public abstract d l2(int i10, long j10);

    public abstract <E extends Enum<E>> EnumSet<E> m0(Class<E> cls);

    public abstract ByteOrder m1();

    public abstract d m2(int i10, short s10);

    public abstract CharBuffer n();

    public abstract <E extends Enum<E>> EnumSet<E> n0(int i10, Class<E> cls);

    public abstract int n1();

    public abstract d n2(long j10);

    public abstract DoubleBuffer o();

    public abstract <E extends Enum<E>> EnumSet<E> o0(Class<E> cls);

    public abstract d o1(int i10);

    public abstract d o2(short s10);

    public abstract FloatBuffer p();

    public abstract <E extends Enum<E>> EnumSet<E> p0(int i10, Class<E> cls);

    public abstract boolean p1(int i10);

    public abstract d p2(byte b10);

    public abstract InputStream q();

    public abstract <E extends Enum<E>> EnumSet<E> q0(Class<E> cls);

    public abstract boolean q1(int i10, int i11);

    public abstract d q2(int i10);

    public abstract IntBuffer r();

    public abstract <E extends Enum<E>> E r0(int i10, Class<E> cls);

    public abstract d r1(byte b10);

    public abstract d r2(int i10, byte b10);

    public abstract LongBuffer s();

    public abstract <E extends Enum<E>> E s0(Class<E> cls);

    public abstract d s1(int i10, byte b10);

    public abstract d s2(int i10, int i11);

    public abstract OutputStream t();

    public abstract float t0();

    public abstract d t1(d dVar);

    public abstract d t2(int i10, long j10);

    public abstract float u0(int i10);

    public abstract d u1(ByteBuffer byteBuffer);

    public abstract d u2(int i10, short s10);

    public abstract d v();

    public abstract String v0();

    public abstract d v1(byte[] bArr);

    public abstract d v2(long j10);

    public abstract ShortBuffer w();

    public abstract String w0(int i10);

    public abstract d w1(byte[] bArr, int i10, int i11);

    public abstract d w2(short s10);

    public abstract ByteBuffer x();

    public abstract int x0();

    public abstract d x1(char c10);

    public abstract d x2(byte b10);

    public abstract int y0(int i10);

    public abstract d y1(int i10, char c10);

    public abstract d y2(int i10);

    public abstract int z();

    public abstract long z0();

    public abstract d z1(double d10);

    public abstract d z2(int i10, byte b10);
}
