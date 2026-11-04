package kotlinx.coroutines;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum u0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f315659f = kotlin.enums.c.c(k());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f315660a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f315660a = iArr;
        }
    }

    static {
        int i10 = 0 ^ 3;
    }

    @NotNull
    public static kotlin.enums.a<u0> l() {
        return f315659f;
    }

    @k2
    public static /* synthetic */ void p() {
    }

    @k2
    public final <R, T> void n(@NotNull Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, R r10, @NotNull kotlin.coroutines.d<? super T> dVar) {
        int i10 = a.f315660a[ordinal()];
        if (i10 == 1) {
            bk.a.e(function2, r10, dVar);
            return;
        }
        if (i10 == 2) {
            kotlin.coroutines.f.i(function2, r10, dVar);
        } else if (i10 == 3) {
            bk.b.c(function2, r10, dVar);
        } else if (i10 != 4) {
            throw new kotlin.k0();
        }
    }

    public final boolean o() {
        return this == LAZY;
    }
}
