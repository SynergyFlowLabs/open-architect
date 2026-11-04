package com.badlogic.gdx.utils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class o extends DataOutputStream {
    public o(OutputStream outputStream) {
        super(outputStream);
    }

    private void c(String str, int i10, int i11) throws IOException {
        while (i11 < i10) {
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                write((byte) cCharAt);
            } else if (cCharAt > 2047) {
                write((byte) (((cCharAt >> '\f') & 15) | 224));
                write((byte) (((cCharAt >> 6) & 63) | 128));
                write((byte) ((cCharAt & '?') | 128));
            } else {
                write((byte) (((cCharAt >> 6) & 31) | 192));
                write((byte) ((cCharAt & '?') | 128));
            }
            i11++;
        }
    }

    public int a(int i10, boolean z10) throws IOException {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 >>> 7;
        if (i11 == 0) {
            write((byte) i10);
            return 1;
        }
        write((byte) ((i10 & 127) | 128));
        int i12 = i10 >>> 14;
        if (i12 == 0) {
            write((byte) i11);
            return 2;
        }
        write((byte) (i11 | 128));
        int i13 = i10 >>> 21;
        if (i13 == 0) {
            write((byte) i12);
            return 3;
        }
        write((byte) (i12 | 128));
        int i14 = i10 >>> 28;
        if (i14 == 0) {
            write((byte) i13);
            return 4;
        }
        write((byte) (i13 | 128));
        write((byte) i14);
        return 5;
    }

    public void b(String str) throws IOException {
        char cCharAt;
        int i10 = 0;
        if (str == null) {
            write(0);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(1);
            return;
        }
        a(length + 1, true);
        while (i10 < length && (cCharAt = str.charAt(i10)) <= 127) {
            write((byte) cCharAt);
            i10++;
        }
        if (i10 < length) {
            c(str, length, i10);
        }
    }
}
