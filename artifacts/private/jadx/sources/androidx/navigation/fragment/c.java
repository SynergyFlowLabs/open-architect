package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.lifecycle.c0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import androidx.navigation.n0;
import androidx.navigation.q3;
import androidx.navigation.r3;
import androidx.navigation.v3;
import androidx.navigation.w2;
import androidx.navigation.y1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q3.b(androidx.navigation.compose.n.f70794f)
public final class c extends q3<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f70921i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f70922j = "DialogFragmentNavigator";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f70923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final FragmentManager f70924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Set<String> f70925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0628c f70926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<String, androidx.fragment.app.m> f70927h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @y1.a(androidx.fragment.app.m.class)
    @SourceDebugExtension({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,319:1\n1#2:320\n233#3,3:321\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n283#1:321,3\n*E\n"})
    public static class b extends y1 implements androidx.navigation.u {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private String f70928h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull q3<? extends b> fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.y1
        @androidx.annotation.i
        public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.a0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, y.d.f70979a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(y.d.f70980b);
            if (string != null) {
                z0(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.y1
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof b) && super.equals(obj) && Intrinsics.areEqual(this.f70928h, ((b) obj).f70928h);
        }

        @Override // androidx.navigation.y1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f70928h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String v0() {
            String str = this.f70928h;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @NotNull
        public final b z0(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f70928h = className;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull r3 navigatorProvider) {
            this((q3<? extends b>) navigatorProvider.e(c.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.fragment.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$observer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1755#2,3:320\n528#2,7:323\n388#2,7:331\n528#2,7:338\n1#3:330\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$observer$1\n*L\n55#1:320,3\n70#1:323,7\n79#1:331,7\n95#1:338,7\n*E\n"})
    public static final class C0628c implements j0 {

        /* JADX INFO: renamed from: androidx.navigation.fragment.c$c$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f70930a;

            static {
                int[] iArr = new int[c0.a.values().length];
                try {
                    iArr[c0.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c0.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c0.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c0.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f70930a = iArr;
            }
        }

        C0628c() {
        }

        @Override // androidx.lifecycle.j0
        public void e(o0 source, c0.a event) {
            int iNextIndex;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i10 = a.f70930a[event.ordinal()];
            if (i10 == 1) {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) source;
                List<n0> value = c.this.e().c().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((n0) it.next()).h(), mVar.getTag())) {
                            return;
                        }
                    }
                }
                mVar.dismiss();
                return;
            }
            Object obj = null;
            if (i10 == 2) {
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) source;
                for (Object obj2 : c.this.e().d().getValue()) {
                    if (Intrinsics.areEqual(((n0) obj2).h(), mVar2.getTag())) {
                        obj = obj2;
                    }
                }
                n0 n0Var = (n0) obj;
                if (n0Var != null) {
                    c.this.e().f(n0Var);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                androidx.fragment.app.m mVar3 = (androidx.fragment.app.m) source;
                for (Object obj3 : c.this.e().d().getValue()) {
                    if (Intrinsics.areEqual(((n0) obj3).h(), mVar3.getTag())) {
                        obj = obj3;
                    }
                }
                n0 n0Var2 = (n0) obj;
                if (n0Var2 != null) {
                    c.this.e().f(n0Var2);
                }
                mVar3.getLifecycle().g(this);
                return;
            }
            androidx.fragment.app.m mVar4 = (androidx.fragment.app.m) source;
            if (mVar4.requireDialog().isShowing()) {
                return;
            }
            List<n0> value2 = c.this.e().c().getValue();
            ListIterator<n0> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.areEqual(listIterator.previous().h(), mVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            n0 n0Var3 = (n0) CollectionsKt.getOrNull(value2, iNextIndex);
            if (!Intrinsics.areEqual(CollectionsKt.lastOrNull((List) value2), n0Var3)) {
                mVar4.toString();
            }
            if (n0Var3 != null) {
                c.this.y(iNextIndex, n0Var3, false);
            }
        }
    }

    public c(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f70923d = context;
        this.f70924e = fragmentManager;
        this.f70925f = new LinkedHashSet();
        this.f70926g = new C0628c();
        this.f70927h = new LinkedHashMap();
    }

    private final androidx.fragment.app.m u(n0 n0Var) {
        y1 y1VarF = n0Var.f();
        Intrinsics.checkNotNull(y1VarF, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) y1VarF;
        String strV0 = bVar.v0();
        if (strV0.charAt(0) == '.') {
            strV0 = this.f70923d.getPackageName() + strV0;
        }
        Fragment fragmentA = this.f70924e.L0().a(this.f70923d.getClassLoader(), strV0);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "instantiate(...)");
        if (androidx.fragment.app.m.class.isAssignableFrom(fragmentA.getClass())) {
            androidx.fragment.app.m mVar = (androidx.fragment.app.m) fragmentA;
            mVar.setArguments(n0Var.b());
            mVar.getLifecycle().c(this.f70926g);
            this.f70927h.put(n0Var.h(), mVar);
            return mVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.v0() + " is not an instance of DialogFragment").toString());
    }

    private final void w(n0 n0Var) {
        u(n0Var).show(this.f70924e, n0Var.h());
        n0 n0Var2 = (n0) CollectionsKt.lastOrNull((List) e().c().getValue());
        boolean zContains = CollectionsKt.contains(e().d().getValue(), n0Var2);
        e().m(n0Var);
        if (n0Var2 == null || zContains) {
            return;
        }
        e().f(n0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(c cVar, FragmentManager fragmentManager, Fragment childFragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<unused var>");
        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
        Set<String> set = cVar.f70925f;
        if (r1.a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().c(cVar.f70926g);
        }
        Map<String, androidx.fragment.app.m> map = cVar.f70927h;
        r1.k(map).remove(childFragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i10, n0 n0Var, boolean z10) {
        n0 n0Var2 = (n0) CollectionsKt.getOrNull(e().c().getValue(), i10 - 1);
        boolean zContains = CollectionsKt.contains(e().d().getValue(), n0Var2);
        e().j(n0Var, z10);
        if (n0Var2 == null || zContains) {
            return;
        }
        e().f(n0Var2);
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<n0> entries, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.f70924e.i1()) {
            return;
        }
        Iterator<n0> it = entries.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    @Override // androidx.navigation.q3
    public void j(@NotNull v3 state) {
        c0 lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.j(state);
        for (n0 n0Var : state.c().getValue()) {
            androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.f70924e.w0(n0Var.h());
            if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                this.f70925f.add(n0Var.h());
            } else {
                lifecycle.c(this.f70926g);
            }
        }
        this.f70924e.q(new m0() { // from class: androidx.navigation.fragment.b
            @Override // androidx.fragment.app.m0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                c.x(this.f70920a, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.q3
    public void k(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.f70924e.i1()) {
            return;
        }
        androidx.fragment.app.m mVar = this.f70927h.get(backStackEntry.h());
        if (mVar == null) {
            Fragment fragmentW0 = this.f70924e.w0(backStackEntry.h());
            mVar = fragmentW0 instanceof androidx.fragment.app.m ? (androidx.fragment.app.m) fragmentW0 : null;
        }
        if (mVar != null) {
            mVar.getLifecycle().g(this.f70926g);
            mVar.dismiss();
        }
        u(backStackEntry).show(this.f70924e, backStackEntry.h());
        e().h(backStackEntry);
    }

    @Override // androidx.navigation.q3
    public void o(@NotNull n0 popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.f70924e.i1()) {
            return;
        }
        List<n0> value = e().c().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        Iterator it = CollectionsKt.reversed(value.subList(iIndexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentW0 = this.f70924e.w0(((n0) it.next()).h());
            if (fragmentW0 != null) {
                ((androidx.fragment.app.m) fragmentW0).dismiss();
            }
        }
        y(iIndexOf, popUpTo, z10);
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this);
    }

    @NotNull
    public final z0<List<n0>> v() {
        return e().c();
    }
}
