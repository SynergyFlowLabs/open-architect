package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.i1;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.w0;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInfiniteTransitionComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,65:1\n12574#2,2:66\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n49#1:66,2\n*E\n"})
public final class s implements ComposeAnimation {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f42472f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42473g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f42474h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0<Long> f42475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f42476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<Object> f42478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f42479e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return s.f42474h;
        }

        @Nullable
        public final s b(@NotNull q.h hVar) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (a()) {
                return new s(hVar.f(), hVar.e(), defaultConstructorMarker);
            }
            return null;
        }

        @lm.n
        public final void c(boolean z10) {
            s.f42474h = z10;
        }

        private a() {
        }
    }

    static {
        boolean z10 = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (Intrinsics.areEqual(composeAnimationType.name(), "INFINITE_TRANSITION")) {
                z10 = true;
                break;
            }
        }
        f42474h = z10;
    }

    public /* synthetic */ s(d0 d0Var, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, i1Var);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i1 d() {
        return this.f42476b;
    }

    @NotNull
    public String e() {
        return this.f42479e;
    }

    @NotNull
    public Set<Object> f() {
        return this.f42478d;
    }

    @NotNull
    public ComposeAnimationType g() {
        return this.f42477c;
    }

    public final void h(long j10) {
        this.f42475a.setValue(Long.valueOf(j10));
    }

    private s(d0<Long> d0Var, i1 i1Var) {
        this.f42475a = d0Var;
        this.f42476b = i1Var;
        this.f42477c = ComposeAnimationType.INFINITE_TRANSITION;
        int i10 = 4 | 0;
        this.f42478d = SetsKt.setOf(0);
        this.f42479e = d().i();
    }
}
