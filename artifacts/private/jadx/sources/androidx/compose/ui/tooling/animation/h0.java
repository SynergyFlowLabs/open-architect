package androidx.compose.ui.tooling.animation;

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
@SourceDebugExtension({"SMAP\nUnsupportedComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n12574#2,2:50\n*S KotlinDebug\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n*L\n37#1:50,2\n*E\n"})
public final class h0 implements ComposeAnimation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f42421e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42422f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f42423g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f42424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f42426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f42427d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final h0 a(@Nullable String str) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new h0(str, defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return h0.f42423g;
        }

        @lm.n
        public final void c(boolean z10) {
            h0.f42423g = z10;
        }

        private a() {
        }
    }

    static {
        boolean z10 = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (Intrinsics.areEqual(composeAnimationType.name(), t8.a.f376227i)) {
                z10 = true;
                break;
            }
        }
        f42423g = z10;
    }

    public /* synthetic */ h0(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public Object c() {
        return this.f42426c;
    }

    @Nullable
    public String d() {
        return this.f42424a;
    }

    @NotNull
    public Set<Integer> e() {
        return this.f42427d;
    }

    @NotNull
    public ComposeAnimationType f() {
        return this.f42425b;
    }

    private h0(String str) {
        this.f42424a = str;
        this.f42425b = ComposeAnimationType.UNSUPPORTED;
        this.f42426c = 0;
        this.f42427d = SetsKt.emptySet();
    }
}
