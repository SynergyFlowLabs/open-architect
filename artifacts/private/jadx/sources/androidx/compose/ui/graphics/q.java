package androidx.compose.ui.graphics;

import android.graphics.Path;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPathIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,88:1\n36#2,5:89\n*S KotlinDebug\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n*L\n38#1:89,5\n*E\n"})
final class q implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2 f38124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q2.a f38125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final float[] f38127d = new float[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.graphics.path.a f38128e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38130b;

        static {
            int[] iArr = new int[q2.a.values().length];
            try {
                iArr[q2.a.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q2.a.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38129a = iArr;
            int[] iArr2 = new int[v2.a.values().length];
            try {
                iArr2[v2.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v2.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[v2.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v2.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[v2.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f38130b = iArr2;
        }
    }

    public q(@NotNull k2 k2Var, @NotNull q2.a aVar, float f10) {
        androidx.graphics.path.a.EnumC0469a enumC0469a;
        this.f38124a = k2Var;
        this.f38125b = aVar;
        this.f38126c = f10;
        k2 k2VarS = S();
        if (!(k2VarS instanceof n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathZ = ((n) k2VarS).Z();
        int i10 = a.f38129a[V().ordinal()];
        if (i10 == 1) {
            enumC0469a = androidx.graphics.path.a.EnumC0469a.AsConic;
        } else {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            enumC0469a = androidx.graphics.path.a.EnumC0469a.AsQuadratics;
        }
        this.f38128e = new androidx.graphics.path.a(pathZ, enumC0469a, U());
    }

    @Override // androidx.compose.ui.graphics.q2
    @NotNull
    public k2 S() {
        return this.f38124a;
    }

    @Override // androidx.compose.ui.graphics.q2
    public float U() {
        return this.f38126c;
    }

    @Override // androidx.compose.ui.graphics.q2
    @NotNull
    public q2.a V() {
        return this.f38125b;
    }

    @Override // androidx.compose.ui.graphics.q2
    @NotNull
    public v2.a Z(@NotNull float[] fArr, int i10) {
        return r.d(this.f38128e.f(fArr, i10));
    }

    @Override // androidx.compose.ui.graphics.q2, java.util.Iterator
    public boolean hasNext() {
        return this.f38128e.hasNext();
    }

    @Override // androidx.compose.ui.graphics.q2
    public int q0(boolean z10) {
        return this.f38128e.q0(z10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    @Override // java.util.Iterator
    @NotNull
    public v2 next() {
        v2.a aVarD;
        float[] fArr;
        float[] fArr2;
        float f10;
        float[] fArr3 = this.f38127d;
        if (fArr3.length >= 8 && (aVarD = r.d(this.f38128e.f(fArr3, 0))) != v2.a.Done) {
            if (aVarD == v2.a.Close) {
                return w2.a();
            }
            int i10 = a.f38130b[aVarD.ordinal()];
            int i11 = 5 << 2;
            if (i10 == 1) {
                fArr = new float[]{fArr3[0], fArr3[1]};
            } else if (i10 == 2) {
                fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3]};
            } else {
                if (i10 != 3 && i10 != 4) {
                    if (i10 != 5) {
                        fArr2 = new float[0];
                    } else {
                        fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5], fArr3[6], fArr3[7]};
                    }
                    if (aVarD == v2.a.Conic) {
                        f10 = fArr3[6];
                    } else {
                        f10 = 0.0f;
                    }
                    return new v2(aVarD, fArr2, f10);
                }
                fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5]};
            }
            fArr2 = fArr;
            if (aVarD == v2.a.Conic) {
                f10 = fArr3[6];
            } else {
                f10 = 0.0f;
            }
            return new v2(aVarD, fArr2, f10);
        }
        return w2.b();
    }
}
