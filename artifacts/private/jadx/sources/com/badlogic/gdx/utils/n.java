package com.badlogic.gdx.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class n extends DataInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f95709a;

    public n(InputStream inputStream) {
        super(inputStream);
        this.f95709a = new char[32];
    }

    private void c(int i10, int i11, int i12) throws IOException {
        char[] cArr = this.f95709a;
        while (true) {
            switch (i12 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i11] = (char) i12;
                    break;
                case 12:
                case 13:
                    cArr[i11] = (char) (((i12 & 31) << 6) | (read() & 63));
                    break;
                case 14:
                    cArr[i11] = (char) (((i12 & 15) << 12) | ((read() & 63) << 6) | (read() & 63));
                    break;
            }
            i11++;
            if (i11 >= i10) {
                return;
            } else {
                i12 = read() & 255;
            }
        }
    }

    public int a(boolean z10) throws IOException {
        int i10 = read();
        int i11 = i10 & 127;
        if ((i10 & 128) != 0) {
            int i12 = read();
            i11 |= (i12 & 127) << 7;
            if ((i12 & 128) != 0) {
                int i13 = read();
                i11 |= (i13 & 127) << 14;
                if ((i13 & 128) != 0) {
                    int i14 = read();
                    i11 |= (i14 & 127) << 21;
                    if ((i14 & 128) != 0) {
                        i11 |= (read() & 127) << 28;
                    }
                }
            }
        }
        return z10 ? i11 : (i11 >>> 1) ^ (-(i11 & 1));
    }

    public String b() throws IOException {
        int iA = a(true);
        if (iA == 0) {
            return null;
        }
        if (iA == 1) {
            return "";
        }
        int i10 = iA - 1;
        if (this.f95709a.length < i10) {
            this.f95709a = new char[i10];
        }
        char[] cArr = this.f95709a;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            i12 = read();
            if (i12 > 127) {
                break;
            }
            cArr[i11] = (char) i12;
            i11++;
        }
        if (i11 < i10) {
            c(i10, i11, i12);
        }
        return new String(cArr, 0, i10);
    }
}
