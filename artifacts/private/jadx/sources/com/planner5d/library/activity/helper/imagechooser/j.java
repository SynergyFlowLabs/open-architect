package com.planner5d.library.activity.helper.imagechooser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.activity.fragment.dialog.CropImageDialog;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.r;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class j extends e<Bitmap> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f136955k = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Subscriber<? super Bitmap> f136957d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    com.planner5d.library.activity.fragment.dialog.k f136962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    t1 f136963j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f136956c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile qa.e f136958e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile m f136959f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Pair<Integer, Intent> f136960g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f136961h = Boolean.FALSE;

    @ij.a
    public j() {
    }

    private void A() {
        Subscriber<? super Bitmap> subscriber;
        Pair<Integer, Intent> pair;
        if (this.f136956c != null && (subscriber = this.f136957d) != null && (pair = this.f136960g) != null) {
            if (((Integer) pair.first).intValue() != -1) {
                this.f136957d = null;
                subscriber.onCompleted();
                t();
                return;
            }
            Uri uriG = g(this.f136960g);
            m mVar = this.f136959f;
            if (mVar == null || !mVar.b()) {
                D(uriG, subscriber);
            } else {
                u(uriG);
            }
        }
    }

    private void B() {
        Pair<Integer, Intent> pair;
        if (this.f136956c != null && (pair = this.f136960g) != null) {
            Subscriber<? super Bitmap> subscriber = this.f136957d;
            this.f136957d = null;
            D(((Intent) pair.second).getData(), subscriber);
        }
    }

    private void D(final Uri uri, final Subscriber<? super Bitmap> subscriber) {
        if (this.f136956c == null) {
            return;
        }
        this.f136957d = null;
        final qa.e eVar = this.f136958e;
        final m mVar = this.f136959f;
        if (eVar != null && mVar != null) {
            final Context applicationContext = this.f136956c.getApplicationContext();
            com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.activity.helper.imagechooser.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136948a.w(eVar, applicationContext, uri, mVar, subscriber);
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No strategy or options provided");
        if (subscriber != null) {
            subscriber.onError(illegalStateException);
        } else {
            this.f136963j.u(new LogRecord("image_chooser", null, illegalStateException));
        }
        t();
    }

    private void t() {
        this.f136958e = null;
        this.f136959f = null;
        this.f136960g = null;
        this.f136961h = Boolean.FALSE;
    }

    private void u(Uri uri) {
        this.f136961h = Boolean.TRUE;
        Intent intent = new Intent();
        intent.setData(uri);
        m mVar = this.f136959f;
        if (mVar != null) {
            intent.putExtra(r.minImageSize.f224891a, mVar.c());
            intent.putExtra(r.aspectRatioSquare.f224891a, mVar.a());
        }
        this.f136962i.c(CropImageDialog.class).m(new u() { // from class: com.planner5d.library.activity.helper.imagechooser.i
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                this.f136954a.v((Intent) obj);
            }
        }).k(intent).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Intent intent) {
        z(9, -1, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(qa.e eVar, Context context, Uri uri, m mVar, Subscriber subscriber) {
        try {
            try {
                Bitmap bitmapB = eVar.b(context, uri, mVar);
                if (bitmapB == null) {
                    subscriber.onError(new IOException());
                } else {
                    subscriber.onNext(bitmapB);
                    subscriber.onCompleted();
                }
                t();
            } catch (Exception e10) {
                subscriber.onError(e10);
                t();
            }
        } catch (Throwable th2) {
            t();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Intent intent, Subscriber subscriber) {
        this.f136957d = subscriber;
        this.f136956c.startActivityForResult(intent, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable y(final Intent intent) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.imagechooser.f
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136945a.x(intent, (Subscriber) obj);
            }
        });
    }

    public void C() {
        this.f136956c = null;
    }

    public Observable<Bitmap> E(int i10, boolean z10) {
        return F(i10, z10, true, null);
    }

    public Observable<Bitmap> F(int i10, boolean z10, boolean z11, IntentSender intentSender) {
        return G(new qa.c(), new m(i10, z10, z11), intentSender);
    }

    public Observable<Bitmap> G(@NonNull qa.e eVar, @NonNull m mVar, IntentSender intentSender) {
        this.f136958e = eVar;
        this.f136959f = mVar;
        return n(eVar, intentSender, this.f136956c, new Function1() { // from class: com.planner5d.library.activity.helper.imagechooser.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f136947a.y((Intent) obj);
            }
        });
    }

    public void H(Activity activity) {
        this.f136956c = activity;
        if (this.f136961h.booleanValue()) {
            B();
        } else {
            A();
        }
    }

    public void z(int i10, int i11, Intent intent) {
        this.f136960g = new Pair<>(Integer.valueOf(i11), intent);
        if (i10 == 3) {
            A();
        } else if (i10 == 9) {
            B();
        }
    }
}
