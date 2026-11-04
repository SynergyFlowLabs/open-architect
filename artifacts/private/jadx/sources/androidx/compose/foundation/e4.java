package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(28)
public final class e4 implements d4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e4 f14209b = new e4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f14210c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14211d = 0;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @androidx.annotation.w0(28)
    @SourceDebugExtension({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,190:1\n30#2:191\n80#3:192\n60#3:194\n70#3:197\n65#4:193\n69#4:196\n22#5:195\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl\n*L\n107#1:191\n107#1:192\n114#1:194\n114#1:197\n114#1:193\n114#1:196\n114#1:195\n*E\n"})
    public static class a implements c4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14212b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Magnifier f14213a;

        public a(@NotNull Magnifier magnifier) {
            this.f14213a = magnifier;
        }

        @Override // androidx.compose.foundation.c4
        public long a() {
            return androidx.compose.ui.unit.u.e((((long) this.f14213a.getWidth()) << 32) | (((long) this.f14213a.getHeight()) & com.rabbitmq.client.k0.f265952a));
        }

        @Override // androidx.compose.foundation.c4
        public void b(long j10, long j11, float f10) {
            this.f14213a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
        }

        @Override // androidx.compose.foundation.c4
        public void c() {
            this.f14213a.update();
        }

        @NotNull
        public final Magnifier d() {
            return this.f14213a;
        }

        @Override // androidx.compose.foundation.c4
        public void dismiss() {
            this.f14213a.dismiss();
        }
    }

    private e4() {
    }

    @Override // androidx.compose.foundation.d4
    public boolean b() {
        return f14210c;
    }

    @Override // androidx.compose.foundation.d4
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull androidx.compose.ui.unit.d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
