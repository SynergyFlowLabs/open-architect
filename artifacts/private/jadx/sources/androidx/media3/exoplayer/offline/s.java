package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.y4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f1
    private static final int f64552b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.app.w.n f64553a;

    @w0(31)
    private static final class a {
        private a() {
        }

        @e.a({"WrongConstant"})
        public static void a(androidx.core.app.w.n nVar) {
            nVar.W(1);
        }
    }

    public s(Context context, String str) {
        this.f64553a = new androidx.core.app.w.n(context.getApplicationContext(), str);
    }

    private Notification c(Context context, @androidx.annotation.v int i10, @p0 PendingIntent pendingIntent, @p0 String str, @f1 int i11) {
        return d(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    private Notification d(Context context, @androidx.annotation.v int i10, @p0 PendingIntent pendingIntent, @p0 String str, @f1 int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f64553a.t0(i10);
        this.f64553a.O(i11 == 0 ? null : context.getResources().getString(i11));
        this.f64553a.M(pendingIntent);
        this.f64553a.z0(str != null ? new androidx.core.app.w.l().A(str) : null);
        this.f64553a.l0(i12, i13, z10);
        this.f64553a.i0(z11);
        this.f64553a.r0(z12);
        if (k1.f61540a >= 31) {
            a.a(this.f64553a);
        }
        return this.f64553a.h();
    }

    public Notification a(Context context, @androidx.annotation.v int i10, @p0 PendingIntent pendingIntent, @p0 String str) {
        return c(context, i10, pendingIntent, str, y4.h.f66901a);
    }

    public Notification b(Context context, @androidx.annotation.v int i10, @p0 PendingIntent pendingIntent, @p0 String str) {
        return c(context, i10, pendingIntent, str, y4.h.f66904d);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    public Notification e(Context context, @androidx.annotation.v int i10, @p0 PendingIntent pendingIntent, @p0 String str, List<d> list, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        float fB;
        boolean z12;
        float f10 = 0.0f;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i16 = 0;
        boolean z18 = true;
        for (int i17 = 0; i17 < list.size(); i17++) {
            d dVar = list.get(i17);
            int i18 = dVar.f64422b;
            if (i18 == 0) {
                z15 = true;
            } else if (i18 == 2) {
                fB = dVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z18 = false;
                }
                if (dVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            } else if (i18 == 5) {
                z17 = true;
            } else if (i18 == 7) {
                fB = dVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z18 = false;
                }
                if (dVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            }
        }
        if (!z14) {
            if (!z15 || i11 == 0) {
                if (z17) {
                    i13 = y4.h.f66909i;
                } else {
                    i12 = 0;
                }
                z10 = true;
            } else {
                i12 = (i11 & 2) != 0 ? y4.h.f66908h : (i11 & 1) != 0 ? y4.h.f66907g : y4.h.f66906f;
                z10 = false;
            }
            if (z10) {
                if (z14) {
                    int i19 = (int) (f10 / i16);
                    if (z18 && z16) {
                        z13 = true;
                    }
                    i15 = i19;
                    z11 = z13;
                } else {
                    i15 = 0;
                    z11 = true;
                }
                i14 = 100;
            } else {
                i14 = 0;
                i15 = 0;
                z11 = false;
            }
            return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
        }
        i13 = y4.h.f66903c;
        i12 = i13;
        z10 = true;
        if (z10) {
            if (z14) {
                int i110 = (int) (f10 / i16);
                if (z18) {
                    z13 = true;
                }
                i15 = i110;
                z11 = z13;
            } else {
                i15 = 0;
                z11 = true;
            }
            i14 = 100;
        } else {
            i14 = 0;
            i15 = 0;
            z11 = false;
        }
        return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
    }
}
