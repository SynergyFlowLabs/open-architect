package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    boolean a() throws IOException;

    byte nextByte() throws IOException;

    void reset();

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final InputStream f102363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final byte[] f102364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final int f102365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f102366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected int f102367e;

        public a(InputStream inputStream, byte[] bArr) {
            this.f102363a = inputStream;
            this.f102364b = bArr;
            this.f102365c = 0;
            this.f102367e = 0;
            this.f102366d = 0;
        }

        @Override // com.fasterxml.jackson.core.format.c
        public boolean a() throws IOException {
            int i10;
            int i11 = this.f102367e;
            if (i11 < this.f102366d) {
                return true;
            }
            InputStream inputStream = this.f102363a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f102364b;
            int length = bArr.length - i11;
            if (length < 1 || (i10 = inputStream.read(bArr, i11, length)) <= 0) {
                return false;
            }
            this.f102366d += i10;
            return true;
        }

        public b b(f fVar, d dVar) {
            InputStream inputStream = this.f102363a;
            byte[] bArr = this.f102364b;
            int i10 = this.f102365c;
            return new b(inputStream, bArr, i10, this.f102366d - i10, fVar, dVar);
        }

        @Override // com.fasterxml.jackson.core.format.c
        public byte nextByte() throws IOException {
            if (this.f102367e < this.f102366d || a()) {
                byte[] bArr = this.f102364b;
                int i10 = this.f102367e;
                this.f102367e = i10 + 1;
                return bArr[i10];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.f102367e + " bytes (max buffer size: " + this.f102364b.length + ")");
        }

        @Override // com.fasterxml.jackson.core.format.c
        public void reset() {
            this.f102367e = this.f102365c;
        }

        public a(byte[] bArr) {
            this.f102363a = null;
            this.f102364b = bArr;
            this.f102365c = 0;
            this.f102366d = bArr.length;
        }

        public a(byte[] bArr, int i10, int i11) {
            this.f102363a = null;
            this.f102364b = bArr;
            this.f102367e = i10;
            this.f102365c = i10;
            this.f102366d = i10 + i11;
        }
    }
}
