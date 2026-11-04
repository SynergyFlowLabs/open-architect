package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f50893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f50894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile q2 f50895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile u f50896d;

    public z1(v0 extensionRegistry, u bytes) {
        a(extensionRegistry, bytes);
        this.f50894b = extensionRegistry;
        this.f50893a = bytes;
    }

    private static void a(v0 extensionRegistry, u bytes) {
        if (extensionRegistry == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static z1 e(q2 value) {
        z1 z1Var = new z1();
        z1Var.m(value);
        return z1Var;
    }

    private static q2 j(q2 value, u otherBytes, v0 extensionRegistry) {
        try {
            value = value.r1().Ch(otherBytes, extensionRegistry).build();
        } catch (t1 unused) {
        }
        return value;
    }

    public void b() {
        this.f50893a = null;
        this.f50895c = null;
        this.f50896d = null;
    }

    public boolean c() {
        u uVar = this.f50896d;
        u uVar2 = u.f50632f;
        if (uVar != uVar2) {
            if (this.f50895c != null) {
                return false;
            }
            u uVar3 = this.f50893a;
            if (uVar3 != null && uVar3 != uVar2) {
                return false;
            }
        }
        return true;
    }

    protected void d(q2 defaultInstance) {
        if (this.f50895c != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f50895c != null) {
                    return;
                }
                try {
                    if (this.f50893a != null) {
                        this.f50895c = defaultInstance.W7().u(this.f50893a, this.f50894b);
                        this.f50896d = this.f50893a;
                    } else {
                        this.f50895c = defaultInstance;
                        this.f50896d = u.f50632f;
                    }
                } catch (t1 unused) {
                    this.f50895c = defaultInstance;
                    this.f50896d = u.f50632f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) o10;
        q2 q2Var = this.f50895c;
        q2 q2Var2 = z1Var.f50895c;
        if (q2Var == null && q2Var2 == null) {
            return n().equals(z1Var.n());
        }
        if (q2Var == null || q2Var2 == null) {
            return q2Var != null ? q2Var.equals(z1Var.g(q2Var.g1())) : g(q2Var2.g1()).equals(q2Var2);
        }
        return q2Var.equals(q2Var2);
    }

    public int f() {
        if (this.f50896d != null) {
            return this.f50896d.size();
        }
        u uVar = this.f50893a;
        if (uVar != null) {
            return uVar.size();
        }
        if (this.f50895c != null) {
            return this.f50895c.w1();
        }
        return 0;
    }

    public q2 g(q2 defaultInstance) {
        d(defaultInstance);
        return this.f50895c;
    }

    public void h(z1 other) {
        u uVar;
        if (other.c()) {
            return;
        }
        if (c()) {
            k(other);
            return;
        }
        if (this.f50894b == null) {
            this.f50894b = other.f50894b;
        }
        u uVar2 = this.f50893a;
        if (uVar2 != null && (uVar = other.f50893a) != null) {
            this.f50893a = uVar2.r(uVar);
            return;
        }
        if (this.f50895c == null && other.f50895c != null) {
            m(j(other.f50895c, this.f50893a, this.f50894b));
        } else if (this.f50895c == null || other.f50895c != null) {
            m(this.f50895c.r1().i8(other.f50895c).build());
        } else {
            m(j(this.f50895c, other.f50893a, other.f50894b));
        }
    }

    public int hashCode() {
        return 1;
    }

    public void i(z input, v0 extensionRegistry) throws IOException {
        if (c()) {
            l(input.y(), extensionRegistry);
            return;
        }
        if (this.f50894b == null) {
            this.f50894b = extensionRegistry;
        }
        u uVar = this.f50893a;
        if (uVar != null) {
            l(uVar.r(input.y()), this.f50894b);
        } else {
            try {
                m(this.f50895c.r1().g3(input, extensionRegistry).build());
            } catch (t1 unused) {
            }
        }
    }

    public void k(z1 other) {
        this.f50893a = other.f50893a;
        this.f50895c = other.f50895c;
        this.f50896d = other.f50896d;
        v0 v0Var = other.f50894b;
        if (v0Var != null) {
            this.f50894b = v0Var;
        }
    }

    public void l(u bytes, v0 extensionRegistry) {
        a(extensionRegistry, bytes);
        this.f50893a = bytes;
        this.f50894b = extensionRegistry;
        this.f50895c = null;
        this.f50896d = null;
    }

    public q2 m(q2 value) {
        q2 q2Var = this.f50895c;
        this.f50893a = null;
        this.f50896d = null;
        this.f50895c = value;
        return q2Var;
    }

    public u n() {
        if (this.f50896d != null) {
            return this.f50896d;
        }
        u uVar = this.f50893a;
        if (uVar != null) {
            return uVar;
        }
        synchronized (this) {
            try {
                if (this.f50896d != null) {
                    return this.f50896d;
                }
                if (this.f50895c == null) {
                    this.f50896d = u.f50632f;
                } else {
                    this.f50896d = this.f50895c.u1();
                }
                return this.f50896d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o(c5 writer, int fieldNumber) throws IOException {
        if (this.f50896d != null) {
            writer.N(fieldNumber, this.f50896d);
            return;
        }
        u uVar = this.f50893a;
        if (uVar != null) {
            writer.N(fieldNumber, uVar);
        } else if (this.f50895c != null) {
            writer.E(fieldNumber, this.f50895c);
        } else {
            writer.N(fieldNumber, u.f50632f);
        }
    }

    public z1() {
    }
}
