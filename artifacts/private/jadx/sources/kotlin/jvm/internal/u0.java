package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u0 extends y0 implements kotlin.reflect.l {
    public u0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.k(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object h(Object obj) {
        return ((kotlin.reflect.l) getReflected()).h(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public u0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.l.b a() {
        return ((kotlin.reflect.l) getReflected()).a();
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.q.b b() {
        return ((kotlin.reflect.l) getReflected()).b();
    }

    @kotlin.e1(version = "1.4")
    public u0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
