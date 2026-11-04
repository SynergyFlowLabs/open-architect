package r0;

import androidx.compose.runtime.internal.w0;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,725:1\n57#2,4:726\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n290#1:726,4\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f359030i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f359031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f359032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f359033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r0.a[] f359034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f359035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final float[] f359036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f359037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f359038h;

    public enum a {
        Lsq2,
        Impulse;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f359042d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f359042d;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359043a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f359043a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(false, null, 3, 0 == true ? 1 : 0);
        boolean z10 = 0 | 3;
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return f.q(fArr2, fArr, i10, 2, this.f359038h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f359035e + 1) % 20;
        this.f359035e = i10;
        f.s(this.f359034d, i10, j10, f10);
    }

    public final float c() {
        float fH;
        float[] fArr = this.f359036f;
        float[] fArr2 = this.f359037g;
        int i10 = this.f359035e;
        r0.a aVar = this.f359034d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        r0.a aVar2 = aVar;
        while (true) {
            r0.a aVar3 = this.f359034d[i10];
            if (aVar3 == null) {
                break;
            }
            float f10 = aVar.f() - aVar3.f();
            float fAbs = Math.abs(aVar3.f() - aVar2.f());
            r0.a aVar4 = (this.f359032b == a.Lsq2 || this.f359031a) ? aVar3 : aVar;
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = aVar3.e();
            fArr2[i11] = -f10;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            aVar2 = aVar4;
        }
        if (i11 < this.f359033c) {
            return 0.0f;
        }
        int i12 = b.f359043a[this.f359032b.ordinal()];
        if (i12 == 1) {
            fH = f.h(fArr, fArr2, i11, this.f359031a);
        } else {
            if (i12 != 2) {
                throw new k0();
            }
            fH = b(fArr, fArr2, i11);
        }
        return fH * 1000;
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            s0.a.i("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? r.A(fC, f10) : r.t(fC, -f10);
    }

    public final boolean e() {
        return this.f359031a;
    }

    public final void f() {
        ArraysKt.fill$default(this.f359034d, (Object) null, 0, 0, 6, (Object) null);
        int i10 = (2 | 0) ^ 0;
        this.f359035e = 0;
    }

    public d(boolean z10, @NotNull a aVar) {
        this.f359031a = z10;
        this.f359032b = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f359043a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new k0();
            }
            i11 = 3;
        }
        this.f359033c = i11;
        this.f359034d = new r0.a[20];
        this.f359036f = new float[20];
        this.f359037g = new float[20];
        this.f359038h = new float[3];
    }

    public /* synthetic */ d(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }

    public d(boolean z10) {
        this(z10, a.Impulse);
    }
}
