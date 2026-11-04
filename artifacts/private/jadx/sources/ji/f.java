package ji;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<e> f307443a = new ArrayList();

    @NotNull
    public final e a() {
        return this.f307443a.size() == 1 ? (e) CollectionsKt.first((List) this.f307443a) : new t(this.f307443a);
    }

    @NotNull
    public final f b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307443a.add(new v(value));
        return this;
    }

    @NotNull
    public final f c(@NotNull e grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        this.f307443a.add(grammar);
        return this;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        this.f307443a.add(new v(str));
    }

    public final void e(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        this.f307443a.add(eVar);
    }

    public final void f(@NotNull Function0<? extends e> function0) {
        Intrinsics.checkNotNullParameter(function0, "<this>");
        this.f307443a.add(function0.invoke());
    }
}
