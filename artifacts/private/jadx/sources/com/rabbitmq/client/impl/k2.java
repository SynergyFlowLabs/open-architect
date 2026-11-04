package com.rabbitmq.client.impl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f265498b = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataOutputStream f265499a;

    public k2(DataOutputStream dataOutputStream) {
        this.f265499a = dataOutputStream;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i10 = inputStream.read(bArr);
        while (-1 != i10) {
            outputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }

    public void b() throws IOException {
        this.f265499a.flush();
    }

    public final void c(List<?> list) throws IOException {
        if (list == null) {
            this.f265499a.write(0);
            return;
        }
        this.f265499a.writeInt((int) s0.a(list));
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }

    public final void d(Object[] objArr) throws IOException {
        if (objArr == null) {
            this.f265499a.write(0);
            return;
        }
        this.f265499a.writeInt((int) s0.b(objArr));
        for (Object obj : objArr) {
            e(obj);
        }
    }

    public final void e(Object obj) throws IOException {
        if (obj instanceof String) {
            k(83);
            i((String) obj);
            return;
        }
        if (obj instanceof com.rabbitmq.client.k0) {
            k(83);
            h((com.rabbitmq.client.k0) obj);
            return;
        }
        if (obj instanceof Integer) {
            k(73);
            f(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof BigDecimal) {
            k(68);
            BigDecimal bigDecimal = (BigDecimal) obj;
            if (bigDecimal.scale() > 255 || bigDecimal.scale() < 0) {
                throw new IllegalArgumentException("BigDecimal has too large of a scale to be encoded. The scale was: " + bigDecimal.scale());
            }
            k(bigDecimal.scale());
            if (bigDecimal.unscaledValue().bitLength() > 31) {
                throw new IllegalArgumentException("BigDecimal too large to be encoded");
            }
            f(bigDecimal.unscaledValue().intValue());
            return;
        }
        if (obj instanceof Date) {
            k(84);
            o((Date) obj);
            return;
        }
        if (obj instanceof Map) {
            k(70);
            n((Map) obj);
            return;
        }
        if (obj instanceof Byte) {
            k(98);
            this.f265499a.writeByte(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Double) {
            k(100);
            this.f265499a.writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            k(102);
            this.f265499a.writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            k(108);
            this.f265499a.writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Short) {
            k(115);
            this.f265499a.writeShort(((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Boolean) {
            k(androidx.media3.extractor.metadata.dvbsi.b.f67479d);
            this.f265499a.writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof byte[]) {
            k(120);
            byte[] bArr = (byte[]) obj;
            f(bArr.length);
            this.f265499a.write(bArr);
            return;
        }
        if (obj == null) {
            k(86);
            return;
        }
        if (obj instanceof List) {
            k(65);
            c((List) obj);
        } else if (obj instanceof Object[]) {
            k(65);
            d((Object[]) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type: " + obj.getClass().getName());
        }
    }

    public final void f(int i10) throws IOException {
        this.f265499a.writeInt(i10);
    }

    public final void g(long j10) throws IOException {
        this.f265499a.writeLong(j10);
    }

    public final void h(com.rabbitmq.client.k0 k0Var) throws IOException {
        f((int) k0Var.length());
        a(k0Var.e(), this.f265499a);
    }

    public final void i(String str) throws IOException {
        byte[] bytes = str.getBytes("utf-8");
        f(bytes.length);
        this.f265499a.write(bytes);
    }

    public final void j(byte b10) throws IOException {
        this.f265499a.writeByte(b10);
    }

    public final void k(int i10) throws IOException {
        this.f265499a.writeByte(i10);
    }

    public final void l(int i10) throws IOException {
        this.f265499a.writeShort(i10);
    }

    public final void m(String str) throws IOException {
        byte[] bytes = str.getBytes("utf-8");
        int length = bytes.length;
        if (length <= 255) {
            this.f265499a.writeByte(bytes.length);
            this.f265499a.write(bytes);
        } else {
            throw new IllegalArgumentException("Short string too long; utf-8 encoded length = " + length + ", max = 255.");
        }
    }

    public final void n(Map<String, Object> map) throws IOException {
        if (map == null) {
            int i10 = 6 << 0;
            this.f265499a.writeInt(0);
            return;
        }
        this.f265499a.writeInt((int) s0.m(map));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m(entry.getKey());
            e(entry.getValue());
        }
    }

    public final void o(Date date) throws IOException {
        g(date.getTime() / 1000);
    }
}
