package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f46889b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46890c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46891d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46892e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46893f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46894g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46895h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46896i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46897j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f46898k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46899l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46900m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46901n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46902o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f46903p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f46904q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f46905r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f46906s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f46907t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46908u = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f46909a;

    @w0(24)
    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f46910e = 1000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f46911f = 500000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static HandlerThread f46912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static Handler f46913h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f46915b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f46916c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f46917d = new WindowOnFrameMetricsAvailableListenerC0373a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0373a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0373a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f46914a & 1) != 0) {
                    aVar.f(aVar.f46915b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f46914a & 2) != 0) {
                    aVar2.f(aVar2.f46915b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f46914a & 4) != 0) {
                    aVar3.f(aVar3.f46915b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f46914a & 8) != 0) {
                    aVar4.f(aVar4.f46915b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f46914a & 16) != 0) {
                    aVar5.f(aVar5.f46915b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f46914a & 64) != 0) {
                    aVar6.f(aVar6.f46915b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f46914a & 32) != 0) {
                    aVar7.f(aVar7.f46915b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f46914a & 128) != 0) {
                    aVar8.f(aVar8.f46915b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f46914a & 256) != 0) {
                    aVar9.f(aVar9.f46915b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f46914a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f46912g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f46912g = handlerThread;
                handlerThread.start();
                f46913h = new Handler(f46912g.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f46915b;
                if (sparseIntArrayArr[i10] == null && (this.f46914a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f46917d, f46913h);
            this.f46916c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f46915b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.f46916c) {
                if (weakReference.get() == activity) {
                    this.f46916c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f46917d);
            return this.f46915b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f46915b;
            this.f46915b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f46916c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f46916c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f46917d);
                    this.f46916c.remove(size);
                }
            }
            return this.f46915b;
        }

        void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(@NonNull Activity activity) {
        this.f46909a.a(activity);
    }

    @androidx.annotation.p0
    public SparseIntArray[] b() {
        return this.f46909a.b();
    }

    @androidx.annotation.p0
    public SparseIntArray[] c(@NonNull Activity activity) {
        return this.f46909a.c(activity);
    }

    @androidx.annotation.p0
    public SparseIntArray[] d() {
        return this.f46909a.d();
    }

    @androidx.annotation.p0
    public SparseIntArray[] e() {
        return this.f46909a.e();
    }

    public FrameMetricsAggregator(int i10) {
        this.f46909a = new a(i10);
    }
}
