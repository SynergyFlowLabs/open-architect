package org.tensorflow.lite;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.annotations.UsedByReflection;

/* JADX INFO: loaded from: classes14.dex */
class NativeInterpreterWrapper implements AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final k f339757o = k.APPLICATION;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f339758s = 512;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f339759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f339760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f339761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f339762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f339763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f339764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f339765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, NativeSignatureRunnerWrapper> f339766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TensorImpl[] f339767i;

    @UsedByReflection("nativeinterpreterwrapper_jni.cc")
    private long inferenceDurationNanoseconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TensorImpl[] f339768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f339769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f339770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<c> f339771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<c> f339772n;

    NativeInterpreterWrapper(String modelPath) {
        this(modelPath, (i.a) null);
    }

    private void a(i.a options) {
        c cVarT;
        if (this.f339770l && (cVarT = t(options.e())) != null) {
            this.f339772n.add(cVarT);
            this.f339771m.add(cVarT);
        }
        b(options);
        Iterator<d> it = options.d().iterator();
        while (it.hasNext()) {
            c cVarA = it.next().a(f339757o);
            this.f339772n.add(cVarA);
            this.f339771m.add(cVarA);
        }
        if (options.h()) {
            org.tensorflow.lite.nnapi.a aVar = new org.tensorflow.lite.nnapi.a();
            this.f339772n.add(aVar);
            this.f339771m.add(aVar);
        }
    }

    private static native long allocateTensors(long interpreterHandle, long errorHandle);

    private static native void allowBufferHandleOutput(long interpreterHandle, boolean allow);

    private static native void allowFp16PrecisionForFp32(long interpreterHandle, boolean allow);

    private void b(i.a options) {
        for (c cVar : options.e()) {
            if (options.g() != f.a.EnumC2445a.FROM_APPLICATION_ONLY && !(cVar instanceof org.tensorflow.lite.nnapi.a)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.f339771m.add(cVar);
        }
    }

    private boolean c() {
        if (this.f339769k) {
            return false;
        }
        this.f339769k = true;
        allocateTensors(this.f339760b, this.f339759a);
        for (TensorImpl tensorImpl : this.f339768j) {
            if (tensorImpl != null) {
                tensorImpl.x();
            }
        }
        return true;
    }

    private static native long createCancellationFlag(long interpreterHandle);

    private static native long createErrorReporter(int size);

    private static native long createInterpreter(long modelHandle, long errorHandle, int numThreads, boolean useXnnpack, List<Long> delegateHandles);

    private static native long createModel(String modelPathOrBuffer, long errorHandle);

    private static native long createModelWithBuffer(ByteBuffer modelBuffer, long errorHandle);

    private static native void delete(long errorHandle, long modelHandle, long interpreterHandle);

    private static native long deleteCancellationFlag(long cancellationFlagHandle);

    private static native int getExecutionPlanLength(long interpreterHandle);

    private static native int getInputCount(long interpreterHandle);

    private static native String[] getInputNames(long interpreterHandle);

    private static native int getInputTensorIndex(long interpreterHandle, int inputIdx);

    private static native int getOutputCount(long interpreterHandle);

    private static native String[] getOutputNames(long interpreterHandle);

    private static native int getOutputTensorIndex(long interpreterHandle, int outputIdx);

    private static native String[] getSignatureKeys(long interpreterHandle);

    private static native boolean hasUnresolvedFlexOp(long interpreterHandle);

    private NativeSignatureRunnerWrapper o(String signatureKey) {
        String str;
        if (this.f339766h == null) {
            this.f339766h = new HashMap();
        }
        if (this.f339766h.containsKey(signatureKey)) {
            str = signatureKey;
        } else {
            str = signatureKey;
            this.f339766h.put(str, new NativeSignatureRunnerWrapper(this.f339760b, this.f339759a, str));
        }
        return this.f339766h.get(str);
    }

    private void q(long errorHandle, long modelHandle, i.a options) {
        long j10;
        i.a aVar = options == null ? new i.a() : options;
        if (aVar.c() != null) {
            aVar.c().a(aVar);
        }
        this.f339759a = errorHandle;
        this.f339761c = modelHandle;
        ArrayList arrayList = new ArrayList();
        long jCreateInterpreter = createInterpreter(modelHandle, errorHandle, aVar.f(), aVar.i(), arrayList);
        this.f339760b = jCreateInterpreter;
        this.f339770l = hasUnresolvedFlexOp(jCreateInterpreter);
        a(aVar);
        r();
        arrayList.ensureCapacity(this.f339771m.size());
        Iterator<c> it = this.f339771m.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().a6()));
        }
        if (arrayList.isEmpty()) {
            j10 = errorHandle;
        } else {
            delete(0L, 0L, this.f339760b);
            j10 = errorHandle;
            this.f339760b = createInterpreter(modelHandle, j10, aVar.f(), aVar.i(), arrayList);
        }
        Boolean bool = aVar.f339818i;
        if (bool != null) {
            allowFp16PrecisionForFp32(this.f339760b, bool.booleanValue());
        }
        Boolean bool2 = aVar.f339819j;
        if (bool2 != null) {
            allowBufferHandleOutput(this.f339760b, bool2.booleanValue());
        }
        if (aVar.j()) {
            this.f339762d = createCancellationFlag(this.f339760b);
        }
        this.f339767i = new TensorImpl[getInputCount(this.f339760b)];
        this.f339768j = new TensorImpl[getOutputCount(this.f339760b)];
        Boolean bool3 = aVar.f339818i;
        if (bool3 != null) {
            allowFp16PrecisionForFp32(this.f339760b, bool3.booleanValue());
        }
        Boolean bool4 = aVar.f339819j;
        if (bool4 != null) {
            allowBufferHandleOutput(this.f339760b, bool4.booleanValue());
        }
        allocateTensors(this.f339760b, j10);
        this.f339769k = true;
    }

    private void r() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (c cVar : this.f339771m) {
            if (cVar instanceof org.tensorflow.lite.nnapi.a) {
                ((org.tensorflow.lite.nnapi.a) cVar).c(interpreterFactoryImpl);
            }
        }
    }

    private static native boolean resizeInput(long interpreterHandle, long errorHandle, int inputIdx, int[] dims, boolean strict);

    private static native void run(long interpreterHandle, long errorHandle);

    private static native void setCancelled(long interpreterHandle, long cancellationFlagHandle, boolean value);

    private static c t(List<c> delegates) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator<c> it = delegates.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (c) cls.getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    void E(boolean value) {
        long j10 = this.f339762d;
        if (j10 == 0) {
            throw new IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        setCancelled(this.f339760b, j10, value);
    }

    int Ic(String name) {
        if (this.f339765g == null) {
            String[] outputNames = getOutputNames(this.f339760b);
            this.f339765g = new HashMap();
            if (outputNames != null) {
                for (int i10 = 0; i10 < outputNames.length; i10++) {
                    this.f339765g.put(outputNames[i10], Integer.valueOf(i10));
                }
            }
        }
        if (this.f339765g.containsKey(name)) {
            return this.f339765g.get(name).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", name, this.f339765g));
    }

    void Pc(int idx, int[] dims, boolean strict) {
        if (resizeInput(this.f339760b, this.f339759a, idx, dims, strict)) {
            this.f339769k = false;
            TensorImpl tensorImpl = this.f339767i[idx];
            if (tensorImpl != null) {
                tensorImpl.x();
            }
        }
    }

    int U6() {
        return this.f339768j.length;
    }

    void ae(int idx, int[] dims) {
        Pc(idx, dims, false);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i10 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.f339767i;
            if (i10 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i10];
            if (tensorImpl != null) {
                tensorImpl.j();
                this.f339767i[i10] = null;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.f339768j;
            if (i11 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i11];
            if (tensorImpl2 != null) {
                tensorImpl2.j();
                this.f339768j[i11] = null;
            }
            i11++;
        }
        delete(this.f339759a, this.f339761c, this.f339760b);
        deleteCancellationFlag(this.f339762d);
        this.f339759a = 0L;
        this.f339761c = 0L;
        this.f339760b = 0L;
        this.f339762d = 0L;
        this.f339763e = null;
        this.f339764f = null;
        this.f339765g = null;
        this.f339769k = false;
        this.f339771m.clear();
        Iterator<c> it = this.f339772n.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.f339772n.clear();
    }

    int d() {
        return getExecutionPlanLength(this.f339760b);
    }

    TensorImpl e(int index) {
        if (index >= 0) {
            TensorImpl[] tensorImplArr = this.f339767i;
            if (index < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[index];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j10 = this.f339760b;
                TensorImpl tensorImplR = TensorImpl.r(j10, getInputTensorIndex(j10, index));
                tensorImplArr[index] = tensorImplR;
                return tensorImplR;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + index);
    }

    TensorImpl f(String inputName, String signatureKey) {
        if (inputName == null) {
            throw new IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperO = o(signatureKey);
        return nativeSignatureRunnerWrapperO.f() == 0 ? e(nativeSignatureRunnerWrapperO.b(inputName)) : nativeSignatureRunnerWrapperO.c(inputName);
    }

    TensorImpl g(int index) {
        if (index >= 0) {
            TensorImpl[] tensorImplArr = this.f339768j;
            if (index < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[index];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j10 = this.f339760b;
                TensorImpl tensorImplR = TensorImpl.r(j10, getOutputTensorIndex(j10, index));
                tensorImplArr[index] = tensorImplR;
                return tensorImplR;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + index);
    }

    TensorImpl h(String outputName, String signatureKey) {
        if (outputName == null) {
            throw new IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperO = o(signatureKey);
        return nativeSignatureRunnerWrapperO.f() == 0 ? g(nativeSignatureRunnerWrapperO.d(outputName)) : nativeSignatureRunnerWrapperO.e(outputName);
    }

    int h2(String name) {
        if (this.f339764f == null) {
            String[] inputNames = getInputNames(this.f339760b);
            this.f339764f = new HashMap();
            if (inputNames != null) {
                int i10 = 2 >> 0;
                for (int i11 = 0; i11 < inputNames.length; i11++) {
                    this.f339764f.put(inputNames[i11], Integer.valueOf(i11));
                }
            }
        }
        if (this.f339764f.containsKey(name)) {
            return this.f339764f.get(name).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", name, this.f339764f));
    }

    String[] j(String signatureKey) {
        return o(signatureKey).g();
    }

    Long kb() {
        long j10 = this.inferenceDurationNanoseconds;
        if (j10 < 0) {
            return null;
        }
        return Long.valueOf(j10);
    }

    public String[] l() {
        return getSignatureKeys(this.f339760b);
    }

    String[] m(String signatureKey) {
        return o(signatureKey).i();
    }

    void p7() {
        c();
    }

    int pd() {
        return this.f339767i.length;
    }

    void x(Object[] inputs, Map<Integer, Object> outputs) {
        this.inferenceDurationNanoseconds = -1L;
        if (inputs == null || inputs.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (outputs == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < inputs.length; i11++) {
            int[] iArrU = e(i11).u(inputs[i11]);
            if (iArrU != null) {
                ae(i11, iArrU);
            }
        }
        boolean zC = c();
        for (int i12 = 0; i12 < inputs.length; i12++) {
            e(i12).y(inputs[i12]);
        }
        long jNanoTime = System.nanoTime();
        run(this.f339760b, this.f339759a);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (zC) {
            for (TensorImpl tensorImpl : this.f339768j) {
                if (tensorImpl != null) {
                    tensorImpl.x();
                }
            }
        }
        for (Map.Entry<Integer, Object> entry : outputs.entrySet()) {
            if (entry.getValue() != null) {
                g(entry.getKey().intValue()).n(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public void y(Map<String, Object> inputs, Map<String, Object> outputs, String signatureKey) {
        this.inferenceDurationNanoseconds = -1L;
        if (inputs == null || inputs.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (outputs == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperO = o(signatureKey);
        if (nativeSignatureRunnerWrapperO.f() == 0) {
            Object[] objArr = new Object[inputs.size()];
            for (Map.Entry<String, Object> entry : inputs.entrySet()) {
                objArr[nativeSignatureRunnerWrapperO.b(entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, Object> entry2 : outputs.entrySet()) {
                treeMap.put(Integer.valueOf(nativeSignatureRunnerWrapperO.d(entry2.getKey())), entry2.getValue());
            }
            x(objArr, treeMap);
            return;
        }
        for (Map.Entry<String, Object> entry3 : inputs.entrySet()) {
            int[] iArrU = f(entry3.getKey(), signatureKey).u(entry3.getValue());
            if (iArrU != null) {
                try {
                    nativeSignatureRunnerWrapperO.j(entry3.getKey(), iArrU);
                } catch (IllegalArgumentException e10) {
                    throw ((IllegalArgumentException) new IllegalArgumentException(String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), signatureKey)).initCause(e10));
                }
            }
        }
        nativeSignatureRunnerWrapperO.a();
        for (Map.Entry<String, Object> entry4 : inputs.entrySet()) {
            nativeSignatureRunnerWrapperO.c(entry4.getKey()).y(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        nativeSignatureRunnerWrapperO.h();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (Map.Entry<String, Object> entry5 : outputs.entrySet()) {
            if (entry5.getValue() != null) {
                nativeSignatureRunnerWrapperO.e(entry5.getKey()).n(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    NativeInterpreterWrapper(ByteBuffer byteBuffer) {
        this(byteBuffer, (i.a) null);
    }

    NativeInterpreterWrapper(String modelPath, i.a options) {
        this.f339762d = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.f339769k = false;
        this.f339770l = false;
        this.f339771m = new ArrayList();
        this.f339772n = new ArrayList();
        TensorFlowLite.d();
        long jCreateErrorReporter = createErrorReporter(512);
        q(jCreateErrorReporter, createModel(modelPath, jCreateErrorReporter), options);
    }

    NativeInterpreterWrapper(ByteBuffer buffer, i.a options) {
        this.f339762d = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.f339769k = false;
        this.f339770l = false;
        this.f339771m = new ArrayList();
        this.f339772n = new ArrayList();
        TensorFlowLite.d();
        if (buffer != null && ((buffer instanceof MappedByteBuffer) || (buffer.isDirect() && buffer.order() == ByteOrder.nativeOrder()))) {
            this.f339763e = buffer;
            long jCreateErrorReporter = createErrorReporter(512);
            q(jCreateErrorReporter, createModelWithBuffer(this.f339763e, jCreateErrorReporter), options);
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }
}
