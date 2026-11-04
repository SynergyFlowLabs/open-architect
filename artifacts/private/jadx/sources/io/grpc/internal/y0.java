package io.grpc.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y0 extends io.grpc.internal.a.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final io.grpc.f1.a<Integer> f290139x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final io.grpc.v1.i<Integer> f290140y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private io.grpc.y2 f290141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.grpc.v1 f290142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Charset f290143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f290144w;

    class a implements io.grpc.f1.a<Integer> {
        a() {
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] + org.msgpack.core.h.a.f339285u) * 100) + ((bArr[1] + org.msgpack.core.h.a.f339285u) * 10) + bArr[2] + org.msgpack.core.h.a.f339285u);
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, io.grpc.f1.f288770a));
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f290139x = aVar;
        f290140y = io.grpc.f1.b(okhttp3.internal.http2.c.f334266f, aVar);
    }

    protected y0(int i10, i3 i3Var, q3 q3Var) {
        super(i10, i3Var, q3Var);
        this.f290143v = com.google.common.base.f.f116532c;
    }

    private static Charset W(io.grpc.v1 v1Var) {
        String str = (String) v1Var.l(v0.f289905j);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return com.google.common.base.f.f116532c;
    }

    private io.grpc.y2 Y(io.grpc.v1 v1Var) {
        io.grpc.y2 y2Var = (io.grpc.y2) v1Var.l(io.grpc.l1.f290163b);
        if (y2Var != null) {
            return y2Var.u((String) v1Var.l(io.grpc.l1.f290162a));
        }
        if (this.f290144w) {
            return io.grpc.y2.f291452g.u("missing GRPC status in response");
        }
        Integer num = (Integer) v1Var.l(f290140y);
        return (num != null ? v0.p(num.intValue()) : io.grpc.y2.f291464s.u("missing HTTP status code")).g("missing GRPC status, inferred error from HTTP status code");
    }

    private static void Z(io.grpc.v1 v1Var) {
        v1Var.j(f290140y);
        v1Var.j(io.grpc.l1.f290163b);
        v1Var.j(io.grpc.l1.f290162a);
    }

    @fj.h
    private io.grpc.y2 d0(io.grpc.v1 v1Var) {
        Integer num = (Integer) v1Var.l(f290140y);
        if (num == null) {
            return io.grpc.y2.f291464s.u("Missing HTTP status code");
        }
        String str = (String) v1Var.l(v0.f289905j);
        if (v0.q(str)) {
            return null;
        }
        return v0.p(num.intValue()).g("invalid content-type: " + str);
    }

    protected abstract void X(io.grpc.y2 y2Var, boolean z10, io.grpc.v1 v1Var);

    protected void a0(i2 i2Var, boolean z10) throws Throwable {
        io.grpc.y2 y2Var = this.f290141t;
        if (y2Var != null) {
            this.f290141t = y2Var.g("DATA-----------------------------\n" + j2.e(i2Var, this.f290143v));
            i2Var.close();
            if (this.f290141t.q().length() > 1000 || z10) {
                X(this.f290141t, false, this.f290142u);
                return;
            }
            return;
        }
        if (!this.f290144w) {
            X(io.grpc.y2.f291464s.u("headers not received before payload"), false, new io.grpc.v1());
            return;
        }
        int iQ0 = i2Var.q0();
        L(i2Var);
        if (z10) {
            if (iQ0 > 0) {
                this.f290141t = io.grpc.y2.f291464s.u("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f290141t = io.grpc.y2.f291464s.u("Received unexpected EOS on empty DATA frame from server");
            }
            io.grpc.v1 v1Var = new io.grpc.v1();
            this.f290142u = v1Var;
            V(this.f290141t, false, v1Var);
        }
    }

    protected void b0(io.grpc.v1 v1Var) {
        com.google.common.base.j0.F(v1Var, "headers");
        io.grpc.y2 y2Var = this.f290141t;
        if (y2Var != null) {
            this.f290141t = y2Var.g("headers: " + v1Var);
            return;
        }
        try {
            if (this.f290144w) {
                io.grpc.y2 y2VarU = io.grpc.y2.f291464s.u("Received headers twice");
                this.f290141t = y2VarU;
                if (y2VarU != null) {
                    this.f290141t = y2VarU.g("headers: " + v1Var);
                    this.f290142u = v1Var;
                    this.f290143v = W(v1Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) v1Var.l(f290140y);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                io.grpc.y2 y2Var2 = this.f290141t;
                if (y2Var2 != null) {
                    this.f290141t = y2Var2.g("headers: " + v1Var);
                    this.f290142u = v1Var;
                    this.f290143v = W(v1Var);
                    return;
                }
                return;
            }
            this.f290144w = true;
            io.grpc.y2 y2VarD0 = d0(v1Var);
            this.f290141t = y2VarD0;
            if (y2VarD0 != null) {
                if (y2VarD0 != null) {
                    this.f290141t = y2VarD0.g("headers: " + v1Var);
                    this.f290142u = v1Var;
                    this.f290143v = W(v1Var);
                    return;
                }
                return;
            }
            Z(v1Var);
            M(v1Var);
            io.grpc.y2 y2Var3 = this.f290141t;
            if (y2Var3 != null) {
                this.f290141t = y2Var3.g("headers: " + v1Var);
                this.f290142u = v1Var;
                this.f290143v = W(v1Var);
            }
        } catch (Throwable th2) {
            io.grpc.y2 y2Var4 = this.f290141t;
            if (y2Var4 != null) {
                this.f290141t = y2Var4.g("headers: " + v1Var);
                this.f290142u = v1Var;
                this.f290143v = W(v1Var);
            }
            throw th2;
        }
    }

    protected void c0(io.grpc.v1 v1Var) {
        com.google.common.base.j0.F(v1Var, v0.f289912q);
        if (this.f290141t == null && !this.f290144w) {
            io.grpc.y2 y2VarD0 = d0(v1Var);
            this.f290141t = y2VarD0;
            if (y2VarD0 != null) {
                this.f290142u = v1Var;
            }
        }
        io.grpc.y2 y2Var = this.f290141t;
        if (y2Var == null) {
            io.grpc.y2 y2VarY = Y(v1Var);
            Z(v1Var);
            N(v1Var, y2VarY);
        } else {
            io.grpc.y2 y2VarG = y2Var.g("trailers: " + v1Var);
            this.f290141t = y2VarG;
            X(y2VarG, false, this.f290142u);
        }
    }

    @Override // io.grpc.internal.a.c, io.grpc.internal.t1.b
    public /* bridge */ /* synthetic */ void d(boolean z10) {
        super.d(z10);
    }
}
