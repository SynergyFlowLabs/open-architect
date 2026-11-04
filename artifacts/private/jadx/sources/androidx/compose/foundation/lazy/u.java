package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyListIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListIntervalContent.kt\nandroidx/compose/foundation/lazy/LazyListIntervalContent\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n905#2:81\n1#3:82\n*S KotlinDebug\n*F\n+ 1 LazyListIntervalContent.kt\nandroidx/compose/foundation/lazy/LazyListIntervalContent\n*L\n67#1:81\n*E\n"})
public final class u extends androidx.compose.foundation.lazy.layout.y<r> implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18043d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j2<r> f18044b = new j2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.collection.r1 f18045c;

    static final class a implements pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<i, androidx.compose.runtime.c0, Integer, Unit> f18046a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super i, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f18046a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= c0Var.D(iVar) ? 4 : 2;
            }
            if (!c0Var.h((i11 & 131) != 130, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-857469575, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            this.f18046a.invoke(iVar, c0Var, Integer.valueOf(i11 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(iVar, num.intValue(), c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.n<i, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> f18047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18048b;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, int i10) {
            this.f18047a = oVar;
            this.f18048b = i10;
        }

        @androidx.compose.runtime.o
        public final void c(i iVar, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                if (c0Var.D(iVar)) {
                    i11 = 4;
                    int i12 = 4 | 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1588696110, i10, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
            }
            this.f18047a.invoke(iVar, Integer.valueOf(this.f18048b), c0Var, Integer.valueOf(i10 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public u(@NotNull Function1<? super w0, Unit> function1) {
        function1.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object M(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object N(Object obj, int i10) {
        return obj;
    }

    @Override // androidx.compose.foundation.lazy.w0
    public void A(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        E().c(i10, new r(function1, function2, oVar));
    }

    @NotNull
    public final androidx.collection.f0 K() {
        androidx.collection.r1 r1Var = this.f18045c;
        return r1Var != null ? r1Var : androidx.collection.g0.c();
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public j2<r> E() {
        return this.f18044b;
    }

    @Override // androidx.compose.foundation.lazy.w0
    public void a(@Nullable Object obj, @Nullable Object obj2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        androidx.collection.r1 r1Var = this.f18045c;
        if (r1Var == null) {
            r1Var = new androidx.collection.r1(0, 1, null);
            this.f18045c = r1Var;
        }
        r1Var.b0(E().getSize());
        j(obj, obj2, androidx.compose.runtime.internal.w.c(-1588696110, true, new b(oVar, E().getSize())));
    }

    @Override // androidx.compose.foundation.lazy.w0
    public void j(@Nullable final Object obj, @Nullable final Object obj2, @NotNull pj.n<? super i, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        E().c(1, new r(obj != null ? new Function1() { // from class: androidx.compose.foundation.lazy.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return u.M(obj, ((Integer) obj3).intValue());
            }
        } : null, new Function1() { // from class: androidx.compose.foundation.lazy.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return u.N(obj2, ((Integer) obj3).intValue());
            }
        }, androidx.compose.runtime.internal.w.c(-857469575, true, new a(nVar))));
    }
}
