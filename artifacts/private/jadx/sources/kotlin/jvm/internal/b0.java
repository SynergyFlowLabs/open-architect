package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.e1(version = "1.7")
public class b0 extends f0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f312725a;

    public b0(Class cls) {
        super(1);
        this.f312725a = cls;
    }

    @Override // kotlin.jvm.internal.f0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f312725a.equals(((b0) obj).f312725a);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f0
    public int hashCode() {
        return this.f312725a.hashCode();
    }

    @Override // kotlin.jvm.internal.f0
    public String toString() {
        return "fun interface " + this.f312725a.getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f0, kotlin.jvm.internal.q
    public kotlin.reflect.i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
