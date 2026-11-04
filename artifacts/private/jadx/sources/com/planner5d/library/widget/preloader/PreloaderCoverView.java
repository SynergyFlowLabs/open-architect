package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.f1;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.widget.c1;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
public class PreloaderCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f258481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f258482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f258483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f258484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImageView f258485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Button f258486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Button f258487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Button f258488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f258489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f258490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinearLayout f258491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PreloaderBarView f258492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f258493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f258494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f258495o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f258496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View.OnClickListener f258497t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnClickListener f258498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f258499w;

    class a implements Observable.OnSubscribe<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f258500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f258501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f258502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f258503d;

        a(int i10, long j10, CharSequence charSequence, boolean z10) {
            this.f258500a = i10;
            this.f258501b = j10;
            this.f258502c = charSequence;
            this.f258503d = z10;
        }

        private boolean b() {
            boolean z10;
            synchronized (PreloaderCoverView.this.f258496s) {
                try {
                    z10 = this.f258500a != PreloaderCoverView.this.f258494n;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super Void> subscriber) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 0;
            do {
                long jFloor = (long) Math.floor((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f);
                if (j10 != jFloor) {
                    PreloaderCoverView.this.m(Long.valueOf(this.f258501b - jFloor), this.f258502c, false, Integer.valueOf(this.f258500a), null, this.f258503d);
                    j10 = jFloor;
                }
                if (j10 >= this.f258501b) {
                    break;
                }
                o3.c(100L);
                synchronized (PreloaderCoverView.this.f258496s) {
                    try {
                        if (PreloaderCoverView.this.f258495o) {
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!b());
            if (b()) {
                subscriber.onError(new Exception("Canceled"));
            } else {
                PreloaderCoverView.this.i();
                subscriber.onCompleted();
            }
        }
    }

    public PreloaderCoverView(Context context) {
        super(context);
        this.f258494n = 0;
        this.f258495o = false;
        this.f258496s = new Object();
        this.f258497t = null;
        this.f258498v = null;
        View.inflate(getContext(), c1.l.f252202r2, this);
        this.f258481a = (TextView) findViewById(c1.i.T6);
        this.f258482b = (TextView) findViewById(c1.i.W6);
        TextView textView = (TextView) findViewById(c1.i.X6);
        this.f258483c = textView;
        this.f258484d = (TextView) findViewById(c1.i.U6);
        Button button = (Button) findViewById(c1.i.V6);
        this.f258486f = button;
        Button button2 = (Button) findViewById(c1.i.N6);
        this.f258487g = button2;
        Button button3 = (Button) findViewById(c1.i.M6);
        this.f258488h = button3;
        this.f258489i = findViewById(c1.i.P6);
        this.f258490j = findViewById(c1.i.O6);
        this.f258492l = (PreloaderBarView) findViewById(c1.i.S6);
        this.f258493m = findViewById(c1.i.R6);
        this.f258491k = (LinearLayout) findViewById(c1.i.L6);
        ImageView imageView = (ImageView) findViewById(c1.i.Q6);
        this.f258485e = imageView;
        Drawable drawableA = com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), c1.g.f251626qa, null);
        this.f258499w = drawableA;
        imageView.setImageDrawable(drawableA);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinksClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258623a.j(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258624a.k(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258625a.l(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        synchronized (this.f258496s) {
            this.f258495o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        View.OnClickListener onClickListener = this.f258497t;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        View.OnClickListener onClickListener = this.f258498v;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"StringFormatInvalid"})
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m(final Long l10, final CharSequence charSequence, final boolean z10, final Integer num, final String str, final boolean z11) {
        if (!o3.b()) {
            post(new Runnable() { // from class: com.planner5d.library.widget.preloader.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f258615a.m(l10, charSequence, z10, num, str, z11);
                }
            });
            return;
        }
        if (num != null) {
            synchronized (this.f258496s) {
                try {
                    if (num.intValue() != this.f258494n) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        setVisibility(0);
        this.f258487g.setVisibility(str == null ? 8 : 0);
        this.f258487g.setText(str);
        this.f258488h.setVisibility(this.f258487g.getVisibility());
        if (l10 == null) {
            this.f258481a.setText(charSequence);
            this.f258492l.setVisibility(z10 ? 0 : 8);
            this.f258490j.setVisibility(0);
            this.f258489i.setVisibility(8);
            return;
        }
        this.f258490j.setVisibility(8);
        this.f258489i.setVisibility(0);
        if (z11) {
            this.f258483c.setVisibility(0);
            this.f258483c.setText(charSequence);
            this.f258482b.setVisibility(8);
        } else {
            this.f258483c.setVisibility(8);
            this.f258482b.setVisibility(0);
            this.f258482b.setText(charSequence);
        }
        this.f258484d.setText(com.planner5d.library.services.textspan.b.d(getContext().getString(c1.q.N2, String.valueOf(l10))));
    }

    void i() {
        if (!o3.b()) {
            post(new Runnable() { // from class: com.planner5d.library.widget.preloader.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f258622a.i();
                }
            });
            return;
        }
        setVisibility(8);
        synchronized (this.f258496s) {
            try {
                this.f258494n++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f258491k.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f258491k.setLayoutParams(layoutParams);
    }

    void p(@f1 int i10, @f1 int i11, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        i();
        m(null, getContext().getString(i10), false, null, getContext().getString(i11), false);
        this.f258498v = onClickListener;
        this.f258497t = onClickListener2;
    }

    void q(String str, boolean z10) {
        i();
        int i10 = 5 << 0;
        m(null, str, z10, null, null, false);
    }

    Observable<Void> r(long j10, CharSequence charSequence, boolean z10) {
        int i10;
        synchronized (this.f258496s) {
            try {
                i10 = this.f258494n + 1;
                this.f258494n = i10;
                this.f258495o = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(Long.valueOf(j10), charSequence, false, Integer.valueOf(i10), null, z10);
        return com.planner5d.library.services.rx.i.d(new a(i10, j10, charSequence, z10));
    }

    void setGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f258491k.getLayoutParams();
        layoutParams.gravity = i10;
        this.f258491k.setLayoutParams(layoutParams);
    }

    void setLogoVisible(boolean z10) {
        this.f258485e.setVisibility(z10 ? 0 : 8);
    }

    public void setMainBackgroundColor(Integer num) {
        if (num == null) {
            num = Integer.valueOf(androidx.core.content.d.g(getContext(), c1.e.Ul));
        }
        this.f258493m.setBackgroundColor(num.intValue());
    }

    public void setMainColor(Integer num) {
        if (num == null) {
            int i10 = 5 & (-1);
            num = -1;
        }
        this.f258481a.setTextColor(num.intValue());
        this.f258482b.setTextColor(num.intValue());
        this.f258483c.setTextColor(num.intValue());
        this.f258484d.setTextColor(num.intValue());
        this.f258486f.setTextColor(num.intValue());
        this.f258487g.setTextColor(num.intValue());
        this.f258488h.setTextColor(num.intValue());
        this.f258492l.setColor(num.intValue());
        this.f258485e.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.i(this.f258499w, num));
        this.f258485e.invalidate();
    }

    public PreloaderCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258494n = 0;
        this.f258495o = false;
        this.f258496s = new Object();
        this.f258497t = null;
        this.f258498v = null;
        View.inflate(getContext(), c1.l.f252202r2, this);
        this.f258481a = (TextView) findViewById(c1.i.T6);
        this.f258482b = (TextView) findViewById(c1.i.W6);
        TextView textView = (TextView) findViewById(c1.i.X6);
        this.f258483c = textView;
        this.f258484d = (TextView) findViewById(c1.i.U6);
        Button button = (Button) findViewById(c1.i.V6);
        this.f258486f = button;
        Button button2 = (Button) findViewById(c1.i.N6);
        this.f258487g = button2;
        Button button3 = (Button) findViewById(c1.i.M6);
        this.f258488h = button3;
        this.f258489i = findViewById(c1.i.P6);
        this.f258490j = findViewById(c1.i.O6);
        this.f258492l = (PreloaderBarView) findViewById(c1.i.S6);
        this.f258493m = findViewById(c1.i.R6);
        this.f258491k = (LinearLayout) findViewById(c1.i.L6);
        ImageView imageView = (ImageView) findViewById(c1.i.Q6);
        this.f258485e = imageView;
        Drawable drawableA = com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), c1.g.f251626qa, null);
        this.f258499w = drawableA;
        imageView.setImageDrawable(drawableA);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinksClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258623a.j(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258624a.k(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258625a.l(view);
            }
        });
    }

    public PreloaderCoverView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11 = 4 & 0;
        this.f258494n = 0;
        this.f258495o = false;
        this.f258496s = new Object();
        this.f258497t = null;
        this.f258498v = null;
        View.inflate(getContext(), c1.l.f252202r2, this);
        this.f258481a = (TextView) findViewById(c1.i.T6);
        this.f258482b = (TextView) findViewById(c1.i.W6);
        TextView textView = (TextView) findViewById(c1.i.X6);
        this.f258483c = textView;
        this.f258484d = (TextView) findViewById(c1.i.U6);
        Button button = (Button) findViewById(c1.i.V6);
        this.f258486f = button;
        Button button2 = (Button) findViewById(c1.i.N6);
        this.f258487g = button2;
        Button button3 = (Button) findViewById(c1.i.M6);
        this.f258488h = button3;
        this.f258489i = findViewById(c1.i.P6);
        this.f258490j = findViewById(c1.i.O6);
        this.f258492l = (PreloaderBarView) findViewById(c1.i.S6);
        this.f258493m = findViewById(c1.i.R6);
        this.f258491k = (LinearLayout) findViewById(c1.i.L6);
        ImageView imageView = (ImageView) findViewById(c1.i.Q6);
        this.f258485e = imageView;
        Drawable drawableA = com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), c1.g.f251626qa, null);
        this.f258499w = drawableA;
        imageView.setImageDrawable(drawableA);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinksClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258623a.j(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258624a.k(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.preloader.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258625a.l(view);
            }
        });
    }
}
