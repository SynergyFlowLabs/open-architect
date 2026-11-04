package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte f123306a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f123307b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f123308c = 22;

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    @NonNull
    public String a() {
        byte[] bArrC = c(UUID.randomUUID(), new byte[17]);
        byte b10 = bArrC[0];
        bArrC[16] = b10;
        bArrC[0] = (byte) ((b10 & f123307b) | f123306a);
        return b(bArrC);
    }
}
