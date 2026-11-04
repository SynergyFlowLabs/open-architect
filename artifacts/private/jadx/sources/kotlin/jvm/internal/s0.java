package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s0 extends y0 implements kotlin.reflect.k {
    public s0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.j(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object e() {
        return ((kotlin.reflect.k) getReflected()).e();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public s0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.k.b a() {
        return ((kotlin.reflect.k) getReflected()).a();
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.p.b b() {
        return ((kotlin.reflect.k) getReflected()).b();
    }

    @kotlin.e1(version = "1.4")
    public s0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
