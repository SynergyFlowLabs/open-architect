package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1038:1\n119#2,10:1039\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n*L\n187#1:1039,10\n*E\n"})
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final int[] f13342a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final float[] f13343b = new float[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b0 f13344c = new b0(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1[] f13345a;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(w wVar, float f10, float f11) {
            int iB = wVar.b();
            d1[] d1VarArr = new d1[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                d1VarArr[i10] = new d1(f10, f11, wVar.a(i10));
            }
            this.f13345a = d1VarArr;
        }

        @Override // androidx.compose.animation.core.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 get(int i10) {
            return this.f13345a[i10];
        }
    }

    public static final class b implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1 f13346a;

        b(float f10, float f11) {
            this.f13346a = new d1(f10, f11, 0.0f, 4, null);
        }

        @Override // androidx.compose.animation.core.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 get(int i10) {
            return this.f13346a;
        }
    }

    public static final long e(@NotNull x4<?> x4Var, long j10) {
        long jK = j10 - ((long) x4Var.k());
        long jA = x4Var.a();
        if (jK < 0) {
            jK = 0;
        }
        return jK > jA ? jA : jK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends w> y f(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends w> long g(@NotNull u4<V> u4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return u4Var.c(v10, v11, v12) / 1000000;
    }

    @NotNull
    public static final <V extends w> V h(@NotNull u4<V> u4Var, long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) u4Var.i(j10 * 1000000, v10, v11, v12);
    }
}
