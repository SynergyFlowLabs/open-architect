package com.planner5d.library.model.manager.initialization;

import android.os.Bundle;
import androidx.annotation.d0;
import androidx.appcompat.app.d;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import com.planner5d.library.activity.fragment.startup.StartupFragment;
import com.planner5d.library.model.manager.initialization.a;
import com.planner5d.library.model.manager.initialization.q;
import java.util.Iterator;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nInitializableHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializableHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializableHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1863#2,2:71\n1#3:73\n*S KotlinDebug\n*F\n+ 1 InitializableHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializableHandler\n*L\n46#1:71,2\n*E\n"})
public final class d<T extends androidx.appcompat.app.d, U extends com.planner5d.library.model.manager.initialization.a<T>, V extends q<T>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f191607f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f191608g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f191609h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f191610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<V> f191611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<U> f191612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p<T> f191613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f191614e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return d.f191609h;
        }

        private a() {
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f191615a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f191615a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f191615a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f191615a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static {
        String name = StartupFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f191609h = name;
    }

    @ij.a
    public d(@NotNull r initializationManager, @NotNull fg.e<V> pendingDataApplier, @NotNull fg.e<U> initializedContent) {
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(pendingDataApplier, "pendingDataApplier");
        Intrinsics.checkNotNullParameter(initializedContent, "initializedContent");
        this.f191610a = initializationManager;
        this.f191611b = pendingDataApplier;
        this.f191612c = initializedContent;
        this.f191613d = new p<>();
    }

    private final com.planner5d.library.model.manager.initialization.a<T> d(T t10) {
        if (!this.f191614e) {
            throw new IllegalStateException("Make sure to call onCreate of the handler first!");
        }
        if (!this.f191610a.k()) {
            return this.f191613d;
        }
        g(t10);
        U u10 = this.f191612c.get();
        Intrinsics.checkNotNull(u10);
        return u10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(d dVar, androidx.appcompat.app.d dVar2, Boolean bool) {
        if (!dVar.f191610a.k()) {
            return Unit.f312394a;
        }
        dVar.g(dVar2);
        return Unit.f312394a;
    }

    private final void g(T t10) {
        if (this.f191610a.n()) {
            FragmentManager supportFragmentManager = t10.getSupportFragmentManager();
            Fragment fragmentW0 = supportFragmentManager.w0(f191609h);
            if (fragmentW0 != null) {
                supportFragmentManager.w().x(fragmentW0).m();
            }
            V v10 = this.f191611b.get();
            p.a aVarW = this.f191613d.w();
            if (aVarW != null) {
                U u10 = this.f191612c.get();
                Intrinsics.checkNotNullExpressionValue(u10, "get(...)");
                v10.a(t10, aVarW, u10);
            }
        }
    }

    @NotNull
    public final com.planner5d.library.model.manager.initialization.a<T> c(@NotNull T activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new e(d(activity));
    }

    public final void e(@NotNull final T activity, @d0 int i10, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f191614e = true;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        if (!this.f191610a.k() && supportFragmentManager.w0(f191609h) == null) {
            List<Fragment> listN0 = supportFragmentManager.N0();
            Intrinsics.checkNotNullExpressionValue(listN0, "getFragments(...)");
            Iterator it = CollectionsKt.filterNotNull(listN0).iterator();
            while (it.hasNext()) {
                supportFragmentManager.w().r((Fragment) it.next()).o();
            }
            supportFragmentManager.w().z(i10, new StartupFragment(), f191609h).m();
        }
        d(activity).i(activity, bundle);
        this.f191610a.j().k(activity, new b(new Function1() { // from class: com.planner5d.library.model.manager.initialization.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.f(this.f191598a, activity, (Boolean) obj);
            }
        }));
    }
}
