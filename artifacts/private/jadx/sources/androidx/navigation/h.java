package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b2
public final class h extends a2<g.b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private Context f71011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f71012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private kotlin.reflect.d<? extends Activity> f71013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f71014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Uri f71015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f71016n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @kotlin.b1(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public h(@NotNull g navigator, @androidx.annotation.d0 int i10) {
        super(navigator, i10);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f71011i = navigator.t();
    }

    public final void A(@Nullable String str) {
        this.f71012j = str;
    }

    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public g.b d() {
        g.b bVar = (g.b) super.d();
        bVar.O0(this.f71012j);
        kotlin.reflect.d<? extends Activity> dVar = this.f71013k;
        if (dVar != null) {
            bVar.J0(new ComponentName(this.f71011i, (Class<?>) oj.b.e(dVar)));
        }
        bVar.I0(this.f71014l);
        bVar.K0(this.f71015m);
        bVar.L0(this.f71016n);
        return bVar;
    }

    @Nullable
    public final String r() {
        return this.f71014l;
    }

    @Nullable
    public final kotlin.reflect.d<? extends Activity> s() {
        return this.f71013k;
    }

    @Nullable
    public final Uri t() {
        return this.f71015m;
    }

    @Nullable
    public final String u() {
        return this.f71016n;
    }

    @Nullable
    public final String v() {
        return this.f71012j;
    }

    public final void w(@Nullable String str) {
        this.f71014l = str;
    }

    public final void x(@Nullable kotlin.reflect.d<? extends Activity> dVar) {
        this.f71013k = dVar;
    }

    public final void y(@Nullable Uri uri) {
        this.f71015m = uri;
    }

    public final void z(@Nullable String str) {
        this.f71016n = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull g navigator, @NotNull String route) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f71011i = navigator.t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull g navigator, @NotNull kotlin.reflect.d<? extends Object> route, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        super(navigator, route, typeMap);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71011i = navigator.t();
    }
}
