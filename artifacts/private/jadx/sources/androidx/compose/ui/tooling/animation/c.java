package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.w0;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class c implements ComposeAnimation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42394e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3<Boolean> f42395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f42396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42397c = ComposeAnimationType.ANIMATED_VISIBILITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<c1.a> f42398d;

    public c(@NotNull l3<Boolean> l3Var, @Nullable String str) {
        this.f42395a = l3Var;
        this.f42396b = str;
        c1.a.C0800a c0800a = c1.a.f82371b;
        this.f42398d = SetsKt.setOf((Object[]) new c1.a[]{c1.a.c(c0800a.a()), c1.a.c(c0800a.b())});
    }

    public static /* synthetic */ void d() {
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l3<Boolean> b() {
        return this.f42395a;
    }

    @Nullable
    public final l3<Object> c() {
        Object orNull = CollectionsKt.getOrNull(b().A(), 0);
        if (orNull instanceof l3) {
            return (l3) orNull;
        }
        return null;
    }

    @Nullable
    public String e() {
        return this.f42396b;
    }

    @NotNull
    public Set<c1.a> f() {
        return this.f42398d;
    }

    @NotNull
    public ComposeAnimationType g() {
        return this.f42397c;
    }
}
