package com.rabbitmq.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class m0 extends g1 {
    public m0(k kVar) throws IOException {
        super(kVar);
    }

    public static Map<String, Object> p(byte[] bArr) throws IOException {
        return new com.rabbitmq.client.impl.z0(new com.rabbitmq.client.impl.j2(new DataInputStream(new ByteArrayInputStream(bArr)))).i();
    }

    public static byte[] q(Map<String, Object> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.rabbitmq.client.impl.a1 a1Var = new com.rabbitmq.client.impl.a1(new com.rabbitmq.client.impl.k2(new DataOutputStream(byteArrayOutputStream)));
        a1Var.m(map);
        a1Var.b();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.rabbitmq.client.g1
    public byte[] f(byte[] bArr, a.c cVar) {
        try {
            return q(s(p(bArr), cVar));
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    @Override // com.rabbitmq.client.g1
    public void i(byte[] bArr) {
        try {
            t(p(bArr));
        } catch (IOException unused) {
        }
    }

    public Map<String, Object> r(Map<String, Object> map) {
        return new HashMap();
    }

    public Map<String, Object> s(Map<String, Object> map, a.c cVar) {
        return r(map);
    }

    public void t(Map<String, Object> map) {
    }

    public m0(k kVar, String str) throws IOException {
        super(kVar, str);
    }
}
