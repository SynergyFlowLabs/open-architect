package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b2
@SourceDebugExtension({"SMAP\nNavGraphBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,175:1\n115#2:176\n115#2:177\n115#2:178\n115#2:179\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.android.kt\nandroidx/navigation/NavGraphBuilder\n*L\n100#1:176\n109#1:177\n119#1:178\n129#1:179\n*E\n"})
public class g2 extends a2<e2> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final r3 f71004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.d0
    private int f71005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f71006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private kotlin.reflect.d<?> f71007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Object f71008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final List<y1> f71009n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.b1(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public g2(@NotNull r3 provider, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11) {
        super(provider.e(o2.class), i10);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f71009n = new ArrayList();
        this.f71004i = provider;
        this.f71005j = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(y1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strM = it.M();
        Intrinsics.checkNotNull(strM);
        return strM;
    }

    public final void r(@NotNull y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f71009n.add(destination);
    }

    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e2 d() {
        e2 e2Var = (e2) super.d();
        e2Var.A0(this.f71009n);
        int i10 = this.f71005j;
        if (i10 == 0 && this.f71006k == null && this.f71007l == null && this.f71008m == null) {
            if (n() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f71006k;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            e2Var.o1(str);
            return e2Var;
        }
        kotlin.reflect.d<?> dVar = this.f71007l;
        if (dVar != null) {
            Intrinsics.checkNotNull(dVar);
            e2Var.r1(kotlinx.serialization.m0.i(dVar), new Function1() { // from class: androidx.navigation.f2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g2.t((y1) obj);
                }
            });
            return e2Var;
        }
        Object obj = this.f71008m;
        if (obj == null) {
            e2Var.m1(i10);
            return e2Var;
        }
        Intrinsics.checkNotNull(obj);
        e2Var.n1(obj);
        return e2Var;
    }

    public final <D extends y1> void u(@NotNull a2<? extends D> navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        this.f71009n.add(navDestination.d());
    }

    @NotNull
    public final r3 v() {
        return this.f71004i;
    }

    public final void w(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        r(y1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(@NotNull r3 provider, @NotNull String startDestination, @Nullable String str) {
        super(provider.e(o2.class), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.f71009n = new ArrayList();
        this.f71004i = provider;
        this.f71006k = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(@NotNull r3 provider, @NotNull kotlin.reflect.d<?> startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        super(provider.e(o2.class), dVar, typeMap);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71009n = new ArrayList();
        this.f71004i = provider;
        this.f71007l = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(@NotNull r3 provider, @NotNull Object startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        super(provider.e(o2.class), dVar, typeMap);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71009n = new ArrayList();
        this.f71004i = provider;
        this.f71008m = startDestination;
    }
}
