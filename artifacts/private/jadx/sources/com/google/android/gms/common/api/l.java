package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.e3;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.o3;
import com.google.android.gms.common.api.internal.x3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106311a = "<<default account>>";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f106312b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f106313c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f106314d = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface b extends com.google.android.gms.common.api.internal.f {
        public static final int O1 = 1;
        public static final int P1 = 2;
    }

    @Deprecated
    public interface c extends com.google.android.gms.common.api.internal.r {
    }

    public static void k(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        Set<l> set = f106314d;
        synchronized (set) {
            try {
                String str2 = str + "  ";
                int i10 = 0;
                for (l lVar : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i10);
                    lVar.j(str2, fileDescriptor, printWriter, strArr);
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @g6.a
    public static Set<l> n() {
        Set<l> set = f106314d;
        synchronized (set) {
        }
        return set;
    }

    public abstract void A();

    public abstract void B(@NonNull b bVar);

    public abstract void C(@NonNull c cVar);

    @NonNull
    @g6.a
    public <L> com.google.android.gms.common.api.internal.o<L> D(@NonNull L l10) {
        throw new UnsupportedOperationException();
    }

    public abstract void E(@NonNull androidx.fragment.app.s sVar);

    public abstract void F(@NonNull b bVar);

    public abstract void G(@NonNull c cVar);

    public void H(e3 e3Var) {
        throw new UnsupportedOperationException();
    }

    public void I(e3 e3Var) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult d();

    @NonNull
    public abstract ConnectionResult e(long j10, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract p<Status> f();

    public abstract void g();

    public void h(int i10) {
        throw new UnsupportedOperationException();
    }

    public abstract void i();

    public abstract void j(@NonNull String str, @p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @p0 String[] strArr);

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b, R extends v, T extends com.google.android.gms.common.api.internal.e.a<R, A>> T l(@NonNull T t10) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @g6.a
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends v, A>> T m(@NonNull T t10) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @g6.a
    public <C extends com.google.android.gms.common.api.a.f> C o(@NonNull com.google.android.gms.common.api.a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult p(@NonNull com.google.android.gms.common.api.a<?> aVar);

    @NonNull
    @g6.a
    public Context q() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @g6.a
    public Looper r() {
        throw new UnsupportedOperationException();
    }

    @g6.a
    public boolean s(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean t(@NonNull com.google.android.gms.common.api.a<?> aVar);

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w(@NonNull b bVar);

    public abstract boolean x(@NonNull c cVar);

    @g6.a
    public boolean y(@NonNull com.google.android.gms.common.api.internal.x xVar) {
        throw new UnsupportedOperationException();
    }

    @g6.a
    public void z() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private Account f106315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f106316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f106317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f106318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f106319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f106320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f106321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f106322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Context f106323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Map f106324j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.android.gms.common.api.internal.l f106325k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f106326l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @p0
        private c f106327m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Looper f106328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private com.google.android.gms.common.f f106329o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private com.google.android.gms.common.api.a.AbstractC0967a f106330p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final ArrayList f106331q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ArrayList f106332r;

        public a(@NonNull Context context) {
            this.f106316b = new HashSet();
            this.f106317c = new HashSet();
            this.f106322h = new androidx.collection.a();
            this.f106324j = new androidx.collection.a();
            this.f106326l = -1;
            this.f106329o = com.google.android.gms.common.f.x();
            this.f106330p = com.google.android.gms.signin.e.f110927c;
            this.f106331q = new ArrayList();
            this.f106332r = new ArrayList();
            this.f106323i = context;
            this.f106328n = context.getMainLooper();
            this.f106320f = context.getPackageName();
            this.f106321g = context.getClass().getName();
        }

        private final void q(com.google.android.gms.common.api.a aVar, @p0 com.google.android.gms.common.api.a.d dVar, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((com.google.android.gms.common.api.a.e) com.google.android.gms.common.internal.w.s(aVar.c(), "Base client builder must not be null")).a(dVar));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f106322h.put(aVar, new com.google.android.gms.common.internal.k0(hashSet));
        }

        @NonNull
        public a a(@NonNull com.google.android.gms.common.api.a<? extends com.google.android.gms.common.api.a.d.e> aVar) {
            com.google.android.gms.common.internal.w.s(aVar, "Api must not be null");
            this.f106324j.put(aVar, null);
            List<Scope> listA = ((com.google.android.gms.common.api.a.e) com.google.android.gms.common.internal.w.s(aVar.c(), "Base client builder must not be null")).a(null);
            this.f106317c.addAll(listA);
            this.f106316b.addAll(listA);
            return this;
        }

        @NonNull
        public <O extends com.google.android.gms.common.api.a.d.c> a b(@NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10) {
            com.google.android.gms.common.internal.w.s(aVar, "Api must not be null");
            com.google.android.gms.common.internal.w.s(o10, "Null options are not permitted for this Api");
            this.f106324j.put(aVar, o10);
            List<Scope> listA = ((com.google.android.gms.common.api.a.e) com.google.android.gms.common.internal.w.s(aVar.c(), "Base client builder must not be null")).a(o10);
            this.f106317c.addAll(listA);
            this.f106316b.addAll(listA);
            return this;
        }

        @NonNull
        public <O extends com.google.android.gms.common.api.a.d.c> a c(@NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o10, @NonNull Scope... scopeArr) {
            com.google.android.gms.common.internal.w.s(aVar, "Api must not be null");
            com.google.android.gms.common.internal.w.s(o10, "Null options are not permitted for this Api");
            this.f106324j.put(aVar, o10);
            q(aVar, o10, scopeArr);
            return this;
        }

        @NonNull
        public <T extends com.google.android.gms.common.api.a.d.e> a d(@NonNull com.google.android.gms.common.api.a<? extends com.google.android.gms.common.api.a.d.e> aVar, @NonNull Scope... scopeArr) {
            com.google.android.gms.common.internal.w.s(aVar, "Api must not be null");
            this.f106324j.put(aVar, null);
            q(aVar, null, scopeArr);
            return this;
        }

        @NonNull
        public a e(@NonNull b bVar) {
            com.google.android.gms.common.internal.w.s(bVar, "Listener must not be null");
            this.f106331q.add(bVar);
            return this;
        }

        @NonNull
        public a f(@NonNull c cVar) {
            com.google.android.gms.common.internal.w.s(cVar, "Listener must not be null");
            this.f106332r.add(cVar);
            return this;
        }

        @NonNull
        public a g(@NonNull Scope scope) {
            com.google.android.gms.common.internal.w.s(scope, "Scope must not be null");
            this.f106316b.add(scope);
            return this;
        }

        @NonNull
        public l h() {
            com.google.android.gms.common.internal.w.b(!this.f106324j.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.common.internal.h hVarP = p();
            Map mapN = hVarP.n();
            androidx.collection.a aVar = new androidx.collection.a();
            androidx.collection.a aVar2 = new androidx.collection.a();
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.common.api.a aVar3 = null;
            boolean z10 = false;
            for (com.google.android.gms.common.api.a aVar4 : this.f106324j.keySet()) {
                Object obj = this.f106324j.get(aVar4);
                boolean z11 = mapN.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z11));
                x3 x3Var = new x3(aVar4, z11);
                arrayList.add(x3Var);
                com.google.android.gms.common.api.a.AbstractC0967a abstractC0967a = (com.google.android.gms.common.api.a.AbstractC0967a) com.google.android.gms.common.internal.w.r(aVar4.a());
                com.google.android.gms.common.api.a.f fVarC = abstractC0967a.c(this.f106323i, this.f106328n, hVarP, obj, x3Var, x3Var);
                aVar2.put(aVar4.b(), fVarC);
                if (abstractC0967a.b() == 1) {
                    z10 = obj != null;
                }
                if (fVarC.b()) {
                    if (aVar3 != null) {
                        throw new IllegalStateException(aVar4.d() + " cannot be used with " + aVar3.d());
                    }
                    aVar3 = aVar4;
                }
            }
            if (aVar3 != null) {
                if (z10) {
                    throw new IllegalStateException("With using " + aVar3.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                com.google.android.gms.common.internal.w.z(this.f106315a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                com.google.android.gms.common.internal.w.z(this.f106316b.equals(this.f106317c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
            }
            i1 i1Var = new i1(this.f106323i, new ReentrantLock(), this.f106328n, hVarP, this.f106329o, this.f106330p, aVar, this.f106331q, this.f106332r, aVar2, this.f106326l, i1.K(aVar2.values(), true), arrayList);
            synchronized (l.f106314d) {
                l.f106314d.add(i1Var);
            }
            if (this.f106326l >= 0) {
                o3.u(this.f106325k).v(this.f106326l, i1Var, this.f106327m);
            }
            return i1Var;
        }

        @NonNull
        public a i(@NonNull androidx.fragment.app.s sVar, int i10, @p0 c cVar) {
            com.google.android.gms.common.api.internal.l lVar = new com.google.android.gms.common.api.internal.l((Activity) sVar);
            com.google.android.gms.common.internal.w.b(i10 >= 0, "clientId must be non-negative");
            this.f106326l = i10;
            this.f106327m = cVar;
            this.f106325k = lVar;
            return this;
        }

        @NonNull
        public a j(@NonNull androidx.fragment.app.s sVar, @p0 c cVar) {
            i(sVar, 0, cVar);
            return this;
        }

        @NonNull
        public a k(@NonNull String str) {
            this.f106315a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        @NonNull
        public a l(int i10) {
            this.f106318d = i10;
            return this;
        }

        @NonNull
        public a m(@NonNull Handler handler) {
            com.google.android.gms.common.internal.w.s(handler, "Handler must not be null");
            this.f106328n = handler.getLooper();
            return this;
        }

        @NonNull
        public a n(@NonNull View view) {
            com.google.android.gms.common.internal.w.s(view, "View must not be null");
            this.f106319e = view;
            return this;
        }

        @NonNull
        public a o() {
            k("<<default account>>");
            return this;
        }

        @NonNull
        public final com.google.android.gms.common.internal.h p() {
            com.google.android.gms.signin.a aVar = com.google.android.gms.signin.a.f110915j;
            Map map = this.f106324j;
            com.google.android.gms.common.api.a aVar2 = com.google.android.gms.signin.e.f110931g;
            if (map.containsKey(aVar2)) {
                aVar = (com.google.android.gms.signin.a) this.f106324j.get(aVar2);
            }
            return new com.google.android.gms.common.internal.h(this.f106315a, this.f106316b, this.f106322h, this.f106318d, this.f106319e, this.f106320f, this.f106321g, aVar, false);
        }

        public a(@NonNull Context context, @NonNull b bVar, @NonNull c cVar) {
            this(context);
            com.google.android.gms.common.internal.w.s(bVar, "Must provide a connected listener");
            this.f106331q.add(bVar);
            com.google.android.gms.common.internal.w.s(cVar, "Must provide a connection failed listener");
            this.f106332r.add(cVar);
        }
    }
}
