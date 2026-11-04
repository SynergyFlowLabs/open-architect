package com.rabbitmq.client.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f265818e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f265821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteArrayOutputStream f265822d;

    public s0(int i10, int i11) {
        this.f265819a = i10;
        this.f265820b = i11;
        this.f265821c = null;
        this.f265822d = new ByteArrayOutputStream();
    }

    public static long a(List<?> list) throws UnsupportedEncodingException {
        Iterator<?> it = list.iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC += c(it.next());
        }
        return jC;
    }

    public static long b(Object[] objArr) throws UnsupportedEncodingException {
        long jC = 0;
        for (Object obj : objArr) {
            jC += c(obj);
        }
        return jC;
    }

    private static long c(Object obj) throws UnsupportedEncodingException {
        long jB;
        int length;
        if (!(obj instanceof String)) {
            if (obj instanceof com.rabbitmq.client.k0) {
                jB = ((com.rabbitmq.client.k0) obj).length();
            } else {
                if (obj instanceof Integer) {
                    return 5L;
                }
                if (obj instanceof BigDecimal) {
                    return 6L;
                }
                if ((obj instanceof Date) || (obj instanceof Timestamp)) {
                    return 9L;
                }
                if (obj instanceof Map) {
                    jB = m((Map) obj);
                } else {
                    if (obj instanceof Byte) {
                        return 2L;
                    }
                    if (obj instanceof Double) {
                        return 9L;
                    }
                    if (obj instanceof Float) {
                        return 5L;
                    }
                    if (obj instanceof Long) {
                        return 9L;
                    }
                    if (obj instanceof Short) {
                        return 3L;
                    }
                    if (obj instanceof Boolean) {
                        return 2L;
                    }
                    if (obj instanceof byte[]) {
                        length = ((byte[]) obj).length + 4;
                    } else if (obj instanceof List) {
                        jB = a((List) obj);
                    } else {
                        if (!(obj instanceof Object[])) {
                            if (obj == null) {
                                return 1L;
                            }
                            throw new IllegalArgumentException("invalid value in table");
                        }
                        jB = b((Object[]) obj);
                    }
                }
            }
            return jB + 5;
        }
        length = h((String) obj);
        return ((long) length) + 1;
    }

    public static s0 d(int i10, byte[] bArr, int i11, int i12) throws IOException {
        s0 s0Var = new s0(3, i10);
        s0Var.f().write(bArr, i11, i12);
        return s0Var;
    }

    private static int h(String str) throws UnsupportedEncodingException {
        return str.getBytes("utf-8").length + 4;
    }

    public static void i(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = {77, 81, 80};
        for (int i10 = 0; i10 < 3; i10++) {
            byte b10 = bArr[i10];
            int unsignedByte = dataInputStream.readUnsignedByte();
            if (unsignedByte != b10) {
                throw new com.rabbitmq.client.l0("Invalid AMQP protocol header from server: expected character " + ((int) b10) + ", got " + unsignedByte);
            }
        }
        try {
            int[] iArr = new int[4];
            for (int i11 = 0; i11 < 4; i11++) {
                iArr[i11] = dataInputStream.readUnsignedByte();
            }
            if (iArr[0] == 1 && iArr[1] == 1 && iArr[2] == 8 && iArr[3] == 0) {
                throw new com.rabbitmq.client.l0("AMQP protocol version mismatch; we are version 0-9-1, server is 0-8");
            }
            String str = "";
            for (int i12 = 0; i12 < 4; i12++) {
                if (i12 != 0) {
                    str = str + ",";
                }
                str = str + iArr[i12];
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AMQP protocol version mismatch; we are version 0-9-1, server sent signature ");
            sb2.append(str);
        } catch (IOException unused) {
            throw new com.rabbitmq.client.l0("Invalid AMQP protocol header from server");
        }
    }

    public static s0 j(DataInputStream dataInputStream) throws IOException {
        try {
            int unsignedByte = dataInputStream.readUnsignedByte();
            if (unsignedByte == 65) {
                i(dataInputStream);
            }
            int unsignedShort = dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            if (unsignedByte2 == 206) {
                return new s0(unsignedByte, unsignedShort, bArr);
            }
            throw new com.rabbitmq.client.l0("Bad frame end marker: " + unsignedByte2);
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }

    private static int k(String str) throws UnsupportedEncodingException {
        return str.getBytes("utf-8").length + 1;
    }

    public static long m(Map<String, Object> map) throws UnsupportedEncodingException {
        long jK = 0;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            jK = jK + ((long) k(entry.getKey())) + c(entry.getValue());
        }
        return jK;
    }

    public DataInputStream e() {
        return new DataInputStream(new ByteArrayInputStream(g()));
    }

    public DataOutputStream f() {
        return new DataOutputStream(this.f265822d);
    }

    public byte[] g() {
        byte[] bArr = this.f265821c;
        return bArr != null ? bArr : this.f265822d.toByteArray();
    }

    public int l() {
        ByteArrayOutputStream byteArrayOutputStream = this.f265822d;
        return (byteArrayOutputStream != null ? byteArrayOutputStream.size() : this.f265821c.length) + 8;
    }

    public void n(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f265819a);
        dataOutputStream.writeShort(this.f265820b);
        ByteArrayOutputStream byteArrayOutputStream = this.f265822d;
        if (byteArrayOutputStream != null) {
            dataOutputStream.writeInt(byteArrayOutputStream.size());
            this.f265822d.writeTo(dataOutputStream);
        } else {
            dataOutputStream.writeInt(this.f265821c.length);
            dataOutputStream.write(this.f265821c);
        }
        dataOutputStream.write(206);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Frame(type=");
        sb2.append(this.f265819a);
        sb2.append(", channel=");
        sb2.append(this.f265820b);
        sb2.append(", ");
        ByteArrayOutputStream byteArrayOutputStream = this.f265822d;
        if (byteArrayOutputStream == null) {
            sb2.append(this.f265821c.length);
            sb2.append(" bytes of payload)");
        } else {
            sb2.append(byteArrayOutputStream.size());
            sb2.append(" bytes of accumulator)");
        }
        return sb2.toString();
    }

    public s0(int i10, int i11, byte[] bArr) {
        this.f265819a = i10;
        this.f265820b = i11;
        this.f265821c = bArr;
        this.f265822d = null;
    }
}
