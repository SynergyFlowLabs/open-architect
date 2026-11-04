package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q implements kotlin.reflect.c, Serializable {

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final Object NO_RECEIVER = a.f312783a;

    @kotlin.e1(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.e1(version = "1.4")
    private final String name;

    @kotlin.e1(version = "1.4")
    private final Class owner;

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    protected final Object receiver;
    private transient kotlin.reflect.c reflected;

    @kotlin.e1(version = "1.4")
    private final String signature;

    @kotlin.e1(version = "1.2")
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f312783a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f312783a;
        }
    }

    public q() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public kotlin.reflect.c compute() {
        kotlin.reflect.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        kotlin.reflect.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.name;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? j1.g(cls) : j1.d(cls);
    }

    @Override // kotlin.reflect.c
    public List<kotlin.reflect.n> getParameters() {
        return getReflected().getParameters();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    protected kotlin.reflect.c getReflected() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new oj.r();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.s getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.c
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public List<kotlin.reflect.t> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.c
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public kotlin.reflect.v getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.c
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.c
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.c
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    @kotlin.e1(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    protected q(Object obj) {
        this(obj, null, null, null, false);
    }

    @kotlin.e1(version = "1.4")
    protected q(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
