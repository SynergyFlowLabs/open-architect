package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
final class TensorImpl implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f339786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f339787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f339788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f339789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l.a f339790e;

    private TensorImpl(long nativeHandle) {
        this.f339786a = nativeHandle;
        this.f339787b = b.a(dtype(nativeHandle));
        this.f339788c = shape(nativeHandle);
        this.f339789d = shapeSignature(nativeHandle);
        this.f339790e = new l.a(quantizationScale(nativeHandle), quantizationZeroPoint(nativeHandle));
    }

    private void A(Object dst) {
        if (v(dst)) {
            Buffer buffer = (Buffer) dst;
            int iC = c();
            int iCapacity = w(dst) ? buffer.capacity() : buffer.capacity() * this.f339787b.k();
            if (iC > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), Integer.valueOf(iC), Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrM = m(dst);
            if (!Arrays.equals(iArrM, this.f339788c)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(), Arrays.toString(this.f339788c), Arrays.toString(iArrM)));
            }
        }
    }

    private void B(Object src) {
        if (!v(src)) {
            int[] iArrM = m(src);
            if (!Arrays.equals(iArrM, this.f339788c)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(), Arrays.toString(this.f339788c), Arrays.toString(iArrM)));
            }
        } else {
            Buffer buffer = (Buffer) src;
            int iC = c();
            int iCapacity = w(src) ? buffer.capacity() : buffer.capacity() * this.f339787b.k();
            if (iC != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), Integer.valueOf(iC), Integer.valueOf(iCapacity)));
            }
        }
    }

    private void C(Object o10) {
        a aVarP;
        if (!w(o10) && (aVarP = p(o10)) != this.f339787b && !b.b(aVarP).equals(b.b(this.f339787b))) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.f339787b, o10.getClass().getName(), aVarP));
        }
    }

    private static native ByteBuffer buffer(long handle);

    private static native long create(long interpreterHandle, int tensorIndex, int subgraphIndex);

    private static native long createSignatureInputTensor(long signatureRunnerHandle, String inputName);

    private static native long createSignatureOutputTensor(long signatureRunnerHandle, String outputName);

    private static native void delete(long handle);

    private static native int dtype(long handle);

    private static native boolean hasDelegateBufferHandle(long handle);

    private ByteBuffer i() {
        return buffer(this.f339786a).order(ByteOrder.nativeOrder());
    }

    private static native int index(long handle);

    static int k(Object o10) {
        if (o10 == null || !o10.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(o10) != 0) {
            return k(Array.get(o10, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    static int l(int[] shape) {
        int i10 = 1;
        for (int i11 : shape) {
            i10 *= i11;
        }
        return i10;
    }

    private int[] m(Object o10) {
        int iK = k(o10);
        if (this.f339787b == a.STRING) {
            Class<?> componentType = o10.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iK--;
                }
            }
        }
        int[] iArr = new int[iK];
        q(o10, 0, iArr);
        return iArr;
    }

    private static native String name(long handle);

    private static native int numBytes(long handle);

    private void o(Buffer dst) {
        if (dst instanceof ByteBuffer) {
            ((ByteBuffer) dst).put(i());
            return;
        }
        if (dst instanceof FloatBuffer) {
            ((FloatBuffer) dst).put(i().asFloatBuffer());
            return;
        }
        if (dst instanceof LongBuffer) {
            ((LongBuffer) dst).put(i().asLongBuffer());
            return;
        }
        if (dst instanceof IntBuffer) {
            ((IntBuffer) dst).put(i().asIntBuffer());
        } else {
            if (dst instanceof ShortBuffer) {
                ((ShortBuffer) dst).put(i().asShortBuffer());
                return;
            }
            throw new IllegalArgumentException("Unexpected output buffer type: " + dst);
        }
    }

    static void q(Object o10, int dim, int[] shape) {
        if (shape == null || dim == shape.length) {
            return;
        }
        int length = Array.getLength(o10);
        int i10 = shape[dim];
        if (i10 == 0) {
            shape[dim] = length;
        } else if (i10 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(shape[dim]), Integer.valueOf(length), Integer.valueOf(dim)));
        }
        int i11 = dim + 1;
        if (i11 == shape.length) {
            return;
        }
        for (int i12 = 0; i12 < length; i12++) {
            q(Array.get(o10, i12), i11, shape);
        }
    }

    private static native float quantizationScale(long handle);

    private static native int quantizationZeroPoint(long handle);

    static TensorImpl r(long nativeInterpreterHandle, int tensorIndex) {
        return new TensorImpl(create(nativeInterpreterHandle, tensorIndex, 0));
    }

    private static native void readMultiDimensionalArray(long handle, Object dst);

    static TensorImpl s(long signatureRunnerHandle, String inputName) {
        long jCreateSignatureInputTensor = createSignatureInputTensor(signatureRunnerHandle, inputName);
        if (jCreateSignatureInputTensor != -1) {
            return new TensorImpl(jCreateSignatureInputTensor);
        }
        throw new IllegalArgumentException("Input error: input " + inputName + " not found.");
    }

    private static native int[] shape(long handle);

    private static native int[] shapeSignature(long handle);

    static TensorImpl t(long signatureRunnerHandle, String outputName) {
        long jCreateSignatureOutputTensor = createSignatureOutputTensor(signatureRunnerHandle, outputName);
        if (jCreateSignatureOutputTensor != -1) {
            return new TensorImpl(jCreateSignatureOutputTensor);
        }
        throw new IllegalArgumentException("Input error: output " + outputName + " not found.");
    }

    private static boolean v(Object o10) {
        return o10 instanceof Buffer;
    }

    private static boolean w(Object o10) {
        return o10 instanceof ByteBuffer;
    }

    private static native void writeDirectBuffer(long handle, Buffer src);

    private static native void writeMultiDimensionalArray(long handle, Object src);

    private static native void writeScalar(long handle, Object src);

    private void z(Buffer src) {
        if (src instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) src;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f339786a, src);
                return;
            } else {
                i().put(byteBuffer);
                return;
            }
        }
        if (src instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) src;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f339786a, src);
                return;
            } else {
                i().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (src instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) src;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f339786a, src);
                return;
            } else {
                i().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (src instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) src;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f339786a, src);
                return;
            } else {
                i().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(src instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + src);
        }
        ShortBuffer shortBuffer = (ShortBuffer) src;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f339786a, src);
        } else {
            i().asShortBuffer().put(shortBuffer);
        }
    }

    @Override // org.tensorflow.lite.l
    public ByteBuffer a() {
        return i().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    @Override // org.tensorflow.lite.l
    public int[] b() {
        return this.f339789d;
    }

    @Override // org.tensorflow.lite.l
    public int c() {
        return numBytes(this.f339786a);
    }

    @Override // org.tensorflow.lite.l
    public a d() {
        return this.f339787b;
    }

    @Override // org.tensorflow.lite.l
    public int e() {
        return this.f339788c.length;
    }

    @Override // org.tensorflow.lite.l
    public l.a f() {
        return this.f339790e;
    }

    @Override // org.tensorflow.lite.l
    public int g() {
        return l(this.f339788c);
    }

    @Override // org.tensorflow.lite.l
    public int[] h() {
        return this.f339788c;
    }

    @Override // org.tensorflow.lite.l
    public int index() {
        return index(this.f339786a);
    }

    void j() {
        delete(this.f339786a);
        this.f339786a = 0L;
    }

    void n(Object dst) {
        if (dst == null) {
            if (!hasDelegateBufferHandle(this.f339786a)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        C(dst);
        A(dst);
        if (v(dst)) {
            o((Buffer) dst);
        } else {
            readMultiDimensionalArray(this.f339786a, dst);
        }
    }

    @Override // org.tensorflow.lite.l
    public String name() {
        return name(this.f339786a);
    }

    a p(Object o10) {
        Class<?> componentType = o10.getClass();
        if (!componentType.isArray()) {
            if (Float.class.equals(componentType) || (o10 instanceof FloatBuffer)) {
                return a.FLOAT32;
            }
            if (Integer.class.equals(componentType) || (o10 instanceof IntBuffer)) {
                return a.INT32;
            }
            if (!Short.class.equals(componentType) && !(o10 instanceof ShortBuffer)) {
                if (Byte.class.equals(componentType)) {
                    return a.UINT8;
                }
                if (Long.class.equals(componentType) || (o10 instanceof LongBuffer)) {
                    return a.INT64;
                }
                if (Boolean.class.equals(componentType)) {
                    return a.BOOL;
                }
                if (String.class.equals(componentType)) {
                    return a.STRING;
                }
            }
            return a.INT16;
        }
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        if (Float.TYPE.equals(componentType)) {
            return a.FLOAT32;
        }
        if (Integer.TYPE.equals(componentType)) {
            return a.INT32;
        }
        if (Short.TYPE.equals(componentType)) {
            return a.INT16;
        }
        if (Byte.TYPE.equals(componentType)) {
            a aVar = this.f339787b;
            a aVar2 = a.STRING;
            return aVar == aVar2 ? aVar2 : a.UINT8;
        }
        if (Long.TYPE.equals(componentType)) {
            return a.INT64;
        }
        if (Boolean.TYPE.equals(componentType)) {
            return a.BOOL;
        }
        if (String.class.equals(componentType)) {
            return a.STRING;
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + o10.getClass().getName());
    }

    int[] u(Object input) {
        if (input != null && !v(input)) {
            C(input);
            int[] iArrM = m(input);
            if (Arrays.equals(this.f339788c, iArrM)) {
                return null;
            }
            return iArrM;
        }
        return null;
    }

    void x() {
        this.f339788c = shape(this.f339786a);
    }

    void y(Object src) {
        if (src == null) {
            if (!hasDelegateBufferHandle(this.f339786a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        C(src);
        B(src);
        if (v(src)) {
            z((Buffer) src);
            return;
        }
        if (this.f339787b == a.STRING && this.f339788c.length == 0) {
            writeScalar(this.f339786a, src);
        } else if (src.getClass().isArray()) {
            writeMultiDimensionalArray(this.f339786a, src);
        } else {
            writeScalar(this.f339786a, src);
        }
    }
}
