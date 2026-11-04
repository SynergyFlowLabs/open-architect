package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final T[] f312722c;

    public a1(int i10) {
        this.f312720a = i10;
        this.f312722c = (T[]) new Object[i10];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.f312722c;
        int i10 = this.f312721b;
        this.f312721b = i10 + 1;
        tArr[i10] = spreadArgument;
    }

    protected final int b() {
        return this.f312721b;
    }

    protected abstract int c(@NotNull T t10);

    protected final void e(int i10) {
        this.f312721b = i10;
    }

    protected final int f() {
        int i10 = this.f312720a - 1;
        int iC = 0;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                T t10 = this.f312722c[i11];
                iC += t10 != null ? c(t10) : 1;
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return iC;
    }

    @NotNull
    protected final T g(@NotNull T values, @NotNull T result) {
        int i10;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i11 = this.f312720a - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            int i14 = 0;
            i10 = 0;
            while (true) {
                T t10 = this.f312722c[i13];
                if (t10 != null) {
                    if (i14 < i13) {
                        int i15 = i13 - i14;
                        System.arraycopy(values, i14, result, i10, i15);
                        i10 += i15;
                    }
                    int iC = c(t10);
                    System.arraycopy(t10, 0, result, i10, iC);
                    i10 += iC;
                    i14 = i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13++;
            }
            i12 = i14;
        } else {
            i10 = 0;
        }
        int i16 = this.f312720a;
        if (i12 < i16) {
            System.arraycopy(values, i12, result, i10, i16 - i12);
        }
        return result;
    }
}
