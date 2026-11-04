package d2;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f269581b = "FragmentStrictMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f269580a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static c f269582c = c.f269594e;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
        void a(@NotNull n nVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b f269593d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final c f269594e = new c(SetsKt.emptySet(), null, MapsKt.emptyMap());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<a> f269595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final b f269596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<String, Set<Class<? extends n>>> f269597c;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private b f269599b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Set<a> f269598a = new LinkedHashSet();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final Map<String, Set<Class<? extends n>>> f269600c = new LinkedHashMap();

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a a(@NotNull Class<? extends Fragment> fragmentClass, @NotNull Class<? extends n> violationClass) {
                Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                String fragmentClassString = fragmentClass.getName();
                Intrinsics.checkNotNullExpressionValue(fragmentClassString, "fragmentClassString");
                return b(fragmentClassString, violationClass);
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a b(@NotNull String fragmentClass, @NotNull Class<? extends n> violationClass) {
                Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                Set<Class<? extends n>> linkedHashSet = this.f269600c.get(fragmentClass);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.add(violationClass);
                this.f269600c.put(fragmentClass, linkedHashSet);
                return this;
            }

            @NotNull
            public final c c() {
                if (this.f269599b == null && !this.f269598a.contains(a.PENALTY_DEATH)) {
                    m();
                }
                return new c(this.f269598a, this.f269599b, this.f269600c);
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a d() {
                this.f269598a.add(a.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a e() {
                this.f269598a.add(a.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a f() {
                this.f269598a.add(a.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a g() {
                this.f269598a.add(a.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a h() {
                this.f269598a.add(a.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a i() {
                this.f269598a.add(a.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a j() {
                this.f269598a.add(a.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a k() {
                this.f269598a.add(a.PENALTY_DEATH);
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a l(@NotNull b listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.f269599b = listener;
                return this;
            }

            @e.a({"BuilderSetStyle"})
            @NotNull
            public final a m() {
                this.f269598a.add(a.PENALTY_LOG);
                return this;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Set<? extends a> flags, @Nullable b bVar, @NotNull Map<String, ? extends Set<Class<? extends n>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f269595a = flags;
            this.f269596b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends n>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f269597c = linkedHashMap;
        }

        @NotNull
        public final Set<a> a() {
            return this.f269595a;
        }

        @Nullable
        public final b b() {
            return this.f269596b;
        }

        @NotNull
        public final Map<String, Set<Class<? extends n>>> c() {
            return this.f269597c;
        }
    }

    private d() {
    }

    private final c d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.U0() != null) {
                    c cVarU0 = parentFragmentManager.U0();
                    Intrinsics.checkNotNull(cVarU0);
                    return cVarU0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f269582c;
    }

    private final void e(final c cVar, final n nVar) {
        Fragment fragmentA = nVar.a();
        final String name = fragmentA.getClass().getName();
        cVar.a().contains(a.PENALTY_LOG);
        if (cVar.b() != null) {
            t(fragmentA, new Runnable() { // from class: d2.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.f(cVar, nVar);
                }
            });
        }
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            t(fragmentA, new Runnable() { // from class: d2.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.g(name, nVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c policy, n violation) {
        Intrinsics.checkNotNullParameter(policy, "$policy");
        Intrinsics.checkNotNullParameter(violation, "$violation");
        policy.b().a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, n violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        throw violation;
    }

    private final void h(n nVar) {
        if (FragmentManager.b1(3)) {
            nVar.a().getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void i(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        d2.a aVar = new d2.a(fragment, previousFragmentId);
        d dVar = f269580a;
        dVar.h(aVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_FRAGMENT_REUSE) && dVar.v(cVarD, fragment.getClass(), aVar.getClass())) {
            dVar.e(cVarD, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void j(@NotNull Fragment fragment, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment, viewGroup);
        d dVar = f269580a;
        dVar.h(eVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && dVar.v(cVarD, fragment.getClass(), eVar.getClass())) {
            dVar.e(cVarD, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void k(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        d dVar = f269580a;
        dVar.h(fVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.v(cVarD, fragment.getClass(), fVar.getClass())) {
            dVar.e(cVarD, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void l(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        d dVar = f269580a;
        dVar.h(gVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(cVarD, fragment.getClass(), gVar.getClass())) {
            dVar.e(cVarD, gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void m(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        h hVar = new h(fragment);
        d dVar = f269580a;
        dVar.h(hVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(cVarD, fragment.getClass(), hVar.getClass())) {
            dVar.e(cVarD, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void o(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        j jVar = new j(fragment);
        d dVar = f269580a;
        dVar.h(jVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.v(cVarD, fragment.getClass(), jVar.getClass())) {
            dVar.e(cVarD, jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void p(@NotNull Fragment violatingFragment, @NotNull Fragment targetFragment, int i10) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        k kVar = new k(violatingFragment, targetFragment, i10);
        d dVar = f269580a;
        dVar.h(kVar);
        c cVarD = dVar.d(violatingFragment);
        if (cVarD.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(cVarD, violatingFragment.getClass(), kVar.getClass())) {
            dVar.e(cVarD, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void q(@NotNull Fragment fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        l lVar = new l(fragment, z10);
        d dVar = f269580a;
        dVar.h(lVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && dVar.v(cVarD, fragment.getClass(), lVar.getClass())) {
            dVar.e(cVarD, lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void r(@NotNull Fragment fragment, @NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        o oVar = new o(fragment, container);
        d dVar = f269580a;
        dVar.h(oVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && dVar.v(cVarD, fragment.getClass(), oVar.getClass())) {
            dVar.e(cVarD, oVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.n
    @b1({b1.a.LIBRARY})
    public static final void s(@NotNull Fragment fragment, @NotNull Fragment expectedParentFragment, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        p pVar = new p(fragment, expectedParentFragment, i10);
        d dVar = f269580a;
        dVar.h(pVar);
        c cVarD = dVar.d(fragment);
        if (cVarD.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && dVar.v(cVarD, fragment.getClass(), pVar.getClass())) {
            dVar.e(cVarD, pVar);
        }
    }

    private final void t(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerH = fragment.getParentFragmentManager().O0().h();
        if (Intrinsics.areEqual(handlerH.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerH.post(runnable);
        }
    }

    private final boolean v(c cVar, Class<? extends Fragment> cls, Class<? extends n> cls2) {
        Set<Class<? extends n>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), n.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    @NotNull
    public final c c() {
        return f269582c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l1
    public final void n(@NotNull n violation) {
        Intrinsics.checkNotNullParameter(violation, "violation");
        h(violation);
        Fragment fragmentA = violation.a();
        c cVarD = d(fragmentA);
        if (v(cVarD, fragmentA.getClass(), violation.getClass())) {
            e(cVarD, violation);
        }
    }

    public final void u(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        f269582c = cVar;
    }
}
