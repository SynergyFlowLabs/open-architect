package org.tensorflow.lite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
public final class TensorFlowLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[][] f339777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Throwable f339778c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean[] f339780e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f339776a = Logger.getLogger(TensorFlowLite.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f339779d = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339781a;

        static {
            int[] iArr = new int[f.a.EnumC2445a.values().length];
            f339781a = iArr;
            try {
                iArr[f.a.EnumC2445a.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339781a[f.a.EnumC2445a.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f339782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Exception f339783b;

        b(String namespace, String category) {
            h hVar;
            Exception e10 = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(namespace + ".InterpreterFactoryImpl").getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                hVar = (h) declaredConstructor.newInstance(null);
                try {
                    if (hVar != null) {
                        TensorFlowLite.f339776a.info(String.format("Found %s TF Lite runtime client in %s", category, namespace));
                    } else {
                        TensorFlowLite.f339776a.warning(String.format("Failed to construct TF Lite runtime client from %s", namespace));
                    }
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e11) {
                    e10 = e11;
                    TensorFlowLite.f339776a.info(String.format("Didn't find %s TF Lite runtime client in %s", category, namespace));
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e12) {
                hVar = null;
                e10 = e12;
            }
            this.f339783b = e10;
            this.f339782a = hVar;
        }

        public Exception a() {
            return this.f339783b;
        }

        public h b() {
            return this.f339782a;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f339784a = new b("org.tensorflow.lite", "application");

        private c() {
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f339785a = new b("com.google.android.gms.tflite", "system");

        private d() {
        }
    }

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f339777b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    f339776a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e10) {
                    f339776a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e10;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e10);
                    }
                }
            }
        }
        f339778c = unsatisfiedLinkError;
        f339780e = new AtomicBoolean[f.a.EnumC2445a.values().length];
        for (int i10 = 0; i10 < f.a.EnumC2445a.values().length; i10++) {
            f339780e[i10] = new AtomicBoolean();
        }
    }

    private TensorFlowLite() {
    }

    static h b(f.a.EnumC2445a runtime) {
        return c(runtime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static h c(f.a.EnumC2445a runtime, String className, String methodName) {
        Exception excA;
        String str;
        if (runtime == null) {
            runtime = f.a.EnumC2445a.FROM_APPLICATION_ONLY;
        }
        f.a.EnumC2445a enumC2445a = f.a.EnumC2445a.PREFER_SYSTEM_OVER_APPLICATION;
        if (runtime == enumC2445a || runtime == f.a.EnumC2445a.FROM_SYSTEM_ONLY) {
            b bVar = d.f339785a;
            if (bVar.b() != null) {
                if (!f339780e[runtime.ordinal()].getAndSet(true)) {
                    f339776a.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", runtime.name()));
                }
                return bVar.b();
            }
            excA = bVar.a();
        } else {
            excA = null;
        }
        if (runtime == enumC2445a || runtime == f.a.EnumC2445a.FROM_APPLICATION_ONLY) {
            b bVar2 = c.f339784a;
            if (bVar2.b() != null) {
                if (!f339780e[runtime.ordinal()].getAndSet(true)) {
                    f339776a.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", runtime.name()));
                }
                return bVar2.b();
            }
            if (excA == null) {
                excA = bVar2.a();
            } else if (excA.getSuppressed().length == 0) {
                excA.addSuppressed(bVar2.a());
            }
        }
        int i10 = a.f339781a[runtime.ordinal()];
        if (i10 != 1) {
            str = i10 != 2 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", methodName, className, methodName);
        } else {
            str = String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", methodName, className, methodName);
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + str, excA);
    }

    public static void d() {
        if (f339779d) {
            return;
        }
        try {
            nativeDoNothing();
            f339779d = true;
        } catch (UnsatisfiedLinkError e10) {
            Throwable th2 = f339778c;
            if (th2 == null) {
                th2 = e10;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th2);
            unsatisfiedLinkError.initCause(e10);
            throw unsatisfiedLinkError;
        }
    }

    public static String e() {
        return f(null);
    }

    public static String f(f.a.EnumC2445a runtime) {
        return c(runtime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").b();
    }

    public static String g() {
        return h(null);
    }

    public static String h(f.a.EnumC2445a runtime) {
        return c(runtime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").a();
    }

    @Deprecated
    public static String i() {
        return g();
    }

    private static native void nativeDoNothing();
}
