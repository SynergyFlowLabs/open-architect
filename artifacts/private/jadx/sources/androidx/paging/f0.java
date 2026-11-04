package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f71849a = new b();

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private j3 f71850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.flow.j0<j3> f71851b = kotlinx.coroutines.flow.q0.b(1, 0, kotlinx.coroutines.channels.j.DROP_OLDEST, 2, null);

        public a() {
        }

        @NotNull
        public final kotlinx.coroutines.flow.i<j3> a() {
            return this.f71851b;
        }

        @Nullable
        public final j3 b() {
            return this.f71850a;
        }

        public final void c(@Nullable j3 j3Var) {
            this.f71850a = j3Var;
            if (j3Var != null) {
                this.f71851b.f(j3Var);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nHintHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HintHandler.kt\nandroidx/paging/HintHandler$State\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n*L\n1#1,168:1\n54#2,6:169\n*S KotlinDebug\n*F\n+ 1 HintHandler.kt\nandroidx/paging/HintHandler$State\n*L\n118#1:169,6\n*E\n"})
    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f71853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f71854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private j3.a f71855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f71856d = new ReentrantLock();

        public b() {
            this.f71853a = f0.this.new a();
            this.f71854b = f0.this.new a();
        }

        @NotNull
        public final kotlinx.coroutines.flow.i<j3> a() {
            return this.f71854b.a();
        }

        @Nullable
        public final j3.a b() {
            return this.f71855c;
        }

        @NotNull
        public final kotlinx.coroutines.flow.i<j3> c() {
            return this.f71853a.a();
        }

        public final void d(@Nullable j3.a aVar, @NotNull Function2<? super a, ? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            ReentrantLock reentrantLock = this.f71856d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.f71855c = aVar;
                }
                block.invoke(this.f71853a, this.f71854b);
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71858a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71858a = iArr;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<a, a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1 f71859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3 f71860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a1 a1Var, j3 j3Var) {
            super(2);
            this.f71859a = a1Var;
            this.f71860b = j3Var;
        }

        public final void c(@NotNull a prependHint, @NotNull a appendHint) {
            Intrinsics.checkNotNullParameter(prependHint, "prependHint");
            Intrinsics.checkNotNullParameter(appendHint, "appendHint");
            if (this.f71859a == a1.PREPEND) {
                prependHint.c(this.f71860b);
            } else {
                appendHint.c(this.f71860b);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a aVar, a aVar2) {
            c(aVar, aVar2);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function2<a, a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f71861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j3 j3Var) {
            super(2);
            this.f71861a = j3Var;
        }

        public final void c(@NotNull a prependHint, @NotNull a appendHint) {
            Intrinsics.checkNotNullParameter(prependHint, "prependHint");
            Intrinsics.checkNotNullParameter(appendHint, "appendHint");
            if (g0.a(this.f71861a, prependHint.b(), a1.PREPEND)) {
                prependHint.c(this.f71861a);
            }
            if (g0.a(this.f71861a, appendHint.b(), a1.APPEND)) {
                appendHint.c(this.f71861a);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a aVar, a aVar2) {
            c(aVar, aVar2);
            return Unit.f312394a;
        }
    }

    public final void a(@NotNull a1 loadType, @NotNull j3 viewportHint) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        if (loadType == a1.PREPEND || loadType == a1.APPEND) {
            this.f71849a.d(null, new d(loadType, viewportHint));
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    @Nullable
    public final j3.a b() {
        return this.f71849a.b();
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<j3> c(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = c.f71858a[loadType.ordinal()];
        if (i10 == 1) {
            return this.f71849a.c();
        }
        if (i10 == 2) {
            return this.f71849a.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void d(@NotNull j3 viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        this.f71849a.d(viewportHint instanceof j3.a ? (j3.a) viewportHint : null, new e(viewportHint));
    }
}
