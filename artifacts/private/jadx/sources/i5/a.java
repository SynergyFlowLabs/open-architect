package i5;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1921a f286986d = new C1921a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f286987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f286988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private float[] f286989c;

    /* JADX INFO: renamed from: i5.a$a, reason: collision with other inner class name */
    public static final class C1921a {
        public /* synthetic */ C1921a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            int lastIndex = ArraysKt.getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    i10 *= iArr[i11];
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }

        private C1921a() {
        }
    }

    public a(@NotNull int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f286987a = shape;
        int iB = f286986d.b(shape);
        this.f286988b = iB;
        this.f286989c = new float[iB];
    }

    @NotNull
    public final float[] a() {
        return this.f286989c;
    }

    public final int b(int i10) {
        return this.f286987a[i10];
    }

    public final int c() {
        return this.f286987a.length;
    }

    public final void d(@NotNull int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f286987a = shape;
        int iB = f286986d.b(shape);
        float[] fArr = new float[iB];
        System.arraycopy(this.f286989c, 0, fArr, 0, Math.min(this.f286988b, iB));
        this.f286989c = fArr;
        this.f286988b = iB;
    }
}
