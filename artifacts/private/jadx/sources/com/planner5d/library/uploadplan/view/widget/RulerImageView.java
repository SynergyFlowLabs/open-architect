package com.planner5d.library.uploadplan.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.danielnilsson9.colorpickerview.view.d;
import com.planner5d.library.services.utility.y1;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.o;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRulerImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RulerImageView.kt\ncom/planner5d/library/uploadplan/view/widget/RulerImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class RulerImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f231188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f231189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f231190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f231191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f231192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f231193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f231194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.uploadplan.view.widget.a.EnumC1712a f231195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private o<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> f231196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f231197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.uploadplan.view.widget.a f231198k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231199a;

        static {
            int[] iArr = new int[com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.values().length];
            try {
                iArr[com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f231199a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public RulerImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.planner5d.library.uploadplan.view.widget.a.EnumC1712a e(float f10, float f11) {
        PointF pointFF = f(this.f231191d, this.f231192e);
        PointF pointFF2 = f(this.f231193f, this.f231194g);
        float fC = y1.c(f10, f11, pointFF.x, pointFF.y);
        float fC2 = y1.c(f10, f11, pointFF2.x, pointFF2.y);
        if (fC >= fC2 || fC >= this.f231188a) {
            return (fC <= fC2 || fC2 >= this.f231188a) ? com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.None : com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.End;
        }
        return com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.Start;
    }

    private final PointF f(float f10, float f11) {
        double degrees = ((float) Math.toDegrees(Math.atan2(this.f231194g - this.f231192e, this.f231193f - this.f231191d))) - 90;
        return new PointF(f10 + (this.f231190c * ((float) Math.cos(Math.toRadians(degrees)))), f11 + (this.f231190c * ((float) Math.sin(Math.toRadians(degrees)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i10, int i11, int i12, int i13) {
        return Unit.f312394a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f231198k.h(this.f231191d, this.f231192e, this.f231193f, this.f231194g, this.f231195h);
        this.f231198k.draw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f231197j) {
            float f10 = (i12 - i10) / 2.0f;
            this.f231191d = f10;
            this.f231193f = f10;
            float f11 = i13 - i11;
            this.f231192e = 0.3f * f11;
            this.f231194g = f11 * 0.7f;
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null || isClickable()) {
            return true;
        }
        PointF pointFF = f(0.0f, 0.0f);
        float x10 = motionEvent.getX() - pointFF.x;
        float y10 = motionEvent.getY() - pointFF.y;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f231195h = e(motionEvent.getX(), motionEvent.getY());
            if (!this.f231197j) {
                this.f231196i.invoke(0, 0, 0, 0);
            }
            int i10 = a.f231199a[this.f231195h.ordinal()];
            if (i10 == 1) {
                this.f231191d = x10;
                this.f231192e = y10;
                this.f231197j = true;
            } else if (i10 == 2) {
                this.f231193f = x10;
                this.f231194g = y10;
                this.f231197j = true;
            }
            invalidate();
        } else if (action == 1) {
            this.f231195h = com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.None;
            invalidate();
            this.f231196i.invoke(Integer.valueOf((int) this.f231191d), Integer.valueOf((int) this.f231192e), Integer.valueOf((int) this.f231193f), Integer.valueOf((int) this.f231194g));
        } else {
            if (action != 2) {
                return false;
            }
            int i11 = a.f231199a[this.f231195h.ordinal()];
            if (i11 == 1) {
                this.f231191d = x10;
                this.f231192e = y10;
                if (Math.abs(x10 - this.f231193f) <= this.f231189b) {
                    this.f231191d = this.f231193f;
                }
                if (Math.abs(this.f231192e - this.f231194g) <= this.f231189b) {
                    this.f231192e = this.f231194g;
                }
                this.f231191d = n1.a.d(this.f231191d, 0.0f, getWidth());
                this.f231192e = n1.a.d(this.f231192e, 0.0f, getHeight());
                this.f231197j = true;
            } else if (i11 == 2) {
                this.f231193f = x10;
                this.f231194g = y10;
                if (Math.abs(this.f231191d - x10) <= this.f231189b) {
                    this.f231193f = this.f231191d;
                }
                if (Math.abs(this.f231192e - this.f231194g) <= this.f231189b) {
                    this.f231194g = this.f231192e;
                }
                this.f231193f = n1.a.d(this.f231193f, 0.0f, getWidth());
                this.f231194g = n1.a.d(this.f231194g, 0.0f, getHeight());
                this.f231197j = true;
            }
            invalidate();
        }
        return true;
    }

    public final void setHandler(@NotNull o<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f231196i = handler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public RulerImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RulerImageView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public RulerImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f231188a = d.a(context, 30.0f);
        this.f231189b = d.a(context, 8.0f);
        this.f231190c = d.a(context, 35.0f);
        this.f231195h = com.planner5d.library.uploadplan.view.widget.a.EnumC1712a.None;
        this.f231196i = new o() { // from class: com.planner5d.library.uploadplan.view.widget.b
            @Override // pj.o
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return RulerImageView.g(((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        };
        this.f231198k = new com.planner5d.library.uploadplan.view.widget.a(context);
    }
}
