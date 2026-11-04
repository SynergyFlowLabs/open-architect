package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.fragment.app.t0;
import androidx.lifecycle.d1;
import androidx.lifecycle.f2;
import androidx.lifecycle.j0;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.navigation.n0;
import androidx.navigation.q3;
import androidx.navigation.r3;
import androidx.navigation.v3;
import androidx.navigation.w2;
import androidx.navigation.y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.flow.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q3.b("fragment")
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n32#2:713\n69#2,2:714\n774#3:716\n865#3,2:717\n1863#3,2:719\n528#3,7:721\n543#3,6:728\n1755#3,3:734\n1863#3,2:737\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n247#1:734,3\n273#1:737,2\n*E\n"})
public class q extends q3<c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final b f70947k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f70948l = "FragmentNavigator";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f70949m = "androidx-nav-fragment:navigator:savedIds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f70950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final FragmentManager f70951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<String> f70953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<Pair<String, Boolean>> f70954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j0 f70955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<n0, j0> f70956j;

    public static final class a extends f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<Function0<Unit>> f70957a;

        @NotNull
        public final WeakReference<Function0<Unit>> U() {
            WeakReference<Function0<Unit>> weakReference = this.f70957a;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        public final void V(@NotNull WeakReference<Function0<Unit>> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f70957a = weakReference;
        }

        @Override // androidx.lifecycle.f2
        protected void onCleared() {
            super.onCleared();
            Function0<Unit> function0 = U().get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @y1.a(Fragment.class)
    @SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n233#2,3:713\n1#3:716\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n570#1:713,3\n*E\n"})
    public static class c extends y1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private String f70958h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull q3<? extends c> fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.y1
        @androidx.annotation.i
        public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.a0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, y.d.f70981c);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(y.d.f70982d);
            if (string != null) {
                z0(string);
            }
            Unit unit = Unit.f312394a;
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.y1
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof c) && super.equals(obj) && Intrinsics.areEqual(this.f70958h, ((c) obj).f70958h);
        }

        @Override // androidx.navigation.y1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f70958h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.y1
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f70958h;
            if (str == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @NotNull
        public final String v0() {
            String str = this.f70958h;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @NotNull
        public final c z0(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f70958h = className;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(@NotNull r3 navigatorProvider) {
            this((q3<? extends c>) navigatorProvider.e(q.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }
    }

    public static final class d implements q3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap<View, String> f70959a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final LinkedHashMap<View, String> f70960a = new LinkedHashMap<>();

            @NotNull
            public final a a(@NotNull View sharedElement, @NotNull String name) {
                Intrinsics.checkNotNullParameter(sharedElement, "sharedElement");
                Intrinsics.checkNotNullParameter(name, "name");
                this.f70960a.put(sharedElement, name);
                return this;
            }

            @NotNull
            public final a b(@NotNull Map<View, String> sharedElements) {
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @NotNull
            public final d c() {
                return new d(this.f70960a);
            }
        }

        public d(@NotNull Map<View, String> sharedElements) {
            Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f70959a = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @NotNull
        public final Map<View, String> a() {
            return MapsKt.toMap(this.f70959a);
        }
    }

    @SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n543#2,6:713\n543#2,6:720\n295#2,2:726\n1#3:719\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n*L\n174#1:713,6\n188#1:720,6\n195#1:726,2\n*E\n"})
    public static final class e implements FragmentManager.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3 f70961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f70962b;

        e(v3 v3Var, q qVar) {
            this.f70961a = v3Var;
            this.f70962b = qVar;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void a(Fragment fragment, boolean z10) {
            n0 n0VarPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (z10) {
                List<n0> value = this.f70961a.c().getValue();
                ListIterator<n0> listIterator = value.listIterator(value.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        n0VarPrevious = null;
                        break;
                    }
                    n0VarPrevious = listIterator.previous();
                } while (!Intrinsics.areEqual(n0VarPrevious.h(), fragment.getTag()));
                n0 n0Var = n0VarPrevious;
                if (this.f70962b.Q(2)) {
                    Objects.toString(fragment);
                    Objects.toString(n0Var);
                }
                if (n0Var != null) {
                    this.f70961a.k(n0Var);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void d(Fragment fragment, boolean z10) {
            Object obj;
            Object objPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            List listPlus = CollectionsKt.plus((Collection) this.f70961a.c().getValue(), (Iterable) this.f70961a.d().getValue());
            ListIterator listIterator = listPlus.listIterator(listPlus.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!Intrinsics.areEqual(((n0) objPrevious).h(), fragment.getTag()));
            n0 n0Var = (n0) objPrevious;
            boolean z11 = true;
            boolean z12 = z10 && this.f70962b.O().isEmpty() && fragment.isRemoving();
            for (Object obj2 : this.f70962b.O()) {
                if (Intrinsics.areEqual(((Pair) obj2).getFirst(), fragment.getTag())) {
                    obj = obj2;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                this.f70962b.O().remove(pair);
            }
            if (!z12 && this.f70962b.Q(2)) {
                Objects.toString(fragment);
                Objects.toString(n0Var);
            }
            if (pair == null || !((Boolean) pair.getSecond()).booleanValue()) {
                z11 = false;
            }
            if (!z10 && !z11 && n0Var == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (n0Var != null) {
                this.f70962b.F(fragment, n0Var, this.f70961a);
                if (z12) {
                    if (this.f70962b.Q(2)) {
                        Objects.toString(fragment);
                        n0Var.toString();
                    }
                    this.f70961a.j(n0Var, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void onBackStackChanged() {
        }
    }

    static final class f implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f70963a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f70963a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f70963a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f70963a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public q(@NotNull Context context, @NotNull FragmentManager fragmentManager, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f70950d = context;
        this.f70951e = fragmentManager;
        this.f70952f = i10;
        this.f70953g = new LinkedHashSet();
        this.f70954h = new ArrayList();
        this.f70955i = new j0() { // from class: androidx.navigation.fragment.h
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, androidx.lifecycle.c0.a aVar) {
                q.K(this.f70933a, o0Var, aVar);
            }
        };
        this.f70956j = new Function1() { // from class: androidx.navigation.fragment.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.L(this.f70934a, (n0) obj);
            }
        };
    }

    private final void A(final String str, boolean z10, boolean z11) {
        if (z11) {
            CollectionsKt.removeAll((List) this.f70954h, new Function1() { // from class: androidx.navigation.fragment.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q.C(str, (Pair) obj));
                }
            });
        }
        this.f70954h.add(TuplesKt.to(str, Boolean.valueOf(z10)));
    }

    static /* synthetic */ void B(q qVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        qVar.A(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(String str, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getFirst(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(n0 n0Var, v3 v3Var, q qVar, Fragment fragment) {
        for (n0 n0Var2 : v3Var.d().getValue()) {
            if (qVar.Q(2)) {
                Objects.toString(n0Var2);
                Objects.toString(fragment);
            }
            v3Var.f(n0Var2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a E(v2.a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new a();
    }

    private final void G(final n0 n0Var, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().k(fragment, new f(new Function1() { // from class: androidx.navigation.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.H(this.f70937a, fragment, n0Var, (o0) obj);
            }
        }));
        fragment.getLifecycle().c(this.f70955i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(q qVar, Fragment fragment, n0 n0Var, o0 o0Var) {
        List<Pair<String, Boolean>> list = qVar.f70954h;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), fragment.getTag())) {
                    z10 = true;
                    break;
                }
            }
        }
        if (o0Var != null && !z10) {
            androidx.lifecycle.c0 lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.d().n(androidx.lifecycle.c0.b.CREATED)) {
                lifecycle.c(qVar.f70956j.invoke(n0Var));
            }
        }
        return Unit.f312394a;
    }

    private final t0 J(n0 n0Var, w2 w2Var) {
        y1 y1VarF = n0Var.f();
        Intrinsics.checkNotNull(y1VarF, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleB = n0Var.b();
        String strV0 = ((c) y1VarF).v0();
        if (strV0.charAt(0) == '.') {
            strV0 = this.f70950d.getPackageName() + strV0;
        }
        Fragment fragmentA = this.f70951e.L0().a(this.f70950d.getClassLoader(), strV0);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "instantiate(...)");
        fragmentA.setArguments(bundleB);
        t0 t0VarW = this.f70951e.w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        int iA = w2Var != null ? w2Var.a() : -1;
        int iB = w2Var != null ? w2Var.b() : -1;
        int iC = w2Var != null ? w2Var.c() : -1;
        int iD = w2Var != null ? w2Var.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            t0VarW.K(iA, iB, iC, iD != -1 ? iD : 0);
        }
        t0VarW.z(this.f70952f, fragmentA, n0Var.h());
        t0VarW.M(fragmentA);
        t0VarW.N(true);
        return t0VarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(q qVar, o0 source, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.c0.a.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : qVar.e().d().getValue()) {
                if (Intrinsics.areEqual(((n0) obj2).h(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            n0 n0Var = (n0) obj;
            if (n0Var != null) {
                if (qVar.Q(2)) {
                    n0Var.toString();
                    Objects.toString(source);
                }
                qVar.e().f(n0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 L(final q qVar, final n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new j0() { // from class: androidx.navigation.fragment.j
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, androidx.lifecycle.c0.a aVar) {
                q.M(this.f70935a, entry, o0Var, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(q qVar, n0 n0Var, o0 owner, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.c0.a.ON_RESUME && qVar.e().c().getValue().contains(n0Var)) {
            if (qVar.Q(2)) {
                Objects.toString(n0Var);
                Objects.toString(owner);
            }
            qVar.e().f(n0Var);
        }
        if (event == androidx.lifecycle.c0.a.ON_DESTROY) {
            if (qVar.Q(2)) {
                Objects.toString(n0Var);
                Objects.toString(owner);
            }
            qVar.e().f(n0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q(int i10) {
        return Log.isLoggable(FragmentManager.Z, i10) || Log.isLoggable(f70948l, i10);
    }

    private final void R(n0 n0Var, w2 w2Var, q3.a aVar) {
        boolean zIsEmpty = e().c().getValue().isEmpty();
        if (w2Var != null && !zIsEmpty && w2Var.m() && this.f70953g.remove(n0Var.h())) {
            this.f70951e.L1(n0Var.h());
            e().m(n0Var);
            return;
        }
        t0 t0VarJ = J(n0Var, w2Var);
        if (!zIsEmpty) {
            n0 n0Var2 = (n0) CollectionsKt.lastOrNull((List) e().c().getValue());
            if (n0Var2 != null) {
                B(this, n0Var2.h(), false, false, 6, null);
            }
            B(this, n0Var.h(), false, false, 6, null);
            t0VarJ.k(n0Var.h());
        }
        if (aVar instanceof d) {
            for (Map.Entry<View, String> entry : ((d) aVar).a().entrySet()) {
                t0VarJ.j(entry.getKey(), entry.getValue());
            }
        }
        t0VarJ.m();
        if (Q(2)) {
            Objects.toString(n0Var);
        }
        e().m(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(v3 v3Var, q qVar, FragmentManager fragmentManager, Fragment fragment) {
        n0 n0VarPrevious;
        Intrinsics.checkNotNullParameter(fragmentManager, "<unused var>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List<n0> value = v3Var.c().getValue();
        ListIterator<n0> listIterator = value.listIterator(value.size());
        do {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
        } while (!Intrinsics.areEqual(n0VarPrevious.h(), fragment.getTag()));
        n0 n0Var = n0VarPrevious;
        if (qVar.Q(2)) {
            Objects.toString(fragment);
            Objects.toString(n0Var);
            Objects.toString(qVar.f70951e);
        }
        if (n0Var != null) {
            qVar.G(n0Var, fragment);
            qVar.F(fragment, n0Var, v3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) it.getFirst();
    }

    public final void F(@NotNull final Fragment fragment, @NotNull final n0 entry, @NotNull final v3 state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        l2 viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "<get-viewModelStore>(...)");
        v2.d dVar = new v2.d();
        dVar.a(j1.d(a.class), new Function1() { // from class: androidx.navigation.fragment.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.E((v2.a) obj);
            }
        });
        ((a) new j2(viewModelStore, dVar.b(), v2.a.b.f381327c).c(a.class)).V(new WeakReference<>(new Function0() { // from class: androidx.navigation.fragment.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.D(entry, state, this, fragment);
            }
        }));
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public c c() {
        return new c(this);
    }

    @NotNull
    public final z0<List<n0>> N() {
        return e().c();
    }

    @NotNull
    public final List<Pair<String, Boolean>> O() {
        return this.f70954h;
    }

    @kotlin.l(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    @NotNull
    public Fragment P(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull String className, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(className, "className");
        Fragment fragmentA = fragmentManager.L0().a(context.getClassLoader(), className);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "instantiate(...)");
        return fragmentA;
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<n0> entries, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.f70951e.i1()) {
            return;
        }
        Iterator<n0> it = entries.iterator();
        while (it.hasNext()) {
            R(it.next(), w2Var, aVar);
        }
    }

    @Override // androidx.navigation.q3
    public void j(@NotNull final v3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.j(state);
        int i10 = 4 >> 2;
        Q(2);
        this.f70951e.q(new m0() { // from class: androidx.navigation.fragment.m
            @Override // androidx.fragment.app.m0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                q.S(state, this, fragmentManager, fragment);
            }
        });
        this.f70951e.r(new e(state, this));
    }

    @Override // androidx.navigation.q3
    public void k(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.f70951e.i1()) {
            return;
        }
        t0 t0VarJ = J(backStackEntry, null);
        List<n0> value = e().c().getValue();
        if (value.size() > 1) {
            n0 n0Var = (n0) CollectionsKt.getOrNull(value, CollectionsKt.getLastIndex(value) - 1);
            if (n0Var != null) {
                B(this, n0Var.h(), false, false, 6, null);
            }
            B(this, backStackEntry.h(), true, false, 4, null);
            this.f70951e.u1(backStackEntry.h(), 1);
            B(this, backStackEntry.h(), false, false, 2, null);
            t0VarJ.k(backStackEntry.h());
        }
        t0VarJ.m();
        e().g(backStackEntry);
    }

    @Override // androidx.navigation.q3
    public void m(@NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(f70949m);
        if (stringArrayList != null) {
            this.f70953g.clear();
            CollectionsKt.addAll(this.f70953g, stringArrayList);
        }
    }

    @Override // androidx.navigation.q3
    @Nullable
    public Bundle n() {
        if (this.f70953g.isEmpty()) {
            return null;
        }
        return androidx.core.os.e.b(TuplesKt.to(f70949m, new ArrayList(this.f70953g)));
    }

    @Override // androidx.navigation.q3
    public void o(@NotNull n0 popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.f70951e.i1()) {
            return;
        }
        List<n0> value = e().c().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        List<n0> listSubList = value.subList(iIndexOf, value.size());
        n0 n0Var = (n0) CollectionsKt.first((List) value);
        n0 n0Var2 = (n0) CollectionsKt.getOrNull(value, iIndexOf - 1);
        if (n0Var2 != null) {
            B(this, n0Var2.h(), false, false, 6, null);
        }
        List<n0> list = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            n0 n0Var3 = (n0) obj;
            if (kotlin.sequences.o.f0(kotlin.sequences.o.k1(CollectionsKt.asSequence(this.f70954h), new Function1() { // from class: androidx.navigation.fragment.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.T((Pair) obj2);
                }
            }), n0Var3.h()) || !Intrinsics.areEqual(n0Var3.h(), n0Var.h())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B(this, ((n0) it.next()).h(), true, false, 4, null);
        }
        if (z10) {
            for (n0 n0Var4 : CollectionsKt.reversed(list)) {
                if (Intrinsics.areEqual(n0Var4, n0Var)) {
                    Objects.toString(n0Var4);
                } else {
                    this.f70951e.T1(n0Var4.h());
                    this.f70953g.add(n0Var4.h());
                }
            }
        } else {
            this.f70951e.u1(popUpTo.h(), 1);
        }
        if (Q(2)) {
            Objects.toString(popUpTo);
        }
        e().j(popUpTo, z10);
    }
}
