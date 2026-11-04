package app.rive.runtime.kotlin.renderers;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.w0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(24)
public final class RendererMetrics implements Window.OnFrameMetricsAvailableListener {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final double ONE_MS_IN_NS = 1000000.0d;
    public static final int SAMPLES = 30;

    @NotNull
    private static final String TAG = "RendererMetrics";
    private int allFrames;
    private int jankyFrames;
    private final float refreshRateMs;
    private int sampleCount;

    @NotNull
    private BigDecimal totalTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RendererMetrics(@NotNull Activity activity) {
        float refreshRate;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.totalTime = new BigDecimal(0.0d);
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = window.getContext().getDisplay();
            refreshRate = display != null ? display.getRefreshRate() : 60.0f;
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        q1 q1Var = q1.f312784a;
        Intrinsics.checkNotNullExpressionValue(String.format("Refresh rate: %.1f Hz", Arrays.copyOf(new Object[]{Float.valueOf(refreshRate)}, 1)), "format(...)");
        this.refreshRateMs = 1000 / refreshRate;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(@Nullable Window window, @Nullable FrameMetrics frameMetrics, int i10) {
        if (window == null || frameMetrics == null) {
            return;
        }
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        this.allFrames++;
        this.sampleCount++;
        double metric = frameMetrics2.getMetric(8) / ONE_MS_IN_NS;
        BigDecimal bigDecimalAdd = this.totalTime.add(new BigDecimal(String.valueOf(metric)));
        this.totalTime = bigDecimalAdd;
        if (bigDecimalAdd.compareTo(new BigDecimal(String.valueOf(this.refreshRateMs))) > 0) {
            this.jankyFrames++;
        }
        if (this.sampleCount == 30) {
            this.sampleCount = 0;
            double metric2 = frameMetrics2.getMetric(4) / ONE_MS_IN_NS;
            double metric3 = frameMetrics2.getMetric(7) / ONE_MS_IN_NS;
            double metric4 = frameMetrics2.getMetric(6) / ONE_MS_IN_NS;
            Locale locale = Locale.US;
            Double dValueOf = Double.valueOf(metric);
            Double dValueOf2 = Double.valueOf(metric2);
            Double dValueOf3 = Double.valueOf(metric3);
            Double dValueOf4 = Double.valueOf(metric4);
            BigDecimal bigDecimal = this.totalTime;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.allFrames);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            String.format(locale, "\\n\n============ FrameMetrics ============\n=== Frame issued in:        %.2fms ===\n=== Draw Time:              %.2fms ===\n=== Swap Buffers Duration:  %.2fms ===\n=== GPU commands sent in:   %.2fms ===\n======================================\n=== Overall average:        %.2fms ===", dValueOf, dValueOf2, dValueOf3, dValueOf4, bigDecimal.divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP));
        }
    }
}
