package a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,206:1\n33#2:207\n53#3,3:208\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n*L\n90#1:207\n90#1:208,3\n*E\n"})
public final class c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f410j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q3 f411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final i0 f414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i f416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f419i;

    public c(@NotNull q3 q3Var, float f10, float f11, float f12, @Nullable i0 i0Var, float f13, @NotNull i iVar, @NotNull androidx.compose.ui.unit.d dVar, float f14) {
        this.f411a = q3Var;
        this.f412b = f10;
        this.f413c = f11;
        this.f414d = i0Var;
        this.f415e = f13;
        this.f416f = iVar;
        this.f417g = dVar;
        int iL0 = kotlin.math.b.L0(f10 + f12);
        this.f418h = iL0;
        this.f419i = kotlin.math.b.L0(f14) - iL0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(c cVar, long j10, int i10, Canvas canvas, Paint paint, int i11, float f10) {
        a.d(cVar.f411a.mo0createOutlinePq9zytI(j10, i10 > 0 ? w.Ltr : w.Rtl, cVar.f417g), canvas, paint, i11, f10, i10);
        return Unit.f312394a;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable final Canvas canvas, @Nullable final Paint paint, int i10, final int i11, int i12, int i13, int i14, @Nullable CharSequence charSequence, int i15, int i16, boolean z10, @Nullable Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f10 = (i12 + i14) / 2.0f;
        final int iU = r.u(i10 - this.f418h, 0);
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i15 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        a.f(paint, this.f416f);
        float f11 = this.f412b;
        final long jF = n.f((((long) Float.floatToRawIntBits(this.f413c)) & k0.f265952a) | (Float.floatToRawIntBits(f11) << 32));
        a.e(paint, this.f414d, this.f415e, jF, new Function0() { // from class: a1.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.b(this.f403a, jF, i11, canvas, paint, iU, f10);
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        int i10 = this.f419i;
        if (i10 >= 0) {
            return 0;
        }
        return Math.abs(i10);
    }
}
