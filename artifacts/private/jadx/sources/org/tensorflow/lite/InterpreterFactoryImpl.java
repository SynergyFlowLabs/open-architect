package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.nnapi.NnApiDelegateImpl;

/* JADX INFO: loaded from: classes14.dex */
@UsedByReflection("InterpreterFactory.java")
class InterpreterFactoryImpl implements h {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.h
    public f W0(ByteBuffer byteBuffer, f.a options) {
        return new i(byteBuffer, options == null ? null : new i.a(options));
    }

    @Override // org.tensorflow.lite.h
    public String a() {
        TensorFlowLite.d();
        return nativeSchemaVersion();
    }

    @Override // org.tensorflow.lite.h
    public String b() {
        TensorFlowLite.d();
        return nativeRuntimeVersion();
    }

    @Override // org.tensorflow.lite.h
    public org.tensorflow.lite.nnapi.a.b c(org.tensorflow.lite.nnapi.a.C2446a options) {
        return new NnApiDelegateImpl(options);
    }

    @Override // org.tensorflow.lite.h
    public f n1(File modelFile, f.a options) {
        return new i(modelFile, options == null ? null : new i.a(options));
    }
}
