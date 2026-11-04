package retrofit2;

import fj.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.b0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.v;

/* JADX INFO: loaded from: classes14.dex */
public final class Retrofit {
    final v baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final e.a callFactory;

    @h
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    final int defaultCallAdapterFactoriesSize;
    final int defaultConverterFactoriesSize;
    private final ConcurrentHashMap<Method, Object> serviceMethodCache = new ConcurrentHashMap<>();
    final boolean validateEagerly;

    Retrofit(e.a aVar, v vVar, List<Converter.Factory> list, int i10, List<CallAdapter.Factory> list2, int i11, @h Executor executor, boolean z10) {
        this.callFactory = aVar;
        this.baseUrl = vVar;
        this.converterFactories = list;
        this.defaultConverterFactoriesSize = i10;
        this.callAdapterFactories = list2;
        this.defaultCallAdapterFactoriesSize = i11;
        this.callbackExecutor = executor;
        this.validateEagerly = z10;
    }

    private void validateServiceInterface(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        int i10 = 4 | 1;
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            Reflection reflection = Platform.reflection;
            for (Method method : cls.getDeclaredMethods()) {
                if (!reflection.isDefaultMethod(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    loadServiceMethod(cls, method);
                }
            }
        }
    }

    public v baseUrl() {
        return this.baseUrl;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public e.a callFactory() {
        return this.callFactory;
    }

    @h
    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(final Class<T> cls) {
        validateServiceInterface(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Object[] emptyArgs = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @h
            public Object invoke(Object obj, Method method, @h Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                Reflection reflection = Platform.reflection;
                return reflection.isDefaultMethod(method) ? reflection.invokeDefaultMethod(method, cls, obj, objArr) : Retrofit.this.loadServiceMethod(cls, method).invoke(obj, objArr);
            }
        });
    }

    ServiceMethod<?> loadServiceMethod(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.serviceMethodCache.get(method);
            if (objPutIfAbsent instanceof ServiceMethod) {
                return (ServiceMethod) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.serviceMethodCache.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                ServiceMethod<?> annotations = ServiceMethod.parseAnnotations(this, cls, method);
                                this.serviceMethodCache.put(method, annotations);
                                return annotations;
                            } catch (Throwable th2) {
                                this.serviceMethodCache.remove(method);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.serviceMethodCache.get(method);
                    if (obj2 != null) {
                        return (ServiceMethod) obj2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(@h CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i10).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.callAdapterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.callAdapterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<T, e0> nextRequestBodyConverter(@h Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<T, e0> converter = (Converter<T, e0>) this.converterFactories.get(i10).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.converterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.converterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<g0, T> nextResponseBodyConverter(@h Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<g0, T> converter = (Converter<g0, T>) this.converterFactories.get(i10).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.converterFactories.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.converterFactories.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<T, e0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<g0, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i10 = 0; i10 < size; i10++) {
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i10).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }

    public static final class Builder {

        @h
        private v baseUrl;

        @h
        private e.a callFactory;

        @h
        private Executor callbackExecutor;
        private boolean validateEagerly;
        private final List<Converter.Factory> converterFactories = new ArrayList();
        private final List<CallAdapter.Factory> callAdapterFactories = new ArrayList();

        public Builder() {
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            List<CallAdapter.Factory> list = this.callAdapterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            List<Converter.Factory> list = this.converterFactories;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(v.C(url.toString()));
        }

        public Retrofit build() {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            e.a b0Var = this.callFactory;
            if (b0Var == null) {
                b0Var = new b0();
            }
            e.a aVar = b0Var;
            Executor executor = this.callbackExecutor;
            if (executor == null) {
                executor = Platform.callbackExecutor;
            }
            Executor executor2 = executor;
            BuiltInFactories builtInFactories = Platform.builtInFactories;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            List<? extends CallAdapter.Factory> listCreateDefaultCallAdapterFactories = builtInFactories.createDefaultCallAdapterFactories(executor2);
            arrayList.addAll(listCreateDefaultCallAdapterFactories);
            List<? extends Converter.Factory> listCreateDefaultConverterFactories = builtInFactories.createDefaultConverterFactories();
            int size = listCreateDefaultConverterFactories.size();
            ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + size);
            arrayList2.add(new BuiltInConverters());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(listCreateDefaultConverterFactories);
            return new Retrofit(aVar, this.baseUrl, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listCreateDefaultCallAdapterFactories.size(), executor2, this.validateEagerly);
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.callFactory = aVar;
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public Builder client(b0 b0Var) {
            Objects.requireNonNull(b0Var, "client == null");
            return callFactory(b0Var);
        }

        public List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean z10) {
            this.validateEagerly = z10;
            return this;
        }

        public Builder baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(v.C(str));
        }

        Builder(Retrofit retrofit) {
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size() - retrofit.defaultConverterFactoriesSize;
            for (int i10 = 1; i10 < size; i10++) {
                this.converterFactories.add(retrofit.converterFactories.get(i10));
            }
            int size2 = retrofit.callAdapterFactories.size() - retrofit.defaultCallAdapterFactoriesSize;
            for (int i11 = 0; i11 < size2; i11++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i11));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        public Builder baseUrl(v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List<String> listL = vVar.L();
            if ("".equals(listL.get(listL.size() - 1))) {
                this.baseUrl = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }
    }
}
