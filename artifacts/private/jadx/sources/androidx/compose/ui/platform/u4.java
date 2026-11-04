package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.l1
public interface u4 extends androidx.compose.ui.node.g2 {

    @NotNull
    public static final a M = a.f40905a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40905a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private static Function1<? super u4, Unit> f40906b;

        private a() {
        }

        @androidx.annotation.l1
        public static /* synthetic */ void b() {
        }

        @Nullable
        public final Function1<u4, Unit> a() {
            return f40906b;
        }

        public final void c(@Nullable Function1<? super u4, Unit> function1) {
            f40906b = function1;
        }
    }

    void S();

    boolean getHasPendingMeasureOrLayout();

    @NotNull
    View getView();

    boolean n();
}
