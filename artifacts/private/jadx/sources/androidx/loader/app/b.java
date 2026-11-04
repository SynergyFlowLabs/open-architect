package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.collection.j3;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52609c = "LoaderManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f52610d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final o0 f52611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final c f52612b;

    public static class a<D> extends c1<D> implements androidx.loader.content.c.InterfaceC0487c<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f52613m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @p0
        private final Bundle f52614n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.c<D> f52615o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private o0 f52616p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private C0485b<D> f52617q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private androidx.loader.content.c<D> f52618r;

        a(int i10, @p0 Bundle bundle, @NonNull androidx.loader.content.c<D> cVar, @p0 androidx.loader.content.c<D> cVar2) {
            this.f52613m = i10;
            this.f52614n = bundle;
            this.f52615o = cVar;
            this.f52618r = cVar2;
            cVar.u(i10, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0487c
        public void a(@NonNull androidx.loader.content.c<D> cVar, @p0 D d10) {
            if (b.f52610d) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d10);
            } else {
                boolean z10 = b.f52610d;
                o(d10);
            }
        }

        @Override // androidx.lifecycle.w0
        protected void m() {
            if (b.f52610d) {
                toString();
            }
            this.f52615o.y();
        }

        @Override // androidx.lifecycle.w0
        protected void n() {
            if (b.f52610d) {
                toString();
            }
            this.f52615o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.w0
        public void p(@NonNull d1<? super D> d1Var) {
            super.p(d1Var);
            this.f52616p = null;
            this.f52617q = null;
        }

        @Override // androidx.lifecycle.c1, androidx.lifecycle.w0
        public void r(D d10) {
            super.r(d10);
            androidx.loader.content.c<D> cVar = this.f52618r;
            if (cVar != null) {
                cVar.w();
                this.f52618r = null;
            }
        }

        @l0
        androidx.loader.content.c<D> s(boolean z10) {
            if (b.f52610d) {
                toString();
            }
            this.f52615o.b();
            this.f52615o.a();
            C0485b<D> c0485b = this.f52617q;
            if (c0485b != null) {
                p(c0485b);
                if (z10) {
                    c0485b.d();
                }
            }
            this.f52615o.B(this);
            if ((c0485b == null || c0485b.b()) && !z10) {
                return this.f52615o;
            }
            this.f52615o.w();
            return this.f52618r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f52613m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f52614n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f52615o);
            this.f52615o.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f52617q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f52617q);
                this.f52617q.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f52613m);
            sb2.append(" : ");
            Class<?> cls = this.f52615o.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }

        @NonNull
        androidx.loader.content.c<D> u() {
            return this.f52615o;
        }

        boolean v() {
            C0485b<D> c0485b;
            if (!h() || (c0485b = this.f52617q) == null || c0485b.b()) {
                return false;
            }
            int i10 = 4 ^ 1;
            return true;
        }

        void w() {
            o0 o0Var = this.f52616p;
            C0485b<D> c0485b = this.f52617q;
            if (o0Var != null && c0485b != null) {
                super.p(c0485b);
                k(o0Var, c0485b);
            }
        }

        @NonNull
        @l0
        androidx.loader.content.c<D> x(@NonNull o0 o0Var, @NonNull androidx.loader.app.a.InterfaceC0484a<D> interfaceC0484a) {
            C0485b<D> c0485b = new C0485b<>(this.f52615o, interfaceC0484a);
            k(o0Var, c0485b);
            C0485b<D> c0485b2 = this.f52617q;
            if (c0485b2 != null) {
                p(c0485b2);
            }
            this.f52616p = o0Var;
            this.f52617q = c0485b;
            return this.f52615o;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0485b<D> implements d1<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.c<D> f52619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final androidx.loader.app.a.InterfaceC0484a<D> f52620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f52621c = false;

        C0485b(@NonNull androidx.loader.content.c<D> cVar, @NonNull androidx.loader.app.a.InterfaceC0484a<D> interfaceC0484a) {
            this.f52619a = cVar;
            this.f52620b = interfaceC0484a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f52621c);
        }

        boolean b() {
            return this.f52621c;
        }

        @Override // androidx.lifecycle.d1
        public void c(@p0 D d10) {
            if (b.f52610d) {
                Objects.toString(this.f52619a);
                this.f52619a.d(d10);
            }
            this.f52621c = true;
            this.f52620b.b(this.f52619a, d10);
        }

        @l0
        void d() {
            if (this.f52621c) {
                if (b.f52610d) {
                    Objects.toString(this.f52619a);
                }
                this.f52620b.c(this.f52619a);
            }
        }

        @NonNull
        public String toString() {
            return this.f52620b.toString();
        }
    }

    static class c extends f2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final j2.c f52622c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j3<a> f52623a = new j3<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52624b = false;

        static class a implements j2.c {
            a() {
            }

            @Override // androidx.lifecycle.j2.c
            @NonNull
            public <T extends f2> T create(@NonNull Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @NonNull
        static c W(l2 l2Var) {
            return (c) new j2(l2Var, f52622c).c(c.class);
        }

        public void U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f52623a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f52623a.size(); i10++) {
                    a aVarZ = this.f52623a.z(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f52623a.n(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarZ.toString());
                    aVarZ.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void V() {
            this.f52624b = false;
        }

        <D> a<D> X(int i10) {
            return this.f52623a.g(i10);
        }

        boolean Y() {
            int size = this.f52623a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f52623a.z(i10).v()) {
                    return true;
                }
            }
            return false;
        }

        boolean Z() {
            return this.f52624b;
        }

        void a0() {
            int size = this.f52623a.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f52623a.z(i10).w();
            }
        }

        void b0(int i10, @NonNull a aVar) {
            this.f52623a.o(i10, aVar);
        }

        void c0(int i10) {
            this.f52623a.r(i10);
        }

        void d0() {
            this.f52624b = true;
        }

        @Override // androidx.lifecycle.f2
        protected void onCleared() {
            super.onCleared();
            int size = this.f52623a.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f52623a.z(i10).s(true);
            }
            this.f52623a.b();
        }
    }

    b(@NonNull o0 o0Var, @NonNull l2 l2Var) {
        this.f52611a = o0Var;
        this.f52612b = c.W(l2Var);
    }

    @NonNull
    @l0
    private <D> androidx.loader.content.c<D> j(int i10, @p0 Bundle bundle, @NonNull androidx.loader.app.a.InterfaceC0484a<D> interfaceC0484a, @p0 androidx.loader.content.c<D> cVar) {
        try {
            this.f52612b.d0();
            androidx.loader.content.c<D> cVarA = interfaceC0484a.a(i10, bundle);
            if (cVarA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarA.getClass().isMemberClass() && !Modifier.isStatic(cVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarA);
            }
            a aVar = new a(i10, bundle, cVarA, cVar);
            if (f52610d) {
                aVar.toString();
            }
            this.f52612b.b0(i10, aVar);
            this.f52612b.V();
            return aVar.x(this.f52611a, interfaceC0484a);
        } catch (Throwable th2) {
            this.f52612b.V();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    @l0
    public void a(int i10) {
        if (this.f52612b.Z()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f52610d) {
            toString();
        }
        a aVarX = this.f52612b.X(i10);
        if (aVarX != null) {
            aVarX.s(true);
            this.f52612b.c0(i10);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f52612b.U(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    @p0
    public <D> androidx.loader.content.c<D> e(int i10) {
        if (this.f52612b.Z()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> aVarX = this.f52612b.X(i10);
        if (aVarX != null) {
            return aVarX.u();
        }
        return null;
    }

    @Override // androidx.loader.app.a
    public boolean f() {
        return this.f52612b.Y();
    }

    @Override // androidx.loader.app.a
    @NonNull
    @l0
    public <D> androidx.loader.content.c<D> g(int i10, @p0 Bundle bundle, @NonNull androidx.loader.app.a.InterfaceC0484a<D> interfaceC0484a) {
        if (this.f52612b.Z()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarX = this.f52612b.X(i10);
        if (f52610d) {
            toString();
            Objects.toString(bundle);
        }
        if (aVarX == null) {
            return j(i10, bundle, interfaceC0484a, null);
        }
        if (f52610d) {
            aVarX.toString();
        }
        return aVarX.x(this.f52611a, interfaceC0484a);
    }

    @Override // androidx.loader.app.a
    public void h() {
        this.f52612b.a0();
    }

    @Override // androidx.loader.app.a
    @NonNull
    @l0
    public <D> androidx.loader.content.c<D> i(int i10, @p0 Bundle bundle, @NonNull androidx.loader.app.a.InterfaceC0484a<D> interfaceC0484a) {
        if (this.f52612b.Z()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f52610d) {
            toString();
            Objects.toString(bundle);
        }
        a<D> aVarX = this.f52612b.X(i10);
        return j(i10, bundle, interfaceC0484a, aVarX != null ? aVarX.s(false) : null);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f52611a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
