package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d1 extends h1 implements kotlin.reflect.q {
    public d1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.u(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object h(Object obj) {
        return ((kotlin.reflect.q) getReflected()).h(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public d1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.q.b b() {
        return ((kotlin.reflect.q) getReflected()).b();
    }

    @kotlin.e1(version = "1.4")
    public d1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
