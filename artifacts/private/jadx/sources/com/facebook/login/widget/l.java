package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.h0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f101661i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f101662j = 6000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f101663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<View> f101664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f101665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private b f101666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private PopupWindow f101667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private c f101668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f101669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener f101670h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ImageView f101671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ImageView f101672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final View f101673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final ImageView f101674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f101675e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull l this$0, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f101675e = this$0;
            LayoutInflater.from(context).inflate(h0.k.I, this);
            View viewFindViewById = findViewById(h0.h.E0);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f101671a = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(h0.h.C0);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f101672b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(h0.h.f100956v0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f101673c = viewFindViewById3;
            View viewFindViewById4 = findViewById(h0.h.f100960w0);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f101674d = (ImageView) viewFindViewById4;
        }

        @NotNull
        public final View a() {
            return this.f101673c;
        }

        @NotNull
        public final ImageView b() {
            return this.f101672b;
        }

        @NotNull
        public final ImageView c() {
            return this.f101671a;
        }

        @NotNull
        public final ImageView d() {
            return this.f101674d;
        }

        public final void e() {
            this.f101671a.setVisibility(4);
            this.f101672b.setVisibility(0);
        }

        public final void f() {
            this.f101671a.setVisibility(0);
            this.f101672b.setVisibility(4);
        }
    }

    public enum c {
        BLUE,
        BLACK;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    public l(@NotNull String text, @NotNull View anchor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f101663a = text;
        this.f101664b = new WeakReference<>(anchor);
        Context context = anchor.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "anchor.context");
        this.f101665c = context;
        this.f101668f = c.BLUE;
        this.f101669g = f101662j;
        this.f101670h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.i
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                l.f(this.f101658a);
            }
        };
    }

    private final void e() {
        ViewTreeObserver viewTreeObserver;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            l();
            View view = this.f101664b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(this.f101670h);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(l this$0) {
        PopupWindow popupWindow;
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f101664b.get() == null || (popupWindow = this$0.f101667e) == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = this$0.f101666d;
                if (bVar == null) {
                    return;
                }
                bVar.e();
                return;
            }
            b bVar2 = this$0.f101666d;
            if (bVar2 == null) {
                return;
            }
            bVar2.f();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l this$0) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(l this$0, View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l.class);
        }
    }

    private final void l() {
        ViewTreeObserver viewTreeObserver;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            View view = this.f101664b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.f101670h);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void m() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f101667e;
            if (popupWindow != null && popupWindow.isShowing()) {
                if (popupWindow.isAboveAnchor()) {
                    b bVar = this.f101666d;
                    if (bVar == null) {
                        return;
                    }
                    bVar.e();
                    return;
                }
                b bVar2 = this.f101666d;
                if (bVar2 == null) {
                    return;
                }
                bVar2.f();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            l();
            PopupWindow popupWindow = this.f101667e;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void g(long j10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101669g = j10;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void h(@NotNull c style) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f101668f = style;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void i() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (this.f101664b.get() != null) {
                    b bVar = new b(this, this.f101665c);
                    this.f101666d = bVar;
                    View viewFindViewById = bVar.findViewById(h0.h.D0);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    ((TextView) viewFindViewById).setText(this.f101663a);
                    if (this.f101668f == c.BLUE) {
                        bVar.a().setBackgroundResource(h0.g.T0);
                        bVar.b().setImageResource(h0.g.U0);
                        bVar.c().setImageResource(h0.g.V0);
                        bVar.d().setImageResource(h0.g.W0);
                    } else {
                        bVar.a().setBackgroundResource(h0.g.P0);
                        bVar.b().setImageResource(h0.g.Q0);
                        bVar.c().setImageResource(h0.g.R0);
                        bVar.d().setImageResource(h0.g.S0);
                    }
                    View decorView = ((Activity) this.f101665c).getWindow().getDecorView();
                    Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    e();
                    bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                    this.f101667e = popupWindow;
                    popupWindow.showAsDropDown(this.f101664b.get());
                    m();
                    if (this.f101669g > 0) {
                        bVar.postDelayed(new Runnable() { // from class: com.facebook.login.widget.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                l.j(this.f101659a);
                            }
                        }, this.f101669g);
                    }
                    popupWindow.setTouchable(true);
                    bVar.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l.k(this.f101660a, view);
                        }
                    });
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }
}
