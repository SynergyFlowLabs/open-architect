package androidx.compose.foundation.lazy.layout;

import androidx.collection.b3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17415d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.saveable.m f17416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<l0> f17417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, a> f17418c = b3.u();

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f17419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Object f17420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> f17422d;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.i0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,130:1\n1282#2,6:131\n66#3,5:137\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n102#1:131,6\n103#1:137,5\n*E\n"})
        static final class C0110a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i0 f17424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f17425b;

            /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.i0$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n1#1,69:1\n106#2,2:70\n*E\n"})
            public static final class C0111a implements androidx.compose.runtime.u1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f17426a;

                public C0111a(a aVar) {
                    this.f17426a = aVar;
                }

                @Override // androidx.compose.runtime.u1
                public void dispose() {
                    this.f17426a.f17422d = null;
                }
            }

            C0110a(i0 i0Var, a aVar) {
                this.f17424a = i0Var;
                this.f17425b = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.runtime.u1 f(a aVar, androidx.compose.runtime.v1 v1Var) {
                return new C0111a(aVar);
            }

            @androidx.compose.runtime.o
            public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
                androidx.compose.runtime.c0 c0Var2;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(818252804, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                l0 l0VarInvoke = this.f17424a.d().invoke();
                int iF = this.f17425b.f();
                if ((iF >= l0VarInvoke.a() || !Intrinsics.areEqual(l0VarInvoke.d(iF), this.f17425b.g())) && (iF = l0VarInvoke.c(this.f17425b.g())) != -1) {
                    this.f17425b.f17421c = iF;
                }
                int i11 = iF;
                if (i11 != -1) {
                    c0Var.E(-1664741271);
                    c0Var2 = c0Var;
                    k0.b(l0VarInvoke, y2.b(this.f17424a.f17416a), i11, y2.b(this.f17425b.g()), c0Var2, 0);
                    c0Var2.A();
                } else {
                    c0Var2 = c0Var;
                    c0Var2.E(-1664505826);
                    c0Var2.A();
                }
                Object objG = this.f17425b.g();
                boolean zK0 = c0Var2.k0(this.f17425b);
                final a aVar = this.f17425b;
                Object objI0 = c0Var2.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i0.a.C0110a.f(aVar, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                androidx.compose.runtime.b2.d(objG, (Function1) objI0, c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                d(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        public a(@NotNull int i10, @Nullable Object obj, Object obj2) {
            this.f17419a = obj;
            this.f17420b = obj2;
            this.f17421c = i10;
        }

        private final Function2<androidx.compose.runtime.c0, Integer, Unit> c() {
            return androidx.compose.runtime.internal.w.c(818252804, true, new C0110a(i0.this, this));
        }

        @NotNull
        public final Function2<androidx.compose.runtime.c0, Integer, Unit> d() {
            Function2 function2 = this.f17422d;
            if (function2 != null) {
                return function2;
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2C = c();
            this.f17422d = function2C;
            return function2C;
        }

        @Nullable
        public final Object e() {
            return this.f17420b;
        }

        public final int f() {
            return this.f17421c;
        }

        @NotNull
        public final Object g() {
            return this.f17419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0(@NotNull androidx.compose.runtime.saveable.m mVar, @NotNull Function0<? extends l0> function0) {
        this.f17416a = mVar;
        this.f17417b = function0;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> b(int i10, @NotNull Object obj, @Nullable Object obj2) {
        a aVarP = this.f17418c.p(obj);
        if (aVarP != null && aVarP.f() == i10 && Intrinsics.areEqual(aVarP.e(), obj2)) {
            return aVarP.d();
        }
        a aVar = new a(i10, obj, obj2);
        this.f17418c.q0(obj, aVar);
        return aVar.d();
    }

    @Nullable
    public final Object c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarP = this.f17418c.p(obj);
        if (aVarP != null) {
            return aVarP.e();
        }
        l0 l0VarInvoke = this.f17417b.invoke();
        int iC = l0VarInvoke.c(obj);
        if (iC != -1) {
            return l0VarInvoke.f(iC);
        }
        return null;
    }

    @NotNull
    public final Function0<l0> d() {
        return this.f17417b;
    }
}
