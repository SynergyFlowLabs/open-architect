package androidx.navigation.fragment;

import androidx.annotation.d0;
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
@SourceDebugExtension({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
public final class d extends a2<c.b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private kotlin.reflect.d<? extends androidx.fragment.app.m> f70931i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @b1(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public d(@NotNull c navigator, @d0 int i10, @NotNull kotlin.reflect.d<? extends androidx.fragment.app.m> fragmentClass) {
        super(navigator, i10);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70931i = fragmentClass;
    }

    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c.b d() {
        c.b bVar = (c.b) super.d();
        String name = oj.b.e(this.f70931i).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.z0(name);
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull c navigator, @NotNull String route, @NotNull kotlin.reflect.d<? extends androidx.fragment.app.m> fragmentClass) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70931i = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull c navigator, @NotNull kotlin.reflect.d<? extends Object> route, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull kotlin.reflect.d<? extends androidx.fragment.app.m> fragmentClass) {
        super(navigator, route, typeMap);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        this.f70931i = fragmentClass;
    }
}
