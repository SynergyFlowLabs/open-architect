package com.davidehrmann.vcdiff.util;

import com.rabbitmq.client.k0;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Adler32 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f98002b = {-26, 11, -99, -30, com.google.common.base.c.A, -120, -6, -15, 8, 48, h.a.f339272h, 112, 94, 116, -23, 86, -30, h.a.f339267c, -118, -90, -85, h.a.G, com.fasterxml.jackson.core.json.a.f102488j, -29, 124, 98, -120, h.a.f339271g, 106, -80, 56, 33, h.a.f339271g, -18, h.a.f339289y, 56, 40, 50, -22, com.google.common.base.c.f116462o, 3, com.google.common.base.c.f116468u, -114, 45, com.google.common.base.c.B, 122, -95, -104, 117, h.a.f339269e, 85, -4, h.a.f339267c, -11, -16, 38, -82, 125, h.a.f339284t, -75, -119, -30, -83, com.google.common.base.c.f116465r, 44, -28, 37, -103, 34, h.a.f339289y, 116, 34, h.a.f339284t, 33, -124, -97, com.google.common.base.c.F, 51, 37, com.google.common.base.c.G, 90, 119, -99, -13, 95, -70, 98, 54, -11, com.fasterxml.jackson.core.json.a.f102488j, 37, 113, 117, -6, com.google.common.base.c.f116468u, -107, -82, h.a.A, 86, 46, 10, h.a.A, -31, h.a.B, -13, 70, 108, -16, 114, 5, -67, -115, com.google.common.base.c.C, -99, 41, -79, 35, -108, 90, com.fasterxml.jackson.core.json.a.f102488j, h.a.D, 1, 82, 32, 54, 97, -81, 90, h.a.f339282r, -85, 48, com.google.common.base.c.I, -22, -95, 119, h.a.A, -9, 104, com.google.common.base.c.f116465r, 70, 33, 90, -78, h.a.f339267c, 59, com.google.common.base.c.E, h.a.f339272h, 95, -30, -22, 33, 93, h.a.K, 57, com.google.common.base.c.I, -24, h.a.f339290z, 126, h.a.f339282r, 5, com.google.common.base.c.f116471x, 75, 124, -108, h.a.f339279o, -100, -128, h.a.f339274j, 101, 111, 55, h.a.f339279o, 50, -102, 74, h.a.f339282r, 72, h.a.C, 50, 36, -92, 36, -2, h.a.f339272h, -107, 74, 82, -14, 90, -70, -78, 63, 9, -97, 0, -75, -79, 47, 67, 77, h.a.f339271g, 68, -87, -92, -83, 43, h.a.f339283s, -18, h.a.f339276l, -68, 62, 42, 114, -86, 56, -106, 126, com.google.common.base.c.F, -75, 101, h.a.f339281q, 124, -88, -81, 52, -115, -122, -87, -88, h.a.f339272h, 7, com.google.common.base.c.f116472y, -103, h.a.f339283s, 46, -5, -103, 119, -121, -103, 65, -80, -81, -105, 84, -27, com.google.common.base.c.C, 127, 36, -104, com.google.common.base.c.f116463p, 107, 52, 44, -11, -1, com.google.common.base.c.H, 0, h.a.f339289y, -103, -73, com.fasterxml.jackson.core.json.a.f102489k, com.google.common.base.c.f116473z, h.a.f339276l, 112, -11, -114, -7, -2, -26, com.fasterxml.jackson.core.json.a.f102488j, 119, kotlin.io.encoding.a.f312535i, -102, 77, -108, 81, 60, -24, 35, com.google.common.base.c.f116463p, -91, 39, 42, -103, 50, -29, h.a.f339290z, 79, h.a.H, -76, -83, -27, -117, -73, 9, h.a.f339284t, -94, -111, h.a.f339273i, -27, h.a.I, -76, 48, 68, 101, -31, 73, 114, com.google.common.base.c.B, -19, 45, h.a.f339274j, 43, h.a.f339276l, h.a.f339280p, 4, -9, -72, h.a.F, 78, com.google.common.base.c.f116463p, -19, com.google.common.base.c.f116462o, 58, -113, 50, -124, 63, -68, 0, -123, 86, h.a.f339278n, -71, 107, h.a.H, -10, 49, h.a.I, -66, h.a.J, 112, 68, h.a.f339285u, com.google.common.base.c.f116468u, -75, 118, 125, -30, -66, -73, -92, 122, 70, -31, com.fasterxml.jackson.core.json.a.f102489k, 52, h.a.f339284t, h.a.K, 72, 43, -95, 100, 88, com.google.common.base.c.f116463p, 17, h.a.f339287w, -111, 55, 6, 123, 62, -5, -71, com.google.common.base.c.f116464q, -72, 67, com.fasterxml.jackson.core.json.a.f102488j, 83, 11, 91, 60, 17, h.a.C, 10, -119, 80, 124, -30, h.a.A, h.a.f339274j, 113, h.a.C, kotlin.io.encoding.a.f312535i, -119, -12, com.google.common.base.c.f116473z, 6, 11, -24, com.google.common.base.c.f116464q, 40, 71, -6, h.a.f339289y, com.google.common.base.c.f116465r, 55, 4, -91, h.a.f339268d, -118, -74, h.a.f339280p, 122, -109, 115, -92, 125, -124, 120, -1, -113, h.a.F, 67, -86, -99, com.google.common.base.c.E, 49, 72, h.a.J, com.fasterxml.jackson.core.json.a.f102489k, 105, 103, 96, 107, -7, h.a.f339285u, -67, 100, kotlin.io.encoding.a.f312535i, 33, 44, 66, -121, -103, h.a.f339269e, -28, -4, 50, -22, -93, -68, -11, 66, h.a.f339278n, 69, -119, -121, 68, com.google.common.base.c.B, com.google.common.base.c.f116461n, -28, -106, -99, 37, 116, com.google.common.base.c.f116464q, 67, 89, 8, 62, -21, -98, 39, -92, -122, 45, 85, -85, -4, -100, -104, h.a.A, 79, 43, 55, 56, 0, 93, h.a.f339274j, 42, -79, h.a.f339279o, 93, 55, 11, 51, 46, 91, -31, h.a.B, 57, 109, -107, 4, 89, h.a.C, -70, -16, -125, -111};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f98003c = 65521;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f98004a = 0;

    private void a(int i10) {
        this.f98004a = (int) ((((long) this.f98004a) + ((long) i10)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public long getValue() {
        int value = (int) super.getValue();
        int i10 = ((65535 & value) - 1) % f98003c;
        int i11 = ((value >>> 16) - this.f98004a) % f98003c;
        if (i11 < 0) {
            i11 += f98003c;
        }
        if (i10 < 0) {
            i10 += f98003c;
        }
        return ((long) ((i11 << 16) | i10)) & k0.f265952a;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void reset() {
        super.reset();
        this.f98004a = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(int i10) {
        super.update(i10);
        a(1);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr, int i10, int i11) {
        super.update(bArr, i10, i11);
        a(i11);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr) {
        super.update(bArr);
        a(bArr.length);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2048];
        while (true) {
            int iMin = Math.min(2048, byteBuffer.remaining());
            if (iMin <= 0) {
                return;
            }
            byteBuffer.get(bArr, 0, iMin);
            update(bArr, 0, iMin);
        }
    }
}
