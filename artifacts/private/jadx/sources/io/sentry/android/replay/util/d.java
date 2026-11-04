package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class d extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f305003e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f305004f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f305005g = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f305006h = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f305007i = -16777216;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f305008j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f305009k = 6.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f305010l = 32.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Paint f305011a = new Paint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f305012b = f305009k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f305013c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private List<Rect> f305014d = CollectionsKt.emptyList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a(Canvas canvas, String str, float f10, float f11) {
        this.f305011a.setColor(-1);
        this.f305011a.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f10, f11, this.f305011a);
        this.f305011a.setColor(-16777216);
        this.f305011a.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f10, f11, this.f305011a);
    }

    public final void b(@NotNull List<Rect> masks) {
        Intrinsics.checkNotNullParameter(masks, "masks");
        this.f305014d = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f305011a.setTextSize(f305010l);
        this.f305011a.setColor(-16777216);
        this.f305011a.setStrokeWidth(f305009k);
        for (Rect rect : this.f305014d) {
            this.f305011a.setColor(f305005g);
            this.f305011a.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.f305011a);
            this.f305011a.setColor(f305006h);
            this.f305011a.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.f305011a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String string = sb2.toString();
            this.f305011a.getTextBounds(string, 0, string.length(), this.f305013c);
            a(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.f305011a.getTextBounds(string2, 0, string2.length(), this.f305013c);
            a(canvas, string2, rect.right - this.f305013c.width(), rect.bottom + this.f305013c.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @kotlin.l(message = "Deprecated in Java")
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
