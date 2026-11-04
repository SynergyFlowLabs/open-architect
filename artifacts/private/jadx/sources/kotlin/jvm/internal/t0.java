package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public class t0 extends s0 {
    public t0(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).l(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get() {
        return b().call(new Object[0]);
    }

    public void set(Object obj) {
        a().call(obj);
    }

    @kotlin.e1(version = "1.4")
    public t0(Class cls, String str, String str2, int i10) {
        super(q.NO_RECEIVER, cls, str, str2, i10);
    }

    @kotlin.e1(version = "1.4")
    public t0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
