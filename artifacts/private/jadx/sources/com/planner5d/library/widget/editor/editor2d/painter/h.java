package com.planner5d.library.widget.editor.editor2d.painter;

import androidx.compose.runtime.internal.w0;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f255211d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f255212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f255213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CompositeSubscription f255214c;

    public interface a {
        void a(boolean z10);

        boolean b();
    }

    public static final class b extends com.planner5d.library.services.rx.e<Void> {
        b() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            super.onCompleted();
            h.this.f255212a.a(h.this.f255213b.get() == 0);
        }
    }

    public h(@NotNull a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f255212a = callbacks;
        this.f255213b = new AtomicInteger();
        this.f255214c = new CompositeSubscription();
    }

    private final List<Observable<Void>> e(List<? extends com.planner5d.library.widget.editor.editor2d.drawable.c> list, com.planner5d.library.model.p.b bVar) {
        LinkedList linkedList = new LinkedList();
        for (com.planner5d.library.widget.editor.editor2d.drawable.c cVar : list) {
            if (cVar instanceof com.planner5d.library.widget.editor.editor2d.drawable.e) {
                linkedList.add(((com.planner5d.library.widget.editor.editor2d.drawable.e) cVar).f(bVar));
            }
        }
        return linkedList;
    }

    private final void g(List<? extends Observable<Void>> list) {
        this.f255213b.set(list.size());
        for (Observable<Void> observable : list) {
            CompositeSubscription compositeSubscription = this.f255214c;
            final AtomicInteger atomicInteger = this.f255213b;
            compositeSubscription.add(observable.doOnCompleted(new Action0() { // from class: com.planner5d.library.widget.editor.editor2d.painter.f
                @Override // rx.functions.Action0
                public final void call() {
                    atomicInteger.decrementAndGet();
                }
            }).doOnError(new Action1() { // from class: com.planner5d.library.widget.editor.editor2d.painter.g
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    h.i(this.f255210a, (Throwable) obj);
                }
            }).subscribe((Subscriber<? super Void>) new b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(h hVar, Throwable th2) {
        hVar.f255213b.decrementAndGet();
    }

    private final void j(List<? extends Observable<Void>> list) {
        for (Observable<Void> observable : list) {
            if (this.f255212a.b()) {
                break;
            } else {
                observable.toBlocking().firstOrDefault(null);
            }
        }
    }

    private final void k() {
        this.f255214c.clear();
        this.f255213b.set(0);
    }

    public final void f(@NotNull List<? extends com.planner5d.library.widget.editor.editor2d.drawable.c> drawables, @NotNull com.planner5d.library.model.p.b textureSize, boolean z10) {
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        Intrinsics.checkNotNullParameter(textureSize, "textureSize");
        List<Observable<Void>> listE = e(drawables, textureSize);
        k();
        if (z10) {
            j(listE);
        } else {
            g(listE);
        }
    }
}
