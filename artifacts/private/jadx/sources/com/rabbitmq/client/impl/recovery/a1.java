package com.rabbitmq.client.impl.recovery;

import com.rabbitmq.client.l1;
import java.io.IOException;
import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BiPredicate<u, Exception> f265675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q.a<Void> f265676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q.a<Void> f265677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q.a<Void> f265678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q.a<Void> f265679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q.a<Void> f265680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q.a<String> f265681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0 f265682h;

    static {
        BiPredicate<u, Exception> biPredicate = new BiPredicate() { // from class: com.rabbitmq.client.impl.recovery.t0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return a1.a((u) obj, (Exception) obj2);
            }
        };
        f265675a = biPredicate;
        q.a<Void> aVar = new q.a() { // from class: com.rabbitmq.client.impl.recovery.u0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return a1.c(f0Var);
            }
        };
        f265676b = aVar;
        q.a aVar2 = new q.a() { // from class: com.rabbitmq.client.impl.recovery.v0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return a1.f(f0Var);
            }
        };
        f265677c = aVar2;
        q.a<Void> aVar3 = new q.a() { // from class: com.rabbitmq.client.impl.recovery.w0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return a1.g(f0Var);
            }
        };
        f265678d = aVar3;
        q.a<Void> aVar4 = new q.a() { // from class: com.rabbitmq.client.impl.recovery.x0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return a1.e(f0Var);
            }
        };
        f265679e = aVar4;
        q.a<Void> aVar5 = new q.a() { // from class: com.rabbitmq.client.impl.recovery.y0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return a1.b(f0Var);
            }
        };
        f265680f = aVar5;
        q.a aVar6 = new q.a() { // from class: com.rabbitmq.client.impl.recovery.z0
            @Override // com.rabbitmq.client.impl.recovery.q.a
            public final Object c(f0 f0Var) {
                return f0Var.c().j();
            }
        };
        f265681g = aVar6;
        f265682h = s0.n().k(biPredicate).o(biPredicate).l(aVar.b(aVar2).b(aVar3)).p(aVar.b(aVar4.b(aVar6).b(aVar5)));
    }

    public static /* synthetic */ boolean a(u uVar, Exception exc) {
        if (!(exc.getCause() instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) exc.getCause();
        return (l1Var.b() instanceof com.rabbitmq.client.a.d.InterfaceC1778a) && ((com.rabbitmq.client.a.d.InterfaceC1778a) l1Var.b()).n() == 404;
    }

    public static /* synthetic */ Void b(f0 f0Var) throws IOException {
        if (!(f0Var.d() instanceof t)) {
            return null;
        }
        String strI = f0Var.c().i();
        for (s sVar : com.rabbitmq.utility.e.a(f0Var.b().r0())) {
            if ((sVar instanceof z) && strI.equals(sVar.f())) {
                sVar.i();
            }
        }
        return null;
    }

    public static /* synthetic */ Void c(f0 f0Var) throws IOException {
        if (!f0Var.d().a().isOpen()) {
            f0Var.b().u1(f0Var.d().a());
        }
        return null;
    }

    public static /* synthetic */ Void e(f0 f0Var) {
        if (!(f0Var.d() instanceof t)) {
            return null;
        }
        t tVarC = f0Var.c();
        m mVarB = f0Var.b();
        y yVar = mVarB.x0().get(tVarC.i());
        if (yVar == null) {
            return null;
        }
        mVarB.T1(yVar.c(), yVar, false);
        return null;
    }

    public static /* synthetic */ Void f(f0 f0Var) {
        if (!(f0Var.d() instanceof z)) {
            return null;
        }
        s sVarA = f0Var.a();
        m mVarB = f0Var.b();
        y yVar = mVarB.x0().get(sVarA.f());
        if (yVar == null) {
            return null;
        }
        mVarB.T1(yVar.c(), yVar, false);
        return null;
    }

    public static /* synthetic */ Void g(f0 f0Var) throws IOException {
        f0Var.a().i();
        return null;
    }
}
