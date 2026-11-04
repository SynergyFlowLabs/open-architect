package com.planner5d.library.widget.popupview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.d;
import androidx.core.view.u1;
import androidx.fragment.app.s;
import androidx.lifecycle.c0;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.planner5d.library.f;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.TabLayout;
import com.planner5d.library.widget.preloader.t;
import ef.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends FrameLayout implements o0, n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1745b f258435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f258436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f258437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f258438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final ImageView f258439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f258440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final t f258441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f258442h;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i10 = 2 << 0;
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), b.this.getResources().getDimensionPixelSize(f.g.Xg));
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.popupview.b$b, reason: collision with other inner class name */
    static class C1745b implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0 f258444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<s> f258445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f258446c;

        /* JADX INFO: Access modifiers changed from: private */
        public void dispose() {
            this.f258444a.v(c0.b.DESTROYED);
            s sVar = this.f258445b.get();
            if (sVar != null) {
                sVar.getLifecycle().g(this);
            }
        }

        @e1(c0.a.ON_PAUSE)
        public void onActivityPause() {
            this.f258444a.v(c0.b.CREATED);
        }

        @e1(c0.a.ON_RESUME)
        public void onActivityResume() {
            this.f258444a.v(this.f258446c.f258442h ? c0.b.RESUMED : c0.b.STARTED);
        }

        private C1745b(b bVar, s sVar) {
            this.f258446c = bVar;
            this.f258444a = new com.planner5d.library.activity.helper.ui.c(bVar);
            this.f258445b = new WeakReference<>(sVar);
            sVar.getLifecycle().c(this);
        }
    }

    public b(s sVar) {
        super(sVar);
        this.f258438d = null;
        this.f258440f = false;
        this.f258442h = false;
        u1.j2(this, new g());
        this.f258435a = new C1745b(sVar);
        ViewGroup viewGroup = (ViewGroup) View.inflate(sVar, f.m.S6, null);
        this.f258436b = viewGroup;
        addView(viewGroup);
        this.f258437c = (ViewGroup) viewGroup.findViewById(f.j.Fb);
        this.f258439e = (ImageView) viewGroup.findViewById(f.j.Ab);
        t tVar = new t(findViewById(f.j.Jb));
        this.f258441g = tVar;
        tVar.a().g(-1).h(Integer.valueOf(d.g(sVar, f.C1549f.f166572o4)));
        f();
    }

    public static /* synthetic */ void a(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static int c(@NonNull Context context, int i10) {
        Resources resources = context.getResources();
        return Math.min(Math.max(0, i10), (h3.H(context) - resources.getDimensionPixelSize(f.g.f167296u1)) - (resources.getDimensionPixelSize(f.g.f167188p3) * 2));
    }

    public static int d(@NonNull Context context, int i10) {
        int i11 = 2 | 0;
        return Math.min(Math.max(0, i10), h3.A(context) - context.getResources().getDimensionPixelSize(f.g.f167274t1));
    }

    private void f() {
        setClipToOutline(true);
        setOutlineProvider(new a());
        setElevation(getResources().getDimensionPixelSize(f.g.f167048ih));
    }

    public void dispose() {
        this.f258435a.dispose();
    }

    public void g(CharSequence charSequence, View.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(f.j.Lb);
        if (textView == null) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(f.j.Db);
        textView.setText(charSequence);
        textView.setOnClickListener(onClickListener);
        textView.setClickable(onClickListener != null);
        textView.setEnabled(textView.isClickable());
        textView.setTextColor(d.g(getContext(), f.C1549f.f166273bi));
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        if (!textView.isClickable()) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.k(getContext(), f.h.F6, f.h.N8, Integer.valueOf(d.g(getContext(), f.C1549f.f166403h2))));
        imageView.setOnClickListener(onClickListener);
        imageView.setVisibility(0);
    }

    @Override // androidx.lifecycle.o0
    @NonNull
    public c0 getLifecycle() {
        return this.f258435a.f258444a;
    }

    protected TabLayout getViewTabLayout() {
        return (TabLayout) findViewById(f.j.Kb);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f258442h = true;
        this.f258435a.f258444a.v(c0.b.RESUMED);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f258442h = false;
        super.onDetachedFromWindow();
        this.f258435a.f258444a.v(c0.b.CREATED);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Drawable drawable = this.f258438d;
        if (drawable == null) {
            setBackgroundColor(i10);
        } else if (i10 == -1) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
    }

    protected void setContentView(@NonNull View view) {
        if (this.f258440f) {
            throw new RuntimeException("Content already set");
        }
        this.f258440f = true;
        ((ViewGroup) this.f258437c.findViewById(f.j.Gb)).addView(view, new FrameLayout.LayoutParams(-1, -2));
        getViewTabLayout().setTabGravity(0);
    }

    public void setOnCloseClickListener(final View.OnClickListener onClickListener) {
        this.f258439e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.popupview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a(onClickListener, view);
            }
        });
    }
}
