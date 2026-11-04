package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f48989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f48991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private VelocityTracker f48992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f48993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f48997j;

    @androidx.annotation.l1
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    @androidx.annotation.l1
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public v(@NonNull Context context, @NonNull w wVar) {
        this(context, wVar, new b() { // from class: androidx.core.view.t
            @Override // androidx.core.view.v.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                v.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.u
            @Override // androidx.core.view.v.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return v.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = y1.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = y1.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f48995h == source && this.f48996i == deviceId && this.f48994g == i10) {
            return false;
        }
        this.f48990c.a(this.f48988a, this.f48997j, motionEvent, i10);
        this.f48995h = source;
        this.f48996i = deviceId;
        this.f48994g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f48992e == null) {
            this.f48992e = VelocityTracker.obtain();
        }
        return this.f48991d.a(this.f48992e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        r1.a(velocityTracker, motionEvent);
        r1.c(velocityTracker, 1000);
        return r1.e(velocityTracker, i10);
    }

    public void g(@NonNull MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f48997j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f48992e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f48992e = null;
            }
        } else {
            float fE = e(motionEvent, i10) * this.f48989b.a();
            float fSignum = Math.signum(fE);
            if (zD || (fSignum != Math.signum(this.f48993f) && fSignum != 0.0f)) {
                this.f48989b.c();
            }
            float fAbs = Math.abs(fE);
            int[] iArr = this.f48997j;
            if (fAbs >= iArr[0]) {
                int i11 = iArr[1];
                float fMax = Math.max(-i11, Math.min(fE, i11));
                this.f48993f = this.f48989b.b(fMax) ? fMax : 0.0f;
            }
        }
    }

    @androidx.annotation.l1
    v(Context context, w wVar, b bVar, a aVar) {
        this.f48994g = -1;
        this.f48995h = -1;
        this.f48996i = -1;
        this.f48997j = new int[]{Integer.MAX_VALUE, 0};
        this.f48988a = context;
        this.f48989b = wVar;
        this.f48990c = bVar;
        this.f48991d = aVar;
    }
}
