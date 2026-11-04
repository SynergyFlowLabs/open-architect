package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.w0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class f0<T> implements ComposeAnimation, e0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42414e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3<T> f42415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Object> f42416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f42417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42418d = ComposeAnimationType.TRANSITION_ANIMATION;

    public f0(@NotNull l3<T> l3Var, @NotNull Set<? extends Object> set, @Nullable String str) {
        this.f42415a = l3Var;
        this.f42416b = set;
        this.f42417c = str;
    }

    @Override // androidx.compose.ui.tooling.animation.e0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l3<T> b() {
        return this.f42415a;
    }

    @Nullable
    public String c() {
        return this.f42417c;
    }

    @NotNull
    public Set<Object> d() {
        return this.f42416b;
    }

    @NotNull
    public ComposeAnimationType e() {
        return this.f42418d;
    }
}
