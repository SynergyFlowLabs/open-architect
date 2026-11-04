package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLifecycleRegistry.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleRegistry.jvm.kt\nandroidx/lifecycle/LifecycleRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public class q0 extends c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f52466k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.arch.core.internal.a<n0, b> f52468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private c0.b f52469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final WeakReference<o0> f52470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private ArrayList<c0.b> f52474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<c0.b> f52475j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @androidx.annotation.l1
        @NotNull
        public final q0 a(@NotNull o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new q0(owner, false, null);
        }

        @oj.n
        @NotNull
        public final c0.b b(@NotNull c0.b state1, @Nullable c0.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private c0.b f52476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private j0 f52477b;

        public b(@Nullable n0 n0Var, @NotNull c0.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(n0Var);
            this.f52477b = v0.f(n0Var);
            this.f52476a = initialState;
        }

        public final void a(@Nullable o0 o0Var, @NotNull c0.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            c0.b bVarP = event.p();
            this.f52476a = q0.f52466k.b(this.f52476a, bVarP);
            j0 j0Var = this.f52477b;
            Intrinsics.checkNotNull(o0Var);
            j0Var.e(o0Var, event);
            this.f52476a = bVarP;
        }

        @NotNull
        public final j0 b() {
            return this.f52477b;
        }

        @NotNull
        public final c0.b c() {
            return this.f52476a;
        }

        public final void d(@NotNull j0 j0Var) {
            Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
            this.f52477b = j0Var;
        }

        public final void e(@NotNull c0.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f52476a = bVar;
        }
    }

    public /* synthetic */ q0(o0 o0Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, z10);
    }

    private final void i(o0 o0Var) {
        Iterator<Map.Entry<n0, b>> itDescendingIterator = this.f52468c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f52473h) {
            Map.Entry<n0, b> next = itDescendingIterator.next();
            Intrinsics.checkNotNull(next);
            n0 key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.f52469d) > 0 && !this.f52473h && this.f52468c.contains(key)) {
                c0.a aVarA = c0.a.Companion.a(value.c());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.c());
                }
                u(aVarA.p());
                value.a(o0Var, aVarA);
                t();
            }
        }
    }

    private final c0.b j(n0 n0Var) {
        b value;
        Map.Entry<n0, b> entryP = this.f52468c.p(n0Var);
        c0.b bVar = null;
        c0.b bVarC = (entryP == null || (value = entryP.getValue()) == null) ? null : value.c();
        if (!this.f52474i.isEmpty()) {
            ArrayList<c0.b> arrayList = this.f52474i;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f52466k;
        return aVar.b(aVar.b(this.f52469d, bVarC), bVar);
    }

    @oj.n
    @androidx.annotation.l1
    @NotNull
    public static final q0 k(@NotNull o0 o0Var) {
        return f52466k.a(o0Var);
    }

    private final void l(String str) {
        if (!this.f52467b || t0.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void m(o0 o0Var) {
        androidx.arch.core.internal.b<n0, b>.d dVarI = this.f52468c.i();
        Intrinsics.checkNotNullExpressionValue(dVarI, "iteratorWithAdditions(...)");
        while (dVarI.hasNext() && !this.f52473h) {
            Map.Entry next = dVarI.next();
            n0 n0Var = (n0) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f52469d) < 0 && !this.f52473h && this.f52468c.contains(n0Var)) {
                u(bVar.c());
                c0.a aVarC = c0.a.Companion.c(bVar.c());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
                bVar.a(o0Var, aVarC);
                t();
            }
        }
    }

    private final boolean p() {
        if (this.f52468c.size() == 0) {
            return true;
        }
        Map.Entry<n0, b> entryC = this.f52468c.c();
        Intrinsics.checkNotNull(entryC);
        c0.b bVarC = entryC.getValue().c();
        Map.Entry<n0, b> entryK = this.f52468c.k();
        Intrinsics.checkNotNull(entryK);
        c0.b bVarC2 = entryK.getValue().c();
        return bVarC == bVarC2 && this.f52469d == bVarC2;
    }

    @oj.n
    @NotNull
    public static final c0.b r(@NotNull c0.b bVar, @Nullable c0.b bVar2) {
        return f52466k.b(bVar, bVar2);
    }

    private final void s(c0.b bVar) {
        if (this.f52469d != bVar) {
            r0.a(this.f52470e.get(), this.f52469d, bVar);
            this.f52469d = bVar;
            if (this.f52472g || this.f52471f != 0) {
                this.f52473h = true;
                return;
            }
            this.f52472g = true;
            w();
            this.f52472g = false;
            if (this.f52469d == c0.b.DESTROYED) {
                this.f52468c = new androidx.arch.core.internal.a<>();
            }
        }
    }

    private final void t() {
        ArrayList<c0.b> arrayList = this.f52474i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void u(c0.b bVar) {
        this.f52474i.add(bVar);
    }

    private final void w() {
        o0 o0Var = this.f52470e.get();
        if (o0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!p()) {
            this.f52473h = false;
            c0.b bVar = this.f52469d;
            Map.Entry<n0, b> entryC = this.f52468c.c();
            Intrinsics.checkNotNull(entryC);
            if (bVar.compareTo(entryC.getValue().c()) < 0) {
                i(o0Var);
            }
            Map.Entry<n0, b> entryK = this.f52468c.k();
            if (!this.f52473h && entryK != null && this.f52469d.compareTo(entryK.getValue().c()) > 0) {
                m(o0Var);
            }
        }
        this.f52473h = false;
        this.f52475j.setValue(d());
    }

    @Override // androidx.lifecycle.c0
    @androidx.annotation.l0
    public void c(@NotNull n0 observer) {
        o0 o0Var;
        Intrinsics.checkNotNullParameter(observer, "observer");
        l("addObserver");
        c0.b bVar = this.f52469d;
        c0.b bVar2 = c0.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = c0.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f52468c.m(observer, bVar3) == null && (o0Var = this.f52470e.get()) != null) {
            boolean z10 = this.f52471f != 0 || this.f52472g;
            c0.b bVarJ = j(observer);
            this.f52471f++;
            while (bVar3.c().compareTo(bVarJ) < 0 && this.f52468c.contains(observer)) {
                u(bVar3.c());
                c0.a aVarC = c0.a.Companion.c(bVar3.c());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar3.c());
                }
                bVar3.a(o0Var, aVarC);
                t();
                bVarJ = j(observer);
            }
            if (!z10) {
                w();
            }
            this.f52471f--;
        }
    }

    @Override // androidx.lifecycle.c0
    @NotNull
    public c0.b d() {
        return this.f52469d;
    }

    @Override // androidx.lifecycle.c0
    @NotNull
    public kotlinx.coroutines.flow.z0<c0.b> e() {
        return kotlinx.coroutines.flow.k.n(this.f52475j);
    }

    @Override // androidx.lifecycle.c0
    @androidx.annotation.l0
    public void g(@NotNull n0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        l("removeObserver");
        this.f52468c.n(observer);
    }

    public int n() {
        l("getObserverCount");
        return this.f52468c.size();
    }

    public void o(@NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        l("handleLifecycleEvent");
        s(event.p());
    }

    @kotlin.l(message = "Override [currentState].")
    @androidx.annotation.l0
    public void q(@NotNull c0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        l("markState");
        v(state);
    }

    public void v(@NotNull c0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        l("setCurrentState");
        s(state);
    }

    private q0(o0 o0Var, boolean z10) {
        this.f52467b = z10;
        this.f52468c = new androidx.arch.core.internal.a<>();
        c0.b bVar = c0.b.INITIALIZED;
        this.f52469d = bVar;
        this.f52474i = new ArrayList<>();
        this.f52470e = new WeakReference<>(o0Var);
        this.f52475j = kotlinx.coroutines.flow.b1.a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull o0 provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
