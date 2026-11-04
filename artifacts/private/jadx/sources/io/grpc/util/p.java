package io.grpc.util;

import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.m2;
import io.grpc.a3;
import io.grpc.e0;
import io.grpc.internal.t2;
import io.grpc.k0;
import io.grpc.k2;
import io.grpc.l0;
import io.grpc.o2;
import io.grpc.v1;
import io.grpc.y2;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/2189")
public final class p implements o2 {

    /* JADX INFO: Add missing generic type declarations: [ReqT] */
    class a<ReqT> extends l0.a<ReqT> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2 f291144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k2.a aVar, k2 k2Var) {
            super(aVar);
            this.f291144b = k2Var;
        }

        private void g(a3 a3Var) {
            v1 v1VarB = a3Var.b();
            if (v1VarB == null) {
                v1VarB = new v1();
            }
            this.f291144b.a(a3Var.a(), v1VarB);
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void a() {
            try {
                super.a();
            } catch (a3 e10) {
                g(e10);
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void b() {
            try {
                super.b();
            } catch (a3 e10) {
                g(e10);
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void c() {
            try {
                super.c();
            } catch (a3 e10) {
                g(e10);
            }
        }

        @Override // io.grpc.l0, io.grpc.k2.a
        public void d(ReqT reqt) {
            try {
                super.d(reqt);
            } catch (a3 e10) {
                g(e10);
            }
        }

        @Override // io.grpc.l0.a, io.grpc.l0, io.grpc.d2, io.grpc.k2.a
        public void e() {
            try {
                super.e();
            } catch (a3 e10) {
                g(e10);
            }
        }
    }

    private static class b<ReqT, RespT> extends k0.a<ReqT, RespT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f291146d = "Encountered error during serialized access";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t2 f291147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f291148c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m2 f291149a;

            a(m2 m2Var) {
                this.f291149a = m2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f291149a.B(b.super.c());
            }
        }

        /* JADX INFO: renamed from: io.grpc.util.p$b$b, reason: collision with other inner class name */
        class RunnableC1994b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f291151a;

            RunnableC1994b(Object obj) {
                this.f291151a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.super.j(this.f291151a);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f291153a;

            c(int i10) {
                this.f291153a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.super.h(this.f291153a);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v1 f291155a;

            d(v1 v1Var) {
                this.f291155a = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.super.i(this.f291155a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y2 f291157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1 f291158b;

            e(y2 y2Var, v1 v1Var) {
                this.f291157a = y2Var;
                this.f291158b = v1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f291148c) {
                    return;
                }
                b.this.f291148c = true;
                b.super.a(this.f291157a, this.f291158b);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m2 f291160a;

            f(m2 m2Var) {
                this.f291160a = m2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f291160a.B(Boolean.valueOf(b.super.g()));
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m2 f291162a;

            g(m2 m2Var) {
                this.f291162a = m2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f291162a.B(Boolean.valueOf(b.super.f()));
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f291164a;

            h(boolean z10) {
                this.f291164a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.super.l(this.f291164a);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f291166a;

            i(String str) {
                this.f291166a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.super.k(this.f291166a);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m2 f291168a;

            j(m2 m2Var) {
                this.f291168a = m2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f291168a.B(b.super.b());
            }
        }

        b(k2<ReqT, RespT> k2Var) {
            super(k2Var);
            this.f291147b = new t2(a2.c());
            this.f291148c = false;
        }

        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public void a(y2 y2Var, v1 v1Var) {
            this.f291147b.execute(new e(y2Var, v1Var));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public io.grpc.a b() {
            m2 m2VarF = m2.F();
            this.f291147b.execute(new j(m2VarF));
            try {
                return (io.grpc.a) m2VarF.get();
            } catch (InterruptedException e10) {
                throw new RuntimeException(f291146d, e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException(f291146d, e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        @fj.h
        public String c() {
            m2 m2VarF = m2.F();
            this.f291147b.execute(new a(m2VarF));
            try {
                return (String) m2VarF.get();
            } catch (InterruptedException e10) {
                throw new RuntimeException(f291146d, e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException(f291146d, e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public boolean f() {
            m2 m2VarF = m2.F();
            this.f291147b.execute(new g(m2VarF));
            try {
                return ((Boolean) m2VarF.get()).booleanValue();
            } catch (InterruptedException e10) {
                throw new RuntimeException(f291146d, e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException(f291146d, e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public boolean g() {
            m2 m2VarF = m2.F();
            this.f291147b.execute(new f(m2VarF));
            try {
                return ((Boolean) m2VarF.get()).booleanValue();
            } catch (InterruptedException e10) {
                throw new RuntimeException(f291146d, e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException(f291146d, e11);
            }
        }

        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public void h(int i10) {
            this.f291147b.execute(new c(i10));
        }

        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public void i(v1 v1Var) {
            this.f291147b.execute(new d(v1Var));
        }

        @Override // io.grpc.k0, io.grpc.k2
        public void j(RespT respt) {
            this.f291147b.execute(new RunnableC1994b(respt));
        }

        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public void k(String str) {
            this.f291147b.execute(new i(str));
        }

        @Override // io.grpc.k0.a, io.grpc.k0, io.grpc.c2, io.grpc.k2
        public void l(boolean z10) {
            this.f291147b.execute(new h(z10));
        }
    }

    private p() {
    }

    public static o2 b() {
        return new p();
    }

    @Override // io.grpc.o2
    public <ReqT, RespT> k2.a<ReqT> a(k2<ReqT, RespT> k2Var, v1 v1Var, io.grpc.m2<ReqT, RespT> m2Var) {
        b bVar = new b(k2Var);
        return new a(m2Var.a(bVar, v1Var), bVar);
    }
}
