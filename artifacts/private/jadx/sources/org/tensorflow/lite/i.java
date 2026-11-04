package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    NativeInterpreterWrapper f339817a;

    static class a extends f.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f339818i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Boolean f339819j;

        public a() {
        }

        public a(f.a options) {
            super(options);
        }

        public a(a other) {
            super(other);
            this.f339818i = other.f339818i;
            this.f339819j = other.f339819j;
        }
    }

    i(File modelFile, a options) {
        this.f339817a = new NativeInterpreterWrapper(modelFile.getAbsolutePath(), options);
    }

    @Override // org.tensorflow.lite.f
    public int Ic(String opName) {
        a();
        return this.f339817a.Ic(opName);
    }

    @Override // org.tensorflow.lite.f
    public void Pc(int idx, int[] dims, boolean strict) {
        a();
        this.f339817a.Pc(idx, dims, strict);
    }

    @Override // org.tensorflow.lite.f
    public int U6() {
        a();
        return this.f339817a.U6();
    }

    void a() {
        if (this.f339817a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    @Override // org.tensorflow.lite.f
    public void aa(Object input, Object output) {
        HashMap map = new HashMap();
        map.put(0, output);
        d4(new Object[]{input}, map);
    }

    @Override // org.tensorflow.lite.f
    public void ae(int idx, int[] dims) {
        a();
        this.f339817a.Pc(idx, dims, false);
    }

    int b() {
        a();
        return this.f339817a.d();
    }

    @Override // org.tensorflow.lite.f, java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f339817a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f339817a = null;
        }
    }

    @Override // org.tensorflow.lite.f
    public void d4(Object[] inputs, Map<Integer, Object> outputs) {
        a();
        this.f339817a.x(inputs, outputs);
    }

    protected void finalize() throws Throwable {
        try {
            close();
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // org.tensorflow.lite.f
    public int h2(String opName) {
        a();
        return this.f339817a.h2(opName);
    }

    @Override // org.tensorflow.lite.f
    public Long kb() {
        a();
        return this.f339817a.kb();
    }

    @Override // org.tensorflow.lite.f
    public l kf(int outputIndex) {
        a();
        return this.f339817a.g(outputIndex);
    }

    @Override // org.tensorflow.lite.f
    public void p7() {
        a();
        this.f339817a.p7();
    }

    @Override // org.tensorflow.lite.f
    public int pd() {
        a();
        return this.f339817a.pd();
    }

    @Override // org.tensorflow.lite.f
    public l w5(int inputIndex) {
        a();
        return this.f339817a.e(inputIndex);
    }

    i(ByteBuffer byteBuffer, a options) {
        this.f339817a = new NativeInterpreterWrapper(byteBuffer, options);
    }

    i(NativeInterpreterWrapper wrapper) {
        this.f339817a = wrapper;
    }
}
