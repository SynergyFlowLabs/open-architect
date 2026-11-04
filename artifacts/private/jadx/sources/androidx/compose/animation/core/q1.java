package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1072:1\n382#2,4:1073\n354#2,6:1077\n364#2,3:1084\n367#2,9:1088\n386#2:1097\n425#2:1098\n425#2:1099\n1399#3:1083\n1270#3:1087\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n644#1:1073,4\n644#1:1077,6\n644#1:1084,3\n644#1:1088,9\n644#1:1097\n654#1:1098\n657#1:1099\n644#1:1083\n644#1:1087\n*E\n"})
public final class q1<T> implements k0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13235b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b<T> f13236a;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a<T> extends p1<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f13237e = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13238d;

        public /* synthetic */ a(Object obj, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l0Var, i10);
        }

        public final int e() {
            return this.f13238d;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(aVar.b(), b()) && Intrinsics.areEqual(aVar.a(), a()) && a0.g(aVar.f13238d, this.f13238d);
        }

        public final void f(int i10) {
            this.f13238d = i10;
        }

        public int hashCode() {
            T tB = b();
            return ((((tB != null ? tB.hashCode() : 0) * 31) + a0.h(this.f13238d)) * 31) + a().hashCode();
        }

        public /* synthetic */ a(Object obj, l0 l0Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? u0.e() : l0Var, (i11 & 4) != 0 ? a0.f12738b.c() : i10, null);
        }

        private a(T t10, l0 l0Var, int i10) {
            super(t10, l0Var, null);
            this.f13238d = i10;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1072:1\n1#2:1073\n26#3:1074\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n*L\n594#1:1074\n*E\n"})
    public static final class b<T> extends r1<T, a<T>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f13239e = 8;

        public b() {
            super(null);
        }

        @Override // androidx.compose.animation.core.r1
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<T> a(T t10, @androidx.annotation.g0(from = 0) int i10) {
            a<T> aVar = new a<>(t10, null, 0, 6, null);
            f().j0(i10, aVar);
            return aVar;
        }

        @Override // androidx.compose.animation.core.r1
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> b(T t10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
            return a(t10, Math.round(e() * f10));
        }

        @Override // androidx.compose.animation.core.r1
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<T> c(T t10) {
            return new a<>(t10, null, 0, 6, null);
        }

        @NotNull
        public final a<T> m(@NotNull a<T> aVar, int i10) {
            aVar.f(i10);
            return aVar;
        }

        @kotlin.l(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @kotlin.b1(expression = "this using easing", imports = {}))
        public final void n(@NotNull a<T> aVar, @NotNull l0 l0Var) {
            aVar.c(l0Var);
        }
    }

    public q1(@NotNull b<T> bVar) {
        this.f13236a = bVar;
    }

    @NotNull
    public final b<T> h() {
        return this.f13236a;
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends w> d5<V> a(@NotNull z3<T, V> z3Var) {
        long[] jArr;
        int[] iArr;
        androidx.collection.r1 r1Var = new androidx.collection.r1(this.f13236a.f().t() + 2);
        androidx.collection.t1 t1Var = new androidx.collection.t1(this.f13236a.f().t());
        androidx.collection.t1<a<T>> t1VarF = this.f13236a.f();
        int[] iArr2 = t1VarF.f12302b;
        Object[] objArr = t1VarF.f12303c;
        long[] jArr2 = t1VarF.f12301a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr2[i14];
                            a aVar = (a) objArr[i14];
                            r1Var.b0(i15);
                            t1Var.j0(i15, new c5(z3Var.a().invoke(aVar.b()), aVar.a(), aVar.e(), null));
                        }
                        j10 >>= i11;
                        i13++;
                        i11 = i11;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.f13236a.f().e(0)) {
            r1Var.a0(0, 0);
        }
        if (!this.f13236a.f().e(this.f13236a.e())) {
            r1Var.b0(this.f13236a.e());
        }
        r1Var.x0();
        return new d5<>(r1Var, t1Var, this.f13236a.e(), this.f13236a.d(), u0.e(), a0.f12738b.c(), null);
    }
}
