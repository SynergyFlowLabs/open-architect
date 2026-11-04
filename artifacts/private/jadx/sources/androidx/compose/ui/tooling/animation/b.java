package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.w0;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimatedContentComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,63:1\n12574#2,2:64\n*S KotlinDebug\n*F\n+ 1 AnimatedContentComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation\n*L\n40#1:64,2\n*E\n"})
public final class b<T> implements ComposeAnimation, e0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f42387e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42388f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f42389g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3<T> f42390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Object> f42391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f42392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42393d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return b.f42389g;
        }

        @Nullable
        public final b<?> b(@NotNull l3<?> l3Var) {
            Object objP;
            Set of2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!a() || (objP = l3Var.p()) == null) {
                return null;
            }
            Object[] enumConstants = objP.getClass().getEnumConstants();
            if (enumConstants == null || (of2 = ArraysKt.toSet(enumConstants)) == null) {
                of2 = SetsKt.setOf(objP);
            }
            String strS = l3Var.s();
            if (strS == null) {
                strS = j1.d(objP.getClass()).Q();
            }
            return new b<>(l3Var, of2, strS, defaultConstructorMarker);
        }

        @lm.n
        public final void c(boolean z10) {
            b.f42389g = z10;
        }

        private a() {
        }
    }

    static {
        boolean z10 = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (Intrinsics.areEqual(composeAnimationType.name(), "ANIMATED_CONTENT")) {
                z10 = true;
                break;
            }
        }
        f42389g = z10;
    }

    public /* synthetic */ b(l3 l3Var, Set set, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(l3Var, set, str);
    }

    @Override // androidx.compose.ui.tooling.animation.e0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l3<T> d() {
        return this.f42390a;
    }

    @Nullable
    public String e() {
        return this.f42392c;
    }

    @NotNull
    public Set<Object> f() {
        return this.f42391b;
    }

    @NotNull
    public ComposeAnimationType g() {
        return this.f42393d;
    }

    private b(l3<T> l3Var, Set<? extends Object> set, String str) {
        this.f42390a = l3Var;
        this.f42391b = set;
        this.f42392c = str;
        this.f42393d = ComposeAnimationType.ANIMATED_CONTENT;
    }
}
