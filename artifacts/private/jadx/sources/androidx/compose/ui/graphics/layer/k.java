package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import com.rabbitmq.client.k0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(22)
@SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n318#4,11:225\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n*L\n83#1:221\n84#1:223\n83#1:222\n84#1:224\n89#1:225,11\n*E\n"})
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f37992a = new k();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {225}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f37996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f37997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37998f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f38000h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37998f = obj;
            this.f38000h |= Integer.MIN_VALUE;
            return k.this.a(null, this);
        }
    }

    static final class b implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Image> f38001a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super Image> nVar) {
            this.f38001a = nVar;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            kotlinx.coroutines.n<Image> nVar = this.f38001a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(imageReader.acquireLatestImage()));
        }
    }

    private k() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.compose.ui.graphics.layer.i
    @Nullable
    public Object a(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f38000h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f38000h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objU = aVar.f37998f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f38000h;
        if (i11 == 0) {
            ResultKt.m(objU);
            long jF = cVar.F();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (jF >> 32), (int) (jF & k0.f265952a), 1, 1);
            try {
                aVar.f37993a = cVar;
                aVar.f37994b = looperMyLooper;
                aVar.f37995c = imageReaderNewInstance;
                aVar.f37996d = imageReaderNewInstance;
                aVar.f37997e = aVar;
                aVar.f38000h = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                pVar.p0();
                imageReaderNewInstance.setOnImageAvailableListener(new b(pVar), androidx.core.os.k.a(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasB = v.f38012a.b(surface);
                try {
                    canvasB.drawColor(s0.t(q0.f38131b.a()), PorterDuff.Mode.CLEAR);
                    cVar.h(androidx.compose.ui.graphics.c.b(canvasB), null);
                    surface.unlockCanvasAndPost(canvasB);
                    objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(aVar);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                    autoCloseable = imageReaderNewInstance;
                } catch (Throwable th2) {
                    surface.unlockCanvasAndPost(canvasB);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                autoCloseable = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (AutoCloseable) aVar.f37995c;
            try {
                ResultKt.m(objU);
            } catch (Throwable th4) {
                th = th4;
                try {
                    throw th;
                } catch (Throwable th5) {
                    kotlin.jdk7.a.c(autoCloseable, th);
                    throw th5;
                }
            }
        }
        Bitmap bitmapB = m.b((Image) objU);
        kotlin.jdk7.a.c(autoCloseable, null);
        return bitmapB;
    }
}
