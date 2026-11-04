package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public class f0 extends q implements d0, kotlin.reflect.i {
    private final int arity;

    @kotlin.e1(version = "1.4")
    private final int flags;

    public f0(int i10) {
        this(i10, q.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.q
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    protected kotlin.reflect.c computeReflected() {
        return j1.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return getName().equals(f0Var.getName()) && getSignature().equals(f0Var.getSignature()) && this.flags == f0Var.flags && this.arity == f0Var.arity && Intrinsics.areEqual(getBoundReceiver(), f0Var.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), f0Var.getOwner());
        }
        if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.i
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.i
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.i
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.i
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.q, kotlin.reflect.c, kotlin.reflect.i
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public f0(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @kotlin.e1(version = "1.4")
    public f0(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
