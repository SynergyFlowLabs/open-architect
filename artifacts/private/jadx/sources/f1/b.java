package f1;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.collection.j3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.p;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,228:1\n53#2,4:229\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:229,4\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f274919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f274920b = 100.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final float[] f274921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    private static volatile j3<a> f274922d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object[] f274923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f274924f = 1.03f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f274925g;

    static {
        b bVar = new b();
        f274919a = bVar;
        f274921c = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b};
        f274922d = new j3<>(0, 1, null);
        Object[] objArr = new Object[0];
        f274923e = objArr;
        synchronized (objArr) {
            try {
                bVar.j(f274922d, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, f274920b}));
                bVar.j(f274922d, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, f274920b}));
                bVar.j(f274922d, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, f274920b}));
                bVar.j(f274922d, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, f274920b}));
                bVar.j(f274922d, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, f274920b}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, f274920b}));
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if ((bVar.g(f274922d.n(0)) - 0.01f > 1.03f ? 1 : 0) == 0) {
            p.d("You should only apply non-linear scaling to font scales > 1");
        }
        f274925g = 8;
    }

    private b() {
    }

    private final a a(a aVar, a aVar2, float f10) {
        float[] fArr = f274921c;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f274921c[i10];
            fArr2[i10] = d.f274930a.b(aVar.b(f11), aVar2.b(f11), f10);
        }
        return new c(f274921c, fArr2);
    }

    private final a c(float f10) {
        return f274922d.g(d(f10));
    }

    private final int d(float f10) {
        return (int) (f10 * f274920b);
    }

    @l1
    public static /* synthetic */ void f() {
    }

    private final float g(int i10) {
        return i10 / f274920b;
    }

    private final void i(float f10, a aVar) {
        synchronized (f274923e) {
            try {
                j3<a> j3VarClone = f274922d.clone();
                f274919a.j(j3VarClone, f10, aVar);
                f274922d = j3VarClone;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void j(j3<a> j3Var, float f10, a aVar) {
        j3Var.o(d(f10), aVar);
    }

    @androidx.annotation.d
    @Nullable
    public final a b(float f10) {
        a aVarZ;
        if (!h(f10)) {
            return null;
        }
        a aVarC = f274919a.c(f10);
        if (aVarC != null) {
            return aVarC;
        }
        int iJ = f274922d.j(d(f10));
        if (iJ >= 0) {
            return f274922d.z(iJ);
        }
        int i10 = -(iJ + 1);
        int i11 = i10 - 1;
        float fG = 1.0f;
        if (i10 >= f274922d.size()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f10});
            i(f10, cVar);
            return cVar;
        }
        if (i11 < 0) {
            float[] fArr = f274921c;
            aVarZ = new c(fArr, fArr);
        } else {
            fG = g(f274922d.n(i11));
            aVarZ = f274922d.z(i11);
        }
        a aVarA = a(aVarZ, f274922d.z(i10), d.f274930a.a(0.0f, 1.0f, fG, g(f274922d.n(i10)), f10));
        i(f10, aVarA);
        return aVarA;
    }

    @NotNull
    public final j3<a> e() {
        return f274922d;
    }

    @androidx.annotation.d
    public final boolean h(float f10) {
        return f10 >= 1.03f;
    }

    public final void k(@NotNull j3<a> j3Var) {
        f274922d = j3Var;
    }
}
