package com.planner5d.library.widget.editor.editor3d;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
class c0 {

    interface a {
        byte[] a(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, int i10, int i11) throws Throwable;
    }

    private c0() {
    }

    public static /* synthetic */ void b(final com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, final a aVar, final int i10, final int i11, final Subscriber subscriber) {
        if (!jVar.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.d(subscriber, aVar, jVar, i10, i11);
            }
        })) {
            subscriber.onError(new Exception("Cannot post to render thread"));
        }
    }

    public static /* synthetic */ Bitmap c(int i10, int i11, byte[] bArr) throws Exception {
        try {
            Bitmap bitmapB = td.a.f380845a.b(i10, i11, Bitmap.Config.ARGB_8888);
            bitmapB.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            return bitmapB;
        } catch (Throwable th2) {
            throw new Exception(th2);
        }
    }

    public static /* synthetic */ void d(Subscriber subscriber, a aVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, int i10, int i11) {
        try {
            subscriber.onNext(aVar.a(jVar, i10, i11));
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Observable<Bitmap> e(final byte[] bArr, final int i10, final int i11) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.editor3d.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.c(i10, i11, bArr);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public static Observable<Bitmap> f(final com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, final int i10, final int i11, final a aVar) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor3d.a0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                c0.b(jVar, aVar, i10, i11, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.editor3d.b0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return c0.e((byte[]) obj, i10, i11);
            }
        });
    }
}
