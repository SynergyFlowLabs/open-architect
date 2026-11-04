package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s f39253a = new s(a.f39255a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final s f39254b = new s(C0301b.f39256a);

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39255a = new a();

        a() {
            super(2, kotlin.math.b.class, "min", "min(II)I", 1);
        }

        public final Integer X(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return X(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0301b extends kotlin.jvm.internal.g0 implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0301b f39256a = new C0301b();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0301b() {
            super(2, kotlin.math.b.class, "max", "max(II)I", 1);
            int i10 = 3 >> 1;
        }

        public final Integer X(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return X(num.intValue(), num2.intValue());
        }
    }

    @NotNull
    public static final s a() {
        return f39253a;
    }

    @NotNull
    public static final s b() {
        return f39254b;
    }

    public static final int c(@NotNull androidx.compose.ui.layout.a aVar, int i10, int i11) {
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
