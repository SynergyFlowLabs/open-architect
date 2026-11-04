package com.google.firebase.inappmessaging.display;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.internal.i;
import com.google.firebase.inappmessaging.display.internal.j;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.l;
import com.google.firebase.inappmessaging.display.internal.n;
import com.google.firebase.inappmessaging.m;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.h;
import com.google.firebase.inappmessaging.r;
import com.superwall.sdk.network.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@u8.a
public class c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final long f122138n = 5000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f122139o = 20000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final long f122140s = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f122141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, ij.c<k>> f122142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.display.internal.e f122143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f122144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f122145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.display.internal.g f122146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.display.internal.a f122147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Application f122148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.display.internal.c f122149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FiamListener f122150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.firebase.inappmessaging.model.i f122151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f122152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    @p0
    String f122153m;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f122154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.display.internal.bindingwrappers.c f122155b;

        a(Activity activity, com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar) {
            this.f122154a = activity;
            this.f122155b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.z(this.f122154a, this.f122155b);
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f122157a;

        b(Activity activity) {
            this.f122157a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f122152l != null) {
                c.this.f122152l.d(r.a.CLICK);
            }
            c.this.t(this.f122157a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.c$c, reason: collision with other inner class name */
    class ViewOnClickListenerC1150c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.model.a f122159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f122160b;

        ViewOnClickListenerC1150c(com.google.firebase.inappmessaging.model.a aVar, Activity activity) {
            this.f122159a = aVar;
            this.f122160b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f122152l != null) {
                l.f("Calling callback for click action");
                c.this.f122152l.a(this.f122159a);
            }
            c.this.C(this.f122160b, Uri.parse(this.f122159a.b()));
            c.this.E();
            c.this.H(this.f122160b);
            c.this.s();
        }
    }

    class d extends com.google.firebase.inappmessaging.display.internal.e.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.display.internal.bindingwrappers.c f122162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f122163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f122164g;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                if (c.this.f122152l != null) {
                    c.this.f122152l.d(r.a.UNKNOWN_DISMISS_TYPE);
                }
                d dVar = d.this;
                c.this.t(dVar.f122163f);
                return true;
            }
        }

        class b implements n.b {
            b() {
            }

            @Override // com.google.firebase.inappmessaging.display.internal.n.b
            public void a() {
                if (c.this.f122151k == null || c.this.f122152l == null) {
                    return;
                }
                l.f("Impression timer onFinish for: " + c.this.f122151k.f().a());
                c.this.f122152l.c();
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.c$d$c, reason: collision with other inner class name */
        class C1151c implements n.b {
            C1151c() {
            }

            @Override // com.google.firebase.inappmessaging.display.internal.n.b
            public void a() {
                if (c.this.f122151k != null && c.this.f122152l != null) {
                    c.this.f122152l.d(r.a.AUTO);
                }
                d dVar = d.this;
                c.this.t(dVar.f122163f);
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.c$d$d, reason: collision with other inner class name */
        class RunnableC1152d implements Runnable {
            RunnableC1152d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.firebase.inappmessaging.display.internal.g gVar = c.this.f122146f;
                d dVar = d.this;
                gVar.i(dVar.f122162e, dVar.f122163f);
                if (d.this.f122162e.b().n().booleanValue()) {
                    c.this.f122149i.a(c.this.f122148h, d.this.f122162e.f(), com.google.firebase.inappmessaging.display.internal.c.e.TOP);
                }
            }
        }

        d(com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f122162e = cVar;
            this.f122163f = activity;
            this.f122164g = onGlobalLayoutListener;
        }

        @Override // com.google.firebase.inappmessaging.display.internal.e.a
        public void c(Exception exc) {
            l.e("Image download failure ");
            if (this.f122164g != null) {
                this.f122162e.e().getViewTreeObserver().removeGlobalOnLayoutListener(this.f122164g);
            }
            c.this.q();
            c.this.s();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.e.a
        public void f() {
            if (!this.f122162e.b().p().booleanValue()) {
                this.f122162e.f().setOnTouchListener(new a());
            }
            c.this.f122144d.b(new b(), 5000L, 1000L);
            if (this.f122162e.b().o().booleanValue()) {
                c.this.f122145e.b(new C1151c(), 20000L, 1000L);
            }
            this.f122163f.runOnUiThread(new RunnableC1152d());
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122170a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f122170a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122170a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122170a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122170a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @ij.a
    c(m mVar, Map<String, ij.c<k>> map, com.google.firebase.inappmessaging.display.internal.e eVar, n nVar, n nVar2, com.google.firebase.inappmessaging.display.internal.g gVar, Application application, com.google.firebase.inappmessaging.display.internal.a aVar, com.google.firebase.inappmessaging.display.internal.c cVar) {
        this.f122141a = mVar;
        this.f122142b = map;
        this.f122143c = eVar;
        this.f122144d = nVar;
        this.f122145e = nVar2;
        this.f122146f = gVar;
        this.f122148h = application;
        this.f122147g = aVar;
        this.f122149i = cVar;
    }

    private boolean A(@p0 com.google.firebase.inappmessaging.model.g gVar) {
        return (gVar == null || TextUtils.isEmpty(gVar.c())) ? false : true;
    }

    private boolean B(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(Api.scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Activity activity, Uri uri) {
        if (B(uri) && L(activity)) {
            androidx.browser.customtabs.d dVarD = new androidx.browser.customtabs.d.c().d();
            Intent intent = dVarD.f11897a;
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            dVarD.g(activity, uri);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent2, 0);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        if (resolveInfoResolveActivity != null) {
            activity.startActivity(intent2);
        } else {
            l.e("Device cannot resolve intent for: android.intent.action.VIEW");
        }
    }

    private void D(Activity activity, com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar, com.google.firebase.inappmessaging.model.g gVar, com.google.firebase.inappmessaging.display.internal.e.a aVar) {
        if (A(gVar)) {
            this.f122143c.d(gVar.c()).a(new j(this.f122151k, this.f122152l)).e(activity.getClass()).d(g.c.f122198c).c(cVar.e(), aVar);
        } else {
            aVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        FiamListener fiamListener = this.f122150j;
        if (fiamListener != null) {
            fiamListener.onFiamClick();
        }
    }

    private void F() {
        FiamListener fiamListener = this.f122150j;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
    }

    private void G() {
        FiamListener fiamListener = this.f122150j;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(Activity activity) {
        if (this.f122146f.h()) {
            this.f122143c.b(activity.getClass());
            this.f122146f.a(activity);
            q();
        }
    }

    private void J(com.google.firebase.inappmessaging.model.i iVar, r rVar) {
        this.f122151k = iVar;
        this.f122152l = rVar;
    }

    private void K(@NonNull Activity activity) {
        com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVarA;
        if (this.f122151k == null || this.f122141a.k()) {
            l.e("No active message found to render");
            return;
        }
        if (this.f122151k.l().equals(MessageType.UNSUPPORTED)) {
            l.e("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        G();
        k kVar = this.f122142b.get(com.google.firebase.inappmessaging.display.internal.injection.modules.g.a(this.f122151k.l(), y(this.f122148h))).get();
        int i10 = e.f122170a[this.f122151k.l().ordinal()];
        if (i10 == 1) {
            cVarA = this.f122147g.a(kVar, this.f122151k);
        } else if (i10 == 2) {
            cVarA = this.f122147g.d(kVar, this.f122151k);
        } else if (i10 == 3) {
            cVarA = this.f122147g.c(kVar, this.f122151k);
        } else {
            if (i10 != 4) {
                l.e("No bindings found for this message type");
                return;
            }
            cVarA = this.f122147g.b(kVar, this.f122151k);
        }
        activity.findViewById(R.id.content).post(new a(activity, cVarA));
    }

    private boolean L(Activity activity) {
        Intent intent = new Intent(androidx.browser.customtabs.f.f11910c);
        intent.setPackage(net.openid.appauth.browser.g.a.f332842a);
        List<ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    private void N(Activity activity) {
        String str = this.f122153m;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            return;
        }
        l.f("Unbinding from activity: " + activity.getLocalClassName());
        this.f122141a.l();
        H(activity);
        this.f122153m = null;
    }

    public static /* synthetic */ void a(c cVar, Activity activity, com.google.firebase.inappmessaging.model.i iVar, r rVar) {
        if (cVar.f122151k != null || cVar.f122141a.k()) {
            l.a("Active FIAM exists. Skipping trigger");
        } else {
            cVar.J(iVar, rVar);
            cVar.K(activity);
        }
    }

    private void p(final Activity activity) {
        String str = this.f122153m;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            l.f("Binding to activity: " + activity.getLocalClassName());
            this.f122141a.v(new FirebaseInAppMessagingDisplay() { // from class: com.google.firebase.inappmessaging.display.b
                @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
                public final void displayMessage(com.google.firebase.inappmessaging.model.i iVar, r rVar) {
                    c.a(this.f122136a, activity, iVar, rVar);
                }
            });
            this.f122153m = activity.getLocalClassName();
        }
        if (this.f122151k != null) {
            K(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f122144d.a();
        this.f122145e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        J(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Activity activity) {
        l.a("Dismissing fiam");
        F();
        H(activity);
        s();
    }

    private List<com.google.firebase.inappmessaging.model.a> u(com.google.firebase.inappmessaging.model.i iVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = e.f122170a[iVar.l().ordinal()];
        if (i10 == 1) {
            arrayList.add(((com.google.firebase.inappmessaging.model.c) iVar).a());
            return arrayList;
        }
        if (i10 == 2) {
            arrayList.add(((com.google.firebase.inappmessaging.model.j) iVar).a());
            return arrayList;
        }
        int i11 = 3 << 3;
        if (i10 == 3) {
            arrayList.add(((h) iVar).a());
            return arrayList;
        }
        if (i10 != 4) {
            arrayList.add(com.google.firebase.inappmessaging.model.a.a().a());
            return arrayList;
        }
        com.google.firebase.inappmessaging.model.f fVar = (com.google.firebase.inappmessaging.model.f) iVar;
        arrayList.add(fVar.q());
        arrayList.add(fVar.r());
        return arrayList;
    }

    private com.google.firebase.inappmessaging.model.g v(com.google.firebase.inappmessaging.model.i iVar) {
        if (iVar.l() != MessageType.CARD) {
            return iVar.i();
        }
        com.google.firebase.inappmessaging.model.f fVar = (com.google.firebase.inappmessaging.model.f) iVar;
        com.google.firebase.inappmessaging.model.g gVarP = fVar.p();
        com.google.firebase.inappmessaging.model.g gVarO = fVar.o();
        return (y(this.f122148h) != 1 ? !A(gVarO) : A(gVarP)) ? gVarP : gVarO;
    }

    @NonNull
    public static c x() {
        return (c) com.google.firebase.h.p().l(c.class);
    }

    private static int y(Application application) {
        return application.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"ClickableViewAccessibility"})
    public void z(Activity activity, com.google.firebase.inappmessaging.display.internal.bindingwrappers.c cVar) {
        View.OnClickListener viewOnClickListenerC1150c;
        if (this.f122151k == null) {
            return;
        }
        b bVar = new b(activity);
        HashMap map = new HashMap();
        for (com.google.firebase.inappmessaging.model.a aVar : u(this.f122151k)) {
            if (aVar == null || TextUtils.isEmpty(aVar.b())) {
                l.f("No action url found for action. Treating as dismiss.");
                viewOnClickListenerC1150c = bVar;
            } else {
                viewOnClickListenerC1150c = new ViewOnClickListenerC1150c(aVar, activity);
            }
            map.put(aVar, viewOnClickListenerC1150c);
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerG = cVar.g(map, bVar);
        if (onGlobalLayoutListenerG != null) {
            cVar.e().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerG);
        }
        D(activity, cVar, v(this.f122151k), new d(cVar, activity, onGlobalLayoutListenerG));
    }

    public void I(FiamListener fiamListener) {
        this.f122150j = fiamListener;
    }

    public void M(Activity activity, com.google.firebase.inappmessaging.model.i iVar, r rVar) {
        J(iVar, rVar);
        K(activity);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        N(activity);
        this.f122141a.o();
        super.onActivityPaused(activity);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        p(activity);
    }

    public void r() {
        this.f122150j = null;
    }

    @l1
    com.google.firebase.inappmessaging.model.i w() {
        return this.f122151k;
    }
}
