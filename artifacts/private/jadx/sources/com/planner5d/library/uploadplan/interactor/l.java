package com.planner5d.library.uploadplan.interactor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import com.planner5d.library.model.manager.u1;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDetectPlanInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetectPlanInteractor.kt\ncom/planner5d/library/uploadplan/interactor/DetectPlanInteractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class l implements ke.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f230771c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f230772d = "plan_classification.tflite";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f230773e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f230774f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f230775g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f230776h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f230777i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f230778j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u1 f230780b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.DetectPlanInteractor$detect$2", f = "DetectPlanInteractor.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f230782b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f230784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f230784d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(this.f230784d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230782b;
            if (i10 == 0) {
                ResultKt.m(obj);
                InputStream inputStreamOpenInputStream = l.this.f230779a.getContentResolver().openInputStream(this.f230784d);
                l lVar = l.this;
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    Intrinsics.checkNotNullExpressionValue(bitmapDecodeStream, "decodeStream(...)");
                    this.f230781a = inputStreamOpenInputStream;
                    this.f230782b = 1;
                    Object objB = lVar.b(bitmapDecodeStream, this);
                    if (objB == objL) {
                        return objL;
                    }
                    obj = objB;
                    closeable = inputStreamOpenInputStream;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = inputStreamOpenInputStream;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f230781a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue());
            kotlin.io.c.a(closeable, null);
            return boolA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.DetectPlanInteractor$detect$4", f = "DetectPlanInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230785a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f230787c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f230787c = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(this.f230787c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zG;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f230785a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                l lVar = l.this;
                zG = lVar.g(lVar.h(this.f230787c));
            } catch (Throwable th2) {
                l.this.f230780b.b("detect_plan", null, th2);
                zG = true;
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.application.b context, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f230779a = context;
        this.f230780b = logRecordManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(float[][][][] fArr) throws Exception {
        float[][] fArr2 = {new float[2]};
        org.tensorflow.lite.e eVar = new org.tensorflow.lite.e(i());
        try {
            eVar.aa(fArr, fArr2);
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(eVar, null);
            float[] fArr3 = fArr2[0];
            return fArr3[1] > fArr3[0];
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(eVar, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[][][][] h(Bitmap bitmap) {
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, 256, 256, 2);
        float[][][] fArr = new float[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            float[][] fArr2 = new float[256][];
            for (int i11 = 0; i11 < 256; i11++) {
                fArr2[i11] = new float[256];
            }
            fArr[i10] = fArr2;
        }
        int[] iArr = new int[65536];
        boolean z10 = false;
        bitmapExtractThumbnail.getPixels(iArr, 0, 256, 0, 0, 256, 256);
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = 0;
            while (i14 < 256) {
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                fArr[0][i13][i14] = ((i16 >> 16) & 255) / 256.0f;
                fArr[1][i13][i14] = ((i16 >> 8) & 255) / 256.0f;
                fArr[2][i13][i14] = (i16 & 255) / 256.0f;
                i14++;
                i12 = i15;
            }
        }
        return new float[][][][]{fArr};
    }

    private final ByteBuffer i() throws IOException {
        InputStream inputStreamOpen = this.f230779a.getAssets().open(f230772d);
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(inputStreamOpen.available());
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            byte[] bArr = new byte[4096];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                Unit unit = Unit.f312394a;
                if (-1 == i10) {
                    kotlin.io.c.a(inputStreamOpen, null);
                    Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "use(...)");
                    return byteBufferAllocateDirect;
                }
                byteBufferAllocateDirect.put(ArraysKt.copyOfRange(bArr, 0, i10));
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    @Override // ke.e
    @Nullable
    public Object a(@NotNull Uri uri, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws ke.e.a, FileNotFoundException {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new b(uri, null), dVar);
    }

    @Override // ke.e
    @Nullable
    public Object b(@NotNull Bitmap bitmap, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws ke.e.a {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new c(bitmap, null), dVar);
    }
}
