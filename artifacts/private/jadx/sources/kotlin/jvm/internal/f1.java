package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f1 extends h1 implements kotlin.reflect.r {
    public f1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.v(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return w(obj, obj2);
    }

    @Override // kotlin.reflect.r
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object u(Object obj, Object obj2) {
        return ((kotlin.reflect.r) getReflected()).u(obj, obj2);
    }

    @kotlin.e1(version = "1.4")
    public f1(Class cls, String str, String str2, int i10) {
        super(q.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.r.b b() {
        return ((kotlin.reflect.r) getReflected()).b();
    }
}
