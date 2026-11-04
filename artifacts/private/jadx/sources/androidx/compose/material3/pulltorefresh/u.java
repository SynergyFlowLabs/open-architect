package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.t4;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.f0;
import androidx.compose.runtime.saveable.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class u implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32000c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f32002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31999b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c0<u, Float> f32001d = f0.e(new Function2() { // from class: androidx.compose.material3.pulltorefresh.s
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u.h((g0) obj, (u) obj2);
        }
    }, new Function1() { // from class: androidx.compose.material3.pulltorefresh.t
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u.i(((Float) obj).floatValue());
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c0<u, Float> a() {
            return u.f32001d;
        }

        private a() {
        }
    }

    private u(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar) {
        this.f32002a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float h(g0 g0Var, u uVar) {
        return uVar.f32002a.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u i(float f10) {
        return new u(new androidx.compose.animation.core.c(Float.valueOf(f10), t4.P(z.f312833a), null, null, 12, null));
    }

    @Override // androidx.compose.material3.pulltorefresh.r
    public float a() {
        return this.f32002a.v().floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.r
    public boolean b() {
        return this.f32002a.y();
    }

    @Override // androidx.compose.material3.pulltorefresh.r
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objI = androidx.compose.animation.core.c.i(this.f32002a, kotlin.coroutines.jvm.internal.b.e(0.0f), null, null, null, dVar, 14, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Override // androidx.compose.material3.pulltorefresh.r
    @Nullable
    public Object d(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f32002a.C(kotlin.coroutines.jvm.internal.b.e(f10), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Override // androidx.compose.material3.pulltorefresh.r
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objI = androidx.compose.animation.core.c.i(this.f32002a, kotlin.coroutines.jvm.internal.b.e(1.0f), null, null, null, dVar, 14, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    public u() {
        this(new androidx.compose.animation.core.c(Float.valueOf(0.0f), t4.P(z.f312833a), null, null, 12, null));
    }
}
