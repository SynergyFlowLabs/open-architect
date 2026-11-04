package androidx.datastore.core;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f49812c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f49813d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final v0 f49814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n<?> f49815b;

    public static final class a {

        /* JADX INFO: renamed from: androidx.datastore.core.v0$a$a, reason: collision with other inner class name */
        public static final class C0438a implements CoroutineContext.b<v0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0438a f49816a = new C0438a();

            private C0438a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return v0.f49813d;
        }

        private a() {
        }
    }

    public v0(@Nullable v0 v0Var, @NotNull n<?> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f49814a = v0Var;
        this.f49815b = instance;
    }

    public final void b(@NotNull l<?> candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f49815b == candidate) {
            throw new IllegalStateException(f49813d.toString());
        }
        v0 v0Var = this.f49814a;
        if (v0Var != null) {
            v0Var.b(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return a.C0438a.f49816a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
