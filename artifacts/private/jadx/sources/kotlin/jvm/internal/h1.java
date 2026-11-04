package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h1 extends q implements kotlin.reflect.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f312738a;

    public h1() {
        this.f312738a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.o getReflected() {
        if (this.f312738a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kotlin.reflect.o) super.getReflected();
    }

    @Override // kotlin.jvm.internal.q
    public kotlin.reflect.c compute() {
        return this.f312738a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            return getOwner().equals(h1Var.getOwner()) && getName().equals(h1Var.getName()) && getSignature().equals(h1Var.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), h1Var.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.o) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.o
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean n() {
        return getReflected().n();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.o
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean v() {
        return getReflected().v();
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public h1(Object obj) {
        super(obj);
        this.f312738a = false;
    }

    @kotlin.e1(version = "1.4")
    public h1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f312738a = (i10 & 2) == 2;
    }
}
