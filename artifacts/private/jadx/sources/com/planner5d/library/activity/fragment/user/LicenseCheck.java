package com.planner5d.library.activity.fragment.user;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.n;
import com.planner5d.library.activity.helper.i0;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.rx.e;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.preloader.t;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class LicenseCheck extends FragmentController implements com.planner5d.library.activity.helper.ui.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected i0 f136629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected y1 f136630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected m2 f136631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected n f136632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f136633i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f136634j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Button f136635k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t f136636l = new t();

    class a extends e<Void> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            LicenseCheck.this.F(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            LicenseCheck.this.G();
        }
    }

    public LicenseCheck() {
        com.planner5d.library.application.b.r().L(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        h3.g0(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        B(getView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(String str) {
        this.f136631g.a(getActivity(), str);
    }

    protected void B(View view) {
        if (view == null) {
            return;
        }
        this.f136636l.b(view).a(f.s.T2, false);
        this.f136635k.setVisibility(8);
        this.f136633i.setVisibility(8);
        this.f136629e.i().observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super Void>) new a());
    }

    protected void F(Throwable th2) {
        View view = getView();
        if (view == null) {
            return;
        }
        String error = ErrorMessageException.getError(getActivity(), th2);
        this.f136633i.setVisibility(0);
        int i10 = 2 & 0;
        this.f136634j.setText(com.planner5d.library.services.textspan.b.h(error, new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.user.c
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                this.f136640a.E(str);
            }
        }, null, false));
        if (ErrorMessageException.isWithCode(th2, f.s.f169585z9)) {
            this.f136635k.setVisibility(0);
        }
        this.f136636l.b(view).b();
    }

    protected void G() {
        this.f131538b.e(new com.planner5d.library.activity.helper.event.content.c(this.f136632h.a(), (Bundle) null));
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    public com.planner5d.library.activity.helper.ui.d getUiState(Context context) {
        return new com.planner5d.library.activity.helper.ui.d.b(context, this).K(new k3(f.s.Lc, new Object[0])).x();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(f.m.V1, viewGroup, false);
        this.f136633i = viewInflate.findViewById(f.j.Mh);
        TextView textView = (TextView) viewInflate.findViewById(f.j.Hh);
        this.f136634j = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) viewInflate.findViewById(f.j.f168442v5);
        this.f136635k = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.user.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136638a.C(view);
            }
        });
        viewInflate.findViewById(f.j.f168538z5).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.user.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136639a.D(view);
            }
        });
        B(viewInflate);
        return viewInflate;
    }
}
