package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f136688a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f136689b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Subscriber<? super String> f136690c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri[] f136691d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f136692e = "project.p5d";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f136693f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w f136694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.services.z f136695h;

    class a extends com.planner5d.library.services.utility.w.c<Void> {
        a() {
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void d() {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            FileOutputStream fileOutputStream;
            synchronized (b0.this.f136688a) {
                if (b0.this.f136689b != null && b0.this.f136691d != null) {
                    String str = b0.this.f136692e;
                    ContentResolver contentResolver = b0.this.f136689b.getContentResolver();
                    Uri uri = b0.this.f136691d[0];
                    Subscriber subscriber = b0.this.f136690c;
                    byte[] bArr = b0.this.f136693f;
                    b0.this.f136691d = null;
                    b0.this.f136690c = null;
                    b0.this.f136693f = null;
                    if (uri != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "w");
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                    try {
                                        org.apache.commons.io.p.f1(bArr, fileOutputStream);
                                        subscriber.onNext(b0.this.n(contentResolver, uri, str));
                                        subscriber.onCompleted();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            subscriber.onError(th);
                                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                                try {
                                                    parcelFileDescriptorOpenFileDescriptor.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            return null;
                                        } finally {
                                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                                try {
                                                    parcelFileDescriptorOpenFileDescriptor.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            } else {
                                fileOutputStream = null;
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            parcelFileDescriptorOpenFileDescriptor = null;
                            fileOutputStream = null;
                        }
                    }
                    subscriber.onError(new Exception("Document request failed"));
                    return null;
                }
                return null;
            }
        }
    }

    @ij.a
    public b0(com.planner5d.library.services.utility.w wVar, com.planner5d.library.services.z zVar) {
        this.f136694g = wVar;
        this.f136695h = zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @androidx.annotation.m1
    public String n(ContentResolver contentResolver, Uri uri, String str) {
        String string;
        int i10 = 2 << 0;
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                if (columnIndex < 0 || !cursorQuery.moveToNext()) {
                    string = null;
                } else {
                    string = cursorQuery.getString(columnIndex);
                }
            } catch (Throwable th2) {
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            string = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string == null ? str : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(byte[] bArr, String str, String str2, String str3, Subscriber subscriber) {
        synchronized (this.f136688a) {
            try {
                if (this.f136689b == null) {
                    subscriber.onError(new Exception("Activity not active"));
                    return;
                }
                Subscriber<? super String> subscriber2 = this.f136690c;
                if (subscriber2 != null) {
                    subscriber2.onError(new Exception("Subscriber canceled"));
                }
                this.f136690c = subscriber;
                this.f136691d = null;
                this.f136693f = bArr;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(str);
                String str4 = str2 + "." + str3;
                this.f136692e = str4;
                intent.putExtra("android.intent.extra.TITLE", str4);
                this.f136689b.startActivityForResult(intent, 5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str, Bitmap bitmap, String str2, Subscriber subscriber) {
        synchronized (this.f136688a) {
            try {
                Activity activity = this.f136689b;
                if (activity == null) {
                    subscriber.onError(new Exception("Activity not active"));
                    return;
                }
                try {
                    new androidx.core.app.n0.a(this.f136689b).w(str2).g(this.f136695h.e(activity, str, bitmap)).n(com.planner5d.library.f.s.AB).x();
                    subscriber.onCompleted();
                } catch (IOException e10) {
                    subscriber.onError(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void t() {
        this.f136694g.f(new a());
    }

    public Observable<String> m(final String str, final String str2, final String str3, final byte[] bArr) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.z
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f137229a.o(bArr, str3, str, str2, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public void q(int i10, int i11, Intent intent) {
        if (i10 != 5) {
            return;
        }
        synchronized (this.f136688a) {
            try {
                if (this.f136690c == null) {
                    return;
                }
                this.f136691d = new Uri[]{(i11 != -1 || intent == null) ? null : intent.getData()};
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r() {
        synchronized (this.f136688a) {
            this.f136689b = null;
        }
    }

    public void s(Activity activity) {
        synchronized (this.f136688a) {
            this.f136689b = activity;
        }
        t();
    }

    public Observable<String> u(final String str, final String str2, final Bitmap bitmap) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.a0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136675a.p(str, bitmap, str2, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }
}
