package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f137234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.t1 f137235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final le.i f137236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f137237d = null;

    class a implements Observable.OnSubscribe<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f137238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f137239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f137240c;

        a(boolean z10, Activity activity, Uri uri) {
            this.f137238a = z10;
            this.f137239b = activity;
            this.f137240c = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Subscriber<? super InputStream> subscriber, Activity activity, @NonNull Uri uri) {
            try {
                subscriber.onNext(e(activity, uri));
                subscriber.onCompleted();
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }

        private InputStream e(Activity activity, @NonNull Uri uri) throws Throwable {
            return activity.getContentResolver().openInputStream(uri);
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final Subscriber<? super InputStream> subscriber) {
            ErrnoException errnoException;
            if (this.f137238a) {
                try {
                    subscriber.onNext(e(this.f137239b, this.f137240c));
                    subscriber.onCompleted();
                } catch (Throwable th2) {
                    if (th2 instanceof ErrnoException) {
                        errnoException = th2;
                    } else {
                        errnoException = th2.getCause() instanceof ErrnoException ? (ErrnoException) th2.getCause() : null;
                    }
                    if ((errnoException != null && errnoException.errno == OsConstants.EACCES) || (th2 instanceof FileNotFoundException)) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z0.this.f137235b.b("file_import", this.f137240c.toString(), th2);
                            return;
                        }
                        Observable<Void> observableL = z0.this.f137234a.l("android.permission.READ_EXTERNAL_STORAGE", com.planner5d.library.f.s.Wt);
                        final Activity activity = this.f137239b;
                        final Uri uri = this.f137240c;
                        observableL.doOnTerminate(new Action0() { // from class: com.planner5d.library.activity.helper.y0
                            @Override // rx.functions.Action0
                            public final void call() {
                                this.f137209a.c(subscriber, activity, uri);
                            }
                        }).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
                        return;
                    }
                }
            }
            c(subscriber, this.f137239b, this.f137240c);
        }
    }

    class b extends com.planner5d.library.services.rx.e<InputStream> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f137242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f137243e;

        b(c cVar, Activity activity) {
            this.f137242d = cVar;
            this.f137243e = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit e(Throwable th2) {
            onError(th2);
            return Unit.f312394a;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(@androidx.annotation.p0 Throwable th2) {
            String message;
            c cVar = this.f137242d;
            int i10 = com.planner5d.library.f.s.f169249la;
            if (th2 instanceof JSONException) {
                message = this.f137243e.getString(com.planner5d.library.f.s.f169273ma);
            } else {
                message = th2 == null ? com.planner5d.library.model.payments.a.f222474i : th2.getMessage();
            }
            cVar.onError(new ErrorMessageException(i10, message));
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(InputStream inputStream) {
            z0.this.f137236c.a(inputStream, this.f137242d, new Function1() { // from class: com.planner5d.library.activity.helper.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f136679a.e((Throwable) obj);
                }
            });
        }
    }

    public static final class c extends RecordTag implements Observer<Project> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Subscriber<? super Project> f137245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Folder f137246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f137247c;

        public c(Subscriber<? super Project> subscriber, Folder folder, boolean save) {
            this.f137245a = subscriber;
            this.f137246b = folder;
            this.f137247c = save;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f137247c == cVar.f137247c && Objects.equals(this.f137245a, cVar.f137245a) && Objects.equals(this.f137246b, cVar.f137246b)) {
                    return true;
                }
            }
            return false;
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f137245a, this.f137246b, Boolean.valueOf(this.f137247c)};
        }

        public Folder c() {
            return this.f137246b;
        }

        public Folder d() {
            return this.f137246b;
        }

        public boolean e() {
            return this.f137247c;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(Project project) {
            Subscriber<? super Project> subscriber = this.f137245a;
            if (subscriber != null) {
                subscriber.onNext(project);
            }
        }

        public boolean g() {
            return this.f137247c;
        }

        public Subscriber<? super Project> h() {
            return this.f137245a;
        }

        public final int hashCode() {
            return b1.a(this.f137247c, this.f137245a, this.f137246b);
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subscriber<? super Project> subscriber = this.f137245a;
            if (subscriber != null) {
                subscriber.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            Subscriber<? super Project> subscriber = this.f137245a;
            if (subscriber != null) {
                subscriber.onError(th2);
            }
        }

        public final String toString() {
            return s0.a(b(), c.class, "a;b;c");
        }
    }

    @ij.a
    public z0(t0 t0Var, com.planner5d.library.model.manager.t1 t1Var, le.i iVar) {
        this.f137234a = t0Var;
        this.f137235b = t1Var;
        this.f137236c = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Folder folder, boolean z10, Activity activity, Intent intent, Subscriber subscriber) {
        c cVar = this.f137237d;
        if (cVar != null) {
            cVar.onCompleted();
        }
        this.f137237d = new c(subscriber, folder, z10);
        h(activity, 4, -1, intent, true);
    }

    private void h(Activity activity, int i10, int i11, Intent intent, boolean z10) {
        if (i10 == 4) {
            c cVar = this.f137237d;
            this.f137237d = null;
            if (cVar != null) {
                if (i11 != -1 || intent == null) {
                    cVar.onCompleted();
                } else {
                    i(activity, intent.getData(), z10).subscribe((Subscriber<? super InputStream>) new b(cVar, activity));
                }
            }
        }
    }

    private Observable<InputStream> i(Activity activity, @NonNull Uri uri, boolean z10) {
        return com.planner5d.library.services.rx.i.d(new a(z10, activity, uri));
    }

    public Observable<Project> e(final Activity activity, final Intent intent, final Folder folder, final boolean z10) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.x0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f137200a.f(folder, z10, activity, intent, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public void g(Activity activity, int i10, int i11, Intent intent) {
        h(activity, i10, i11, intent, false);
    }
}
