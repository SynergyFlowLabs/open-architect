package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPhaseContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhaseContent.kt\nio/ktor/util/pipeline/PhaseContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class c<TSubject, Call> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f296761e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final List<Object> f296762f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f296763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f296764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> f296765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f296766d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Object> a() {
            return c.f296762f;
        }

        private a() {
        }
    }

    public c(@NotNull j phase, @NotNull k relation, @NotNull List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> interceptors) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f296763a = phase;
        this.f296764b = relation;
        this.f296765c = interceptors;
        this.f296766d = true;
    }

    private final List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> e() {
        return CollectionsKt.toMutableList((Collection) this.f296765c);
    }

    private final void f() {
        this.f296765c = e();
        this.f296766d = false;
    }

    public final void b(@NotNull pj.n<? super e<TSubject, Call>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (this.f296766d) {
            f();
        }
        this.f296765c.add(interceptor);
    }

    public final void c(@NotNull c<TSubject, Call> destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (k()) {
            return;
        }
        if (destination.k()) {
            destination.f296765c = m();
            destination.f296766d = true;
        } else {
            if (destination.f296766d) {
                destination.f();
            }
            d(destination.f296765c);
        }
    }

    public final void d(@NotNull List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> list = this.f296765c;
        if (destination instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) destination;
            arrayList.ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(list.get(i10));
        }
    }

    @NotNull
    public final j g() {
        return this.f296763a;
    }

    @NotNull
    public final k h() {
        return this.f296764b;
    }

    public final boolean i() {
        return this.f296766d;
    }

    public final int j() {
        return this.f296765c.size();
    }

    public final boolean k() {
        return this.f296765c.isEmpty();
    }

    public final void l(boolean z10) {
        this.f296766d = z10;
    }

    @NotNull
    public final List<pj.n<e<TSubject, Call>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> m() {
        this.f296766d = true;
        return this.f296765c;
    }

    @NotNull
    public String toString() {
        return "Phase `" + this.f296763a.a() + "`, " + j() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull j phase, @NotNull k relation) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        List<Object> list = f296762f;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        this(phase, relation, r1.g(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
