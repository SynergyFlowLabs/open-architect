package com.sun.jna;

import com.facebook.internal.z0;
import com.facebook.share.internal.k;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.planner5d.library.engine.input.f;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class Native implements Version {
    public static final int BOOL_SIZE;
    static final int CB_HAS_INITIALIZER = 1;
    static final int CB_OPTION_DIRECT = 1;
    static final int CB_OPTION_IN_DLL = 2;
    private static final int CVT_ARRAY_BOOLEAN = 13;
    private static final int CVT_ARRAY_BYTE = 6;
    private static final int CVT_ARRAY_CHAR = 8;
    private static final int CVT_ARRAY_DOUBLE = 12;
    private static final int CVT_ARRAY_FLOAT = 11;
    private static final int CVT_ARRAY_INT = 9;
    private static final int CVT_ARRAY_LONG = 10;
    private static final int CVT_ARRAY_SHORT = 7;
    private static final int CVT_BOOLEAN = 14;
    private static final int CVT_BUFFER = 5;
    private static final int CVT_BYTE = 29;
    private static final int CVT_CALLBACK = 15;
    private static final int CVT_DEFAULT = 0;
    private static final int CVT_FLOAT = 16;
    private static final int CVT_INTEGER_TYPE = 21;
    private static final int CVT_JNIENV = 27;
    private static final int CVT_NATIVE_MAPPED = 17;
    private static final int CVT_NATIVE_MAPPED_STRING = 18;
    private static final int CVT_NATIVE_MAPPED_WSTRING = 19;
    private static final int CVT_OBJECT = 26;
    private static final int CVT_POINTER = 1;
    private static final int CVT_POINTER_TYPE = 22;
    private static final int CVT_SHORT = 28;
    private static final int CVT_STRING = 2;
    private static final int CVT_STRUCTURE = 3;
    private static final int CVT_STRUCTURE_BYVAL = 4;
    private static final int CVT_TYPE_MAPPER = 23;
    private static final int CVT_TYPE_MAPPER_STRING = 24;
    private static final int CVT_TYPE_MAPPER_WSTRING = 25;
    private static final int CVT_UNSUPPORTED = -1;
    private static final int CVT_WSTRING = 20;
    public static final boolean DEBUG_JNA_LOAD;
    private static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    private static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    static final String JNA_TMPLIB_PREFIX = "jna";
    private static final Logger LOG = Logger.getLogger(Native.class.getName());
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    static final int MAX_ALIGNMENT;
    static final int MAX_PADDING;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    private static final int TYPE_BOOL = 4;
    private static final int TYPE_LONG = 1;
    private static final int TYPE_LONG_DOUBLE = 5;
    private static final int TYPE_SIZE_T = 3;
    private static final int TYPE_VOIDP = 0;
    private static final int TYPE_WCHAR_T = 2;
    public static final int WCHAR_SIZE;
    private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    private static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    private static final Object finalizer;
    static String jnidispatchPath;
    private static final Map<Class<?>, Reference<?>> libraries;
    private static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    private static final Map<Thread, Pointer> nativeThreads;
    private static final Map<Class<?>, long[]> registeredClasses;
    private static final Map<Class<?>, NativeLibrary> registeredLibraries;
    private static final Map<Class<?>, Map<String, Object>> typeOptions;

    private static class AWT {
        private AWT() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.HeadlessException */
        static long getComponentID(Object obj) throws HeadlessException {
            if (GraphicsEnvironment.isHeadless()) {
                throw new HeadlessException("No native windows when headless");
            }
            Component component = (Component) obj;
            if (component.isLightweight()) {
                throw new IllegalArgumentException("Component must be heavyweight");
            }
            if (!component.isDisplayable()) {
                throw new IllegalStateException("Component must be displayable");
            }
            if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                throw new IllegalStateException("Component must be visible");
            }
            return Native.getWindowHandle0(component);
        }

        static long getWindowID(Window window) throws HeadlessException {
            return getComponentID(window);
        }
    }

    private static class Buffers {
        private Buffers() {
        }

        static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    public interface ffi_callback {
        void invoke(long j10, long j11, long j12);
    }

    static {
        Charset charsetForName;
        String property;
        String property2 = System.getProperty("native.encoding");
        if (property2 != null) {
            try {
                charsetForName = Charset.forName(property2);
            } catch (Exception e10) {
                LOG.log(Level.WARNING, "Failed to get charset for native.encoding value : '" + property2 + "'", (Throwable) e10);
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName == null) {
            charsetForName = Charset.defaultCharset();
        }
        DEFAULT_CHARSET = charsetForName;
        DEFAULT_ENCODING = charsetForName.name();
        DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
        boolean z10 = Boolean.getBoolean("jna.debug_load.jna");
        DEBUG_JNA_LOAD = z10;
        DEBUG_JNA_LOAD_LEVEL = z10 ? Level.INFO : Level.FINE;
        jnidispatchPath = null;
        typeOptions = Collections.synchronizedMap(new WeakHashMap());
        libraries = Collections.synchronizedMap(new WeakHashMap());
        Callback.UncaughtExceptionHandler uncaughtExceptionHandler = new Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public void uncaughtException(Callback callback, Throwable th2) {
                Native.LOG.log(Level.WARNING, "JNA: Callback " + callback + " threw the following exception", th2);
            }
        };
        DEFAULT_HANDLER = uncaughtExceptionHandler;
        callbackExceptionHandler = uncaughtExceptionHandler;
        loadNativeDispatchLibrary();
        if (!isCompatibleVersion(Version.VERSION_NATIVE, getNativeVersion())) {
            String strLineSeparator = System.lineSeparator();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strLineSeparator);
            sb2.append(strLineSeparator);
            sb2.append("There is an incompatible JNA native library installed on this system");
            sb2.append(strLineSeparator);
            sb2.append("Expected: ");
            sb2.append(Version.VERSION_NATIVE);
            sb2.append(strLineSeparator);
            sb2.append("Found:    ");
            sb2.append(getNativeVersion());
            sb2.append(strLineSeparator);
            if (jnidispatchPath != null) {
                property = "(at " + jnidispatchPath + ")";
            } else {
                property = System.getProperty("java.library.path");
            }
            sb2.append(property);
            sb2.append(".");
            sb2.append(strLineSeparator);
            sb2.append("To resolve this issue you may do one of the following:");
            sb2.append(strLineSeparator);
            sb2.append(" - remove or uninstall the offending library");
            sb2.append(strLineSeparator);
            sb2.append(" - set the system property jna.nosys=true");
            sb2.append(strLineSeparator);
            sb2.append(" - set jna.boot.library.path to include the path to the version of the ");
            sb2.append(strLineSeparator);
            sb2.append("   jnidispatch library included with the JNA jar file you are using");
            sb2.append(strLineSeparator);
            throw new Error(sb2.toString());
        }
        POINTER_SIZE = sizeof(0);
        int iSizeof = sizeof(1);
        LONG_SIZE = iSizeof;
        WCHAR_SIZE = sizeof(2);
        SIZE_T_SIZE = sizeof(3);
        BOOL_SIZE = sizeof(4);
        LONG_DOUBLE_SIZE = sizeof(5);
        initIDs();
        if (Boolean.getBoolean("jna.protected")) {
            setProtected(true);
        }
        int i10 = 8;
        if (Platform.isSPARC() || Platform.isWindows() || ((Platform.isLinux() && (Platform.isARM() || Platform.isPPC() || Platform.isMIPS() || Platform.isLoongArch())) || Platform.isAIX() || (Platform.isAndroid() && !Platform.isIntel()))) {
            iSizeof = 8;
        }
        MAX_ALIGNMENT = iSizeof;
        if (!Platform.isMac() || !Platform.isPPC()) {
            i10 = iSizeof;
        }
        MAX_PADDING = i10;
        System.setProperty("jna.loaded", z0.P);
        finalizer = new Object() { // from class: com.sun.jna.Native.2
            protected void finalize() throws Throwable {
                Native.dispose();
                super.finalize();
            }
        };
        registeredClasses = new WeakHashMap();
        registeredLibraries = new WeakHashMap();
        nativeThreadTerminationFlag = new ThreadLocal<Memory>() { // from class: com.sun.jna.Native.7
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Memory initialValue() {
                Memory memory = new Memory(4L);
                memory.clear();
                return memory;
            }
        };
        nativeThreads = Collections.synchronizedMap(new WeakHashMap());
    }

    private Native() {
    }

    private static native long _getDirectBufferPointer(Buffer buffer);

    private static native long _getPointer(long j10);

    private static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap map2 = new HashMap(map);
        map2.put(_OPTION_ENCLOSING_LIBRARY, cls);
        typeOptions.put(cls, map2);
        if (obj != null) {
            libraries.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, map2, obj);
                    return map2;
                }
            }
        }
        return map2;
    }

    static native void close(long j10);

    static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i10, int i11, String str);

    static boolean deleteLibrary(File file) {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    public static void detach(boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        if (z10) {
            nativeThreads.remove(threadCurrentThread);
            nativeThreadTerminationFlag.get();
            setDetachState(true, 0L);
        } else {
            Map<Thread, Pointer> map = nativeThreads;
            if (map.containsKey(threadCurrentThread)) {
                return;
            }
            Memory memory = nativeThreadTerminationFlag.get();
            map.put(threadCurrentThread, memory);
            setDetachState(false, memory.peer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static File extractFromResourcePath(String str) throws IOException {
        return extractFromResourcePath(str, null);
    }

    public static native void ffi_call(long j10, long j11, long j12, long j13);

    public static native void ffi_free_closure(long j10);

    public static native long ffi_prep_cif(int i10, int i11, long j10, long j11);

    public static native long ffi_prep_closure(long j10, ffi_callback ffi_callbackVar);

    static Class<?> findDirectMappedClass(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        int iLastIndexOf = cls.getName().lastIndexOf("$");
        if (iLastIndexOf != -1) {
            try {
                return findDirectMappedClass(Class.forName(cls.getName().substring(0, iLastIndexOf), true, cls.getClassLoader()));
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + cls + ")");
    }

    static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            Class<?> cls2 = (Class) map.get(_OPTION_ENCLOSING_LIBRARY);
            if (cls2 != null) {
                return cls2;
            }
        } else if (!Library.class.isAssignableFrom(cls)) {
            if (Callback.class.isAssignableFrom(cls)) {
                cls = CallbackReference.findCallbackClass(cls);
            }
            Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
            return clsFindEnclosingLibraryClass != null ? clsFindEnclosingLibraryClass : findEnclosingLibraryClass(cls.getSuperclass());
        }
        return cls;
    }

    static native long findSymbol(long j10, String str);

    public static native void free(long j10);

    static native synchronized void freeNativeCallback(long j10);

    private static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    private static native String getAPIChecksum();

    static native byte getByte(Pointer pointer, long j10, long j11);

    static byte[] getBytes(String str) {
        return getBytes(str, getDefaultStringEncoding());
    }

    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    static Class<?> getCallingClass() {
        Class<?>[] classContext = new SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext == null) {
            throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length >= 4) {
            return classContext[3];
        }
        throw new IllegalStateException("This method must be called from the static initializer of a class");
    }

    static native char getChar(Pointer pointer, long j10, long j11);

    private static Charset getCharset(String str) {
        Charset charsetForName;
        if (str != null) {
            try {
                charsetForName = Charset.forName(str);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException e10) {
                LOG.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e10.getMessage()});
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName != null) {
            return charsetForName;
        }
        Logger logger = LOG;
        Level level = Level.WARNING;
        Charset charset = DEFAULT_CHARSET;
        logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
        return charset;
    }

    public static long getComponentID(Component component) throws HeadlessException {
        return AWT.getComponentID(component);
    }

    public static Pointer getComponentPointer(Component component) throws HeadlessException {
        return new Pointer(AWT.getComponentID(component));
    }

    private static int getConversion(Class<?> cls, TypeMapper typeMapper, boolean z10) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (typeMapper != null) {
            FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                Class<?> clsNativeType = fromNativeConverter.nativeType();
                if (clsNativeType == String.class) {
                    return 24;
                }
                return clsNativeType == WString.class ? 25 : 23;
            }
            if (toNativeConverter != null) {
                Class<?> clsNativeType2 = toNativeConverter.nativeType();
                if (clsNativeType2 == String.class) {
                    return 24;
                }
                return clsNativeType2 == WString.class ? 25 : 23;
            }
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (WString.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) {
            return 5;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            return Structure.ByValue.class.isAssignableFrom(cls) ? 4 : 3;
        }
        if (cls.isArray()) {
            char cCharAt = cls.getName().charAt(1);
            if (cCharAt == 'F') {
                return 11;
            }
            if (cCharAt == 'S') {
                return 7;
            }
            if (cCharAt == 'Z') {
                return 13;
            }
            if (cCharAt == 'I') {
                return 9;
            }
            if (cCharAt == 'J') {
                return 10;
            }
            switch (cCharAt) {
                case 'B':
                    return 6;
                case 'C':
                    return 8;
                case f.b.V /* 68 */:
                    return 12;
            }
        }
        if (cls.isPrimitive()) {
            return cls == Boolean.TYPE ? 14 : 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (PointerType.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (!NativeMapped.class.isAssignableFrom(cls)) {
            if (JNIEnv.class == cls) {
                return 27;
            }
            return z10 ? 26 : -1;
        }
        Class<?> clsNativeType3 = NativeMappedConverter.getInstance(cls).nativeType();
        if (clsNativeType3 == String.class) {
            return 18;
        }
        return clsNativeType3 == WString.class ? 19 : 17;
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long j_getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (j_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(j_getDirectBufferPointer);
    }

    static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j10, long j11, long j12);

    static native double getDouble(Pointer pointer, long j10, long j11);

    static native float getFloat(Pointer pointer, long j10, long j11);

    static native int getInt(Pointer pointer, long j10, long j11);

    public static native int getLastError();

    public static Map<String, Object> getLibraryOptions(Class<?> cls) {
        Map map;
        Map<Class<?>, Map<String, Object>> map2 = typeOptions;
        Map<String, Object> map3 = map2.get(cls);
        if (map3 != null) {
            return map3;
        }
        Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls);
        if (clsFindEnclosingLibraryClass != null) {
            loadLibraryInstance(clsFindEnclosingLibraryClass);
        } else {
            clsFindEnclosingLibraryClass = cls;
        }
        Map<String, Object> map4 = map2.get(clsFindEnclosingLibraryClass);
        if (map4 != null) {
            map2.put(cls, map4);
            return map4;
        }
        try {
            Field field = clsFindEnclosingLibraryClass.getField("OPTIONS");
            field.setAccessible(true);
            map = (Map) field.get(null);
            if (map == null) {
                throw new IllegalStateException("Null options field");
            }
        } catch (NoSuchFieldException unused) {
            map = Collections.EMPTY_MAP;
        } catch (Exception e10) {
            throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + e10 + "): " + clsFindEnclosingLibraryClass);
        }
        HashMap map5 = new HashMap(map);
        if (!map5.containsKey(Library.OPTION_TYPE_MAPPER)) {
            map5.put(Library.OPTION_TYPE_MAPPER, lookupField(clsFindEnclosingLibraryClass, "TYPE_MAPPER", TypeMapper.class));
        }
        if (!map5.containsKey(Library.OPTION_STRUCTURE_ALIGNMENT)) {
            map5.put(Library.OPTION_STRUCTURE_ALIGNMENT, lookupField(clsFindEnclosingLibraryClass, "STRUCTURE_ALIGNMENT", Integer.class));
        }
        if (!map5.containsKey(Library.OPTION_STRING_ENCODING)) {
            map5.put(Library.OPTION_STRING_ENCODING, lookupField(clsFindEnclosingLibraryClass, "STRING_ENCODING", String.class));
        }
        Map<String, Object> mapCacheOptions = cacheOptions(clsFindEnclosingLibraryClass, map5, null);
        if (cls != clsFindEnclosingLibraryClass) {
            typeOptions.put(cls, mapCacheOptions);
        }
        return mapCacheOptions;
    }

    static native long getLong(Pointer pointer, long j10, long j11);

    public static NativeLibrary getNativeLibrary(Library library) {
        if (library == null) {
            throw new IllegalArgumentException("null passed to getNativeLibrary");
        }
        if (!Proxy.isProxyClass(library.getClass())) {
            throw new IllegalArgumentException("library object passed to getNativeLibrary in not a proxy");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (invocationHandler instanceof Library.Handler) {
            return ((Library.Handler) invocationHandler).getNativeLibrary();
        }
        throw new IllegalArgumentException("Object is not a properly initialized Library interface instance");
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return length * getNativeSize(cls.getComponentType(), Array.get(obj, 0));
            }
            throw new IllegalArgumentException("Arrays of length zero not allowed: " + cls);
        }
        if (Structure.class.isAssignableFrom(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("The type \"" + cls.getName() + "\" is not supported: " + e10.getMessage());
        }
    }

    private static native String getNativeVersion();

    static Pointer getPointer(long j10) {
        long j_getPointer = _getPointer(j10);
        if (j_getPointer == 0) {
            return null;
        }
        return new Pointer(j_getPointer);
    }

    static native short getShort(Pointer pointer, long j10, long j11);

    static String getSignature(Class<?> cls) {
        if (cls.isArray()) {
            return "[" + getSignature(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return androidx.exifinterface.media.a.Y4;
            }
            if (cls == Boolean.TYPE) {
                return org.locationtech.jts.io.gml2.a.f338505w;
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return androidx.exifinterface.media.a.S4;
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        return "L" + replace(".", "/", cls.getName()) + ";";
    }

    static String getString(Pointer pointer, long j10) {
        return getString(pointer, j10, getDefaultStringEncoding());
    }

    static native byte[] getStringBytes(Pointer pointer, long j10, long j11);

    public static String getStringEncoding(Class<?> cls) {
        String str = (String) getLibraryOptions(cls).get(Library.OPTION_STRING_ENCODING);
        return str != null ? str : getDefaultStringEncoding();
    }

    public static int getStructureAlignment(Class<?> cls) {
        Integer num = (Integer) getLibraryOptions(cls).get(Library.OPTION_STRUCTURE_ALIGNMENT);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    static File getTempDir() throws IOException {
        File file;
        File file2;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        } else {
            file = new File(System.getProperty("java.io.tmpdir"));
            if (Platform.isMac()) {
                file2 = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (Platform.isLinux() || Platform.isSolaris() || Platform.isAIX() || Platform.isDragonFlyBSD() || Platform.isFreeBSD() || Platform.isNetBSD() || Platform.isOpenBSD() || Platform.iskFreeBSD()) {
                String str = System.getenv("XDG_CACHE_HOME");
                file2 = new File((str == null || str.trim().isEmpty()) ? new File(System.getProperty("user.home"), ".cache") : new File(str), "JNA/temp");
            } else {
                file2 = new File(file, "jna-" + System.getProperty("user.name").hashCode());
            }
            file2.mkdirs();
            if (file2.exists() && file2.canWrite()) {
                file = file2;
            }
        }
        if (!file.exists()) {
            throw new IOException("JNA temporary directory '" + file + "' does not exist");
        }
        if (file.canWrite()) {
            return file;
        }
        throw new IOException("JNA temporary directory '" + file + "' is not writable");
    }

    static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get(Library.OPTION_TYPE_MAPPER);
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) AccessController.doPrivileged(new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.4
                @Override // java.security.PrivilegedAction
                public Method run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            })).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new File(str2).getParent();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static native String getWideString(Pointer pointer, long j10, long j11);

    static native long getWindowHandle0(Component component);

    public static long getWindowID(Window window) throws HeadlessException {
        return AWT.getWindowID(window);
    }

    public static Pointer getWindowPointer(Window window) throws HeadlessException {
        return new Pointer(AWT.getWindowID(window));
    }

    static native long indexOf(Pointer pointer, long j10, long j11, byte b10);

    private static native void initIDs();

    static native int initialize_ffi_type(long j10);

    static native double invokeDouble(Function function, long j10, int i10, Object[] objArr);

    static native float invokeFloat(Function function, long j10, int i10, Object[] objArr);

    static native int invokeInt(Function function, long j10, int i10, Object[] objArr);

    static native long invokeLong(Function function, long j10, int i10, Object[] objArr);

    static native Object invokeObject(Function function, long j10, int i10, Object[] objArr);

    static native long invokePointer(Function function, long j10, int i10, Object[] objArr);

    static Structure invokeStructure(Function function, long j10, int i10, Object[] objArr, Structure structure) {
        invokeStructure(function, j10, i10, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    private static native void invokeStructure(Function function, long j10, int i10, Object[] objArr, long j11, long j12);

    static native void invokeVoid(Function function, long j10, int i10, Object[] objArr);

    static boolean isCompatibleVersion(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
            return false;
        }
        return Integer.parseInt(strArrSplit[0]) == Integer.parseInt(strArrSplit2[0]) && Integer.parseInt(strArrSplit[1]) <= Integer.parseInt(strArrSplit2[1]);
    }

    public static native synchronized boolean isProtected();

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            return getNativeSize(cls) != 0;
        } catch (IllegalArgumentException unused) {
        }
    }

    static boolean isUnpacked(File file) {
        return file.getName().startsWith(JNA_TMPLIB_PREFIX);
    }

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load((String) null, cls);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary((String) null, cls);
    }

    private static void loadLibraryInstance(Class<?> cls) {
        if (cls == null || libraries.containsKey(cls)) {
            return;
        }
        try {
            for (Field field : cls.getFields()) {
                if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    libraries.put(cls, new WeakReference(field.get(null)));
                    return;
                }
            }
        } catch (Exception e10) {
            throw new IllegalArgumentException("Could not access instance of " + cls + " (" + e10 + ")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0038 A[SYNTHETIC] */
    private static void loadNativeDispatchLibrary() throws Throwable {
        String str;
        String str2;
        String str3;
        Logger logger;
        Level level;
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e10) {
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e10);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File file = new File(new File(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = file.getAbsolutePath();
                Logger logger2 = LOG;
                Level level2 = DEBUG_JNA_LOAD_LEVEL;
                logger2.log(level2, "Looking in {0}", absolutePath);
                if (file.exists()) {
                    try {
                        logger2.log(level2, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        System.load(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger2.log(level2, "Found jnidispatch at {0}", absolutePath);
                    } catch (UnsatisfiedLinkError unused) {
                        if (Platform.isMac()) {
                            str = "dylib";
                            str2 = "jnilib";
                            if (!absolutePath.endsWith("dylib")) {
                                str2 = "dylib";
                                str = "jnilib";
                            }
                            str3 = absolutePath.substring(0, absolutePath.lastIndexOf(str)) + str2;
                            logger = LOG;
                            level = DEBUG_JNA_LOAD_LEVEL;
                            logger.log(level, "Looking in {0}", str3);
                            if (new File(str3).exists()) {
                                try {
                                    logger.log(level, "Trying {0}", str3);
                                    System.setProperty("jnidispatch.path", str3);
                                    System.load(str3);
                                    jnidispatchPath = str3;
                                    logger.log(level, "Found jnidispatch at {0}", str3);
                                } catch (UnsatisfiedLinkError e11) {
                                    LOG.log(Level.WARNING, "File found at " + str3 + " but not loadable: " + e11.getMessage(), (Throwable) e11);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } else if (Platform.isMac()) {
                    str = "dylib";
                    str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    str3 = absolutePath.substring(0, absolutePath.lastIndexOf(str)) + str2;
                    logger = LOG;
                    level = DEBUG_JNA_LOAD_LEVEL;
                    logger.log(level, "Looking in {0}", str3);
                    if (new File(str3).exists()) {
                        logger.log(level, "Trying {0}", str3);
                        System.setProperty("jnidispatch.path", str3);
                        System.load(str3);
                        jnidispatchPath = str3;
                        logger.log(level, "Found jnidispatch at {0}", str3);
                    } else {
                        continue;
                    }
                }
            }
            if (Boolean.parseBoolean(System.getProperty("jna.nosys", z0.P)) || Platform.isAndroid()) {
                try {
                    Logger logger3 = LOG;
                    Level level3 = DEBUG_JNA_LOAD_LEVEL;
                    logger3.log(level3, "Trying (via loadLibrary) {0}", property);
                    System.loadLibrary(property);
                    logger3.log(level3, "Found jnidispatch on system path");
                } catch (UnsatisfiedLinkError unused2) {
                }
            }
            if (Boolean.getBoolean("jna.noclasspath")) {
                throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
            }
            loadNativeDispatchLibraryFromClasspath();
            return;
        }
        if (Boolean.parseBoolean(System.getProperty("jna.nosys", z0.P))) {
        }
        Logger logger4 = LOG;
        Level level4 = DEBUG_JNA_LOAD_LEVEL;
        logger4.log(level4, "Trying (via loadLibrary) {0}", property);
        System.loadLibrary(property);
        logger4.log(level4, "Found jnidispatch on system path");
    }

    private static void loadNativeDispatchLibraryFromClasspath() throws Throwable {
        try {
            String strReplace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (Platform.isAIX()) {
                strReplace = "libjnidispatch.a";
            }
            File fileExtractFromResourcePath = extractFromResourcePath("/com/sun/jna/" + Platform.RESOURCE_PREFIX + "/" + strReplace, Native.class.getClassLoader());
            if (fileExtractFromResourcePath == null && fileExtractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", fileExtractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", fileExtractFromResourcePath.getAbsolutePath());
            System.load(fileExtractFromResourcePath.getAbsolutePath());
            String absolutePath = fileExtractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (!isUnpacked(fileExtractFromResourcePath) || Boolean.getBoolean("jnidispatch.preserve")) {
                return;
            }
            deleteLibrary(fileExtractFromResourcePath);
        } catch (IOException e10) {
            throw new UnsatisfiedLinkError(e10.getMessage());
        }
    }

    private static Object lookupField(Class<?> cls, String str, Class<?> cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e10) {
            throw new IllegalArgumentException(str + " must be a public field of type " + cls2.getName() + " (" + e10 + "): " + cls);
        }
    }

    public static void main(String[] strArr) {
        Package r10 = Native.class.getPackage();
        String str = "Java Native Access (JNA)";
        String specificationTitle = r10 != null ? r10.getSpecificationTitle() : "Java Native Access (JNA)";
        if (specificationTitle != null) {
            str = specificationTitle;
        }
        String str2 = Version.VERSION;
        String specificationVersion = r10 != null ? r10.getSpecificationVersion() : Version.VERSION;
        if (specificationVersion != null) {
            str2 = specificationVersion;
        }
        System.out.println(str + " API Version " + str2);
        String implementationVersion = r10 != null ? r10.getImplementationVersion() : "5.17.0 (package information missing)";
        String str3 = implementationVersion != null ? implementationVersion : "5.17.0 (package information missing)";
        System.out.println("Version: " + str3);
        System.out.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" Prefix: ");
        sb2.append(Platform.RESOURCE_PREFIX);
        printStream.println(sb2.toString());
    }

    public static native long malloc(long j10);

    static void markTemporaryFile(File file) {
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    static long open(String str) {
        return open(str, -1);
    }

    static native long open(String str, int i10);

    static native void read(Pointer pointer, long j10, long j11, byte[] bArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, char[] cArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, double[] dArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, float[] fArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, int[] iArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, long[] jArr, int i10, int i11);

    static native void read(Pointer pointer, long j10, long j11, short[] sArr, int i10, int i11);

    public static void register(String str) {
        register(findDirectMappedClass(getCallingClass()), str);
    }

    private static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i10, long j10, long j11, Method method, long j12, int i11, boolean z10, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static boolean registered(Class<?> cls) {
        boolean zContainsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                zContainsKey = map.containsKey(cls);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    static void removeTemporaryFiles() throws IOException {
        File[] fileArrListFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".x") && str.startsWith(Native.JNA_TMPLIB_PREFIX);
            }
        });
        for (int i10 = 0; fileArrListFiles != null && i10 < fileArrListFiles.length; i10++) {
            File file = fileArrListFiles[i10];
            String name = file.getName();
            File file2 = new File(file.getParentFile(), name.substring(0, name.length() - 2));
            if (!file2.exists() || file2.delete()) {
                file.delete();
            }
        }
    }

    static String replace(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int iIndexOf = str3.indexOf(str);
            if (iIndexOf == -1) {
                sb2.append(str3);
                return sb2.toString();
            }
            sb2.append(str3.substring(0, iIndexOf));
            sb2.append(str2);
            str3 = str3.substring(iIndexOf + str.length());
        }
    }

    static native void setByte(Pointer pointer, long j10, long j11, byte b10);

    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    static native void setChar(Pointer pointer, long j10, long j11, char c10);

    private static native void setDetachState(boolean z10, long j10);

    static native void setDouble(Pointer pointer, long j10, long j11, double d10);

    static native void setFloat(Pointer pointer, long j10, long j11, float f10);

    static native void setInt(Pointer pointer, long j10, long j11, int i10);

    public static native void setLastError(int i10);

    static native void setLong(Pointer pointer, long j10, long j11, long j12);

    static native void setMemory(Pointer pointer, long j10, long j11, long j12, byte b10);

    static native void setPointer(Pointer pointer, long j10, long j11, long j12);

    public static native synchronized void setProtected(boolean z10);

    static native void setShort(Pointer pointer, long j10, long j11, short s10);

    static native void setWideString(Pointer pointer, long j10, long j11, String str);

    private static native int sizeof(int i10);

    public static Library synchronizedLibrary(final Library library) {
        Class<?> cls = library.getClass();
        if (!Proxy.isProxyClass(cls)) {
            throw new IllegalArgumentException("Library must be a proxy class");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (invocationHandler instanceof Library.Handler) {
            final Library.Handler handler = (Library.Handler) invocationHandler;
            return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.3
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    Object objInvoke;
                    synchronized (handler.getNativeLibrary()) {
                        objInvoke = handler.invoke(library, method, objArr);
                    }
                    return objInvoke;
                }
            });
        }
        throw new IllegalArgumentException("Unrecognized proxy handler: " + invocationHandler);
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    private static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    private static native void unregister(Class<?> cls, long[] jArr);

    private static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                for (Map.Entry<Class<?>, long[]> entry : map.entrySet()) {
                    unregister(entry.getKey(), entry.getValue());
                }
                registeredClasses.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static native void write(Pointer pointer, long j10, long j11, byte[] bArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, char[] cArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, double[] dArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, float[] fArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, int[] iArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, long[] jArr, int i10, int i11);

    static native void write(Pointer pointer, long j10, long j11, short[] sArr, int i10, int i11);

    public static File extractFromResourcePath(String str, ClassLoader classLoader) throws Throwable {
        String strSubstring;
        File file;
        Level level = (DEBUG_LOAD || (DEBUG_JNA_LOAD && str.contains("jnidispatch"))) ? Level.INFO : Level.FINE;
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = LOG;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        String strMapSharedLibraryName = str.startsWith("/") ? str : NativeLibrary.mapSharedLibraryName(str);
        if (str.startsWith("/")) {
            strSubstring = str;
        } else {
            strSubstring = Platform.RESOURCE_PREFIX + "/" + strMapSharedLibraryName;
        }
        if (strSubstring.startsWith("/")) {
            strSubstring = strSubstring.substring(1);
        }
        URL resource = classLoader.getResource(strSubstring);
        if (resource == null) {
            String str2 = Platform.RESOURCE_PREFIX;
            if (strSubstring.startsWith(str2)) {
                if (str2.startsWith("darwin")) {
                    resource = classLoader.getResource("darwin/" + strSubstring.substring(str2.length() + 1));
                }
                if (resource == null) {
                    resource = classLoader.getResource(strMapSharedLibraryName);
                }
            } else {
                if (strSubstring.startsWith("com/sun/jna/" + str2 + "/")) {
                    if (str2.startsWith("com/sun/jna/darwin")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("com/sun/jna/darwin");
                        sb2.append(strSubstring.substring(("com/sun/jna/" + str2).length() + 1));
                        resource = classLoader.getResource(sb2.toString());
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(strMapSharedLibraryName);
                    }
                }
            }
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            throw new IOException("Native library (" + strSubstring + ") not found in resource path (" + property + ")");
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals(k.f101891c)) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            LOG.log(level, "Looking in {0}", file.getAbsolutePath());
            if (file.exists()) {
                return file;
            }
            throw new IOException("File URL " + resource + " could not be properly decoded");
        }
        FileOutputStream fileOutputStream = null;
        if (Boolean.getBoolean("jna.nounpack")) {
            return null;
        }
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(resource);
        if (inputStreamOpenStream == null) {
            throw new IOException("Can't obtain InputStream for " + strSubstring);
        }
        try {
            try {
                File fileCreateTempFile = File.createTempFile(JNA_TMPLIB_PREFIX, Platform.isWindows() ? ".dll" : null, getTempDir());
                if (!Boolean.getBoolean("jnidispatch.preserve")) {
                    fileCreateTempFile.deleteOnExit();
                }
                logger.log(level, "Extracting library to {0}", fileCreateTempFile.getAbsolutePath());
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStreamOpenStream.read(bArr, 0, 1024);
                        if (i10 > 0) {
                            fileOutputStream2.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    inputStreamOpenStream.close();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                    return fileCreateTempFile;
                } catch (IOException e10) {
                    fileOutputStream = fileOutputStream2;
                    e = e10;
                    throw new IOException("Failed to create temporary file for " + str + " library: " + e.getMessage());
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        inputStreamOpenStream.close();
                    } catch (IOException unused4) {
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    static byte[] getBytes(String str, String str2) {
        return getBytes(str, getCharset(str2));
    }

    static String getString(Pointer pointer, long j10, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j10);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    public static void register(NativeLibrary nativeLibrary) {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static List<String> toStringList(char[] cArr, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            if (cArr[i10] == 0) {
                if (i13 == i10) {
                    return arrayList;
                }
                arrayList.add(new String(cArr, i13, i10 - i13));
                i13 = i10 + 1;
            }
            i10++;
        }
        if (i13 < i12) {
            arrayList.add(new String(cArr, i13, i12 - i13));
        }
        return arrayList;
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                long[] jArr = map.get(cls);
                if (jArr != null) {
                    unregister(cls, jArr);
                    map.remove(cls);
                    registeredLibraries.remove(cls);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.EMPTY_MAP);
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.EMPTY_MAP);
    }

    public static void register(Class<?> cls, String str) {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = getBytes(str, charset);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bArr[i10] == 0) {
                length = i10;
                break;
            }
        }
        return length == 0 ? "" : new String(bArr, 0, length, charset);
    }

    private static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) {
        if (!Library.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend " + Library.class.getSimpleName());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
        cacheOptions(cls, map, objNewProxyInstance);
        return cls.cast(objNewProxyInstance);
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, objNewProxyInstance);
            return cls.cast(objNewProxyInstance);
        }
        throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend " + Library.class.getSimpleName());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf A[FALL_THROUGH] */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0080. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0083. Please report as an issue. */
    public static void register(Class<?> cls, NativeLibrary nativeLibrary) {
        long j10;
        int i10;
        FromNativeConverter fromNativeConverter;
        long j11;
        String str;
        boolean z10;
        String str2;
        int i11;
        long j12;
        long j13;
        long j14;
        Class<?> cls2 = cls;
        Method[] declaredMethods = cls2.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        Map<String, ?> options = nativeLibrary.getOptions();
        TypeMapper typeMapper = (TypeMapper) options.get(Library.OPTION_TYPE_MAPPER);
        boolean zEquals = Boolean.TRUE.equals(options.get(Library.OPTION_ALLOW_OBJECTS));
        cacheOptions(cls2, options, null);
        for (Method method : declaredMethods) {
            if ((method.getModifiers() & 256) != 0) {
                arrayList.add(method);
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        int i12 = 0;
        while (i12 < size) {
            Method method2 = (Method) arrayList.get(i12);
            Class<?> returnType = method2.getReturnType();
            Class<?>[] parameterTypes = method2.getParameterTypes();
            long[] jArr2 = new long[parameterTypes.length];
            long[] jArr3 = new long[parameterTypes.length];
            int[] iArr = new int[parameterTypes.length];
            ToNativeConverter[] toNativeConverterArr = new ToNativeConverter[parameterTypes.length];
            int conversion = getConversion(returnType, typeMapper, zEquals);
            int i13 = size;
            if (conversion != -1) {
                ArrayList arrayList2 = arrayList;
                if (conversion == 3) {
                    j10 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                    toNativeConverterArr = toNativeConverterArr;
                    i12 = i12;
                    jArr2 = jArr2;
                    jArr3 = jArr3;
                    fromNativeConverter = null;
                    i10 = 4;
                    j11 = j10;
                } else {
                    if (conversion != 4) {
                        switch (conversion) {
                            default:
                                switch (conversion) {
                                    case 21:
                                    case 22:
                                        break;
                                    case 23:
                                    case 24:
                                    case 25:
                                        FromNativeConverter fromNativeConverter2 = typeMapper.getFromNativeConverter(returnType);
                                        long j15 = Structure.FFIType.get(returnType.isPrimitive() ? returnType : Pointer.class).getPointer().peer;
                                        fromNativeConverter = fromNativeConverter2;
                                        i10 = 4;
                                        j14 = Structure.FFIType.get(fromNativeConverter2.nativeType()).getPointer().peer;
                                        j10 = j15;
                                        j11 = j14;
                                        break;
                                    case 26:
                                        j10 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                        toNativeConverterArr = toNativeConverterArr;
                                        i12 = i12;
                                        jArr2 = jArr2;
                                        jArr3 = jArr3;
                                        fromNativeConverter = null;
                                        i10 = 4;
                                        j11 = j10;
                                        break;
                                    default:
                                        j10 = Structure.FFIType.get(returnType).getPointer().peer;
                                        toNativeConverterArr = toNativeConverterArr;
                                        i12 = i12;
                                        jArr2 = jArr2;
                                        jArr3 = jArr3;
                                        fromNativeConverter = null;
                                        i10 = 4;
                                        j11 = j10;
                                        break;
                                }
                            case 17:
                            case 18:
                            case 19:
                                j12 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                j13 = Structure.FFIType.get(NativeMappedConverter.getInstance(returnType).nativeType()).getPointer().peer;
                                break;
                        }
                    } else {
                        j12 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                        j13 = Structure.FFIType.get(returnType).getPointer().peer;
                    }
                    j14 = j13;
                    j10 = j12;
                    fromNativeConverter = null;
                    i10 = 4;
                    j11 = j14;
                }
                int i14 = i12;
                long j16 = j10;
                String str3 = "(";
                int i15 = 0;
                while (i15 < parameterTypes.length) {
                    Class<?> clsNativeType = parameterTypes[i15];
                    int i16 = i15;
                    String str4 = str3 + getSignature(clsNativeType);
                    int conversion2 = getConversion(clsNativeType, typeMapper, zEquals);
                    iArr[i16] = conversion2;
                    if (conversion2 == -1) {
                        throw new IllegalArgumentException(clsNativeType + " is not a supported argument type (in method " + method2.getName() + " in " + cls + ")");
                    }
                    if (conversion2 == 17 || conversion2 == 18 || conversion2 == 19 || conversion2 == 21) {
                        clsNativeType = NativeMappedConverter.getInstance(clsNativeType).nativeType();
                    } else if (conversion2 == 23 || conversion2 == 24 || conversion2 == 25) {
                        toNativeConverterArr[i16] = typeMapper.getToNativeConverter(clsNativeType);
                    }
                    if (conversion2 != 0) {
                        i11 = i10;
                        if (conversion2 != i11) {
                            switch (conversion2) {
                                default:
                                    switch (conversion2) {
                                        case 21:
                                        case 22:
                                            break;
                                        case 23:
                                        case 24:
                                        case 25:
                                            if (!clsNativeType.isPrimitive()) {
                                                clsNativeType = Pointer.class;
                                            }
                                            jArr3[i16] = Structure.FFIType.get(clsNativeType).getPointer().peer;
                                            jArr2[i16] = Structure.FFIType.get(toNativeConverterArr[i16].nativeType()).getPointer().peer;
                                            break;
                                        default:
                                            long j17 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                            jArr2[i16] = j17;
                                            jArr3[i16] = j17;
                                            break;
                                    }
                                case 17:
                                case 18:
                                case 19:
                                    jArr2[i16] = Structure.FFIType.get(clsNativeType).getPointer().peer;
                                    jArr3[i16] = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                    break;
                            }
                        } else {
                            jArr2[i16] = Structure.FFIType.get(clsNativeType).getPointer().peer;
                            jArr3[i16] = Structure.FFIType.get(Pointer.class).getPointer().peer;
                        }
                    } else {
                        i11 = i10;
                        long j18 = Structure.FFIType.get(clsNativeType).getPointer().peer;
                        jArr2[i16] = j18;
                        jArr3[i16] = j18;
                    }
                    i15 = i16 + 1;
                    i10 = i11;
                    str3 = str4;
                }
                cls2 = cls;
                String str5 = (str3 + ")") + getSignature(returnType);
                Class<?>[] exceptionTypes = method2.getExceptionTypes();
                int i17 = 0;
                while (true) {
                    if (i17 < exceptionTypes.length) {
                        str = str5;
                        if (LastErrorException.class.isAssignableFrom(exceptionTypes[i17])) {
                            z10 = true;
                        } else {
                            i17++;
                            str5 = str;
                        }
                    } else {
                        str = str5;
                        z10 = false;
                    }
                }
                Function function = nativeLibrary.getFunction(method2.getName(), method2);
                long[] jArr4 = jArr;
                try {
                    TypeMapper typeMapper2 = typeMapper;
                    str2 = str;
                    try {
                        boolean z11 = zEquals;
                        jArr4[i14] = registerMethod(cls2, method2.getName(), str2, iArr, jArr3, jArr2, conversion, j16, j11, method2, function.peer, function.getCallingConvention(), z10, toNativeConverterArr, fromNativeConverter, function.encoding);
                        i12 = i14 + 1;
                        jArr = jArr4;
                        zEquals = z11;
                        size = i13;
                        arrayList = arrayList2;
                        typeMapper = typeMapper2;
                    } catch (NoSuchMethodError unused) {
                        throw new UnsatisfiedLinkError("No method " + method2.getName() + " with signature " + str2 + " in " + cls2);
                    }
                } catch (NoSuchMethodError unused2) {
                    str2 = str;
                }
            } else {
                throw new IllegalArgumentException(returnType + " is not a supported return type (in method " + method2.getName() + " in " + cls2 + ")");
            }
        }
        long[] jArr5 = jArr;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            map.put(cls2, jArr5);
            registeredLibraries.put(cls2, nativeLibrary);
        }
    }

    public static String toString(char[] cArr) {
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cArr[i10] == 0) {
                length = i10;
                break;
            }
        }
        return length == 0 ? "" : new String(cArr, 0, length);
    }

    public static NativeLibrary getNativeLibrary(Class<?> cls) {
        NativeLibrary nativeLibrary;
        if (cls != null) {
            Class<?> clsFindDirectMappedClass = findDirectMappedClass(cls);
            synchronized (registeredClasses) {
                try {
                    nativeLibrary = registeredLibraries.get(clsFindDirectMappedClass);
                    if (nativeLibrary == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " is not currently registered");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return nativeLibrary;
        }
        throw new IllegalArgumentException("null passed to getNativeLibrary");
    }

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls != Short.TYPE && cls != Short.class) {
            if (cls != Character.TYPE && cls != Character.class) {
                if (cls != Integer.TYPE && cls != Integer.class) {
                    if (cls == Long.TYPE || cls == Long.class) {
                        return 8;
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return 4;
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return 8;
                    }
                    if (Structure.class.isAssignableFrom(cls)) {
                        return Structure.ByValue.class.isAssignableFrom(cls) ? Structure.size(cls) : POINTER_SIZE;
                    }
                    if (!Pointer.class.isAssignableFrom(cls) && ((!Platform.HAS_BUFFERS || !Buffers.isBuffer(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && WString.class != cls)) {
                        throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
                    }
                    return POINTER_SIZE;
                }
                return 4;
            }
            return WCHAR_SIZE;
        }
        return 2;
    }
}
