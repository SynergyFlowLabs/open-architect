package com.rabbitmq.client.impl;

import androidx.collection.g3;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f265271b = 4294967295L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataInputStream f265272a;

    public j2(DataInputStream dataInputStream) {
        this.f265272a = dataInputStream;
    }

    private static List<Object> a(DataInputStream dataInputStream) throws IOException {
        DataInputStream dataInputStream2 = new DataInputStream(new g2(dataInputStream, p(dataInputStream.readInt())));
        ArrayList arrayList = new ArrayList();
        while (dataInputStream2.available() > 0) {
            arrayList.add(c(dataInputStream2));
        }
        return arrayList;
    }

    private static byte[] b(DataInputStream dataInputStream) throws IOException {
        long jP = p(dataInputStream.readInt());
        if (jP >= g3.f12256c) {
            throw new UnsupportedOperationException("Very long byte vectors and strings not currently supported");
        }
        byte[] bArr = new byte[(int) jP];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    static Object c(DataInputStream dataInputStream) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 65) {
            return a(dataInputStream);
        }
        if (unsignedByte == 68) {
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            byte[] bArr = new byte[4];
            dataInputStream.readFully(bArr);
            return new BigDecimal(new BigInteger(bArr), unsignedByte2);
        }
        if (unsignedByte == 70) {
            return m(dataInputStream);
        }
        if (unsignedByte == 73) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (unsignedByte == 86) {
            return null;
        }
        if (unsignedByte == 98) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (unsignedByte == 100) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (unsignedByte == 102) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (unsignedByte == 108) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (unsignedByte == 120) {
            return b(dataInputStream);
        }
        if (unsignedByte == 83) {
            return g(dataInputStream);
        }
        if (unsignedByte == 84) {
            return o(dataInputStream);
        }
        if (unsignedByte == 115) {
            return Short.valueOf(dataInputStream.readShort());
        }
        if (unsignedByte == 116) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        throw new com.rabbitmq.client.l0("Unrecognised type in table");
    }

    private static com.rabbitmq.client.k0 g(DataInputStream dataInputStream) throws IOException {
        return x0.b(b(dataInputStream));
    }

    private static String k(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.readUnsignedByte()];
        dataInputStream.readFully(bArr);
        return new String(bArr, "utf-8");
    }

    private static Map<String, Object> m(DataInputStream dataInputStream) throws IOException {
        long jP = p(dataInputStream.readInt());
        if (jP == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        DataInputStream dataInputStream2 = new DataInputStream(new g2(dataInputStream, jP));
        while (dataInputStream2.available() > 0) {
            String strK = k(dataInputStream2);
            Object objC = c(dataInputStream2);
            if (!map.containsKey(strK)) {
                map.put(strK, objC);
            }
        }
        return map;
    }

    private static Date o(DataInputStream dataInputStream) throws IOException {
        return new Date(dataInputStream.readLong() * 1000);
    }

    private static long p(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public final int d() throws IOException {
        return this.f265272a.readInt();
    }

    public final long e() throws IOException {
        return this.f265272a.readLong();
    }

    public final com.rabbitmq.client.k0 f() throws IOException {
        return g(this.f265272a);
    }

    public final int h() throws IOException {
        return this.f265272a.readUnsignedByte();
    }

    public final int i() throws IOException {
        return this.f265272a.readUnsignedShort();
    }

    public final String j() throws IOException {
        return k(this.f265272a);
    }

    public final Map<String, Object> l() throws IOException {
        return m(this.f265272a);
    }

    public final Date n() throws IOException {
        return o(this.f265272a);
    }
}
