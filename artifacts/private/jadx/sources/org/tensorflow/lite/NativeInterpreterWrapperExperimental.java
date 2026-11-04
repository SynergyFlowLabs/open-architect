package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    NativeInterpreterWrapperExperimental(String modelPath, i.a options) {
        super(modelPath, options);
    }

    private static native void resetVariableTensors(long interpreterHandle, long errorHandle);

    void H() {
        resetVariableTensors(this.f339760b, this.f339759a);
    }

    NativeInterpreterWrapperExperimental(ByteBuffer buffer, i.a options) {
        super(buffer, options);
    }
}
