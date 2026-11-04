package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMotionEventAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,349:1\n30#2:350\n30#2:354\n30#2:359\n30#2:363\n53#3,3:351\n53#3,3:355\n53#3,3:360\n53#3,3:364\n139#4:358\n*S KotlinDebug\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n*L\n256#1:350\n260#1:354\n284#1:359\n316#1:363\n256#1:351,3\n260#1:355,3\n284#1:360,3\n316#1:364,3\n283#1:358\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39057g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SparseLongArray f39059b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SparseBooleanArray f39060c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<f0> f39061d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39062e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39063f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f39059b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f39059b;
                long j10 = this.f39058a;
                this.f39058a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f39060c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f39059b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f39059b;
                long j11 = this.f39058a;
                this.f39058a = 1 + j11;
                sparseLongArray2.put(pointerId2, j11);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f39062e && source == this.f39063f) {
            return;
        }
        this.f39062e = toolType;
        this.f39063f = source;
        this.f39060c.clear();
        this.f39059b.clear();
    }

    private final f0 d(s0 s0Var, MotionEvent motionEvent, int i10, boolean z10) {
        long jA;
        long jW;
        int iE;
        long jE;
        int i11 = i10;
        long jF = f(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        long jFloatToRawIntBits = Float.floatToRawIntBits(x10);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(y10);
        long j10 = com.rabbitmq.client.k0.f265952a;
        long jI = n0.g.i(n0.g.g((jFloatToRawIntBits2 & com.rabbitmq.client.k0.f265952a) | (jFloatToRawIntBits << 32)), 0.0f, 0.0f, 3, null);
        if (i11 == 0) {
            jA = n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32));
            jW = s0Var.w(jA);
        } else {
            jA = m.f39065a.a(motionEvent, i11);
            jW = s0Var.w(jA);
        }
        int toolType = motionEvent.getToolType(i10);
        if (toolType == 0) {
            iE = r0.f39113b.e();
        } else if (toolType == 1) {
            iE = r0.f39113b.d();
        } else if (toolType == 2) {
            iE = r0.f39113b.c();
        } else if (toolType != 3) {
            iE = toolType != 4 ? r0.f39113b.e() : r0.f39113b.a();
        } else {
            iE = r0.f39113b.b();
        }
        int i12 = iE;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i13 = 0;
        while (i13 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i11, i13);
            float historicalY = motionEvent.getHistoricalY(i11, i13);
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                long jG = n0.g.g((((long) Float.floatToRawIntBits(historicalY)) & j11) | (((long) Float.floatToRawIntBits(historicalX)) << 32));
                arrayList.add(new f(motionEvent.getHistoricalEventTime(i13), jG, jG, null));
            }
            i13++;
            i11 = i10;
            jA = jA;
            j10 = j11;
        }
        long j12 = jA;
        long j13 = j10;
        if (motionEvent.getActionMasked() == 8) {
            jE = n0.g.g((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j13) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32));
        } else {
            jE = n0.g.f332700b.e();
        }
        return new f0(jF, motionEvent.getEventTime(), j12, jW, z10, pressure, i12, this.f39060c.get(motionEvent.getPointerId(i10), false), arrayList, jE, jI, null);
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f39059b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f39059b.valueAt(iIndexOfKey);
        } else {
            long j10 = this.f39058a;
            this.f39058a = 1 + j10;
            this.f39059b.put(i10, j10);
            jValueAt = j10;
        }
        return b0.b(jValueAt);
    }

    @l1
    public static /* synthetic */ void h() {
    }

    private final boolean i(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private final void j(MotionEvent motionEvent) {
        int pointerId;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            int i10 = 1 << 6;
            if (actionMasked == 6) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!this.f39060c.get(pointerId, false)) {
                    this.f39059b.delete(pointerId);
                    this.f39060c.delete(pointerId);
                }
            }
        } else {
            pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f39060c.get(pointerId, false)) {
                this.f39059b.delete(pointerId);
                this.f39060c.delete(pointerId);
            }
        }
        if (this.f39059b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f39059b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f39059b.keyAt(size);
                if (!i(motionEvent, iKeyAt)) {
                    this.f39059b.removeAt(size);
                    this.f39060c.delete(iKeyAt);
                }
            }
        }
    }

    @Nullable
    public final e0 c(@NotNull MotionEvent motionEvent, @NotNull s0 s0Var) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f39059b.clear();
            this.f39060c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        int i10 = 4 << 1;
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f39060c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f39061d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i11 = 0;
        while (i11 < pointerCount) {
            this.f39061d.add(d(s0Var, motionEvent, i11, (z10 || i11 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i11++;
        }
        j(motionEvent);
        return new e0(motionEvent.getEventTime(), this.f39061d, motionEvent);
    }

    public final void e(int i10) {
        this.f39060c.delete(i10);
        this.f39059b.delete(i10);
    }

    @NotNull
    public final SparseLongArray g() {
        return this.f39059b;
    }
}
