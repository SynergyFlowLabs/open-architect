package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,856:1\n196#1,3:862\n196#1,3:865\n1#2:857\n154#3,2:858\n154#3,2:860\n154#3,2:868\n154#3,2:870\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n*L\n266#1:862,3\n300#1:865,3\n205#1:858,2\n217#1:860,2\n660#1:868,2\n678#1:870,2\n*E\n"})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f296656a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f296657b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296658c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "removedRef");

    @NotNull
    volatile /* synthetic */ Object _next = this;

    @NotNull
    volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object removedRef = null;

    public static abstract class a extends io.ktor.util.internal.a {

        /* JADX INFO: renamed from: io.ktor.util.internal.f$a$a, reason: collision with other inner class name */
        private static final class C2090a extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oj.f
            @NotNull
            public final f f296659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oj.f
            @NotNull
            public final io.ktor.util.internal.b<f> f296660b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @oj.f
            @NotNull
            public final a f296661c;

            /* JADX WARN: Multi-variable type inference failed */
            public C2090a(@NotNull f next, @NotNull io.ktor.util.internal.b<? super f> op, @NotNull a desc) {
                Intrinsics.checkNotNullParameter(next, "next");
                Intrinsics.checkNotNullParameter(op, "op");
                Intrinsics.checkNotNullParameter(desc, "desc");
                this.f296659a = next;
                this.f296660b = op;
                this.f296661c = desc;
            }

            @Override // io.ktor.util.internal.g
            @Nullable
            public Object a(@Nullable Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                f fVar = (f) obj;
                Object objG = this.f296661c.g(fVar, this.f296659a);
                if (objG == null) {
                    androidx.concurrent.futures.b.a(f.f296656a, fVar, this, this.f296660b.d() ? this.f296659a : this.f296660b);
                    return null;
                }
                if (objG == io.ktor.util.internal.e.f296654g) {
                    if (androidx.concurrent.futures.b.a(f.f296656a, fVar, this, this.f296659a.G())) {
                        fVar.x();
                    }
                    return objG;
                }
                this.f296660b.f(objG);
                androidx.concurrent.futures.b.a(f.f296656a, fVar, this, this.f296659a);
                return objG;
            }
        }

        @Override // io.ktor.util.internal.a
        public final void a(@NotNull io.ktor.util.internal.b<?> op, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(op, "op");
            boolean z10 = obj == null;
            f fVarE = e();
            if (fVarE == null) {
                if (z10) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            f fVarF = f();
            if (fVarF == null) {
                if (z10) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                if (androidx.concurrent.futures.b.a(f.f296656a, fVarE, op, z10 ? j(fVarE, fVarF) : fVarF) && z10) {
                    d(fVarE, fVarF);
                }
            }
        }

        @Override // io.ktor.util.internal.a
        @Nullable
        public final Object b(@NotNull io.ktor.util.internal.b<?> op) {
            Object objA;
            Intrinsics.checkNotNullParameter(op, "op");
            while (true) {
                f fVarI = i(op);
                Object obj = fVarI._next;
                if (obj == op || op.d()) {
                    return null;
                }
                if (obj instanceof g) {
                    ((g) obj).a(fVarI);
                } else {
                    Object objC = c(fVarI, obj);
                    if (objC != null) {
                        return objC;
                    }
                    if (h(fVarI, obj)) {
                        continue;
                    } else {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        C2090a c2090a = new C2090a((f) obj, op, this);
                        if (androidx.concurrent.futures.b.a(f.f296656a, fVarI, obj, c2090a) && (objA = c2090a.a(fVarI)) != io.ktor.util.internal.e.f296654g) {
                            return objA;
                        }
                    }
                }
            }
        }

        @Nullable
        protected Object c(@NotNull f affected, @NotNull Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            boolean z10 = true | false;
            return null;
        }

        protected abstract void d(@NotNull f fVar, @NotNull f fVar2);

        @Nullable
        protected abstract f e();

        @Nullable
        protected abstract f f();

        @Nullable
        protected abstract Object g(@NotNull f fVar, @NotNull f fVar2);

        protected boolean h(@NotNull f affected, @NotNull Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            return false;
        }

        @NotNull
        protected f i(@NotNull g op) {
            Intrinsics.checkNotNullParameter(op, "op");
            f fVarE = e();
            Intrinsics.checkNotNull(fVarE);
            return fVarE;
        }

        @NotNull
        protected abstract Object j(@NotNull f fVar, @NotNull f fVar2);
    }

    public static class b<T extends f> extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f296662c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final f f296663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final T f296664b;

        public b(@NotNull f queue, @NotNull T node) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(node, "node");
            this.f296663a = queue;
            this.f296664b = node;
            if (node._next != node || node._prev != node) {
                throw new IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.f.a
        protected void d(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            this.f296664b.q(this.f296663a);
        }

        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected final f e() {
            return (f) this._affectedNode;
        }

        @Override // io.ktor.util.internal.f.a
        @NotNull
        protected final f f() {
            return this.f296663a;
        }

        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected Object g(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            androidx.concurrent.futures.b.a(f296662c, this, null, affected);
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        protected boolean h(@NotNull f affected, @NotNull Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            return next != this.f296663a;
        }

        @Override // io.ktor.util.internal.f.a
        @NotNull
        protected final f i(@NotNull g op) {
            f fVar;
            Intrinsics.checkNotNullParameter(op, "op");
            while (true) {
                Object obj = this.f296663a._prev;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                fVar = (f) obj;
                Object obj2 = fVar._next;
                f fVar2 = this.f296663a;
                if (obj2 == fVar2 || obj2 == op) {
                    break;
                }
                if (obj2 instanceof g) {
                    ((g) obj2).a(fVar);
                } else {
                    f fVarL = fVar2.l(fVar, op);
                    if (fVarL != null) {
                        return fVarL;
                    }
                }
            }
            return fVar;
        }

        @Override // io.ktor.util.internal.f.a
        @NotNull
        protected Object j(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            T t10 = this.f296664b;
            androidx.concurrent.futures.b.a(f.f296657b, t10, t10, affected);
            T t11 = this.f296664b;
            androidx.concurrent.futures.b.a(f.f296656a, t11, t11, this.f296663a);
            return this.f296664b;
        }
    }

    @a1
    public static abstract class c extends io.ktor.util.internal.b<f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final f f296665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @Nullable
        public f f296666c;

        public c(@NotNull f newNode) {
            Intrinsics.checkNotNullParameter(newNode, "newNode");
            this.f296665b = newNode;
        }

        @Override // io.ktor.util.internal.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull f affected, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            boolean z10 = obj == null;
            f fVar = z10 ? this.f296665b : this.f296666c;
            if (fVar != null && androidx.concurrent.futures.b.a(f.f296656a, affected, this, fVar) && z10) {
                f fVar2 = this.f296665b;
                f fVar3 = this.f296666c;
                Intrinsics.checkNotNull(fVar3);
                fVar2.q(fVar3);
            }
        }
    }

    public static class d<T> extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f296667b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f296668c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode;

        @NotNull
        private volatile /* synthetic */ Object _originalNext;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final f f296669a;

        public d(@NotNull f queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.f296669a = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public static /* synthetic */ void l() {
        }

        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected Object c(@NotNull f affected, @NotNull Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            if (affected == this.f296669a) {
                return io.ktor.util.internal.e.h();
            }
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        protected final void d(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            affected.r(next);
        }

        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected final f e() {
            return (f) this._affectedNode;
        }

        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected final f f() {
            return (f) this._originalNext;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.f.a
        @Nullable
        protected final Object g(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            if (affected instanceof io.ktor.util.internal.d) {
                throw new IllegalStateException("Check failed.");
            }
            if (!m(affected)) {
                return io.ktor.util.internal.e.f296654g;
            }
            androidx.concurrent.futures.b.a(f296667b, this, null, affected);
            androidx.concurrent.futures.b.a(f296668c, this, null, next);
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        protected final boolean h(@NotNull f affected, @NotNull Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            if (!(next instanceof h)) {
                return false;
            }
            affected.x();
            return true;
        }

        @Override // io.ktor.util.internal.f.a
        @NotNull
        protected final f i(@NotNull g op) {
            Intrinsics.checkNotNullParameter(op, "op");
            Object objT = this.f296669a.t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            return (f) objT;
        }

        @Override // io.ktor.util.internal.f.a
        @NotNull
        protected final Object j(@NotNull f affected, @NotNull f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            return next.G();
        }

        public final T k() {
            T t10 = (T) e();
            Intrinsics.checkNotNull(t10);
            return t10;
        }

        protected boolean m(T t10) {
            return true;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f296670b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _originalNext = null;

        e() {
        }

        @Override // io.ktor.util.internal.f.a
        protected Object c(f affected, Object next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            if (next instanceof h) {
                return io.ktor.util.internal.e.c();
            }
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        protected void d(f affected, f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            f.this.r(next);
        }

        @Override // io.ktor.util.internal.f.a
        protected f e() {
            return f.this;
        }

        @Override // io.ktor.util.internal.f.a
        protected f f() {
            return (f) this._originalNext;
        }

        @Override // io.ktor.util.internal.f.a
        protected Object g(f affected, f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            androidx.concurrent.futures.b.a(f296670b, this, null, next);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.util.internal.f.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public h j(f affected, f next) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(next, "next");
            return next.G();
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.internal.f$f, reason: collision with other inner class name */
    public static final class C2091f extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f296672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2091f(f fVar, Function0<Boolean> function0) {
            super(fVar);
            this.f296672d = function0;
        }

        @Override // io.ktor.util.internal.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object e(f affected) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            if (this.f296672d.invoke().booleanValue()) {
                return null;
            }
            return io.ktor.util.internal.e.e();
        }
    }

    private final f B() {
        Object obj;
        f fVarP;
        do {
            obj = this._prev;
            if (obj instanceof h) {
                return ((h) obj).f296673a;
            }
            if (obj == this) {
                fVarP = p();
            } else {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                fVarP = (f) obj;
            }
        } while (!androidx.concurrent.futures.b.a(f296657b, this, obj, fVarP.G()));
        return (f) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h G() {
        h hVar = (h) this.removedRef;
        if (hVar == null) {
            hVar = new h(this);
            f296658c.lazySet(this, hVar);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f l(f fVar, g gVar) {
        Object obj;
        while (true) {
            f fVar2 = null;
            while (true) {
                obj = fVar._next;
                if (obj == gVar) {
                    return fVar;
                }
                if (obj instanceof g) {
                    ((g) obj).a(fVar);
                } else if (!(obj instanceof h)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof h) {
                        return null;
                    }
                    if (obj != this) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        fVar2 = fVar;
                        fVar = (f) obj;
                    } else {
                        if (obj2 == fVar) {
                            return null;
                        }
                        if (androidx.concurrent.futures.b.a(f296657b, this, obj2, fVar) && !(fVar._prev instanceof h)) {
                            return null;
                        }
                    }
                } else {
                    if (fVar2 != null) {
                        break;
                    }
                    fVar = io.ktor.util.internal.e.l(fVar._prev);
                }
            }
            fVar.B();
            androidx.concurrent.futures.b.a(f296656a, fVar2, fVar, ((h) obj).f296673a);
            fVar = fVar2;
        }
    }

    private final f p() {
        f fVarU = this;
        while (!(fVarU instanceof io.ktor.util.internal.d)) {
            fVarU = fVarU.u();
            if (fVarU == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return fVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(f fVar) {
        Object obj;
        do {
            obj = fVar._prev;
            if (!(obj instanceof h) && t() == fVar) {
            }
            return;
        } while (!androidx.concurrent.futures.b.a(f296657b, fVar, obj, this));
        if (t() instanceof h) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            fVar.l((f) obj, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(f fVar) {
        x();
        fVar.l(io.ktor.util.internal.e.l(this._prev), null);
    }

    @a1
    @NotNull
    public final c A(@NotNull f node, @NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new C2091f(node, condition);
    }

    public boolean C() {
        Object objT;
        f fVar;
        do {
            objT = t();
            if (!(objT instanceof h) && objT != this) {
                Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                fVar = (f) objT;
            }
            return false;
        } while (!androidx.concurrent.futures.b.a(f296656a, this, objT, fVar.G()));
        r(fVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.f] */
    public final /* synthetic */ <T> T D() {
        while (true) {
            Object objT = t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            ?? r10 = (T) ((f) objT);
            if (r10 == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (r10 == 0) {
                return null;
            }
            if (r10.C()) {
                return r10;
            }
            r10.x();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, io.ktor.util.internal.f, java.lang.Object] */
    public final /* synthetic */ <T> T E(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        while (true) {
            Object objT = t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) objT;
            if (fVar == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (fVar == 0) {
                return null;
            }
            if (predicate.invoke(fVar).booleanValue() || fVar.C()) {
                return fVar;
            }
            fVar.x();
        }
    }

    @Nullable
    public final f F() {
        while (true) {
            Object objT = t();
            Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) objT;
            if (fVar == this) {
                return null;
            }
            if (fVar.C()) {
                return fVar;
            }
            fVar.x();
        }
    }

    @a1
    public final int H(@NotNull f node, @NotNull f next, @NotNull c condAdd) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(condAdd, "condAdd");
        f296657b.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f296656a;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.f296666c = next;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void I(@NotNull f prev, @NotNull f next) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(next, "next");
        if (prev != this._prev) {
            throw new IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void f(@NotNull f node) {
        Object objV;
        Intrinsics.checkNotNullParameter(node, "node");
        do {
            objV = v();
            Intrinsics.checkNotNull(objV, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        } while (!((f) objV).j(node, this));
    }

    public final boolean g(@NotNull f node, @NotNull Function0<Boolean> condition) {
        int iH;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(condition, "condition");
        C2091f c2091f = new C2091f(node, condition);
        do {
            Object objV = v();
            Intrinsics.checkNotNull(objV, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            iH = ((f) objV).H(node, this, c2091f);
            if (iH == 1) {
                return true;
            }
        } while (iH != 2);
        return false;
    }

    public final boolean h(@NotNull f node, @NotNull Function1<? super f, Boolean> predicate) {
        f fVar;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        do {
            Object objV = v();
            Intrinsics.checkNotNull(objV, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            fVar = (f) objV;
            if (!predicate.invoke(fVar).booleanValue()) {
                return false;
            }
        } while (!fVar.j(node, this));
        return true;
    }

    public final boolean i(@NotNull f node, @NotNull Function1<? super f, Boolean> predicate, @NotNull Function0<Boolean> condition) {
        int iH;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(condition, "condition");
        C2091f c2091f = new C2091f(node, condition);
        do {
            Object objV = v();
            Intrinsics.checkNotNull(objV, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) objV;
            if (!predicate.invoke(fVar).booleanValue()) {
                return false;
            }
            iH = fVar.H(node, this, c2091f);
            if (iH == 1) {
                return true;
            }
        } while (iH != 2);
        return false;
    }

    @a1
    public final boolean j(@NotNull f node, @NotNull f next) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(next, "next");
        f296657b.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f296656a;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.q(next);
        return true;
    }

    public final boolean k(@NotNull f node) {
        Intrinsics.checkNotNullParameter(node, "node");
        f296657b.lazySet(node, this);
        f296656a.lazySet(node, this);
        while (t() == this) {
            if (androidx.concurrent.futures.b.a(f296656a, this, this, node)) {
                node.q(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final <T extends f> b<T> m(@NotNull T node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return new b<>(this, node);
    }

    @Nullable
    public io.ktor.util.internal.a n() {
        if (z()) {
            return null;
        }
        return new e();
    }

    @NotNull
    public final d<f> o() {
        return new d<>(this);
    }

    @NotNull
    public final Object t() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof g)) {
                return obj;
            }
            ((g) obj).a(this);
        }
    }

    @NotNull
    public String toString() {
        return j1.d(getClass()).Q() + '@' + hashCode();
    }

    @NotNull
    public final f u() {
        return io.ktor.util.internal.e.l(t());
    }

    @NotNull
    public final Object v() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof h) {
                return obj;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) obj;
            if (fVar.t() == this) {
                return obj;
            }
            l(fVar, null);
        }
    }

    @NotNull
    public final f w() {
        return io.ktor.util.internal.e.l(v());
    }

    @a1
    public final void x() {
        Object objT;
        f fVarB = B();
        Object obj = this._next;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        f fVar = ((h) obj).f296673a;
        while (true) {
            f fVar2 = null;
            while (true) {
                Object objT2 = fVar.t();
                if (objT2 instanceof h) {
                    fVar.B();
                    fVar = ((h) objT2).f296673a;
                } else {
                    objT = fVarB.t();
                    if (objT instanceof h) {
                        if (fVar2 != null) {
                            break;
                        } else {
                            fVarB = io.ktor.util.internal.e.l(fVarB._prev);
                        }
                    } else if (objT != this) {
                        Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        f fVar3 = (f) objT;
                        if (fVar3 == fVar) {
                            return;
                        }
                        fVar2 = fVarB;
                        fVarB = fVar3;
                    } else if (androidx.concurrent.futures.b.a(f296656a, fVarB, this, fVar)) {
                        return;
                    }
                }
            }
            fVarB.B();
            androidx.concurrent.futures.b.a(f296656a, fVar2, fVarB, ((h) objT).f296673a);
            fVarB = fVar2;
        }
    }

    public final void y() {
        Object objT = t();
        h hVar = objT instanceof h ? (h) objT : null;
        if (hVar == null) {
            throw new IllegalStateException("Must be invoked on a removed node");
        }
        r(hVar.f296673a);
    }

    public final boolean z() {
        return t() instanceof h;
    }
}
