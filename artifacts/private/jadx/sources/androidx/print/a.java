package androidx.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f73350g = "PrintHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f73351h = 3500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f73352i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f73353j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73354k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f73355l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f73356m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f73357n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f73358o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f73359p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f73360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f73361b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f73362c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f73363d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f73364e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f73365f = 1;

    /* JADX INFO: renamed from: androidx.print.a$a, reason: collision with other inner class name */
    class AsyncTaskC0692a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f73366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f73367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f73368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f73369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f73370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f73371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f73372g;

        AsyncTaskC0692a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f73366a = cancellationSignal;
            this.f73367b = printAttributes;
            this.f73368c = bitmap;
            this.f73369d = printAttributes2;
            this.f73370e = i10;
            this.f73371f = parcelFileDescriptor;
            this.f73372g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            Bitmap bitmap;
            try {
                if (this.f73366a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f73360a, this.f73367b);
                Bitmap bitmapA = a.a(this.f73368c, this.f73367b.getColorMode());
                if (this.f73366a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z10 = a.f73353j;
                    if (z10) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f73360a, this.f73369d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixD = a.d(bitmapA.getWidth(), bitmapA.getHeight(), rectF, this.f73370e);
                    if (!z10) {
                        matrixD.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrixD, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f73366a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f73371f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        bitmap = this.f73368c;
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f73371f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f73371f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    bitmap = this.f73368c;
                    return null;
                } finally {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor3 = this.f73371f;
                    if (parcelFileDescriptor3 != null) {
                        try {
                            parcelFileDescriptor3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (bitmapA != this.f73368c) {
                        bitmapA.recycle();
                    }
                }
            } catch (Throwable th2) {
                return th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th2) {
            if (this.f73366a.isCanceled()) {
                this.f73372g.onWriteCancelled();
            } else if (th2 == null) {
                this.f73372g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f73372g.onWriteFailed(null);
            }
        }
    }

    public interface b {
        void a();
    }

    @w0(19)
    private class c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f73375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f73376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f73377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PrintAttributes f73378e;

        c(String str, int i10, Bitmap bitmap, b bVar) {
            this.f73374a = str;
            this.f73375b = i10;
            this.f73376c = bitmap;
            this.f73377d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f73377d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f73378e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f73374a).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f73378e, this.f73375b, this.f73376c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @w0(19)
    private class d extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f73380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Uri f73381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b f73382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f73383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        PrintAttributes f73384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        AsyncTask<Uri, Boolean, Bitmap> f73385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Bitmap f73386g = null;

        /* JADX INFO: renamed from: androidx.print.a$d$a, reason: collision with other inner class name */
        class AsyncTaskC0693a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f73388a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f73389b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f73390c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f73391d;

            /* JADX INFO: renamed from: androidx.print.a$d$a$a, reason: collision with other inner class name */
            class C0694a implements CancellationSignal.OnCancelListener {
                C0694a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0693a.this.cancel(false);
                }
            }

            AsyncTaskC0693a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f73388a = cancellationSignal;
                this.f73389b = printAttributes;
                this.f73390c = printAttributes2;
                this.f73391d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f73381b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f73391d.onLayoutCancelled();
                d.this.f73385f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Code duplicated, block: B:9:0x0016  */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                Bitmap bitmapCreateBitmap;
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap == null || (a.f73352i && a.this.f73365f != 0)) {
                    bitmapCreateBitmap = bitmap;
                } else {
                    synchronized (this) {
                        mediaSize = d.this.f73384e.getMediaSize();
                    }
                    if (mediaSize == null || mediaSize.isPortrait() == a.g(bitmap)) {
                        bitmapCreateBitmap = bitmap;
                    } else {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f73386g = bitmapCreateBitmap;
                if (bitmapCreateBitmap != null) {
                    this.f73391d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f73380a).setContentType(1).setPageCount(1).build(), true ^ this.f73389b.equals(this.f73390c));
                } else {
                    this.f73391d.onLayoutFailed(null);
                }
                d.this.f73385f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f73388a.setOnCancelListener(new C0694a());
            }
        }

        d(String str, Uri uri, b bVar, int i10) {
            this.f73380a = str;
            this.f73381b = uri;
            this.f73382c = bVar;
            this.f73383d = i10;
        }

        void a() {
            synchronized (a.this.f73362c) {
                try {
                    a aVar = a.this;
                    if (aVar.f73361b != null) {
                        aVar.f73361b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f73385f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f73382c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.f73386g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f73386g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) throws Throwable {
            synchronized (this) {
                try {
                    this.f73384e = printAttributes2;
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f73386g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f73380a).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
            } else {
                this.f73385f = new AsyncTaskC0693a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f73384e, this.f73383d, this.f73386g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public a(@NonNull Context context) {
        this.f73360a = context;
    }

    static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @w0(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix d(int i10, int i11, RectF rectF, int i12) {
        Matrix matrix = new Matrix();
        float f10 = i10;
        float fWidth = rectF.width() / f10;
        float fMax = i12 == 2 ? Math.max(fWidth, rectF.height() / i11) : Math.min(fWidth, rectF.height() / i11);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f10 * fMax)) / 2.0f, (rectF.height() - (i11 * fMax)) / 2.0f);
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f73360a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f73364e;
    }

    public int e() {
        int i10 = this.f73365f;
        if (i10 == 0) {
            i10 = 1;
        }
        return i10;
    }

    public int f() {
        return this.f73363d;
    }

    Bitmap i(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f73360a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i10 = 4 << 1;
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i11 = options2.outWidth;
        int i12 = options2.outHeight;
        if (i11 > 0 && i12 > 0) {
            int iMax = Math.max(i11, i12);
            int i13 = 1;
            while (iMax > f73351h) {
                iMax >>>= 1;
                i13 <<= 1;
            }
            if (i13 > 0 && Math.min(i11, i12) / i13 > 0) {
                synchronized (this.f73362c) {
                    try {
                        options = new BitmapFactory.Options();
                        this.f73361b = options;
                        options.inMutable = true;
                        options.inSampleSize = i13;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    Bitmap bitmapH = h(uri, options);
                    synchronized (this.f73362c) {
                        this.f73361b = null;
                    }
                    return bitmapH;
                } catch (Throwable th3) {
                    synchronized (this.f73362c) {
                        try {
                            this.f73361b = null;
                            throw th3;
                        } finally {
                        }
                    }
                }
            }
        }
        return null;
    }

    public void j(@NonNull String str, @NonNull Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@NonNull String str, @NonNull Bitmap bitmap, @p0 b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f73360a.getSystemService("print")).print(str, new c(str, this.f73363d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f73364e).build());
    }

    public void l(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@NonNull String str, @NonNull Uri uri, @p0 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f73363d);
        PrintManager printManager = (PrintManager) this.f73360a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f73364e);
        int i10 = this.f73365f;
        if (i10 == 1 || i10 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i10 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i10) {
        this.f73364e = i10;
    }

    public void o(int i10) {
        this.f73365f = i10;
    }

    public void p(int i10) {
        this.f73363d = i10;
    }

    @w0(19)
    void r(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0692a(cancellationSignal, f73353j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
