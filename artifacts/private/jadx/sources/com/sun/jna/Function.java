package com.sun.jna;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Function extends Pointer {
    public static final int ALT_CONVENTION = 63;
    public static final int C_CONVENTION = 0;
    private static final int MASK_CC = 63;
    public static final int MAX_NARGS = 256;
    static final String OPTION_INVOKING_METHOD = "invoking-method";
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 255;
    private static final int USE_VARARGS_SHIFT = 7;
    final int callFlags;
    final String encoding;
    private final String functionName;
    private NativeLibrary library;
    final Map<String, ?> options;
    static final Integer INTEGER_TRUE = -1;
    static final Integer INTEGER_FALSE = 0;
    private static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

    private static class NativeMappedArray extends Memory implements PostCallRead {
        private final NativeMapped[] original;

        public NativeMappedArray(NativeMapped[] nativeMappedArr) {
            super(Native.getNativeSize(nativeMappedArr.getClass(), nativeMappedArr));
            this.original = nativeMappedArr;
            setValue(0L, nativeMappedArr, nativeMappedArr.getClass());
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            getValue(0L, this.original.getClass(), this.original);
        }
    }

    private static class PointerArray extends Memory implements PostCallRead {
        private final Pointer[] original;

        public PointerArray(Pointer[] pointerArr) {
            super(Native.POINTER_SIZE * (pointerArr.length + 1));
            this.original = pointerArr;
            for (int i10 = 0; i10 < pointerArr.length; i10++) {
                setPointer(Native.POINTER_SIZE * i10, pointerArr[i10]);
            }
            setPointer(Native.POINTER_SIZE * pointerArr.length, null);
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            Pointer[] pointerArr = this.original;
            read(0L, pointerArr, 0, pointerArr.length);
        }
    }

    public interface PostCallRead {
        void read();
    }

    Function(NativeLibrary nativeLibrary, String str, int i10, String str2) {
        checkCallingConvention(i10 & 63);
        if (str == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.library = nativeLibrary;
        this.functionName = str;
        this.callFlags = i10;
        this.options = nativeLibrary.getOptions();
        if (str2 == null) {
            str2 = Native.getDefaultStringEncoding();
        }
        this.encoding = str2;
        try {
            this.peer = nativeLibrary.getSymbolAddress(str);
        } catch (UnsatisfiedLinkError e10) {
            throw new UnsatisfiedLinkError("Error looking up function '" + str + "': " + e10.getMessage());
        }
    }

    private void checkCallingConvention(int i10) throws IllegalArgumentException {
        if ((i10 & 63) == i10) {
            return;
        }
        throw new IllegalArgumentException("Unrecognized calling convention: " + i10);
    }

    static Object[] concatenateVarArgs(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[objArr.length - 1];
            Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls != null && cls.isArray()) {
                Object[] objArr2 = (Object[]) obj;
                for (int i10 = 0; i10 < objArr2.length; i10++) {
                    Object obj2 = objArr2[i10];
                    if (obj2 instanceof Float) {
                        objArr2[i10] = Double.valueOf(((Float) obj2).floatValue());
                    }
                }
                int length = objArr.length + objArr2.length;
                Object[] objArr3 = new Object[length];
                System.arraycopy(objArr, 0, objArr3, 0, objArr.length - 1);
                System.arraycopy(objArr2, 0, objArr3, objArr.length - 1, objArr2.length);
                objArr3[length - 1] = null;
                return objArr3;
            }
        }
        return objArr;
    }

    private Object convertArgument(Object[] objArr, int i10, Method method, TypeMapper typeMapper, boolean z10, Class<?> cls) {
        Object obj = objArr[i10];
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            ToNativeConverter nativeMappedConverter = NativeMapped.class.isAssignableFrom(cls2) ? NativeMappedConverter.getInstance(cls2) : typeMapper != null ? typeMapper.getToNativeConverter(cls2) : null;
            if (nativeMappedConverter != null) {
                obj = nativeMappedConverter.toNative(obj, method != null ? new MethodParameterContext(this, objArr, i10, method) : new FunctionParameterContext(this, objArr, i10));
            }
        }
        if (obj == null || isPrimitiveArray(obj.getClass())) {
            return obj;
        }
        Class<?> cls3 = obj.getClass();
        if (obj instanceof Structure) {
            Structure structure = (Structure) obj;
            structure.autoWrite();
            if (structure instanceof Structure.ByValue) {
                Class<?> cls4 = structure.getClass();
                if (method != null) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (!IS_VARARGS.isVarArgs(method) || i10 < parameterTypes.length - 1) {
                        cls4 = parameterTypes[i10];
                    } else {
                        Class<?> componentType = parameterTypes[parameterTypes.length - 1].getComponentType();
                        if (componentType != Object.class) {
                            cls4 = componentType;
                        }
                    }
                }
                if (Structure.ByValue.class.isAssignableFrom(cls4)) {
                    return structure;
                }
            }
            return structure.getPointer();
        }
        if (obj instanceof Callback) {
            return CallbackReference.getFunctionPointer((Callback) obj);
        }
        if (obj instanceof String) {
            return new NativeString((String) obj, this.encoding).getPointer();
        }
        if (obj instanceof WString) {
            return new NativeString(obj.toString(), true).getPointer();
        }
        if (obj instanceof Boolean) {
            return Boolean.TRUE.equals(obj) ? INTEGER_TRUE : INTEGER_FALSE;
        }
        if (String[].class == cls3) {
            return new StringArray((String[]) obj, this.encoding);
        }
        if (WString[].class == cls3) {
            return new StringArray((WString[]) obj);
        }
        if (Pointer[].class == cls3) {
            return new PointerArray((Pointer[]) obj);
        }
        if (NativeMapped[].class.isAssignableFrom(cls3)) {
            return new NativeMappedArray((NativeMapped[]) obj);
        }
        if (!Structure[].class.isAssignableFrom(cls3)) {
            if (cls3.isArray()) {
                throw new IllegalArgumentException("Unsupported array argument type: " + cls3.getComponentType());
            }
            if (z10 || Native.isSupportedNativeType(obj.getClass())) {
                return obj;
            }
            throw new IllegalArgumentException("Unsupported argument type " + obj.getClass().getName() + " at parameter " + i10 + " of function " + getName());
        }
        Structure[] structureArr = (Structure[]) obj;
        Class<?> componentType2 = cls3.getComponentType();
        boolean zIsAssignableFrom = Structure.ByReference.class.isAssignableFrom(componentType2);
        if (cls != null && !Structure.ByReference[].class.isAssignableFrom(cls)) {
            if (zIsAssignableFrom) {
                throw new IllegalArgumentException("Function " + getName() + " declared Structure[] at parameter " + i10 + " but array of " + componentType2 + " was passed");
            }
            for (int i11 = 0; i11 < structureArr.length; i11++) {
                if (structureArr[i11] instanceof Structure.ByReference) {
                    throw new IllegalArgumentException("Function " + getName() + " declared Structure[] at parameter " + i10 + " but element " + i11 + " is of Structure.ByReference type");
                }
            }
        }
        if (zIsAssignableFrom) {
            Structure.autoWrite(structureArr);
            Pointer[] pointerArr = new Pointer[structureArr.length + 1];
            for (int i12 = 0; i12 < structureArr.length; i12++) {
                Structure structure2 = structureArr[i12];
                pointerArr[i12] = structure2 != null ? structure2.getPointer() : null;
            }
            return new PointerArray(pointerArr);
        }
        if (structureArr.length == 0) {
            throw new IllegalArgumentException("Structure array must have non-zero length");
        }
        if (structureArr[0] == null) {
            Structure.newInstance(componentType2).toArray(structureArr);
            return structureArr[0].getPointer();
        }
        Structure.autoWrite(structureArr);
        return structureArr[0].getPointer();
    }

    static int fixedArgs(Method method) {
        return IS_VARARGS.fixedArgs(method);
    }

    public static Function getFunction(String str, String str2) {
        return NativeLibrary.getInstance(str).getFunction(str2);
    }

    private Pointer invokePointer(int i10, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.peer, i10, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    private String invokeString(int i10, Object[] objArr, boolean z10) {
        Pointer pointerInvokePointer = invokePointer(i10, objArr);
        if (pointerInvokePointer != null) {
            return z10 ? pointerInvokePointer.getWideString(0L) : pointerInvokePointer.getString(0L, this.encoding);
        }
        return null;
    }

    private boolean isPrimitiveArray(Class<?> cls) {
        return cls.isArray() && cls.getComponentType().isPrimitive();
    }

    static boolean isVarArgs(Method method) {
        return IS_VARARGS.isVarArgs(method);
    }

    static Boolean valueOf(boolean z10) {
        return z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Function function = (Function) obj;
            if (function.callFlags == this.callFlags && function.options.equals(this.options) && function.peer == this.peer) {
                return true;
            }
        }
        return false;
    }

    public int getCallingConvention() {
        return this.callFlags & 63;
    }

    public String getName() {
        return this.functionName;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.callFlags + this.options.hashCode() + super.hashCode();
    }

    public Object invoke(Class<?> cls, Object[] objArr) {
        return invoke(cls, objArr, this.options);
    }

    public double invokeDouble(Object[] objArr) {
        return ((Double) invoke(Double.class, objArr)).doubleValue();
    }

    public float invokeFloat(Object[] objArr) {
        return ((Float) invoke(Float.class, objArr)).floatValue();
    }

    public int invokeInt(Object[] objArr) {
        return ((Integer) invoke(Integer.class, objArr)).intValue();
    }

    public long invokeLong(Object[] objArr) {
        return ((Long) invoke(Long.class, objArr)).longValue();
    }

    public Object invokeObject(Object[] objArr) {
        return invoke(Object.class, objArr);
    }

    public void invokeVoid(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        if (this.library == null) {
            return "native function@0x" + Long.toHexString(this.peer);
        }
        return "native function " + this.functionName + "(" + this.library.getName() + ")@0x" + Long.toHexString(this.peer);
    }

    public static Function getFunction(String str, String str2, int i10) {
        return NativeLibrary.getInstance(str).getFunction(str2, i10, null);
    }

    public Object invoke(Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Method method = (Method) map.get(OPTION_INVOKING_METHOD);
        return invoke(method, method != null ? method.getParameterTypes() : null, cls, objArr, map);
    }

    public static Function getFunction(String str, String str2, int i10, String str3) {
        return NativeLibrary.getInstance(str).getFunction(str2, i10, str3);
    }

    public Pointer invokePointer(Object[] objArr) {
        return (Pointer) invoke(Pointer.class, objArr);
    }

    public static Function getFunction(Pointer pointer) {
        return getFunction(pointer, 0, (String) null);
    }

    public String invokeString(Object[] objArr, boolean z10) {
        Object objInvoke = invoke(z10 ? WString.class : String.class, objArr);
        if (objInvoke != null) {
            return objInvoke.toString();
        }
        return null;
    }

    public static Function getFunction(Pointer pointer, int i10) {
        return getFunction(pointer, i10, (String) null);
    }

    Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Object[] objArr2;
        FromNativeConverter fromNativeConverter;
        Class<?> clsNativeType;
        FromNativeConverter fromNativeConverter2;
        FromNativeConverter fromNativeConverter3;
        Object[] objArr3 = new Object[0];
        if (objArr == null) {
            objArr2 = objArr3;
        } else if (objArr.length <= 256) {
            int length = objArr.length;
            objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
        } else {
            throw new UnsupportedOperationException("Maximum argument count is 256");
        }
        TypeMapper typeMapper = (TypeMapper) map.get(Library.OPTION_TYPE_MAPPER);
        boolean zEquals = Boolean.TRUE.equals(map.get(Library.OPTION_ALLOW_OBJECTS));
        boolean zIsVarArgs = (objArr2.length <= 0 || method == null) ? false : isVarArgs(method);
        int iFixedArgs = (objArr2.length <= 0 || method == null) ? 0 : fixedArgs(method);
        int i10 = 0;
        while (true) {
            fromNativeConverter = null;
            Class<?> componentType = null;
            if (i10 >= objArr2.length) {
                break;
            }
            if (method != null) {
                if (zIsVarArgs && i10 >= clsArr.length - 1) {
                    componentType = clsArr[clsArr.length - 1].getComponentType();
                } else {
                    componentType = clsArr[i10];
                }
            }
            Function function = this;
            Class<?> cls2 = componentType;
            Method method2 = method;
            method = method2;
            objArr2[i10] = function.convertArgument(objArr2, i10, method2, typeMapper, zEquals, cls2);
            i10++;
            this = function;
        }
        Function function2 = this;
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            clsNativeType = nativeMappedConverter.nativeType();
            fromNativeConverter3 = nativeMappedConverter;
        } else if (typeMapper == null || (fromNativeConverter2 = typeMapper.getFromNativeConverter(cls)) == null) {
            fromNativeConverter = fromNativeConverter2;
            clsNativeType = cls;
            fromNativeConverter3 = fromNativeConverter;
        } else {
            fromNativeConverter = fromNativeConverter2;
            clsNativeType = fromNativeConverter2.nativeType();
            fromNativeConverter3 = fromNativeConverter2;
        }
        Object objInvoke = function2.invoke(objArr2, clsNativeType, zEquals, iFixedArgs);
        if (fromNativeConverter3 != null) {
            objInvoke = fromNativeConverter3.fromNative(objInvoke, method != null ? new MethodResultContext(cls, function2, objArr, method) : new FunctionResultContext(cls, function2, objArr));
        }
        if (objArr != null) {
            for (int i11 = 0; i11 < objArr.length; i11++) {
                Object obj = objArr[i11];
                if (obj != null) {
                    if (!(obj instanceof Structure)) {
                        Object obj2 = objArr2[i11];
                        if (obj2 instanceof PostCallRead) {
                            ((PostCallRead) obj2).read();
                            Object obj3 = objArr2[i11];
                            if (obj3 instanceof PointerArray) {
                                PointerArray pointerArray = (PointerArray) obj3;
                                if (Structure.ByReference[].class.isAssignableFrom(obj.getClass())) {
                                    Class<?> componentType2 = obj.getClass().getComponentType();
                                    Structure[] structureArr = (Structure[]) obj;
                                    for (int i12 = 0; i12 < structureArr.length; i12++) {
                                        structureArr[i12] = Structure.updateStructureByReference(componentType2, structureArr[i12], pointerArray.getPointer(Native.POINTER_SIZE * i12));
                                    }
                                }
                            }
                        } else if (Structure[].class.isAssignableFrom(obj.getClass())) {
                            Structure.autoRead((Structure[]) obj);
                        }
                    } else if (!(obj instanceof Structure.ByValue)) {
                        ((Structure) obj).autoRead();
                    }
                }
            }
        }
        return objInvoke;
    }

    public static Function getFunction(Pointer pointer, int i10, String str) {
        return new Function(pointer, i10, str);
    }

    Function(Pointer pointer, int i10, String str) {
        checkCallingConvention(i10 & 63);
        if (pointer != null && pointer.peer != 0) {
            this.functionName = pointer.toString();
            this.callFlags = i10;
            this.peer = pointer.peer;
            this.options = Collections.EMPTY_MAP;
            this.encoding = str == null ? Native.getDefaultStringEncoding() : str;
            return;
        }
        throw new NullPointerException("Function address may not be null");
    }

    Object invoke(Object[] objArr, Class<?> cls, boolean z10) {
        return invoke(objArr, cls, z10, 0);
    }

    Object invoke(Object[] objArr, Class<?> cls, boolean z10, int i10) {
        Object obj;
        int i11 = this.callFlags | ((i10 & 255) << 7);
        if (cls == null || cls == Void.TYPE || cls == Void.class) {
            Native.invokeVoid(this, this.peer, i11, objArr);
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return valueOf(Native.invokeInt(this, this.peer, i11, objArr) != 0);
        }
        if (cls != Byte.TYPE && cls != Byte.class) {
            if (cls != Short.TYPE && cls != Short.class) {
                if (cls != Character.TYPE && cls != Character.class) {
                    if (cls != Integer.TYPE && cls != Integer.class) {
                        if (cls != Long.TYPE && cls != Long.class) {
                            if (cls != Float.TYPE && cls != Float.class) {
                                if (cls != Double.TYPE && cls != Double.class) {
                                    if (cls == String.class) {
                                        return invokeString(i11, objArr, false);
                                    }
                                    if (cls == WString.class) {
                                        String strInvokeString = invokeString(i11, objArr, true);
                                        if (strInvokeString != null) {
                                            return new WString(strInvokeString);
                                        }
                                    } else {
                                        if (Pointer.class.isAssignableFrom(cls)) {
                                            return invokePointer(i11, objArr);
                                        }
                                        if (Structure.class.isAssignableFrom(cls)) {
                                            if (Structure.ByValue.class.isAssignableFrom(cls)) {
                                                Structure structureInvokeStructure = Native.invokeStructure(this, this.peer, i11, objArr, Structure.newInstance(cls));
                                                structureInvokeStructure.autoRead();
                                                return structureInvokeStructure;
                                            }
                                            Pointer pointerInvokePointer = invokePointer(i11, objArr);
                                            if (pointerInvokePointer != null) {
                                                obj = pointerInvokePointer;
                                                Structure structureNewInstance = Structure.newInstance((Class<Structure>) cls, pointerInvokePointer);
                                                structureNewInstance.conditionalAutoRead();
                                                obj = structureNewInstance;
                                            }
                                            obj = pointerInvokePointer;
                                            return obj;
                                        }
                                        if (Callback.class.isAssignableFrom(cls)) {
                                            Pointer pointerInvokePointer2 = invokePointer(i11, objArr);
                                            return pointerInvokePointer2 != null ? CallbackReference.getCallback(cls, pointerInvokePointer2) : pointerInvokePointer2;
                                        }
                                        if (cls == String[].class) {
                                            Pointer pointerInvokePointer3 = invokePointer(i11, objArr);
                                            if (pointerInvokePointer3 != null) {
                                                return pointerInvokePointer3.getStringArray(0L, this.encoding);
                                            }
                                        } else if (cls == WString[].class) {
                                            Pointer pointerInvokePointer4 = invokePointer(i11, objArr);
                                            if (pointerInvokePointer4 != null) {
                                                String[] wideStringArray = pointerInvokePointer4.getWideStringArray(0L);
                                                WString[] wStringArr = new WString[wideStringArray.length];
                                                for (int i12 = 0; i12 < wideStringArray.length; i12++) {
                                                    wStringArr[i12] = new WString(wideStringArray[i12]);
                                                }
                                                return wStringArr;
                                            }
                                        } else {
                                            if (cls != Pointer[].class) {
                                                if (!z10) {
                                                    throw new IllegalArgumentException("Unsupported return type " + cls + " in function " + getName());
                                                }
                                                Object objInvokeObject = Native.invokeObject(this, this.peer, i11, objArr);
                                                if (objInvokeObject == null || cls.isAssignableFrom(objInvokeObject.getClass())) {
                                                    return objInvokeObject;
                                                }
                                                throw new ClassCastException("Return type " + cls + " does not match result " + objInvokeObject.getClass());
                                            }
                                            Pointer pointerInvokePointer5 = invokePointer(i11, objArr);
                                            if (pointerInvokePointer5 != null) {
                                                return pointerInvokePointer5.getPointerArray(0L);
                                            }
                                        }
                                    }
                                    return null;
                                }
                                return Double.valueOf(Native.invokeDouble(this, this.peer, i11, objArr));
                            }
                            return Float.valueOf(Native.invokeFloat(this, this.peer, i11, objArr));
                        }
                        return Long.valueOf(Native.invokeLong(this, this.peer, i11, objArr));
                    }
                    return Integer.valueOf(Native.invokeInt(this, this.peer, i11, objArr));
                }
                return Character.valueOf((char) Native.invokeInt(this, this.peer, i11, objArr));
            }
            return Short.valueOf((short) Native.invokeInt(this, this.peer, i11, objArr));
        }
        return Byte.valueOf((byte) Native.invokeInt(this, this.peer, i11, objArr));
    }

    public void invoke(Object[] objArr) {
        invoke(Void.class, objArr);
    }
}
