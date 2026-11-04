package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1771")
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f291170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y2 f291171b;

    private v(u uVar, y2 y2Var) {
        this.f291170a = (u) com.google.common.base.j0.F(uVar, "state is null");
        this.f291171b = (y2) com.google.common.base.j0.F(y2Var, "status is null");
    }

    public static v a(u uVar) {
        com.google.common.base.j0.e(uVar != u.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new v(uVar, y2.f291450e);
    }

    public static v b(y2 y2Var) {
        com.google.common.base.j0.e(!y2Var.r(), "The error status must not be OK");
        return new v(u.TRANSIENT_FAILURE, y2Var);
    }

    public u c() {
        return this.f291170a;
    }

    public y2 d() {
        return this.f291171b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f291170a.equals(vVar.f291170a) && this.f291171b.equals(vVar.f291171b);
    }

    public int hashCode() {
        return this.f291171b.hashCode() ^ this.f291170a.hashCode();
    }

    public String toString() {
        if (this.f291171b.r()) {
            return this.f291170a.toString();
        }
        return this.f291170a + "(" + this.f291171b + ")";
    }
}
