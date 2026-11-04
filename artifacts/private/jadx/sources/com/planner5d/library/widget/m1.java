package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.concurrent.Callable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
public class m1 extends FrameLayout implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Subscription f258322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.widget.preloader.t f258323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BackgroundImageView f258324c;

    public m1(Context context) {
        super(context);
        com.planner5d.library.widget.preloader.t tVar = new com.planner5d.library.widget.preloader.t();
        this.f258323b = tVar;
        View.inflate(getContext(), com.planner5d.library.f.m.f168724i9, this);
        this.f258324c = (BackgroundImageView) findViewById(com.planner5d.library.f.j.Jd);
        tVar.b(findViewById(com.planner5d.library.f.j.El)).l(Integer.valueOf(Color.argb(50, 255, 255, 255)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.planner5d.library.services.bitmaploader.d.c cVar, b4 b4Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        if (getWindowToken() != null) {
            g(cVar, b4Var, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void f(b4 b4Var, com.planner5d.library.services.bitmaploader.target.h hVar, com.planner5d.library.services.bitmaploader.d.c cVar) {
        g(cVar, b4Var, hVar);
        return null;
    }

    private void g(@androidx.annotation.p0 final com.planner5d.library.services.bitmaploader.d.c cVar, @NonNull final b4 b4Var, @NonNull final com.planner5d.library.services.bitmaploader.target.h hVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            this.f258324c.f(b4Var.E0(cVar, Math.max(measuredWidth, measuredHeight), this.f258324c.e(hVar, null), null));
            return;
        }
        post(new Runnable() { // from class: com.planner5d.library.widget.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f258212a.e(cVar, b4Var, hVar);
            }
        });
    }

    private void h(@NonNull final gd.b bVar, @NonNull final b4 b4Var, @NonNull Func1<com.planner5d.library.services.bitmaploader.d.c, Void> func1) {
        final Context applicationContext = getContext().getApplicationContext();
        Subscription subscription = this.f258322a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f258322a = com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.l1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b4Var.h0(applicationContext, bVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).map(func1).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        Subscription subscription = this.f258322a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f258324c.a();
    }

    public void i(@NonNull gd.b bVar, @NonNull final b4 b4Var, @NonNull final com.planner5d.library.services.bitmaploader.target.h hVar) {
        h(bVar, b4Var, new Func1() { // from class: com.planner5d.library.widget.k1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f258222a.f(b4Var, hVar, (com.planner5d.library.services.bitmaploader.d.c) obj);
            }
        });
        int iT = bVar.t();
        if (iT == 5) {
            this.f258323b.a().q(ErrorMessageException.getError(getContext(), getResources().getString(com.planner5d.library.f.s.Ra)));
        } else if (iT == 3 || iT == 2) {
            this.f258323b.a().p(getResources().getString(com.planner5d.library.f.s.Hz), false);
        } else {
            this.f258323b.a().b();
        }
    }

    public m1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        com.planner5d.library.widget.preloader.t tVar = new com.planner5d.library.widget.preloader.t();
        this.f258323b = tVar;
        View.inflate(getContext(), com.planner5d.library.f.m.f168724i9, this);
        this.f258324c = (BackgroundImageView) findViewById(com.planner5d.library.f.j.Jd);
        tVar.b(findViewById(com.planner5d.library.f.j.El)).l(Integer.valueOf(Color.argb(50, 255, 255, 255)));
    }

    public m1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        com.planner5d.library.widget.preloader.t tVar = new com.planner5d.library.widget.preloader.t();
        this.f258323b = tVar;
        View.inflate(getContext(), com.planner5d.library.f.m.f168724i9, this);
        this.f258324c = (BackgroundImageView) findViewById(com.planner5d.library.f.j.Jd);
        tVar.b(findViewById(com.planner5d.library.f.j.El)).l(Integer.valueOf(Color.argb(50, 255, 255, 255)));
    }
}
