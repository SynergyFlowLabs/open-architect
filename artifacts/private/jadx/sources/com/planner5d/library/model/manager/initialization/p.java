package com.planner5d.library.model.manager.initialization;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.d;
import androidx.compose.runtime.internal.w0;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInitializablePending.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializablePending.kt\ncom/planner5d/library/model/manager/initialization/InitializablePending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class p<T extends androidx.appcompat.app.d> implements com.planner5d.library.model.manager.initialization.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191629b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f191630a = new AtomicReference<>(null);

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f191631h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Bundle f191632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f191633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f191634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f191635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private List<? extends Object> f191636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Intent f191637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private List<? extends Object> f191638g;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a() {
            this(null, false, false, false, null, null, null, 127, null);
            int i10 = 7 ^ 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a i(a aVar, Bundle bundle, boolean z10, boolean z11, boolean z12, List list, Intent intent, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bundle = aVar.f191632a;
            }
            if ((i10 & 2) != 0) {
                z10 = aVar.f191633b;
            }
            if ((i10 & 4) != 0) {
                z11 = aVar.f191634c;
            }
            if ((i10 & 8) != 0) {
                z12 = aVar.f191635d;
            }
            if ((i10 & 16) != 0) {
                list = aVar.f191636e;
            }
            if ((i10 & 32) != 0) {
                intent = aVar.f191637f;
            }
            if ((i10 & 64) != 0) {
                list2 = aVar.f191638g;
            }
            Intent intent2 = intent;
            List list3 = list2;
            List list4 = list;
            boolean z13 = z11;
            return aVar.h(bundle, z10, z13, z12, list4, intent2, list3);
        }

        @Nullable
        public final Bundle a() {
            return this.f191632a;
        }

        public final boolean b() {
            return this.f191633b;
        }

        public final boolean c() {
            return this.f191634c;
        }

        public final boolean d() {
            return this.f191635d;
        }

        @Nullable
        public final List<Object> e() {
            return this.f191636e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f191632a, aVar.f191632a) && this.f191633b == aVar.f191633b && this.f191634c == aVar.f191634c && this.f191635d == aVar.f191635d && Intrinsics.areEqual(this.f191636e, aVar.f191636e) && Intrinsics.areEqual(this.f191637f, aVar.f191637f) && Intrinsics.areEqual(this.f191638g, aVar.f191638g);
        }

        @Nullable
        public final Intent f() {
            return this.f191637f;
        }

        @Nullable
        public final List<Object> g() {
            return this.f191638g;
        }

        @NotNull
        public final a h(@Nullable Bundle bundle, boolean z10, boolean z11, boolean z12, @Nullable List<? extends Object> list, @Nullable Intent intent, @Nullable List<? extends Object> list2) {
            return new a(bundle, z10, z11, z12, list, intent, list2);
        }

        public int hashCode() {
            Bundle bundle = this.f191632a;
            int iHashCode = (((((((bundle == null ? 0 : bundle.hashCode()) * 31) + Boolean.hashCode(this.f191633b)) * 31) + Boolean.hashCode(this.f191634c)) * 31) + Boolean.hashCode(this.f191635d)) * 31;
            List<? extends Object> list = this.f191636e;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Intent intent = this.f191637f;
            int iHashCode3 = (iHashCode2 + (intent == null ? 0 : intent.hashCode())) * 31;
            List<? extends Object> list2 = this.f191638g;
            return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean j() {
            return this.f191635d;
        }

        public final boolean k() {
            return this.f191633b;
        }

        public final boolean l() {
            return this.f191634c;
        }

        @Nullable
        public final Intent m() {
            return this.f191637f;
        }

        @Nullable
        public final List<Object> n() {
            return this.f191638g;
        }

        @Nullable
        public final List<Object> o() {
            return this.f191636e;
        }

        @Nullable
        public final Bundle p() {
            return this.f191632a;
        }

        public final void q(boolean z10) {
            this.f191635d = z10;
        }

        public final void r(boolean z10) {
            this.f191633b = z10;
        }

        public final void s(boolean z10) {
            this.f191634c = z10;
        }

        public final void t(@Nullable Intent intent) {
            this.f191637f = intent;
        }

        @NotNull
        public String toString() {
            return "Data(savedInstanceState=" + this.f191632a + ", callOnStart=" + this.f191633b + ", postCreateComplete=" + this.f191634c + ", callOnResume=" + this.f191635d + ", rememberResult=" + this.f191636e + ", rememberNewIntent=" + this.f191637f + ", rememberRequestPermissionsResult=" + this.f191638g + ")";
        }

        public final void u(@Nullable List<? extends Object> list) {
            this.f191638g = list;
        }

        public final void v(@Nullable List<? extends Object> list) {
            this.f191636e = list;
        }

        public final void w(@Nullable Bundle bundle) {
            this.f191632a = bundle;
        }

        public a(@Nullable Bundle bundle, boolean z10, boolean z11, boolean z12, @Nullable List<? extends Object> list, @Nullable Intent intent, @Nullable List<? extends Object> list2) {
            this.f191632a = bundle;
            this.f191633b = z10;
            this.f191634c = z11;
            this.f191635d = z12;
            this.f191636e = list;
            this.f191637f = intent;
            this.f191638g = list2;
        }

        public /* synthetic */ a(Bundle bundle, boolean z10, boolean z11, boolean z12, List list, Intent intent, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bundle, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : intent, (i10 & 64) != 0 ? null : list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.q(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.s(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit C(int i10, String[] strArr, int[] iArr, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.u(CollectionsKt.listOf((Object[]) new Serializable[]{Integer.valueOf(i10), strArr, iArr}));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.q(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.r(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.r(false);
        return Unit.f312394a;
    }

    private final void G(Function1<? super a, Unit> function1) {
        a aVar = this.f191630a.get();
        if (aVar == null) {
            int i10 = 0 << 0;
            a aVar2 = new a(null, false, false, false, null, null, null, 127, null);
            this.f191630a.set(aVar2);
            aVar = aVar2;
        }
        function1.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(int i10, int i11, Intent intent, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.v(CollectionsKt.listOf(Integer.valueOf(i10), Integer.valueOf(i11), intent));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Bundle bundle, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.w(bundle);
        it.r(false);
        it.s(false);
        it.q(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Intent intent, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.t(intent);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void a() {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.F((p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void b() {
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void c(@NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.z(intent, (p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void d() {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.A((p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void e(final int i10, final int i11, @Nullable final Intent intent) {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.x(i10, i11, intent, (p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void f(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void g() {
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean h(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void i(@NotNull T activity, @Nullable final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new com.planner5d.library.activity.helper.w().a(activity);
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.y(bundle, (p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void j() {
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void k() {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.B((p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void l() {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.D((p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void m() {
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.E((p.a) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // com.planner5d.library.model.manager.initialization.a
    public void onRequestPermissionsResult(final int i10, @NotNull final String[] permissions, @NotNull final int[] results) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(results, "results");
        G(new Function1() { // from class: com.planner5d.library.model.manager.initialization.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.C(i10, permissions, results, (p.a) obj);
            }
        });
    }

    @Nullable
    public final a w() {
        return this.f191630a.getAndSet(null);
    }
}
