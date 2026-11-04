package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v0 f126518e = v0.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f126519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f126520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile n2 f126521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile u f126522d;

    public y1(v0 extensionRegistry, u bytes) {
        a(extensionRegistry, bytes);
        this.f126520b = extensionRegistry;
        this.f126519a = bytes;
    }

    private static void a(v0 extensionRegistry, u bytes) {
        if (extensionRegistry == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (bytes == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static y1 e(n2 value) {
        y1 y1Var = new y1();
        y1Var.m(value);
        return y1Var;
    }

    private static n2 j(n2 value, u otherBytes, v0 extensionRegistry) {
        try {
            return value.r1().Yh(otherBytes, extensionRegistry).build();
        } catch (t1 unused) {
            return value;
        }
    }

    public void b() {
        this.f126519a = null;
        this.f126521c = null;
        this.f126522d = null;
    }

    public boolean c() {
        u uVar;
        u uVar2 = this.f126522d;
        u uVar3 = u.f126379f;
        if (uVar2 != uVar3 && (this.f126521c != null || ((uVar = this.f126519a) != null && uVar != uVar3))) {
            return false;
        }
        return true;
    }

    protected void d(n2 defaultInstance) {
        if (this.f126521c == null) {
            synchronized (this) {
                try {
                    if (this.f126521c != null) {
                        return;
                    }
                    try {
                        if (this.f126519a != null) {
                            this.f126521c = defaultInstance.W7().j(this.f126519a, this.f126520b);
                            this.f126522d = this.f126519a;
                        } else {
                            this.f126521c = defaultInstance;
                            this.f126522d = u.f126379f;
                        }
                    } catch (t1 unused) {
                        this.f126521c = defaultInstance;
                        this.f126522d = u.f126379f;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            int i10 = 3 << 1;
            return true;
        }
        if (!(o10 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) o10;
        n2 n2Var = this.f126521c;
        n2 n2Var2 = y1Var.f126521c;
        if (n2Var == null && n2Var2 == null) {
            return n().equals(y1Var.n());
        }
        if (n2Var == null || n2Var2 == null) {
            return n2Var != null ? n2Var.equals(y1Var.g(n2Var.g1())) : g(n2Var2.g1()).equals(n2Var2);
        }
        return n2Var.equals(n2Var2);
    }

    public int f() {
        if (this.f126522d != null) {
            return this.f126522d.size();
        }
        u uVar = this.f126519a;
        if (uVar != null) {
            return uVar.size();
        }
        if (this.f126521c != null) {
            return this.f126521c.w1();
        }
        return 0;
    }

    public n2 g(n2 defaultInstance) {
        d(defaultInstance);
        return this.f126521c;
    }

    public void h(y1 other) {
        u uVar;
        if (other.c()) {
            return;
        }
        if (c()) {
            k(other);
            return;
        }
        if (this.f126520b == null) {
            this.f126520b = other.f126520b;
        }
        u uVar2 = this.f126519a;
        if (uVar2 != null && (uVar = other.f126519a) != null) {
            this.f126519a = uVar2.r(uVar);
            return;
        }
        if (this.f126521c == null && other.f126521c != null) {
            m(j(other.f126521c, this.f126519a, this.f126520b));
        } else if (this.f126521c == null || other.f126521c != null) {
            m(this.f126521c.r1().T9(other.f126521c).build());
        } else {
            m(j(this.f126521c, other.f126519a, other.f126520b));
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
        if (this.f126520b == null) {
            this.f126520b = extensionRegistry;
        }
        u uVar = this.f126519a;
        if (uVar != null) {
            l(uVar.r(input.y()), this.f126520b);
        } else {
            try {
                m(this.f126521c.r1().rl(input, extensionRegistry).build());
            } catch (t1 unused) {
            }
        }
    }

    public void k(y1 other) {
        this.f126519a = other.f126519a;
        this.f126521c = other.f126521c;
        this.f126522d = other.f126522d;
        v0 v0Var = other.f126520b;
        if (v0Var != null) {
            this.f126520b = v0Var;
        }
    }

    public void l(u bytes, v0 extensionRegistry) {
        a(extensionRegistry, bytes);
        this.f126519a = bytes;
        this.f126520b = extensionRegistry;
        this.f126521c = null;
        this.f126522d = null;
    }

    public n2 m(n2 value) {
        n2 n2Var = this.f126521c;
        this.f126519a = null;
        this.f126522d = null;
        this.f126521c = value;
        return n2Var;
    }

    public u n() {
        if (this.f126522d != null) {
            return this.f126522d;
        }
        u uVar = this.f126519a;
        if (uVar != null) {
            return uVar;
        }
        synchronized (this) {
            try {
                if (this.f126522d != null) {
                    return this.f126522d;
                }
                if (this.f126521c == null) {
                    this.f126522d = u.f126379f;
                } else {
                    this.f126522d = this.f126521c.u1();
                }
                return this.f126522d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o(z4 writer, int fieldNumber) throws IOException {
        if (this.f126522d != null) {
            writer.N(fieldNumber, this.f126522d);
            return;
        }
        u uVar = this.f126519a;
        if (uVar != null) {
            writer.N(fieldNumber, uVar);
        } else if (this.f126521c != null) {
            writer.E(fieldNumber, this.f126521c);
        } else {
            writer.N(fieldNumber, u.f126379f);
        }
    }

    public y1() {
    }
}
