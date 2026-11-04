package androidx.navigation;

import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b2
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n1863#2,2:222\n1863#2,2:224\n1863#2,2:228\n216#3,2:226\n216#3,2:230\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n70#1:222,2\n143#1:224,2\n179#1:228,2\n178#1:226,2\n180#1:230,2\n*E\n"})
public class a2<D extends y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q3<? extends D> f70611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f70612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f70613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<kotlin.reflect.s, ? extends d3<?>> f70614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private CharSequence f70615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, j0> f70616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<o1> f70617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private Map<Integer, e0> f70618h;

    public static final class a implements Function1<t1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70619a = new a();

        public final void c(t1 deepLink) {
            Intrinsics.checkNotNullParameter(deepLink, "$this$deepLink");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t1 t1Var) {
            c(t1Var);
            return Unit.f312394a;
        }
    }

    public a2(@NotNull q3<? extends D> navigator, @androidx.annotation.d0 int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f70611a = navigator;
        this.f70612b = i10;
        this.f70613c = str;
        this.f70616f = new LinkedHashMap();
        this.f70617g = new ArrayList();
        this.f70618h = new LinkedHashMap();
    }

    @kotlin.l(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int i10, @NotNull Function1<? super f0, Unit> actionBuilder) {
        Intrinsics.checkNotNullParameter(actionBuilder, "actionBuilder");
        Map<Integer, e0> map = this.f70618h;
        Integer numValueOf = Integer.valueOf(i10);
        f0 f0Var = new f0();
        actionBuilder.invoke(f0Var);
        map.put(numValueOf, f0Var.a());
    }

    public final void b(@NotNull String name, @NotNull j0 argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f70616f.put(name, argument);
    }

    public final void c(@NotNull String name, @NotNull Function1<? super k0, Unit> argumentBuilder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argumentBuilder, "argumentBuilder");
        Map<String, j0> map = this.f70616f;
        k0 k0Var = new k0();
        argumentBuilder.invoke(k0Var);
        map.put(name, k0Var.a());
    }

    @NotNull
    public D d() {
        D d10 = (D) o();
        d10.p0(this.f70615e);
        for (Map.Entry<String, j0> entry : this.f70616f.entrySet()) {
            d10.d(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.f70617g.iterator();
        while (it.hasNext()) {
            d10.i((o1) it.next());
        }
        for (Map.Entry<Integer, e0> entry2 : this.f70618h.entrySet()) {
            d10.h0(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.f70613c;
        if (str != null) {
            d10.t0(str);
        }
        int i10 = this.f70612b;
        if (i10 != -1) {
            d10.m0(i10);
        }
        return d10;
    }

    public final void e(@NotNull o1 navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.f70617g.add(navDeepLink);
    }

    public final void f(@NotNull String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        this.f70617g.add(new o1(uriPattern));
    }

    public final /* synthetic */ <T> void g(String basePath, Function1<? super t1, Unit> navDeepLink) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        i(kotlin.jvm.internal.j1.d(Object.class), basePath, navDeepLink);
    }

    public final void h(@NotNull Function1<? super t1, Unit> navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<o1> list = this.f70617g;
        t1 t1Var = new t1();
        navDeepLink.invoke(t1Var);
        list.add(t1Var.a());
    }

    public final <T> void i(@NotNull kotlin.reflect.d<T> route, @NotNull String basePath, @NotNull Function1<? super t1, Unit> navDeepLink) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        if (this.f70614d == null) {
            throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
        }
        KSerializer kSerializerI = kotlinx.serialization.m0.i(route);
        Map<kotlin.reflect.s, ? extends d3<?>> map = this.f70614d;
        Map<kotlin.reflect.s, ? extends d3<?>> map2 = null;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeMap");
            map = null;
        }
        for (b0 b0Var : androidx.navigation.serialization.p.l(kSerializerI, map)) {
            j0 j0Var = this.f70616f.get(b0Var.d());
            if (j0Var == null || !Intrinsics.areEqual(j0Var.b(), b0Var.c().b())) {
                throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + b0Var.d() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
            }
        }
        Map<kotlin.reflect.s, ? extends d3<?>> map3 = this.f70614d;
        if (map3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typeMap");
        } else {
            map2 = map3;
        }
        e(u1.c(route, basePath, map2, navDeepLink));
    }

    @oj.i(name = "deepLinkSafeArgs")
    public final /* synthetic */ <T> void j(String basePath) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        i(kotlin.jvm.internal.j1.d(Object.class), basePath, a.f70619a);
    }

    public final int k() {
        return this.f70612b;
    }

    @Nullable
    public final CharSequence l() {
        return this.f70615e;
    }

    @NotNull
    protected final q3<? extends D> m() {
        return this.f70611a;
    }

    @Nullable
    public final String n() {
        return this.f70613c;
    }

    @NotNull
    protected D o() {
        return (D) this.f70611a.c();
    }

    public final void p(@Nullable CharSequence charSequence) {
        this.f70615e = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "Use routes to build your NavDestination instead", replaceWith = @kotlin.b1(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public a2(@NotNull q3<? extends D> navigator, @androidx.annotation.d0 int i10) {
        this(navigator, i10, (String) null);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a2(@NotNull q3<? extends D> navigator, @Nullable String str) {
        this(navigator, -1, str);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a2(@NotNull q3<? extends D> navigator, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        KSerializer kSerializerI;
        KSerializer kSerializerI2;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        int iK = (dVar == null || (kSerializerI2 = kotlinx.serialization.m0.i(dVar)) == null) ? -1 : androidx.navigation.serialization.p.k(kSerializerI2);
        String strQ = null;
        if (dVar != null && (kSerializerI = kotlinx.serialization.m0.i(dVar)) != null) {
            strQ = androidx.navigation.serialization.p.q(kSerializerI, typeMap, null, 2, null);
        }
        this(navigator, iK, strQ);
        if (dVar != null) {
            for (b0 b0Var : androidx.navigation.serialization.p.l(kotlinx.serialization.m0.i(dVar), typeMap)) {
                this.f70616f.put(b0Var.d(), b0Var.c());
            }
        }
        this.f70614d = typeMap;
    }
}
