package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private RenderEffect f37759a;

    public /* synthetic */ e3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @androidx.annotation.w0(31)
    @NotNull
    public final RenderEffect a() {
        RenderEffect renderEffect = this.f37759a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f37759a = renderEffectB;
        return renderEffectB;
    }

    @androidx.annotation.w0(31)
    @NotNull
    protected abstract RenderEffect b();

    public boolean c() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private e3() {
    }
}
