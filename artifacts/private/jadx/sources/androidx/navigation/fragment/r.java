package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.a2;
import androidx.navigation.b2;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b2
@SourceDebugExtension({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class r extends a2<q.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private kotlin.reflect.d<? extends Fragment> f70964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @b1(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public r(@NotNull q navigator, @d0 int i10, @NotNull kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, i10);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70964i = fragmentClass;
    }

    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public q.c d() {
        q.c cVar = (q.c) super.d();
        String name = oj.b.e(this.f70964i).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        cVar.z0(name);
        return cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull q navigator, @NotNull String route, @NotNull kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70964i = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull q navigator, @NotNull kotlin.reflect.d<? extends Object> route, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route, typeMap);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70964i = fragmentClass;
    }
}
