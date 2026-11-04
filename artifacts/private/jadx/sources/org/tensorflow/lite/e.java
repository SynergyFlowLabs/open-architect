package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeInterpreterWrapperExperimental f339803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f339804c;

    public static class a extends i.a {
        public a() {
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a a(c delegate) {
            super.a(delegate);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a b(d delegateFactory) {
            super.b(delegateFactory);
            return this;
        }

        public a s(boolean allow) {
            this.f339819j = Boolean.valueOf(allow);
            return this;
        }

        @Deprecated
        public a t(boolean allow) {
            this.f339818i = Boolean.valueOf(allow);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a l(boolean allow) {
            super.l(allow);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a m(int numThreads) {
            super.m(numThreads);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a n(f.a.EnumC2445a runtime) {
            super.n(runtime);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a o(boolean useNNAPI) {
            super.o(useNNAPI);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a p(boolean useXNNPACK) {
            super.p(useXNNPACK);
            return this;
        }

        public a(f.a options) {
            super(options);
        }

        a(i.a options) {
            super(options);
        }
    }

    public e(File modelFile) {
        this(modelFile, (a) null);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int Ic(String opName) {
        return super.Ic(opName);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void Pc(int idx, int[] dims, boolean strict) {
        super.Pc(idx, dims, strict);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int U6() {
        return super.U6();
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void aa(Object input, Object output) {
        super.aa(input, output);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void ae(int idx, int[] dims) {
        super.ae(idx, dims);
    }

    public l c(String inputName, String signatureKey) {
        a();
        if (signatureKey == null) {
            String[] strArr = this.f339804c;
            if (strArr.length == 1) {
                signatureKey = strArr[0];
            }
        }
        if (signatureKey != null) {
            return this.f339817a.f(inputName, signatureKey);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f339804c));
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public l d(String outputName, String signatureKey) {
        a();
        if (signatureKey == null) {
            String[] strArr = this.f339804c;
            if (strArr.length == 1) {
                signatureKey = strArr[0];
            }
        }
        if (signatureKey != null) {
            return this.f339817a.h(outputName, signatureKey);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f339804c));
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void d4(Object[] inputs, Map outputs) {
        super.d4(inputs, outputs);
    }

    public String[] e(String signatureKey) {
        a();
        return this.f339817a.j(signatureKey);
    }

    public String[] f() {
        a();
        return this.f339817a.l();
    }

    public String[] g(String signatureKey) {
        a();
        return this.f339817a.m(signatureKey);
    }

    public void h() {
        a();
        this.f339803b.H();
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int h2(String opName) {
        return super.h2(opName);
    }

    public void j(Map<String, Object> inputs, Map<String, Object> outputs) {
        a();
        l(inputs, outputs, null);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ Long kb() {
        return super.kb();
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ l kf(int outputIndex) {
        return super.kf(outputIndex);
    }

    public void l(Map<String, Object> inputs, Map<String, Object> outputs, String signatureKey) {
        a();
        if (signatureKey == null) {
            String[] strArr = this.f339804c;
            if (strArr.length == 1) {
                signatureKey = strArr[0];
            }
        }
        if (signatureKey != null) {
            this.f339817a.y(inputs, outputs, signatureKey);
            return;
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f339804c));
    }

    public void m(boolean cancelled) {
        this.f339817a.E(cancelled);
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void p7() {
        super.p7();
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int pd() {
        return super.pd();
    }

    @Override // org.tensorflow.lite.i, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ l w5(int inputIndex) {
        return super.w5(inputIndex);
    }

    public e(File modelFile, a options) {
        this(new NativeInterpreterWrapperExperimental(modelFile.getAbsolutePath(), options));
    }

    public e(ByteBuffer byteBuffer) {
        this(byteBuffer, (a) null);
    }

    public e(ByteBuffer byteBuffer, a options) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private e(NativeInterpreterWrapperExperimental wrapper) {
        super(wrapper);
        this.f339803b = wrapper;
        this.f339804c = f();
    }
}
