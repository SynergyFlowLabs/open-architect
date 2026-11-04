package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import io.sentry.n8;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@e.a({"UseKtx"})
@e.b(26)
public final class u implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f304975s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f304976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f304977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.j f304978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f304979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final v f304980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private WeakReference<View> f304981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f304982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f304983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Bitmap f304984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f0 f304985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f304986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.d f304990o;

    @SourceDebugExtension({"SMAP\nScreenshotRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotRecorder.kt\nio/sentry/android/replay/ScreenshotRecorder$capture$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n1855#2,2:354\n*S KotlinDebug\n*F\n+ 1 ScreenshotRecorder.kt\nio/sentry/android/replay/ScreenshotRecorder$capture$1$1$1\n*L\n159#1:354,2\n*E\n"})
    static final class a extends l0 implements Function1<io.sentry.android.replay.viewhierarchy.b, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Rect> f304992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Canvas f304993c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Rect> list, Canvas canvas) {
            super(1);
            this.f304992b = list;
            this.f304993c = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            Pair pair;
            Integer numT;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.h() && node.j() > 0 && node.f() > 0) {
                if (node.i() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof io.sentry.android.replay.viewhierarchy.b.c) {
                    List listListOf = CollectionsKt.listOf(node.i());
                    u uVar = u.this;
                    pair = TuplesKt.to(listListOf, Integer.valueOf(uVar.n(uVar.f304984i, node.i())));
                } else {
                    if (node instanceof io.sentry.android.replay.viewhierarchy.b.e) {
                        io.sentry.android.replay.viewhierarchy.b.e eVar = (io.sentry.android.replay.viewhierarchy.b.e) node;
                        io.sentry.android.replay.util.q qVarU = eVar.u();
                        pair = TuplesKt.to(io.sentry.android.replay.util.r.d(eVar.u(), node.i(), eVar.v(), eVar.w()), Integer.valueOf(((qVarU == null || (numT = qVarU.d()) == null) && (numT = eVar.t()) == null) ? -16777216 : numT.intValue()));
                    } else {
                        pair = TuplesKt.to(CollectionsKt.listOf(node.i()), -16777216);
                    }
                }
                List list = (List) pair.component1();
                u.this.p().setColor(((Number) pair.component2()).intValue());
                Canvas canvas = this.f304993c;
                u uVar2 = u.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, uVar2.p());
                }
                if (u.this.q().getReplayController().f()) {
                    this.f304992b.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends l0 implements Function0<Paint> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f304994a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    @SourceDebugExtension({"SMAP\nScreenshotRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotRecorder.kt\nio/sentry/android/replay/ScreenshotRecorder$prescaledMatrix$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
    static final class c extends l0 implements Function0<Matrix> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            u uVar = u.this;
            matrix.preScale(uVar.o().m(), uVar.o().n());
            return matrix;
        }
    }

    static final class d extends l0 implements Function0<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f304996a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
    }

    static final class e extends l0 implements Function0<Canvas> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(u.this.s());
        }
    }

    public u(@NotNull w config, @NotNull n8 options, @NotNull io.sentry.android.replay.util.j mainLooperHandler, @NotNull ScheduledExecutorService recorder, @Nullable v vVar) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        this.f304976a = config;
        this.f304977b = options;
        this.f304978c = mainLooperHandler;
        this.f304979d = recorder;
        this.f304980e = vVar;
        j0 j0Var = j0.NONE;
        this.f304982g = g0.b(j0Var, b.f304994a);
        this.f304983h = g0.b(j0Var, d.f304996a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.l(), config.k(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f304984i = bitmapCreateBitmap;
        this.f304985j = g0.b(j0Var, new e());
        this.f304986k = g0.b(j0Var, new c());
        this.f304987l = new AtomicBoolean(false);
        this.f304988m = new AtomicBoolean(true);
        this.f304989n = new AtomicBoolean(false);
        this.f304990o = new io.sentry.android.replay.util.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final u uVar, final View view, int i10) {
        if (i10 != 0) {
            uVar.f304977b.getLogger().c(y7.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            uVar.f304989n.set(false);
        } else if (uVar.f304987l.get()) {
            uVar.f304977b.getLogger().c(y7.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            uVar.f304989n.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f305074m.a(view, null, 0, uVar.f304977b);
            io.sentry.android.replay.util.r.k(view, bVarA, uVar.f304977b);
            io.sentry.android.replay.util.h.h(uVar.f304979d, uVar.f304977b, "screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.k(this.f304972a, bVarA, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final u uVar, io.sentry.android.replay.viewhierarchy.b bVar, final View view) {
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(uVar.f304984i);
        canvas.setMatrix(uVar.r());
        bVar.s(uVar.new a(arrayList, canvas));
        if (uVar.f304977b.getReplayController().f()) {
            uVar.f304978c.b(new Runnable() { // from class: io.sentry.android.replay.s
                @Override // java.lang.Runnable
                public final void run() {
                    u.l(this.f304969a, view, arrayList);
                }
            });
        }
        v vVar = uVar.f304980e;
        if (vVar != null) {
            vVar.b(uVar.f304984i);
        }
        uVar.f304989n.set(true);
        uVar.f304987l.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(u uVar, View view, List list) {
        if (uVar.f304990o.getCallback() == null) {
            view.getOverlay().add(uVar.f304990o);
        }
        uVar.f304990o.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        r().mapRect(rectF);
        rectF.round(rect2);
        t().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return s().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint p() {
        return (Paint) this.f304982g.getValue();
    }

    private final Matrix r() {
        return (Matrix) this.f304986k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap s() {
        return (Bitmap) this.f304983h.getValue();
    }

    private final Canvas t() {
        return (Canvas) this.f304985j.getValue();
    }

    public final void h(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.f304981f;
        w(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.f304981f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f304981f = new WeakReference<>(root);
        io.sentry.android.replay.util.r.a(root, this);
        this.f304987l.set(true);
    }

    public final void i() {
        if (this.f304977b.getSessionReplay().o()) {
            this.f304977b.getLogger().c(y7.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.f304988m.get()));
        }
        if (!this.f304988m.get()) {
            if (this.f304977b.getSessionReplay().o()) {
                this.f304977b.getLogger().c(y7.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.f304977b.getSessionReplay().o()) {
            this.f304977b.getLogger().c(y7.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.f304987l.get()), Boolean.valueOf(this.f304989n.get()));
        }
        if (!this.f304987l.get() && this.f304989n.get()) {
            v vVar = this.f304980e;
            if (vVar != null) {
                vVar.b(this.f304984i);
                return;
            }
            return;
        }
        WeakReference<View> weakReference = this.f304981f;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f304977b.getLogger().c(y7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        Window windowA = e0.a(view);
        if (windowA == null) {
            this.f304977b.getLogger().c(y7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f304987l.set(false);
            PixelCopy.request(windowA, this.f304984i, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.r
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    u.j(this.f304967a, view, i10);
                }
            }, this.f304978c.a());
        } catch (Throwable th2) {
            this.f304977b.getLogger().a(y7.WARNING, "Failed to capture replay recording", th2);
            this.f304989n.set(false);
        }
    }

    public final void m() {
        WeakReference<View> weakReference = this.f304981f;
        w(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.f304981f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        if (!this.f304984i.isRecycled()) {
            this.f304984i.recycle();
        }
        this.f304988m.set(false);
    }

    @NotNull
    public final w o() {
        return this.f304976a;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.f304988m.get()) {
            WeakReference<View> weakReference = this.f304981f;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f304977b.getLogger().c(y7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f304987l.set(true);
            }
        }
    }

    @NotNull
    public final n8 q() {
        return this.f304977b;
    }

    public final void u() {
        this.f304988m.set(false);
        WeakReference<View> weakReference = this.f304981f;
        w(weakReference != null ? weakReference.get() : null);
    }

    public final void v() {
        View view;
        WeakReference<View> weakReference = this.f304981f;
        if (weakReference != null && (view = weakReference.get()) != null) {
            io.sentry.android.replay.util.r.a(view, this);
        }
        this.f304988m.set(true);
    }

    public final void w(@Nullable View view) {
        ViewOverlay overlay;
        if (this.f304977b.getReplayController().f() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.f304990o);
        }
        if (view != null) {
            io.sentry.android.replay.util.r.h(view, this);
        }
    }
}
