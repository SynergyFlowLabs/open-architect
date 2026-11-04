package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class h0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312504a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f312504a = iArr;
        }
    }

    @NotNull
    public static final <T> f0<T> a(@Nullable Object obj, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new l1(initializer, obj);
    }

    @NotNull
    public static <T> f0<T> b(@NotNull j0 mode, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i10 = a.f312504a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new l1(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new d1(initializer);
        }
        if (i10 == 3) {
            return new j2(initializer);
        }
        throw new k0();
    }

    @NotNull
    public static <T> f0<T> c(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new l1(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
