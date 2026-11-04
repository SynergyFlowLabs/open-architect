package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w0 extends y0 implements kotlin.reflect.m {
    public w0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return j1.l(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return w(obj, obj2);
    }

    @Override // kotlin.reflect.r
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public Object u(Object obj, Object obj2) {
        return ((kotlin.reflect.m) getReflected()).u(obj, obj2);
    }

    @kotlin.e1(version = "1.4")
    public w0(Class cls, String str, String str2, int i10) {
        super(q.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.m.b a() {
        return ((kotlin.reflect.m) getReflected()).a();
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.r.b b() {
        return ((kotlin.reflect.m) getReflected()).b();
    }
}
