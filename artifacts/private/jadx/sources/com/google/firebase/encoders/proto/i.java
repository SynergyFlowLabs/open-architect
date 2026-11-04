package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class i implements com.google.firebase.encoders.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f122052a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f122053b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.d f122054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f122055d;

    i(f fVar) {
        this.f122055d = fVar;
    }

    private void a() {
        if (this.f122052a) {
            throw new com.google.firebase.encoders.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f122052a = true;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h add(double d10) throws IOException {
        a();
        this.f122055d.c(this.f122054c, d10, this.f122053b);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h b(@p0 String str) throws IOException {
        a();
        this.f122055d.r(this.f122054c, str, this.f122053b);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h c(boolean z10) throws IOException {
        a();
        this.f122055d.x(this.f122054c, z10, this.f122053b);
        return this;
    }

    void d(com.google.firebase.encoders.d dVar, boolean z10) {
        this.f122052a = false;
        this.f122054c = dVar;
        this.f122053b = z10;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h e(float f10) throws IOException {
        a();
        this.f122055d.e(this.f122054c, f10, this.f122053b);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h x(@NonNull byte[] bArr) throws IOException {
        a();
        this.f122055d.r(this.f122054c, bArr, this.f122053b);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h add(int i10) throws IOException {
        a();
        this.f122055d.t(this.f122054c, i10, this.f122053b);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    public com.google.firebase.encoders.h add(long j10) throws IOException {
        a();
        this.f122055d.v(this.f122054c, j10, this.f122053b);
        return this;
    }
}
