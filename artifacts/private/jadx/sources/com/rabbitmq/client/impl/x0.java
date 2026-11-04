package com.rabbitmq.client.impl;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class x0 {

    private static class a implements com.rabbitmq.client.k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f265889b;

        public a(byte[] bArr) {
            this.f265889b = bArr;
        }

        @Override // com.rabbitmq.client.k0
        public DataInputStream e() throws IOException {
            return new DataInputStream(new ByteArrayInputStream(this.f265889b));
        }

        public boolean equals(Object obj) {
            if (obj instanceof com.rabbitmq.client.k0) {
                return Arrays.equals(this.f265889b, ((com.rabbitmq.client.k0) obj).z());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f265889b);
        }

        @Override // com.rabbitmq.client.k0
        public long length() {
            return this.f265889b.length;
        }

        @Override // com.rabbitmq.client.k0
        public String toString() {
            return new String(this.f265889b, Charset.forName("utf-8"));
        }

        @Override // com.rabbitmq.client.k0
        public byte[] z() {
            return this.f265889b;
        }
    }

    public static com.rabbitmq.client.k0 a(String str) {
        if (str == null) {
            return null;
        }
        return new a(str.getBytes(Charset.forName("utf-8")));
    }

    public static com.rabbitmq.client.k0 b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new a(bArr);
    }
}
