package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.w;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.w0;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimateXAsStateComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n1#2:73\n12574#3,2:74\n*S KotlinDebug\n*F\n+ 1 AnimateXAsStateComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation\n*L\n54#1:74,2\n*E\n"})
public final class a<T, V extends androidx.compose.animation.core.w> implements ComposeAnimation {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C0342a f42376g = new C0342a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42377h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f42378i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0<T> f42379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<T> f42380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<T, V> f42381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ComposeAnimationType f42382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<Object> f42383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f42384f;

    /* JADX INFO: renamed from: androidx.compose.ui.tooling.animation.a$a, reason: collision with other inner class name */
    public static final class C0342a {
        public /* synthetic */ C0342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return a.f42378i;
        }

        @Nullable
        public final <T, V extends androidx.compose.animation.core.w> a<?, ?> b(@NotNull q.c<T, V> cVar) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (a() && cVar.f().v() != null) {
                return new a<>(cVar.h(), cVar.g(), cVar.f(), defaultConstructorMarker);
            }
            return null;
        }

        @lm.n
        public final void c(boolean z10) {
            a.f42378i = z10;
        }

        private C0342a() {
        }
    }

    static {
        boolean z10 = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (Intrinsics.areEqual(composeAnimationType.name(), "ANIMATE_X_AS_STATE")) {
                z10 = true;
                break;
            }
        }
        f42378i = z10;
    }

    public /* synthetic */ a(d0 d0Var, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, oVar, cVar);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public androidx.compose.animation.core.c<T, V> d() {
        return this.f42381c;
    }

    @NotNull
    public final androidx.compose.animation.core.o<T> e() {
        return this.f42380b;
    }

    @NotNull
    public String f() {
        return this.f42384f;
    }

    @NotNull
    public Set<Object> g() {
        return this.f42383e;
    }

    @NotNull
    public final d0<T> h() {
        return this.f42379a;
    }

    @NotNull
    public ComposeAnimationType i() {
        return this.f42382d;
    }

    public final void j(@NotNull Object obj) {
        this.f42379a.setValue(obj);
    }

    private a(d0<T> d0Var, androidx.compose.animation.core.o<T> oVar, androidx.compose.animation.core.c<T, V> cVar) {
        Set<Object> set;
        this.f42379a = d0Var;
        this.f42380b = oVar;
        this.f42381c = cVar;
        this.f42382d = ComposeAnimationType.ANIMATE_X_AS_STATE;
        T tV = d().v();
        Intrinsics.checkNotNull(tV, "null cannot be cast to non-null type kotlin.Any");
        Object[] enumConstants = tV.getClass().getEnumConstants();
        this.f42383e = (enumConstants == null || (set = ArraysKt.toSet(enumConstants)) == null) ? SetsKt.setOf(tV) : set;
        this.f42384f = d().o();
    }
}
