package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b1 extends h1 implements kotlin.reflect.p {
    public b1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.t(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object e() {
        return ((kotlin.reflect.p) getReflected()).e();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public b1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.p.b b() {
        return ((kotlin.reflect.p) getReflected()).b();
    }

    @kotlin.e1(version = "1.4")
    public b1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
