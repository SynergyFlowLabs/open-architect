package w0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,191:1\n81#2,4:192\n81#2,4:196\n118#2,4:200\n*S KotlinDebug\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n*L\n92#1:192,4\n100#1:196,4\n118#1:200,4\n*E\n"})
public final class j extends ReplacementSpan {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f385843k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f385844l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f385845m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f385846n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f385847o = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f385848s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f385849t = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f385850v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f385851w = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f385853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f385854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f385855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f385856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f385857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f385858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f385859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f385860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f385861j;

    public static final class a {

        /* JADX INFO: renamed from: w0.j$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        @jj.e(jj.a.SOURCE)
        public @interface InterfaceC2524a {
        }

        @Retention(RetentionPolicy.SOURCE)
        @jj.e(jj.a.SOURCE)
        public @interface b {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f385852a = f10;
        this.f385853b = i10;
        this.f385854c = f11;
        this.f385855d = i11;
        this.f385856e = f12;
        this.f385857f = i12;
    }

    @NotNull
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f385858g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.f385861j) {
            x0.a.g("PlaceholderSpan is not laid out yet.");
        }
        return this.f385860i;
    }

    public final int c() {
        return this.f385857f;
    }

    public final int d() {
        if (!this.f385861j) {
            x0.a.g("PlaceholderSpan is not laid out yet.");
        }
        return this.f385859h;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NotNull Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @e.a({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iA;
        this.f385861j = true;
        float textSize = paint.getTextSize();
        this.f385858g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            x0.a.e("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f385853b;
        if (i12 == 0) {
            f10 = this.f385852a * this.f385856e;
        } else {
            if (i12 != 1) {
                x0.a.f("Unsupported unit.");
                throw new a0();
            }
            f10 = this.f385852a * textSize;
        }
        this.f385859h = k.a(f10);
        int i13 = this.f385855d;
        if (i13 == 0) {
            iA = k.a(this.f385854c * this.f385856e);
        } else {
            if (i13 != 1) {
                x0.a.f("Unsupported unit.");
                throw new a0();
            }
            iA = k.a(this.f385854c * textSize);
        }
        this.f385860i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f385857f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                    }
                    break;
                default:
                    x0.a.e("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
