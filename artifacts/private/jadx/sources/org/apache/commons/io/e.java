package org.apache.commons.io;

import com.rabbitmq.client.k0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public static void A(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) (j10 & 255));
        outputStream.write((byte) ((j10 >> 8) & 255));
        outputStream.write((byte) ((j10 >> 16) & 255));
        outputStream.write((byte) ((j10 >> 24) & 255));
        outputStream.write((byte) ((j10 >> 32) & 255));
        outputStream.write((byte) ((j10 >> 40) & 255));
        outputStream.write((byte) ((j10 >> 48) & 255));
        outputStream.write((byte) ((j10 >> 56) & 255));
    }

    public static void B(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >> 56) & 255);
    }

    public static void C(OutputStream outputStream, short s10) throws IOException {
        outputStream.write((byte) (s10 & 255));
        outputStream.write((byte) ((s10 >> 8) & 255));
    }

    public static void D(byte[] bArr, int i10, short s10) {
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }

    private static int a(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (-1 != i10) {
            return i10;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double b(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(h(inputStream));
    }

    public static double c(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    public static float d(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(f(inputStream));
    }

    public static float e(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    public static int f(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16) + ((a(inputStream) & 255) << 24);
    }

    public static int g(byte[] bArr, int i10) {
        return (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + ((bArr[i10 + 3] & 255) << 24);
    }

    public static long h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) a(inputStream);
        }
        return i(bArr, 0);
    }

    public static long i(byte[] bArr, int i10) {
        return (((long) g(bArr, i10 + 4)) << 32) + (((long) g(bArr, i10)) & k0.f265952a);
    }

    public static short j(InputStream inputStream) throws IOException {
        return (short) ((a(inputStream) & 255) + ((a(inputStream) & 255) << 8));
    }

    public static short k(byte[] bArr, int i10) {
        return (short) ((bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8));
    }

    public static long l(InputStream inputStream) throws IOException {
        return (((long) (a(inputStream) & 255)) << 24) + (((long) ((a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16))) & k0.f265952a);
    }

    public static long m(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) + (((long) ((bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16))) & k0.f265952a);
    }

    public static int n(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8);
    }

    public static int o(byte[] bArr, int i10) {
        return (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8);
    }

    public static double p(double d10) {
        return Double.longBitsToDouble(s(Double.doubleToLongBits(d10)));
    }

    public static float q(float f10) {
        return Float.intBitsToFloat(r(Float.floatToIntBits(f10)));
    }

    public static int r(int i10) {
        return ((i10 & 255) << 24) + (((i10 >> 8) & 255) << 16) + (((i10 >> 16) & 255) << 8) + ((i10 >> 24) & 255);
    }

    public static long s(long j10) {
        return ((j10 & 255) << 56) + (((j10 >> 8) & 255) << 48) + (((j10 >> 16) & 255) << 40) + (((j10 >> 24) & 255) << 32) + (((j10 >> 32) & 255) << 24) + (((j10 >> 40) & 255) << 16) + (((j10 >> 48) & 255) << 8) + ((j10 >> 56) & 255);
    }

    public static short t(short s10) {
        return (short) (((s10 & 255) << 8) + ((s10 >> 8) & 255));
    }

    public static void u(OutputStream outputStream, double d10) throws IOException {
        A(outputStream, Double.doubleToLongBits(d10));
    }

    public static void v(byte[] bArr, int i10, double d10) {
        B(bArr, i10, Double.doubleToLongBits(d10));
    }

    public static void w(OutputStream outputStream, float f10) throws IOException {
        y(outputStream, Float.floatToIntBits(f10));
    }

    public static void x(byte[] bArr, int i10, float f10) {
        z(bArr, i10, Float.floatToIntBits(f10));
    }

    public static void y(OutputStream outputStream, int i10) throws IOException {
        outputStream.write((byte) (i10 & 255));
        outputStream.write((byte) ((i10 >> 8) & 255));
        outputStream.write((byte) ((i10 >> 16) & 255));
        outputStream.write((byte) ((i10 >> 24) & 255));
    }

    public static void z(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }
}
