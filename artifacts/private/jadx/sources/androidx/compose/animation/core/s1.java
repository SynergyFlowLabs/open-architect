package androidx.compose.animation.core;

import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1072:1\n382#2,4:1073\n354#2,6:1077\n364#2,3:1084\n367#2,9:1088\n386#2:1097\n425#2:1098\n425#2:1099\n1399#3:1083\n1270#3:1087\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n763#1:1073,4\n763#1:1077,6\n763#1:1084,3\n763#1:1088,9\n763#1:1097\n767#1:1098\n770#1:1099\n763#1:1083\n763#1:1087\n*E\n"})
public final class s1<T> implements k0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13279c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a<T> f13280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13281b;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a<T> extends r1<T, q1.a<T>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f13282e = 8;

        public a() {
            super(null);
        }

        @Override // androidx.compose.animation.core.r1
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public q1.a<T> c(T t10) {
            return new q1.a<>(t10, null, 0, 6, null);
        }
    }

    public s1(@NotNull a<T> aVar) {
        this.f13280a = aVar;
        this.f13281b = Float.NaN;
    }

    @NotNull
    public final a<T> h() {
        return this.f13280a;
    }

    public s1(@NotNull a<T> aVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this(aVar);
        this.f13281b = f10;
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    public <V extends w> x4<V> a(@NotNull z3<T, V> z3Var) {
        int[] iArr;
        Object[] objArr;
        androidx.collection.t1<q1.a<T>> t1VarF = this.f13280a.f();
        androidx.collection.r1 r1Var = new androidx.collection.r1(t1VarF.t() + 2);
        androidx.collection.t1 t1Var = new androidx.collection.t1(t1VarF.t());
        int[] iArr2 = t1VarF.f12302b;
        Object[] objArr2 = t1VarF.f12303c;
        long[] jArr = t1VarF.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr2[i14];
                            q1.a aVar = (q1.a) objArr2[i14];
                            r1Var.b0(i15);
                            t1Var.j0(i15, new Pair(z3Var.a().invoke(aVar.b()), aVar.a()));
                        }
                        j10 >>= i11;
                        i13++;
                        i11 = i11;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!t1VarF.e(0)) {
            r1Var.a0(0, 0);
        }
        if (!t1VarF.e(this.f13280a.e())) {
            r1Var.b0(this.f13280a.e());
        }
        r1Var.x0();
        return new e5(r1Var, t1Var, this.f13280a.e(), this.f13280a.d(), this.f13281b);
    }
}
